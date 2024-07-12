import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nv extends ob {
	private static final Logger b = LogManager.getLogger();
	private final MinecraftServer c;
	private final File d;
	private final Set<nw> e = Sets.newHashSet();
	private int f = -300;
	private boolean g;

	public nv(MinecraftServer minecraftServer, File file) {
		this.c = minecraftServer;
		this.d = file;
	}

	public void a() {
		if (this.d.isFile()) {
			try {
				this.a.clear();
				this.a.putAll(this.a(FileUtils.readFileToString(this.d)));
			} catch (IOException var2) {
				b.error("Couldn't read statistics file {}", new Object[]{this.d, var2});
			} catch (JsonParseException var3) {
				b.error("Couldn't parse statistics file {}", new Object[]{this.d, var3});
			}
		}
	}

	public void b() {
		try {
			FileUtils.writeStringToFile(this.d, a(this.a));
		} catch (IOException var2) {
			b.error("Couldn't save stats", var2);
		}
	}

	@Override
	public void a(aay aay, nw nw, int integer) {
		int integer5 = nw.d() ? this.a(nw) : 0;
		super.a(aay, nw, integer);
		this.e.add(nw);
		if (nw.d() && integer5 == 0 && integer > 0) {
			this.g = true;
			if (this.c.ay()) {
				this.c.am().a(new fi("chat.type.achievement", aay.i_(), nw.j()));
			}
		}

		if (nw.d() && integer5 > 0 && integer == 0) {
			this.g = true;
			if (this.c.ay()) {
				this.c.am().a(new fi("chat.type.achievement.taken", aay.i_(), nw.j()));
			}
		}
	}

	public Set<nw> c() {
		Set<nw> set2 = Sets.newHashSet(this.e);
		this.e.clear();
		this.g = false;
		return set2;
	}

	public Map<nw, ny> a(String string) {
		JsonElement jsonElement3 = new JsonParser().parse(string);
		if (!jsonElement3.isJsonObject()) {
			return Maps.newHashMap();
		} else {
			JsonObject jsonObject4 = jsonElement3.getAsJsonObject();
			Map<nw, ny> map5 = Maps.newHashMap();

			for (Entry<String, JsonElement> entry7 : jsonObject4.entrySet()) {
				nw nw8 = oa.a((String)entry7.getKey());
				if (nw8 != null) {
					ny ny9 = new ny();
					if (((JsonElement)entry7.getValue()).isJsonPrimitive() && ((JsonElement)entry7.getValue()).getAsJsonPrimitive().isNumber()) {
						ny9.a(((JsonElement)entry7.getValue()).getAsInt());
					} else if (((JsonElement)entry7.getValue()).isJsonObject()) {
						JsonObject jsonObject10 = ((JsonElement)entry7.getValue()).getAsJsonObject();
						if (jsonObject10.has("value") && jsonObject10.get("value").isJsonPrimitive() && jsonObject10.get("value").getAsJsonPrimitive().isNumber()) {
							ny9.a(jsonObject10.getAsJsonPrimitive("value").getAsInt());
						}

						if (jsonObject10.has("progress") && nw8.l() != null) {
							try {
								Constructor<? extends nz> constructor11 = nw8.l().getConstructor();
								nz nz12 = (nz)constructor11.newInstance();
								nz12.a(jsonObject10.get("progress"));
								ny9.a(nz12);
							} catch (Throwable var12) {
								b.warn("Invalid statistic progress in {}", new Object[]{this.d, var12});
							}
						}
					}

					map5.put(nw8, ny9);
				} else {
					b.warn("Invalid statistic in {}: Don't know what {} is", new Object[]{this.d, entry7.getKey()});
				}
			}

			return map5;
		}
	}

	public static String a(Map<nw, ny> map) {
		JsonObject jsonObject2 = new JsonObject();

		for (Entry<nw, ny> entry4 : map.entrySet()) {
			if (((ny)entry4.getValue()).b() != null) {
				JsonObject jsonObject5 = new JsonObject();
				jsonObject5.addProperty("value", ((ny)entry4.getValue()).a());

				try {
					jsonObject5.add("progress", ((ny)entry4.getValue()).<nz>b().a());
				} catch (Throwable var6) {
					b.warn("Couldn't save statistic {}: error serializing progress", new Object[]{((nw)entry4.getKey()).e(), var6});
				}

				jsonObject2.add(((nw)entry4.getKey()).e, jsonObject5);
			} else {
				jsonObject2.addProperty(((nw)entry4.getKey()).e, ((ny)entry4.getValue()).a());
			}
		}

		return jsonObject2.toString();
	}

	public void d() {
		for (nw nw3 : this.a.keySet()) {
			this.e.add(nw3);
		}
	}

	public void a(ly ly) {
		int integer3 = this.c.aq();
		Map<nw, Integer> map4 = Maps.newHashMap();
		if (this.g || integer3 - this.f > 300) {
			this.f = integer3;

			for (nw nw6 : this.c()) {
				map4.put(nw6, this.a(nw6));
			}
		}

		ly.a.a(new fx(map4));
	}

	public void b(ly ly) {
		Map<nw, Integer> map3 = Maps.newHashMap();

		for (nq nq5 : nr.e) {
			if (this.a(nq5)) {
				map3.put(nq5, this.a(nq5));
				this.e.remove(nq5);
			}
		}

		ly.a.a(new fx(map3));
	}

	public boolean e() {
		return this.g;
	}
}

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class byg {
	private static final Logger a = LogManager.getLogger();
	private static final byf b = new byf();
	private static byg c;
	private static int d = -1;
	private static boolean e = true;
	private final Map<String, Object> f = Maps.newHashMap();
	private final List<String> g = Lists.newArrayList();
	private final List<Integer> h = Lists.newArrayList();
	private final List<byl> i = Lists.newArrayList();
	private final List<Integer> j = Lists.newArrayList();
	private final Map<String, byl> k = Maps.newHashMap();
	private final int l;
	private final String m;
	private final boolean n;
	private boolean o;
	private final bye p;
	private final List<Integer> q;
	private final List<String> r;
	private final byj s;
	private final byj t;

	public byg(bzy bzy, String string) throws IOException {
		JsonParser jsonParser4 = new JsonParser();
		kq kq5 = new kq("shaders/program/" + string + ".json");
		this.m = string;
		bzx bzx6 = null;

		try {
			bzx6 = bzy.a(kq5);
			JsonObject jsonObject7 = jsonParser4.parse(IOUtils.toString(bzx6.b(), Charsets.UTF_8)).getAsJsonObject();
			String string8 = ok.h(jsonObject7, "vertex");
			String string9 = ok.h(jsonObject7, "fragment");
			JsonArray jsonArray10 = ok.a(jsonObject7, "samplers", null);
			if (jsonArray10 != null) {
				int integer11 = 0;

				for (JsonElement jsonElement13 : jsonArray10) {
					try {
						this.a(jsonElement13);
					} catch (Exception var25) {
						ku ku15 = ku.a(var25);
						ku15.a("samplers[" + integer11 + "]");
						throw ku15;
					}

					integer11++;
				}
			}

			JsonArray jsonArray11 = ok.a(jsonObject7, "attributes", null);
			if (jsonArray11 != null) {
				int integer12 = 0;
				this.q = Lists.newArrayListWithCapacity(jsonArray11.size());
				this.r = Lists.newArrayListWithCapacity(jsonArray11.size());

				for (JsonElement jsonElement14 : jsonArray11) {
					try {
						this.r.add(ok.a(jsonElement14, "attribute"));
					} catch (Exception var24) {
						ku ku16 = ku.a(var24);
						ku16.a("attributes[" + integer12 + "]");
						throw ku16;
					}

					integer12++;
				}
			} else {
				this.q = null;
				this.r = null;
			}

			JsonArray jsonArray12 = ok.a(jsonObject7, "uniforms", null);
			if (jsonArray12 != null) {
				int integer13 = 0;

				for (JsonElement jsonElement15 : jsonArray12) {
					try {
						this.b(jsonElement15);
					} catch (Exception var23) {
						ku ku17 = ku.a(var23);
						ku17.a("uniforms[" + integer13 + "]");
						throw ku17;
					}

					integer13++;
				}
			}

			this.p = bye.a(ok.a(jsonObject7, "blend", null));
			this.n = ok.a(jsonObject7, "cull", true);
			this.s = byj.a(bzy, byj.a.VERTEX, string8);
			this.t = byj.a(bzy, byj.a.FRAGMENT, string9);
			this.l = byk.b().c();
			byk.b().b(this);
			this.i();
			if (this.r != null) {
				for (String string14 : this.r) {
					int integer15 = cdb.b(this.l, string14);
					this.q.add(integer15);
				}
			}
		} catch (Exception var26) {
			ku ku9 = ku.a(var26);
			ku9.b(kq5.a());
			throw ku9;
		} finally {
			IOUtils.closeQuietly(bzx6);
		}

		this.d();
	}

	public void a() {
		byk.b().a(this);
	}

	public void b() {
		cdb.d(0);
		d = -1;
		c = null;
		e = true;

		for (int integer2 = 0; integer2 < this.h.size(); integer2++) {
			if (this.f.get(this.g.get(integer2)) != null) {
				bqg.g(cdb.q + integer2);
				bqg.i(0);
			}
		}
	}

	public void c() {
		this.o = false;
		c = this;
		this.p.a();
		if (this.l != d) {
			cdb.d(this.l);
			d = this.l;
		}

		if (this.n) {
			bqg.q();
		} else {
			bqg.r();
		}

		for (int integer2 = 0; integer2 < this.h.size(); integer2++) {
			if (this.f.get(this.g.get(integer2)) != null) {
				bqg.g(cdb.q + integer2);
				bqg.y();
				Object object3 = this.f.get(this.g.get(integer2));
				int integer4 = -1;
				if (object3 instanceof bqr) {
					integer4 = ((bqr)object3).g;
				} else if (object3 instanceof bzb) {
					integer4 = ((bzb)object3).b();
				} else if (object3 instanceof Integer) {
					integer4 = (Integer)object3;
				}

				if (integer4 != -1) {
					bqg.i(integer4);
					cdb.f(cdb.a(this.l, (CharSequence)this.g.get(integer2)), integer2);
				}
			}
		}

		for (byl byl3 : this.i) {
			byl3.b();
		}
	}

	public void d() {
		this.o = true;
	}

	@Nullable
	public byl a(String string) {
		return (byl)this.k.get(string);
	}

	public byl b(String string) {
		byl byl3 = this.a(string);
		return (byl)(byl3 == null ? b : byl3);
	}

	private void i() {
		int integer2 = 0;

		for (int integer3 = 0; integer2 < this.g.size(); integer3++) {
			String string4 = (String)this.g.get(integer2);
			int integer5 = cdb.a(this.l, string4);
			if (integer5 == -1) {
				a.warn("Shader {}could not find sampler named {} in the specified shader program.", new Object[]{this.m, string4});
				this.f.remove(string4);
				this.g.remove(integer3);
				integer3--;
			} else {
				this.h.add(integer5);
			}

			integer2++;
		}

		for (byl byl3 : this.i) {
			String string4 = byl3.a();
			int integer5 = cdb.a(this.l, string4);
			if (integer5 == -1) {
				a.warn("Could not find uniform named {} in the specified shader program.", new Object[]{string4});
			} else {
				this.j.add(integer5);
				byl3.b(integer5);
				this.k.put(string4, byl3);
			}
		}
	}

	private void a(JsonElement jsonElement) {
		JsonObject jsonObject3 = ok.m(jsonElement, "sampler");
		String string4 = ok.h(jsonObject3, "name");
		if (!ok.a(jsonObject3, "file")) {
			this.f.put(string4, null);
			this.g.add(string4);
		} else {
			this.g.add(string4);
		}
	}

	public void a(String string, Object object) {
		if (this.f.containsKey(string)) {
			this.f.remove(string);
		}

		this.f.put(string, object);
		this.d();
	}

	private void b(JsonElement jsonElement) throws ku {
		JsonObject jsonObject3 = ok.m(jsonElement, "uniform");
		String string4 = ok.h(jsonObject3, "name");
		int integer5 = byl.a(ok.h(jsonObject3, "type"));
		int integer6 = ok.n(jsonObject3, "count");
		float[] arr7 = new float[Math.max(integer6, 16)];
		JsonArray jsonArray8 = ok.u(jsonObject3, "values");
		if (jsonArray8.size() != integer6 && jsonArray8.size() > 1) {
			throw new ku("Invalid amount of values specified (expected " + integer6 + ", found " + jsonArray8.size() + ")");
		} else {
			int integer9 = 0;

			for (JsonElement jsonElement11 : jsonArray8) {
				try {
					arr7[integer9] = ok.e(jsonElement11, "value");
				} catch (Exception var13) {
					ku ku13 = ku.a(var13);
					ku13.a("values[" + integer9 + "]");
					throw ku13;
				}

				integer9++;
			}

			if (integer6 > 1 && jsonArray8.size() == 1) {
				while (integer9 < integer6) {
					arr7[integer9] = arr7[0];
					integer9++;
				}
			}

			int integer10 = integer6 > 1 && integer6 <= 4 && integer5 < 8 ? integer6 - 1 : 0;
			byl byl11 = new byl(string4, integer5 + integer10, integer6, this);
			if (integer5 <= 3) {
				byl11.a((int)arr7[0], (int)arr7[1], (int)arr7[2], (int)arr7[3]);
			} else if (integer5 <= 7) {
				byl11.b(arr7[0], arr7[1], arr7[2], arr7[3]);
			} else {
				byl11.a(arr7);
			}

			this.i.add(byl11);
		}
	}

	public byj e() {
		return this.s;
	}

	public byj f() {
		return this.t;
	}

	public int h() {
		return this.l;
	}
}

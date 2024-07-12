import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bri {
	private static final Logger f = LogManager.getLogger();
	@VisibleForTesting
	static final Gson a = new GsonBuilder()
		.registerTypeAdapter(bri.class, new bri.b())
		.registerTypeAdapter(bre.class, new bre.a())
		.registerTypeAdapter(brf.class, new brf.a())
		.registerTypeAdapter(brh.class, new brh.a())
		.registerTypeAdapter(brp.class, new brp.a())
		.registerTypeAdapter(brq.class, new brq.a())
		.registerTypeAdapter(brn.class, new brn.a())
		.create();
	private final List<bre> g;
	private final boolean h;
	private final boolean i;
	private final brq j;
	private final List<brn> k;
	public String b = "";
	@VisibleForTesting
	protected final Map<String, String> c;
	@VisibleForTesting
	protected bri d;
	@VisibleForTesting
	protected kq e;

	public static bri a(Reader reader) {
		return ok.a(a, reader, bri.class, false);
	}

	public static bri a(String string) {
		return a(new StringReader(string));
	}

	public bri(@Nullable kq kq, List<bre> list2, Map<String, String> map, boolean boolean4, boolean boolean5, brq brq, List<brn> list7) {
		this.g = list2;
		this.i = boolean4;
		this.h = boolean5;
		this.c = map;
		this.e = kq;
		this.j = brq;
		this.k = list7;
	}

	public List<bre> a() {
		return this.g.isEmpty() && this.k() ? this.d.a() : this.g;
	}

	private boolean k() {
		return this.d != null;
	}

	public boolean b() {
		return this.k() ? this.d.b() : this.i;
	}

	public boolean c() {
		return this.h;
	}

	public boolean d() {
		return this.e == null || this.d != null && this.d.d();
	}

	public void a(Map<kq, bri> map) {
		if (this.e != null) {
			this.d = (bri)map.get(this.e);
		}
	}

	public Collection<kq> e() {
		Set<kq> set2 = Sets.newHashSet();

		for (brn brn4 : this.k) {
			set2.add(brn4.a());
		}

		return set2;
	}

	protected List<brn> f() {
		return this.k;
	}

	public bro g() {
		return this.k.isEmpty() ? bro.a : new bro(this.k);
	}

	public boolean b(String string) {
		return !"missingno".equals(this.c(string));
	}

	public String c(String string) {
		if (!this.d(string)) {
			string = '#' + string;
		}

		return this.a(string, new bri.a(this));
	}

	private String a(String string, bri.a a) {
		if (this.d(string)) {
			if (this == a.b) {
				f.warn("Unable to resolve texture due to upward reference: {} in {}", new Object[]{string, this.b});
				return "missingno";
			} else {
				String string4 = (String)this.c.get(string.substring(1));
				if (string4 == null && this.k()) {
					string4 = this.d.a(string, a);
				}

				a.b = this;
				if (string4 != null && this.d(string4)) {
					string4 = a.a.a(string4, a);
				}

				return string4 != null && !this.d(string4) ? string4 : "missingno";
			}
		} else {
			return string;
		}
	}

	private boolean d(String string) {
		return string.charAt(0) == '#';
	}

	@Nullable
	public kq h() {
		return this.e;
	}

	public bri i() {
		return this.k() ? this.d.i() : this;
	}

	public brq j() {
		brp brp2 = this.a(brq.b.THIRD_PERSON_LEFT_HAND);
		brp brp3 = this.a(brq.b.THIRD_PERSON_RIGHT_HAND);
		brp brp4 = this.a(brq.b.FIRST_PERSON_LEFT_HAND);
		brp brp5 = this.a(brq.b.FIRST_PERSON_RIGHT_HAND);
		brp brp6 = this.a(brq.b.HEAD);
		brp brp7 = this.a(brq.b.GUI);
		brp brp8 = this.a(brq.b.GROUND);
		brp brp9 = this.a(brq.b.FIXED);
		return new brq(brp2, brp3, brp4, brp5, brp6, brp7, brp8, brp9);
	}

	private brp a(brq.b b) {
		return this.d != null && !this.j.c(b) ? this.d.a(b) : this.j.b(b);
	}

	public static void b(Map<kq, bri> map) {
		for (bri bri3 : map.values()) {
			try {
				bri bri4 = bri3.d;

				for (bri bri5 = bri4.d; bri4 != bri5; bri5 = bri5.d.d) {
					bri4 = bri4.d;
				}

				throw new bri.c();
			} catch (NullPointerException var5) {
			}
		}
	}

	static final class a {
		public final bri a;
		public bri b;

		private a(bri bri) {
			this.a = bri;
		}
	}

	public static class b implements JsonDeserializer<bri> {
		public bri deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			List<bre> list6 = this.b(jsonDeserializationContext, jsonObject5);
			String string7 = this.c(jsonObject5);
			Map<String, String> map8 = this.b(jsonObject5);
			boolean boolean9 = this.a(jsonObject5);
			brq brq10 = brq.a;
			if (jsonObject5.has("display")) {
				JsonObject jsonObject11 = ok.t(jsonObject5, "display");
				brq10 = (brq)jsonDeserializationContext.deserialize(jsonObject11, brq.class);
			}

			List<brn> list11 = this.a(jsonDeserializationContext, jsonObject5);
			kq kq12 = string7.isEmpty() ? null : new kq(string7);
			return new bri(kq12, list6, map8, boolean9, true, brq10, list11);
		}

		protected List<brn> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
			List<brn> list4 = Lists.newArrayList();
			if (jsonObject.has("overrides")) {
				for (JsonElement jsonElement7 : ok.u(jsonObject, "overrides")) {
					list4.add((brn)jsonDeserializationContext.deserialize(jsonElement7, brn.class));
				}
			}

			return list4;
		}

		private Map<String, String> b(JsonObject jsonObject) {
			Map<String, String> map3 = Maps.newHashMap();
			if (jsonObject.has("textures")) {
				JsonObject jsonObject4 = jsonObject.getAsJsonObject("textures");

				for (Entry<String, JsonElement> entry6 : jsonObject4.entrySet()) {
					map3.put(entry6.getKey(), ((JsonElement)entry6.getValue()).getAsString());
				}
			}

			return map3;
		}

		private String c(JsonObject jsonObject) {
			return ok.a(jsonObject, "parent", "");
		}

		protected boolean a(JsonObject jsonObject) {
			return ok.a(jsonObject, "ambientocclusion", true);
		}

		protected List<bre> b(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
			List<bre> list4 = Lists.newArrayList();
			if (jsonObject.has("elements")) {
				for (JsonElement jsonElement6 : ok.u(jsonObject, "elements")) {
					list4.add((bre)jsonDeserializationContext.deserialize(jsonElement6, bre.class));
				}
			}

			return list4;
		}
	}

	public static class c extends RuntimeException {
	}
}

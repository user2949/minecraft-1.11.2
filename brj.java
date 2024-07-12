import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class brj {
	@VisibleForTesting
	static final Gson a = new GsonBuilder()
		.registerTypeAdapter(brj.class, new brj.a())
		.registerTypeAdapter(brs.class, new brs.a())
		.registerTypeAdapter(brr.class, new brr.a())
		.registerTypeAdapter(brw.class, new brw.a())
		.registerTypeAdapter(bry.class, new bry.a())
		.create();
	private final Map<String, brr> b = Maps.newHashMap();
	private brw c;

	public static brj a(Reader reader) {
		return (brj)a.fromJson(reader, brj.class);
	}

	public brj(Map<String, brr> map, brw brw) {
		this.c = brw;
		this.b.putAll(map);
	}

	public brj(List<brj> list) {
		brj brj3 = null;

		for (brj brj5 : list) {
			if (brj5.b()) {
				this.b.clear();
				brj3 = brj5;
			}

			this.b.putAll(brj5.b);
		}

		if (brj3 != null) {
			this.c = brj3.c;
		}
	}

	public boolean b(String string) {
		return this.b.get(string) != null;
	}

	public brr c(String string) {
		brr brr3 = (brr)this.b.get(string);
		if (brr3 == null) {
			throw new brj.b();
		} else {
			return brr3;
		}
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else {
			if (object instanceof brj) {
				brj brj3 = (brj)object;
				if (this.b.equals(brj3.b)) {
					return this.b() ? this.c.equals(brj3.c) : !brj3.b();
				}
			}

			return false;
		}
	}

	public int hashCode() {
		return 31 * this.b.hashCode() + (this.b() ? this.c.hashCode() : 0);
	}

	public Set<brr> a() {
		Set<brr> set2 = Sets.newHashSet(this.b.values());
		if (this.b()) {
			set2.addAll(this.c.b());
		}

		return set2;
	}

	public boolean b() {
		return this.c != null;
	}

	public brw c() {
		return this.c;
	}

	public static class a implements JsonDeserializer<brj> {
		public brj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			Map<String, brr> map6 = this.a(jsonDeserializationContext, jsonObject5);
			brw brw7 = this.b(jsonDeserializationContext, jsonObject5);
			if (!map6.isEmpty() || brw7 != null && !brw7.b().isEmpty()) {
				return new brj(map6, brw7);
			} else {
				throw new JsonParseException("Neither 'variants' nor 'multipart' found");
			}
		}

		protected Map<String, brr> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
			Map<String, brr> map4 = Maps.newHashMap();
			if (jsonObject.has("variants")) {
				JsonObject jsonObject5 = ok.t(jsonObject, "variants");

				for (Entry<String, JsonElement> entry7 : jsonObject5.entrySet()) {
					map4.put(entry7.getKey(), (brr)jsonDeserializationContext.deserialize((JsonElement)entry7.getValue(), brr.class));
				}
			}

			return map4;
		}

		@Nullable
		protected brw b(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
			if (!jsonObject.has("multipart")) {
				return null;
			} else {
				JsonArray jsonArray4 = ok.u(jsonObject, "multipart");
				return (brw)jsonDeserializationContext.deserialize(jsonArray4, brw.class);
			}
		}
	}

	public class b extends RuntimeException {
		protected b() {
		}
	}
}

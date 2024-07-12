import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class bde {
	private static final Map<kq, bdd.a<?>> a = Maps.newHashMap();
	private static final Map<Class<? extends bdd>, bdd.a<?>> b = Maps.newHashMap();

	public static <T extends bdd> void a(bdd.a<? extends T> a) {
		kq kq2 = a.a();
		Class<T> class3 = (Class<T>)a.b();
		if (bde.a.containsKey(kq2)) {
			throw new IllegalArgumentException("Can't re-register item condition name " + kq2);
		} else if (b.containsKey(class3)) {
			throw new IllegalArgumentException("Can't re-register item condition class " + class3.getName());
		} else {
			bde.a.put(kq2, a);
			b.put(class3, a);
		}
	}

	public static boolean a(@Nullable bdd[] arr, Random random, bcl bcl) {
		if (arr == null) {
			return true;
		} else {
			for (bdd bdd7 : arr) {
				if (!bdd7.a(random, bcl)) {
					return false;
				}
			}

			return true;
		}
	}

	public static bdd.a<?> a(kq kq) {
		bdd.a<?> a2 = (bdd.a<?>)a.get(kq);
		if (a2 == null) {
			throw new IllegalArgumentException("Unknown loot item condition '" + kq + "'");
		} else {
			return a2;
		}
	}

	public static <T extends bdd> bdd.a<T> a(T bdd) {
		bdd.a<T> a2 = (bdd.a<T>)b.get(bdd.getClass());
		if (a2 == null) {
			throw new IllegalArgumentException("Unknown loot item condition " + bdd);
		} else {
			return a2;
		}
	}

	static {
		a(new bdh.a());
		a(new bdi.a());
		a(new bdf.a());
		a(new bdg.a());
		a(new bdc.a());
	}

	public static class a implements JsonDeserializer<bdd>, JsonSerializer<bdd> {
		public bdd deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = ok.m(jsonElement, "condition");
			kq kq6 = new kq(ok.h(jsonObject5, "condition"));

			bdd.a<?> a7;
			try {
				a7 = bde.a(kq6);
			} catch (IllegalArgumentException var8) {
				throw new JsonSyntaxException("Unknown condition '" + kq6 + "'");
			}

			return a7.b(jsonObject5, jsonDeserializationContext);
		}

		public JsonElement serialize(bdd bdd, Type type, JsonSerializationContext jsonSerializationContext) {
			bdd.a<bdd> a5 = bde.a(bdd);
			JsonObject jsonObject6 = new JsonObject();
			a5.a(jsonObject6, bdd, jsonSerializationContext);
			jsonObject6.addProperty("condition", a5.a().toString());
			return jsonObject6;
		}
	}
}

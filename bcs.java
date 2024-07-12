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

public class bcs {
	private static final Map<kq, bcr.a<?>> a = Maps.newHashMap();
	private static final Map<Class<? extends bcr>, bcr.a<?>> b = Maps.newHashMap();

	public static <T extends bcr> void a(bcr.a<? extends T> a) {
		kq kq2 = a.a();
		Class<T> class3 = (Class<T>)a.b();
		if (bcs.a.containsKey(kq2)) {
			throw new IllegalArgumentException("Can't re-register item function name " + kq2);
		} else if (b.containsKey(class3)) {
			throw new IllegalArgumentException("Can't re-register item function class " + class3.getName());
		} else {
			bcs.a.put(kq2, a);
			b.put(class3, a);
		}
	}

	public static bcr.a<?> a(kq kq) {
		bcr.a<?> a2 = (bcr.a<?>)a.get(kq);
		if (a2 == null) {
			throw new IllegalArgumentException("Unknown loot item function '" + kq + "'");
		} else {
			return a2;
		}
	}

	public static <T extends bcr> bcr.a<T> a(T bcr) {
		bcr.a<T> a2 = (bcr.a<T>)b.get(bcr.getClass());
		if (a2 == null) {
			throw new IllegalArgumentException("Unknown loot item function " + bcr);
		} else {
			return a2;
		}
	}

	static {
		a(new bcv.a());
		a(new bcx.a());
		a(new bcq.a());
		a(new bcp.a());
		a(new bcy.a());
		a(new bcz.a());
		a(new bct.a());
		a(new bcw.a());
		a(new bcu.b());
	}

	public static class a implements JsonDeserializer<bcr>, JsonSerializer<bcr> {
		public bcr deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = ok.m(jsonElement, "function");
			kq kq6 = new kq(ok.h(jsonObject5, "function"));

			bcr.a<?> a7;
			try {
				a7 = bcs.a(kq6);
			} catch (IllegalArgumentException var8) {
				throw new JsonSyntaxException("Unknown function '" + kq6 + "'");
			}

			return a7.b(jsonObject5, jsonDeserializationContext, ok.a(jsonObject5, "conditions", new bdd[0], jsonDeserializationContext, bdd[].class));
		}

		public JsonElement serialize(bcr bcr, Type type, JsonSerializationContext jsonSerializationContext) {
			bcr.a<bcr> a5 = bcs.a(bcr);
			JsonObject jsonObject6 = new JsonObject();
			a5.a(jsonObject6, bcr, jsonSerializationContext);
			jsonObject6.addProperty("function", a5.a().toString());
			if (bcr.a() != null && bcr.a().length > 0) {
				jsonObject6.add("conditions", jsonSerializationContext.serialize(bcr.a()));
			}

			return jsonObject6;
		}
	}
}

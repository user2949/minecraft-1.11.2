import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class brn {
	private final kq a;
	private final Map<kq, Float> b;

	public brn(kq kq, Map<kq, Float> map) {
		this.a = kq;
		this.b = map;
	}

	public kq a() {
		return this.a;
	}

	boolean a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
		afh afh5 = afj.c();

		for (Entry<kq, Float> entry7 : this.b.entrySet()) {
			afk afk8 = afh5.a((kq)entry7.getKey());
			if (afk8 == null || afk8.a(afj, ajs, sw) < (Float)entry7.getValue()) {
				return false;
			}
		}

		return true;
	}

	static class a implements JsonDeserializer<brn> {
		public brn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = jsonElement.getAsJsonObject();
			kq kq6 = new kq(ok.h(jsonObject5, "model"));
			Map<kq, Float> map7 = this.a(jsonObject5);
			return new brn(kq6, map7);
		}

		protected Map<kq, Float> a(JsonObject jsonObject) {
			Map<kq, Float> map3 = Maps.newLinkedHashMap();
			JsonObject jsonObject4 = ok.t(jsonObject, "predicate");

			for (Entry<String, JsonElement> entry6 : jsonObject4.entrySet()) {
				map3.put(new kq((String)entry6.getKey()), ok.e((JsonElement)entry6.getValue(), (String)entry6.getKey()));
			}

			return map3;
		}
	}
}

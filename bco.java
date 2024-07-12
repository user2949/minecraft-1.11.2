import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Random;

public class bco {
	private final float a;
	private final float b;

	public bco(float float1, float float2) {
		this.a = float1;
		this.b = float2;
	}

	public bco(float float1) {
		this.a = float1;
		this.b = float1;
	}

	public float a() {
		return this.a;
	}

	public float b() {
		return this.b;
	}

	public int a(Random random) {
		return ot.a(random, ot.d(this.a), ot.d(this.b));
	}

	public float b(Random random) {
		return ot.a(random, this.a, this.b);
	}

	public boolean a(int integer) {
		return (float)integer <= this.b && (float)integer >= this.a;
	}

	public static class a implements JsonDeserializer<bco>, JsonSerializer<bco> {
		public bco deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			if (ok.b(jsonElement)) {
				return new bco(ok.e(jsonElement, "value"));
			} else {
				JsonObject jsonObject5 = ok.m(jsonElement, "value");
				float float6 = ok.l(jsonObject5, "min");
				float float7 = ok.l(jsonObject5, "max");
				return new bco(float6, float7);
			}
		}

		public JsonElement serialize(bco bco, Type type, JsonSerializationContext jsonSerializationContext) {
			if (bco.a == bco.b) {
				return new JsonPrimitive(bco.a);
			} else {
				JsonObject jsonObject5 = new JsonObject();
				jsonObject5.addProperty("min", bco.a);
				jsonObject5.addProperty("max", bco.b);
				return jsonObject5;
			}
		}
	}
}

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class cas extends cam<car> implements JsonSerializer<car> {
	public car deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		List<caq> list5 = Lists.newArrayList();
		JsonObject jsonObject6 = ok.m(jsonElement, "metadata section");
		int integer7 = ok.a(jsonObject6, "frametime", 1);
		if (integer7 != 1) {
			Validate.inclusiveBetween(1L, 2147483647L, (long)integer7, "Invalid default frame time");
		}

		if (jsonObject6.has("frames")) {
			try {
				JsonArray jsonArray8 = ok.u(jsonObject6, "frames");

				for (int integer9 = 0; integer9 < jsonArray8.size(); integer9++) {
					JsonElement jsonElement10 = jsonArray8.get(integer9);
					caq caq11 = this.a(integer9, jsonElement10);
					if (caq11 != null) {
						list5.add(caq11);
					}
				}
			} catch (ClassCastException var11) {
				throw new JsonParseException("Invalid animation->frames: expected array, was " + jsonObject6.get("frames"), var11);
			}
		}

		int integer8 = ok.a(jsonObject6, "width", -1);
		int integer9x = ok.a(jsonObject6, "height", -1);
		if (integer8 != -1) {
			Validate.inclusiveBetween(1L, 2147483647L, (long)integer8, "Invalid width");
		}

		if (integer9x != -1) {
			Validate.inclusiveBetween(1L, 2147483647L, (long)integer9x, "Invalid height");
		}

		boolean boolean10 = ok.a(jsonObject6, "interpolate", false);
		return new car(list5, integer8, integer9x, integer7, boolean10);
	}

	private caq a(int integer, JsonElement jsonElement) {
		if (jsonElement.isJsonPrimitive()) {
			return new caq(ok.g(jsonElement, "frames[" + integer + "]"));
		} else if (jsonElement.isJsonObject()) {
			JsonObject jsonObject4 = ok.m(jsonElement, "frames[" + integer + "]");
			int integer5 = ok.a(jsonObject4, "time", -1);
			if (jsonObject4.has("time")) {
				Validate.inclusiveBetween(1L, 2147483647L, (long)integer5, "Invalid frame time");
			}

			int integer6 = ok.n(jsonObject4, "index");
			Validate.inclusiveBetween(0L, 2147483647L, (long)integer6, "Invalid frame index");
			return new caq(integer6, integer5);
		} else {
			return null;
		}
	}

	public JsonElement serialize(car car, Type type, JsonSerializationContext jsonSerializationContext) {
		JsonObject jsonObject5 = new JsonObject();
		jsonObject5.addProperty("frametime", car.d());
		if (car.b() != -1) {
			jsonObject5.addProperty("width", car.b());
		}

		if (car.a() != -1) {
			jsonObject5.addProperty("height", car.a());
		}

		if (car.c() > 0) {
			JsonArray jsonArray6 = new JsonArray();

			for (int integer7 = 0; integer7 < car.c(); integer7++) {
				if (car.b(integer7)) {
					JsonObject jsonObject8 = new JsonObject();
					jsonObject8.addProperty("index", car.c(integer7));
					jsonObject8.addProperty("time", car.a(integer7));
					jsonArray6.add(jsonObject8);
				} else {
					jsonArray6.add(new JsonPrimitive(car.c(integer7)));
				}
			}

			jsonObject5.add("frames", jsonArray6);
		}

		return jsonObject5;
	}

	@Override
	public String a() {
		return "animation";
	}
}

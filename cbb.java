import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class cbb extends cam<cba> implements JsonSerializer<cba> {
	public cba deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		JsonObject jsonObject5 = jsonElement.getAsJsonObject();
		fb fb6 = (fb)jsonDeserializationContext.deserialize(jsonObject5.get("description"), fb.class);
		if (fb6 == null) {
			throw new JsonParseException("Invalid/missing description!");
		} else {
			int integer7 = ok.n(jsonObject5, "pack_format");
			return new cba(fb6, integer7);
		}
	}

	public JsonElement serialize(cba cba, Type type, JsonSerializationContext jsonSerializationContext) {
		JsonObject jsonObject5 = new JsonObject();
		jsonObject5.addProperty("pack_format", cba.b());
		jsonObject5.add("description", jsonSerializationContext.serialize(cba.a()));
		return jsonObject5;
	}

	@Override
	public String a() {
		return "pack";
	}
}

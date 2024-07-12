import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public class cav extends cam<cau> {
	public cau deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		JsonObject jsonObject5 = jsonElement.getAsJsonObject();
		float[] arr6 = new float[256];
		float[] arr7 = new float[256];
		float[] arr8 = new float[256];
		float float9 = 1.0F;
		float float10 = 0.0F;
		float float11 = 0.0F;
		if (jsonObject5.has("characters")) {
			if (!jsonObject5.get("characters").isJsonObject()) {
				throw new JsonParseException("Invalid font->characters: expected object, was " + jsonObject5.get("characters"));
			}

			JsonObject jsonObject12 = jsonObject5.getAsJsonObject("characters");
			if (jsonObject12.has("default")) {
				if (!jsonObject12.get("default").isJsonObject()) {
					throw new JsonParseException("Invalid font->characters->default: expected object, was " + jsonObject12.get("default"));
				}

				JsonObject jsonObject13 = jsonObject12.getAsJsonObject("default");
				float9 = ok.a(jsonObject13, "width", float9);
				Validate.inclusiveBetween(0.0, Float.MAX_VALUE, (double)float9, "Invalid default width");
				float10 = ok.a(jsonObject13, "spacing", float10);
				Validate.inclusiveBetween(0.0, Float.MAX_VALUE, (double)float10, "Invalid default spacing");
				float11 = ok.a(jsonObject13, "left", float10);
				Validate.inclusiveBetween(0.0, Float.MAX_VALUE, (double)float11, "Invalid default left");
			}

			for (int integer13 = 0; integer13 < 256; integer13++) {
				JsonElement jsonElement14 = jsonObject12.get(Integer.toString(integer13));
				float float15 = float9;
				float float16 = float10;
				float float17 = float11;
				if (jsonElement14 != null) {
					JsonObject jsonObject18 = ok.m(jsonElement14, "characters[" + integer13 + "]");
					float15 = ok.a(jsonObject18, "width", float9);
					Validate.inclusiveBetween(0.0, Float.MAX_VALUE, (double)float15, "Invalid width");
					float16 = ok.a(jsonObject18, "spacing", float10);
					Validate.inclusiveBetween(0.0, Float.MAX_VALUE, (double)float16, "Invalid spacing");
					float17 = ok.a(jsonObject18, "left", float11);
					Validate.inclusiveBetween(0.0, Float.MAX_VALUE, (double)float17, "Invalid left");
				}

				arr6[integer13] = float15;
				arr7[integer13] = float16;
				arr8[integer13] = float17;
			}
		}

		return new cau(arr6, arr8, arr7);
	}

	@Override
	public String a() {
		return "font";
	}
}

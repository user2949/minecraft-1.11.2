import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class cbf extends cam<cbe> {
	public cbe deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		JsonObject jsonObject5 = jsonElement.getAsJsonObject();
		boolean boolean6 = ok.a(jsonObject5, "blur", false);
		boolean boolean7 = ok.a(jsonObject5, "clamp", false);
		return new cbe(boolean6, boolean7);
	}

	@Override
	public String a() {
		return "texture";
	}
}

import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Map.Entry;

public class cay extends cam<cax> {
	public cax deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		JsonObject jsonObject5 = jsonElement.getAsJsonObject();
		Set<cai> set6 = Sets.newHashSet();

		for (Entry<String, JsonElement> entry8 : jsonObject5.entrySet()) {
			String string9 = (String)entry8.getKey();
			JsonObject jsonObject10 = ok.m((JsonElement)entry8.getValue(), "language");
			String string11 = ok.h(jsonObject10, "region");
			String string12 = ok.h(jsonObject10, "name");
			boolean boolean13 = ok.a(jsonObject10, "bidirectional", false);
			if (string11.isEmpty()) {
				throw new JsonParseException("Invalid language->'" + string9 + "'->region: empty value");
			}

			if (string12.isEmpty()) {
				throw new JsonParseException("Invalid language->'" + string9 + "'->name: empty value");
			}

			if (!set6.add(new cai(string9, string11, string12, boolean13))) {
				throw new JsonParseException("Duplicate language->'" + string9 + "' defined");
			}
		}

		return new cax(set6);
	}

	@Override
	public String a() {
		return "language";
	}
}

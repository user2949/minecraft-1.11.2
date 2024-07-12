import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Set;

public class oc extends ForwardingSet<String> implements nz {
	private final Set<String> a = Sets.newHashSet();

	@Override
	public void a(JsonElement jsonElement) {
		if (jsonElement.isJsonArray()) {
			for (JsonElement jsonElement4 : jsonElement.getAsJsonArray()) {
				this.add(jsonElement4.getAsString());
			}
		}
	}

	@Override
	public JsonElement a() {
		JsonArray jsonArray2 = new JsonArray();

		for (String string4 : this) {
			jsonArray2.add(new JsonPrimitive(string4));
		}

		return jsonArray2;
	}

	protected Set<String> delegate() {
		return this.a;
	}
}

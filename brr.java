import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public class brr {
	private final List<brs> a;

	public brr(List<brs> list) {
		this.a = list;
	}

	public List<brs> a() {
		return this.a;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object instanceof brr) {
			brr brr3 = (brr)object;
			return this.a.equals(brr3.a);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.a.hashCode();
	}

	public static class a implements JsonDeserializer<brr> {
		public brr deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			List<brs> list5 = Lists.newArrayList();
			if (jsonElement.isJsonArray()) {
				JsonArray jsonArray6 = jsonElement.getAsJsonArray();
				if (jsonArray6.size() == 0) {
					throw new JsonParseException("Empty variant array");
				}

				for (JsonElement jsonElement8 : jsonArray6) {
					list5.add((brs)jsonDeserializationContext.deserialize(jsonElement8, brs.class));
				}
			} else {
				list5.add((brs)jsonDeserializationContext.deserialize(jsonElement, brs.class));
			}

			return new brr(list5);
		}
	}
}

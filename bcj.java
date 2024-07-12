import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Random;

public abstract class bcj {
	protected final int c;
	protected final int d;
	protected final bdd[] e;

	protected bcj(int integer1, int integer2, bdd[] arr) {
		this.c = integer1;
		this.d = integer2;
		this.e = arr;
	}

	public int a(float float1) {
		return Math.max(ot.d((float)this.c + (float)this.d * float1), 0);
	}

	public abstract void a(Collection<afj> collection, Random random, bcl bcl);

	protected abstract void a(JsonObject jsonObject, JsonSerializationContext jsonSerializationContext);

	public static class a implements JsonDeserializer<bcj>, JsonSerializer<bcj> {
		public bcj deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = ok.m(jsonElement, "loot item");
			String string6 = ok.h(jsonObject5, "type");
			int integer7 = ok.a(jsonObject5, "weight", 1);
			int integer8 = ok.a(jsonObject5, "quality", 0);
			bdd[] arr9;
			if (jsonObject5.has("conditions")) {
				arr9 = ok.a(jsonObject5, "conditions", jsonDeserializationContext, bdd[].class);
			} else {
				arr9 = new bdd[0];
			}

			if ("item".equals(string6)) {
				return bch.a(jsonObject5, jsonDeserializationContext, integer7, integer8, arr9);
			} else if ("loot_table".equals(string6)) {
				return bcm.a(jsonObject5, jsonDeserializationContext, integer7, integer8, arr9);
			} else if ("empty".equals(string6)) {
				return bcg.a(jsonObject5, jsonDeserializationContext, integer7, integer8, arr9);
			} else {
				throw new JsonSyntaxException("Unknown loot entry type '" + string6 + "'");
			}
		}

		public JsonElement serialize(bcj bcj, Type type, JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject5 = new JsonObject();
			jsonObject5.addProperty("weight", bcj.c);
			jsonObject5.addProperty("quality", bcj.d);
			if (bcj.e.length > 0) {
				jsonObject5.add("conditions", jsonSerializationContext.serialize(bcj.e));
			}

			if (bcj instanceof bch) {
				jsonObject5.addProperty("type", "item");
			} else if (bcj instanceof bcm) {
				jsonObject5.addProperty("type", "item");
			} else {
				if (!(bcj instanceof bcg)) {
					throw new IllegalArgumentException("Don't know how to serialize " + bcj);
				}

				jsonObject5.addProperty("type", "empty");
			}

			bcj.a(jsonObject5, jsonSerializationContext);
			return jsonObject5;
		}
	}
}

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class pn implements pd {
	public static final Gson a = new GsonBuilder().registerTypeAdapter(fb.class, new JsonDeserializer<fb>() {
		public fb deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			if (jsonElement.isJsonPrimitive()) {
				return new fh(jsonElement.getAsString());
			} else if (jsonElement.isJsonArray()) {
				JsonArray jsonArray5 = jsonElement.getAsJsonArray();
				fb fb6 = null;

				for (JsonElement jsonElement8 : jsonArray5) {
					fb fb9 = this.a(jsonElement8, jsonElement8.getClass(), jsonDeserializationContext);
					if (fb6 == null) {
						fb6 = fb9;
					} else {
						fb6.a(fb9);
					}
				}

				return fb6;
			} else {
				throw new JsonParseException("Don't know how to turn " + jsonElement + " into a Component");
			}
		}
	}).create();

	@Override
	public int a() {
		return 101;
	}

	@Override
	public du a(du du) {
		if ("Sign".equals(du.l("id"))) {
			this.a(du, "Text1");
			this.a(du, "Text2");
			this.a(du, "Text3");
			this.a(du, "Text4");
		}

		return du;
	}

	private void a(du du, String string) {
		String string4 = du.l(string);
		fb fb5 = null;
		if (!"null".equals(string4) && !oy.b(string4)) {
			if (string4.charAt(0) == '"' && string4.charAt(string4.length() - 1) == '"' || string4.charAt(0) == '{' && string4.charAt(string4.length() - 1) == '}') {
				try {
					fb5 = (fb)a.fromJson(string4, fb.class);
					if (fb5 == null) {
						fb5 = new fh("");
					}
				} catch (JsonParseException var8) {
				}

				if (fb5 == null) {
					try {
						fb5 = fb.a.a(string4);
					} catch (JsonParseException var7) {
					}
				}

				if (fb5 == null) {
					try {
						fb5 = fb.a.b(string4);
					} catch (JsonParseException var6) {
					}
				}

				if (fb5 == null) {
					fb5 = new fh(string4);
				}
			} else {
				fb5 = new fh(string4);
			}
		} else {
			fb5 = new fh("");
		}

		du.a(string, fb.a.a(fb5));
	}
}

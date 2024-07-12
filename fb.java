import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map.Entry;

public interface fb extends Iterable<fb> {
	fb a(fg fg);

	fg b();

	fb a(String string);

	fb a(fb fb);

	String e();

	String c();

	String d();

	List<fb> a();

	fb f();

	public static class a implements JsonDeserializer<fb>, JsonSerializer<fb> {
		private static final Gson a;

		public fb deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			if (jsonElement.isJsonPrimitive()) {
				return new fh(jsonElement.getAsString());
			} else if (!jsonElement.isJsonObject()) {
				if (jsonElement.isJsonArray()) {
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
			} else {
				JsonObject jsonObject5 = jsonElement.getAsJsonObject();
				fb fb6;
				if (jsonObject5.has("text")) {
					fb6 = new fh(jsonObject5.get("text").getAsString());
				} else if (jsonObject5.has("translate")) {
					String string7 = jsonObject5.get("translate").getAsString();
					if (jsonObject5.has("with")) {
						JsonArray jsonArray8 = jsonObject5.getAsJsonArray("with");
						Object[] arr9 = new Object[jsonArray8.size()];

						for (int integer10 = 0; integer10 < arr9.length; integer10++) {
							arr9[integer10] = this.a(jsonArray8.get(integer10), type, jsonDeserializationContext);
							if (arr9[integer10] instanceof fh) {
								fh fh11 = (fh)arr9[integer10];
								if (fh11.b().g() && fh11.a().isEmpty()) {
									arr9[integer10] = fh11.g();
								}
							}
						}

						fb6 = new fi(string7, arr9);
					} else {
						fb6 = new fi(string7);
					}
				} else if (jsonObject5.has("score")) {
					JsonObject jsonObject7 = jsonObject5.getAsJsonObject("score");
					if (!jsonObject7.has("name") || !jsonObject7.has("objective")) {
						throw new JsonParseException("A score component needs a least a name and an objective");
					}

					fb6 = new fe(ok.h(jsonObject7, "name"), ok.h(jsonObject7, "objective"));
					if (jsonObject7.has("value")) {
						((fe)fb6).b(ok.h(jsonObject7, "value"));
					}
				} else {
					if (!jsonObject5.has("selector")) {
						throw new JsonParseException("Don't know how to turn " + jsonElement + " into a Component");
					}

					fb6 = new ff(ok.h(jsonObject5, "selector"));
				}

				if (jsonObject5.has("extra")) {
					JsonArray jsonArray7 = jsonObject5.getAsJsonArray("extra");
					if (jsonArray7.size() <= 0) {
						throw new JsonParseException("Unexpected empty array of components");
					}

					for (int integer8 = 0; integer8 < jsonArray7.size(); integer8++) {
						fb6.a(this.a(jsonArray7.get(integer8), type, jsonDeserializationContext));
					}
				}

				fb6.a((fg)jsonDeserializationContext.deserialize(jsonElement, fg.class));
				return fb6;
			}
		}

		private void a(fg fg, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
			JsonElement jsonElement5 = jsonSerializationContext.serialize(fg);
			if (jsonElement5.isJsonObject()) {
				JsonObject jsonObject6 = (JsonObject)jsonElement5;

				for (Entry<String, JsonElement> entry8 : jsonObject6.entrySet()) {
					jsonObject.add((String)entry8.getKey(), (JsonElement)entry8.getValue());
				}
			}
		}

		public JsonElement serialize(fb fb, Type type, JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject5 = new JsonObject();
			if (!fb.b().g()) {
				this.a(fb.b(), jsonObject5, jsonSerializationContext);
			}

			if (!fb.a().isEmpty()) {
				JsonArray jsonArray6 = new JsonArray();

				for (fb fb8 : fb.a()) {
					jsonArray6.add(this.a(fb8, fb8.getClass(), jsonSerializationContext));
				}

				jsonObject5.add("extra", jsonArray6);
			}

			if (fb instanceof fh) {
				jsonObject5.addProperty("text", ((fh)fb).g());
			} else if (fb instanceof fi) {
				fi fi6 = (fi)fb;
				jsonObject5.addProperty("translate", fi6.i());
				if (fi6.j() != null && fi6.j().length > 0) {
					JsonArray jsonArray7 = new JsonArray();

					for (Object object11 : fi6.j()) {
						if (object11 instanceof fb) {
							jsonArray7.add(this.a((fb)object11, object11.getClass(), jsonSerializationContext));
						} else {
							jsonArray7.add(new JsonPrimitive(String.valueOf(object11)));
						}
					}

					jsonObject5.add("with", jsonArray7);
				}
			} else if (fb instanceof fe) {
				fe fe6 = (fe)fb;
				JsonObject jsonObject7 = new JsonObject();
				jsonObject7.addProperty("name", fe6.g());
				jsonObject7.addProperty("objective", fe6.h());
				jsonObject7.addProperty("value", fe6.e());
				jsonObject5.add("score", jsonObject7);
			} else {
				if (!(fb instanceof ff)) {
					throw new IllegalArgumentException("Don't know how to serialize " + fb + " as a Component");
				}

				ff ff6 = (ff)fb;
				jsonObject5.addProperty("selector", ff6.g());
			}

			return jsonObject5;
		}

		public static String a(fb fb) {
			return a.toJson(fb);
		}

		public static fb a(String string) {
			return ok.a(a, string, fb.class, false);
		}

		public static fb b(String string) {
			return ok.a(a, string, fb.class, true);
		}

		static {
			GsonBuilder gsonBuilder1 = new GsonBuilder();
			gsonBuilder1.registerTypeHierarchyAdapter(fb.class, new fb.a());
			gsonBuilder1.registerTypeHierarchyAdapter(fg.class, new fg.a());
			gsonBuilder1.registerTypeAdapterFactory(new os());
			a = gsonBuilder1.create();
		}
	}
}

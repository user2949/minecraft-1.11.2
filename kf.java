import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

public class kf {
	private fb a;
	private kf.a b;
	private kf.c c;
	private String d;

	public fb a() {
		return this.a;
	}

	public void a(fb fb) {
		this.a = fb;
	}

	public kf.a b() {
		return this.b;
	}

	public void a(kf.a a) {
		this.b = a;
	}

	public kf.c c() {
		return this.c;
	}

	public void a(kf.c c) {
		this.c = c;
	}

	public void a(String string) {
		this.d = string;
	}

	public String d() {
		return this.d;
	}

	public static class a {
		private final int a;
		private final int b;
		private GameProfile[] c;

		public a(int integer1, int integer2) {
			this.a = integer1;
			this.b = integer2;
		}

		public int a() {
			return this.a;
		}

		public int b() {
			return this.b;
		}

		public GameProfile[] c() {
			return this.c;
		}

		public void a(GameProfile[] arr) {
			this.c = arr;
		}

		public static class a implements JsonDeserializer<kf.a>, JsonSerializer<kf.a> {
			public kf.a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
				JsonObject jsonObject5 = ok.m(jsonElement, "players");
				kf.a a6 = new kf.a(ok.n(jsonObject5, "max"), ok.n(jsonObject5, "online"));
				if (ok.d(jsonObject5, "sample")) {
					JsonArray jsonArray7 = ok.u(jsonObject5, "sample");
					if (jsonArray7.size() > 0) {
						GameProfile[] arr8 = new GameProfile[jsonArray7.size()];

						for (int integer9 = 0; integer9 < arr8.length; integer9++) {
							JsonObject jsonObject10 = ok.m(jsonArray7.get(integer9), "player[" + integer9 + "]");
							String string11 = ok.h(jsonObject10, "id");
							arr8[integer9] = new GameProfile(UUID.fromString(string11), ok.h(jsonObject10, "name"));
						}

						a6.a(arr8);
					}
				}

				return a6;
			}

			public JsonElement serialize(kf.a a, Type type, JsonSerializationContext jsonSerializationContext) {
				JsonObject jsonObject5 = new JsonObject();
				jsonObject5.addProperty("max", a.a());
				jsonObject5.addProperty("online", a.b());
				if (a.c() != null && a.c().length > 0) {
					JsonArray jsonArray6 = new JsonArray();

					for (int integer7 = 0; integer7 < a.c().length; integer7++) {
						JsonObject jsonObject8 = new JsonObject();
						UUID uUID9 = a.c()[integer7].getId();
						jsonObject8.addProperty("id", uUID9 == null ? "" : uUID9.toString());
						jsonObject8.addProperty("name", a.c()[integer7].getName());
						jsonArray6.add(jsonObject8);
					}

					jsonObject5.add("sample", jsonArray6);
				}

				return jsonObject5;
			}
		}
	}

	public static class b implements JsonDeserializer<kf>, JsonSerializer<kf> {
		public kf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = ok.m(jsonElement, "status");
			kf kf6 = new kf();
			if (jsonObject5.has("description")) {
				kf6.a((fb)jsonDeserializationContext.deserialize(jsonObject5.get("description"), fb.class));
			}

			if (jsonObject5.has("players")) {
				kf6.a((kf.a)jsonDeserializationContext.deserialize(jsonObject5.get("players"), kf.a.class));
			}

			if (jsonObject5.has("version")) {
				kf6.a((kf.c)jsonDeserializationContext.deserialize(jsonObject5.get("version"), kf.c.class));
			}

			if (jsonObject5.has("favicon")) {
				kf6.a(ok.h(jsonObject5, "favicon"));
			}

			return kf6;
		}

		public JsonElement serialize(kf kf, Type type, JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject5 = new JsonObject();
			if (kf.a() != null) {
				jsonObject5.add("description", jsonSerializationContext.serialize(kf.a()));
			}

			if (kf.b() != null) {
				jsonObject5.add("players", jsonSerializationContext.serialize(kf.b()));
			}

			if (kf.c() != null) {
				jsonObject5.add("version", jsonSerializationContext.serialize(kf.c()));
			}

			if (kf.d() != null) {
				jsonObject5.addProperty("favicon", kf.d());
			}

			return jsonObject5;
		}
	}

	public static class c {
		private final String a;
		private final int b;

		public c(String string, int integer) {
			this.a = string;
			this.b = integer;
		}

		public String a() {
			return this.a;
		}

		public int b() {
			return this.b;
		}

		public static class a implements JsonDeserializer<kf.c>, JsonSerializer<kf.c> {
			public kf.c deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
				JsonObject jsonObject5 = ok.m(jsonElement, "version");
				return new kf.c(ok.h(jsonObject5, "name"), ok.n(jsonObject5, "protocol"));
			}

			public JsonElement serialize(kf.c c, Type type, JsonSerializationContext jsonSerializationContext) {
				JsonObject jsonObject5 = new JsonObject();
				jsonObject5.addProperty("name", c.a());
				jsonObject5.addProperty("protocol", c.b());
				return jsonObject5;
			}
		}
	}
}

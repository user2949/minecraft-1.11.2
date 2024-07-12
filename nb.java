import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class nb extends mw<GameProfile> {
	public nb(GameProfile gameProfile) {
		super(gameProfile);
	}

	public nb(JsonObject jsonObject) {
		super(b(jsonObject), jsonObject);
	}

	@Override
	protected void a(JsonObject jsonObject) {
		if (this.f() != null) {
			jsonObject.addProperty("uuid", this.f().getId() == null ? "" : this.f().getId().toString());
			jsonObject.addProperty("name", this.f().getName());
			super.a(jsonObject);
		}
	}

	private static GameProfile b(JsonObject jsonObject) {
		if (jsonObject.has("uuid") && jsonObject.has("name")) {
			String string2 = jsonObject.get("uuid").getAsString();

			UUID uUID3;
			try {
				uUID3 = UUID.fromString(string2);
			} catch (Throwable var4) {
				return null;
			}

			return new GameProfile(uUID3, jsonObject.get("name").getAsString());
		} else {
			return null;
		}
	}
}

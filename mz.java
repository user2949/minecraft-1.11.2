import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;

public class mz extends mo<GameProfile> {
	public mz(GameProfile gameProfile) {
		this(gameProfile, null, null, null, null);
	}

	public mz(GameProfile gameProfile, Date date2, String string3, Date date4, String string5) {
		super(gameProfile, date4, string3, date4, string5);
	}

	public mz(JsonObject jsonObject) {
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

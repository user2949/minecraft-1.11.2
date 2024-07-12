import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class my extends mx<GameProfile, mz> {
	public my(File file) {
		super(file);
	}

	@Override
	protected mw<GameProfile> a(JsonObject jsonObject) {
		return new mz(jsonObject);
	}

	public boolean a(GameProfile gameProfile) {
		return this.d(gameProfile);
	}

	@Override
	public String[] a() {
		String[] arr2 = new String[this.e().size()];
		int integer3 = 0;

		for (mz mz5 : this.e().values()) {
			arr2[integer3++] = mz5.f().getName();
		}

		return arr2;
	}

	protected String a(GameProfile gameProfile) {
		return gameProfile.getId().toString();
	}

	public GameProfile a(String string) {
		for (mz mz4 : this.e().values()) {
			if (string.equalsIgnoreCase(mz4.f().getName())) {
				return mz4.f();
			}
		}

		return null;
	}
}

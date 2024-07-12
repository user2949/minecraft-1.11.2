import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class na extends mx<GameProfile, nb> {
	public na(File file) {
		super(file);
	}

	@Override
	protected mw<GameProfile> a(JsonObject jsonObject) {
		return new nb(jsonObject);
	}

	@Override
	public String[] a() {
		String[] arr2 = new String[this.e().size()];
		int integer3 = 0;

		for (nb nb5 : this.e().values()) {
			arr2[integer3++] = nb5.f().getName();
		}

		return arr2;
	}

	protected String a(GameProfile gameProfile) {
		return gameProfile.getId().toString();
	}

	public GameProfile a(String string) {
		for (nb nb4 : this.e().values()) {
			if (string.equalsIgnoreCase(nb4.f().getName())) {
				return nb4.f();
			}
		}

		return null;
	}
}

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class mu extends mx<GameProfile, mv> {
	public mu(File file) {
		super(file);
	}

	@Override
	protected mw<GameProfile> a(JsonObject jsonObject) {
		return new mv(jsonObject);
	}

	@Override
	public String[] a() {
		String[] arr2 = new String[this.e().size()];
		int integer3 = 0;

		for (mv mv5 : this.e().values()) {
			arr2[integer3++] = mv5.f().getName();
		}

		return arr2;
	}

	public int a(GameProfile gameProfile) {
		mv mv3 = this.b(gameProfile);
		return mv3 != null ? mv3.a() : 0;
	}

	public boolean b(GameProfile gameProfile) {
		mv mv3 = this.b(gameProfile);
		return mv3 != null ? mv3.b() : false;
	}

	protected String a(GameProfile gameProfile) {
		return gameProfile.getId().toString();
	}

	public GameProfile a(String string) {
		for (mv mv4 : this.e().values()) {
			if (string.equalsIgnoreCase(mv4.f().getName())) {
				return mv4.f();
			}
		}

		return null;
	}
}

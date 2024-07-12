import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class jt implements fm<js> {
	private GameProfile a;

	public jt() {
	}

	public jt(GameProfile gameProfile) {
		this.a = gameProfile;
	}

	@Override
	public void a(et et) throws IOException {
		String string3 = et.e(36);
		String string4 = et.e(16);
		UUID uUID5 = UUID.fromString(string3);
		this.a = new GameProfile(uUID5, string4);
	}

	@Override
	public void b(et et) throws IOException {
		UUID uUID3 = this.a.getId();
		et.a(uUID3 == null ? "" : uUID3.toString());
		et.a(this.a.getName());
	}

	public void a(js js) {
		js.a(this);
	}

	public GameProfile a() {
		return this.a;
	}
}

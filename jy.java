import com.mojang.authlib.GameProfile;
import java.io.IOException;

public class jy implements fm<jx> {
	private GameProfile a;

	public jy() {
	}

	public jy(GameProfile gameProfile) {
		this.a = gameProfile;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = new GameProfile(null, et.e(16));
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a.getName());
	}

	public void a(jx jx) {
		jx.a(this);
	}

	public GameProfile a() {
		return this.a;
	}
}

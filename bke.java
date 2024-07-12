import com.mojang.authlib.GameProfile;

public class bke implements bki {
	private final GameProfile a;
	private final kq b;

	public bke(GameProfile gameProfile) {
		this.a = gameProfile;
		this.b = bpp.e(gameProfile.getName());
		bpp.a(this.b, gameProfile.getName());
	}

	@Override
	public void a(bkg bkg) {
		bes.z().v().a(new jl(this.a.getId()));
	}

	@Override
	public fb I_() {
		return new fh(this.a.getName());
	}

	@Override
	public void a(float float1, int integer) {
		bes.z().N().a(this.b);
		bqg.c(1.0F, 1.0F, 1.0F, (float)integer / 255.0F);
		bfi.a(2, 2, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
		bfi.a(2, 2, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
	}

	@Override
	public boolean J_() {
		return true;
	}
}

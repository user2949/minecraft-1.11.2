import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class bpp extends aay {
	private bnr d;
	public float a;
	public float b;
	public float c;

	public bpp(ajs ajs, GameProfile gameProfile) {
		super(ajs, gameProfile);
	}

	@Override
	public boolean y() {
		bnr bnr2 = bes.z().v().a(this.cS().getId());
		return bnr2 != null && bnr2.b() == ajq.SPECTATOR;
	}

	@Override
	public boolean z() {
		bnr bnr2 = bes.z().v().a(this.cS().getId());
		return bnr2 != null && bnr2.b() == ajq.CREATIVE;
	}

	public boolean a() {
		return this.b() != null;
	}

	@Nullable
	protected bnr b() {
		if (this.d == null) {
			this.d = bes.z().v().a(this.be());
		}

		return this.d;
	}

	public boolean h() {
		bnr bnr2 = this.b();
		return bnr2 != null && bnr2.e();
	}

	public kq m() {
		bnr bnr2 = this.b();
		return bnr2 == null ? bzo.a(this.be()) : bnr2.g();
	}

	@Nullable
	public kq o() {
		bnr bnr2 = this.b();
		return bnr2 == null ? null : bnr2.h();
	}

	@Override
	public boolean r() {
		return this.b() != null;
	}

	@Nullable
	public kq s() {
		bnr bnr2 = this.b();
		return bnr2 == null ? null : bnr2.i();
	}

	public static byq a(kq kq, String string) {
		bza bza3 = bes.z().N();
		bzb bzb4 = bza3.b(kq);
		if (bzb4 == null) {
			bzb4 = new byq(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", oy.a(string)), bzo.a(d(string)), new bqn());
			bza3.a(kq, bzb4);
		}

		return (byq)bzb4;
	}

	public static kq e(String string) {
		return new kq("skins/" + oy.a(string));
	}

	public String t() {
		bnr bnr2 = this.b();
		return bnr2 == null ? bzo.b(this.be()) : bnr2.f();
	}

	public float u() {
		float float2 = 1.0F;
		if (this.bK.b) {
			float2 *= 1.1F;
		}

		tk tk3 = this.a(aad.d);
		float2 = (float)((double)float2 * ((tk3.e() / (double)this.bK.b() + 1.0) / 2.0));
		if (this.bK.b() == 0.0F || Float.isNaN(float2) || Float.isInfinite(float2)) {
			float2 = 1.0F;
		}

		if (this.cy() && this.cB().c() == afl.g) {
			int integer4 = this.cD();
			float float5 = (float)integer4 / 20.0F;
			if (float5 > 1.0F) {
				float5 = 1.0F;
			} else {
				float5 *= float5;
			}

			float2 *= 1.0F - float5 * 0.15F;
		}

		return float2;
	}
}

import com.mojang.authlib.GameProfile;

public class bpt extends bpp {
	private int d;
	private double e;
	private double f;
	private double g;
	private double h;
	private double bR;

	public bpt(ajs ajs, GameProfile gameProfile) {
		super(ajs, gameProfile);
		this.P = 0.0F;
		this.Q = true;
		this.cm = 0.25F;
	}

	@Override
	public boolean a(double double1) {
		double double4 = this.bo().a() * 10.0;
		if (Double.isNaN(double4)) {
			double4 = 1.0;
		}

		double4 *= 64.0 * bh();
		return double1 < double4 * double4;
	}

	@Override
	public boolean a(ry ry, float float2) {
		return true;
	}

	@Override
	public void a(double double1, double double2, double double3, float float4, float float5, int integer, boolean boolean7) {
		this.e = double1;
		this.f = double2;
		this.g = double3;
		this.h = (double)float4;
		this.bR = (double)float5;
		this.d = integer;
	}

	@Override
	public void A_() {
		this.cm = 0.0F;
		super.A_();
		this.aF = this.aG;
		double double2 = this.p - this.m;
		double double4 = this.r - this.o;
		float float6 = ot.a(double2 * double2 + double4 * double4) * 4.0F;
		if (float6 > 1.0F) {
			float6 = 1.0F;
		}

		this.aG = this.aG + (float6 - this.aG) * 0.4F;
		this.aH = this.aH + this.aG;
	}

	@Override
	public void n() {
		if (this.d > 0) {
			double double2 = this.p + (this.e - this.p) / (double)this.d;
			double double4 = this.q + (this.f - this.q) / (double)this.d;
			double double6 = this.r + (this.g - this.r) / (double)this.d;
			double double8 = this.h - (double)this.v;

			while (double8 < -180.0) {
				double8 += 360.0;
			}

			while (double8 >= 180.0) {
				double8 -= 360.0;
			}

			this.v = (float)((double)this.v + double8 / (double)this.d);
			this.w = (float)((double)this.w + (this.bR - (double)this.w) / (double)this.d);
			this.d--;
			this.b(double2, double4, double6);
			this.b(this.v, this.w);
		}

		this.bx = this.by;
		this.cd();
		float float2 = ot.a(this.s * this.s + this.u * this.u);
		float float3 = (float)Math.atan(-this.t * 0.2F) * 15.0F;
		if (float2 > 0.1F) {
			float2 = 0.1F;
		}

		if (!this.z || this.bU() <= 0.0F) {
			float2 = 0.0F;
		}

		if (this.z || this.bU() <= 0.0F) {
			float3 = 0.0F;
		}

		this.by = this.by + (float2 - this.by) * 0.4F;
		this.aK = this.aK + (float3 - this.aK) * 0.8F;
		this.l.C.a("push");
		this.ct();
		this.l.C.b();
	}

	@Override
	public void a(fb fb) {
		bes.z().r.d().a(fb);
	}

	@Override
	public boolean a(int integer, String string) {
		return false;
	}

	@Override
	public co c() {
		return new co(this.p + 0.5, this.q + 0.5, this.r + 0.5);
	}
}

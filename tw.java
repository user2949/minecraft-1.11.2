public class tw {
	protected final sx a;
	protected double b;
	protected double c;
	protected double d;
	protected double e;
	protected float f;
	protected float g;
	public tw.a h = tw.a.WAIT;

	public tw(sx sx) {
		this.a = sx;
	}

	public boolean a() {
		return this.h == tw.a.MOVE_TO;
	}

	public double b() {
		return this.e;
	}

	public void a(double double1, double double2, double double3, double double4) {
		this.b = double1;
		this.c = double2;
		this.d = double3;
		this.e = double4;
		this.h = tw.a.MOVE_TO;
	}

	public void a(float float1, float float2) {
		this.h = tw.a.STRAFE;
		this.f = float1;
		this.g = float2;
		this.e = 0.25;
	}

	public void a(tw tw) {
		this.h = tw.h;
		this.b = tw.b;
		this.c = tw.c;
		this.d = tw.d;
		this.e = Math.max(tw.e, 1.0);
		this.f = tw.f;
		this.g = tw.g;
	}

	public void c() {
		if (this.h == tw.a.STRAFE) {
			float float2 = (float)this.a.a(aad.d).e();
			float float3 = (float)this.e * float2;
			float float4 = this.f;
			float float5 = this.g;
			float float6 = ot.c(float4 * float4 + float5 * float5);
			if (float6 < 1.0F) {
				float6 = 1.0F;
			}

			float6 = float3 / float6;
			float4 *= float6;
			float5 *= float6;
			float float7 = ot.a(this.a.v * (float) (Math.PI / 180.0));
			float float8 = ot.b(this.a.v * (float) (Math.PI / 180.0));
			float float9 = float4 * float8 - float5 * float7;
			float float10 = float5 * float8 + float4 * float7;
			wf wf11 = this.a.x();
			if (wf11 != null) {
				bbc bbc12 = wf11.q();
				if (bbc12 != null && bbc12.a(this.a.l, ot.c(this.a.p + (double)float9), ot.c(this.a.q), ot.c(this.a.r + (double)float10)) != bba.WALKABLE) {
					this.f = 1.0F;
					this.g = 0.0F;
					float3 = float2;
				}
			}

			this.a.l(float3);
			this.a.o(this.f);
			this.a.p(this.g);
			this.h = tw.a.WAIT;
		} else if (this.h == tw.a.MOVE_TO) {
			this.h = tw.a.WAIT;
			double double2 = this.b - this.a.p;
			double double4 = this.d - this.a.r;
			double double6 = this.c - this.a.q;
			double double8 = double2 * double2 + double6 * double6 + double4 * double4;
			if (double8 < 2.5000003E-7F) {
				this.a.o(0.0F);
				return;
			}

			float float10 = (float)(ot.c(double4, double2) * 180.0F / (float)Math.PI) - 90.0F;
			this.a.v = this.a(this.a.v, float10, 90.0F);
			this.a.l((float)(this.e * this.a.a(aad.d).e()));
			if (double6 > (double)this.a.P && double2 * double2 + double4 * double4 < (double)Math.max(1.0F, this.a.G)) {
				this.a.w().a();
				this.h = tw.a.JUMPING;
			}
		} else if (this.h == tw.a.JUMPING) {
			this.a.l((float)(this.e * this.a.a(aad.d).e()));
			if (this.a.z) {
				this.h = tw.a.WAIT;
			}
		} else {
			this.a.o(0.0F);
		}
	}

	protected float a(float float1, float float2, float float3) {
		float float5 = ot.g(float2 - float1);
		if (float5 > float3) {
			float5 = float3;
		}

		if (float5 < -float3) {
			float5 = -float3;
		}

		float float6 = float1 + float5;
		if (float6 < 0.0F) {
			float6 += 360.0F;
		} else if (float6 > 360.0F) {
			float6 -= 360.0F;
		}

		return float6;
	}

	public double d() {
		return this.b;
	}

	public double e() {
		return this.c;
	}

	public double f() {
		return this.d;
	}

	public static enum a {
		WAIT,
		MOVE_TO,
		STRAFE,
		JUMPING;
	}
}

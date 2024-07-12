public class abe extends sn {
	private double a;
	private double b;
	private double c;
	private int d;
	private boolean e;

	public abe(ajs ajs) {
		super(ajs);
		this.a(0.25F, 0.25F);
	}

	@Override
	protected void i() {
	}

	@Override
	public boolean a(double double1) {
		double double4 = this.bo().a() * 4.0;
		if (Double.isNaN(double4)) {
			double4 = 4.0;
		}

		double4 *= 64.0;
		return double1 < double4 * double4;
	}

	public abe(ajs ajs, double double2, double double3, double double4) {
		super(ajs);
		this.d = 0;
		this.a(0.25F, 0.25F);
		this.b(double2, double3, double4);
	}

	public void a(co co) {
		double double3 = (double)co.p();
		int integer5 = co.q();
		double double6 = (double)co.r();
		double double8 = double3 - this.p;
		double double10 = double6 - this.r;
		float float12 = ot.a(double8 * double8 + double10 * double10);
		if (float12 > 12.0F) {
			this.a = this.p + double8 / (double)float12 * 12.0;
			this.c = this.r + double10 / (double)float12 * 12.0;
			this.b = this.q + 8.0;
		} else {
			this.a = double3;
			this.b = (double)integer5;
			this.c = double6;
		}

		this.d = 0;
		this.e = this.S.nextInt(5) > 0;
	}

	@Override
	public void h(double double1, double double2, double double3) {
		this.s = double1;
		this.t = double2;
		this.u = double3;
		if (this.y == 0.0F && this.x == 0.0F) {
			float float8 = ot.a(double1 * double1 + double3 * double3);
			this.v = (float)(ot.c(double1, double3) * 180.0F / (float)Math.PI);
			this.w = (float)(ot.c(double2, (double)float8) * 180.0F / (float)Math.PI);
			this.x = this.v;
			this.y = this.w;
		}
	}

	@Override
	public void A_() {
		this.M = this.p;
		this.N = this.q;
		this.O = this.r;
		super.A_();
		this.p = this.p + this.s;
		this.q = this.q + this.t;
		this.r = this.r + this.u;
		float float2 = ot.a(this.s * this.s + this.u * this.u);
		this.v = (float)(ot.c(this.s, this.u) * 180.0F / (float)Math.PI);
		this.w = (float)(ot.c(this.t, (double)float2) * 180.0F / (float)Math.PI);

		while (this.w - this.y < -180.0F) {
			this.y -= 360.0F;
		}

		while (this.w - this.y >= 180.0F) {
			this.y += 360.0F;
		}

		while (this.v - this.x < -180.0F) {
			this.x -= 360.0F;
		}

		while (this.v - this.x >= 180.0F) {
			this.x += 360.0F;
		}

		this.w = this.y + (this.w - this.y) * 0.2F;
		this.v = this.x + (this.v - this.x) * 0.2F;
		if (!this.l.E) {
			double double3 = this.a - this.p;
			double double5 = this.c - this.r;
			float float7 = (float)Math.sqrt(double3 * double3 + double5 * double5);
			float float8 = (float)ot.c(double5, double3);
			double double9 = (double)float2 + (double)(float7 - float2) * 0.0025;
			if (float7 < 1.0F) {
				double9 *= 0.8;
				this.t *= 0.8;
			}

			this.s = Math.cos((double)float8) * double9;
			this.u = Math.sin((double)float8) * double9;
			if (this.q < this.b) {
				this.t = this.t + (1.0 - this.t) * 0.015F;
			} else {
				this.t = this.t + (-1.0 - this.t) * 0.015F;
			}
		}

		float float3 = 0.25F;
		if (this.aj()) {
			for (int integer4 = 0; integer4 < 4; integer4++) {
				this.l.a(de.WATER_BUBBLE, this.p - this.s * 0.25, this.q - this.t * 0.25, this.r - this.u * 0.25, this.s, this.t, this.u);
			}
		} else {
			this.l
				.a(
					de.PORTAL,
					this.p - this.s * 0.25 + this.S.nextDouble() * 0.6 - 0.3,
					this.q - this.t * 0.25 - 0.5,
					this.r - this.u * 0.25 + this.S.nextDouble() * 0.6 - 0.3,
					this.s,
					this.t,
					this.u
				);
		}

		if (!this.l.E) {
			this.b(this.p, this.q, this.r);
			this.d++;
			if (this.d > 80 && !this.l.E) {
				this.T();
				if (this.e) {
					this.l.a(new zj(this.l, this.p, this.q, this.r, new afj(afl.bS)));
				} else {
					this.l.b(2003, new co(this), 0);
				}
			}
		}
	}

	@Override
	public void b(du du) {
	}

	@Override
	public void a(du du) {
	}

	@Override
	public float e(float float1) {
		return 1.0F;
	}

	@Override
	public int d(float float1) {
		return 15728880;
	}

	@Override
	public boolean aV() {
		return false;
	}
}

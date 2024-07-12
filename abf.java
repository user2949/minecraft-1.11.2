public abstract class abf extends sn {
	public sw a;
	private int e;
	private int f;
	public double b;
	public double c;
	public double d;

	public abf(ajs ajs) {
		super(ajs);
		this.a(1.0F, 1.0F);
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

	public abf(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs);
		this.a(1.0F, 1.0F);
		this.b(double2, double3, double4, this.v, this.w);
		this.b(double2, double3, double4);
		double double15 = (double)ot.a(double5 * double5 + double6 * double6 + double7 * double7);
		this.b = double5 / double15 * 0.1;
		this.c = double6 / double15 * 0.1;
		this.d = double7 / double15 * 0.1;
	}

	public abf(ajs ajs, sw sw, double double3, double double4, double double5) {
		super(ajs);
		this.a = sw;
		this.a(1.0F, 1.0F);
		this.b(sw.p, sw.q, sw.r, sw.v, sw.w);
		this.b(this.p, this.q, this.r);
		this.s = 0.0;
		this.t = 0.0;
		this.u = 0.0;
		double3 += this.S.nextGaussian() * 0.4;
		double4 += this.S.nextGaussian() * 0.4;
		double5 += this.S.nextGaussian() * 0.4;
		double double10 = (double)ot.a(double3 * double3 + double4 * double4 + double5 * double5);
		this.b = double3 / double10 * 0.1;
		this.c = double4 / double10 * 0.1;
		this.d = double5 / double10 * 0.1;
	}

	@Override
	public void A_() {
		if (this.l.E || (this.a == null || !this.a.F) && this.l.e(new co(this))) {
			super.A_();
			if (this.k()) {
				this.i(1);
			}

			this.f++;
			bdu bdu2 = abk.a(this, true, this.f >= 25, this.a);
			if (bdu2 != null) {
				this.a(bdu2);
			}

			this.p = this.p + this.s;
			this.q = this.q + this.t;
			this.r = this.r + this.u;
			abk.a(this, 0.2F);
			float float3 = this.l();
			if (this.aj()) {
				for (int integer4 = 0; integer4 < 4; integer4++) {
					float float5 = 0.25F;
					this.l.a(de.WATER_BUBBLE, this.p - this.s * 0.25, this.q - this.t * 0.25, this.r - this.u * 0.25, this.s, this.t, this.u);
				}

				float3 = 0.8F;
			}

			this.s = this.s + this.b;
			this.t = this.t + this.c;
			this.u = this.u + this.d;
			this.s *= (double)float3;
			this.t *= (double)float3;
			this.u *= (double)float3;
			this.l.a(this.j(), this.p, this.q + 0.5, this.r, 0.0, 0.0, 0.0);
			this.b(this.p, this.q, this.r);
		} else {
			this.T();
		}
	}

	protected boolean k() {
		return true;
	}

	protected de j() {
		return de.SMOKE_NORMAL;
	}

	protected float l() {
		return 0.95F;
	}

	protected abstract void a(bdu bdu);

	public static void a(ph ph, String string) {
	}

	@Override
	public void b(du du) {
		du.a("direction", this.a(new double[]{this.s, this.t, this.u}));
		du.a("power", this.a(new double[]{this.b, this.c, this.d}));
		du.a("life", this.e);
	}

	@Override
	public void a(du du) {
		if (du.b("power", 9)) {
			ea ea3 = du.c("power", 6);
			if (ea3.c() == 3) {
				this.b = ea3.e(0);
				this.c = ea3.e(1);
				this.d = ea3.e(2);
			}
		}

		this.e = du.h("life");
		if (du.b("direction", 9) && du.c("direction", 6).c() == 3) {
			ea ea3 = du.c("direction", 6);
			this.s = ea3.e(0);
			this.t = ea3.e(1);
			this.u = ea3.e(2);
		} else {
			this.T();
		}
	}

	@Override
	public boolean aq() {
		return true;
	}

	@Override
	public float aA() {
		return 1.0F;
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			this.ap();
			if (ry.j() != null) {
				bdw bdw4 = ry.j().aB();
				if (bdw4 != null) {
					this.s = bdw4.b;
					this.t = bdw4.c;
					this.u = bdw4.d;
					this.b = this.s * 0.1;
					this.c = this.t * 0.1;
					this.d = this.u * 0.1;
				}

				if (ry.j() instanceof sw) {
					this.a = (sw)ry.j();
				}

				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public float e(float float1) {
		return 1.0F;
	}

	@Override
	public int d(float float1) {
		return 15728880;
	}
}

public class acc extends aby {
	private static final kk<Boolean> c = kn.a(acc.class, km.h);
	private int d;
	public double a;
	public double b;

	public acc(ajs ajs) {
		super(ajs);
	}

	public acc(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	public static void a(ph ph) {
		aby.a(ph, acc.class);
	}

	@Override
	public aby.a v() {
		return aby.a.FURNACE;
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(c, false);
	}

	@Override
	public void A_() {
		super.A_();
		if (this.d > 0) {
			this.d--;
		}

		if (this.d <= 0) {
			this.a = 0.0;
			this.b = 0.0;
		}

		this.l(this.d > 0);
		if (this.j() && this.S.nextInt(4) == 0) {
			this.l.a(de.SMOKE_LARGE, this.p, this.q + 0.8, this.r, 0.0, 0.0, 0.0);
		}
	}

	@Override
	protected double o() {
		return 0.2;
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (!ry.c() && this.l.U().b("doEntityDrops")) {
			this.a(new afj(alv.al, 1), 0.0F);
		}
	}

	@Override
	protected void a(co co, atl atl) {
		super.a(co, atl);
		double double4 = this.a * this.a + this.b * this.b;
		if (double4 > 1.0E-4 && this.s * this.s + this.u * this.u > 0.001) {
			double4 = (double)ot.a(double4);
			this.a /= double4;
			this.b /= double4;
			if (this.a * this.s + this.b * this.u < 0.0) {
				this.a = 0.0;
				this.b = 0.0;
			} else {
				double double6 = double4 / this.o();
				this.a *= double6;
				this.b *= double6;
			}
		}
	}

	@Override
	protected void r() {
		double double2 = this.a * this.a + this.b * this.b;
		if (double2 > 1.0E-4) {
			double2 = (double)ot.a(double2);
			this.a /= double2;
			this.b /= double2;
			double double4 = 1.0;
			this.s *= 0.8F;
			this.t *= 0.0;
			this.u *= 0.8F;
			this.s = this.s + this.a * 1.0;
			this.u = this.u + this.b * 1.0;
		} else {
			this.s *= 0.98F;
			this.t *= 0.0;
			this.u *= 0.98F;
		}

		super.r();
	}

	@Override
	public boolean b(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (afj4.c() == afl.k && this.d + 3600 <= 32000) {
			if (!aay.bK.d) {
				afj4.g(1);
			}

			this.d += 3600;
		}

		this.a = this.p - aay.p;
		this.b = this.r - aay.r;
		return true;
	}

	@Override
	protected void b(du du) {
		super.b(du);
		du.a("PushX", this.a);
		du.a("PushZ", this.b);
		du.a("Fuel", (short)this.d);
	}

	@Override
	protected void a(du du) {
		super.a(du);
		this.a = du.k("PushX");
		this.b = du.k("PushZ");
		this.d = du.g("Fuel");
	}

	protected boolean j() {
		return this.Y.a(c);
	}

	protected void l(boolean boolean1) {
		this.Y.b(c, boolean1);
	}

	@Override
	public atl x() {
		return (this.j() ? alv.am : alv.al).t().a(anu.a, cv.NORTH);
	}
}

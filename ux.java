public class ux extends ui {
	ajs a;
	sx b;
	sw c;
	int d;

	public ux(sx sx) {
		this.b = sx;
		this.a = sx.l;
		this.a(3);
	}

	@Override
	public boolean a() {
		sw sw2 = this.b.z();
		if (sw2 == null) {
			return false;
		} else {
			this.c = sw2;
			return true;
		}
	}

	@Override
	public boolean b() {
		if (!this.c.au()) {
			return false;
		} else {
			return this.b.h(this.c) > 225.0 ? false : !this.b.x().n() || this.a();
		}
	}

	@Override
	public void d() {
		this.c = null;
		this.b.x().o();
	}

	@Override
	public void e() {
		this.b.t().a(this.c, 30.0F, 30.0F);
		double double2 = (double)(this.b.G * 2.0F * this.b.G * 2.0F);
		double double4 = this.b.d(this.c.p, this.c.bo().b, this.c.r);
		double double6 = 0.8;
		if (double4 > double2 && double4 < 16.0) {
			double6 = 1.33;
		} else if (double4 < 225.0) {
			double6 = 0.6;
		}

		this.b.x().a(this.c, double6);
		this.d = Math.max(this.d - 1, 0);
		if (!(double4 > double2)) {
			if (this.d <= 0) {
				this.d = 20;
				this.b.B(this.c);
			}
		}
	}
}

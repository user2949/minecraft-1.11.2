public class ur extends ui {
	ajs a;
	protected te b;
	protected int c;
	double d;
	boolean e;
	bbd f;
	private int h;
	private double i;
	private double j;
	private double k;
	protected final int g = 20;

	public ur(te te, double double2, boolean boolean3) {
		this.b = te;
		this.a = te.l;
		this.d = double2;
		this.e = boolean3;
		this.a(3);
	}

	@Override
	public boolean a() {
		sw sw2 = this.b.z();
		if (sw2 == null) {
			return false;
		} else if (!sw2.au()) {
			return false;
		} else {
			this.f = this.b.x().a(sw2);
			return this.f != null ? true : this.a(sw2) >= this.b.d(sw2.p, sw2.bo().b, sw2.r);
		}
	}

	@Override
	public boolean b() {
		sw sw2 = this.b.z();
		if (sw2 == null) {
			return false;
		} else if (!sw2.au()) {
			return false;
		} else if (!this.e) {
			return !this.b.x().n();
		} else {
			return !this.b.f(new co(sw2)) ? false : !(sw2 instanceof aay) || !((aay)sw2).y() && !((aay)sw2).z();
		}
	}

	@Override
	public void c() {
		this.b.x().a(this.f, this.d);
		this.h = 0;
	}

	@Override
	public void d() {
		sw sw2 = this.b.z();
		if (sw2 instanceof aay && (((aay)sw2).y() || ((aay)sw2).z())) {
			this.b.d(null);
		}

		this.b.x().o();
	}

	@Override
	public void e() {
		sw sw2 = this.b.z();
		this.b.t().a(sw2, 30.0F, 30.0F);
		double double3 = this.b.d(sw2.p, sw2.bo().b, sw2.r);
		this.h--;
		if ((this.e || this.b.y().a(sw2))
			&& this.h <= 0
			&& (this.i == 0.0 && this.j == 0.0 && this.k == 0.0 || sw2.d(this.i, this.j, this.k) >= 1.0 || this.b.bJ().nextFloat() < 0.05F)) {
			this.i = sw2.p;
			this.j = sw2.bo().b;
			this.k = sw2.r;
			this.h = 4 + this.b.bJ().nextInt(7);
			if (double3 > 1024.0) {
				this.h += 10;
			} else if (double3 > 256.0) {
				this.h += 5;
			}

			if (!this.b.x().a(sw2, this.d)) {
				this.h += 15;
			}
		}

		this.c = Math.max(this.c - 1, 0);
		this.a(sw2, double3);
	}

	protected void a(sw sw, double double2) {
		double double5 = this.a(sw);
		if (double2 <= double5 && this.c <= 0) {
			this.c = 20;
			this.b.a(ri.MAIN_HAND);
			this.b.B(sw);
		}
	}

	protected double a(sw sw) {
		return (double)(this.b.G * 2.0F * this.b.G * 2.0F + sw.G);
	}
}

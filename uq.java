public class uq extends ui {
	private final aat b;
	private aat c;
	private final ajs d;
	private int e;
	wp a;

	public uq(aat aat) {
		this.b = aat;
		this.d = aat.l;
		this.a(3);
	}

	@Override
	public boolean a() {
		if (this.b.l() != 0) {
			return false;
		} else if (this.b.bJ().nextInt(500) != 0) {
			return false;
		} else {
			this.a = this.d.ai().a(new co(this.b), 0);
			if (this.a == null) {
				return false;
			} else if (this.f() && this.b.r(true)) {
				sn sn2 = this.d.a(aat.class, this.b.bo().c(8.0, 3.0, 8.0), this.b);
				if (sn2 == null) {
					return false;
				} else {
					this.c = (aat)sn2;
					return this.c.l() == 0 && this.c.r(true);
				}
			} else {
				return false;
			}
		}
	}

	@Override
	public void c() {
		this.e = 300;
		this.b.p(true);
	}

	@Override
	public void d() {
		this.a = null;
		this.c = null;
		this.b.p(false);
	}

	@Override
	public boolean b() {
		return this.e >= 0 && this.f() && this.b.l() == 0 && this.b.r(false);
	}

	@Override
	public void e() {
		this.e--;
		this.b.t().a(this.c, 10.0F, 30.0F);
		if (this.b.h(this.c) > 2.25) {
			this.b.x().a(this.c, 0.25);
		} else if (this.e == 0 && this.c.di()) {
			this.i();
		}

		if (this.b.bJ().nextInt(35) == 0) {
			this.d.a(this.b, (byte)12);
		}
	}

	private boolean f() {
		if (!this.a.i()) {
			return false;
		} else {
			int integer2 = (int)((double)((float)this.a.c()) * 0.35);
			return this.a.e() < integer2;
		}
	}

	private void i() {
		aat aat2 = this.b.b(this.c);
		this.c.b_(6000);
		this.b.b_(6000);
		this.c.s(false);
		this.b.s(false);
		aat2.b_(-24000);
		aat2.b(this.b.p, this.b.q, this.b.r, 0.0F, 0.0F);
		this.d.a(aat2);
		this.d.a(aat2, (byte)12);
	}
}

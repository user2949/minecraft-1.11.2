public class xt extends ui {
	private final xs a;

	public xt(xs xs) {
		this.a = xs;
	}

	@Override
	public boolean a() {
		return this.a.l.a(this.a.p, this.a.q, this.a.r, 10.0);
	}

	@Override
	public void e() {
		rh rh2 = this.a.l.D(new co(this.a));
		this.a.p(false);
		this.a.q(true);
		this.a.b_(0);
		this.a.l.d(new zg(this.a.l, this.a.p, this.a.q, this.a.r, true));
		aag aag3 = this.a(rh2, this.a);
		aag3.m(this.a);

		for (int integer4 = 0; integer4 < 3; integer4++) {
			xm xm5 = this.a(rh2);
			aag aag6 = this.a(rh2, xm5);
			aag6.m(xm5);
			xm5.f(this.a.bJ().nextGaussian() * 0.5, 0.0, this.a.bJ().nextGaussian() * 0.5);
		}
	}

	private xm a(rh rh) {
		xs xs3 = new xs(this.a.l);
		xs3.a(rh, null);
		xs3.b(this.a.p, this.a.q, this.a.r);
		xs3.V = 60;
		xs3.cS();
		xs3.q(true);
		xs3.b_(0);
		xs3.l.a(xs3);
		return xs3;
	}

	private aag a(rh rh, xm xm) {
		aag aag4 = new aag(xm.l);
		aag4.a(rh, null);
		aag4.b(xm.p, xm.q, xm.r);
		aag4.V = 60;
		aag4.cS();
		if (aag4.b(ss.HEAD).b()) {
			aag4.a(ss.HEAD, new afj(afl.ab));
		}

		aag4.a(ss.MAINHAND, aik.a(aag4.bJ(), aag4.cg(), (int)(5.0F + rh.d() * (float)aag4.bJ().nextInt(18)), false));
		aag4.a(ss.HEAD, aik.a(aag4.bJ(), aag4.b(ss.HEAD), (int)(5.0F + rh.d() * (float)aag4.bJ().nextInt(18)), false));
		aag4.l.a(aag4);
		return aag4;
	}
}

public class arx extends alu {
	public static final atz<aem> a = atz.a("color", aem.class);
	protected static final bdt b = new bdt(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0);

	protected arx() {
		super(azs.r);
		this.y(this.A.b().a(a, aem.WHITE));
		this.a(true);
		this.a(aej.c);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return b;
	}

	@Override
	public azt r(atl atl) {
		return ((aem)atl.c(a)).e();
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return super.a(ajs, co) && this.b(ajs, co);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		this.e(ajs, co3, atl);
	}

	private boolean e(ajs ajs, co co, atl atl) {
		if (!this.b(ajs, co)) {
			this.b(ajs, co, atl, 0);
			ajs.g(co);
			return false;
		} else {
			return true;
		}
	}

	private boolean b(ajs ajs, co co) {
		return !ajs.d(co.b());
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		if (cv == cv.UP) {
			return true;
		} else {
			return ajw.o(co.a(cv)).v() == this ? true : super.a(atl, ajw, co, cv);
		}
	}

	@Override
	public int d(atl atl) {
		return ((aem)atl.c(a)).a();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (int integer5 = 0; integer5 < 16; integer5++) {
			dd.add(new afj(afh, 1, integer5));
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, aem.b(integer));
	}

	@Override
	public int e(atl atl) {
		return ((aem)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}
}

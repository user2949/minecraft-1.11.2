public class aqx extends arj {
	public static final atz<aem> a = atz.a("color", aem.class);

	public aqx() {
		super(azs.s, false);
		this.y(this.A.b().a(b, false).a(c, false).a(d, false).a(e, false).a(a, aem.WHITE));
		this.a(aej.c);
	}

	@Override
	public int d(atl atl) {
		return ((aem)atl.c(a)).a();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (int integer5 = 0; integer5 < aem.values().length; integer5++) {
			dd.add(new afj(afh, 1, integer5));
		}
	}

	@Override
	public azt r(atl atl) {
		return ((aem)atl.c(a)).e();
	}

	@Override
	public ajk f() {
		return ajk.TRANSLUCENT;
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
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case CLOCKWISE_180:
				return atl.a(b, atl.c(d)).a(c, atl.c(e)).a(d, atl.c(b)).a(e, atl.c(c));
			case COUNTERCLOCKWISE_90:
				return atl.a(b, atl.c(c)).a(c, atl.c(d)).a(d, atl.c(e)).a(e, atl.c(b));
			case CLOCKWISE_90:
				return atl.a(b, atl.c(e)).a(c, atl.c(b)).a(d, atl.c(c)).a(e, atl.c(d));
			default:
				return atl;
		}
	}

	@Override
	public atl a(atl atl, aou aou) {
		switch (aou) {
			case LEFT_RIGHT:
				return atl.a(b, atl.c(d)).a(d, atl.c(b));
			case FRONT_BACK:
				return atl.a(c, atl.c(e)).a(e, atl.c(c));
			default:
				return super.a(atl, aou);
		}
	}

	@Override
	protected atm b() {
		return new atm(this, b, c, e, d, a);
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			alr.c(ajs, co);
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			alr.c(ajs, co);
		}
	}
}

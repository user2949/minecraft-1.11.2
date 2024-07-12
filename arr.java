public class arr extends aqo {
	public static final aty b = aoi.D;
	protected static final bdt c = new bdt(0.0, 0.28125, 0.0, 0.125, 0.78125, 1.0);
	protected static final bdt d = new bdt(0.875, 0.28125, 0.0, 1.0, 0.78125, 1.0);
	protected static final bdt e = new bdt(0.0, 0.28125, 0.0, 1.0, 0.78125, 0.125);
	protected static final bdt f = new bdt(0.0, 0.28125, 0.875, 1.0, 0.78125, 1.0);

	public arr() {
		this.y(this.A.b().a(b, cv.NORTH));
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		switch ((cv)atl.c(b)) {
			case NORTH:
			default:
				return f;
			case SOUTH:
				return e;
			case WEST:
				return d;
			case EAST:
				return c;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		cv cv7 = atl.c(b);
		if (!ajs.o(co3.a(cv7.d())).a().a()) {
			this.b(ajs, co3, atl, 0);
			ajs.g(co3);
		}

		super.a(atl, ajs, co3, alu, co5);
	}

	@Override
	public atl a(int integer) {
		cv cv3 = cv.a(integer);
		if (cv3.k() == cv.a.Y) {
			cv3 = cv.NORTH;
		}

		return this.t().a(b, cv3);
	}

	@Override
	public int e(atl atl) {
		return ((cv)atl.c(b)).a();
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(b, aqi.a(atl.c(b)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(b)));
	}

	@Override
	protected atm b() {
		return new atm(this, b);
	}
}

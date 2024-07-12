public class aom extends alu {
	public static final aty a = aoi.D;
	protected static final bdt b = new bdt(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);
	protected static final bdt c = new bdt(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt d = new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
	protected static final bdt e = new bdt(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);

	protected aom() {
		super(azs.q);
		this.y(this.A.b().a(a, cv.NORTH));
		this.a(aej.c);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		switch ((cv)atl.c(a)) {
			case NORTH:
				return e;
			case SOUTH:
				return d;
			case WEST:
				return c;
			case EAST:
			default:
				return b;
		}
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
		if (ajs.o(co.e()).m()) {
			return true;
		} else if (ajs.o(co.f()).m()) {
			return true;
		} else {
			return ajs.o(co.c()).m() ? true : ajs.o(co.d()).m();
		}
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		if (cv.k().c() && this.a(ajs, co, cv)) {
			return this.t().a(a, cv);
		} else {
			for (cv cv11 : cv.c.HORIZONTAL) {
				if (this.a(ajs, co, cv11)) {
					return this.t().a(a, cv11);
				}
			}

			return this.t();
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		cv cv7 = atl.c(a);
		if (!this.a(ajs, co3, cv7)) {
			this.b(ajs, co3, atl, 0);
			ajs.g(co3);
		}

		super.a(atl, ajs, co3, alu, co5);
	}

	protected boolean a(ajs ajs, co co, cv cv) {
		return ajs.o(co.a(cv.d())).m();
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		cv cv3 = cv.a(integer);
		if (cv3.k() == cv.a.Y) {
			cv3 = cv.NORTH;
		}

		return this.t().a(a, cv3);
	}

	@Override
	public int e(atl atl) {
		return ((cv)atl.c(a)).a();
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(a)));
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}
}

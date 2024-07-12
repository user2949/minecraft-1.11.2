public class aqz extends aqo {
	public static final aua b = aua.a("rotation", 0, 15);

	public aqz() {
		this.y(this.A.b().a(b, 0));
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.o(co3.b()).a().a()) {
			this.b(ajs, co3, atl, 0);
			ajs.g(co3);
		}

		super.a(atl, ajs, co3, alu, co5);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(b, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(b);
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(b, aqi.a((Integer)atl.c(b), 16));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(b, aou.a((Integer)atl.c(b), 16));
	}

	@Override
	protected atm b() {
		return new atm(this, b);
	}
}

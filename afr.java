public class afr extends afh {
	private static final cw a = new cs() {
		private final cs b = new cs();

		@Override
		public afj b(cp cp, afj afj) {
			cv cv4 = cp.e().c(amw.a);
			ajs ajs5 = cp.h();
			double double6 = cp.a() + (double)cv4.g() * 1.125;
			double double8 = Math.floor(cp.b()) + (double)cv4.h();
			double double10 = cp.c() + (double)cv4.i() * 1.125;
			co co12 = cp.d().a(cv4);
			atl atl13 = ajs5.o(co12);
			alq.b b14 = atl13.v() instanceof alq ? atl13.c(((alq)atl13.v()).g()) : alq.b.NORTH_SOUTH;
			double double15;
			if (alq.i(atl13)) {
				if (b14.c()) {
					double15 = 0.6;
				} else {
					double15 = 0.1;
				}
			} else {
				if (atl13.a() != azs.a || !alq.i(ajs5.o(co12.b()))) {
					return this.b.a(cp, afj);
				}

				atl atl17 = ajs5.o(co12.b());
				alq.b b18 = atl17.v() instanceof alq ? atl17.c(((alq)atl17.v()).g()) : alq.b.NORTH_SOUTH;
				if (cv4 != cv.DOWN && b18.c()) {
					double15 = -0.4;
				} else {
					double15 = -0.9;
				}
			}

			aby aby17 = aby.a(ajs5, double6, double8 + double15, double10, ((afr)afj.c()).b);
			if (afj.t()) {
				aby17.c(afj.r());
			}

			ajs5.a(aby17);
			afj.g(1);
			return afj;
		}

		@Override
		protected void a(cp cp) {
			cp.h().b(1000, cp.d(), 0);
		}
	};
	private final aby.a b;

	public afr(aby.a a) {
		this.k = 1;
		this.b = a;
		this.a(aej.e);
		amw.c.a(this, afr.a);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		atl atl10 = ajs.o(co);
		if (!alq.i(atl10)) {
			return rk.FAIL;
		} else {
			afj afj11 = aay.b(ri);
			if (!ajs.E) {
				alq.b b12 = atl10.v() instanceof alq ? atl10.c(((alq)atl10.v()).g()) : alq.b.NORTH_SOUTH;
				double double13 = 0.0;
				if (b12.c()) {
					double13 = 0.5;
				}

				aby aby15 = aby.a(ajs, (double)co.p() + 0.5, (double)co.q() + 0.0625 + double13, (double)co.r() + 0.5, this.b);
				if (afj11.t()) {
					aby15.c(afj11.r());
				}

				ajs.a(aby15);
			}

			afj11.g(1);
			return rk.SUCCESS;
		}
	}
}

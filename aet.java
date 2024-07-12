import java.util.List;

public class aet extends afh {
	public aet() {
		this.c("end_crystal");
		this.a(aej.c);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		atl atl10 = ajs.o(co);
		if (atl10.v() != alv.Z && atl10.v() != alv.h) {
			return rk.FAIL;
		} else {
			co co11 = co.a();
			afj afj12 = aay.b(ri);
			if (!aay.a(co11, cv, afj12)) {
				return rk.FAIL;
			} else {
				co co13 = co11.a();
				boolean boolean14 = !ajs.d(co11) && !ajs.o(co11).v().a((ajw)ajs, co11);
				boolean14 |= !ajs.d(co13) && !ajs.o(co13).v().a((ajw)ajs, co13);
				if (boolean14) {
					return rk.FAIL;
				} else {
					double double15 = (double)co11.p();
					double double17 = (double)co11.q();
					double double19 = (double)co11.r();
					List<sn> list21 = ajs.b(null, new bdt(double15, double17, double19, double15 + 1.0, double17 + 2.0, double19 + 1.0));
					if (!list21.isEmpty()) {
						return rk.FAIL;
					} else {
						if (!ajs.E) {
							ya ya22 = new ya(ajs, (double)((float)co.p() + 0.5F), (double)(co.q() + 1), (double)((float)co.r() + 0.5F));
							ya22.a(false);
							ajs.a(ya22);
							if (ajs.s instanceof avl) {
								avk avk23 = ((avl)ajs.s).t();
								avk23.e();
							}
						}

						afj12.g(1);
						return rk.SUCCESS;
					}
				}
			}
		}
	}

	@Override
	public boolean f_(afj afj) {
		return true;
	}
}

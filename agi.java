public class agi extends afh {
	public agi() {
		this.k = 16;
		this.a(aej.c);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		atl atl10 = ajs.o(co);
		boolean boolean11 = atl10.v().a((ajw)ajs, co);
		if (cv != cv.DOWN && (atl10.a().a() || boolean11) && (!boolean11 || cv == cv.UP)) {
			co = co.a(cv);
			afj afj12 = aay.b(ri);
			if (!aay.a(co, cv, afj12) || !alv.an.a(ajs, co)) {
				return rk.FAIL;
			} else if (ajs.E) {
				return rk.SUCCESS;
			} else {
				co = boolean11 ? co.b() : co;
				if (cv == cv.UP) {
					int integer13 = ot.c((double)((aay.v + 180.0F) * 16.0F / 360.0F) + 0.5) & 15;
					ajs.a(co, alv.an.t().a(aqz.b, integer13), 11);
				} else {
					ajs.a(co, alv.ax.t().a(arr.b, cv), 11);
				}

				asc asc13 = ajs.r(co);
				if (asc13 instanceof asv && !adv.a(ajs, aay, co, afj12)) {
					aay.a((asv)asc13);
				}

				afj12.g(1);
				return rk.SUCCESS;
			}
		} else {
			return rk.FAIL;
		}
	}
}

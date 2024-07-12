public class adu extends afh {
	public adu() {
		this.a(aej.c);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		if (ajs.E) {
			return rk.SUCCESS;
		} else if (cv != cv.UP) {
			return rk.FAIL;
		} else {
			atl atl10 = ajs.o(co);
			alu alu11 = atl10.v();
			boolean boolean12 = alu11.a((ajw)ajs, co);
			if (!boolean12) {
				co = co.a();
			}

			int integer13 = ot.c((double)(aay.v * 4.0F / 360.0F) + 0.5) & 3;
			cv cv14 = cv.b(integer13);
			co co15 = co.a(cv14);
			afj afj16 = aay.b(ri);
			if (aay.a(co, cv, afj16) && aay.a(co15, cv, afj16)) {
				atl atl17 = ajs.o(co15);
				boolean boolean18 = atl17.v().a((ajw)ajs, co15);
				boolean boolean19 = boolean12 || ajs.d(co);
				boolean boolean20 = boolean18 || ajs.d(co15);
				if (boolean19 && boolean20 && ajs.o(co.b()).r() && ajs.o(co15.b()).r()) {
					atl atl21 = alv.C.t().a(als.b, false).a(als.D, cv14).a(als.a, als.a.FOOT);
					ajs.a(co, atl21, 10);
					ajs.a(co15, atl21.a(als.a, als.a.HEAD), 10);
					ajs.a(co, alu11, false);
					ajs.a(co15, atl17.v(), false);
					aqu aqu22 = atl21.v().v();
					ajs.a(null, co, aqu22.e(), no.BLOCKS, (aqu22.a() + 1.0F) / 2.0F, aqu22.b() * 0.8F);
					afj16.g(1);
					return rk.SUCCESS;
				} else {
					return rk.FAIL;
				}
			} else {
				return rk.FAIL;
			}
		}
	}
}

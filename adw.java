public class adw extends afh {
	private final alu a;

	public adw(alu alu) {
		this.a = alu;
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		atl atl10 = ajs.o(co);
		alu alu11 = atl10.v();
		if (alu11 == alv.aH && (Integer)atl10.c(aqs.a) < 1) {
			cv = cv.UP;
		} else if (!alu11.a((ajw)ajs, co)) {
			co = co.a(cv);
		}

		afj afj12 = aay.b(ri);
		if (!afj12.b() && aay.a(co, cv, afj12) && ajs.a(this.a, co, false, cv, null)) {
			atl atl13 = this.a.a(ajs, co, cv, float6, float7, float8, 0, aay);
			if (!ajs.a(co, atl13, 11)) {
				return rk.FAIL;
			} else {
				atl13 = ajs.o(co);
				if (atl13.v() == this.a) {
					adv.a(ajs, aay, co, afj12);
					atl13.v().a(ajs, co, atl13, aay, afj12);
				}

				aqu aqu14 = this.a.v();
				ajs.a(aay, co, aqu14.e(), no.BLOCKS, (aqu14.a() + 1.0F) / 2.0F, aqu14.b() * 0.8F);
				afj12.g(1);
				return rk.SUCCESS;
			}
		} else {
			return rk.FAIL;
		}
	}
}

public class afz extends afh {
	public afz() {
		this.a(aej.d);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		boolean boolean10 = ajs.o(co).v().a((ajw)ajs, co);
		co co11 = boolean10 ? co : co.a(cv);
		afj afj12 = aay.b(ri);
		if (aay.a(co11, cv, afj12) && ajs.a(ajs.o(co11).v(), co11, false, cv, null) && alv.af.a(ajs, co11)) {
			afj12.g(1);
			ajs.a(co11, alv.af.t());
			return rk.SUCCESS;
		} else {
			return rk.FAIL;
		}
	}
}

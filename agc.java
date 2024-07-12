public class agc extends afh {
	private final alu a;
	private final alu b;

	public agc(alu alu1, alu alu2) {
		this.a = alu1;
		this.b = alu2;
		this.a(aej.l);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		afj afj10 = aay.b(ri);
		if (cv == cv.UP && aay.a(co.a(cv), cv, afj10) && ajs.o(co).v() == this.b && ajs.d(co.a())) {
			ajs.a(co.a(), this.a.t());
			afj10.g(1);
			return rk.SUCCESS;
		} else {
			return rk.FAIL;
		}
	}
}

public class agb extends afd {
	private final alu b;
	private final alu c;

	public agb(int integer, float float2, alu alu3, alu alu4) {
		super(integer, float2, false);
		this.b = alu3;
		this.c = alu4;
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		afj afj10 = aay.b(ri);
		if (cv == cv.UP && aay.a(co.a(cv), cv, afj10) && ajs.o(co).v() == this.c && ajs.d(co.a())) {
			ajs.a(co.a(), this.b.t(), 11);
			afj10.g(1);
			return rk.SUCCESS;
		} else {
			return rk.FAIL;
		}
	}
}

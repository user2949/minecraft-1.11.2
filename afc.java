public class afc extends afh {
	public afc() {
		this.k = 1;
		this.e(64);
		this.a(aej.i);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		co = co.a(cv);
		afj afj10 = aay.b(ri);
		if (!aay.a(co, cv, afj10)) {
			return rk.FAIL;
		} else {
			if (ajs.o(co).a() == azs.a) {
				ajs.a(aay, co, nn.bI, no.BLOCKS, 1.0F, j.nextFloat() * 0.4F + 0.8F);
				ajs.a(co, alv.ab.t(), 11);
			}

			afj10.a(1, aay);
			return rk.SUCCESS;
		}
	}
}

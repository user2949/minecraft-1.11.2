public class aex extends afh {
	public aex() {
		this.a(aej.f);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		if (ajs.E) {
			return rk.SUCCESS;
		} else {
			co = co.a(cv);
			afj afj10 = aay.b(ri);
			if (!aay.a(co, cv, afj10)) {
				return rk.FAIL;
			} else {
				if (ajs.o(co).a() == azs.a) {
					ajs.a(null, co, nn.bx, no.BLOCKS, 1.0F, (j.nextFloat() - j.nextFloat()) * 0.2F + 1.0F);
					ajs.a(co, alv.ab.t());
				}

				if (!aay.bK.d) {
					afj10.g(1);
				}

				return rk.SUCCESS;
			}
		}
	}
}

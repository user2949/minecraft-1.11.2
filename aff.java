import javax.annotation.Nullable;

public class aff extends afh {
	private final Class<? extends yy> a;

	public aff(Class<? extends yy> class1) {
		this.a = class1;
		this.a(aej.c);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		afj afj10 = aay.b(ri);
		co co11 = co.a(cv);
		if (cv != cv.DOWN && cv != cv.UP && aay.a(co11, cv, afj10)) {
			yy yy12 = this.a(ajs, co11, cv);
			if (yy12 != null && yy12.k()) {
				if (!ajs.E) {
					yy12.o();
					ajs.a(yy12);
				}

				afj10.g(1);
			}

			return rk.SUCCESS;
		} else {
			return rk.FAIL;
		}
	}

	@Nullable
	private yy a(ajs ajs, co co, cv cv) {
		if (this.a == zb.class) {
			return new zb(ajs, co, cv);
		} else {
			return this.a == yz.class ? new yz(ajs, co, cv) : null;
		}
	}
}

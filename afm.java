public class afm extends afh {
	public afm() {
		this.a(aej.i);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		alu alu10 = ajs.o(co).v();
		if (!(alu10 instanceof anl)) {
			return rk.PASS;
		} else {
			if (!ajs.E) {
				a(aay, ajs, co);
			}

			return rk.SUCCESS;
		}
	}

	public static boolean a(aay aay, ajs ajs, co co) {
		za za4 = za.b(ajs, co);
		boolean boolean5 = false;
		double double6 = 7.0;
		int integer8 = co.p();
		int integer9 = co.q();
		int integer10 = co.r();

		for (sx sx13 : ajs.a(
			sx.class,
			new bdt((double)integer8 - 7.0, (double)integer9 - 7.0, (double)integer10 - 7.0, (double)integer8 + 7.0, (double)integer9 + 7.0, (double)integer10 + 7.0)
		)) {
			if (sx13.cW() && sx13.cX() == aay) {
				if (za4 == null) {
					za4 = za.a(ajs, co);
				}

				sx13.b(za4, true);
				boolean5 = true;
			}
		}

		return boolean5;
	}
}

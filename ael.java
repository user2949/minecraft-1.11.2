public class ael extends afh {
	private final alu a;

	public ael(alu alu) {
		this.a = alu;
		this.a(aej.d);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		if (cv != cv.UP) {
			return rk.FAIL;
		} else {
			atl atl10 = ajs.o(co);
			alu alu11 = atl10.v();
			if (!alu11.a((ajw)ajs, co)) {
				co = co.a(cv);
			}

			afj afj12 = aay.b(ri);
			if (aay.a(co, cv, afj12) && this.a.a(ajs, co)) {
				cv cv13 = cv.a((double)aay.v);
				int integer14 = cv13.g();
				int integer15 = cv13.i();
				boolean boolean16 = integer14 < 0 && float8 < 0.5F || integer14 > 0 && float8 > 0.5F || integer15 < 0 && float6 > 0.5F || integer15 > 0 && float6 < 0.5F;
				a(ajs, co, cv13, this.a, boolean16);
				aqu aqu17 = this.a.v();
				ajs.a(aay, co, aqu17.e(), no.BLOCKS, (aqu17.a() + 1.0F) / 2.0F, aqu17.b() * 0.8F);
				afj12.g(1);
				return rk.SUCCESS;
			} else {
				return rk.FAIL;
			}
		}
	}

	public static void a(ajs ajs, co co, cv cv, alu alu, boolean boolean5) {
		co co6 = co.a(cv.e());
		co co7 = co.a(cv.f());
		int integer8 = (ajs.o(co7).m() ? 1 : 0) + (ajs.o(co7.a()).m() ? 1 : 0);
		int integer9 = (ajs.o(co6).m() ? 1 : 0) + (ajs.o(co6.a()).m() ? 1 : 0);
		boolean boolean10 = ajs.o(co7).v() == alu || ajs.o(co7.a()).v() == alu;
		boolean boolean11 = ajs.o(co6).v() == alu || ajs.o(co6.a()).v() == alu;
		if ((!boolean10 || boolean11) && integer9 <= integer8) {
			if (boolean11 && !boolean10 || integer9 < integer8) {
				boolean5 = false;
			}
		} else {
			boolean5 = true;
		}

		co co12 = co.a();
		boolean boolean13 = ajs.y(co) || ajs.y(co12);
		atl atl14 = alu.t().a(amx.a, cv).a(amx.c, boolean5 ? amx.b.RIGHT : amx.b.LEFT).a(amx.d, boolean13).a(amx.b, boolean13);
		ajs.a(co, atl14.a(amx.e, amx.a.LOWER), 2);
		ajs.a(co12, atl14.a(amx.e, amx.a.UPPER), 2);
		ajs.b(co, alu, false);
		ajs.b(co12, alu, false);
	}
}

import com.google.common.base.Predicates;
import java.util.Random;

public class awi extends awn {
	private static final atu a = atu.a(alv.m).a(aqj.a, Predicates.equalTo(aqj.a.SAND));
	private final atl b = alv.U.t().a(arf.e, arf.a.SAND).a(aob.a, aob.a.BOTTOM);
	private final atl c = alv.A.t();
	private final atl d = alv.i.t();

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		while (ajs.d(co) && co.q() > 2) {
			co = co.b();
		}

		if (!a.a(ajs.o(co))) {
			return false;
		} else {
			for (int integer5 = -2; integer5 <= 2; integer5++) {
				for (int integer6 = -2; integer6 <= 2; integer6++) {
					if (ajs.d(co.a(integer5, -1, integer6)) && ajs.d(co.a(integer5, -2, integer6))) {
						return false;
					}
				}
			}

			for (int integer5 = -1; integer5 <= 0; integer5++) {
				for (int integer6x = -2; integer6x <= 2; integer6x++) {
					for (int integer7 = -2; integer7 <= 2; integer7++) {
						ajs.a(co.a(integer6x, integer5, integer7), this.c, 2);
					}
				}
			}

			ajs.a(co, this.d, 2);

			for (cv cv6 : cv.c.HORIZONTAL) {
				ajs.a(co.a(cv6), this.d, 2);
			}

			for (int integer5 = -2; integer5 <= 2; integer5++) {
				for (int integer6x = -2; integer6x <= 2; integer6x++) {
					if (integer5 == -2 || integer5 == 2 || integer6x == -2 || integer6x == 2) {
						ajs.a(co.a(integer5, 1, integer6x), this.c, 2);
					}
				}
			}

			ajs.a(co.a(2, 1, 0), this.b, 2);
			ajs.a(co.a(-2, 1, 0), this.b, 2);
			ajs.a(co.a(0, 1, 2), this.b, 2);
			ajs.a(co.a(0, 1, -2), this.b, 2);

			for (int integer5 = -1; integer5 <= 1; integer5++) {
				for (int integer6xx = -1; integer6xx <= 1; integer6xx++) {
					if (integer5 == 0 && integer6xx == 0) {
						ajs.a(co.a(integer5, 4, integer6xx), this.c, 2);
					} else {
						ajs.a(co.a(integer5, 4, integer6xx), this.b, 2);
					}
				}
			}

			for (int integer5 = 1; integer5 <= 3; integer5++) {
				ajs.a(co.a(-1, integer5, -1), this.c, 2);
				ajs.a(co.a(-1, integer5, 1), this.c, 2);
				ajs.a(co.a(1, integer5, -1), this.c, 2);
				ajs.a(co.a(1, integer5, 1), this.c, 2);
			}

			return true;
		}
	}
}

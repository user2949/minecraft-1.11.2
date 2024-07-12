import java.util.Random;

public class awm extends awn {
	public static final co a = co.a;
	public static final co b = new co(a.p() - 4 & -16, 0, a.r() - 4 & -16);
	private final boolean c;

	public awm(boolean boolean1) {
		this.c = boolean1;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (co.a a6 : co.b(new co(co.p() - 4, co.q() - 1, co.r() - 4), new co(co.p() + 4, co.q() + 32, co.r() + 4))) {
			double double7 = a6.h(co.p(), a6.q(), co.r());
			if (double7 <= 3.5) {
				if (a6.q() < co.q()) {
					if (double7 <= 2.5) {
						this.a(ajs, a6, alv.h.t());
					} else if (a6.q() < co.q()) {
						this.a(ajs, a6, alv.bH.t());
					}
				} else if (a6.q() > co.q()) {
					this.a(ajs, a6, alv.a.t());
				} else if (double7 > 2.5) {
					this.a(ajs, a6, alv.h.t());
				} else if (this.c) {
					this.a(ajs, new co(a6), alv.bF.t());
				} else {
					this.a(ajs, new co(a6), alv.a.t());
				}
			}
		}

		for (int integer5 = 0; integer5 < 4; integer5++) {
			this.a(ajs, co.b(integer5), alv.h.t());
		}

		co co5 = co.b(2);

		for (cv cv7 : cv.c.HORIZONTAL) {
			this.a(ajs, co5.a(cv7), alv.aa.t().a(arl.a, cv7));
		}

		return true;
	}
}

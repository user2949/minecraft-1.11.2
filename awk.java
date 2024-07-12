import java.util.Random;

public class awk extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (co.a a6 : co.b(co.a(-1, -2, -1), co.a(1, 2, 1))) {
			boolean boolean7 = a6.p() == co.p();
			boolean boolean8 = a6.q() == co.q();
			boolean boolean9 = a6.r() == co.r();
			boolean boolean10 = Math.abs(a6.q() - co.q()) == 2;
			if (boolean7 && boolean8 && boolean9) {
				this.a(ajs, new co(a6), alv.db.t());
			} else if (boolean8) {
				this.a(ajs, a6, alv.a.t());
			} else if (boolean10 && boolean7 && boolean9) {
				this.a(ajs, a6, alv.h.t());
			} else if ((boolean7 || boolean9) && !boolean10) {
				this.a(ajs, a6, alv.h.t());
			} else {
				this.a(ajs, a6, alv.a.t());
			}
		}

		return true;
	}
}

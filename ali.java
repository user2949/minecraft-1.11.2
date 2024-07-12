import java.util.Random;

public class ali extends aki {
	@Override
	public void a(ajs ajs, Random random, akf akf, co co) {
		co co6 = ajs.R();
		int integer7 = 16;
		double double8 = co6.n(co.a(8, co6.q(), 8));
		if (!(double8 > 1024.0)) {
			co co10 = new co(co6.p() - 16, co6.q() - 1, co6.r() - 16);
			co co11 = new co(co6.p() + 16, co6.q() - 1, co6.r() + 16);
			co.a a12 = new co.a(co10);

			for (int integer13 = co.r(); integer13 < co.r() + 16; integer13++) {
				for (int integer14 = co.p(); integer14 < co.p() + 16; integer14++) {
					if (integer13 >= co10.r() && integer13 <= co11.r() && integer14 >= co10.p() && integer14 <= co11.p()) {
						a12.c(integer14, a12.q(), integer13);
						if (co6.p() == integer14 && co6.r() == integer13) {
							ajs.a(a12, alv.e.t(), 2);
						} else {
							ajs.a(a12, alv.b.t(), 2);
						}
					}
				}
			}
		}
	}
}

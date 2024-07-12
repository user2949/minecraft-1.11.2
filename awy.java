import java.util.Random;

public class awy extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		if (!ajs.d(co)) {
			return false;
		} else if (ajs.o(co.a()).v() != alv.aV) {
			return false;
		} else {
			ajs.a(co, alv.aX.t(), 2);

			for (int integer5 = 0; integer5 < 1500; integer5++) {
				co co6 = co.a(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
				if (ajs.o(co6).a() == azs.a) {
					int integer7 = 0;

					for (cv cv11 : cv.values()) {
						if (ajs.o(co6.a(cv11)).v() == alv.aX) {
							integer7++;
						}

						if (integer7 > 1) {
							break;
						}
					}

					if (integer7 == 1) {
						ajs.a(co6, alv.aX.t(), 2);
					}
				}
			}

			return true;
		}
	}
}

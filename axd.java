import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class axd extends awn {
	private static final Logger a = LogManager.getLogger();
	private static final kq[] b = new kq[]{sp.a(aag.class), sp.a(aao.class), sp.a(aao.class), sp.a(aai.class)};

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		int integer5 = 3;
		int integer6 = random.nextInt(2) + 2;
		int integer7 = -integer6 - 1;
		int integer8 = integer6 + 1;
		int integer9 = -1;
		int integer10 = 4;
		int integer11 = random.nextInt(2) + 2;
		int integer12 = -integer11 - 1;
		int integer13 = integer11 + 1;
		int integer14 = 0;

		for (int integer15 = integer7; integer15 <= integer8; integer15++) {
			for (int integer16 = -1; integer16 <= 4; integer16++) {
				for (int integer17 = integer12; integer17 <= integer13; integer17++) {
					co co18 = co.a(integer15, integer16, integer17);
					azs azs19 = ajs.o(co18).a();
					boolean boolean20 = azs19.a();
					if (integer16 == -1 && !boolean20) {
						return false;
					}

					if (integer16 == 4 && !boolean20) {
						return false;
					}

					if ((integer15 == integer7 || integer15 == integer8 || integer17 == integer12 || integer17 == integer13)
						&& integer16 == 0
						&& ajs.d(co18)
						&& ajs.d(co18.a())) {
						integer14++;
					}
				}
			}
		}

		if (integer14 >= 1 && integer14 <= 5) {
			for (int integer15 = integer7; integer15 <= integer8; integer15++) {
				for (int integer16 = 3; integer16 >= -1; integer16--) {
					for (int integer17 = integer12; integer17 <= integer13; integer17++) {
						co co18x = co.a(integer15, integer16, integer17);
						if (integer15 != integer7 && integer16 != -1 && integer17 != integer12 && integer15 != integer8 && integer16 != 4 && integer17 != integer13) {
							if (ajs.o(co18x).v() != alv.ae) {
								ajs.g(co18x);
							}
						} else if (co18x.q() >= 0 && !ajs.o(co18x.b()).a().a()) {
							ajs.g(co18x);
						} else if (ajs.o(co18x).a().a() && ajs.o(co18x).v() != alv.ae) {
							if (integer16 == -1 && random.nextInt(4) != 0) {
								ajs.a(co18x, alv.Y.t(), 2);
							} else {
								ajs.a(co18x, alv.e.t(), 2);
							}
						}
					}
				}
			}

			for (int integer15 = 0; integer15 < 2; integer15++) {
				for (int integer16 = 0; integer16 < 3; integer16++) {
					int integer17x = co.p() + random.nextInt(integer6 * 2 + 1) - integer6;
					int integer18 = co.q();
					int integer19 = co.r() + random.nextInt(integer11 * 2 + 1) - integer11;
					co co20 = new co(integer17x, integer18, integer19);
					if (ajs.d(co20)) {
						int integer21 = 0;

						for (cv cv23 : cv.c.HORIZONTAL) {
							if (ajs.o(co20.a(cv23)).a().a()) {
								integer21++;
							}
						}

						if (integer21 == 1) {
							ajs.a(co20, alv.ae.f(ajs, co20, alv.ae.t()), 2);
							asc asc22 = ajs.r(co20);
							if (asc22 instanceof ase) {
								((ase)asc22).a(bcf.d, random.nextLong());
							}
							break;
						}
					}
				}
			}

			ajs.a(co, alv.ac.t(), 2);
			asc asc15 = ajs.r(co);
			if (asc15 instanceof asr) {
				((asr)asc15).a().a(this.a(random));
			} else {
				a.error("Failed to fetch mob spawner entity at ({}, {}, {})", new Object[]{co.p(), co.q(), co.r()});
			}

			return true;
		} else {
			return false;
		}
	}

	private kq a(Random random) {
		return b[random.nextInt(b.length)];
	}
}

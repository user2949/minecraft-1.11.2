import java.util.Random;

public class awx extends awn {
	private final alu a;

	public awx(alu alu) {
		this.a = alu;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		co = co.a(-8, 0, -8);

		while (co.q() > 5 && ajs.d(co)) {
			co = co.b();
		}

		if (co.q() <= 4) {
			return false;
		} else {
			co = co.c(4);
			boolean[] arr5 = new boolean[2048];
			int integer6 = random.nextInt(4) + 4;

			for (int integer7 = 0; integer7 < integer6; integer7++) {
				double double8 = random.nextDouble() * 6.0 + 3.0;
				double double10 = random.nextDouble() * 4.0 + 2.0;
				double double12 = random.nextDouble() * 6.0 + 3.0;
				double double14 = random.nextDouble() * (16.0 - double8 - 2.0) + 1.0 + double8 / 2.0;
				double double16 = random.nextDouble() * (8.0 - double10 - 4.0) + 2.0 + double10 / 2.0;
				double double18 = random.nextDouble() * (16.0 - double12 - 2.0) + 1.0 + double12 / 2.0;

				for (int integer20 = 1; integer20 < 15; integer20++) {
					for (int integer21 = 1; integer21 < 15; integer21++) {
						for (int integer22 = 1; integer22 < 7; integer22++) {
							double double23 = ((double)integer20 - double14) / (double8 / 2.0);
							double double25 = ((double)integer22 - double16) / (double10 / 2.0);
							double double27 = ((double)integer21 - double18) / (double12 / 2.0);
							double double29 = double23 * double23 + double25 * double25 + double27 * double27;
							if (double29 < 1.0) {
								arr5[(integer20 * 16 + integer21) * 8 + integer22] = true;
							}
						}
					}
				}
			}

			for (int integer7 = 0; integer7 < 16; integer7++) {
				for (int integer8 = 0; integer8 < 16; integer8++) {
					for (int integer9 = 0; integer9 < 8; integer9++) {
						boolean boolean10 = !arr5[(integer7 * 16 + integer8) * 8 + integer9]
							&& (
								integer7 < 15 && arr5[((integer7 + 1) * 16 + integer8) * 8 + integer9]
									|| integer7 > 0 && arr5[((integer7 - 1) * 16 + integer8) * 8 + integer9]
									|| integer8 < 15 && arr5[(integer7 * 16 + integer8 + 1) * 8 + integer9]
									|| integer8 > 0 && arr5[(integer7 * 16 + (integer8 - 1)) * 8 + integer9]
									|| integer9 < 7 && arr5[(integer7 * 16 + integer8) * 8 + integer9 + 1]
									|| integer9 > 0 && arr5[(integer7 * 16 + integer8) * 8 + (integer9 - 1)]
							);
						if (boolean10) {
							azs azs11 = ajs.o(co.a(integer7, integer9, integer8)).a();
							if (integer9 >= 4 && azs11.d()) {
								return false;
							}

							if (integer9 < 4 && !azs11.a() && ajs.o(co.a(integer7, integer9, integer8)).v() != this.a) {
								return false;
							}
						}
					}
				}
			}

			for (int integer7 = 0; integer7 < 16; integer7++) {
				for (int integer8 = 0; integer8 < 16; integer8++) {
					for (int integer9x = 0; integer9x < 8; integer9x++) {
						if (arr5[(integer7 * 16 + integer8) * 8 + integer9x]) {
							ajs.a(co.a(integer7, integer9x, integer8), integer9x >= 4 ? alv.a.t() : this.a.t(), 2);
						}
					}
				}
			}

			for (int integer7 = 0; integer7 < 16; integer7++) {
				for (int integer8 = 0; integer8 < 16; integer8++) {
					for (int integer9xx = 4; integer9xx < 8; integer9xx++) {
						if (arr5[(integer7 * 16 + integer8) * 8 + integer9xx]) {
							co co10 = co.a(integer7, integer9xx - 1, integer8);
							if (ajs.o(co10).v() == alv.d && ajs.b(ajy.SKY, co.a(integer7, integer9xx, integer8)) > 0) {
								akf akf11 = ajs.b(co10);
								if (akf11.r.v() == alv.bw) {
									ajs.a(co10, alv.bw.t(), 2);
								} else {
									ajs.a(co10, alv.c.t(), 2);
								}
							}
						}
					}
				}
			}

			if (this.a.t().a() == azs.i) {
				for (int integer7 = 0; integer7 < 16; integer7++) {
					for (int integer8 = 0; integer8 < 16; integer8++) {
						for (int integer9xxx = 0; integer9xxx < 8; integer9xxx++) {
							boolean boolean10 = !arr5[(integer7 * 16 + integer8) * 8 + integer9xxx]
								&& (
									integer7 < 15 && arr5[((integer7 + 1) * 16 + integer8) * 8 + integer9xxx]
										|| integer7 > 0 && arr5[((integer7 - 1) * 16 + integer8) * 8 + integer9xxx]
										|| integer8 < 15 && arr5[(integer7 * 16 + integer8 + 1) * 8 + integer9xxx]
										|| integer8 > 0 && arr5[(integer7 * 16 + (integer8 - 1)) * 8 + integer9xxx]
										|| integer9xxx < 7 && arr5[(integer7 * 16 + integer8) * 8 + integer9xxx + 1]
										|| integer9xxx > 0 && arr5[(integer7 * 16 + integer8) * 8 + (integer9xxx - 1)]
								);
							if (boolean10 && (integer9xxx < 4 || random.nextInt(2) != 0) && ajs.o(co.a(integer7, integer9xxx, integer8)).a().a()) {
								ajs.a(co.a(integer7, integer9xxx, integer8), alv.b.t(), 2);
							}
						}
					}
				}
			}

			if (this.a.t().a() == azs.h) {
				for (int integer7 = 0; integer7 < 16; integer7++) {
					for (int integer8 = 0; integer8 < 16; integer8++) {
						int integer9xxxx = 4;
						if (ajs.u(co.a(integer7, 4, integer8))) {
							ajs.a(co.a(integer7, 4, integer8), alv.aI.t(), 2);
						}
					}
				}
			}

			return true;
		}
	}
}

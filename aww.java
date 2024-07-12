import java.util.Random;

public class aww extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		while (ajs.d(co) && co.q() > 2) {
			co = co.b();
		}

		if (ajs.o(co).v() != alv.aJ) {
			return false;
		} else {
			co = co.b(random.nextInt(4));
			int integer5 = random.nextInt(4) + 7;
			int integer6 = integer5 / 4 + random.nextInt(2);
			if (integer6 > 1 && random.nextInt(60) == 0) {
				co = co.b(10 + random.nextInt(30));
			}

			for (int integer7 = 0; integer7 < integer5; integer7++) {
				float float8 = (1.0F - (float)integer7 / (float)integer5) * (float)integer6;
				int integer9 = ot.f(float8);

				for (int integer10 = -integer9; integer10 <= integer9; integer10++) {
					float float11 = (float)ot.a(integer10) - 0.25F;

					for (int integer12 = -integer9; integer12 <= integer9; integer12++) {
						float float13 = (float)ot.a(integer12) - 0.25F;
						if ((integer10 == 0 && integer12 == 0 || !(float11 * float11 + float13 * float13 > float8 * float8))
							&& (integer10 != -integer9 && integer10 != integer9 && integer12 != -integer9 && integer12 != integer9 || !(random.nextFloat() > 0.75F))) {
							atl atl14 = ajs.o(co.a(integer10, integer7, integer12));
							alu alu15 = atl14.v();
							if (atl14.a() == azs.a || alu15 == alv.d || alu15 == alv.aJ || alu15 == alv.aI) {
								this.a(ajs, co.a(integer10, integer7, integer12), alv.cB.t());
							}

							if (integer7 != 0 && integer9 > 1) {
								atl14 = ajs.o(co.a(integer10, -integer7, integer12));
								alu15 = atl14.v();
								if (atl14.a() == azs.a || alu15 == alv.d || alu15 == alv.aJ || alu15 == alv.aI) {
									this.a(ajs, co.a(integer10, -integer7, integer12), alv.cB.t());
								}
							}
						}
					}
				}
			}

			int integer7 = integer6 - 1;
			if (integer7 < 0) {
				integer7 = 0;
			} else if (integer7 > 1) {
				integer7 = 1;
			}

			for (int integer8 = -integer7; integer8 <= integer7; integer8++) {
				for (int integer9 = -integer7; integer9 <= integer7; integer9++) {
					co co10 = co.a(integer8, -1, integer9);
					int integer11 = 50;
					if (Math.abs(integer8) == 1 && Math.abs(integer9) == 1) {
						integer11 = random.nextInt(5);
					}

					while (co10.q() > 50) {
						atl atl12 = ajs.o(co10);
						alu alu13 = atl12.v();
						if (atl12.a() != azs.a && alu13 != alv.d && alu13 != alv.aJ && alu13 != alv.aI && alu13 != alv.cB) {
							break;
						}

						this.a(ajs, co10, alv.cB.t());
						co10 = co10.b();
						if (--integer11 <= 0) {
							co10 = co10.c(random.nextInt(5) + 1);
							integer11 = random.nextInt(5);
						}
					}
				}
			}

			return true;
		}
	}
}

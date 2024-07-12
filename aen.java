public class aen extends afh {
	public static final int[] a = new int[]{
		1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320
	};

	public aen() {
		this.a(true);
		this.e(0);
		this.a(aej.l);
	}

	@Override
	public String a(afj afj) {
		int integer3 = afj.j();
		return super.a() + "." + aem.a(integer3).d();
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		afj afj10 = aay.b(ri);
		if (!aay.a(co.a(cv), cv, afj10)) {
			return rk.FAIL;
		} else {
			aem aem11 = aem.a(afj10.j());
			if (aem11 == aem.WHITE) {
				if (a(afj10, ajs, co)) {
					if (!ajs.E) {
						ajs.b(2005, co, 0);
					}

					return rk.SUCCESS;
				}
			} else if (aem11 == aem.BROWN) {
				atl atl12 = ajs.o(co);
				alu alu13 = atl12.v();
				if (alu13 == alv.r && atl12.c(apk.b) == apn.a.JUNGLE) {
					if (cv == cv.DOWN || cv == cv.UP) {
						return rk.FAIL;
					}

					co = co.a(cv);
					if (ajs.d(co)) {
						atl atl14 = alv.bN.a(ajs, co, cv, float6, float7, float8, 0, aay);
						ajs.a(co, atl14, 10);
						if (!aay.bK.d) {
							afj10.g(1);
						}

						return rk.SUCCESS;
					}
				}

				return rk.FAIL;
			}

			return rk.PASS;
		}
	}

	public static boolean a(afj afj, ajs ajs, co co) {
		atl atl4 = ajs.o(co);
		if (atl4.v() instanceof alx) {
			alx alx5 = (alx)atl4.v();
			if (alx5.a(ajs, co, atl4, ajs.E)) {
				if (!ajs.E) {
					if (alx5.a(ajs, ajs.r, co, atl4)) {
						alx5.b(ajs, ajs.r, co, atl4);
					}

					afj.g(1);
				}

				return true;
			}
		}

		return false;
	}

	public static void a(ajs ajs, co co, int integer) {
		if (integer == 0) {
			integer = 15;
		}

		atl atl4 = ajs.o(co);
		if (atl4.a() != azs.a) {
			for (int integer5 = 0; integer5 < integer; integer5++) {
				double double6 = j.nextGaussian() * 0.02;
				double double8 = j.nextGaussian() * 0.02;
				double double10 = j.nextGaussian() * 0.02;
				ajs.a(
					de.VILLAGER_HAPPY,
					(double)((float)co.p() + j.nextFloat()),
					(double)co.q() + (double)j.nextFloat() * atl4.d(ajs, co).e,
					(double)((float)co.r() + j.nextFloat()),
					double6,
					double8,
					double10
				);
			}
		}
	}

	@Override
	public boolean a(afj afj, aay aay, sw sw, ri ri) {
		if (sw instanceof xf) {
			xf xf6 = (xf)sw;
			aem aem7 = aem.a(afj.j());
			if (!xf6.di() && xf6.dh() != aem7) {
				xf6.b(aem7);
				afj.g(1);
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (int integer5 = 0; integer5 < 16; integer5++) {
			dd.add(new afj(afh, 1, integer5));
		}
	}
}

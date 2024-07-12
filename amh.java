import java.util.Random;
import javax.annotation.Nullable;

public class amh extends alu {
	public static final aua a = aua.a("age", 0, 5);

	protected amh() {
		super(azs.k, azt.z);
		this.y(this.A.b().a(a, 0));
		this.a(aej.c);
		this.a(true);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.a;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!this.b(ajs, co)) {
			ajs.b(co, true);
		} else {
			co co6 = co.a();
			if (ajs.d(co6) && co6.q() < 256) {
				int integer7 = (Integer)atl.c(a);
				if (integer7 < 5 && random.nextInt(1) == 0) {
					boolean boolean8 = false;
					boolean boolean9 = false;
					atl atl10 = ajs.o(co.b());
					alu alu11 = atl10.v();
					if (alu11 == alv.bH) {
						boolean8 = true;
					} else if (alu11 == alv.cR) {
						int integer12 = 1;

						for (int integer13 = 0; integer13 < 4; integer13++) {
							alu alu14 = ajs.o(co.c(integer12 + 1)).v();
							if (alu14 != alv.cR) {
								if (alu14 == alv.bH) {
									boolean9 = true;
								}
								break;
							}

							integer12++;
						}

						int integer13 = 4;
						if (boolean9) {
							integer13++;
						}

						if (integer12 < 2 || random.nextInt(integer13) >= integer12) {
							boolean8 = true;
						}
					} else if (atl10.a() == azs.a) {
						boolean8 = true;
					}

					if (boolean8 && a(ajs, co6, null) && ajs.d(co.b(2))) {
						ajs.a(co, alv.cR.t(), 2);
						this.a(ajs, co6, integer7);
					} else if (integer7 < 4) {
						int integer12 = random.nextInt(4);
						boolean boolean13 = false;
						if (boolean9) {
							integer12++;
						}

						for (int integer14 = 0; integer14 < integer12; integer14++) {
							cv cv15 = cv.c.HORIZONTAL.a(random);
							co co16 = co.a(cv15);
							if (ajs.d(co16) && ajs.d(co16.b()) && a(ajs, co16, cv15.d())) {
								this.a(ajs, co16, integer7 + 1);
								boolean13 = true;
							}
						}

						if (boolean13) {
							ajs.a(co, alv.cR.t(), 2);
						} else {
							this.c(ajs, co);
						}
					} else if (integer7 == 4) {
						this.c(ajs, co);
					}
				}
			}
		}
	}

	private void a(ajs ajs, co co, int integer) {
		ajs.a(co, this.t().a(a, integer), 2);
		ajs.b(1033, co, 0);
	}

	private void c(ajs ajs, co co) {
		ajs.a(co, this.t().a(a, 5), 2);
		ajs.b(1034, co, 0);
	}

	private static boolean a(ajs ajs, co co, cv cv) {
		for (cv cv5 : cv.c.HORIZONTAL) {
			if (cv5 != cv && !ajs.d(co.a(cv5))) {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return super.a(ajs, co) && this.b(ajs, co);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!this.b(ajs, co3)) {
			ajs.a(co3, this, 1);
		}
	}

	public boolean b(ajs ajs, co co) {
		atl atl4 = ajs.o(co.b());
		alu alu5 = atl4.v();
		if (alu5 != alv.cR && alu5 != alv.bH) {
			if (atl4.a() == azs.a) {
				int integer6 = 0;

				for (cv cv8 : cv.c.HORIZONTAL) {
					atl atl9 = ajs.o(co.a(cv8));
					alu alu10 = atl9.v();
					if (alu10 == alv.cR) {
						integer6++;
					} else if (atl9.a() != azs.a) {
						return false;
					}
				}

				return integer6 == 1;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		super.a(ajs, aay, co, atl, asc, afj);
		a(ajs, co, new afj(afh.a(this)));
	}

	@Override
	protected afj w(atl atl) {
		return afj.a;
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(a);
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static void a(ajs ajs, co co, Random random, int integer) {
		ajs.a(co, alv.cR.t(), 2);
		a(ajs, co, random, co, integer, 0);
	}

	private static void a(ajs ajs, co co2, Random random, co co4, int integer5, int integer6) {
		int integer7 = random.nextInt(4) + 1;
		if (integer6 == 0) {
			integer7++;
		}

		for (int integer8 = 0; integer8 < integer7; integer8++) {
			co co9 = co2.b(integer8 + 1);
			if (!a(ajs, co9, null)) {
				return;
			}

			ajs.a(co9, alv.cR.t(), 2);
		}

		boolean boolean8 = false;
		if (integer6 < 4) {
			int integer9 = random.nextInt(4);
			if (integer6 == 0) {
				integer9++;
			}

			for (int integer10 = 0; integer10 < integer9; integer10++) {
				cv cv11 = cv.c.HORIZONTAL.a(random);
				co co12 = co2.b(integer7).a(cv11);
				if (Math.abs(co12.p() - co4.p()) < integer5 && Math.abs(co12.r() - co4.r()) < integer5 && ajs.d(co12) && ajs.d(co12.b()) && a(ajs, co12, cv11.d())) {
					boolean8 = true;
					ajs.a(co12, alv.cR.t(), 2);
					a(ajs, co12, random, co4, integer5, integer6 + 1);
				}
			}
		}

		if (!boolean8) {
			ajs.a(co2.b(integer7), alv.cS.t().a(a, 5), 2);
		}
	}
}

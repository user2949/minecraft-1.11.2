import java.util.Random;

public class axi extends avz {
	private static final atl a = alv.s.t().a(apd.b, apn.a.DARK_OAK);
	private static final atl b = alv.u.t().a(apc.e, apn.a.DARK_OAK).a(aon.b, false);

	public axi(boolean boolean1) {
		super(boolean1);
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		int integer5 = random.nextInt(3) + random.nextInt(2) + 6;
		int integer6 = co.p();
		int integer7 = co.q();
		int integer8 = co.r();
		if (integer7 >= 1 && integer7 + integer5 + 1 < 256) {
			co co9 = co.b();
			alu alu10 = ajs.o(co9).v();
			if (alu10 != alv.c && alu10 != alv.d) {
				return false;
			} else if (!this.a(ajs, co, integer5)) {
				return false;
			} else {
				this.a(ajs, co9);
				this.a(ajs, co9.f());
				this.a(ajs, co9.d());
				this.a(ajs, co9.d().f());
				cv cv11 = cv.c.HORIZONTAL.a(random);
				int integer12 = integer5 - random.nextInt(4);
				int integer13 = 2 - random.nextInt(3);
				int integer14 = integer6;
				int integer15 = integer8;
				int integer16 = integer7 + integer5 - 1;

				for (int integer17 = 0; integer17 < integer5; integer17++) {
					if (integer17 >= integer12 && integer13 > 0) {
						integer14 += cv11.g();
						integer15 += cv11.i();
						integer13--;
					}

					int integer18 = integer7 + integer17;
					co co19 = new co(integer14, integer18, integer15);
					azs azs20 = ajs.o(co19).a();
					if (azs20 == azs.a || azs20 == azs.j) {
						this.b(ajs, co19);
						this.b(ajs, co19.f());
						this.b(ajs, co19.d());
						this.b(ajs, co19.f().d());
					}
				}

				for (int integer17 = -2; integer17 <= 0; integer17++) {
					for (int integer18 = -2; integer18 <= 0; integer18++) {
						int integer19 = -1;
						this.a(ajs, integer14 + integer17, integer16 + integer19, integer15 + integer18);
						this.a(ajs, 1 + integer14 - integer17, integer16 + integer19, integer15 + integer18);
						this.a(ajs, integer14 + integer17, integer16 + integer19, 1 + integer15 - integer18);
						this.a(ajs, 1 + integer14 - integer17, integer16 + integer19, 1 + integer15 - integer18);
						if ((integer17 > -2 || integer18 > -1) && (integer17 != -1 || integer18 != -2)) {
							int var28 = 1;
							this.a(ajs, integer14 + integer17, integer16 + var28, integer15 + integer18);
							this.a(ajs, 1 + integer14 - integer17, integer16 + var28, integer15 + integer18);
							this.a(ajs, integer14 + integer17, integer16 + var28, 1 + integer15 - integer18);
							this.a(ajs, 1 + integer14 - integer17, integer16 + var28, 1 + integer15 - integer18);
						}
					}
				}

				if (random.nextBoolean()) {
					this.a(ajs, integer14, integer16 + 2, integer15);
					this.a(ajs, integer14 + 1, integer16 + 2, integer15);
					this.a(ajs, integer14 + 1, integer16 + 2, integer15 + 1);
					this.a(ajs, integer14, integer16 + 2, integer15 + 1);
				}

				for (int integer17 = -3; integer17 <= 4; integer17++) {
					for (int integer18x = -3; integer18x <= 4; integer18x++) {
						if ((integer17 != -3 || integer18x != -3)
							&& (integer17 != -3 || integer18x != 4)
							&& (integer17 != 4 || integer18x != -3)
							&& (integer17 != 4 || integer18x != 4)
							&& (Math.abs(integer17) < 3 || Math.abs(integer18x) < 3)) {
							this.a(ajs, integer14 + integer17, integer16, integer15 + integer18x);
						}
					}
				}

				for (int integer17 = -1; integer17 <= 2; integer17++) {
					for (int integer18xx = -1; integer18xx <= 2; integer18xx++) {
						if ((integer17 < 0 || integer17 > 1 || integer18xx < 0 || integer18xx > 1) && random.nextInt(3) <= 0) {
							int integer19 = random.nextInt(3) + 2;

							for (int integer20 = 0; integer20 < integer19; integer20++) {
								this.b(ajs, new co(integer6 + integer17, integer16 - integer20 - 1, integer8 + integer18xx));
							}

							for (int integer20 = -1; integer20 <= 1; integer20++) {
								for (int integer21 = -1; integer21 <= 1; integer21++) {
									this.a(ajs, integer14 + integer17 + integer20, integer16, integer15 + integer18xx + integer21);
								}
							}

							for (int integer20 = -2; integer20 <= 2; integer20++) {
								for (int integer21 = -2; integer21 <= 2; integer21++) {
									if (Math.abs(integer20) != 2 || Math.abs(integer21) != 2) {
										this.a(ajs, integer14 + integer17 + integer20, integer16 - 1, integer15 + integer18xx + integer21);
									}
								}
							}
						}
					}
				}

				return true;
			}
		} else {
			return false;
		}
	}

	private boolean a(ajs ajs, co co, int integer) {
		int integer5 = co.p();
		int integer6 = co.q();
		int integer7 = co.r();
		co.a a8 = new co.a();

		for (int integer9 = 0; integer9 <= integer + 1; integer9++) {
			int integer10 = 1;
			if (integer9 == 0) {
				integer10 = 0;
			}

			if (integer9 >= integer - 1) {
				integer10 = 2;
			}

			for (int integer11 = -integer10; integer11 <= integer10; integer11++) {
				for (int integer12 = -integer10; integer12 <= integer10; integer12++) {
					if (!this.a(ajs.o(a8.c(integer5 + integer11, integer6 + integer9, integer7 + integer12)).v())) {
						return false;
					}
				}
			}
		}

		return true;
	}

	private void b(ajs ajs, co co) {
		if (this.a(ajs.o(co).v())) {
			this.a(ajs, co, a);
		}
	}

	private void a(ajs ajs, int integer2, int integer3, int integer4) {
		co co6 = new co(integer2, integer3, integer4);
		azs azs7 = ajs.o(co6).a();
		if (azs7 == azs.a) {
			this.a(ajs, co6, b);
		}
	}
}

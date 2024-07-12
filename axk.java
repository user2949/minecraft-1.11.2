import java.util.Random;

public class axk extends avz {
	private static final atl a = alv.s.t().a(apd.b, apn.a.ACACIA);
	private static final atl b = alv.u.t().a(apc.e, apn.a.ACACIA).a(aon.b, false);

	public axk(boolean boolean1) {
		super(boolean1);
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		int integer5 = random.nextInt(3) + random.nextInt(3) + 5;
		boolean boolean6 = true;
		if (co.q() >= 1 && co.q() + integer5 + 1 <= 256) {
			for (int integer7 = co.q(); integer7 <= co.q() + 1 + integer5; integer7++) {
				int integer8 = 1;
				if (integer7 == co.q()) {
					integer8 = 0;
				}

				if (integer7 >= co.q() + 1 + integer5 - 2) {
					integer8 = 2;
				}

				co.a a9 = new co.a();

				for (int integer10 = co.p() - integer8; integer10 <= co.p() + integer8 && boolean6; integer10++) {
					for (int integer11 = co.r() - integer8; integer11 <= co.r() + integer8 && boolean6; integer11++) {
						if (integer7 < 0 || integer7 >= 256) {
							boolean6 = false;
						} else if (!this.a(ajs.o(a9.c(integer10, integer7, integer11)).v())) {
							boolean6 = false;
						}
					}
				}
			}

			if (!boolean6) {
				return false;
			} else {
				alu alu7 = ajs.o(co.b()).v();
				if ((alu7 == alv.c || alu7 == alv.d) && co.q() < 256 - integer5 - 1) {
					this.a(ajs, co.b());
					cv cv8 = cv.c.HORIZONTAL.a(random);
					int integer9 = integer5 - random.nextInt(4) - 1;
					int integer10 = 3 - random.nextInt(3);
					int integer11x = co.p();
					int integer12 = co.r();
					int integer13 = 0;

					for (int integer14 = 0; integer14 < integer5; integer14++) {
						int integer15 = co.q() + integer14;
						if (integer14 >= integer9 && integer10 > 0) {
							integer11x += cv8.g();
							integer12 += cv8.i();
							integer10--;
						}

						co co16 = new co(integer11x, integer15, integer12);
						azs azs17 = ajs.o(co16).a();
						if (azs17 == azs.a || azs17 == azs.j) {
							this.b(ajs, co16);
							integer13 = integer15;
						}
					}

					co co14 = new co(integer11x, integer13, integer12);

					for (int integer15x = -3; integer15x <= 3; integer15x++) {
						for (int integer16 = -3; integer16 <= 3; integer16++) {
							if (Math.abs(integer15x) != 3 || Math.abs(integer16) != 3) {
								this.c(ajs, co14.a(integer15x, 0, integer16));
							}
						}
					}

					co14 = co14.a();

					for (int integer15x = -1; integer15x <= 1; integer15x++) {
						for (int integer16x = -1; integer16x <= 1; integer16x++) {
							this.c(ajs, co14.a(integer15x, 0, integer16x));
						}
					}

					this.c(ajs, co14.g(2));
					this.c(ajs, co14.f(2));
					this.c(ajs, co14.e(2));
					this.c(ajs, co14.d(2));
					integer11x = co.p();
					integer12 = co.r();
					cv cv14 = cv.c.HORIZONTAL.a(random);
					if (cv14 != cv8) {
						int integer15x = integer9 - random.nextInt(2) - 1;
						int integer16x = 1 + random.nextInt(3);
						integer13 = 0;

						for (int integer17 = integer15x; integer17 < integer5 && integer16x > 0; integer16x--) {
							if (integer17 >= 1) {
								int integer18 = co.q() + integer17;
								integer11x += cv14.g();
								integer12 += cv14.i();
								co co19 = new co(integer11x, integer18, integer12);
								azs azs20 = ajs.o(co19).a();
								if (azs20 == azs.a || azs20 == azs.j) {
									this.b(ajs, co19);
									integer13 = integer18;
								}
							}

							integer17++;
						}

						if (integer13 > 0) {
							co co17 = new co(integer11x, integer13, integer12);

							for (int integer18 = -2; integer18 <= 2; integer18++) {
								for (int integer19 = -2; integer19 <= 2; integer19++) {
									if (Math.abs(integer18) != 2 || Math.abs(integer19) != 2) {
										this.c(ajs, co17.a(integer18, 0, integer19));
									}
								}
							}

							co17 = co17.a();

							for (int integer18 = -1; integer18 <= 1; integer18++) {
								for (int integer19x = -1; integer19x <= 1; integer19x++) {
									this.c(ajs, co17.a(integer18, 0, integer19x));
								}
							}
						}
					}

					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
	}

	private void b(ajs ajs, co co) {
		this.a(ajs, co, a);
	}

	private void c(ajs ajs, co co) {
		azs azs4 = ajs.o(co).a();
		if (azs4 == azs.a || azs4 == azs.j) {
			this.a(ajs, co, b);
		}
	}
}

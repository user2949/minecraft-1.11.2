import java.util.Random;

public class axo extends avz {
	private static final atl a = alv.r.t().a(apk.b, apn.a.OAK);
	private static final atl b = alv.t.t().a(apj.e, apn.a.OAK).a(apj.b, false);

	public axo() {
		super(false);
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		int integer5 = random.nextInt(4) + 5;

		while (ajs.o(co.b()).a() == azs.h) {
			co = co.b();
		}

		boolean boolean6 = true;
		if (co.q() >= 1 && co.q() + integer5 + 1 <= 256) {
			for (int integer7 = co.q(); integer7 <= co.q() + 1 + integer5; integer7++) {
				int integer8 = 1;
				if (integer7 == co.q()) {
					integer8 = 0;
				}

				if (integer7 >= co.q() + 1 + integer5 - 2) {
					integer8 = 3;
				}

				co.a a9 = new co.a();

				for (int integer10 = co.p() - integer8; integer10 <= co.p() + integer8 && boolean6; integer10++) {
					for (int integer11 = co.r() - integer8; integer11 <= co.r() + integer8 && boolean6; integer11++) {
						if (integer7 >= 0 && integer7 < 256) {
							atl atl12 = ajs.o(a9.c(integer10, integer7, integer11));
							alu alu13 = atl12.v();
							if (atl12.a() != azs.a && atl12.a() != azs.j) {
								if (alu13 != alv.j && alu13 != alv.i) {
									boolean6 = false;
								} else if (integer7 > co.q()) {
									boolean6 = false;
								}
							}
						} else {
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

					for (int integer8x = co.q() - 3 + integer5; integer8x <= co.q() + integer5; integer8x++) {
						int integer9 = integer8x - (co.q() + integer5);
						int integer10 = 2 - integer9 / 2;

						for (int integer11x = co.p() - integer10; integer11x <= co.p() + integer10; integer11x++) {
							int integer12 = integer11x - co.p();

							for (int integer13 = co.r() - integer10; integer13 <= co.r() + integer10; integer13++) {
								int integer14 = integer13 - co.r();
								if (Math.abs(integer12) != integer10 || Math.abs(integer14) != integer10 || random.nextInt(2) != 0 && integer9 != 0) {
									co co15 = new co(integer11x, integer8x, integer13);
									if (!ajs.o(co15).b()) {
										this.a(ajs, co15, b);
									}
								}
							}
						}
					}

					for (int integer8x = 0; integer8x < integer5; integer8x++) {
						atl atl9 = ajs.o(co.b(integer8x));
						alu alu10 = atl9.v();
						if (atl9.a() == azs.a || atl9.a() == azs.j || alu10 == alv.i || alu10 == alv.j) {
							this.a(ajs, co.b(integer8x), a);
						}
					}

					for (int integer8xx = co.q() - 3 + integer5; integer8xx <= co.q() + integer5; integer8xx++) {
						int integer9 = integer8xx - (co.q() + integer5);
						int integer10 = 2 - integer9 / 2;
						co.a a11 = new co.a();

						for (int integer12 = co.p() - integer10; integer12 <= co.p() + integer10; integer12++) {
							for (int integer13x = co.r() - integer10; integer13x <= co.r() + integer10; integer13x++) {
								a11.c(integer12, integer8xx, integer13x);
								if (ajs.o(a11).a() == azs.j) {
									co co14 = a11.e();
									co co15 = a11.f();
									co co16 = a11.c();
									co co17 = a11.d();
									if (random.nextInt(4) == 0 && ajs.o(co14).a() == azs.a) {
										this.a(ajs, co14, arp.c);
									}

									if (random.nextInt(4) == 0 && ajs.o(co15).a() == azs.a) {
										this.a(ajs, co15, arp.e);
									}

									if (random.nextInt(4) == 0 && ajs.o(co16).a() == azs.a) {
										this.a(ajs, co16, arp.d);
									}

									if (random.nextInt(4) == 0 && ajs.o(co17).a() == azs.a) {
										this.a(ajs, co17, arp.b);
									}
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

	private void a(ajs ajs, co co, atx atx) {
		atl atl5 = alv.bn.t().a(atx, true);
		this.a(ajs, co, atl5);
		int integer6 = 4;

		for (co var6 = co.b(); ajs.o(var6).a() == azs.a && integer6 > 0; integer6--) {
			this.a(ajs, var6, atl5);
			var6 = var6.b();
		}
	}
}

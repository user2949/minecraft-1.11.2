import java.util.Random;

public class axq extends avz {
	private static final atl a = alv.r.t().a(apk.b, apn.a.OAK);
	private static final atl b = alv.t.t().a(apj.e, apn.a.OAK).a(aon.b, false);
	private final int c;
	private final boolean d;
	private final atl e;
	private final atl f;

	public axq(boolean boolean1) {
		this(boolean1, 4, a, b, false);
	}

	public axq(boolean boolean1, int integer, atl atl3, atl atl4, boolean boolean5) {
		super(boolean1);
		this.c = integer;
		this.e = atl3;
		this.f = atl4;
		this.d = boolean5;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		int integer5 = random.nextInt(3) + this.c;
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
				if ((alu7 == alv.c || alu7 == alv.d || alu7 == alv.ak) && co.q() < 256 - integer5 - 1) {
					this.a(ajs, co.b());
					int integer8x = 3;
					int integer9 = 0;

					for (int integer10 = co.q() - 3 + integer5; integer10 <= co.q() + integer5; integer10++) {
						int integer11x = integer10 - (co.q() + integer5);
						int integer12 = 1 - integer11x / 2;

						for (int integer13 = co.p() - integer12; integer13 <= co.p() + integer12; integer13++) {
							int integer14 = integer13 - co.p();

							for (int integer15 = co.r() - integer12; integer15 <= co.r() + integer12; integer15++) {
								int integer16 = integer15 - co.r();
								if (Math.abs(integer14) != integer12 || Math.abs(integer16) != integer12 || random.nextInt(2) != 0 && integer11x != 0) {
									co co17 = new co(integer13, integer10, integer15);
									azs azs18 = ajs.o(co17).a();
									if (azs18 == azs.a || azs18 == azs.j || azs18 == azs.l) {
										this.a(ajs, co17, this.f);
									}
								}
							}
						}
					}

					for (int integer10 = 0; integer10 < integer5; integer10++) {
						azs azs11 = ajs.o(co.b(integer10)).a();
						if (azs11 == azs.a || azs11 == azs.j || azs11 == azs.l) {
							this.a(ajs, co.b(integer10), this.e);
							if (this.d && integer10 > 0) {
								if (random.nextInt(3) > 0 && ajs.d(co.a(-1, integer10, 0))) {
									this.a(ajs, co.a(-1, integer10, 0), arp.c);
								}

								if (random.nextInt(3) > 0 && ajs.d(co.a(1, integer10, 0))) {
									this.a(ajs, co.a(1, integer10, 0), arp.e);
								}

								if (random.nextInt(3) > 0 && ajs.d(co.a(0, integer10, -1))) {
									this.a(ajs, co.a(0, integer10, -1), arp.d);
								}

								if (random.nextInt(3) > 0 && ajs.d(co.a(0, integer10, 1))) {
									this.a(ajs, co.a(0, integer10, 1), arp.b);
								}
							}
						}
					}

					if (this.d) {
						for (int integer10x = co.q() - 3 + integer5; integer10x <= co.q() + integer5; integer10x++) {
							int integer11x = integer10x - (co.q() + integer5);
							int integer12 = 2 - integer11x / 2;
							co.a a13 = new co.a();

							for (int integer14 = co.p() - integer12; integer14 <= co.p() + integer12; integer14++) {
								for (int integer15x = co.r() - integer12; integer15x <= co.r() + integer12; integer15x++) {
									a13.c(integer14, integer10x, integer15x);
									if (ajs.o(a13).a() == azs.j) {
										co co16 = a13.e();
										co co17 = a13.f();
										co co18 = a13.c();
										co co19 = a13.d();
										if (random.nextInt(4) == 0 && ajs.o(co16).a() == azs.a) {
											this.b(ajs, co16, arp.c);
										}

										if (random.nextInt(4) == 0 && ajs.o(co17).a() == azs.a) {
											this.b(ajs, co17, arp.e);
										}

										if (random.nextInt(4) == 0 && ajs.o(co18).a() == azs.a) {
											this.b(ajs, co18, arp.d);
										}

										if (random.nextInt(4) == 0 && ajs.o(co19).a() == azs.a) {
											this.b(ajs, co19, arp.b);
										}
									}
								}
							}
						}

						if (random.nextInt(5) == 0 && integer5 > 5) {
							for (int integer10x = 0; integer10x < 2; integer10x++) {
								for (cv cv12 : cv.c.HORIZONTAL) {
									if (random.nextInt(4 - integer10x) == 0) {
										cv cv13 = cv12.d();
										this.a(ajs, random.nextInt(3), co.a(cv13.g(), integer5 - 5 + integer10x, cv13.i()), cv12);
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

	private void a(ajs ajs, int integer, co co, cv cv) {
		this.a(ajs, co, alv.bN.t().a(amk.a, integer).a(amk.D, cv));
	}

	private void a(ajs ajs, co co, atx atx) {
		this.a(ajs, co, alv.bn.t().a(atx, true));
	}

	private void b(ajs ajs, co co, atx atx) {
		this.a(ajs, co, atx);
		int integer5 = 4;

		for (co var5 = co.b(); ajs.o(var5).a() == azs.a && integer5 > 0; integer5--) {
			this.a(ajs, var5, atx);
			var5 = var5.b();
		}
	}
}

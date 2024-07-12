import java.util.Random;

public class axf extends avz {
	private static final atl a = alv.r.t().a(apk.b, apn.a.SPRUCE);
	private static final atl b = alv.t.t().a(apj.e, apn.a.SPRUCE).a(aon.b, false);

	public axf() {
		super(false);
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		int integer5 = random.nextInt(5) + 7;
		int integer6 = integer5 - random.nextInt(2) - 3;
		int integer7 = integer5 - integer6;
		int integer8 = 1 + random.nextInt(integer7 + 1);
		if (co.q() >= 1 && co.q() + integer5 + 1 <= 256) {
			boolean boolean9 = true;

			for (int integer10 = co.q(); integer10 <= co.q() + 1 + integer5 && boolean9; integer10++) {
				int integer11 = 1;
				if (integer10 - co.q() < integer6) {
					integer11 = 0;
				} else {
					integer11 = integer8;
				}

				co.a a12 = new co.a();

				for (int integer13 = co.p() - integer11; integer13 <= co.p() + integer11 && boolean9; integer13++) {
					for (int integer14 = co.r() - integer11; integer14 <= co.r() + integer11 && boolean9; integer14++) {
						if (integer10 < 0 || integer10 >= 256) {
							boolean9 = false;
						} else if (!this.a(ajs.o(a12.c(integer13, integer10, integer14)).v())) {
							boolean9 = false;
						}
					}
				}
			}

			if (!boolean9) {
				return false;
			} else {
				alu alu10 = ajs.o(co.b()).v();
				if ((alu10 == alv.c || alu10 == alv.d) && co.q() < 256 - integer5 - 1) {
					this.a(ajs, co.b());
					int integer11 = 0;

					for (int integer12 = co.q() + integer5; integer12 >= co.q() + integer6; integer12--) {
						for (int integer13 = co.p() - integer11; integer13 <= co.p() + integer11; integer13++) {
							int integer14x = integer13 - co.p();

							for (int integer15 = co.r() - integer11; integer15 <= co.r() + integer11; integer15++) {
								int integer16 = integer15 - co.r();
								if (Math.abs(integer14x) != integer11 || Math.abs(integer16) != integer11 || integer11 <= 0) {
									co co17 = new co(integer13, integer12, integer15);
									if (!ajs.o(co17).b()) {
										this.a(ajs, co17, b);
									}
								}
							}
						}

						if (integer11 >= 1 && integer12 == co.q() + integer6 + 1) {
							integer11--;
						} else if (integer11 < integer8) {
							integer11++;
						}
					}

					for (int integer12 = 0; integer12 < integer5 - 1; integer12++) {
						azs azs13 = ajs.o(co.b(integer12)).a();
						if (azs13 == azs.a || azs13 == azs.j) {
							this.a(ajs, co.b(integer12), a);
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
}

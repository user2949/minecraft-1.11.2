import java.util.Random;

public class axn extends avz {
	private static final atl a = alv.r.t().a(apk.b, apn.a.SPRUCE);
	private static final atl b = alv.t.t().a(apj.e, apn.a.SPRUCE).a(aon.b, false);

	public axn(boolean boolean1) {
		super(boolean1);
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		int integer5 = random.nextInt(4) + 6;
		int integer6 = 1 + random.nextInt(2);
		int integer7 = integer5 - integer6;
		int integer8 = 2 + random.nextInt(2);
		boolean boolean9 = true;
		if (co.q() >= 1 && co.q() + integer5 + 1 <= 256) {
			for (int integer10 = co.q(); integer10 <= co.q() + 1 + integer5 && boolean9; integer10++) {
				int integer11;
				if (integer10 - co.q() < integer6) {
					integer11 = 0;
				} else {
					integer11 = integer8;
				}

				co.a a12 = new co.a();

				for (int integer13 = co.p() - integer11; integer13 <= co.p() + integer11 && boolean9; integer13++) {
					for (int integer14 = co.r() - integer11; integer14 <= co.r() + integer11 && boolean9; integer14++) {
						if (integer10 >= 0 && integer10 < 256) {
							azs azs15 = ajs.o(a12.c(integer13, integer10, integer14)).a();
							if (azs15 != azs.a && azs15 != azs.j) {
								boolean9 = false;
							}
						} else {
							boolean9 = false;
						}
					}
				}
			}

			if (!boolean9) {
				return false;
			} else {
				alu alu10 = ajs.o(co.b()).v();
				if ((alu10 == alv.c || alu10 == alv.d || alu10 == alv.ak) && co.q() < 256 - integer5 - 1) {
					this.a(ajs, co.b());
					int integer11 = random.nextInt(2);
					int integer12 = 1;
					int integer13 = 0;

					for (int integer14x = 0; integer14x <= integer7; integer14x++) {
						int integer15 = co.q() + integer5 - integer14x;

						for (int integer16 = co.p() - integer11; integer16 <= co.p() + integer11; integer16++) {
							int integer17 = integer16 - co.p();

							for (int integer18 = co.r() - integer11; integer18 <= co.r() + integer11; integer18++) {
								int integer19 = integer18 - co.r();
								if (Math.abs(integer17) != integer11 || Math.abs(integer19) != integer11 || integer11 <= 0) {
									co co20 = new co(integer16, integer15, integer18);
									if (!ajs.o(co20).b()) {
										this.a(ajs, co20, b);
									}
								}
							}
						}

						if (integer11 >= integer12) {
							integer11 = integer13;
							integer13 = 1;
							if (++integer12 > integer8) {
								integer12 = integer8;
							}
						} else {
							integer11++;
						}
					}

					int integer14x = random.nextInt(3);

					for (int integer15 = 0; integer15 < integer5 - integer14x; integer15++) {
						azs azs16 = ajs.o(co.b(integer15)).a();
						if (azs16 == azs.a || azs16 == azs.j) {
							this.a(ajs, co.b(integer15), a);
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

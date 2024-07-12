import java.util.Random;

public class awu extends awn {
	private final alu a;

	public awu(alu alu) {
		super(true);
		this.a = alu;
	}

	public awu() {
		super(false);
		this.a = null;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		alu alu5 = this.a;
		if (alu5 == null) {
			alu5 = random.nextBoolean() ? alv.bg : alv.bh;
		}

		int integer6 = random.nextInt(3) + 4;
		if (random.nextInt(12) == 0) {
			integer6 *= 2;
		}

		boolean boolean7 = true;
		if (co.q() >= 1 && co.q() + integer6 + 1 < 256) {
			for (int integer8 = co.q(); integer8 <= co.q() + 1 + integer6; integer8++) {
				int integer9 = 3;
				if (integer8 <= co.q() + 3) {
					integer9 = 0;
				}

				co.a a10 = new co.a();

				for (int integer11 = co.p() - integer9; integer11 <= co.p() + integer9 && boolean7; integer11++) {
					for (int integer12 = co.r() - integer9; integer12 <= co.r() + integer9 && boolean7; integer12++) {
						if (integer8 >= 0 && integer8 < 256) {
							azs azs13 = ajs.o(a10.c(integer11, integer8, integer12)).a();
							if (azs13 != azs.a && azs13 != azs.j) {
								boolean7 = false;
							}
						} else {
							boolean7 = false;
						}
					}
				}
			}

			if (!boolean7) {
				return false;
			} else {
				alu alu8 = ajs.o(co.b()).v();
				if (alu8 != alv.d && alu8 != alv.c && alu8 != alv.bw) {
					return false;
				} else {
					int integer9 = co.q() + integer6;
					if (alu5 == alv.bh) {
						integer9 = co.q() + integer6 - 3;
					}

					for (int integer10 = integer9; integer10 <= co.q() + integer6; integer10++) {
						int integer11 = 1;
						if (integer10 < co.q() + integer6) {
							integer11++;
						}

						if (alu5 == alv.bg) {
							integer11 = 3;
						}

						int integer12x = co.p() - integer11;
						int integer13 = co.p() + integer11;
						int integer14 = co.r() - integer11;
						int integer15 = co.r() + integer11;

						for (int integer16 = integer12x; integer16 <= integer13; integer16++) {
							for (int integer17 = integer14; integer17 <= integer15; integer17++) {
								int integer18 = 5;
								if (integer16 == integer12x) {
									integer18--;
								} else if (integer16 == integer13) {
									integer18++;
								}

								if (integer17 == integer14) {
									integer18 -= 3;
								} else if (integer17 == integer15) {
									integer18 += 3;
								}

								aoj.a a19 = aoj.a.a(integer18);
								if (alu5 == alv.bg || integer10 < co.q() + integer6) {
									if ((integer16 == integer12x || integer16 == integer13) && (integer17 == integer14 || integer17 == integer15)) {
										continue;
									}

									if (integer16 == co.p() - (integer11 - 1) && integer17 == integer14) {
										a19 = aoj.a.NORTH_WEST;
									}

									if (integer16 == integer12x && integer17 == co.r() - (integer11 - 1)) {
										a19 = aoj.a.NORTH_WEST;
									}

									if (integer16 == co.p() + (integer11 - 1) && integer17 == integer14) {
										a19 = aoj.a.NORTH_EAST;
									}

									if (integer16 == integer13 && integer17 == co.r() - (integer11 - 1)) {
										a19 = aoj.a.NORTH_EAST;
									}

									if (integer16 == co.p() - (integer11 - 1) && integer17 == integer15) {
										a19 = aoj.a.SOUTH_WEST;
									}

									if (integer16 == integer12x && integer17 == co.r() + (integer11 - 1)) {
										a19 = aoj.a.SOUTH_WEST;
									}

									if (integer16 == co.p() + (integer11 - 1) && integer17 == integer15) {
										a19 = aoj.a.SOUTH_EAST;
									}

									if (integer16 == integer13 && integer17 == co.r() + (integer11 - 1)) {
										a19 = aoj.a.SOUTH_EAST;
									}
								}

								if (a19 == aoj.a.CENTER && integer10 < co.q() + integer6) {
									a19 = aoj.a.ALL_INSIDE;
								}

								if (co.q() >= co.q() + integer6 - 1 || a19 != aoj.a.ALL_INSIDE) {
									co co20 = new co(integer16, integer10, integer17);
									if (!ajs.o(co20).b()) {
										this.a(ajs, co20, alu5.t().a(aoj.a, a19));
									}
								}
							}
						}
					}

					for (int integer10 = 0; integer10 < integer6; integer10++) {
						atl atl11 = ajs.o(co.b(integer10));
						if (!atl11.b()) {
							this.a(ajs, co.b(integer10), alu5.t().a(aoj.a, aoj.a.STEM));
						}
					}

					return true;
				}
			}
		} else {
			return false;
		}
	}
}

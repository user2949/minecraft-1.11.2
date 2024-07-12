import java.util.Random;

public abstract class aon extends alu {
	public static final atx a = atx.a("decayable");
	public static final atx b = atx.a("check_decay");
	protected boolean c;
	int[] d;

	public aon() {
		super(azs.j);
		this.a(true);
		this.a(aej.c);
		this.c(0.2F);
		this.d(1);
		this.a(aqu.c);
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		int integer5 = 1;
		int integer6 = 2;
		int integer7 = co.p();
		int integer8 = co.q();
		int integer9 = co.r();
		if (ajs.a(new co(integer7 - 2, integer8 - 2, integer9 - 2), new co(integer7 + 2, integer8 + 2, integer9 + 2))) {
			for (int integer10 = -1; integer10 <= 1; integer10++) {
				for (int integer11 = -1; integer11 <= 1; integer11++) {
					for (int integer12 = -1; integer12 <= 1; integer12++) {
						co co13 = co.a(integer10, integer11, integer12);
						atl atl14 = ajs.o(co13);
						if (atl14.a() == azs.j && !(Boolean)atl14.c(b)) {
							ajs.a(co13, atl14.a(b, true), 4);
						}
					}
				}
			}
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			if ((Boolean)atl.c(b) && (Boolean)atl.c(a)) {
				int integer6 = 4;
				int integer7 = 5;
				int integer8 = co.p();
				int integer9 = co.q();
				int integer10 = co.r();
				int integer11 = 32;
				int integer12 = 1024;
				int integer13 = 16;
				if (this.d == null) {
					this.d = new int[32768];
				}

				if (ajs.a(new co(integer8 - 5, integer9 - 5, integer10 - 5), new co(integer8 + 5, integer9 + 5, integer10 + 5))) {
					co.a a14 = new co.a();

					for (int integer15 = -4; integer15 <= 4; integer15++) {
						for (int integer16 = -4; integer16 <= 4; integer16++) {
							for (int integer17 = -4; integer17 <= 4; integer17++) {
								atl atl18 = ajs.o(a14.c(integer8 + integer15, integer9 + integer16, integer10 + integer17));
								alu alu19 = atl18.v();
								if (alu19 != alv.r && alu19 != alv.s) {
									if (atl18.a() == azs.j) {
										this.d[(integer15 + 16) * 1024 + (integer16 + 16) * 32 + integer17 + 16] = -2;
									} else {
										this.d[(integer15 + 16) * 1024 + (integer16 + 16) * 32 + integer17 + 16] = -1;
									}
								} else {
									this.d[(integer15 + 16) * 1024 + (integer16 + 16) * 32 + integer17 + 16] = 0;
								}
							}
						}
					}

					for (int integer15 = 1; integer15 <= 4; integer15++) {
						for (int integer16 = -4; integer16 <= 4; integer16++) {
							for (int integer17x = -4; integer17x <= 4; integer17x++) {
								for (int integer18 = -4; integer18 <= 4; integer18++) {
									if (this.d[(integer16 + 16) * 1024 + (integer17x + 16) * 32 + integer18 + 16] == integer15 - 1) {
										if (this.d[(integer16 + 16 - 1) * 1024 + (integer17x + 16) * 32 + integer18 + 16] == -2) {
											this.d[(integer16 + 16 - 1) * 1024 + (integer17x + 16) * 32 + integer18 + 16] = integer15;
										}

										if (this.d[(integer16 + 16 + 1) * 1024 + (integer17x + 16) * 32 + integer18 + 16] == -2) {
											this.d[(integer16 + 16 + 1) * 1024 + (integer17x + 16) * 32 + integer18 + 16] = integer15;
										}

										if (this.d[(integer16 + 16) * 1024 + (integer17x + 16 - 1) * 32 + integer18 + 16] == -2) {
											this.d[(integer16 + 16) * 1024 + (integer17x + 16 - 1) * 32 + integer18 + 16] = integer15;
										}

										if (this.d[(integer16 + 16) * 1024 + (integer17x + 16 + 1) * 32 + integer18 + 16] == -2) {
											this.d[(integer16 + 16) * 1024 + (integer17x + 16 + 1) * 32 + integer18 + 16] = integer15;
										}

										if (this.d[(integer16 + 16) * 1024 + (integer17x + 16) * 32 + (integer18 + 16 - 1)] == -2) {
											this.d[(integer16 + 16) * 1024 + (integer17x + 16) * 32 + (integer18 + 16 - 1)] = integer15;
										}

										if (this.d[(integer16 + 16) * 1024 + (integer17x + 16) * 32 + integer18 + 16 + 1] == -2) {
											this.d[(integer16 + 16) * 1024 + (integer17x + 16) * 32 + integer18 + 16 + 1] = integer15;
										}
									}
								}
							}
						}
					}
				}

				int integer14 = this.d[16912];
				if (integer14 >= 0) {
					ajs.a(co, atl.a(b, false), 4);
				} else {
					this.b(ajs, co);
				}
			}
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		if (ajs.B(co.a()) && !ajs.o(co.b()).r() && random.nextInt(15) == 1) {
			double double6 = (double)((float)co.p() + random.nextFloat());
			double double8 = (double)co.q() - 0.05;
			double double10 = (double)((float)co.r() + random.nextFloat());
			ajs.a(de.DRIP_WATER, double6, double8, double10, 0.0, 0.0, 0.0);
		}
	}

	private void b(ajs ajs, co co) {
		this.b(ajs, co, ajs.o(co), 0);
		ajs.g(co);
	}

	@Override
	public int a(Random random) {
		return random.nextInt(20) == 0 ? 1 : 0;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(alv.g);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		if (!ajs.E) {
			int integer7 = this.i(atl);
			if (integer > 0) {
				integer7 -= 2 << integer;
				if (integer7 < 10) {
					integer7 = 10;
				}
			}

			if (ajs.r.nextInt(integer7) == 0) {
				afh afh8 = this.a(atl, ajs.r, integer);
				a(ajs, co, new afj(afh8, 1, this.d(atl)));
			}

			integer7 = 200;
			if (integer > 0) {
				integer7 -= 10 << integer;
				if (integer7 < 40) {
					integer7 = 40;
				}
			}

			this.a(ajs, co, atl, integer7);
		}
	}

	protected void a(ajs ajs, co co, atl atl, int integer) {
	}

	protected int i(atl atl) {
		return 20;
	}

	@Override
	public boolean b(atl atl) {
		return !this.c;
	}

	public void b(boolean boolean1) {
		this.c = boolean1;
	}

	@Override
	public ajk f() {
		return this.c ? ajk.CUTOUT_MIPPED : ajk.SOLID;
	}

	@Override
	public boolean u(atl atl) {
		return false;
	}

	public abstract apn.a e(int integer);

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return !this.c && ajw.o(co.a(cv)).v() == this ? false : super.a(atl, ajw, co, cv);
	}
}

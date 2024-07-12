import java.util.Random;
import javax.annotation.Nullable;

public class arp extends alu {
	public static final atx a = atx.a("up");
	public static final atx b = atx.a("north");
	public static final atx c = atx.a("east");
	public static final atx d = atx.a("south");
	public static final atx e = atx.a("west");
	public static final atx[] f = new atx[]{a, b, d, e, c};
	protected static final bdt g = new bdt(0.0, 0.9375, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt B = new bdt(0.0, 0.0, 0.0, 0.0625, 1.0, 1.0);
	protected static final bdt C = new bdt(0.9375, 0.0, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt D = new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.0625);
	protected static final bdt E = new bdt(0.0, 0.0, 0.9375, 1.0, 1.0, 1.0);

	public arp() {
		super(azs.l);
		this.y(this.A.b().a(a, false).a(b, false).a(c, false).a(d, false).a(e, false));
		this.a(true);
		this.a(aej.c);
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		atl = atl.b(ajw, co);
		int integer5 = 0;
		bdt bdt6 = j;
		if ((Boolean)atl.c(a)) {
			bdt6 = g;
			integer5++;
		}

		if ((Boolean)atl.c(b)) {
			bdt6 = D;
			integer5++;
		}

		if ((Boolean)atl.c(c)) {
			bdt6 = C;
			integer5++;
		}

		if ((Boolean)atl.c(d)) {
			bdt6 = E;
			integer5++;
		}

		if ((Boolean)atl.c(e)) {
			bdt6 = B;
			integer5++;
		}

		return integer5 == 1 ? bdt6 : j;
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		return atl.a(a, ajw.o(co.a()).l());
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean a(ajw ajw, co co) {
		return true;
	}

	@Override
	public boolean b(ajs ajs, co co, cv cv) {
		switch (cv) {
			case UP:
				return this.z(ajs.o(co.a()));
			case NORTH:
			case SOUTH:
			case EAST:
			case WEST:
				return this.z(ajs.o(co.a(cv.d())));
			default:
				return false;
		}
	}

	private boolean z(atl atl) {
		return atl.h() && atl.a().c();
	}

	private boolean e(ajs ajs, co co, atl atl) {
		atl atl5 = atl;

		for (cv cv7 : cv.c.HORIZONTAL) {
			atx atx8 = a(cv7);
			if ((Boolean)atl.c(atx8) && !this.z(ajs.o(co.a(cv7)))) {
				atl atl9 = ajs.o(co.a());
				if (atl9.v() != this || !(Boolean)atl9.c(atx8)) {
					atl = atl.a(atx8, false);
				}
			}
		}

		if (i(atl) == 0) {
			return false;
		} else {
			if (atl5 != atl) {
				ajs.a(co, atl, 2);
			}

			return true;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E && !this.e(ajs, co3, atl)) {
			this.b(ajs, co3, atl, 0);
			ajs.g(co3);
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			if (ajs.r.nextInt(4) == 0) {
				int integer6 = 4;
				int integer7 = 5;
				boolean boolean8 = false;

				label189:
				for (int integer9 = -4; integer9 <= 4; integer9++) {
					for (int integer10 = -4; integer10 <= 4; integer10++) {
						for (int integer11 = -1; integer11 <= 1; integer11++) {
							if (ajs.o(co.a(integer9, integer11, integer10)).v() == this) {
								if (--integer7 <= 0) {
									boolean8 = true;
									break label189;
								}
							}
						}
					}
				}

				cv cv9 = cv.a(random);
				co co10 = co.a();
				if (cv9 == cv.UP && co.q() < 255 && ajs.d(co10)) {
					if (!boolean8) {
						atl atl11 = atl;

						for (cv cv13 : cv.c.HORIZONTAL) {
							if (random.nextBoolean() || !this.z(ajs.o(co10.a(cv13)))) {
								atl11 = atl11.a(a(cv13), false);
							}
						}

						if ((Boolean)atl11.c(b) || (Boolean)atl11.c(c) || (Boolean)atl11.c(d) || (Boolean)atl11.c(e)) {
							ajs.a(co10, atl11, 2);
						}
					}
				} else if (!cv9.k().c() || (Boolean)atl.c(a(cv9))) {
					if (co.q() > 1) {
						co co11 = co.b();
						atl atl12 = ajs.o(co11);
						alu alu13 = atl12.v();
						if (alu13.x == azs.a) {
							atl atl14 = atl;

							for (cv cv16 : cv.c.HORIZONTAL) {
								if (random.nextBoolean()) {
									atl14 = atl14.a(a(cv16), false);
								}
							}

							if ((Boolean)atl14.c(b) || (Boolean)atl14.c(c) || (Boolean)atl14.c(d) || (Boolean)atl14.c(e)) {
								ajs.a(co11, atl14, 2);
							}
						} else if (alu13 == this) {
							atl atl14 = atl12;

							for (cv cv16x : cv.c.HORIZONTAL) {
								atx atx17 = a(cv16x);
								if (random.nextBoolean() && (Boolean)atl.c(atx17)) {
									atl14 = atl14.a(atx17, true);
								}
							}

							if ((Boolean)atl14.c(b) || (Boolean)atl14.c(c) || (Boolean)atl14.c(d) || (Boolean)atl14.c(e)) {
								ajs.a(co11, atl14, 2);
							}
						}
					}
				} else if (!boolean8) {
					co co11 = co.a(cv9);
					atl atl12 = ajs.o(co11);
					alu alu13 = atl12.v();
					if (alu13.x == azs.a) {
						cv cv14 = cv9.e();
						cv cv15 = cv9.f();
						boolean boolean16 = (Boolean)atl.c(a(cv14));
						boolean boolean17 = (Boolean)atl.c(a(cv15));
						co co18 = co11.a(cv14);
						co co19 = co11.a(cv15);
						if (boolean16 && this.z(ajs.o(co18))) {
							ajs.a(co11, this.t().a(a(cv14), true), 2);
						} else if (boolean17 && this.z(ajs.o(co19))) {
							ajs.a(co11, this.t().a(a(cv15), true), 2);
						} else if (boolean16 && ajs.d(co18) && this.z(ajs.o(co.a(cv14)))) {
							ajs.a(co18, this.t().a(a(cv9.d()), true), 2);
						} else if (boolean17 && ajs.d(co19) && this.z(ajs.o(co.a(cv15)))) {
							ajs.a(co19, this.t().a(a(cv9.d()), true), 2);
						} else if (this.z(ajs.o(co11.a()))) {
							ajs.a(co11, this.t(), 2);
						}
					} else if (alu13.x.k() && atl12.h()) {
						ajs.a(co, atl.a(a(cv9), true), 2);
					}
				}
			}
		}
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		atl atl10 = this.t().a(a, false).a(b, false).a(c, false).a(d, false).a(e, false);
		return cv.k().c() ? atl10.a(a(cv.d()), true) : atl10;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.a;
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		if (!ajs.E && afj.c() == afl.bm) {
			aay.b(oa.a(this));
			a(ajs, co, new afj(alv.bn, 1, 0));
		} else {
			super.a(ajs, aay, co, atl, asc, afj);
		}
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(d, (integer & 1) > 0).a(e, (integer & 2) > 0).a(b, (integer & 4) > 0).a(c, (integer & 8) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		if ((Boolean)atl.c(d)) {
			integer3 |= 1;
		}

		if ((Boolean)atl.c(e)) {
			integer3 |= 2;
		}

		if ((Boolean)atl.c(b)) {
			integer3 |= 4;
		}

		if ((Boolean)atl.c(c)) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	protected atm b() {
		return new atm(this, a, b, c, d, e);
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case CLOCKWISE_180:
				return atl.a(b, atl.c(d)).a(c, atl.c(e)).a(d, atl.c(b)).a(e, atl.c(c));
			case COUNTERCLOCKWISE_90:
				return atl.a(b, atl.c(c)).a(c, atl.c(d)).a(d, atl.c(e)).a(e, atl.c(b));
			case CLOCKWISE_90:
				return atl.a(b, atl.c(e)).a(c, atl.c(b)).a(d, atl.c(c)).a(e, atl.c(d));
			default:
				return atl;
		}
	}

	@Override
	public atl a(atl atl, aou aou) {
		switch (aou) {
			case LEFT_RIGHT:
				return atl.a(b, atl.c(d)).a(d, atl.c(b));
			case FRONT_BACK:
				return atl.a(c, atl.c(e)).a(e, atl.c(c));
			default:
				return super.a(atl, aou);
		}
	}

	public static atx a(cv cv) {
		switch (cv) {
			case UP:
				return a;
			case NORTH:
				return b;
			case SOUTH:
				return d;
			case EAST:
				return c;
			case WEST:
				return e;
			default:
				throw new IllegalArgumentException(cv + " is an invalid choice");
		}
	}

	public static int i(atl atl) {
		int integer2 = 0;

		for (atx atx6 : f) {
			if ((Boolean)atl.c(atx6)) {
				integer2++;
			}
		}

		return integer2;
	}
}

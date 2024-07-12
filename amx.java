import java.util.Random;

public class amx extends alu {
	public static final aty a = aoi.D;
	public static final atx b = atx.a("open");
	public static final atz<amx.b> c = atz.a("hinge", amx.b.class);
	public static final atx d = atx.a("powered");
	public static final atz<amx.a> e = atz.a("half", amx.a.class);
	protected static final bdt f = new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
	protected static final bdt g = new bdt(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);
	protected static final bdt B = new bdt(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt C = new bdt(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);

	protected amx(azs azs) {
		super(azs);
		this.y(this.A.b().a(a, cv.NORTH).a(b, false).a(c, amx.b.LEFT).a(d, false).a(e, amx.a.LOWER));
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		atl = atl.b(ajw, co);
		cv cv5 = atl.c(a);
		boolean boolean6 = !(Boolean)atl.c(b);
		boolean boolean7 = atl.c(c) == amx.b.RIGHT;
		switch (cv5) {
			case EAST:
			default:
				return boolean6 ? C : (boolean7 ? g : f);
			case SOUTH:
				return boolean6 ? f : (boolean7 ? C : B);
			case WEST:
				return boolean6 ? B : (boolean7 ? f : g);
			case NORTH:
				return boolean6 ? g : (boolean7 ? B : C);
		}
	}

	@Override
	public String c() {
		return dp.a((this.a() + ".name").replaceAll("tile", "item"));
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean b(ajw ajw, co co) {
		return g(c(ajw, co));
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	private int e() {
		return this.x == azs.f ? 1011 : 1012;
	}

	private int g() {
		return this.x == azs.f ? 1005 : 1006;
	}

	@Override
	public azt r(atl atl) {
		if (atl.v() == alv.aA) {
			return azt.h;
		} else if (atl.v() == alv.ao) {
			return apn.a.OAK.c();
		} else if (atl.v() == alv.ap) {
			return apn.a.SPRUCE.c();
		} else if (atl.v() == alv.aq) {
			return apn.a.BIRCH.c();
		} else if (atl.v() == alv.ar) {
			return apn.a.JUNGLE.c();
		} else if (atl.v() == alv.as) {
			return apn.a.ACACIA.c();
		} else {
			return atl.v() == alv.at ? apn.a.DARK_OAK.c() : super.r(atl);
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (this.x == azs.f) {
			return false;
		} else {
			co co11 = atl.c(e) == amx.a.LOWER ? co : co.b();
			atl atl12 = co.equals(co11) ? atl : ajs.o(co11);
			if (atl12.v() != this) {
				return false;
			} else {
				atl = atl12.a(b);
				ajs.a(co11, atl, 10);
				ajs.b(co11, co);
				ajs.a(aay, atl.c(b) ? this.g() : this.e(), co, 0);
				return true;
			}
		}
	}

	public void a(ajs ajs, co co, boolean boolean3) {
		atl atl5 = ajs.o(co);
		if (atl5.v() == this) {
			co co6 = atl5.c(e) == amx.a.LOWER ? co : co.b();
			atl atl7 = co == co6 ? atl5 : ajs.o(co6);
			if (atl7.v() == this && (Boolean)atl7.c(b) != boolean3) {
				ajs.a(co6, atl7.a(b, boolean3), 10);
				ajs.b(co6, co);
				ajs.a(null, boolean3 ? this.g() : this.e(), co, 0);
			}
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (atl.c(e) == amx.a.UPPER) {
			co co7 = co3.b();
			atl atl8 = ajs.o(co7);
			if (atl8.v() != this) {
				ajs.g(co3);
			} else if (alu != this) {
				atl8.a(ajs, co7, alu, co5);
			}
		} else {
			boolean boolean7 = false;
			co co8 = co3.a();
			atl atl9 = ajs.o(co8);
			if (atl9.v() != this) {
				ajs.g(co3);
				boolean7 = true;
			}

			if (!ajs.o(co3.b()).r()) {
				ajs.g(co3);
				boolean7 = true;
				if (atl9.v() == this) {
					ajs.g(co8);
				}
			}

			if (boolean7) {
				if (!ajs.E) {
					this.b(ajs, co3, atl, 0);
				}
			} else {
				boolean boolean10 = ajs.y(co3) || ajs.y(co8);
				if (alu != this && (boolean10 || alu.t().n()) && boolean10 != (Boolean)atl9.c(d)) {
					ajs.a(co8, atl9.a(d, boolean10), 2);
					if (boolean10 != (Boolean)atl.c(b)) {
						ajs.a(co3, atl.a(b, boolean10), 2);
						ajs.b(co3, co3);
						ajs.a(null, boolean10 ? this.g() : this.e(), co3, 0);
					}
				}
			}
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return atl.c(e) == amx.a.UPPER ? afl.a : this.h();
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return co.q() >= 255 ? false : ajs.o(co.b()).r() && super.a(ajs, co) && super.a(ajs, co.a());
	}

	@Override
	public azv h(atl atl) {
		return azv.DESTROY;
	}

	public static int c(ajw ajw, co co) {
		atl atl3 = ajw.o(co);
		int integer4 = atl3.v().e(atl3);
		boolean boolean5 = i(integer4);
		atl atl6 = ajw.o(co.b());
		int integer7 = atl6.v().e(atl6);
		int integer8 = boolean5 ? integer7 : integer4;
		atl atl9 = ajw.o(co.a());
		int integer10 = atl9.v().e(atl9);
		int integer11 = boolean5 ? integer4 : integer10;
		boolean boolean12 = (integer11 & 1) != 0;
		boolean boolean13 = (integer11 & 2) != 0;
		return e(integer8) | (boolean5 ? 8 : 0) | (boolean12 ? 16 : 0) | (boolean13 ? 32 : 0);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(this.h());
	}

	private afh h() {
		if (this == alv.aA) {
			return afl.aE;
		} else if (this == alv.ap) {
			return afl.au;
		} else if (this == alv.aq) {
			return afl.av;
		} else if (this == alv.ar) {
			return afl.aw;
		} else if (this == alv.as) {
			return afl.ax;
		} else {
			return this == alv.at ? afl.ay : afl.at;
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, aay aay) {
		co co6 = co.b();
		co co7 = co.a();
		if (aay.bK.d && atl.c(e) == amx.a.UPPER && ajs.o(co6).v() == this) {
			ajs.g(co6);
		}

		if (atl.c(e) == amx.a.LOWER && ajs.o(co7).v() == this) {
			if (aay.bK.d) {
				ajs.g(co);
			}

			ajs.g(co7);
		}
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		if (atl.c(e) == amx.a.LOWER) {
			atl atl5 = ajw.o(co.a());
			if (atl5.v() == this) {
				atl = atl.a(c, atl5.c(c)).a(d, atl5.c(d));
			}
		} else {
			atl atl5 = ajw.o(co.b());
			if (atl5.v() == this) {
				atl = atl.a(a, atl5.c(a)).a(b, atl5.c(b));
			}
		}

		return atl;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.c(e) != amx.a.LOWER ? atl : atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return aou == aou.NONE ? atl : atl.a(aou.a(atl.c(a))).a(c);
	}

	@Override
	public atl a(int integer) {
		return (integer & 8) > 0
			? this.t().a(e, amx.a.UPPER).a(c, (integer & 1) > 0 ? amx.b.RIGHT : amx.b.LEFT).a(d, (integer & 2) > 0)
			: this.t().a(e, amx.a.LOWER).a(a, cv.b(integer & 3).f()).a(b, (integer & 4) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		if (atl.c(e) == amx.a.UPPER) {
			integer3 |= 8;
			if (atl.c(c) == amx.b.RIGHT) {
				integer3 |= 1;
			}

			if ((Boolean)atl.c(d)) {
				integer3 |= 2;
			}
		} else {
			integer3 |= ((cv)atl.c(a)).e().b();
			if ((Boolean)atl.c(b)) {
				integer3 |= 4;
			}
		}

		return integer3;
	}

	protected static int e(int integer) {
		return integer & 7;
	}

	public static boolean d(ajw ajw, co co) {
		return g(c(ajw, co));
	}

	public static cv f(ajw ajw, co co) {
		return f(c(ajw, co));
	}

	public static cv f(int integer) {
		return cv.b(integer & 3).f();
	}

	protected static boolean g(int integer) {
		return (integer & 4) != 0;
	}

	protected static boolean i(int integer) {
		return (integer & 8) != 0;
	}

	@Override
	protected atm b() {
		return new atm(this, e, a, b, c, d);
	}

	public static enum a implements ox {
		UPPER,
		LOWER;

		public String toString() {
			return this.m();
		}

		@Override
		public String m() {
			return this == UPPER ? "upper" : "lower";
		}
	}

	public static enum b implements ox {
		LEFT,
		RIGHT;

		public String toString() {
			return this.m();
		}

		@Override
		public String m() {
			return this == LEFT ? "left" : "right";
		}
	}
}

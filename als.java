import java.util.Random;
import javax.annotation.Nullable;

public class als extends aoi {
	public static final atz<als.a> a = atz.a("part", als.a.class);
	public static final atx b = atx.a("occupied");
	protected static final bdt c = new bdt(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0);

	public als() {
		super(azs.n);
		this.y(this.A.b().a(a, als.a.FOOT).a(b, false));
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			if (atl.c(a) != als.a.HEAD) {
				co = co.a(atl.c(D));
				atl = ajs.o(co);
				if (atl.v() != this) {
					return true;
				}
			}

			if (ajs.s.e() && ajs.b(co) != akk.j) {
				if ((Boolean)atl.c(b)) {
					aay aay11 = this.c(ajs, co);
					if (aay11 != null) {
						aay.a(new fi("tile.bed.occupied"), true);
						return true;
					}

					atl = atl.a(b, false);
					ajs.a(co, atl, 4);
				}

				aay.a a11 = aay.a(co);
				if (a11 == aay.a.OK) {
					atl = atl.a(b, true);
					ajs.a(co, atl, 4);
					return true;
				} else {
					if (a11 == aay.a.NOT_POSSIBLE_NOW) {
						aay.a(new fi("tile.bed.noSleep"), true);
					} else if (a11 == aay.a.NOT_SAFE) {
						aay.a(new fi("tile.bed.notSafe"), true);
					} else if (a11 == aay.a.TOO_FAR_AWAY) {
						aay.a(new fi("tile.bed.tooFarAway"), true);
					}

					return true;
				}
			} else {
				ajs.g(co);
				co co11 = co.a(((cv)atl.c(D)).d());
				if (ajs.o(co11).v() == this) {
					ajs.g(co11);
				}

				ajs.a(null, (double)co.p() + 0.5, (double)co.q() + 0.5, (double)co.r() + 0.5, 5.0F, true, true);
				return true;
			}
		}
	}

	@Nullable
	private aay c(ajs ajs, co co) {
		for (aay aay5 : ajs.i) {
			if (aay5.cr() && aay5.bH.equals(co)) {
				return aay5;
			}
		}

		return null;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		cv cv7 = atl.c(D);
		if (atl.c(a) == als.a.HEAD) {
			if (ajs.o(co3.a(cv7.d())).v() != this) {
				ajs.g(co3);
			}
		} else if (ajs.o(co3.a(cv7)).v() != this) {
			ajs.g(co3);
			if (!ajs.E) {
				this.b(ajs, co3, atl, 0);
			}
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return atl.c(a) == als.a.HEAD ? afl.a : afl.bi;
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return c;
	}

	@Nullable
	public static co a(ajs ajs, co co, int integer) {
		cv cv4 = ajs.o(co).c(D);
		int integer5 = co.p();
		int integer6 = co.q();
		int integer7 = co.r();

		for (int integer8 = 0; integer8 <= 1; integer8++) {
			int integer9 = integer5 - cv4.g() * integer8 - 1;
			int integer10 = integer7 - cv4.i() * integer8 - 1;
			int integer11 = integer9 + 2;
			int integer12 = integer10 + 2;

			for (int integer13 = integer9; integer13 <= integer11; integer13++) {
				for (int integer14 = integer10; integer14 <= integer12; integer14++) {
					co co15 = new co(integer13, integer6, integer14);
					if (b(ajs, co15)) {
						if (integer <= 0) {
							return co15;
						}

						integer--;
					}
				}
			}
		}

		return null;
	}

	protected static boolean b(ajs ajs, co co) {
		return ajs.o(co.b()).r() && !ajs.o(co).a().a() && !ajs.o(co.a()).a().a();
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		if (atl.c(a) == als.a.FOOT) {
			super.a(ajs, co, atl, float4, 0);
		}
	}

	@Override
	public azv h(atl atl) {
		return azv.DESTROY;
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.bi);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, aay aay) {
		if (aay.bK.d && atl.c(a) == als.a.HEAD) {
			co co6 = co.a(((cv)atl.c(D)).d());
			if (ajs.o(co6).v() == this) {
				ajs.g(co6);
			}
		}
	}

	@Override
	public atl a(int integer) {
		cv cv3 = cv.b(integer);
		return (integer & 8) > 0 ? this.t().a(a, als.a.HEAD).a(D, cv3).a(b, (integer & 4) > 0) : this.t().a(a, als.a.FOOT).a(D, cv3);
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		if (atl.c(a) == als.a.FOOT) {
			atl atl5 = ajw.o(co.a(atl.c(D)));
			if (atl5.v() == this) {
				atl = atl.a(b, atl5.c(b));
			}
		}

		return atl;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(D, aqi.a(atl.c(D)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(D)));
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(D)).b();
		if (atl.c(a) == als.a.HEAD) {
			integer3 |= 8;
			if ((Boolean)atl.c(b)) {
				integer3 |= 4;
			}
		}

		return integer3;
	}

	@Override
	protected atm b() {
		return new atm(this, D, a, b);
	}

	public static enum a implements ox {
		HEAD("head"),
		FOOT("foot");

		private final String c;

		private a(String string3) {
			this.c = string3;
		}

		public String toString() {
			return this.c;
		}

		@Override
		public String m() {
			return this.c;
		}
	}
}

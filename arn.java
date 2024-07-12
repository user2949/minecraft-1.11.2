import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class arn extends alu {
	public static final atx a = atx.a("powered");
	public static final atx b = atx.a("attached");
	public static final atx c = atx.a("disarmed");
	public static final atx d = atx.a("north");
	public static final atx e = atx.a("east");
	public static final atx f = atx.a("south");
	public static final atx g = atx.a("west");
	protected static final bdt B = new bdt(0.0, 0.0625, 0.0, 1.0, 0.15625, 1.0);
	protected static final bdt C = new bdt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);

	public arn() {
		super(azs.q);
		this.y(this.A.b().a(a, false).a(b, false).a(c, false).a(d, false).a(e, false).a(f, false).a(g, false));
		this.a(true);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return !atl.c(b) ? C : B;
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		return atl.a(d, a(ajw, co, atl, cv.NORTH)).a(e, a(ajw, co, atl, cv.EAST)).a(f, a(ajw, co, atl, cv.SOUTH)).a(g, a(ajw, co, atl, cv.WEST));
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
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
	public ajk f() {
		return ajk.TRANSLUCENT;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.I;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.I);
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		ajs.a(co, atl, 3);
		this.e(ajs, co, atl);
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		this.e(ajs, co, atl.a(a, true));
	}

	@Override
	public void a(ajs ajs, co co, atl atl, aay aay) {
		if (!ajs.E) {
			if (!aay.cg().b() && aay.cg().c() == afl.bm) {
				ajs.a(co, atl.a(c, true), 4);
			}
		}
	}

	private void e(ajs ajs, co co, atl atl) {
		for (cv cv8 : new cv[]{cv.SOUTH, cv.WEST}) {
			for (int integer9 = 1; integer9 < 42; integer9++) {
				co co10 = co.a(cv8, integer9);
				atl atl11 = ajs.o(co10);
				if (atl11.v() == alv.bR) {
					if (atl11.c(aro.a) == cv8.d()) {
						alv.bR.a(ajs, co10, atl11, false, true, integer9, atl);
					}
					break;
				}

				if (atl11.v() != alv.bS) {
					break;
				}
			}
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		if (!ajs.E) {
			if (!(Boolean)atl.c(a)) {
				this.b(ajs, co);
			}
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, Random random) {
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			if ((Boolean)ajs.o(co).c(a)) {
				this.b(ajs, co);
			}
		}
	}

	private void b(ajs ajs, co co) {
		atl atl4 = ajs.o(co);
		boolean boolean5 = (Boolean)atl4.c(a);
		boolean boolean6 = false;
		List<? extends sn> list7 = ajs.b(null, atl4.d(ajs, co).a(co));
		if (!list7.isEmpty()) {
			for (sn sn9 : list7) {
				if (!sn9.bc()) {
					boolean6 = true;
					break;
				}
			}
		}

		if (boolean6 != boolean5) {
			atl4 = atl4.a(a, boolean6);
			ajs.a(co, atl4, 3);
			this.e(ajs, co, atl4);
		}

		if (boolean6) {
			ajs.a(new co(co), this, this.a(ajs));
		}
	}

	public static boolean a(ajw ajw, co co, atl atl, cv cv) {
		co co5 = co.a(cv);
		atl atl6 = ajw.o(co5);
		alu alu7 = atl6.v();
		if (alu7 == alv.bR) {
			cv cv8 = cv.d();
			return atl6.c(aro.a) == cv8;
		} else {
			return alu7 == alv.bS;
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, (integer & 1) > 0).a(b, (integer & 4) > 0).a(c, (integer & 8) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		if ((Boolean)atl.c(a)) {
			integer3 |= 1;
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
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case CLOCKWISE_180:
				return atl.a(d, atl.c(f)).a(e, atl.c(g)).a(f, atl.c(d)).a(g, atl.c(e));
			case COUNTERCLOCKWISE_90:
				return atl.a(d, atl.c(e)).a(e, atl.c(f)).a(f, atl.c(g)).a(g, atl.c(d));
			case CLOCKWISE_90:
				return atl.a(d, atl.c(g)).a(e, atl.c(d)).a(f, atl.c(e)).a(g, atl.c(f));
			default:
				return atl;
		}
	}

	@Override
	public atl a(atl atl, aou aou) {
		switch (aou) {
			case LEFT_RIGHT:
				return atl.a(d, atl.c(f)).a(f, atl.c(d));
			case FRONT_BACK:
				return atl.a(e, atl.c(g)).a(g, atl.c(e));
			default:
				return super.a(atl, aou);
		}
	}

	@Override
	protected atm b() {
		return new atm(this, a, b, c, d, e, g, f);
	}
}

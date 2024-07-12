import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public abstract class amb extends amu {
	public static final atx a = atx.a("powered");
	protected static final bdt b = new bdt(0.3125, 0.875, 0.375, 0.6875, 1.0, 0.625);
	protected static final bdt c = new bdt(0.3125, 0.0, 0.375, 0.6875, 0.125, 0.625);
	protected static final bdt d = new bdt(0.3125, 0.375, 0.875, 0.6875, 0.625, 1.0);
	protected static final bdt e = new bdt(0.3125, 0.375, 0.0, 0.6875, 0.625, 0.125);
	protected static final bdt f = new bdt(0.875, 0.375, 0.3125, 1.0, 0.625, 0.6875);
	protected static final bdt g = new bdt(0.0, 0.375, 0.3125, 0.125, 0.625, 0.6875);
	protected static final bdt B = new bdt(0.3125, 0.9375, 0.375, 0.6875, 1.0, 0.625);
	protected static final bdt C = new bdt(0.3125, 0.0, 0.375, 0.6875, 0.0625, 0.625);
	protected static final bdt D = new bdt(0.3125, 0.375, 0.9375, 0.6875, 0.625, 1.0);
	protected static final bdt E = new bdt(0.3125, 0.375, 0.0, 0.6875, 0.625, 0.0625);
	protected static final bdt F = new bdt(0.9375, 0.375, 0.3125, 1.0, 0.625, 0.6875);
	protected static final bdt G = new bdt(0.0, 0.375, 0.3125, 0.0625, 0.625, 0.6875);
	private final boolean I;

	protected amb(boolean boolean1) {
		super(azs.q);
		this.y(this.A.b().a(H, cv.NORTH).a(a, false));
		this.a(true);
		this.a(aej.d);
		this.I = boolean1;
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public int a(ajs ajs) {
		return this.I ? 30 : 20;
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
	public boolean b(ajs ajs, co co, cv cv) {
		return a(ajs, co, cv.d());
	}

	@Override
	public boolean a(ajs ajs, co co) {
		for (cv cv7 : cv.values()) {
			if (a(ajs, co, cv7)) {
				return true;
			}
		}

		return false;
	}

	protected static boolean a(ajs ajs, co co, cv cv) {
		co co4 = co.a(cv);
		return cv == cv.DOWN ? ajs.o(co4).r() : ajs.o(co4).m();
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return a(ajs, co, cv.d()) ? this.t().a(H, cv).a(a, false) : this.t().a(H, cv.DOWN).a(a, false);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (this.e(ajs, co3, atl) && !a(ajs, co3, ((cv)atl.c(H)).d())) {
			this.b(ajs, co3, atl, 0);
			ajs.g(co3);
		}
	}

	private boolean e(ajs ajs, co co, atl atl) {
		if (this.a(ajs, co)) {
			return true;
		} else {
			this.b(ajs, co, atl, 0);
			ajs.g(co);
			return false;
		}
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		cv cv5 = atl.c(H);
		boolean boolean6 = (Boolean)atl.c(a);
		switch (cv5) {
			case EAST:
				return boolean6 ? G : g;
			case WEST:
				return boolean6 ? F : f;
			case SOUTH:
				return boolean6 ? E : e;
			case NORTH:
			default:
				return boolean6 ? D : d;
			case UP:
				return boolean6 ? C : c;
			case DOWN:
				return boolean6 ? B : b;
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if ((Boolean)atl.c(a)) {
			return true;
		} else {
			ajs.a(co, atl.a(a, true), 3);
			ajs.b(co, co);
			this.a(aay, ajs, co);
			this.c(ajs, co, atl.c(H));
			ajs.a(co, this, this.a(ajs));
			return true;
		}
	}

	protected abstract void a(@Nullable aay aay, ajs ajs, co co);

	protected abstract void b(ajs ajs, co co);

	@Override
	public void b(ajs ajs, co co, atl atl) {
		if ((Boolean)atl.c(a)) {
			this.c(ajs, co, atl.c(H));
		}

		super.b(ajs, co, atl);
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		return atl.c(a) ? 15 : 0;
	}

	@Override
	public int c(atl atl, ajw ajw, co co, cv cv) {
		if (!(Boolean)atl.c(a)) {
			return 0;
		} else {
			return atl.c(H) == cv ? 15 : 0;
		}
	}

	@Override
	public boolean g(atl atl) {
		return true;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, Random random) {
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			if ((Boolean)atl.c(a)) {
				if (this.I) {
					this.d(atl, ajs, co);
				} else {
					ajs.a(co, atl.a(a, false));
					this.c(ajs, co, atl.c(H));
					this.b(ajs, co);
					ajs.b(co, co);
				}
			}
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sn sn) {
		if (!ajs.E) {
			if (this.I) {
				if (!(Boolean)atl.c(a)) {
					this.d(atl, ajs, co);
				}
			}
		}
	}

	private void d(atl atl, ajs ajs, co co) {
		List<? extends sn> list5 = ajs.a(abb.class, atl.d(ajs, co).a(co));
		boolean boolean6 = !list5.isEmpty();
		boolean boolean7 = (Boolean)atl.c(a);
		if (boolean6 && !boolean7) {
			ajs.a(co, atl.a(a, true));
			this.c(ajs, co, atl.c(H));
			ajs.b(co, co);
			this.a(null, ajs, co);
		}

		if (!boolean6 && boolean7) {
			ajs.a(co, atl.a(a, false));
			this.c(ajs, co, atl.c(H));
			ajs.b(co, co);
			this.b(ajs, co);
		}

		if (boolean6) {
			ajs.a(new co(co), this, this.a(ajs));
		}
	}

	private void c(ajs ajs, co co, cv cv) {
		ajs.b(co, this, false);
		ajs.b(co.a(cv.d()), this, false);
	}

	@Override
	public atl a(int integer) {
		cv cv3;
		switch (integer & 7) {
			case 0:
				cv3 = cv.DOWN;
				break;
			case 1:
				cv3 = cv.EAST;
				break;
			case 2:
				cv3 = cv.WEST;
				break;
			case 3:
				cv3 = cv.SOUTH;
				break;
			case 4:
				cv3 = cv.NORTH;
				break;
			case 5:
			default:
				cv3 = cv.UP;
		}

		return this.t().a(H, cv3).a(a, (integer & 8) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3;
		switch ((cv)atl.c(H)) {
			case EAST:
				integer3 = 1;
				break;
			case WEST:
				integer3 = 2;
				break;
			case SOUTH:
				integer3 = 3;
				break;
			case NORTH:
				integer3 = 4;
				break;
			case UP:
			default:
				integer3 = 5;
				break;
			case DOWN:
				integer3 = 0;
		}

		if ((Boolean)atl.c(a)) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(H, aqi.a(atl.c(H)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(H)));
	}

	@Override
	protected atm b() {
		return new atm(this, H, a);
	}
}

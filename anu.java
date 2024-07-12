import java.util.Random;

public class anu extends alo {
	public static final aty a = aoi.D;
	private final boolean b;
	private static boolean c;

	protected anu(boolean boolean1) {
		super(azs.e);
		this.y(this.A.b().a(a, cv.NORTH));
		this.b = boolean1;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(alv.al);
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		this.e(ajs, co, atl);
	}

	private void e(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			atl atl5 = ajs.o(co.c());
			atl atl6 = ajs.o(co.d());
			atl atl7 = ajs.o(co.e());
			atl atl8 = ajs.o(co.f());
			cv cv9 = atl.c(a);
			if (cv9 == cv.NORTH && atl5.b() && !atl6.b()) {
				cv9 = cv.SOUTH;
			} else if (cv9 == cv.SOUTH && atl6.b() && !atl5.b()) {
				cv9 = cv.NORTH;
			} else if (cv9 == cv.WEST && atl7.b() && !atl8.b()) {
				cv9 = cv.EAST;
			} else if (cv9 == cv.EAST && atl8.b() && !atl7.b()) {
				cv9 = cv.WEST;
			}

			ajs.a(co, atl.a(a, cv9), 2);
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		if (this.b) {
			cv cv6 = atl.c(a);
			double double7 = (double)co.p() + 0.5;
			double double9 = (double)co.q() + random.nextDouble() * 6.0 / 16.0;
			double double11 = (double)co.r() + 0.5;
			double double13 = 0.52;
			double double15 = random.nextDouble() * 0.6 - 0.3;
			if (random.nextDouble() < 0.1) {
				ajs.a((double)co.p() + 0.5, (double)co.q(), (double)co.r() + 0.5, nn.bJ, no.BLOCKS, 1.0F, 1.0F, false);
			}

			switch (cv6) {
				case WEST:
					ajs.a(de.SMOKE_NORMAL, double7 - 0.52, double9, double11 + double15, 0.0, 0.0, 0.0);
					ajs.a(de.FLAME, double7 - 0.52, double9, double11 + double15, 0.0, 0.0, 0.0);
					break;
				case EAST:
					ajs.a(de.SMOKE_NORMAL, double7 + 0.52, double9, double11 + double15, 0.0, 0.0, 0.0);
					ajs.a(de.FLAME, double7 + 0.52, double9, double11 + double15, 0.0, 0.0, 0.0);
					break;
				case NORTH:
					ajs.a(de.SMOKE_NORMAL, double7 + double15, double9, double11 - 0.52, 0.0, 0.0, 0.0);
					ajs.a(de.FLAME, double7 + double15, double9, double11 - 0.52, 0.0, 0.0, 0.0);
					break;
				case SOUTH:
					ajs.a(de.SMOKE_NORMAL, double7 + double15, double9, double11 + 0.52, 0.0, 0.0, 0.0);
					ajs.a(de.FLAME, double7 + double15, double9, double11 + 0.52, 0.0, 0.0, 0.0);
			}
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			asc asc11 = ajs.r(co);
			if (asc11 instanceof asn) {
				aay.a((rc)((asn)asc11));
				aay.b(oa.Y);
			}

			return true;
		}
	}

	public static void a(boolean boolean1, ajs ajs, co co) {
		atl atl4 = ajs.o(co);
		asc asc5 = ajs.r(co);
		c = true;
		if (boolean1) {
			ajs.a(co, alv.am.t().a(a, atl4.c(a)), 3);
			ajs.a(co, alv.am.t().a(a, atl4.c(a)), 3);
		} else {
			ajs.a(co, alv.al.t().a(a, atl4.c(a)), 3);
			ajs.a(co, alv.al.t().a(a, atl4.c(a)), 3);
		}

		c = false;
		if (asc5 != null) {
			asc5.A();
			ajs.a(co, asc5);
		}
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asn();
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(a, sw.bl().d());
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		ajs.a(co, atl.a(a, sw.bl().d()), 2);
		if (afj.t()) {
			asc asc7 = ajs.r(co);
			if (asc7 instanceof asn) {
				((asn)asc7).a(afj.r());
			}
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		if (!c) {
			asc asc5 = ajs.r(co);
			if (asc5 instanceof asn) {
				rf.a(ajs, co, (asn)asc5);
				ajs.d(co, this);
			}
		}

		super.b(ajs, co, atl);
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajs ajs, co co) {
		return acl.a(ajs.r(co));
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(alv.al);
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public atl a(int integer) {
		cv cv3 = cv.a(integer);
		if (cv3.k() == cv.a.Y) {
			cv3 = cv.NORTH;
		}

		return this.t().a(a, cv3);
	}

	@Override
	public int e(atl atl) {
		return ((cv)atl.c(a)).a();
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(a)));
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}
}

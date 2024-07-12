import javax.annotation.Nullable;

public class arm extends alu {
	public static final aty a = aoi.D;
	public static final atx b = atx.a("open");
	public static final atz<arm.a> c = atz.a("half", arm.a.class);
	protected static final bdt d = new bdt(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);
	protected static final bdt e = new bdt(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt f = new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
	protected static final bdt g = new bdt(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);
	protected static final bdt B = new bdt(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0);
	protected static final bdt C = new bdt(0.0, 0.8125, 0.0, 1.0, 1.0, 1.0);

	protected arm(azs azs) {
		super(azs);
		this.y(this.A.b().a(a, cv.NORTH).a(b, false).a(c, arm.a.BOTTOM));
		this.a(aej.d);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		bdt bdt5;
		if ((Boolean)atl.c(b)) {
			switch ((cv)atl.c(a)) {
				case NORTH:
				default:
					bdt5 = g;
					break;
				case SOUTH:
					bdt5 = f;
					break;
				case WEST:
					bdt5 = e;
					break;
				case EAST:
					bdt5 = d;
			}
		} else if (atl.c(c) == arm.a.TOP) {
			bdt5 = C;
		} else {
			bdt5 = B;
		}

		return bdt5;
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
	public boolean b(ajw ajw, co co) {
		return !(Boolean)ajw.o(co).c(b);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (this.x == azs.f) {
			return false;
		} else {
			atl = atl.a(b);
			ajs.a(co, atl, 2);
			this.a(aay, ajs, co, (Boolean)atl.c(b));
			return true;
		}
	}

	protected void a(@Nullable aay aay, ajs ajs, co co, boolean boolean4) {
		if (boolean4) {
			int integer6 = this.x == azs.f ? 1037 : 1007;
			ajs.a(aay, integer6, co, 0);
		} else {
			int integer6 = this.x == azs.f ? 1036 : 1013;
			ajs.a(aay, integer6, co, 0);
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E) {
			boolean boolean7 = ajs.y(co3);
			if (boolean7 || alu.t().n()) {
				boolean boolean8 = (Boolean)atl.c(b);
				if (boolean8 != boolean7) {
					ajs.a(co3, atl.a(b, boolean7), 2);
					this.a(null, ajs, co3, boolean7);
				}
			}
		}
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		atl atl10 = this.t();
		if (cv.k().c()) {
			atl10 = atl10.a(a, cv).a(b, false);
			atl10 = atl10.a(c, float5 > 0.5F ? arm.a.TOP : arm.a.BOTTOM);
		} else {
			atl10 = atl10.a(a, sw.bl().d()).a(b, false);
			atl10 = atl10.a(c, cv == cv.UP ? arm.a.BOTTOM : arm.a.TOP);
		}

		if (ajs.y(co)) {
			atl10 = atl10.a(b, true);
		}

		return atl10;
	}

	@Override
	public boolean b(ajs ajs, co co, cv cv) {
		return true;
	}

	protected static cv e(int integer) {
		switch (integer & 3) {
			case 0:
				return cv.NORTH;
			case 1:
				return cv.SOUTH;
			case 2:
				return cv.WEST;
			case 3:
			default:
				return cv.EAST;
		}
	}

	protected static int a(cv cv) {
		switch (cv) {
			case NORTH:
				return 0;
			case SOUTH:
				return 1;
			case WEST:
				return 2;
			case EAST:
			default:
				return 3;
		}
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, e(integer)).a(b, (integer & 4) != 0).a(c, (integer & 8) == 0 ? arm.a.BOTTOM : arm.a.TOP);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= a(atl.c(a));
		if ((Boolean)atl.c(b)) {
			integer3 |= 4;
		}

		if (atl.c(c) == arm.a.TOP) {
			integer3 |= 8;
		}

		return integer3;
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
		return new atm(this, a, b, c);
	}

	public static enum a implements ox {
		TOP("top"),
		BOTTOM("bottom");

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

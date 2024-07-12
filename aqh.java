public class aqh extends alu {
	public static final atz<cv.a> c = atz.a("axis", cv.a.class);

	protected aqh(azs azs) {
		super(azs, azs.r());
	}

	protected aqh(azs azs, azt azt) {
		super(azs, azt);
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case COUNTERCLOCKWISE_90:
			case CLOCKWISE_90:
				switch ((cv.a)atl.c(c)) {
					case X:
						return atl.a(c, cv.a.Z);
					case Z:
						return atl.a(c, cv.a.X);
					default:
						return atl;
				}
			default:
				return atl;
		}
	}

	@Override
	public atl a(int integer) {
		cv.a a3 = cv.a.Y;
		int integer4 = integer & 12;
		if (integer4 == 4) {
			a3 = cv.a.X;
		} else if (integer4 == 8) {
			a3 = cv.a.Z;
		}

		return this.t().a(c, a3);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		cv.a a4 = atl.c(c);
		if (a4 == cv.a.X) {
			integer3 |= 4;
		} else if (a4 == cv.a.Z) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	protected atm b() {
		return new atm(this, c);
	}

	@Override
	protected afj w(atl atl) {
		return new afj(afh.a(this));
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return super.a(ajs, co, cv, float4, float5, float6, integer, sw).a(c, cv.k());
	}
}

public class apw extends alu {
	public static final atz<apw.a> a = atz.a("variant", apw.a.class);

	public apw() {
		super(azs.e);
		this.y(this.A.b().a(a, apw.a.DEFAULT));
		this.a(aej.b);
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		if (integer == apw.a.LINES_Y.a()) {
			switch (cv.k()) {
				case Z:
					return this.t().a(a, apw.a.LINES_Z);
				case X:
					return this.t().a(a, apw.a.LINES_X);
				case Y:
					return this.t().a(a, apw.a.LINES_Y);
			}
		}

		return integer == apw.a.CHISELED.a() ? this.t().a(a, apw.a.CHISELED) : this.t().a(a, apw.a.DEFAULT);
	}

	@Override
	public int d(atl atl) {
		apw.a a3 = atl.c(a);
		return a3 != apw.a.LINES_X && a3 != apw.a.LINES_Z ? a3.a() : apw.a.LINES_Y.a();
	}

	@Override
	protected afj w(atl atl) {
		apw.a a3 = atl.c(a);
		return a3 != apw.a.LINES_X && a3 != apw.a.LINES_Z ? super.w(atl) : new afj(afh.a(this), 1, apw.a.LINES_Y.a());
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh, 1, apw.a.DEFAULT.a()));
		dd.add(new afj(afh, 1, apw.a.CHISELED.a()));
		dd.add(new afj(afh, 1, apw.a.LINES_Y.a()));
	}

	@Override
	public azt r(atl atl) {
		return azt.p;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, apw.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((apw.a)atl.c(a)).a();
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case COUNTERCLOCKWISE_90:
			case CLOCKWISE_90:
				switch ((apw.a)atl.c(a)) {
					case LINES_X:
						return atl.a(a, apw.a.LINES_Z);
					case LINES_Z:
						return atl.a(a, apw.a.LINES_X);
					default:
						return atl;
				}
			default:
				return atl;
		}
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static enum a implements ox {
		DEFAULT(0, "default", "default"),
		CHISELED(1, "chiseled", "chiseled"),
		LINES_Y(2, "lines_y", "lines"),
		LINES_X(3, "lines_x", "lines"),
		LINES_Z(4, "lines_z", "lines");

		private static final apw.a[] f = new apw.a[values().length];
		private final int g;
		private final String h;
		private final String i;

		private a(int integer3, String string4, String string5) {
			this.g = integer3;
			this.h = string4;
			this.i = string5;
		}

		public int a() {
			return this.g;
		}

		public String toString() {
			return this.i;
		}

		public static apw.a a(int integer) {
			if (integer < 0 || integer >= f.length) {
				integer = 0;
			}

			return f[integer];
		}

		@Override
		public String m() {
			return this.h;
		}

		static {
			for (apw.a a4 : values()) {
				f[a4.a()] = a4;
			}
		}
	}
}

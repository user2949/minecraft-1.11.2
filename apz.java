public class apz extends alu {
	public static final atz<apz.a> a = atz.a("type", apz.a.class);

	public apz() {
		super(azs.e, aqj.a.RED_SAND.d());
		this.y(this.A.b().a(a, apz.a.DEFAULT));
		this.a(aej.b);
	}

	@Override
	public int d(atl atl) {
		return ((apz.a)atl.c(a)).a();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (apz.a a8 : apz.a.values()) {
			dd.add(new afj(afh, 1, a8.a()));
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, apz.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((apz.a)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static enum a implements ox {
		DEFAULT(0, "red_sandstone", "default"),
		CHISELED(1, "chiseled_red_sandstone", "chiseled"),
		SMOOTH(2, "smooth_red_sandstone", "smooth");

		private static final apz.a[] d = new apz.a[values().length];
		private final int e;
		private final String f;
		private final String g;

		private a(int integer3, String string4, String string5) {
			this.e = integer3;
			this.f = string4;
			this.g = string5;
		}

		public int a() {
			return this.e;
		}

		public String toString() {
			return this.f;
		}

		public static apz.a a(int integer) {
			if (integer < 0 || integer >= d.length) {
				integer = 0;
			}

			return d[integer];
		}

		@Override
		public String m() {
			return this.f;
		}

		public String c() {
			return this.g;
		}

		static {
			for (apz.a a4 : values()) {
				d[a4.a()] = a4;
			}
		}
	}
}

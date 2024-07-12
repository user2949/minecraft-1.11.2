public class aqk extends alu {
	public static final atz<aqk.a> a = atz.a("type", aqk.a.class);

	public aqk() {
		super(azs.e);
		this.y(this.A.b().a(a, aqk.a.DEFAULT));
		this.a(aej.b);
	}

	@Override
	public int d(atl atl) {
		return ((aqk.a)atl.c(a)).a();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (aqk.a a8 : aqk.a.values()) {
			dd.add(new afj(afh, 1, a8.a()));
		}
	}

	@Override
	public azt r(atl atl) {
		return azt.d;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, aqk.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((aqk.a)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static enum a implements ox {
		DEFAULT(0, "sandstone", "default"),
		CHISELED(1, "chiseled_sandstone", "chiseled"),
		SMOOTH(2, "smooth_sandstone", "smooth");

		private static final aqk.a[] d = new aqk.a[values().length];
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

		public static aqk.a a(int integer) {
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
			for (aqk.a a4 : values()) {
				d[a4.a()] = a4;
			}
		}
	}
}

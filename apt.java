public class apt extends alu {
	public static final atz<apt.a> a = atz.a("variant", apt.a.class);
	public static final int b = apt.a.ROUGH.a();
	public static final int c = apt.a.BRICKS.a();
	public static final int d = apt.a.DARK.a();

	public apt() {
		super(azs.e);
		this.y(this.A.b().a(a, apt.a.ROUGH));
		this.a(aej.b);
	}

	@Override
	public String c() {
		return dp.a(this.a() + "." + apt.a.ROUGH.c() + ".name");
	}

	@Override
	public azt r(atl atl) {
		return atl.c(a) == apt.a.ROUGH ? azt.y : azt.G;
	}

	@Override
	public int d(atl atl) {
		return ((apt.a)atl.c(a)).a();
	}

	@Override
	public int e(atl atl) {
		return ((apt.a)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, apt.a.a(integer));
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh, 1, b));
		dd.add(new afj(afh, 1, c));
		dd.add(new afj(afh, 1, d));
	}

	public static enum a implements ox {
		ROUGH(0, "prismarine", "rough"),
		BRICKS(1, "prismarine_bricks", "bricks"),
		DARK(2, "dark_prismarine", "dark");

		private static final apt.a[] d = new apt.a[values().length];
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

		public static apt.a a(int integer) {
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
			for (apt.a a4 : values()) {
				d[a4.a()] = a4;
			}
		}
	}
}

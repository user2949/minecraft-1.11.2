public class apn extends alu {
	public static final atz<apn.a> a = atz.a("variant", apn.a.class);

	public apn() {
		super(azs.d);
		this.y(this.A.b().a(a, apn.a.OAK));
		this.a(aej.b);
	}

	@Override
	public int d(atl atl) {
		return ((apn.a)atl.c(a)).a();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (apn.a a8 : apn.a.values()) {
			dd.add(new afj(afh, 1, a8.a()));
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, apn.a.a(integer));
	}

	@Override
	public azt r(atl atl) {
		return ((apn.a)atl.c(a)).c();
	}

	@Override
	public int e(atl atl) {
		return ((apn.a)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static enum a implements ox {
		OAK(0, "oak", azt.o),
		SPRUCE(1, "spruce", azt.J),
		BIRCH(2, "birch", azt.d),
		JUNGLE(3, "jungle", azt.l),
		ACACIA(4, "acacia", azt.q),
		DARK_OAK(5, "dark_oak", "big_oak", azt.B);

		private static final apn.a[] g = new apn.a[values().length];
		private final int h;
		private final String i;
		private final String j;
		private final azt k;

		private a(int integer3, String string4, azt azt) {
			this(integer3, string4, string4, azt);
		}

		private a(int integer3, String string4, String string5, azt azt) {
			this.h = integer3;
			this.i = string4;
			this.j = string5;
			this.k = azt;
		}

		public int a() {
			return this.h;
		}

		public azt c() {
			return this.k;
		}

		public String toString() {
			return this.i;
		}

		public static apn.a a(int integer) {
			if (integer < 0 || integer >= g.length) {
				integer = 0;
			}

			return g[integer];
		}

		@Override
		public String m() {
			return this.i;
		}

		public String d() {
			return this.j;
		}

		static {
			for (apn.a a4 : values()) {
				g[a4.a()] = a4;
			}
		}
	}
}

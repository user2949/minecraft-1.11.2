public class aqj extends anj {
	public static final atz<aqj.a> a = atz.a("variant", aqj.a.class);

	public aqj() {
		this.y(this.A.b().a(a, aqj.a.SAND));
	}

	@Override
	public int d(atl atl) {
		return ((aqj.a)atl.c(a)).b();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (aqj.a a8 : aqj.a.values()) {
			dd.add(new afj(afh, 1, a8.b()));
		}
	}

	@Override
	public azt r(atl atl) {
		return ((aqj.a)atl.c(a)).d();
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, aqj.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((aqj.a)atl.c(a)).b();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	@Override
	public int z(atl atl) {
		aqj.a a3 = atl.c(a);
		return a3.a();
	}

	public static enum a implements ox {
		SAND(0, "sand", "default", azt.d, -2370656),
		RED_SAND(1, "red_sand", "red", azt.q, -5679071);

		private static final aqj.a[] c = new aqj.a[values().length];
		private final int d;
		private final String e;
		private final azt f;
		private final String g;
		private final int h;

		private a(int integer3, String string4, String string5, azt azt, int integer7) {
			this.d = integer3;
			this.e = string4;
			this.f = azt;
			this.g = string5;
			this.h = integer7;
		}

		public int a() {
			return this.h;
		}

		public int b() {
			return this.d;
		}

		public String toString() {
			return this.e;
		}

		public azt d() {
			return this.f;
		}

		public static aqj.a a(int integer) {
			if (integer < 0 || integer >= c.length) {
				integer = 0;
			}

			return c[integer];
		}

		@Override
		public String m() {
			return this.e;
		}

		public String e() {
			return this.g;
		}

		static {
			for (aqj.a a4 : values()) {
				c[a4.b()] = a4;
			}
		}
	}
}

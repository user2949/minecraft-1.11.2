public class amv extends alu {
	public static final atz<amv.a> a = atz.a("variant", amv.a.class);
	public static final atx b = atx.a("snowy");

	protected amv() {
		super(azs.c);
		this.y(this.A.b().a(a, amv.a.DIRT).a(b, false));
		this.a(aej.b);
	}

	@Override
	public azt r(atl atl) {
		return ((amv.a)atl.c(a)).d();
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		if (atl.c(a) == amv.a.PODZOL) {
			alu alu5 = ajw.o(co.a()).v();
			atl = atl.a(b, alu5 == alv.aJ || alu5 == alv.aH);
		}

		return atl;
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(this, 1, amv.a.DIRT.a()));
		dd.add(new afj(this, 1, amv.a.COARSE_DIRT.a()));
		dd.add(new afj(this, 1, amv.a.PODZOL.a()));
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(this, 1, ((amv.a)atl.c(a)).a());
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, amv.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((amv.a)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a, b);
	}

	@Override
	public int d(atl atl) {
		amv.a a3 = atl.c(a);
		if (a3 == amv.a.PODZOL) {
			a3 = amv.a.DIRT;
		}

		return a3.a();
	}

	public static enum a implements ox {
		DIRT(0, "dirt", "default", azt.l),
		COARSE_DIRT(1, "coarse_dirt", "coarse", azt.l),
		PODZOL(2, "podzol", azt.J);

		private static final amv.a[] d = new amv.a[values().length];
		private final int e;
		private final String f;
		private final String g;
		private final azt h;

		private a(int integer3, String string4, azt azt) {
			this(integer3, string4, string4, azt);
		}

		private a(int integer3, String string4, String string5, azt azt) {
			this.e = integer3;
			this.f = string4;
			this.g = string5;
			this.h = azt;
		}

		public int a() {
			return this.e;
		}

		public String c() {
			return this.g;
		}

		public azt d() {
			return this.h;
		}

		public String toString() {
			return this.f;
		}

		public static amv.a a(int integer) {
			if (integer < 0 || integer >= d.length) {
				integer = 0;
			}

			return d[integer];
		}

		@Override
		public String m() {
			return this.f;
		}

		static {
			for (amv.a a4 : values()) {
				d[a4.a()] = a4;
			}
		}
	}
}

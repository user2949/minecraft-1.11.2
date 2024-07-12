public class ard extends alu {
	public static final atz<ard.a> a = atz.a("variant", ard.a.class);
	public static final int b = ard.a.DEFAULT.a();
	public static final int c = ard.a.MOSSY.a();
	public static final int d = ard.a.CRACKED.a();
	public static final int e = ard.a.CHISELED.a();

	public ard() {
		super(azs.e);
		this.y(this.A.b().a(a, ard.a.DEFAULT));
		this.a(aej.b);
	}

	@Override
	public int d(atl atl) {
		return ((ard.a)atl.c(a)).a();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (ard.a a8 : ard.a.values()) {
			dd.add(new afj(afh, 1, a8.a()));
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, ard.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((ard.a)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static enum a implements ox {
		DEFAULT(0, "stonebrick", "default"),
		MOSSY(1, "mossy_stonebrick", "mossy"),
		CRACKED(2, "cracked_stonebrick", "cracked"),
		CHISELED(3, "chiseled_stonebrick", "chiseled");

		private static final ard.a[] e = new ard.a[values().length];
		private final int f;
		private final String g;
		private final String h;

		private a(int integer3, String string4, String string5) {
			this.f = integer3;
			this.g = string4;
			this.h = string5;
		}

		public int a() {
			return this.f;
		}

		public String toString() {
			return this.g;
		}

		public static ard.a a(int integer) {
			if (integer < 0 || integer >= e.length) {
				integer = 0;
			}

			return e[integer];
		}

		@Override
		public String m() {
			return this.g;
		}

		public String c() {
			return this.h;
		}

		static {
			for (ard.a a4 : values()) {
				e[a4.a()] = a4;
			}
		}
	}
}

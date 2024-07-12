import java.util.Random;

public class arc extends alu {
	public static final atz<arc.a> a = atz.a("variant", arc.a.class);

	public arc() {
		super(azs.e);
		this.y(this.A.b().a(a, arc.a.STONE));
		this.a(aej.b);
	}

	@Override
	public String c() {
		return dp.a(this.a() + "." + arc.a.STONE.d() + ".name");
	}

	@Override
	public azt r(atl atl) {
		return ((arc.a)atl.c(a)).c();
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return atl.c(a) == arc.a.STONE ? afh.a(alv.e) : afh.a(alv.b);
	}

	@Override
	public int d(atl atl) {
		return ((arc.a)atl.c(a)).a();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (arc.a a8 : arc.a.values()) {
			dd.add(new afj(afh, 1, a8.a()));
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, arc.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((arc.a)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static enum a implements ox {
		STONE(0, azt.m, "stone", true),
		GRANITE(1, azt.l, "granite", true),
		GRANITE_SMOOTH(2, azt.l, "smooth_granite", "graniteSmooth", false),
		DIORITE(3, azt.p, "diorite", true),
		DIORITE_SMOOTH(4, azt.p, "smooth_diorite", "dioriteSmooth", false),
		ANDESITE(5, azt.m, "andesite", true),
		ANDESITE_SMOOTH(6, azt.m, "smooth_andesite", "andesiteSmooth", false);

		private static final arc.a[] h = new arc.a[values().length];
		private final int i;
		private final String j;
		private final String k;
		private final azt l;
		private final boolean m;

		private a(int integer3, azt azt, String string5, boolean boolean6) {
			this(integer3, azt, string5, string5, boolean6);
		}

		private a(int integer3, azt azt, String string5, String string6, boolean boolean7) {
			this.i = integer3;
			this.j = string5;
			this.k = string6;
			this.l = azt;
			this.m = boolean7;
		}

		public int a() {
			return this.i;
		}

		public azt c() {
			return this.l;
		}

		public String toString() {
			return this.j;
		}

		public static arc.a a(int integer) {
			if (integer < 0 || integer >= h.length) {
				integer = 0;
			}

			return h[integer];
		}

		@Override
		public String m() {
			return this.j;
		}

		public String d() {
			return this.k;
		}

		public boolean e() {
			return this.m;
		}

		static {
			for (arc.a a4 : values()) {
				h[a4.a()] = a4;
			}
		}
	}
}

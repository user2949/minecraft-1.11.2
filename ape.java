import java.util.Random;

public abstract class ape extends aob {
	public static final atx d = atx.a("seamless");
	public static final atz<ape.a> e = atz.a("variant", ape.a.class);

	public ape() {
		super(azs.e);
		atl atl2 = this.A.b();
		if (this.e()) {
			atl2 = atl2.a(d, false);
		} else {
			atl2 = atl2.a(a, aob.a.BOTTOM);
		}

		this.y(atl2.a(e, ape.a.RED_SANDSTONE));
		this.a(aej.b);
	}

	@Override
	public String c() {
		return dp.a(this.a() + ".red_sandstone.name");
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(alv.cP);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(alv.cP, 1, ((ape.a)atl.c(e)).a());
	}

	@Override
	public String e(int integer) {
		return super.a() + "." + ape.a.a(integer).d();
	}

	@Override
	public aub<?> g() {
		return e;
	}

	@Override
	public Comparable<?> a(afj afj) {
		return ape.a.a(afj.j() & 7);
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		if (afh != afh.a(alv.cO)) {
			for (ape.a a8 : ape.a.values()) {
				dd.add(new afj(afh, 1, a8.a()));
			}
		}
	}

	@Override
	public atl a(int integer) {
		atl atl3 = this.t().a(e, ape.a.a(integer & 7));
		if (this.e()) {
			atl3 = atl3.a(d, (integer & 8) != 0);
		} else {
			atl3 = atl3.a(a, (integer & 8) == 0 ? aob.a.BOTTOM : aob.a.TOP);
		}

		return atl3;
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((ape.a)atl.c(e)).a();
		if (this.e()) {
			if ((Boolean)atl.c(d)) {
				integer3 |= 8;
			}
		} else if (atl.c(a) == aob.a.TOP) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	protected atm b() {
		return this.e() ? new atm(this, d, e) : new atm(this, a, e);
	}

	@Override
	public azt r(atl atl) {
		return ((ape.a)atl.c(e)).c();
	}

	@Override
	public int d(atl atl) {
		return ((ape.a)atl.c(e)).a();
	}

	public static enum a implements ox {
		RED_SANDSTONE(0, "red_sandstone", aqj.a.RED_SAND.d());

		private static final ape.a[] b = new ape.a[values().length];
		private final int c;
		private final String d;
		private final azt e;

		private a(int integer3, String string4, azt azt) {
			this.c = integer3;
			this.d = string4;
			this.e = azt;
		}

		public int a() {
			return this.c;
		}

		public azt c() {
			return this.e;
		}

		public String toString() {
			return this.d;
		}

		public static ape.a a(int integer) {
			if (integer < 0 || integer >= b.length) {
				integer = 0;
			}

			return b[integer];
		}

		@Override
		public String m() {
			return this.d;
		}

		public String d() {
			return this.d;
		}

		static {
			for (ape.a a4 : values()) {
				b[a4.a()] = a4;
			}
		}
	}
}

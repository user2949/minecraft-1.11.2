import java.util.Random;

public abstract class arf extends aob {
	public static final atx d = atx.a("seamless");
	public static final atz<arf.a> e = atz.a("variant", arf.a.class);

	public arf() {
		super(azs.e);
		atl atl2 = this.A.b();
		if (this.e()) {
			atl2 = atl2.a(d, false);
		} else {
			atl2 = atl2.a(a, aob.a.BOTTOM);
		}

		this.y(atl2.a(e, arf.a.STONE));
		this.a(aej.b);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(alv.U);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(alv.U, 1, ((arf.a)atl.c(e)).a());
	}

	@Override
	public String e(int integer) {
		return super.a() + "." + arf.a.a(integer).d();
	}

	@Override
	public aub<?> g() {
		return e;
	}

	@Override
	public Comparable<?> a(afj afj) {
		return arf.a.a(afj.j() & 7);
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		if (afh != afh.a(alv.T)) {
			for (arf.a a8 : arf.a.values()) {
				if (a8 != arf.a.WOOD) {
					dd.add(new afj(afh, 1, a8.a()));
				}
			}
		}
	}

	@Override
	public atl a(int integer) {
		atl atl3 = this.t().a(e, arf.a.a(integer & 7));
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
		integer3 |= ((arf.a)atl.c(e)).a();
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
	public int d(atl atl) {
		return ((arf.a)atl.c(e)).a();
	}

	@Override
	public azt r(atl atl) {
		return ((arf.a)atl.c(e)).c();
	}

	public static enum a implements ox {
		STONE(0, azt.m, "stone"),
		SAND(1, azt.d, "sandstone", "sand"),
		WOOD(2, azt.o, "wood_old", "wood"),
		COBBLESTONE(3, azt.m, "cobblestone", "cobble"),
		BRICK(4, azt.D, "brick"),
		SMOOTHBRICK(5, azt.m, "stone_brick", "smoothStoneBrick"),
		NETHERBRICK(6, azt.K, "nether_brick", "netherBrick"),
		QUARTZ(7, azt.p, "quartz");

		private static final arf.a[] i = new arf.a[values().length];
		private final int j;
		private final azt k;
		private final String l;
		private final String m;

		private a(int integer3, azt azt, String string5) {
			this(integer3, azt, string5, string5);
		}

		private a(int integer3, azt azt, String string5, String string6) {
			this.j = integer3;
			this.k = azt;
			this.l = string5;
			this.m = string6;
		}

		public int a() {
			return this.j;
		}

		public azt c() {
			return this.k;
		}

		public String toString() {
			return this.l;
		}

		public static arf.a a(int integer) {
			if (integer < 0 || integer >= i.length) {
				integer = 0;
			}

			return i[integer];
		}

		@Override
		public String m() {
			return this.l;
		}

		public String d() {
			return this.m;
		}

		static {
			for (arf.a a4 : values()) {
				i[a4.a()] = a4;
			}
		}
	}
}

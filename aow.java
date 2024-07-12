import java.util.Random;

public class aow extends alu {
	public static final atz<aow.a> a = atz.a("variant", aow.a.class);

	public aow() {
		super(azs.B);
		this.y(this.A.b().a(a, aow.a.STONE));
		this.c(0.0F);
		this.a(aej.c);
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	public static boolean i(atl atl) {
		alu alu2 = atl.v();
		return atl == alv.b.t().a(arc.a, arc.a.STONE) || alu2 == alv.e || alu2 == alv.bf;
	}

	@Override
	protected afj w(atl atl) {
		switch ((aow.a)atl.c(a)) {
			case COBBLESTONE:
				return new afj(alv.e);
			case STONEBRICK:
				return new afj(alv.bf);
			case MOSSY_STONEBRICK:
				return new afj(alv.bf, 1, ard.a.MOSSY.a());
			case CRACKED_STONEBRICK:
				return new afj(alv.bf, 1, ard.a.CRACKED.a());
			case CHISELED_STONEBRICK:
				return new afj(alv.bf, 1, ard.a.CHISELED.a());
			default:
				return new afj(alv.b);
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		if (!ajs.E && ajs.U().b("doTileDrops")) {
			aaf aaf7 = new aaf(ajs);
			aaf7.b((double)co.p() + 0.5, (double)co.q(), (double)co.r() + 0.5, 0.0F, 0.0F);
			ajs.a(aaf7);
			aaf7.E();
		}
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(this, 1, atl.v().e(atl));
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (aow.a a8 : aow.a.values()) {
			dd.add(new afj(afh, 1, a8.a()));
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, aow.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((aow.a)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	public static enum a implements ox {
		STONE(0, "stone") {
			@Override
			public atl d() {
				return alv.b.t().a(arc.a, arc.a.STONE);
			}
		},
		COBBLESTONE(1, "cobblestone", "cobble") {
			@Override
			public atl d() {
				return alv.e.t();
			}
		},
		STONEBRICK(2, "stone_brick", "brick") {
			@Override
			public atl d() {
				return alv.bf.t().a(ard.a, ard.a.DEFAULT);
			}
		},
		MOSSY_STONEBRICK(3, "mossy_brick", "mossybrick") {
			@Override
			public atl d() {
				return alv.bf.t().a(ard.a, ard.a.MOSSY);
			}
		},
		CRACKED_STONEBRICK(4, "cracked_brick", "crackedbrick") {
			@Override
			public atl d() {
				return alv.bf.t().a(ard.a, ard.a.CRACKED);
			}
		},
		CHISELED_STONEBRICK(5, "chiseled_brick", "chiseledbrick") {
			@Override
			public atl d() {
				return alv.bf.t().a(ard.a, ard.a.CHISELED);
			}
		};

		private static final aow.a[] g = new aow.a[values().length];
		private final int h;
		private final String i;
		private final String j;

		private a(int integer3, String string4) {
			this(integer3, string4, string4);
		}

		private a(int integer3, String string4, String string5) {
			this.h = integer3;
			this.i = string4;
			this.j = string5;
		}

		public int a() {
			return this.h;
		}

		public String toString() {
			return this.i;
		}

		public static aow.a a(int integer) {
			if (integer < 0 || integer >= g.length) {
				integer = 0;
			}

			return g[integer];
		}

		@Override
		public String m() {
			return this.i;
		}

		public String c() {
			return this.j;
		}

		public abstract atl d();

		public static aow.a a(atl atl) {
			for (aow.a a5 : values()) {
				if (atl == a5.d()) {
					return a5;
				}
			}

			return STONE;
		}

		static {
			for (aow.a a4 : values()) {
				g[a4.a()] = a4;
			}
		}
	}
}

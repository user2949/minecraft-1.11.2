import java.util.Random;
import javax.annotation.Nullable;

public class ari extends ama implements alx {
	public static final atz<ari.a> a = atz.a("type", ari.a.class);
	protected static final bdt c = new bdt(0.099999994F, 0.0, 0.099999994F, 0.9F, 0.8F, 0.9F);

	protected ari() {
		super(azs.l);
		this.y(this.A.b().a(a, ari.a.DEAD_BUSH));
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return c;
	}

	@Override
	public boolean f(ajs ajs, co co, atl atl) {
		return this.i(ajs.o(co.b()));
	}

	@Override
	public boolean a(ajw ajw, co co) {
		return true;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return random.nextInt(8) == 0 ? afl.Q : afl.a;
	}

	@Override
	public int a(int integer, Random random) {
		return 1 + random.nextInt(integer * 2 + 1);
	}

	@Override
	public void a(ajs ajs, aay aay, co co, atl atl, @Nullable asc asc, afj afj) {
		if (!ajs.E && afj.c() == afl.bm) {
			aay.b(oa.a(this));
			a(ajs, co, new afj(alv.H, 1, ((ari.a)atl.c(a)).a()));
		} else {
			super.a(ajs, aay, co, atl, asc, afj);
		}
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(this, 1, atl.v().e(atl));
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (int integer5 = 1; integer5 < 3; integer5++) {
			dd.add(new afj(afh, 1, integer5));
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, boolean boolean4) {
		return atl.c(a) != ari.a.DEAD_BUSH;
	}

	@Override
	public boolean a(ajs ajs, Random random, co co, atl atl) {
		return true;
	}

	@Override
	public void b(ajs ajs, Random random, co co, atl atl) {
		amy.b b6 = amy.b.GRASS;
		if (atl.c(a) == ari.a.FERN) {
			b6 = amy.b.FERN;
		}

		if (alv.cF.a(ajs, co)) {
			alv.cF.a(ajs, co, b6, 2);
		}
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, ari.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((ari.a)atl.c(a)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	@Override
	public alu.a u() {
		return alu.a.XYZ;
	}

	public static enum a implements ox {
		DEAD_BUSH(0, "dead_bush"),
		GRASS(1, "tall_grass"),
		FERN(2, "fern");

		private static final ari.a[] d = new ari.a[values().length];
		private final int e;
		private final String f;

		private a(int integer3, String string4) {
			this.e = integer3;
			this.f = string4;
		}

		public int a() {
			return this.e;
		}

		public String toString() {
			return this.f;
		}

		public static ari.a a(int integer) {
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
			for (ari.a a4 : values()) {
				d[a4.a()] = a4;
			}
		}
	}
}

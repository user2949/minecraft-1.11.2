import java.util.Random;

public abstract class aob extends alu {
	public static final atz<aob.a> a = atz.a("half", aob.a.class);
	protected static final bdt b = new bdt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
	protected static final bdt c = new bdt(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);

	public aob(azs azs) {
		this(azs, azs.r());
	}

	public aob(azs azs, azt azt) {
		super(azs, azt);
		this.l = this.e();
		this.d(255);
	}

	@Override
	protected boolean n() {
		return false;
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		if (this.e()) {
			return j;
		} else {
			return atl.c(a) == aob.a.TOP ? c : b;
		}
	}

	@Override
	public boolean k(atl atl) {
		return ((aob)atl.v()).e() || atl.c(a) == aob.a.TOP;
	}

	@Override
	public boolean b(atl atl) {
		return this.e();
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		atl atl10 = super.a(ajs, co, cv, float4, float5, float6, integer, sw).a(a, aob.a.BOTTOM);
		if (this.e()) {
			return atl10;
		} else {
			return cv != cv.DOWN && (cv == cv.UP || !((double)float5 > 0.5)) ? atl10 : atl10.a(a, aob.a.TOP);
		}
	}

	@Override
	public int a(Random random) {
		return this.e() ? 2 : 1;
	}

	@Override
	public boolean c(atl atl) {
		return this.e();
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		if (this.e()) {
			return super.a(atl, ajw, co, cv);
		} else if (cv != cv.UP && cv != cv.DOWN && !super.a(atl, ajw, co, cv)) {
			return false;
		} else {
			atl atl6 = ajw.o(co.a(cv));
			boolean boolean7 = i(atl6) && atl6.c(a) == aob.a.TOP;
			boolean boolean8 = i(atl) && atl.c(a) == aob.a.TOP;
			if (boolean8) {
				if (cv == cv.DOWN) {
					return true;
				} else {
					return cv == cv.UP && super.a(atl, ajw, co, cv) ? true : !i(atl6) || !boolean7;
				}
			} else if (cv == cv.UP) {
				return true;
			} else {
				return cv == cv.DOWN && super.a(atl, ajw, co, cv) ? true : !i(atl6) || boolean7;
			}
		}
	}

	protected static boolean i(atl atl) {
		alu alu2 = atl.v();
		return alu2 == alv.U || alu2 == alv.bM || alu2 == alv.cP || alu2 == alv.cX;
	}

	public abstract String e(int integer);

	public abstract boolean e();

	public abstract aub<?> g();

	public abstract Comparable<?> a(afj afj);

	public static enum a implements ox {
		TOP("top"),
		BOTTOM("bottom");

		private final String c;

		private a(String string3) {
			this.c = string3;
		}

		public String toString() {
			return this.c;
		}

		@Override
		public String m() {
			return this.c;
		}
	}
}

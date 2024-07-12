import java.util.List;
import javax.annotation.Nullable;

public class arq extends alu {
	public static final atx a = atx.a("up");
	public static final atx b = atx.a("north");
	public static final atx c = atx.a("east");
	public static final atx d = atx.a("south");
	public static final atx e = atx.a("west");
	public static final atz<arq.a> f = atz.a("variant", arq.a.class);
	protected static final bdt[] g = new bdt[]{
		new bdt(0.25, 0.0, 0.25, 0.75, 1.0, 0.75),
		new bdt(0.25, 0.0, 0.25, 0.75, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.25, 0.75, 1.0, 0.75),
		new bdt(0.0, 0.0, 0.25, 0.75, 1.0, 1.0),
		new bdt(0.25, 0.0, 0.0, 0.75, 1.0, 0.75),
		new bdt(0.3125, 0.0, 0.0, 0.6875, 0.875, 1.0),
		new bdt(0.0, 0.0, 0.0, 0.75, 1.0, 0.75),
		new bdt(0.0, 0.0, 0.0, 0.75, 1.0, 1.0),
		new bdt(0.25, 0.0, 0.25, 1.0, 1.0, 0.75),
		new bdt(0.25, 0.0, 0.25, 1.0, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.3125, 1.0, 0.875, 0.6875),
		new bdt(0.0, 0.0, 0.25, 1.0, 1.0, 1.0),
		new bdt(0.25, 0.0, 0.0, 1.0, 1.0, 0.75),
		new bdt(0.25, 0.0, 0.0, 1.0, 1.0, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 0.75),
		new bdt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
	};
	protected static final bdt[] B = new bdt[]{
		g[0].e(1.5),
		g[1].e(1.5),
		g[2].e(1.5),
		g[3].e(1.5),
		g[4].e(1.5),
		g[5].e(1.5),
		g[6].e(1.5),
		g[7].e(1.5),
		g[8].e(1.5),
		g[9].e(1.5),
		g[10].e(1.5),
		g[11].e(1.5),
		g[12].e(1.5),
		g[13].e(1.5),
		g[14].e(1.5),
		g[15].e(1.5)
	};

	public arq(alu alu) {
		super(alu.x);
		this.y(this.A.b().a(a, false).a(b, false).a(c, false).a(d, false).a(e, false).a(f, arq.a.NORMAL));
		this.c(alu.q);
		this.b(alu.r / 3.0F);
		this.a(alu.v);
		this.a(aej.c);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		atl = this.c(atl, ajw, co);
		return g[i(atl)];
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		if (!boolean7) {
			atl = this.c(atl, ajs, co);
		}

		a(co, bdt, list, B[i(atl)]);
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		atl = this.c(atl, ajw, co);
		return B[i(atl)];
	}

	private static int i(atl atl) {
		int integer2 = 0;
		if ((Boolean)atl.c(b)) {
			integer2 |= 1 << cv.NORTH.b();
		}

		if ((Boolean)atl.c(c)) {
			integer2 |= 1 << cv.EAST.b();
		}

		if ((Boolean)atl.c(d)) {
			integer2 |= 1 << cv.SOUTH.b();
		}

		if ((Boolean)atl.c(e)) {
			integer2 |= 1 << cv.WEST.b();
		}

		return integer2;
	}

	@Override
	public String c() {
		return dp.a(this.a() + "." + arq.a.NORMAL.c() + ".name");
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean b(ajw ajw, co co) {
		return false;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	private boolean c(ajw ajw, co co) {
		atl atl4 = ajw.o(co);
		alu alu5 = atl4.v();
		if (alu5 == alv.cv) {
			return false;
		} else if (alu5 == this || alu5 instanceof anm) {
			return true;
		} else {
			return alu5.x.k() && atl4.h() ? alu5.x != azs.C : false;
		}
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (arq.a a8 : arq.a.values()) {
			dd.add(new afj(afh, 1, a8.a()));
		}
	}

	@Override
	public int d(atl atl) {
		return ((arq.a)atl.c(f)).a();
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return cv == cv.DOWN ? super.a(atl, ajw, co, cv) : true;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(f, arq.a.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((arq.a)atl.c(f)).a();
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		boolean boolean5 = this.c(ajw, co.c());
		boolean boolean6 = this.c(ajw, co.f());
		boolean boolean7 = this.c(ajw, co.d());
		boolean boolean8 = this.c(ajw, co.e());
		boolean boolean9 = boolean5 && !boolean6 && boolean7 && !boolean8 || !boolean5 && boolean6 && !boolean7 && boolean8;
		return atl.a(a, !boolean9 || !ajw.d(co.a())).a(b, boolean5).a(c, boolean6).a(d, boolean7).a(e, boolean8);
	}

	@Override
	protected atm b() {
		return new atm(this, a, b, c, e, d, f);
	}

	public static enum a implements ox {
		NORMAL(0, "cobblestone", "normal"),
		MOSSY(1, "mossy_cobblestone", "mossy");

		private static final arq.a[] c = new arq.a[values().length];
		private final int d;
		private final String e;
		private final String f;

		private a(int integer3, String string4, String string5) {
			this.d = integer3;
			this.e = string4;
			this.f = string5;
		}

		public int a() {
			return this.d;
		}

		public String toString() {
			return this.e;
		}

		public static arq.a a(int integer) {
			if (integer < 0 || integer >= c.length) {
				integer = 0;
			}

			return c[integer];
		}

		@Override
		public String m() {
			return this.e;
		}

		public String c() {
			return this.f;
		}

		static {
			for (arq.a a4 : values()) {
				c[a4.a()] = a4;
			}
		}
	}
}

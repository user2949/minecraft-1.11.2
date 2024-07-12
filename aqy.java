import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class aqy extends alu {
	public static final aty a = aoi.D;
	public static final atz<aqy.a> b = atz.a("half", aqy.a.class);
	public static final atz<aqy.b> c = atz.a("shape", aqy.b.class);
	protected static final bdt d = new bdt(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt e = new bdt(0.0, 0.5, 0.0, 0.5, 1.0, 1.0);
	protected static final bdt f = new bdt(0.5, 0.5, 0.0, 1.0, 1.0, 1.0);
	protected static final bdt g = new bdt(0.0, 0.5, 0.0, 1.0, 1.0, 0.5);
	protected static final bdt B = new bdt(0.0, 0.5, 0.5, 1.0, 1.0, 1.0);
	protected static final bdt C = new bdt(0.0, 0.5, 0.0, 0.5, 1.0, 0.5);
	protected static final bdt D = new bdt(0.5, 0.5, 0.0, 1.0, 1.0, 0.5);
	protected static final bdt E = new bdt(0.0, 0.5, 0.5, 0.5, 1.0, 1.0);
	protected static final bdt F = new bdt(0.5, 0.5, 0.5, 1.0, 1.0, 1.0);
	protected static final bdt G = new bdt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
	protected static final bdt H = new bdt(0.0, 0.0, 0.0, 0.5, 0.5, 1.0);
	protected static final bdt I = new bdt(0.5, 0.0, 0.0, 1.0, 0.5, 1.0);
	protected static final bdt J = new bdt(0.0, 0.0, 0.0, 1.0, 0.5, 0.5);
	protected static final bdt K = new bdt(0.0, 0.0, 0.5, 1.0, 0.5, 1.0);
	protected static final bdt L = new bdt(0.0, 0.0, 0.0, 0.5, 0.5, 0.5);
	protected static final bdt M = new bdt(0.5, 0.0, 0.0, 1.0, 0.5, 0.5);
	protected static final bdt N = new bdt(0.0, 0.0, 0.5, 0.5, 0.5, 1.0);
	protected static final bdt O = new bdt(0.5, 0.0, 0.5, 1.0, 0.5, 1.0);
	private final alu P;
	private final atl Q;

	protected aqy(atl atl) {
		super(atl.v().x);
		this.y(this.A.b().a(a, cv.NORTH).a(b, aqy.a.BOTTOM).a(c, aqy.b.STRAIGHT));
		this.P = atl.v();
		this.Q = atl;
		this.c(this.P.q);
		this.b(this.P.r / 3.0F);
		this.a(this.P.v);
		this.d(255);
		this.a(aej.b);
	}

	@Override
	public void a(atl atl, ajs ajs, co co, bdt bdt, List<bdt> list, @Nullable sn sn, boolean boolean7) {
		if (!boolean7) {
			atl = this.c(atl, ajs, co);
		}

		for (bdt bdt10 : z(atl)) {
			a(co, bdt, list, bdt10);
		}
	}

	private static List<bdt> z(atl atl) {
		List<bdt> list2 = Lists.newArrayList();
		boolean boolean3 = atl.c(b) == aqy.a.TOP;
		list2.add(boolean3 ? d : G);
		aqy.b b4 = atl.c(c);
		if (b4 == aqy.b.STRAIGHT || b4 == aqy.b.INNER_LEFT || b4 == aqy.b.INNER_RIGHT) {
			list2.add(A(atl));
		}

		if (b4 != aqy.b.STRAIGHT) {
			list2.add(B(atl));
		}

		return list2;
	}

	private static bdt A(atl atl) {
		boolean boolean2 = atl.c(b) == aqy.a.TOP;
		switch ((cv)atl.c(a)) {
			case NORTH:
			default:
				return boolean2 ? J : g;
			case SOUTH:
				return boolean2 ? K : B;
			case WEST:
				return boolean2 ? H : e;
			case EAST:
				return boolean2 ? I : f;
		}
	}

	private static bdt B(atl atl) {
		cv cv2 = atl.c(a);
		cv cv3;
		switch ((aqy.b)atl.c(c)) {
			case OUTER_LEFT:
			default:
				cv3 = cv2;
				break;
			case OUTER_RIGHT:
				cv3 = cv2.e();
				break;
			case INNER_RIGHT:
				cv3 = cv2.d();
				break;
			case INNER_LEFT:
				cv3 = cv2.f();
		}

		boolean boolean4 = atl.c(b) == aqy.a.TOP;
		switch (cv3) {
			case NORTH:
			default:
				return boolean4 ? L : C;
			case SOUTH:
				return boolean4 ? O : F;
			case WEST:
				return boolean4 ? N : E;
			case EAST:
				return boolean4 ? M : D;
		}
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		this.P.a(atl, ajs, co, random);
	}

	@Override
	public void a(ajs ajs, co co, aay aay) {
		this.P.a(ajs, co, aay);
	}

	@Override
	public void d(ajs ajs, co co, atl atl) {
		this.P.d(ajs, co, atl);
	}

	@Override
	public int d(atl atl, ajw ajw, co co) {
		return this.Q.a(ajw, co);
	}

	@Override
	public float a(sn sn) {
		return this.P.a(sn);
	}

	@Override
	public ajk f() {
		return this.P.f();
	}

	@Override
	public int a(ajs ajs) {
		return this.P.a(ajs);
	}

	@Override
	public bdt b(atl atl, ajs ajs, co co) {
		return this.Q.c(ajs, co);
	}

	@Override
	public bdw a(ajs ajs, co co, sn sn, bdw bdw) {
		return this.P.a(ajs, co, sn, bdw);
	}

	@Override
	public boolean m() {
		return this.P.m();
	}

	@Override
	public boolean a(atl atl, boolean boolean2) {
		return this.P.a(atl, boolean2);
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return this.P.a(ajs, co);
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		this.Q.a(ajs, co, alv.a, co);
		this.P.c(ajs, co, this.Q);
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		this.P.b(ajs, co, this.Q);
	}

	@Override
	public void a(ajs ajs, co co, sn sn) {
		this.P.a(ajs, co, sn);
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		this.P.b(ajs, co, atl, random);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		return this.P.a(ajs, co, this.Q, aay, ri, cv.DOWN, 0.0F, 0.0F, 0.0F);
	}

	@Override
	public void a(ajs ajs, co co, ajn ajn) {
		this.P.a(ajs, co, ajn);
	}

	@Override
	public boolean k(atl atl) {
		return atl.c(b) == aqy.a.TOP;
	}

	@Override
	public azt r(atl atl) {
		return this.P.r(this.Q);
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		atl atl10 = super.a(ajs, co, cv, float4, float5, float6, integer, sw);
		atl10 = atl10.a(a, sw.bl()).a(c, aqy.b.STRAIGHT);
		return cv != cv.DOWN && (cv == cv.UP || !((double)float5 > 0.5)) ? atl10.a(b, aqy.a.BOTTOM) : atl10.a(b, aqy.a.TOP);
	}

	@Nullable
	@Override
	public bdu a(atl atl, ajs ajs, co co, bdw bdw4, bdw bdw5) {
		List<bdu> list7 = Lists.newArrayList();

		for (bdt bdt9 : z(this.c(atl, ajs, co))) {
			list7.add(this.a(co, bdw4, bdw5, bdt9));
		}

		bdu bdu8 = null;
		double double9 = 0.0;

		for (bdu bdu12 : list7) {
			if (bdu12 != null) {
				double double13 = bdu12.c.g(bdw5);
				if (double13 > double9) {
					bdu8 = bdu12;
					double9 = double13;
				}
			}
		}

		return bdu8;
	}

	@Override
	public atl a(int integer) {
		atl atl3 = this.t().a(b, (integer & 4) > 0 ? aqy.a.TOP : aqy.a.BOTTOM);
		return atl3.a(a, cv.a(5 - (integer & 3)));
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		if (atl.c(b) == aqy.a.TOP) {
			integer3 |= 4;
		}

		return integer3 | 5 - ((cv)atl.c(a)).a();
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		return atl.a(c, f(atl, ajw, co));
	}

	private static aqy.b f(atl atl, ajw ajw, co co) {
		cv cv4 = atl.c(a);
		atl atl5 = ajw.o(co.a(cv4));
		if (i(atl5) && atl.c(b) == atl5.c(b)) {
			cv cv6 = atl5.c(a);
			if (cv6.k() != ((cv)atl.c(a)).k() && d(atl, ajw, co, cv6.d())) {
				if (cv6 == cv4.f()) {
					return aqy.b.OUTER_LEFT;
				}

				return aqy.b.OUTER_RIGHT;
			}
		}

		atl atl6 = ajw.o(co.a(cv4.d()));
		if (i(atl6) && atl.c(b) == atl6.c(b)) {
			cv cv7 = atl6.c(a);
			if (cv7.k() != ((cv)atl.c(a)).k() && d(atl, ajw, co, cv7)) {
				if (cv7 == cv4.f()) {
					return aqy.b.INNER_LEFT;
				}

				return aqy.b.INNER_RIGHT;
			}
		}

		return aqy.b.STRAIGHT;
	}

	private static boolean d(atl atl, ajw ajw, co co, cv cv) {
		atl atl5 = ajw.o(co.a(cv));
		return !i(atl5) || atl5.c(a) != atl.c(a) || atl5.c(b) != atl.c(b);
	}

	public static boolean i(atl atl) {
		return atl.v() instanceof aqy;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		cv cv4 = atl.c(a);
		aqy.b b5 = atl.c(c);
		switch (aou) {
			case LEFT_RIGHT:
				if (cv4.k() == cv.a.Z) {
					switch (b5) {
						case OUTER_LEFT:
							return atl.a(aqi.CLOCKWISE_180).a(c, aqy.b.OUTER_RIGHT);
						case OUTER_RIGHT:
							return atl.a(aqi.CLOCKWISE_180).a(c, aqy.b.OUTER_LEFT);
						case INNER_RIGHT:
							return atl.a(aqi.CLOCKWISE_180).a(c, aqy.b.INNER_LEFT);
						case INNER_LEFT:
							return atl.a(aqi.CLOCKWISE_180).a(c, aqy.b.INNER_RIGHT);
						default:
							return atl.a(aqi.CLOCKWISE_180);
					}
				}
				break;
			case FRONT_BACK:
				if (cv4.k() == cv.a.X) {
					switch (b5) {
						case OUTER_LEFT:
							return atl.a(aqi.CLOCKWISE_180).a(c, aqy.b.OUTER_RIGHT);
						case OUTER_RIGHT:
							return atl.a(aqi.CLOCKWISE_180).a(c, aqy.b.OUTER_LEFT);
						case INNER_RIGHT:
							return atl.a(aqi.CLOCKWISE_180).a(c, aqy.b.INNER_RIGHT);
						case INNER_LEFT:
							return atl.a(aqi.CLOCKWISE_180).a(c, aqy.b.INNER_LEFT);
						case STRAIGHT:
							return atl.a(aqi.CLOCKWISE_180);
					}
				}
		}

		return super.a(atl, aou);
	}

	@Override
	protected atm b() {
		return new atm(this, a, b, c);
	}

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

	public static enum b implements ox {
		STRAIGHT("straight"),
		INNER_LEFT("inner_left"),
		INNER_RIGHT("inner_right"),
		OUTER_LEFT("outer_left"),
		OUTER_RIGHT("outer_right");

		private final String f;

		private b(String string3) {
			this.f = string3;
		}

		public String toString() {
			return this.f;
		}

		@Override
		public String m() {
			return this.f;
		}
	}
}

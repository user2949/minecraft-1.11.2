import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;

public class aqb extends alu {
	public static final atz<aqb.a> a = atz.a("north", aqb.a.class);
	public static final atz<aqb.a> b = atz.a("east", aqb.a.class);
	public static final atz<aqb.a> c = atz.a("south", aqb.a.class);
	public static final atz<aqb.a> d = atz.a("west", aqb.a.class);
	public static final aua e = aua.a("power", 0, 15);
	protected static final bdt[] f = new bdt[]{
		new bdt(0.1875, 0.0, 0.1875, 0.8125, 0.0625, 0.8125),
		new bdt(0.1875, 0.0, 0.1875, 0.8125, 0.0625, 1.0),
		new bdt(0.0, 0.0, 0.1875, 0.8125, 0.0625, 0.8125),
		new bdt(0.0, 0.0, 0.1875, 0.8125, 0.0625, 1.0),
		new bdt(0.1875, 0.0, 0.0, 0.8125, 0.0625, 0.8125),
		new bdt(0.1875, 0.0, 0.0, 0.8125, 0.0625, 1.0),
		new bdt(0.0, 0.0, 0.0, 0.8125, 0.0625, 0.8125),
		new bdt(0.0, 0.0, 0.0, 0.8125, 0.0625, 1.0),
		new bdt(0.1875, 0.0, 0.1875, 1.0, 0.0625, 0.8125),
		new bdt(0.1875, 0.0, 0.1875, 1.0, 0.0625, 1.0),
		new bdt(0.0, 0.0, 0.1875, 1.0, 0.0625, 0.8125),
		new bdt(0.0, 0.0, 0.1875, 1.0, 0.0625, 1.0),
		new bdt(0.1875, 0.0, 0.0, 1.0, 0.0625, 0.8125),
		new bdt(0.1875, 0.0, 0.0, 1.0, 0.0625, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.0625, 0.8125),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0)
	};
	private boolean g = true;
	private final Set<co> B = Sets.newHashSet();

	public aqb() {
		super(azs.q);
		this.y(this.A.b().a(a, aqb.a.NONE).a(b, aqb.a.NONE).a(c, aqb.a.NONE).a(d, aqb.a.NONE).a(e, 0));
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return f[z(atl.b(ajw, co))];
	}

	private static int z(atl atl) {
		int integer2 = 0;
		boolean boolean3 = atl.c(a) != aqb.a.NONE;
		boolean boolean4 = atl.c(b) != aqb.a.NONE;
		boolean boolean5 = atl.c(c) != aqb.a.NONE;
		boolean boolean6 = atl.c(d) != aqb.a.NONE;
		if (boolean3 || boolean5 && !boolean3 && !boolean4 && !boolean6) {
			integer2 |= 1 << cv.NORTH.b();
		}

		if (boolean4 || boolean6 && !boolean3 && !boolean4 && !boolean5) {
			integer2 |= 1 << cv.EAST.b();
		}

		if (boolean5 || boolean3 && !boolean4 && !boolean5 && !boolean6) {
			integer2 |= 1 << cv.SOUTH.b();
		}

		if (boolean6 || boolean4 && !boolean3 && !boolean5 && !boolean6) {
			integer2 |= 1 << cv.WEST.b();
		}

		return integer2;
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		atl = atl.a(d, this.b(ajw, co, cv.WEST));
		atl = atl.a(b, this.b(ajw, co, cv.EAST));
		atl = atl.a(a, this.b(ajw, co, cv.NORTH));
		return atl.a(c, this.b(ajw, co, cv.SOUTH));
	}

	private aqb.a b(ajw ajw, co co, cv cv) {
		co co5 = co.a(cv);
		atl atl6 = ajw.o(co.a(cv));
		if (!a(ajw.o(co5), cv) && (atl6.m() || !i(ajw.o(co5.b())))) {
			atl atl7 = ajw.o(co.a());
			if (!atl7.m()) {
				boolean boolean8 = ajw.o(co5).r() || ajw.o(co5).v() == alv.aX;
				if (boolean8 && i(ajw.o(co5.a()))) {
					if (atl6.l()) {
						return aqb.a.UP;
					}

					return aqb.a.SIDE;
				}
			}

			return aqb.a.NONE;
		} else {
			return aqb.a.SIDE;
		}
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
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
	public boolean a(ajs ajs, co co) {
		return ajs.o(co.b()).r() || ajs.o(co.b()).v() == alv.aX;
	}

	private atl e(ajs ajs, co co, atl atl) {
		atl = this.a(ajs, co, co, atl);
		List<co> list5 = Lists.newArrayList(this.B);
		this.B.clear();

		for (co co7 : list5) {
			ajs.b(co7, this, false);
		}

		return atl;
	}

	private atl a(ajs ajs, co co2, co co3, atl atl) {
		atl atl6 = atl;
		int integer7 = (Integer)atl.c(e);
		int integer8 = 0;
		integer8 = this.a(ajs, co3, integer8);
		this.g = false;
		int integer9 = ajs.z(co2);
		this.g = true;
		if (integer9 > 0 && integer9 > integer8 - 1) {
			integer8 = integer9;
		}

		int integer10 = 0;

		for (cv cv12 : cv.c.HORIZONTAL) {
			co co13 = co2.a(cv12);
			boolean boolean14 = co13.p() != co3.p() || co13.r() != co3.r();
			if (boolean14) {
				integer10 = this.a(ajs, co13, integer10);
			}

			if (ajs.o(co13).m() && !ajs.o(co2.a()).m()) {
				if (boolean14 && co2.q() >= co3.q()) {
					integer10 = this.a(ajs, co13.a(), integer10);
				}
			} else if (!ajs.o(co13).m() && boolean14 && co2.q() <= co3.q()) {
				integer10 = this.a(ajs, co13.b(), integer10);
			}
		}

		if (integer10 > integer8) {
			integer8 = integer10 - 1;
		} else if (integer8 > 0) {
			integer8--;
		} else {
			integer8 = 0;
		}

		if (integer9 > integer8 - 1) {
			integer8 = integer9;
		}

		if (integer7 != integer8) {
			atl = atl.a(e, integer8);
			if (ajs.o(co2) == atl6) {
				ajs.a(co2, atl, 2);
			}

			this.B.add(co2);

			for (cv cv14 : cv.values()) {
				this.B.add(co2.a(cv14));
			}
		}

		return atl;
	}

	private void b(ajs ajs, co co) {
		if (ajs.o(co).v() == this) {
			ajs.b(co, this, false);

			for (cv cv7 : cv.values()) {
				ajs.b(co.a(cv7), this, false);
			}
		}
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			this.e(ajs, co, atl);

			for (cv cv6 : cv.c.VERTICAL) {
				ajs.b(co.a(cv6), this, false);
			}

			for (cv cv6 : cv.c.HORIZONTAL) {
				this.b(ajs, co.a(cv6));
			}

			for (cv cv6 : cv.c.HORIZONTAL) {
				co co7 = co.a(cv6);
				if (ajs.o(co7).m()) {
					this.b(ajs, co7.a());
				} else {
					this.b(ajs, co7.b());
				}
			}
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		super.b(ajs, co, atl);
		if (!ajs.E) {
			for (cv cv8 : cv.values()) {
				ajs.b(co.a(cv8), this, false);
			}

			this.e(ajs, co, atl);

			for (cv cv6 : cv.c.HORIZONTAL) {
				this.b(ajs, co.a(cv6));
			}

			for (cv cv6 : cv.c.HORIZONTAL) {
				co co7 = co.a(cv6);
				if (ajs.o(co7).m()) {
					this.b(ajs, co7.a());
				} else {
					this.b(ajs, co7.b());
				}
			}
		}
	}

	private int a(ajs ajs, co co, int integer) {
		if (ajs.o(co).v() != this) {
			return integer;
		} else {
			int integer5 = (Integer)ajs.o(co).c(e);
			return integer5 > integer ? integer5 : integer;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E) {
			if (this.a(ajs, co3)) {
				this.e(ajs, co3, atl);
			} else {
				this.b(ajs, co3, atl, 0);
				ajs.g(co3);
			}
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.aF;
	}

	@Override
	public int c(atl atl, ajw ajw, co co, cv cv) {
		return !this.g ? 0 : atl.a(ajw, co, cv);
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		if (!this.g) {
			return 0;
		} else {
			int integer6 = (Integer)atl.c(e);
			if (integer6 == 0) {
				return 0;
			} else if (cv == cv.UP) {
				return integer6;
			} else {
				EnumSet<cv> enumSet7 = EnumSet.noneOf(cv.class);

				for (cv cv9 : cv.c.HORIZONTAL) {
					if (this.c(ajw, co, cv9)) {
						enumSet7.add(cv9);
					}
				}

				if (cv.k().c() && enumSet7.isEmpty()) {
					return integer6;
				} else {
					return enumSet7.contains(cv) && !enumSet7.contains(cv.f()) && !enumSet7.contains(cv.e()) ? integer6 : 0;
				}
			}
		}
	}

	private boolean c(ajw ajw, co co, cv cv) {
		co co5 = co.a(cv);
		atl atl6 = ajw.o(co5);
		boolean boolean7 = atl6.m();
		boolean boolean8 = ajw.o(co.a()).m();
		if (!boolean8 && boolean7 && c(ajw, co5.a())) {
			return true;
		} else if (a(atl6, cv)) {
			return true;
		} else {
			return atl6.v() == alv.bc && atl6.c(amt.D) == cv ? true : !boolean7 && c(ajw, co5.b());
		}
	}

	protected static boolean c(ajw ajw, co co) {
		return i(ajw.o(co));
	}

	protected static boolean i(atl atl) {
		return a(atl, null);
	}

	protected static boolean a(atl atl, @Nullable cv cv) {
		alu alu3 = atl.v();
		if (alu3 == alv.af) {
			return true;
		} else if (alv.bb.E(atl)) {
			cv cv4 = atl.c(aqg.D);
			return cv4 == cv || cv4.d() == cv;
		} else {
			return alv.dk == atl.v() ? cv == atl.c(aph.H) : atl.n() && cv != null;
		}
	}

	@Override
	public boolean g(atl atl) {
		return this.g;
	}

	public static int e(int integer) {
		float float2 = (float)integer / 15.0F;
		float float3 = float2 * 0.6F + 0.4F;
		if (integer == 0) {
			float3 = 0.3F;
		}

		float float4 = float2 * float2 * 0.7F - 0.5F;
		float float5 = float2 * float2 * 0.6F - 0.7F;
		if (float4 < 0.0F) {
			float4 = 0.0F;
		}

		if (float5 < 0.0F) {
			float5 = 0.0F;
		}

		int integer6 = ot.a((int)(float3 * 255.0F), 0, 255);
		int integer7 = ot.a((int)(float4 * 255.0F), 0, 255);
		int integer8 = ot.a((int)(float5 * 255.0F), 0, 255);
		return 0xFF000000 | integer6 << 16 | integer7 << 8 | integer8;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		int integer6 = (Integer)atl.c(e);
		if (integer6 != 0) {
			double double7 = (double)co.p() + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
			double double9 = (double)((float)co.q() + 0.0625F);
			double double11 = (double)co.r() + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
			float float13 = (float)integer6 / 15.0F;
			float float14 = float13 * 0.6F + 0.4F;
			float float15 = Math.max(0.0F, float13 * float13 * 0.7F - 0.5F);
			float float16 = Math.max(0.0F, float13 * float13 * 0.6F - 0.7F);
			ajs.a(de.REDSTONE, double7, double9, double11, (double)float14, (double)float15, (double)float16);
		}
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.aF);
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(e, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(e);
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		switch (aqi) {
			case CLOCKWISE_180:
				return atl.a(a, atl.c(c)).a(b, atl.c(d)).a(c, atl.c(a)).a(d, atl.c(b));
			case COUNTERCLOCKWISE_90:
				return atl.a(a, atl.c(b)).a(b, atl.c(c)).a(c, atl.c(d)).a(d, atl.c(a));
			case CLOCKWISE_90:
				return atl.a(a, atl.c(d)).a(b, atl.c(a)).a(c, atl.c(b)).a(d, atl.c(c));
			default:
				return atl;
		}
	}

	@Override
	public atl a(atl atl, aou aou) {
		switch (aou) {
			case LEFT_RIGHT:
				return atl.a(a, atl.c(c)).a(c, atl.c(a));
			case FRONT_BACK:
				return atl.a(b, atl.c(d)).a(d, atl.c(b));
			default:
				return super.a(atl, aou);
		}
	}

	@Override
	protected atm b() {
		return new atm(this, a, b, c, d, e);
	}

	static enum a implements ox {
		UP("up"),
		SIDE("side"),
		NONE("none");

		private final String d;

		private a(String string3) {
			this.d = string3;
		}

		public String toString() {
			return this.m();
		}

		@Override
		public String m() {
			return this.d;
		}
	}
}

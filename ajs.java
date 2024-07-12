import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class ajs implements ajw {
	private int a = 63;
	protected boolean d;
	public final List<sn> e = Lists.newArrayList();
	protected final List<sn> f = Lists.newArrayList();
	public final List<asc> g = Lists.newArrayList();
	public final List<asc> h = Lists.newArrayList();
	private final List<asc> b = Lists.newArrayList();
	private final List<asc> c = Lists.newArrayList();
	public final List<aay> i = Lists.newArrayList();
	public final List<sn> j = Lists.newArrayList();
	protected final oo<sn> k = new oo<>();
	private final long I = 16777215L;
	private int J;
	protected int l = new Random().nextInt();
	protected final int m = 1013904223;
	protected float n;
	protected float o;
	protected float p;
	protected float q;
	private int K;
	public final Random r = new Random();
	public final avf s;
	protected wg t = new wg();
	protected List<aju> u = Lists.newArrayList(new aju[]{this.t});
	protected auj v;
	protected final bbw w;
	protected bbv x;
	protected boolean y;
	protected bce z;
	protected wr A;
	protected bcn B;
	public final ou C;
	private final Calendar L = Calendar.getInstance();
	protected bec D = new bec();
	public final boolean E;
	protected boolean F = true;
	protected boolean G = true;
	private boolean M;
	private final auf N;
	int[] H = new int[32768];

	protected ajs(bbw bbw, bbv bbv, avf avf, ou ou, boolean boolean5) {
		this.w = bbw;
		this.C = ou;
		this.x = bbv;
		this.s = avf;
		this.E = boolean5;
		this.N = avf.p();
	}

	public ajs b() {
		return this;
	}

	@Override
	public akf b(co co) {
		if (this.e(co)) {
			auo auo3 = this.f(co);

			try {
				return auo3.a(co, this.s.k());
			} catch (Throwable var6) {
				b b5 = b.a(var6, "Getting biome");
				c c6 = b5.a("Coordinates of biome request");
				c6.a("Location", new d<String>() {
					public String call() throws Exception {
						return c.a(co);
					}
				});
				throw new f(b5);
			}
		} else {
			return this.s.k().a(co, akk.c);
		}
	}

	public akj A() {
		return this.s.k();
	}

	protected abstract auj n();

	public void a(ajv ajv) {
		this.x.d(true);
	}

	@Nullable
	public MinecraftServer u() {
		return null;
	}

	public void h() {
		this.A(new co(8, 64, 8));
	}

	public atl c(co co) {
		co co3 = new co(co.p(), this.K(), co.r());

		while (!this.d(co3.a())) {
			co3 = co3.a();
		}

		return this.o(co3);
	}

	private boolean a(co co) {
		return !this.E(co) && co.p() >= -30000000 && co.r() >= -30000000 && co.p() < 30000000 && co.r() < 30000000;
	}

	private boolean E(co co) {
		return co.q() < 0 || co.q() >= 256;
	}

	@Override
	public boolean d(co co) {
		return this.o(co).a() == azs.a;
	}

	public boolean e(co co) {
		return this.a(co, true);
	}

	public boolean a(co co, boolean boolean2) {
		return this.a(co.p() >> 4, co.r() >> 4, boolean2);
	}

	public boolean a(co co, int integer) {
		return this.a(co, integer, true);
	}

	public boolean a(co co, int integer, boolean boolean3) {
		return this.a(co.p() - integer, co.q() - integer, co.r() - integer, co.p() + integer, co.q() + integer, co.r() + integer, boolean3);
	}

	public boolean a(co co1, co co2) {
		return this.a(co1, co2, true);
	}

	public boolean a(co co1, co co2, boolean boolean3) {
		return this.a(co1.p(), co1.q(), co1.r(), co2.p(), co2.q(), co2.r(), boolean3);
	}

	public boolean a(axz axz) {
		return this.b(axz, true);
	}

	public boolean b(axz axz, boolean boolean2) {
		return this.a(axz.a, axz.b, axz.c, axz.d, axz.e, axz.f, boolean2);
	}

	private boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, boolean boolean7) {
		if (integer5 >= 0 && integer2 < 256) {
			integer1 >>= 4;
			integer3 >>= 4;
			integer4 >>= 4;
			integer6 >>= 4;

			for (int integer9 = integer1; integer9 <= integer4; integer9++) {
				for (int integer10 = integer3; integer10 <= integer6; integer10++) {
					if (!this.a(integer9, integer10, boolean7)) {
						return false;
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	protected abstract boolean a(int integer1, int integer2, boolean boolean3);

	public auo f(co co) {
		return this.a(co.p() >> 4, co.r() >> 4);
	}

	public auo a(int integer1, int integer2) {
		return this.v.c(integer1, integer2);
	}

	public boolean b(int integer1, int integer2) {
		return this.a(integer1, integer2, false) ? true : this.v.e(integer1, integer2);
	}

	public boolean a(co co, atl atl, int integer) {
		if (this.E(co)) {
			return false;
		} else if (!this.E && this.x.t() == ajx.g) {
			return false;
		} else {
			auo auo5 = this.f(co);
			alu alu6 = atl.v();
			atl atl7 = auo5.a(co, atl);
			if (atl7 == null) {
				return false;
			} else {
				if (atl.c() != atl7.c() || atl.d() != atl7.d()) {
					this.C.a("checkLight");
					this.w(co);
					this.C.b();
				}

				if ((integer & 2) != 0 && (!this.E || (integer & 4) == 0) && auo5.i()) {
					this.a(co, atl7, atl, integer);
				}

				if (!this.E && (integer & 1) != 0) {
					this.a(co, atl7.v(), true);
					if (atl.o()) {
						this.d(co, alu6);
					}
				} else if (!this.E && (integer & 16) == 0) {
					this.c(co, alu6);
				}

				return true;
			}
		}
	}

	public boolean g(co co) {
		return this.a(co, alv.a.t(), 3);
	}

	public boolean b(co co, boolean boolean2) {
		atl atl4 = this.o(co);
		alu alu5 = atl4.v();
		if (atl4.a() == azs.a) {
			return false;
		} else {
			this.b(2001, co, alu.j(atl4));
			if (boolean2) {
				alu5.b(this, co, atl4, 0);
			}

			return this.a(co, alv.a.t(), 3);
		}
	}

	public boolean a(co co, atl atl) {
		return this.a(co, atl, 3);
	}

	public void a(co co, atl atl2, atl atl3, int integer) {
		for (int integer6 = 0; integer6 < this.u.size(); integer6++) {
			((aju)this.u.get(integer6)).a(this, co, atl2, atl3, integer);
		}
	}

	public void a(co co, alu alu, boolean boolean3) {
		if (this.x.t() != ajx.g) {
			this.b(co, alu, boolean3);
		}
	}

	public void a(int integer1, int integer2, int integer3, int integer4) {
		if (integer3 > integer4) {
			int integer6 = integer4;
			integer4 = integer3;
			integer3 = integer6;
		}

		if (this.s.m()) {
			for (int integer6 = integer3; integer6 <= integer4; integer6++) {
				this.c(ajy.SKY, new co(integer1, integer6, integer2));
			}
		}

		this.b(integer1, integer3, integer2, integer1, integer4, integer2);
	}

	public void b(co co1, co co2) {
		this.b(co1.p(), co1.q(), co1.r(), co2.p(), co2.q(), co2.r());
	}

	public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		for (int integer8 = 0; integer8 < this.u.size(); integer8++) {
			((aju)this.u.get(integer8)).a(integer1, integer2, integer3, integer4, integer5, integer6);
		}
	}

	public void c(co co, alu alu) {
		this.b(co.e(), alu, co);
		this.b(co.f(), alu, co);
		this.b(co.b(), alu, co);
		this.b(co.a(), alu, co);
		this.b(co.c(), alu, co);
		this.b(co.d(), alu, co);
	}

	public void b(co co, alu alu, boolean boolean3) {
		this.a(co.e(), alu, co);
		this.a(co.f(), alu, co);
		this.a(co.b(), alu, co);
		this.a(co.a(), alu, co);
		this.a(co.c(), alu, co);
		this.a(co.d(), alu, co);
		if (boolean3) {
			this.c(co, alu);
		}
	}

	public void a(co co, alu alu, cv cv) {
		if (cv != cv.WEST) {
			this.a(co.e(), alu, co);
		}

		if (cv != cv.EAST) {
			this.a(co.f(), alu, co);
		}

		if (cv != cv.DOWN) {
			this.a(co.b(), alu, co);
		}

		if (cv != cv.UP) {
			this.a(co.a(), alu, co);
		}

		if (cv != cv.NORTH) {
			this.a(co.c(), alu, co);
		}

		if (cv != cv.SOUTH) {
			this.a(co.d(), alu, co);
		}
	}

	public void a(co co1, alu alu, co co3) {
		if (!this.E) {
			atl atl5 = this.o(co1);

			try {
				atl5.a(this, co1, alu, co3);
			} catch (Throwable var8) {
				b b7 = b.a(var8, "Exception while updating neighbours");
				c c8 = b7.a("Block being updated");
				c8.a("Source block type", new d<String>() {
					public String call() throws Exception {
						try {
							return String.format("ID #%d (%s // %s)", alu.a(alu), alu.a(), alu.getClass().getCanonicalName());
						} catch (Throwable var2) {
							return "ID #" + alu.a(alu);
						}
					}
				});
				c.a(c8, co1, atl5);
				throw new f(b7);
			}
		}
	}

	public void b(co co1, alu alu, co co3) {
		if (!this.E) {
			atl atl5 = this.o(co1);
			if (atl5.v() == alv.dk) {
				try {
					((aph)atl5.v()).b(atl5, this, co1, alu, co3);
				} catch (Throwable var8) {
					b b7 = b.a(var8, "Exception while updating neighbours");
					c c8 = b7.a("Block being updated");
					c8.a("Source block type", new d<String>() {
						public String call() throws Exception {
							try {
								return String.format("ID #%d (%s // %s)", alu.a(alu), alu.a(), alu.getClass().getCanonicalName());
							} catch (Throwable var2) {
								return "ID #" + alu.a(alu);
							}
						}
					});
					c.a(c8, co1, atl5);
					throw new f(b7);
				}
			}
		}
	}

	public boolean a(co co, alu alu) {
		return false;
	}

	public boolean h(co co) {
		return this.f(co).c(co);
	}

	public boolean i(co co) {
		if (co.q() >= this.K()) {
			return this.h(co);
		} else {
			co co3 = new co(co.p(), this.K(), co.r());
			if (!this.h(co3)) {
				return false;
			} else {
				for (co var4 = co3.b(); var4.q() > co.q(); var4 = var4.b()) {
					atl atl4 = this.o(var4);
					if (atl4.c() > 0 && !atl4.a().d()) {
						return false;
					}
				}

				return true;
			}
		}
	}

	public int j(co co) {
		if (co.q() < 0) {
			return 0;
		} else {
			if (co.q() >= 256) {
				co = new co(co.p(), 255, co.r());
			}

			return this.f(co).a(co, 0);
		}
	}

	public int k(co co) {
		return this.c(co, true);
	}

	public int c(co co, boolean boolean2) {
		if (co.p() < -30000000 || co.r() < -30000000 || co.p() >= 30000000 || co.r() >= 30000000) {
			return 15;
		} else if (boolean2 && this.o(co).f()) {
			int integer4 = this.c(co.a(), false);
			int integer5 = this.c(co.f(), false);
			int integer6 = this.c(co.e(), false);
			int integer7 = this.c(co.d(), false);
			int integer8 = this.c(co.c(), false);
			if (integer5 > integer4) {
				integer4 = integer5;
			}

			if (integer6 > integer4) {
				integer4 = integer6;
			}

			if (integer7 > integer4) {
				integer4 = integer7;
			}

			if (integer8 > integer4) {
				integer4 = integer8;
			}

			return integer4;
		} else if (co.q() < 0) {
			return 0;
		} else {
			if (co.q() >= 256) {
				co = new co(co.p(), 255, co.r());
			}

			auo auo4 = this.f(co);
			return auo4.a(co, this.J);
		}
	}

	public co l(co co) {
		return new co(co.p(), this.c(co.p(), co.r()), co.r());
	}

	public int c(int integer1, int integer2) {
		int integer4;
		if (integer1 >= -30000000 && integer2 >= -30000000 && integer1 < 30000000 && integer2 < 30000000) {
			if (this.a(integer1 >> 4, integer2 >> 4, true)) {
				integer4 = this.a(integer1 >> 4, integer2 >> 4).b(integer1 & 15, integer2 & 15);
			} else {
				integer4 = 0;
			}
		} else {
			integer4 = this.K() + 1;
		}

		return integer4;
	}

	@Deprecated
	public int d(int integer1, int integer2) {
		if (integer1 >= -30000000 && integer2 >= -30000000 && integer1 < 30000000 && integer2 < 30000000) {
			if (!this.a(integer1 >> 4, integer2 >> 4, true)) {
				return 0;
			} else {
				auo auo4 = this.a(integer1 >> 4, integer2 >> 4);
				return auo4.w();
			}
		} else {
			return this.K() + 1;
		}
	}

	public int a(ajy ajy, co co) {
		if (!this.s.m() && ajy == ajy.SKY) {
			return 0;
		} else {
			if (co.q() < 0) {
				co = new co(co.p(), 0, co.r());
			}

			if (!this.a(co)) {
				return ajy.c;
			} else if (!this.e(co)) {
				return ajy.c;
			} else if (this.o(co).f()) {
				int integer4 = this.b(ajy, co.a());
				int integer5 = this.b(ajy, co.f());
				int integer6 = this.b(ajy, co.e());
				int integer7 = this.b(ajy, co.d());
				int integer8 = this.b(ajy, co.c());
				if (integer5 > integer4) {
					integer4 = integer5;
				}

				if (integer6 > integer4) {
					integer4 = integer6;
				}

				if (integer7 > integer4) {
					integer4 = integer7;
				}

				if (integer8 > integer4) {
					integer4 = integer8;
				}

				return integer4;
			} else {
				auo auo4 = this.f(co);
				return auo4.a(ajy, co);
			}
		}
	}

	public int b(ajy ajy, co co) {
		if (co.q() < 0) {
			co = new co(co.p(), 0, co.r());
		}

		if (!this.a(co)) {
			return ajy.c;
		} else if (!this.e(co)) {
			return ajy.c;
		} else {
			auo auo4 = this.f(co);
			return auo4.a(ajy, co);
		}
	}

	public void a(ajy ajy, co co, int integer) {
		if (this.a(co)) {
			if (this.e(co)) {
				auo auo5 = this.f(co);
				auo5.a(ajy, co, integer);
				this.m(co);
			}
		}
	}

	public void m(co co) {
		for (int integer3 = 0; integer3 < this.u.size(); integer3++) {
			((aju)this.u.get(integer3)).a(co);
		}
	}

	@Override
	public int b(co co, int integer) {
		int integer4 = this.a(ajy.SKY, co);
		int integer5 = this.a(ajy.BLOCK, co);
		if (integer5 < integer) {
			integer5 = integer;
		}

		return integer4 << 20 | integer5 << 4;
	}

	public float n(co co) {
		return this.s.o()[this.k(co)];
	}

	@Override
	public atl o(co co) {
		if (this.E(co)) {
			return alv.a.t();
		} else {
			auo auo3 = this.f(co);
			return auo3.a(co);
		}
	}

	public boolean B() {
		return this.J < 4;
	}

	@Nullable
	public bdu a(bdw bdw1, bdw bdw2) {
		return this.a(bdw1, bdw2, false, false, false);
	}

	@Nullable
	public bdu a(bdw bdw1, bdw bdw2, boolean boolean3) {
		return this.a(bdw1, bdw2, boolean3, false, false);
	}

	@Nullable
	public bdu a(bdw bdw1, bdw bdw2, boolean boolean3, boolean boolean4, boolean boolean5) {
		if (Double.isNaN(bdw1.b) || Double.isNaN(bdw1.c) || Double.isNaN(bdw1.d)) {
			return null;
		} else if (!Double.isNaN(bdw2.b) && !Double.isNaN(bdw2.c) && !Double.isNaN(bdw2.d)) {
			int integer7 = ot.c(bdw2.b);
			int integer8 = ot.c(bdw2.c);
			int integer9 = ot.c(bdw2.d);
			int integer10 = ot.c(bdw1.b);
			int integer11 = ot.c(bdw1.c);
			int integer12 = ot.c(bdw1.d);
			co co13 = new co(integer10, integer11, integer12);
			atl atl14 = this.o(co13);
			alu alu15 = atl14.v();
			if ((!boolean4 || atl14.c((ajw)this, co13) != alu.k) && alu15.a(atl14, boolean3)) {
				bdu bdu16 = atl14.a(this, co13, bdw1, bdw2);
				if (bdu16 != null) {
					return bdu16;
				}
			}

			bdu bdu14 = null;
			int integer15 = 200;

			while (integer15-- >= 0) {
				if (Double.isNaN(bdw1.b) || Double.isNaN(bdw1.c) || Double.isNaN(bdw1.d)) {
					return null;
				}

				if (integer10 == integer7 && integer11 == integer8 && integer12 == integer9) {
					return boolean5 ? bdu14 : null;
				}

				boolean boolean16 = true;
				boolean boolean17 = true;
				boolean boolean18 = true;
				double double19 = 999.0;
				double double21 = 999.0;
				double double23 = 999.0;
				if (integer7 > integer10) {
					double19 = (double)integer10 + 1.0;
				} else if (integer7 < integer10) {
					double19 = (double)integer10 + 0.0;
				} else {
					boolean16 = false;
				}

				if (integer8 > integer11) {
					double21 = (double)integer11 + 1.0;
				} else if (integer8 < integer11) {
					double21 = (double)integer11 + 0.0;
				} else {
					boolean17 = false;
				}

				if (integer9 > integer12) {
					double23 = (double)integer12 + 1.0;
				} else if (integer9 < integer12) {
					double23 = (double)integer12 + 0.0;
				} else {
					boolean18 = false;
				}

				double double25 = 999.0;
				double double27 = 999.0;
				double double29 = 999.0;
				double double31 = bdw2.b - bdw1.b;
				double double33 = bdw2.c - bdw1.c;
				double double35 = bdw2.d - bdw1.d;
				if (boolean16) {
					double25 = (double19 - bdw1.b) / double31;
				}

				if (boolean17) {
					double27 = (double21 - bdw1.c) / double33;
				}

				if (boolean18) {
					double29 = (double23 - bdw1.d) / double35;
				}

				if (double25 == -0.0) {
					double25 = -1.0E-4;
				}

				if (double27 == -0.0) {
					double27 = -1.0E-4;
				}

				if (double29 == -0.0) {
					double29 = -1.0E-4;
				}

				cv cv37;
				if (double25 < double27 && double25 < double29) {
					cv37 = integer7 > integer10 ? cv.WEST : cv.EAST;
					bdw1 = new bdw(double19, bdw1.c + double33 * double25, bdw1.d + double35 * double25);
				} else if (double27 < double29) {
					cv37 = integer8 > integer11 ? cv.DOWN : cv.UP;
					bdw1 = new bdw(bdw1.b + double31 * double27, double21, bdw1.d + double35 * double27);
				} else {
					cv37 = integer9 > integer12 ? cv.NORTH : cv.SOUTH;
					bdw1 = new bdw(bdw1.b + double31 * double29, bdw1.c + double33 * double29, double23);
				}

				integer10 = ot.c(bdw1.b) - (cv37 == cv.EAST ? 1 : 0);
				integer11 = ot.c(bdw1.c) - (cv37 == cv.UP ? 1 : 0);
				integer12 = ot.c(bdw1.d) - (cv37 == cv.SOUTH ? 1 : 0);
				co13 = new co(integer10, integer11, integer12);
				atl atl38 = this.o(co13);
				alu alu39 = atl38.v();
				if (!boolean4 || atl38.a() == azs.E || atl38.c((ajw)this, co13) != alu.k) {
					if (alu39.a(atl38, boolean3)) {
						bdu bdu40 = atl38.a(this, co13, bdw1, bdw2);
						if (bdu40 != null) {
							return bdu40;
						}
					} else {
						bdu14 = new bdu(bdu.a.MISS, bdw1, cv37, co13);
					}
				}
			}

			return boolean5 ? bdu14 : null;
		} else {
			return null;
		}
	}

	public void a(@Nullable aay aay, co co, nm nm, no no, float float5, float float6) {
		this.a(aay, (double)co.p() + 0.5, (double)co.q() + 0.5, (double)co.r() + 0.5, nm, no, float5, float6);
	}

	public void a(@Nullable aay aay, double double2, double double3, double double4, nm nm, no no, float float7, float float8) {
		for (int integer13 = 0; integer13 < this.u.size(); integer13++) {
			((aju)this.u.get(integer13)).a(aay, nm, no, double2, double3, double4, float7, float8);
		}
	}

	public void a(double double1, double double2, double double3, nm nm, no no, float float6, float float7, boolean boolean8) {
	}

	public void a(co co, @Nullable nm nm) {
		for (int integer4 = 0; integer4 < this.u.size(); integer4++) {
			((aju)this.u.get(integer4)).a(nm, co);
		}
	}

	public void a(de de, double double2, double double3, double double4, double double5, double double6, double double7, int... arr) {
		this.a(de.c(), de.e(), double2, double3, double4, double5, double6, double7, arr);
	}

	public void a(int integer, double double2, double double3, double double4, double double5, double double6, double double7, int... arr) {
		for (int integer16 = 0; integer16 < this.u.size(); integer16++) {
			((aju)this.u.get(integer16)).a(integer, false, true, double2, double3, double4, double5, double6, double7, arr);
		}
	}

	public void a(de de, boolean boolean2, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
		this.a(de.c(), de.e() || boolean2, double3, double4, double5, double6, double7, double8, arr);
	}

	private void a(int integer, boolean boolean2, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
		for (int integer17 = 0; integer17 < this.u.size(); integer17++) {
			((aju)this.u.get(integer17)).a(integer, boolean2, double3, double4, double5, double6, double7, double8, arr);
		}
	}

	public boolean d(sn sn) {
		this.j.add(sn);
		return true;
	}

	public boolean a(sn sn) {
		int integer3 = ot.c(sn.p / 16.0);
		int integer4 = ot.c(sn.r / 16.0);
		boolean boolean5 = sn.k;
		if (sn instanceof aay) {
			boolean5 = true;
		}

		if (!boolean5 && !this.a(integer3, integer4, false)) {
			return false;
		} else {
			if (sn instanceof aay) {
				aay aay6 = (aay)sn;
				this.i.add(aay6);
				this.e();
			}

			this.a(integer3, integer4).a(sn);
			this.e.add(sn);
			this.b(sn);
			return true;
		}
	}

	protected void b(sn sn) {
		for (int integer3 = 0; integer3 < this.u.size(); integer3++) {
			((aju)this.u.get(integer3)).a(sn);
		}
	}

	protected void c(sn sn) {
		for (int integer3 = 0; integer3 < this.u.size(); integer3++) {
			((aju)this.u.get(integer3)).b(sn);
		}
	}

	public void e(sn sn) {
		if (sn.aL()) {
			sn.az();
		}

		if (sn.aK()) {
			sn.p();
		}

		sn.T();
		if (sn instanceof aay) {
			this.i.remove(sn);
			this.e();
			this.c(sn);
		}
	}

	public void f(sn sn) {
		sn.b(false);
		sn.T();
		if (sn instanceof aay) {
			this.i.remove(sn);
			this.e();
		}

		int integer3 = sn.ab;
		int integer4 = sn.ad;
		if (sn.aa && this.a(integer3, integer4, true)) {
			this.a(integer3, integer4).b(sn);
		}

		this.e.remove(sn);
		this.c(sn);
	}

	public void a(aju aju) {
		this.u.add(aju);
	}

	public void b(aju aju) {
		this.u.remove(aju);
	}

	private boolean a(@Nullable sn sn, bdt bdt, boolean boolean3, @Nullable List<bdt> list) {
		int integer6 = ot.c(bdt.a) - 1;
		int integer7 = ot.f(bdt.d) + 1;
		int integer8 = ot.c(bdt.b) - 1;
		int integer9 = ot.f(bdt.e) + 1;
		int integer10 = ot.c(bdt.c) - 1;
		int integer11 = ot.f(bdt.f) + 1;
		auf auf12 = this.aj();
		boolean boolean13 = sn != null && sn.br();
		boolean boolean14 = sn != null && this.g(sn);
		atl atl15 = alv.b.t();
		co.b b16 = co.b.s();

		try {
			for (int integer17 = integer6; integer17 < integer7; integer17++) {
				for (int integer18 = integer10; integer18 < integer11; integer18++) {
					boolean boolean19 = integer17 == integer6 || integer17 == integer7 - 1;
					boolean boolean20 = integer18 == integer10 || integer18 == integer11 - 1;
					if ((!boolean19 || !boolean20) && this.e(b16.f(integer17, 64, integer18))) {
						for (int integer21 = integer8; integer21 < integer9; integer21++) {
							if (!boolean19 && !boolean20 || integer21 != integer9 - 1) {
								if (boolean3) {
									if (integer17 < -30000000 || integer17 >= 30000000 || integer18 < -30000000 || integer18 >= 30000000) {
										return true;
									}
								} else if (sn != null && boolean13 == boolean14) {
									sn.k(!boolean14);
								}

								b16.f(integer17, integer21, integer18);
								atl atl22;
								if (!boolean3 && !auf12.a(b16) && boolean14) {
									atl22 = atl15;
								} else {
									atl22 = this.o(b16);
								}

								atl22.a(this, b16, bdt, list, sn, false);
								if (boolean3 && !list.isEmpty()) {
									return true;
								}
							}
						}
					}
				}
			}
		} finally {
			b16.t();
		}

		return !list.isEmpty();
	}

	public List<bdt> a(@Nullable sn sn, bdt bdt) {
		List<bdt> list4 = Lists.newArrayList();
		this.a(sn, bdt, false, list4);
		if (sn != null) {
			List<sn> list5 = this.b(sn, bdt.g(0.25));

			for (int integer6 = 0; integer6 < list5.size(); integer6++) {
				sn sn7 = (sn)list5.get(integer6);
				if (!sn.x(sn7)) {
					bdt bdt8 = sn7.ag();
					if (bdt8 != null && bdt8.c(bdt)) {
						list4.add(bdt8);
					}

					bdt8 = sn.j(sn7);
					if (bdt8 != null && bdt8.c(bdt)) {
						list4.add(bdt8);
					}
				}
			}
		}

		return list4;
	}

	public boolean g(sn sn) {
		double double3 = this.N.b();
		double double5 = this.N.c();
		double double7 = this.N.d();
		double double9 = this.N.e();
		if (sn.br()) {
			double3++;
			double5++;
			double7--;
			double9--;
		} else {
			double3--;
			double5--;
			double7++;
			double9++;
		}

		return sn.p > double3 && sn.p < double7 && sn.r > double5 && sn.r < double9;
	}

	public boolean a(bdt bdt) {
		return this.a(null, bdt, true, Lists.newArrayList());
	}

	public int a(float float1) {
		float float3 = this.c(float1);
		float float4 = 1.0F - (ot.b(float3 * (float) (Math.PI * 2)) * 2.0F + 0.5F);
		float4 = ot.a(float4, 0.0F, 1.0F);
		float4 = 1.0F - float4;
		float4 = (float)((double)float4 * (1.0 - (double)(this.j(float1) * 5.0F) / 16.0));
		float4 = (float)((double)float4 * (1.0 - (double)(this.h(float1) * 5.0F) / 16.0));
		float4 = 1.0F - float4;
		return (int)(float4 * 11.0F);
	}

	public float b(float float1) {
		float float3 = this.c(float1);
		float float4 = 1.0F - (ot.b(float3 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
		float4 = ot.a(float4, 0.0F, 1.0F);
		float4 = 1.0F - float4;
		float4 = (float)((double)float4 * (1.0 - (double)(this.j(float1) * 5.0F) / 16.0));
		float4 = (float)((double)float4 * (1.0 - (double)(this.h(float1) * 5.0F) / 16.0));
		return float4 * 0.8F + 0.2F;
	}

	public bdw a(sn sn, float float2) {
		float float4 = this.c(float2);
		float float5 = ot.b(float4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
		float5 = ot.a(float5, 0.0F, 1.0F);
		int integer6 = ot.c(sn.p);
		int integer7 = ot.c(sn.q);
		int integer8 = ot.c(sn.r);
		co co9 = new co(integer6, integer7, integer8);
		akf akf10 = this.b(co9);
		float float11 = akf10.a(co9);
		int integer12 = akf10.a(float11);
		float float13 = (float)(integer12 >> 16 & 0xFF) / 255.0F;
		float float14 = (float)(integer12 >> 8 & 0xFF) / 255.0F;
		float float15 = (float)(integer12 & 0xFF) / 255.0F;
		float13 *= float5;
		float14 *= float5;
		float15 *= float5;
		float float16 = this.j(float2);
		if (float16 > 0.0F) {
			float float17 = (float13 * 0.3F + float14 * 0.59F + float15 * 0.11F) * 0.6F;
			float float18 = 1.0F - float16 * 0.75F;
			float13 = float13 * float18 + float17 * (1.0F - float18);
			float14 = float14 * float18 + float17 * (1.0F - float18);
			float15 = float15 * float18 + float17 * (1.0F - float18);
		}

		float float17 = this.h(float2);
		if (float17 > 0.0F) {
			float float18 = (float13 * 0.3F + float14 * 0.59F + float15 * 0.11F) * 0.2F;
			float float19 = 1.0F - float17 * 0.75F;
			float13 = float13 * float19 + float18 * (1.0F - float19);
			float14 = float14 * float19 + float18 * (1.0F - float19);
			float15 = float15 * float19 + float18 * (1.0F - float19);
		}

		if (this.K > 0) {
			float float18 = (float)this.K - float2;
			if (float18 > 1.0F) {
				float18 = 1.0F;
			}

			float18 *= 0.45F;
			float13 = float13 * (1.0F - float18) + 0.8F * float18;
			float14 = float14 * (1.0F - float18) + 0.8F * float18;
			float15 = float15 * (1.0F - float18) + 1.0F * float18;
		}

		return new bdw((double)float13, (double)float14, (double)float15);
	}

	public float c(float float1) {
		return this.s.a(this.x.f(), float1);
	}

	public int D() {
		return this.s.a(this.x.f());
	}

	public float E() {
		return avf.a[this.s.a(this.x.f())];
	}

	public float d(float float1) {
		float float3 = this.c(float1);
		return float3 * (float) (Math.PI * 2);
	}

	public bdw e(float float1) {
		float float3 = this.c(float1);
		float float4 = ot.b(float3 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
		float4 = ot.a(float4, 0.0F, 1.0F);
		float float5 = 1.0F;
		float float6 = 1.0F;
		float float7 = 1.0F;
		float float8 = this.j(float1);
		if (float8 > 0.0F) {
			float float9 = (float5 * 0.3F + float6 * 0.59F + float7 * 0.11F) * 0.6F;
			float float10 = 1.0F - float8 * 0.95F;
			float5 = float5 * float10 + float9 * (1.0F - float10);
			float6 = float6 * float10 + float9 * (1.0F - float10);
			float7 = float7 * float10 + float9 * (1.0F - float10);
		}

		float5 *= float4 * 0.9F + 0.1F;
		float6 *= float4 * 0.9F + 0.1F;
		float7 *= float4 * 0.85F + 0.15F;
		float float9 = this.h(float1);
		if (float9 > 0.0F) {
			float float10 = (float5 * 0.3F + float6 * 0.59F + float7 * 0.11F) * 0.2F;
			float float11 = 1.0F - float9 * 0.95F;
			float5 = float5 * float11 + float10 * (1.0F - float11);
			float6 = float6 * float11 + float10 * (1.0F - float11);
			float7 = float7 * float11 + float10 * (1.0F - float11);
		}

		return new bdw((double)float5, (double)float6, (double)float7);
	}

	public bdw f(float float1) {
		float float3 = this.c(float1);
		return this.s.b(float3, float1);
	}

	public co p(co co) {
		return this.f(co).f(co);
	}

	public co q(co co) {
		auo auo3 = this.f(co);
		co co4 = new co(co.p(), auo3.g() + 16, co.r());

		while (co4.q() >= 0) {
			co co5 = co4.b();
			azs azs6 = auo3.a(co5).a();
			if (azs6.c() && azs6 != azs.j) {
				break;
			}

			co4 = co5;
		}

		return co4;
	}

	public float g(float float1) {
		float float3 = this.c(float1);
		float float4 = 1.0F - (ot.b(float3 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
		float4 = ot.a(float4, 0.0F, 1.0F);
		return float4 * float4 * 0.5F;
	}

	public boolean b(co co, alu alu) {
		return true;
	}

	public void a(co co, alu alu, int integer) {
	}

	public void a(co co, alu alu, int integer3, int integer4) {
	}

	public void b(co co, alu alu, int integer3, int integer4) {
	}

	public void k() {
		this.C.a("entities");
		this.C.a("global");

		for (int integer2 = 0; integer2 < this.j.size(); integer2++) {
			sn sn3 = (sn)this.j.get(integer2);

			try {
				sn3.T++;
				sn3.A_();
			} catch (Throwable var9) {
				b b5 = b.a(var9, "Ticking entity");
				c c6 = b5.a("Entity being ticked");
				if (sn3 == null) {
					c6.a("Entity", "~~NULL~~");
				} else {
					sn3.a(c6);
				}

				throw new f(b5);
			}

			if (sn3.F) {
				this.j.remove(integer2--);
			}
		}

		this.C.c("remove");
		this.e.removeAll(this.f);

		for (int integer2 = 0; integer2 < this.f.size(); integer2++) {
			sn sn3 = (sn)this.f.get(integer2);
			int integer4 = sn3.ab;
			int integer5 = sn3.ad;
			if (sn3.aa && this.a(integer4, integer5, true)) {
				this.a(integer4, integer5).b(sn3);
			}
		}

		for (int integer2x = 0; integer2x < this.f.size(); integer2x++) {
			this.c((sn)this.f.get(integer2x));
		}

		this.f.clear();
		this.l();
		this.C.c("regular");

		for (int integer2x = 0; integer2x < this.e.size(); integer2x++) {
			sn sn3 = (sn)this.e.get(integer2x);
			sn sn4 = sn3.bB();
			if (sn4 != null) {
				if (!sn4.F && sn4.w(sn3)) {
					continue;
				}

				sn3.p();
			}

			this.C.a("tick");
			if (!sn3.F && !(sn3 instanceof ly)) {
				try {
					this.h(sn3);
				} catch (Throwable var8) {
					b b6 = b.a(var8, "Ticking entity");
					c c7 = b6.a("Entity being ticked");
					sn3.a(c7);
					throw new f(b6);
				}
			}

			this.C.b();
			this.C.a("remove");
			if (sn3.F) {
				int integer5 = sn3.ab;
				int integer6 = sn3.ad;
				if (sn3.aa && this.a(integer5, integer6, true)) {
					this.a(integer5, integer6).b(sn3);
				}

				this.e.remove(integer2x--);
				this.c(sn3);
			}

			this.C.b();
		}

		this.C.c("blockEntities");
		this.M = true;
		Iterator<asc> iterator2 = this.h.iterator();

		while (iterator2.hasNext()) {
			asc asc3 = (asc)iterator2.next();
			if (!asc3.y() && asc3.u()) {
				co co4 = asc3.w();
				if (this.e(co4) && this.N.a(co4)) {
					try {
						this.C.a(asc3.getClass().getSimpleName());
						((lf)asc3).F_();
						this.C.b();
					} catch (Throwable var7) {
						b b6 = b.a(var7, "Ticking block entity");
						c c7 = b6.a("Block entity being ticked");
						asc3.a(c7);
						throw new f(b6);
					}
				}
			}

			if (asc3.y()) {
				iterator2.remove();
				this.g.remove(asc3);
				if (this.e(asc3.w())) {
					this.f(asc3.w()).d(asc3.w());
				}
			}
		}

		this.M = false;
		if (!this.c.isEmpty()) {
			this.h.removeAll(this.c);
			this.g.removeAll(this.c);
			this.c.clear();
		}

		this.C.c("pendingBlockEntities");
		if (!this.b.isEmpty()) {
			for (int integer3 = 0; integer3 < this.b.size(); integer3++) {
				asc asc4 = (asc)this.b.get(integer3);
				if (!asc4.y()) {
					if (!this.g.contains(asc4)) {
						this.a(asc4);
					}

					if (this.e(asc4.w())) {
						auo auo5 = this.f(asc4.w());
						atl atl6 = auo5.a(asc4.w());
						auo5.a(asc4.w(), asc4);
						this.a(asc4.w(), atl6, atl6, 3);
					}
				}
			}

			this.b.clear();
		}

		this.C.b();
		this.C.b();
	}

	protected void l() {
	}

	public boolean a(asc asc) {
		boolean boolean3 = this.g.add(asc);
		if (boolean3 && asc instanceof lf) {
			this.h.add(asc);
		}

		if (this.E) {
			co co4 = asc.w();
			atl atl5 = this.o(co4);
			this.a(co4, atl5, atl5, 2);
		}

		return boolean3;
	}

	public void b(Collection<asc> collection) {
		if (this.M) {
			this.b.addAll(collection);
		} else {
			for (asc asc4 : collection) {
				this.a(asc4);
			}
		}
	}

	public void h(sn sn) {
		this.a(sn, true);
	}

	public void a(sn sn, boolean boolean2) {
		int integer4 = ot.c(sn.p);
		int integer5 = ot.c(sn.r);
		int integer6 = 32;
		if (!boolean2 || this.a(integer4 - 32, 0, integer5 - 32, integer4 + 32, 0, integer5 + 32, true)) {
			sn.M = sn.p;
			sn.N = sn.q;
			sn.O = sn.r;
			sn.x = sn.v;
			sn.y = sn.w;
			if (boolean2 && sn.aa) {
				sn.T++;
				if (sn.aK()) {
					sn.aw();
				} else {
					sn.A_();
				}
			}

			this.C.a("chunkCheck");
			if (Double.isNaN(sn.p) || Double.isInfinite(sn.p)) {
				sn.p = sn.M;
			}

			if (Double.isNaN(sn.q) || Double.isInfinite(sn.q)) {
				sn.q = sn.N;
			}

			if (Double.isNaN(sn.r) || Double.isInfinite(sn.r)) {
				sn.r = sn.O;
			}

			if (Double.isNaN((double)sn.w) || Double.isInfinite((double)sn.w)) {
				sn.w = sn.y;
			}

			if (Double.isNaN((double)sn.v) || Double.isInfinite((double)sn.v)) {
				sn.v = sn.x;
			}

			int integer7 = ot.c(sn.p / 16.0);
			int integer8 = ot.c(sn.q / 16.0);
			int integer9 = ot.c(sn.r / 16.0);
			if (!sn.aa || sn.ab != integer7 || sn.ac != integer8 || sn.ad != integer9) {
				if (sn.aa && this.a(sn.ab, sn.ad, true)) {
					this.a(sn.ab, sn.ad).a(sn, sn.ac);
				}

				if (!sn.bv() && !this.a(integer7, integer9, true)) {
					sn.aa = false;
				} else {
					this.a(integer7, integer9).a(sn);
				}
			}

			this.C.b();
			if (boolean2 && sn.aa) {
				for (sn sn11 : sn.bx()) {
					if (!sn11.F && sn11.bB() == sn) {
						this.h(sn11);
					} else {
						sn11.p();
					}
				}
			}
		}
	}

	public boolean b(bdt bdt) {
		return this.a(bdt, null);
	}

	public boolean a(bdt bdt, @Nullable sn sn) {
		List<sn> list4 = this.b(null, bdt);

		for (int integer5 = 0; integer5 < list4.size(); integer5++) {
			sn sn6 = (sn)list4.get(integer5);
			if (!sn6.F && sn6.i && sn6 != sn && (sn == null || sn6.x(sn))) {
				return false;
			}
		}

		return true;
	}

	public boolean c(bdt bdt) {
		int integer3 = ot.c(bdt.a);
		int integer4 = ot.f(bdt.d);
		int integer5 = ot.c(bdt.b);
		int integer6 = ot.f(bdt.e);
		int integer7 = ot.c(bdt.c);
		int integer8 = ot.f(bdt.f);
		co.b b9 = co.b.s();

		for (int integer10 = integer3; integer10 < integer4; integer10++) {
			for (int integer11 = integer5; integer11 < integer6; integer11++) {
				for (int integer12 = integer7; integer12 < integer8; integer12++) {
					atl atl13 = this.o(b9.f(integer10, integer11, integer12));
					if (atl13.a() != azs.a) {
						b9.t();
						return true;
					}
				}
			}
		}

		b9.t();
		return false;
	}

	public boolean d(bdt bdt) {
		int integer3 = ot.c(bdt.a);
		int integer4 = ot.f(bdt.d);
		int integer5 = ot.c(bdt.b);
		int integer6 = ot.f(bdt.e);
		int integer7 = ot.c(bdt.c);
		int integer8 = ot.f(bdt.f);
		co.b b9 = co.b.s();

		for (int integer10 = integer3; integer10 < integer4; integer10++) {
			for (int integer11 = integer5; integer11 < integer6; integer11++) {
				for (int integer12 = integer7; integer12 < integer8; integer12++) {
					atl atl13 = this.o(b9.f(integer10, integer11, integer12));
					if (atl13.a().d()) {
						b9.t();
						return true;
					}
				}
			}
		}

		b9.t();
		return false;
	}

	public boolean e(bdt bdt) {
		int integer3 = ot.c(bdt.a);
		int integer4 = ot.f(bdt.d);
		int integer5 = ot.c(bdt.b);
		int integer6 = ot.f(bdt.e);
		int integer7 = ot.c(bdt.c);
		int integer8 = ot.f(bdt.f);
		if (this.a(integer3, integer5, integer7, integer4, integer6, integer8, true)) {
			co.b b9 = co.b.s();

			for (int integer10 = integer3; integer10 < integer4; integer10++) {
				for (int integer11 = integer5; integer11 < integer6; integer11++) {
					for (int integer12 = integer7; integer12 < integer8; integer12++) {
						alu alu13 = this.o(b9.f(integer10, integer11, integer12)).v();
						if (alu13 == alv.ab || alu13 == alv.k || alu13 == alv.l) {
							b9.t();
							return true;
						}
					}
				}
			}

			b9.t();
		}

		return false;
	}

	public boolean a(bdt bdt, azs azs, sn sn) {
		int integer5 = ot.c(bdt.a);
		int integer6 = ot.f(bdt.d);
		int integer7 = ot.c(bdt.b);
		int integer8 = ot.f(bdt.e);
		int integer9 = ot.c(bdt.c);
		int integer10 = ot.f(bdt.f);
		if (!this.a(integer5, integer7, integer9, integer6, integer8, integer10, true)) {
			return false;
		} else {
			boolean boolean11 = false;
			bdw bdw12 = bdw.a;
			co.b b13 = co.b.s();

			for (int integer14 = integer5; integer14 < integer6; integer14++) {
				for (int integer15 = integer7; integer15 < integer8; integer15++) {
					for (int integer16 = integer9; integer16 < integer10; integer16++) {
						b13.f(integer14, integer15, integer16);
						atl atl17 = this.o(b13);
						alu alu18 = atl17.v();
						if (atl17.a() == azs) {
							double double19 = (double)((float)(integer15 + 1) - aoq.e((Integer)atl17.c(aoq.b)));
							if ((double)integer8 >= double19) {
								boolean11 = true;
								bdw12 = alu18.a(this, b13, sn, bdw12);
							}
						}
					}
				}
			}

			b13.t();
			if (bdw12.b() > 0.0 && sn.bg()) {
				bdw12 = bdw12.a();
				double double14 = 0.014;
				sn.s = sn.s + bdw12.b * 0.014;
				sn.t = sn.t + bdw12.c * 0.014;
				sn.u = sn.u + bdw12.d * 0.014;
			}

			return boolean11;
		}
	}

	public boolean a(bdt bdt, azs azs) {
		int integer4 = ot.c(bdt.a);
		int integer5 = ot.f(bdt.d);
		int integer6 = ot.c(bdt.b);
		int integer7 = ot.f(bdt.e);
		int integer8 = ot.c(bdt.c);
		int integer9 = ot.f(bdt.f);
		co.b b10 = co.b.s();

		for (int integer11 = integer4; integer11 < integer5; integer11++) {
			for (int integer12 = integer6; integer12 < integer7; integer12++) {
				for (int integer13 = integer8; integer13 < integer9; integer13++) {
					if (this.o(b10.f(integer11, integer12, integer13)).a() == azs) {
						b10.t();
						return true;
					}
				}
			}
		}

		b10.t();
		return false;
	}

	public ajn a(@Nullable sn sn, double double2, double double3, double double4, float float5, boolean boolean6) {
		return this.a(sn, double2, double3, double4, float5, false, boolean6);
	}

	public ajn a(@Nullable sn sn, double double2, double double3, double double4, float float5, boolean boolean6, boolean boolean7) {
		ajn ajn12 = new ajn(this, sn, double2, double3, double4, float5, boolean6, boolean7);
		ajn12.a();
		ajn12.a(true);
		return ajn12;
	}

	public float a(bdw bdw, bdt bdt) {
		double double4 = 1.0 / ((bdt.d - bdt.a) * 2.0 + 1.0);
		double double6 = 1.0 / ((bdt.e - bdt.b) * 2.0 + 1.0);
		double double8 = 1.0 / ((bdt.f - bdt.c) * 2.0 + 1.0);
		double double10 = (1.0 - Math.floor(1.0 / double4) * double4) / 2.0;
		double double12 = (1.0 - Math.floor(1.0 / double8) * double8) / 2.0;
		if (!(double4 < 0.0) && !(double6 < 0.0) && !(double8 < 0.0)) {
			int integer14 = 0;
			int integer15 = 0;

			for (float float16 = 0.0F; float16 <= 1.0F; float16 = (float)((double)float16 + double4)) {
				for (float float17 = 0.0F; float17 <= 1.0F; float17 = (float)((double)float17 + double6)) {
					for (float float18 = 0.0F; float18 <= 1.0F; float18 = (float)((double)float18 + double8)) {
						double double19 = bdt.a + (bdt.d - bdt.a) * (double)float16;
						double double21 = bdt.b + (bdt.e - bdt.b) * (double)float17;
						double double23 = bdt.c + (bdt.f - bdt.c) * (double)float18;
						if (this.a(new bdw(double19 + double10, double21, double23 + double12), bdw) == null) {
							integer14++;
						}

						integer15++;
					}
				}
			}

			return (float)integer14 / (float)integer15;
		} else {
			return 0.0F;
		}
	}

	public boolean a(@Nullable aay aay, co co, cv cv) {
		co = co.a(cv);
		if (this.o(co).v() == alv.ab) {
			this.a(aay, 1009, co, 0);
			this.g(co);
			return true;
		} else {
			return false;
		}
	}

	public String F() {
		return "All: " + this.e.size();
	}

	public String G() {
		return this.v.f();
	}

	@Nullable
	@Override
	public asc r(co co) {
		if (this.E(co)) {
			return null;
		} else {
			asc asc3 = null;
			if (this.M) {
				asc3 = this.F(co);
			}

			if (asc3 == null) {
				asc3 = this.f(co).a(co, auo.a.IMMEDIATE);
			}

			if (asc3 == null) {
				asc3 = this.F(co);
			}

			return asc3;
		}
	}

	@Nullable
	private asc F(co co) {
		for (int integer3 = 0; integer3 < this.b.size(); integer3++) {
			asc asc4 = (asc)this.b.get(integer3);
			if (!asc4.y() && asc4.w().equals(co)) {
				return asc4;
			}
		}

		return null;
	}

	public void a(co co, @Nullable asc asc) {
		if (!this.E(co)) {
			if (asc != null && !asc.y()) {
				if (this.M) {
					asc.a(co);
					Iterator<asc> iterator4 = this.b.iterator();

					while (iterator4.hasNext()) {
						asc asc5 = (asc)iterator4.next();
						if (asc5.w().equals(co)) {
							asc5.z();
							iterator4.remove();
						}
					}

					this.b.add(asc);
				} else {
					this.f(co).a(co, asc);
					this.a(asc);
				}
			}
		}
	}

	public void s(co co) {
		asc asc3 = this.r(co);
		if (asc3 != null && this.M) {
			asc3.z();
			this.b.remove(asc3);
		} else {
			if (asc3 != null) {
				this.b.remove(asc3);
				this.g.remove(asc3);
				this.h.remove(asc3);
			}

			this.f(co).d(co);
		}
	}

	public void b(asc asc) {
		this.c.add(asc);
	}

	public boolean t(co co) {
		bdt bdt3 = this.o(co).c((ajw)this, co);
		return bdt3 != alu.k && bdt3.a() >= 1.0;
	}

	public boolean d(co co, boolean boolean2) {
		if (this.E(co)) {
			return false;
		} else {
			auo auo4 = this.v.a(co.p() >> 4, co.r() >> 4);
			if (auo4 != null && !auo4.f()) {
				atl atl5 = this.o(co);
				return atl5.a().k() && atl5.h();
			} else {
				return boolean2;
			}
		}
	}

	public void H() {
		int integer2 = this.a(1.0F);
		if (integer2 != this.J) {
			this.J = integer2;
		}
	}

	public void a(boolean boolean1, boolean boolean2) {
		this.F = boolean1;
		this.G = boolean2;
	}

	public void d() {
		this.t();
	}

	protected void I() {
		if (this.x.o()) {
			this.o = 1.0F;
			if (this.x.m()) {
				this.q = 1.0F;
			}
		}
	}

	protected void t() {
		if (this.s.m()) {
			if (!this.E) {
				boolean boolean2 = this.U().b("doWeatherCycle");
				if (boolean2) {
					int integer3 = this.x.z();
					if (integer3 > 0) {
						this.x.i(--integer3);
						this.x.f(this.x.m() ? 1 : 2);
						this.x.g(this.x.o() ? 1 : 2);
					}

					int integer4 = this.x.n();
					if (integer4 <= 0) {
						if (this.x.m()) {
							this.x.f(this.r.nextInt(12000) + 3600);
						} else {
							this.x.f(this.r.nextInt(168000) + 12000);
						}
					} else {
						this.x.f(--integer4);
						if (integer4 <= 0) {
							this.x.a(!this.x.m());
						}
					}

					int integer5 = this.x.p();
					if (integer5 <= 0) {
						if (this.x.o()) {
							this.x.g(this.r.nextInt(12000) + 12000);
						} else {
							this.x.g(this.r.nextInt(168000) + 12000);
						}
					} else {
						this.x.g(--integer5);
						if (integer5 <= 0) {
							this.x.b(!this.x.o());
						}
					}
				}

				this.p = this.q;
				if (this.x.m()) {
					this.q = (float)((double)this.q + 0.01);
				} else {
					this.q = (float)((double)this.q - 0.01);
				}

				this.q = ot.a(this.q, 0.0F, 1.0F);
				this.n = this.o;
				if (this.x.o()) {
					this.o = (float)((double)this.o + 0.01);
				} else {
					this.o = (float)((double)this.o - 0.01);
				}

				this.o = ot.a(this.o, 0.0F, 1.0F);
			}
		}
	}

	protected void a(int integer1, int integer2, auo auo) {
		auo.n();
	}

	protected void j() {
	}

	public void a(co co, atl atl, Random random) {
		this.d = true;
		atl.v().b(this, co, atl, random);
		this.d = false;
	}

	public boolean u(co co) {
		return this.e(co, false);
	}

	public boolean v(co co) {
		return this.e(co, true);
	}

	public boolean e(co co, boolean boolean2) {
		akf akf4 = this.b(co);
		float float5 = akf4.a(co);
		if (float5 >= 0.15F) {
			return false;
		} else {
			if (co.q() >= 0 && co.q() < 256 && this.b(ajy.BLOCK, co) < 10) {
				atl atl6 = this.o(co);
				alu alu7 = atl6.v();
				if ((alu7 == alv.j || alu7 == alv.i) && (Integer)atl6.c(aoq.b) == 0) {
					if (!boolean2) {
						return true;
					}

					boolean boolean8 = this.G(co.e()) && this.G(co.f()) && this.G(co.c()) && this.G(co.d());
					if (!boolean8) {
						return true;
					}
				}
			}

			return false;
		}
	}

	private boolean G(co co) {
		return this.o(co).a() == azs.h;
	}

	public boolean f(co co, boolean boolean2) {
		akf akf4 = this.b(co);
		float float5 = akf4.a(co);
		if (float5 >= 0.15F) {
			return false;
		} else if (!boolean2) {
			return true;
		} else {
			if (co.q() >= 0 && co.q() < 256 && this.b(ajy.BLOCK, co) < 10) {
				atl atl6 = this.o(co);
				if (atl6.a() == azs.a && alv.aH.a(this, co)) {
					return true;
				}
			}

			return false;
		}
	}

	public boolean w(co co) {
		boolean boolean3 = false;
		if (this.s.m()) {
			boolean3 |= this.c(ajy.SKY, co);
		}

		return boolean3 | this.c(ajy.BLOCK, co);
	}

	private int a(co co, ajy ajy) {
		if (ajy == ajy.SKY && this.h(co)) {
			return 15;
		} else {
			atl atl4 = this.o(co);
			int integer5 = ajy == ajy.SKY ? 0 : atl4.d();
			int integer6 = atl4.c();
			if (integer6 >= 15 && atl4.d() > 0) {
				integer6 = 1;
			}

			if (integer6 < 1) {
				integer6 = 1;
			}

			if (integer6 >= 15) {
				return 0;
			} else if (integer5 >= 14) {
				return integer5;
			} else {
				co.b b7 = co.b.s();

				for (cv cv11 : cv.values()) {
					b7.j(co).d(cv11);
					int integer12 = this.b(ajy, b7) - integer6;
					if (integer12 > integer5) {
						integer5 = integer12;
					}

					if (integer5 >= 14) {
						return integer5;
					}
				}

				b7.t();
				return integer5;
			}
		}
	}

	public boolean c(ajy ajy, co co) {
		if (!this.a(co, 17, false)) {
			return false;
		} else {
			int integer4 = 0;
			int integer5 = 0;
			this.C.a("getBrightness");
			int integer6 = this.b(ajy, co);
			int integer7 = this.a(co, ajy);
			int integer8 = co.p();
			int integer9 = co.q();
			int integer10 = co.r();
			if (integer7 > integer6) {
				this.H[integer5++] = 133152;
			} else if (integer7 < integer6) {
				this.H[integer5++] = 133152 | integer6 << 18;

				while (integer4 < integer5) {
					int integer11 = this.H[integer4++];
					int integer12 = (integer11 & 63) - 32 + integer8;
					int integer13 = (integer11 >> 6 & 63) - 32 + integer9;
					int integer14 = (integer11 >> 12 & 63) - 32 + integer10;
					int integer15 = integer11 >> 18 & 15;
					co co16 = new co(integer12, integer13, integer14);
					int integer17 = this.b(ajy, co16);
					if (integer17 == integer15) {
						this.a(ajy, co16, 0);
						if (integer15 > 0) {
							int integer18 = ot.a(integer12 - integer8);
							int integer19 = ot.a(integer13 - integer9);
							int integer20 = ot.a(integer14 - integer10);
							if (integer18 + integer19 + integer20 < 17) {
								co.b b21 = co.b.s();

								for (cv cv25 : cv.values()) {
									int integer26 = integer12 + cv25.g();
									int integer27 = integer13 + cv25.h();
									int integer28 = integer14 + cv25.i();
									b21.f(integer26, integer27, integer28);
									int integer29 = Math.max(1, this.o(b21).c());
									integer17 = this.b(ajy, b21);
									if (integer17 == integer15 - integer29 && integer5 < this.H.length) {
										this.H[integer5++] = integer26 - integer8 + 32 | integer27 - integer9 + 32 << 6 | integer28 - integer10 + 32 << 12 | integer15 - integer29 << 18;
									}
								}

								b21.t();
							}
						}
					}
				}

				integer4 = 0;
			}

			this.C.b();
			this.C.a("checkedPosition < toCheckCount");

			while (integer4 < integer5) {
				int integer11 = this.H[integer4++];
				int integer12 = (integer11 & 63) - 32 + integer8;
				int integer13 = (integer11 >> 6 & 63) - 32 + integer9;
				int integer14 = (integer11 >> 12 & 63) - 32 + integer10;
				co co15 = new co(integer12, integer13, integer14);
				int integer16 = this.b(ajy, co15);
				int integer17 = this.a(co15, ajy);
				if (integer17 != integer16) {
					this.a(ajy, co15, integer17);
					if (integer17 > integer16) {
						int integer18 = Math.abs(integer12 - integer8);
						int integer19 = Math.abs(integer13 - integer9);
						int integer20 = Math.abs(integer14 - integer10);
						boolean boolean21 = integer5 < this.H.length - 6;
						if (integer18 + integer19 + integer20 < 17 && boolean21) {
							if (this.b(ajy, co15.e()) < integer17) {
								this.H[integer5++] = integer12 - 1 - integer8 + 32 + (integer13 - integer9 + 32 << 6) + (integer14 - integer10 + 32 << 12);
							}

							if (this.b(ajy, co15.f()) < integer17) {
								this.H[integer5++] = integer12 + 1 - integer8 + 32 + (integer13 - integer9 + 32 << 6) + (integer14 - integer10 + 32 << 12);
							}

							if (this.b(ajy, co15.b()) < integer17) {
								this.H[integer5++] = integer12 - integer8 + 32 + (integer13 - 1 - integer9 + 32 << 6) + (integer14 - integer10 + 32 << 12);
							}

							if (this.b(ajy, co15.a()) < integer17) {
								this.H[integer5++] = integer12 - integer8 + 32 + (integer13 + 1 - integer9 + 32 << 6) + (integer14 - integer10 + 32 << 12);
							}

							if (this.b(ajy, co15.c()) < integer17) {
								this.H[integer5++] = integer12 - integer8 + 32 + (integer13 - integer9 + 32 << 6) + (integer14 - 1 - integer10 + 32 << 12);
							}

							if (this.b(ajy, co15.d()) < integer17) {
								this.H[integer5++] = integer12 - integer8 + 32 + (integer13 - integer9 + 32 << 6) + (integer14 + 1 - integer10 + 32 << 12);
							}
						}
					}
				}
			}

			this.C.b();
			return true;
		}
	}

	public boolean a(boolean boolean1) {
		return false;
	}

	@Nullable
	public List<akd> a(auo auo, boolean boolean2) {
		return null;
	}

	@Nullable
	public List<akd> a(axz axz, boolean boolean2) {
		return null;
	}

	public List<sn> b(@Nullable sn sn, bdt bdt) {
		return this.a(sn, bdt, sr.e);
	}

	public List<sn> a(@Nullable sn sn, bdt bdt, @Nullable Predicate<? super sn> predicate) {
		List<sn> list5 = Lists.newArrayList();
		int integer6 = ot.c((bdt.a - 2.0) / 16.0);
		int integer7 = ot.c((bdt.d + 2.0) / 16.0);
		int integer8 = ot.c((bdt.c - 2.0) / 16.0);
		int integer9 = ot.c((bdt.f + 2.0) / 16.0);

		for (int integer10 = integer6; integer10 <= integer7; integer10++) {
			for (int integer11 = integer8; integer11 <= integer9; integer11++) {
				if (this.a(integer10, integer11, true)) {
					this.a(integer10, integer11).a(sn, bdt, list5, predicate);
				}
			}
		}

		return list5;
	}

	public <T extends sn> List<T> a(Class<? extends T> class1, Predicate<? super T> predicate) {
		List<T> list4 = Lists.newArrayList();

		for (sn sn6 : this.e) {
			if (class1.isAssignableFrom(sn6.getClass()) && predicate.apply(sn6)) {
				list4.add(sn6);
			}
		}

		return list4;
	}

	public <T extends sn> List<T> b(Class<? extends T> class1, Predicate<? super T> predicate) {
		List<T> list4 = Lists.newArrayList();

		for (sn sn6 : this.i) {
			if (class1.isAssignableFrom(sn6.getClass()) && predicate.apply(sn6)) {
				list4.add(sn6);
			}
		}

		return list4;
	}

	public <T extends sn> List<T> a(Class<? extends T> class1, bdt bdt) {
		return this.a(class1, bdt, sr.e);
	}

	public <T extends sn> List<T> a(Class<? extends T> class1, bdt bdt, @Nullable Predicate<? super T> predicate) {
		int integer5 = ot.c((bdt.a - 2.0) / 16.0);
		int integer6 = ot.f((bdt.d + 2.0) / 16.0);
		int integer7 = ot.c((bdt.c - 2.0) / 16.0);
		int integer8 = ot.f((bdt.f + 2.0) / 16.0);
		List<T> list9 = Lists.newArrayList();

		for (int integer10 = integer5; integer10 < integer6; integer10++) {
			for (int integer11 = integer7; integer11 < integer8; integer11++) {
				if (this.a(integer10, integer11, true)) {
					this.a(integer10, integer11).a(class1, bdt, list9, predicate);
				}
			}
		}

		return list9;
	}

	@Nullable
	public <T extends sn> T a(Class<? extends T> class1, bdt bdt, T sn) {
		List<T> list5 = this.a(class1, bdt);
		T sn6 = null;
		double double7 = Double.MAX_VALUE;

		for (int integer9 = 0; integer9 < list5.size(); integer9++) {
			T sn10 = (T)list5.get(integer9);
			if (sn10 != sn && sr.e.apply(sn10)) {
				double double11 = sn.h(sn10);
				if (!(double11 > double7)) {
					sn6 = sn10;
					double7 = double11;
				}
			}
		}

		return sn6;
	}

	@Nullable
	public sn a(int integer) {
		return this.k.a(integer);
	}

	public List<sn> J() {
		return this.e;
	}

	public void b(co co, asc asc) {
		if (this.e(co)) {
			this.f(co).e();
		}
	}

	public int a(Class<?> class1) {
		int integer3 = 0;

		for (sn sn5 : this.e) {
			if ((!(sn5 instanceof sx) || !((sx)sn5).cU()) && class1.isAssignableFrom(sn5.getClass())) {
				integer3++;
			}
		}

		return integer3;
	}

	public void a(Collection<sn> collection) {
		this.e.addAll(collection);

		for (sn sn4 : collection) {
			this.b(sn4);
		}
	}

	public void c(Collection<sn> collection) {
		this.f.addAll(collection);
	}

	public boolean a(alu alu, co co, boolean boolean3, cv cv, @Nullable sn sn) {
		atl atl7 = this.o(co);
		bdt bdt8 = boolean3 ? null : alu.t().c((ajw)this, co);
		if (bdt8 != alu.k && !this.a(bdt8.a(co), sn)) {
			return false;
		} else {
			return atl7.a() == azs.q && alu == alv.cf ? true : atl7.a().j() && alu.b(this, co, cv);
		}
	}

	public int K() {
		return this.a;
	}

	public void b(int integer) {
		this.a = integer;
	}

	@Override
	public int a(co co, cv cv) {
		return this.o(co).b(this, co, cv);
	}

	@Override
	public ajx L() {
		return this.x.t();
	}

	public int x(co co) {
		int integer3 = 0;
		integer3 = Math.max(integer3, this.a(co.b(), cv.DOWN));
		if (integer3 >= 15) {
			return integer3;
		} else {
			integer3 = Math.max(integer3, this.a(co.a(), cv.UP));
			if (integer3 >= 15) {
				return integer3;
			} else {
				integer3 = Math.max(integer3, this.a(co.c(), cv.NORTH));
				if (integer3 >= 15) {
					return integer3;
				} else {
					integer3 = Math.max(integer3, this.a(co.d(), cv.SOUTH));
					if (integer3 >= 15) {
						return integer3;
					} else {
						integer3 = Math.max(integer3, this.a(co.e(), cv.WEST));
						if (integer3 >= 15) {
							return integer3;
						} else {
							integer3 = Math.max(integer3, this.a(co.f(), cv.EAST));
							return integer3 >= 15 ? integer3 : integer3;
						}
					}
				}
			}
		}
	}

	public boolean b(co co, cv cv) {
		return this.c(co, cv) > 0;
	}

	public int c(co co, cv cv) {
		atl atl4 = this.o(co);
		return atl4.m() ? this.x(co) : atl4.a(this, co, cv);
	}

	public boolean y(co co) {
		if (this.c(co.b(), cv.DOWN) > 0) {
			return true;
		} else if (this.c(co.a(), cv.UP) > 0) {
			return true;
		} else if (this.c(co.c(), cv.NORTH) > 0) {
			return true;
		} else if (this.c(co.d(), cv.SOUTH) > 0) {
			return true;
		} else {
			return this.c(co.e(), cv.WEST) > 0 ? true : this.c(co.f(), cv.EAST) > 0;
		}
	}

	public int z(co co) {
		int integer3 = 0;

		for (cv cv7 : cv.values()) {
			int integer8 = this.c(co.a(cv7), cv7);
			if (integer8 >= 15) {
				return 15;
			}

			if (integer8 > integer3) {
				integer3 = integer8;
			}
		}

		return integer3;
	}

	@Nullable
	public aay a(sn sn, double double2) {
		return this.a(sn.p, sn.q, sn.r, double2, false);
	}

	@Nullable
	public aay b(sn sn, double double2) {
		return this.a(sn.p, sn.q, sn.r, double2, true);
	}

	@Nullable
	public aay a(double double1, double double2, double double3, double double4, boolean boolean5) {
		Predicate<sn> predicate11 = boolean5 ? sr.d : sr.e;
		return this.a(double1, double2, double3, double4, predicate11);
	}

	@Nullable
	public aay a(double double1, double double2, double double3, double double4, Predicate<sn> predicate) {
		double double11 = -1.0;
		aay aay13 = null;

		for (int integer14 = 0; integer14 < this.i.size(); integer14++) {
			aay aay15 = (aay)this.i.get(integer14);
			if (predicate.apply(aay15)) {
				double double16 = aay15.d(double1, double2, double3);
				if ((double4 < 0.0 || double16 < double4 * double4) && (double11 == -1.0 || double16 < double11)) {
					double11 = double16;
					aay13 = aay15;
				}
			}
		}

		return aay13;
	}

	public boolean a(double double1, double double2, double double3, double double4) {
		for (int integer10 = 0; integer10 < this.i.size(); integer10++) {
			aay aay11 = (aay)this.i.get(integer10);
			if (sr.e.apply(aay11)) {
				double double12 = aay11.d(double1, double2, double3);
				if (double4 < 0.0 || double12 < double4 * double4) {
					return true;
				}
			}
		}

		return false;
	}

	@Nullable
	public aay a(sn sn, double double2, double double3) {
		return this.a(sn.p, sn.q, sn.r, double2, double3, null, null);
	}

	@Nullable
	public aay a(co co, double double2, double double3) {
		return this.a((double)((float)co.p() + 0.5F), (double)((float)co.q() + 0.5F), (double)((float)co.r() + 0.5F), double2, double3, null, null);
	}

	@Nullable
	public aay a(
		double double1, double double2, double double3, double double4, double double5, @Nullable Function<aay, Double> function, @Nullable Predicate<aay> predicate
	) {
		double double14 = -1.0;
		aay aay16 = null;

		for (int integer17 = 0; integer17 < this.i.size(); integer17++) {
			aay aay18 = (aay)this.i.get(integer17);
			if (!aay18.bK.a && aay18.au() && !aay18.y() && (predicate == null || predicate.apply(aay18))) {
				double double19 = aay18.d(double1, aay18.q, double3);
				double double21 = double4;
				if (aay18.aM()) {
					double21 = double4 * 0.8F;
				}

				if (aay18.aP()) {
					float float23 = aay18.cO();
					if (float23 < 0.1F) {
						float23 = 0.1F;
					}

					double21 *= (double)(0.7F * float23);
				}

				if (function != null) {
					double21 *= Objects.firstNonNull(function.apply(aay18), 1.0);
				}

				if ((double5 < 0.0 || Math.abs(aay18.q - double2) < double5 * double5)
					&& (double4 < 0.0 || double19 < double21 * double21)
					&& (double14 == -1.0 || double19 < double14)) {
					double14 = double19;
					aay16 = aay18;
				}
			}
		}

		return aay16;
	}

	@Nullable
	public aay a(String string) {
		for (int integer3 = 0; integer3 < this.i.size(); integer3++) {
			aay aay4 = (aay)this.i.get(integer3);
			if (string.equals(aay4.h_())) {
				return aay4;
			}
		}

		return null;
	}

	@Nullable
	public aay b(UUID uUID) {
		for (int integer3 = 0; integer3 < this.i.size(); integer3++) {
			aay aay4 = (aay)this.i.get(integer3);
			if (uUID.equals(aay4.be())) {
				return aay4;
			}
		}

		return null;
	}

	public void M() {
	}

	public void N() throws ajt {
		this.w.c();
	}

	public void a(long long1) {
		this.x.b(long1);
	}

	public long O() {
		return this.x.a();
	}

	public long P() {
		return this.x.e();
	}

	public long Q() {
		return this.x.f();
	}

	public void b(long long1) {
		this.x.c(long1);
	}

	public co R() {
		co co2 = new co(this.x.b(), this.x.c(), this.x.d());
		if (!this.aj().a(co2)) {
			co2 = this.l(new co(this.aj().f(), 0.0, this.aj().g()));
		}

		return co2;
	}

	public void A(co co) {
		this.x.a(co);
	}

	public void i(sn sn) {
		int integer3 = ot.c(sn.p / 16.0);
		int integer4 = ot.c(sn.r / 16.0);
		int integer5 = 2;

		for (int integer6 = -2; integer6 <= 2; integer6++) {
			for (int integer7 = -2; integer7 <= 2; integer7++) {
				this.a(integer3 + integer6, integer4 + integer7);
			}
		}

		if (!this.e.contains(sn)) {
			this.e.add(sn);
		}
	}

	public boolean a(aay aay, co co) {
		return true;
	}

	public void a(sn sn, byte byte2) {
	}

	public auj z() {
		return this.v;
	}

	public void c(co co, alu alu, int integer3, int integer4) {
		this.o(co).a(this, co, integer3, integer4);
	}

	public bbw S() {
		return this.w;
	}

	public bbv T() {
		return this.x;
	}

	public ajp U() {
		return this.x.w();
	}

	public void e() {
	}

	public float h(float float1) {
		return (this.p + (this.q - this.p) * float1) * this.j(float1);
	}

	public void i(float float1) {
		this.p = float1;
		this.q = float1;
	}

	public float j(float float1) {
		return this.n + (this.o - this.n) * float1;
	}

	public void k(float float1) {
		this.n = float1;
		this.o = float1;
	}

	public boolean V() {
		return (double)this.h(1.0F) > 0.9;
	}

	public boolean W() {
		return (double)this.j(1.0F) > 0.2;
	}

	public boolean B(co co) {
		if (!this.W()) {
			return false;
		} else if (!this.h(co)) {
			return false;
		} else if (this.p(co).q() > co.q()) {
			return false;
		} else {
			akf akf3 = this.b(co);
			if (akf3.c()) {
				return false;
			} else {
				return this.f(co, false) ? false : akf3.d();
			}
		}
	}

	public boolean C(co co) {
		akf akf3 = this.b(co);
		return akf3.e();
	}

	@Nullable
	public bce X() {
		return this.z;
	}

	public void a(String string, bbl bbl) {
		this.z.a(string, bbl);
	}

	@Nullable
	public bbl a(Class<? extends bbl> class1, String string) {
		return this.z.a(class1, string);
	}

	public int b(String string) {
		return this.z.a(string);
	}

	public void a(int integer1, co co, int integer3) {
		for (int integer5 = 0; integer5 < this.u.size(); integer5++) {
			((aju)this.u.get(integer5)).a(integer1, co, integer3);
		}
	}

	public void b(int integer1, co co, int integer3) {
		this.a(null, integer1, co, integer3);
	}

	public void a(@Nullable aay aay, int integer2, co co, int integer4) {
		try {
			for (int integer6 = 0; integer6 < this.u.size(); integer6++) {
				((aju)this.u.get(integer6)).a(aay, integer2, co, integer4);
			}
		} catch (Throwable var8) {
			b b7 = b.a(var8, "Playing level event");
			c c8 = b7.a("Level event being played");
			c8.a("Block coordinates", c.a(co));
			c8.a("Event source", aay);
			c8.a("Event type", integer2);
			c8.a("Event data", integer4);
			throw new f(b7);
		}
	}

	public int Y() {
		return 256;
	}

	public int Z() {
		return this.s.n() ? 128 : 256;
	}

	public Random a(int integer1, int integer2, int integer3) {
		long long5 = (long)integer1 * 341873128712L + (long)integer2 * 132897987541L + this.T().a() + (long)integer3;
		this.r.setSeed(long5);
		return this.r;
	}

	public double ab() {
		return this.x.t() == ajx.c ? 0.0 : 63.0;
	}

	public c a(b b) {
		c c3 = b.a("Affected level", 1);
		c3.a("Level name", this.x == null ? "????" : this.x.j());
		c3.a("All players", new d<String>() {
			public String call() {
				return ajs.this.i.size() + " total; " + ajs.this.i;
			}
		});
		c3.a("Chunk stats", new d<String>() {
			public String call() {
				return ajs.this.v.f();
			}
		});

		try {
			this.x.a(c3);
		} catch (Throwable var4) {
			c3.a("Level Data Unobtainable", var4);
		}

		return c3;
	}

	public void c(int integer1, co co, int integer3) {
		for (int integer5 = 0; integer5 < this.u.size(); integer5++) {
			aju aju6 = (aju)this.u.get(integer5);
			aju6.b(integer1, co, integer3);
		}
	}

	public Calendar ac() {
		if (this.P() % 600L == 0L) {
			this.L.setTimeInMillis(MinecraftServer.aw());
		}

		return this.L;
	}

	public void a(double double1, double double2, double double3, double double4, double double5, double double6, @Nullable du du) {
	}

	public bec ad() {
		return this.D;
	}

	public void d(co co, alu alu) {
		for (cv cv5 : cv.c.HORIZONTAL) {
			co co6 = co.a(cv5);
			if (this.e(co6)) {
				atl atl7 = this.o(co6);
				if (alv.cj.E(atl7)) {
					atl7.a(this, co6, alu, co);
				} else if (atl7.m()) {
					co6 = co6.a(cv5);
					atl7 = this.o(co6);
					if (alv.cj.E(atl7)) {
						atl7.a(this, co6, alu, co);
					}
				}
			}
		}
	}

	public rh D(co co) {
		long long3 = 0L;
		float float5 = 0.0F;
		if (this.e(co)) {
			float5 = this.E();
			long3 = this.f(co).x();
		}

		return new rh(this.ae(), this.Q(), long3, float5);
	}

	public rg ae() {
		return this.T().x();
	}

	public int af() {
		return this.J;
	}

	public void c(int integer) {
		this.J = integer;
	}

	public int ag() {
		return this.K;
	}

	public void d(int integer) {
		this.K = integer;
	}

	public wr ai() {
		return this.A;
	}

	public auf aj() {
		return this.N;
	}

	public boolean e(int integer1, int integer2) {
		co co4 = this.R();
		int integer5 = integer1 * 16 + 8 - co4.p();
		int integer6 = integer2 * 16 + 8 - co4.r();
		int integer7 = 128;
		return integer5 >= -128 && integer5 <= 128 && integer6 >= -128 && integer6 <= 128;
	}

	public void a(fm<?> fm) {
		throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
	}

	public bcn ak() {
		return this.B;
	}

	@Nullable
	public co a(String string, co co, boolean boolean3) {
		return null;
	}
}

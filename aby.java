import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class aby extends sn implements rp {
	private static final kk<Integer> a = kn.a(aby.class, km.b);
	private static final kk<Integer> b = kn.a(aby.class, km.b);
	private static final kk<Float> c = kn.a(aby.class, km.c);
	private static final kk<Integer> d = kn.a(aby.class, km.b);
	private static final kk<Integer> e = kn.a(aby.class, km.b);
	private static final kk<Boolean> f = kn.a(aby.class, km.h);
	private boolean g;
	private static final int[][][] h = new int[][][]{
		{{0, 0, -1}, {0, 0, 1}},
		{{-1, 0, 0}, {1, 0, 0}},
		{{-1, -1, 0}, {1, 0, 0}},
		{{-1, 0, 0}, {1, -1, 0}},
		{{0, 0, -1}, {0, -1, 1}},
		{{0, -1, -1}, {0, 0, 1}},
		{{0, 0, 1}, {1, 0, 0}},
		{{0, 0, 1}, {-1, 0, 0}},
		{{0, 0, -1}, {-1, 0, 0}},
		{{0, 0, -1}, {1, 0, 0}}
	};
	private int at;
	private double au;
	private double av;
	private double aw;
	private double ax;
	private double ay;
	private double az;
	private double aA;
	private double aB;

	public aby(ajs ajs) {
		super(ajs);
		this.i = true;
		this.a(0.98F, 0.7F);
	}

	public static aby a(ajs ajs, double double2, double double3, double double4, aby.a a) {
		switch (a) {
			case CHEST:
				return new abz(ajs, double2, double3, double4);
			case FURNACE:
				return new acc(ajs, double2, double3, double4);
			case TNT:
				return new acg(ajs, double2, double3, double4);
			case SPAWNER:
				return new acf(ajs, double2, double3, double4);
			case HOPPER:
				return new acd(ajs, double2, double3, double4);
			case COMMAND_BLOCK:
				return new aca(ajs, double2, double3, double4);
			default:
				return new ace(ajs, double2, double3, double4);
		}
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Override
	protected void i() {
		this.Y.a(a, 0);
		this.Y.a(b, 1);
		this.Y.a(c, 0.0F);
		this.Y.a(d, 0);
		this.Y.a(e, 6);
		this.Y.a(f, false);
	}

	@Nullable
	@Override
	public bdt j(sn sn) {
		return sn.ar() ? sn.bo() : null;
	}

	@Nullable
	@Override
	public bdt ag() {
		return null;
	}

	@Override
	public boolean ar() {
		return true;
	}

	public aby(ajs ajs, double double2, double double3, double double4) {
		this(ajs);
		this.b(double2, double3, double4);
		this.s = 0.0;
		this.t = 0.0;
		this.u = 0.0;
		this.m = double2;
		this.n = double3;
		this.o = double4;
	}

	@Override
	public double ay() {
		return 0.0;
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.l.E || this.F) {
			return true;
		} else if (this.b(ry)) {
			return false;
		} else {
			this.e(-this.u());
			this.d(10);
			this.ap();
			this.a(this.s() + float2 * 10.0F);
			boolean boolean4 = ry.j() instanceof aay && ((aay)ry.j()).bK.d;
			if (boolean4 || this.s() > 40.0F) {
				this.az();
				if (boolean4 && !this.n_()) {
					this.T();
				} else {
					this.a(ry);
				}
			}

			return true;
		}
	}

	public void a(ry ry) {
		this.T();
		if (this.l.U().b("doEntityDrops")) {
			afj afj3 = new afj(afl.aC, 1);
			if (this.n_()) {
				afj3.g(this.bi());
			}

			this.a(afj3, 0.0F);
		}
	}

	@Override
	public void aF() {
		this.e(-this.u());
		this.d(10);
		this.a(this.s() + this.s() * 10.0F);
	}

	@Override
	public boolean aq() {
		return !this.F;
	}

	@Override
	public cv bm() {
		return this.g ? this.bl().d().e() : this.bl().e();
	}

	@Override
	public void A_() {
		if (this.t() > 0) {
			this.d(this.t() - 1);
		}

		if (this.s() > 0.0F) {
			this.a(this.s() - 1.0F);
		}

		if (this.q < -64.0) {
			this.Y();
		}

		if (!this.l.E && this.l instanceof lw) {
			this.l.C.a("portal");
			MinecraftServer minecraftServer2 = this.l.u();
			int integer3 = this.V();
			if (this.ak) {
				if (minecraftServer2.E()) {
					if (!this.aK() && this.al++ >= integer3) {
						this.al = integer3;
						this.aj = this.aE();
						int integer4;
						if (this.l.s.q().a() == -1) {
							integer4 = 0;
						} else {
							integer4 = -1;
						}

						this.c(integer4);
					}

					this.ak = false;
				}
			} else {
				if (this.al > 0) {
					this.al -= 4;
				}

				if (this.al < 0) {
					this.al = 0;
				}
			}

			if (this.aj > 0) {
				this.aj--;
			}

			this.l.C.b();
		}

		if (this.l.E) {
			if (this.at > 0) {
				double double2 = this.p + (this.au - this.p) / (double)this.at;
				double double4 = this.q + (this.av - this.q) / (double)this.at;
				double double6 = this.r + (this.aw - this.r) / (double)this.at;
				double double8 = ot.g(this.ax - (double)this.v);
				this.v = (float)((double)this.v + double8 / (double)this.at);
				this.w = (float)((double)this.w + (this.ay - (double)this.w) / (double)this.at);
				this.at--;
				this.b(double2, double4, double6);
				this.b(this.v, this.w);
			} else {
				this.b(this.p, this.q, this.r);
				this.b(this.v, this.w);
			}
		} else {
			this.m = this.p;
			this.n = this.q;
			this.o = this.r;
			if (!this.ae()) {
				this.t -= 0.04F;
			}

			int integer2 = ot.c(this.p);
			int integer3x = ot.c(this.q);
			int integer4 = ot.c(this.r);
			if (alq.b(this.l, new co(integer2, integer3x - 1, integer4))) {
				integer3x--;
			}

			co co5 = new co(integer2, integer3x, integer4);
			atl atl6 = this.l.o(co5);
			if (alq.i(atl6)) {
				this.a(co5, atl6);
				if (atl6.v() == alv.cs) {
					this.a(integer2, integer3x, integer4, (Boolean)atl6.c(apr.e));
				}
			} else {
				this.q();
			}

			this.ac();
			this.w = 0.0F;
			double double7 = this.m - this.p;
			double double9 = this.o - this.r;
			if (double7 * double7 + double9 * double9 > 0.001) {
				this.v = (float)(ot.c(double9, double7) * 180.0 / Math.PI);
				if (this.g) {
					this.v += 180.0F;
				}
			}

			double double11 = (double)ot.g(this.v - this.x);
			if (double11 < -170.0 || double11 >= 170.0) {
				this.v += 180.0F;
				this.g = !this.g;
			}

			this.b(this.v, this.w);
			if (this.v() == aby.a.RIDEABLE && this.s * this.s + this.u * this.u > 0.01) {
				List<sn> list13 = this.l.a(this, this.bo().c(0.2F, 0.0, 0.2F), sr.a(this));
				if (!list13.isEmpty()) {
					for (int integer14 = 0; integer14 < list13.size(); integer14++) {
						sn sn15 = (sn)list13.get(integer14);
						if (!(sn15 instanceof aay) && !(sn15 instanceof xi) && !(sn15 instanceof aby) && !this.aL() && !sn15.aK()) {
							sn15.m(this);
						} else {
							sn15.i(this);
						}
					}
				}
			} else {
				for (sn sn14 : this.l.b(this, this.bo().c(0.2F, 0.0, 0.2F))) {
					if (!this.w(sn14) && sn14.ar() && sn14 instanceof aby) {
						sn14.i(this);
					}
				}
			}

			this.ak();
		}
	}

	protected double o() {
		return 0.4;
	}

	public void a(int integer1, int integer2, int integer3, boolean boolean4) {
	}

	protected void q() {
		double double2 = this.o();
		this.s = ot.a(this.s, -double2, double2);
		this.u = ot.a(this.u, -double2, double2);
		if (this.z) {
			this.s *= 0.5;
			this.t *= 0.5;
			this.u *= 0.5;
		}

		this.a(tc.SELF, this.s, this.t, this.u);
		if (!this.z) {
			this.s *= 0.95F;
			this.t *= 0.95F;
			this.u *= 0.95F;
		}
	}

	protected void a(co co, atl atl) {
		this.L = 0.0F;
		bdw bdw4 = this.j(this.p, this.q, this.r);
		this.q = (double)co.q();
		boolean boolean5 = false;
		boolean boolean6 = false;
		alq alq7 = (alq)atl.v();
		if (alq7 == alv.D) {
			boolean5 = (Boolean)atl.c(apr.e);
			boolean6 = !boolean5;
		}

		double double8 = 0.0078125;
		alq.b b10 = atl.c(alq7.g());
		switch (b10) {
			case ASCENDING_EAST:
				this.s -= 0.0078125;
				this.q++;
				break;
			case ASCENDING_WEST:
				this.s += 0.0078125;
				this.q++;
				break;
			case ASCENDING_NORTH:
				this.u += 0.0078125;
				this.q++;
				break;
			case ASCENDING_SOUTH:
				this.u -= 0.0078125;
				this.q++;
		}

		int[][] arr11 = h[b10.a()];
		double double12 = (double)(arr11[1][0] - arr11[0][0]);
		double double14 = (double)(arr11[1][2] - arr11[0][2]);
		double double16 = Math.sqrt(double12 * double12 + double14 * double14);
		double double18 = this.s * double12 + this.u * double14;
		if (double18 < 0.0) {
			double12 = -double12;
			double14 = -double14;
		}

		double double20 = Math.sqrt(this.s * this.s + this.u * this.u);
		if (double20 > 2.0) {
			double20 = 2.0;
		}

		this.s = double20 * double12 / double16;
		this.u = double20 * double14 / double16;
		sn sn22 = this.bx().isEmpty() ? null : (sn)this.bx().get(0);
		if (sn22 instanceof sw) {
			double double23 = (double)((sw)sn22).bf;
			if (double23 > 0.0) {
				double double25 = -Math.sin((double)(sn22.v * (float) (Math.PI / 180.0)));
				double double27 = Math.cos((double)(sn22.v * (float) (Math.PI / 180.0)));
				double double29 = this.s * this.s + this.u * this.u;
				if (double29 < 0.01) {
					this.s += double25 * 0.1;
					this.u += double27 * 0.1;
					boolean6 = false;
				}
			}
		}

		if (boolean6) {
			double double23 = Math.sqrt(this.s * this.s + this.u * this.u);
			if (double23 < 0.03) {
				this.s *= 0.0;
				this.t *= 0.0;
				this.u *= 0.0;
			} else {
				this.s *= 0.5;
				this.t *= 0.0;
				this.u *= 0.5;
			}
		}

		double double23 = (double)co.p() + 0.5 + (double)arr11[0][0] * 0.5;
		double double25 = (double)co.r() + 0.5 + (double)arr11[0][2] * 0.5;
		double double27 = (double)co.p() + 0.5 + (double)arr11[1][0] * 0.5;
		double double29 = (double)co.r() + 0.5 + (double)arr11[1][2] * 0.5;
		double12 = double27 - double23;
		double14 = double29 - double25;
		double double31;
		if (double12 == 0.0) {
			this.p = (double)co.p() + 0.5;
			double31 = this.r - (double)co.r();
		} else if (double14 == 0.0) {
			this.r = (double)co.r() + 0.5;
			double31 = this.p - (double)co.p();
		} else {
			double double33 = this.p - double23;
			double double35 = this.r - double25;
			double31 = (double33 * double12 + double35 * double14) * 2.0;
		}

		this.p = double23 + double12 * double31;
		this.r = double25 + double14 * double31;
		this.b(this.p, this.q, this.r);
		double double33 = this.s;
		double double35 = this.u;
		if (this.aL()) {
			double33 *= 0.75;
			double35 *= 0.75;
		}

		double double37 = this.o();
		double33 = ot.a(double33, -double37, double37);
		double35 = ot.a(double35, -double37, double37);
		this.a(tc.SELF, double33, 0.0, double35);
		if (arr11[0][1] != 0 && ot.c(this.p) - co.p() == arr11[0][0] && ot.c(this.r) - co.r() == arr11[0][2]) {
			this.b(this.p, this.q + (double)arr11[0][1], this.r);
		} else if (arr11[1][1] != 0 && ot.c(this.p) - co.p() == arr11[1][0] && ot.c(this.r) - co.r() == arr11[1][2]) {
			this.b(this.p, this.q + (double)arr11[1][1], this.r);
		}

		this.r();
		bdw bdw39 = this.j(this.p, this.q, this.r);
		if (bdw39 != null && bdw4 != null) {
			double double40 = (bdw4.c - bdw39.c) * 0.05;
			double20 = Math.sqrt(this.s * this.s + this.u * this.u);
			if (double20 > 0.0) {
				this.s = this.s / double20 * (double20 + double40);
				this.u = this.u / double20 * (double20 + double40);
			}

			this.b(this.p, bdw39.c, this.r);
		}

		int integer40 = ot.c(this.p);
		int integer41 = ot.c(this.r);
		if (integer40 != co.p() || integer41 != co.r()) {
			double20 = Math.sqrt(this.s * this.s + this.u * this.u);
			this.s = double20 * (double)(integer40 - co.p());
			this.u = double20 * (double)(integer41 - co.r());
		}

		if (boolean5) {
			double double42 = Math.sqrt(this.s * this.s + this.u * this.u);
			if (double42 > 0.01) {
				double double44 = 0.06;
				this.s = this.s + this.s / double42 * 0.06;
				this.u = this.u + this.u / double42 * 0.06;
			} else if (b10 == alq.b.EAST_WEST) {
				if (this.l.o(co.e()).m()) {
					this.s = 0.02;
				} else if (this.l.o(co.f()).m()) {
					this.s = -0.02;
				}
			} else if (b10 == alq.b.NORTH_SOUTH) {
				if (this.l.o(co.c()).m()) {
					this.u = 0.02;
				} else if (this.l.o(co.d()).m()) {
					this.u = -0.02;
				}
			}
		}
	}

	protected void r() {
		if (this.aL()) {
			this.s *= 0.997F;
			this.t *= 0.0;
			this.u *= 0.997F;
		} else {
			this.s *= 0.96F;
			this.t *= 0.0;
			this.u *= 0.96F;
		}
	}

	@Override
	public void b(double double1, double double2, double double3) {
		this.p = double1;
		this.q = double2;
		this.r = double3;
		float float8 = this.G / 2.0F;
		float float9 = this.H;
		this.a(new bdt(double1 - (double)float8, double2, double3 - (double)float8, double1 + (double)float8, double2 + (double)float9, double3 + (double)float8));
	}

	@Nullable
	public bdw a(double double1, double double2, double double3, double double4) {
		int integer10 = ot.c(double1);
		int integer11 = ot.c(double2);
		int integer12 = ot.c(double3);
		if (alq.b(this.l, new co(integer10, integer11 - 1, integer12))) {
			integer11--;
		}

		atl atl13 = this.l.o(new co(integer10, integer11, integer12));
		if (alq.i(atl13)) {
			alq.b b14 = atl13.c(((alq)atl13.v()).g());
			double2 = (double)integer11;
			if (b14.c()) {
				double2 = (double)(integer11 + 1);
			}

			int[][] arr15 = h[b14.a()];
			double double16 = (double)(arr15[1][0] - arr15[0][0]);
			double double18 = (double)(arr15[1][2] - arr15[0][2]);
			double double20 = Math.sqrt(double16 * double16 + double18 * double18);
			double16 /= double20;
			double18 /= double20;
			double1 += double16 * double4;
			double3 += double18 * double4;
			if (arr15[0][1] != 0 && ot.c(double1) - integer10 == arr15[0][0] && ot.c(double3) - integer12 == arr15[0][2]) {
				double2 += (double)arr15[0][1];
			} else if (arr15[1][1] != 0 && ot.c(double1) - integer10 == arr15[1][0] && ot.c(double3) - integer12 == arr15[1][2]) {
				double2 += (double)arr15[1][1];
			}

			return this.j(double1, double2, double3);
		} else {
			return null;
		}
	}

	@Nullable
	public bdw j(double double1, double double2, double double3) {
		int integer8 = ot.c(double1);
		int integer9 = ot.c(double2);
		int integer10 = ot.c(double3);
		if (alq.b(this.l, new co(integer8, integer9 - 1, integer10))) {
			integer9--;
		}

		atl atl11 = this.l.o(new co(integer8, integer9, integer10));
		if (alq.i(atl11)) {
			alq.b b12 = atl11.c(((alq)atl11.v()).g());
			int[][] arr13 = h[b12.a()];
			double double14 = (double)integer8 + 0.5 + (double)arr13[0][0] * 0.5;
			double double16 = (double)integer9 + 0.0625 + (double)arr13[0][1] * 0.5;
			double double18 = (double)integer10 + 0.5 + (double)arr13[0][2] * 0.5;
			double double20 = (double)integer8 + 0.5 + (double)arr13[1][0] * 0.5;
			double double22 = (double)integer9 + 0.0625 + (double)arr13[1][1] * 0.5;
			double double24 = (double)integer10 + 0.5 + (double)arr13[1][2] * 0.5;
			double double26 = double20 - double14;
			double double28 = (double22 - double16) * 2.0;
			double double30 = double24 - double18;
			double double32;
			if (double26 == 0.0) {
				double32 = double3 - (double)integer10;
			} else if (double30 == 0.0) {
				double32 = double1 - (double)integer8;
			} else {
				double double34 = double1 - double14;
				double double36 = double3 - double18;
				double32 = (double34 * double26 + double36 * double30) * 2.0;
			}

			double1 = double14 + double26 * double32;
			double2 = double16 + double28 * double32;
			double3 = double18 + double30 * double32;
			if (double28 < 0.0) {
				double2++;
			}

			if (double28 > 0.0) {
				double2 += 0.5;
			}

			return new bdw(double1, double2, double3);
		} else {
			return null;
		}
	}

	@Override
	public bdt bp() {
		bdt bdt2 = this.bo();
		return this.A() ? bdt2.g((double)Math.abs(this.y()) / 16.0) : bdt2;
	}

	public static void a(ph ph, Class<?> class2) {
	}

	@Override
	protected void a(du du) {
		if (du.p("CustomDisplayTile")) {
			alu alu3;
			if (du.b("DisplayTile", 8)) {
				alu3 = alu.b(du.l("DisplayTile"));
			} else {
				alu3 = alu.b(du.h("DisplayTile"));
			}

			int integer4 = du.h("DisplayData");
			this.a(alu3 == null ? alv.a.t() : alu3.a(integer4));
			this.f(du.h("DisplayOffset"));
		}
	}

	@Override
	protected void b(du du) {
		if (this.A()) {
			du.a("CustomDisplayTile", true);
			atl atl3 = this.w();
			kq kq4 = alu.h.b(atl3.v());
			du.a("DisplayTile", kq4 == null ? "" : kq4.toString());
			du.a("DisplayData", atl3.v().e(atl3));
			du.a("DisplayOffset", this.y());
		}
	}

	@Override
	public void i(sn sn) {
		if (!this.l.E) {
			if (!sn.Q && !this.Q) {
				if (!this.w(sn)) {
					double double3 = sn.p - this.p;
					double double5 = sn.r - this.r;
					double double7 = double3 * double3 + double5 * double5;
					if (double7 >= 1.0E-4F) {
						double7 = (double)ot.a(double7);
						double3 /= double7;
						double5 /= double7;
						double double9 = 1.0 / double7;
						if (double9 > 1.0) {
							double9 = 1.0;
						}

						double3 *= double9;
						double5 *= double9;
						double3 *= 0.1F;
						double5 *= 0.1F;
						double3 *= (double)(1.0F - this.R);
						double5 *= (double)(1.0F - this.R);
						double3 *= 0.5;
						double5 *= 0.5;
						if (sn instanceof aby) {
							double double11 = sn.p - this.p;
							double double13 = sn.r - this.r;
							bdw bdw15 = new bdw(double11, 0.0, double13).a();
							bdw bdw16 = new bdw((double)ot.b(this.v * (float) (Math.PI / 180.0)), 0.0, (double)ot.a(this.v * (float) (Math.PI / 180.0))).a();
							double double17 = Math.abs(bdw15.b(bdw16));
							if (double17 < 0.8F) {
								return;
							}

							double double19 = sn.s + this.s;
							double double21 = sn.u + this.u;
							if (((aby)sn).v() == aby.a.FURNACE && this.v() != aby.a.FURNACE) {
								this.s *= 0.2F;
								this.u *= 0.2F;
								this.f(sn.s - double3, 0.0, sn.u - double5);
								sn.s *= 0.95F;
								sn.u *= 0.95F;
							} else if (((aby)sn).v() != aby.a.FURNACE && this.v() == aby.a.FURNACE) {
								sn.s *= 0.2F;
								sn.u *= 0.2F;
								sn.f(this.s + double3, 0.0, this.u + double5);
								this.s *= 0.95F;
								this.u *= 0.95F;
							} else {
								double19 /= 2.0;
								double21 /= 2.0;
								this.s *= 0.2F;
								this.u *= 0.2F;
								this.f(double19 - double3, 0.0, double21 - double5);
								sn.s *= 0.2F;
								sn.u *= 0.2F;
								sn.f(double19 + double3, 0.0, double21 + double5);
							}
						} else {
							this.f(-double3, 0.0, -double5);
							sn.f(double3 / 4.0, 0.0, double5 / 4.0);
						}
					}
				}
			}
		}
	}

	@Override
	public void a(double double1, double double2, double double3, float float4, float float5, int integer, boolean boolean7) {
		this.au = double1;
		this.av = double2;
		this.aw = double3;
		this.ax = (double)float4;
		this.ay = (double)float5;
		this.at = integer + 2;
		this.s = this.az;
		this.t = this.aA;
		this.u = this.aB;
	}

	@Override
	public void h(double double1, double double2, double double3) {
		this.s = double1;
		this.t = double2;
		this.u = double3;
		this.az = this.s;
		this.aA = this.t;
		this.aB = this.u;
	}

	public void a(float float1) {
		this.Y.b(c, float1);
	}

	public float s() {
		return this.Y.a(c);
	}

	public void d(int integer) {
		this.Y.b(a, integer);
	}

	public int t() {
		return this.Y.a(a);
	}

	public void e(int integer) {
		this.Y.b(b, integer);
	}

	public int u() {
		return this.Y.a(b);
	}

	public abstract aby.a v();

	public atl w() {
		return !this.A() ? this.x() : alu.c(this.R().a(d));
	}

	public atl x() {
		return alv.a.t();
	}

	public int y() {
		return !this.A() ? this.z() : this.R().a(e);
	}

	public int z() {
		return 6;
	}

	public void a(atl atl) {
		this.R().b(d, alu.j(atl));
		this.a(true);
	}

	public void f(int integer) {
		this.R().b(e, integer);
		this.a(true);
	}

	public boolean A() {
		return this.R().a(f);
	}

	public void a(boolean boolean1) {
		this.R().b(f, boolean1);
	}

	public static enum a {
		RIDEABLE(0, "MinecartRideable"),
		CHEST(1, "MinecartChest"),
		FURNACE(2, "MinecartFurnace"),
		TNT(3, "MinecartTNT"),
		SPAWNER(4, "MinecartSpawner"),
		HOPPER(5, "MinecartHopper"),
		COMMAND_BLOCK(6, "MinecartCommandBlock");

		private static final Map<Integer, aby.a> h = Maps.newHashMap();
		private final int i;
		private final String j;

		private a(int integer3, String string4) {
			this.i = integer3;
			this.j = string4;
		}

		public int a() {
			return this.i;
		}

		public String b() {
			return this.j;
		}

		public static aby.a a(int integer) {
			aby.a a2 = (aby.a)h.get(integer);
			return a2 == null ? RIDEABLE : a2;
		}

		static {
			for (aby.a a4 : values()) {
				h.put(a4.a(), a4);
			}
		}
	}
}

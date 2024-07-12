import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class sn implements n {
	private static final Logger a = LogManager.getLogger();
	private static final List<afj> b = Collections.emptyList();
	private static final bdt c = new bdt(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
	private static double f = 1.0;
	private static int g;
	private int h;
	public boolean i;
	private final List<sn> at;
	protected int j;
	private sn au;
	public boolean k;
	public ajs l;
	public double m;
	public double n;
	public double o;
	public double p;
	public double q;
	public double r;
	public double s;
	public double t;
	public double u;
	public float v;
	public float w;
	public float x;
	public float y;
	private bdt av;
	public boolean z;
	public boolean A;
	public boolean B;
	public boolean C;
	public boolean D;
	protected boolean E;
	private boolean aw;
	public boolean F;
	public float G;
	public float H;
	public float I;
	public float J;
	public float K;
	public float L;
	private int ax;
	public double M;
	public double N;
	public double O;
	public float P;
	public boolean Q;
	public float R;
	protected Random S;
	public int T;
	private int ay;
	protected boolean U;
	public int V;
	protected boolean W;
	protected boolean X;
	protected kn Y;
	protected static final kk<Byte> Z = kn.a(sn.class, km.a);
	private static final kk<Integer> az = kn.a(sn.class, km.b);
	private static final kk<String> aA = kn.a(sn.class, km.d);
	private static final kk<Boolean> aB = kn.a(sn.class, km.h);
	private static final kk<Boolean> aC = kn.a(sn.class, km.h);
	private static final kk<Boolean> aD = kn.a(sn.class, km.h);
	public boolean aa;
	public int ab;
	public int ac;
	public int ad;
	public long ae;
	public long af;
	public long ag;
	public boolean ah;
	public boolean ai;
	public int aj;
	protected boolean ak;
	protected int al;
	public int am;
	protected co an;
	protected bdw ao;
	protected cv ap;
	private boolean aE;
	protected UUID aq;
	protected String ar;
	private final o aF;
	protected boolean as;
	private final Set<String> aG;
	private boolean aH;
	private double[] aI;
	private long aJ;

	public sn(ajs ajs) {
		this.h = g++;
		this.at = Lists.newArrayList();
		this.av = c;
		this.G = 0.6F;
		this.H = 1.8F;
		this.ax = 1;
		this.S = new Random();
		this.ay = -this.bD();
		this.W = true;
		this.aq = ot.a(this.S);
		this.ar = this.aq.toString();
		this.aF = new o();
		this.aG = Sets.newHashSet();
		this.aI = new double[]{0.0, 0.0, 0.0};
		this.l = ajs;
		this.b(0.0, 0.0, 0.0);
		if (ajs != null) {
			this.am = ajs.s.q().a();
		}

		this.Y = new kn(this);
		this.Y.a(Z, (byte)0);
		this.Y.a(az, 300);
		this.Y.a(aB, false);
		this.Y.a(aA, "");
		this.Y.a(aC, false);
		this.Y.a(aD, false);
		this.i();
	}

	public int O() {
		return this.h;
	}

	public void h(int integer) {
		this.h = integer;
	}

	public Set<String> P() {
		return this.aG;
	}

	public boolean a(String string) {
		if (this.aG.size() >= 1024) {
			return false;
		} else {
			this.aG.add(string);
			return true;
		}
	}

	public boolean b(String string) {
		return this.aG.remove(string);
	}

	public void Q() {
		this.T();
	}

	protected abstract void i();

	public kn R() {
		return this.Y;
	}

	public boolean equals(Object object) {
		return object instanceof sn ? ((sn)object).h == this.h : false;
	}

	public int hashCode() {
		return this.h;
	}

	protected void S() {
		if (this.l != null) {
			while (this.q > 0.0 && this.q < 256.0) {
				this.b(this.p, this.q, this.r);
				if (this.l.a(this, this.bo()).isEmpty()) {
					break;
				}

				this.q++;
			}

			this.s = 0.0;
			this.t = 0.0;
			this.u = 0.0;
			this.w = 0.0F;
		}
	}

	public void T() {
		this.F = true;
	}

	public void b(boolean boolean1) {
	}

	protected void a(float float1, float float2) {
		if (float1 != this.G || float2 != this.H) {
			float float4 = this.G;
			this.G = float1;
			this.H = float2;
			if (this.G < float4) {
				double double5 = (double)float1 / 2.0;
				this.a(new bdt(this.p - double5, this.q, this.r - double5, this.p + double5, this.q + (double)this.H, this.r + double5));
				return;
			}

			bdt bdt5 = this.bo();
			this.a(new bdt(bdt5.a, bdt5.b, bdt5.c, bdt5.a + (double)this.G, bdt5.b + (double)this.H, bdt5.c + (double)this.G));
			if (this.G > float4 && !this.W && !this.l.E) {
				this.a(tc.SELF, (double)(float4 - this.G), 0.0, (double)(float4 - this.G));
			}
		}
	}

	protected void b(float float1, float float2) {
		this.v = float1 % 360.0F;
		this.w = float2 % 360.0F;
	}

	public void b(double double1, double double2, double double3) {
		this.p = double1;
		this.q = double2;
		this.r = double3;
		float float8 = this.G / 2.0F;
		float float9 = this.H;
		this.a(new bdt(double1 - (double)float8, double2, double3 - (double)float8, double1 + (double)float8, double2 + (double)float9, double3 + (double)float8));
	}

	public void c(float float1, float float2) {
		float float4 = this.w;
		float float5 = this.v;
		this.v = (float)((double)this.v + (double)float1 * 0.15);
		this.w = (float)((double)this.w - (double)float2 * 0.15);
		this.w = ot.a(this.w, -90.0F, 90.0F);
		this.y = this.y + (this.w - float4);
		this.x = this.x + (this.v - float5);
		if (this.au != null) {
			this.au.l(this);
		}
	}

	public void A_() {
		if (!this.l.E) {
			this.b(6, this.aO());
		}

		this.U();
	}

	public void U() {
		this.l.C.a("entityBaseTick");
		if (this.aK() && this.bB().F) {
			this.p();
		}

		if (this.j > 0) {
			this.j--;
		}

		this.I = this.J;
		this.m = this.p;
		this.n = this.q;
		this.o = this.r;
		this.y = this.w;
		this.x = this.v;
		if (!this.l.E && this.l instanceof lw) {
			this.l.C.a("portal");
			if (this.ak) {
				MinecraftServer minecraftServer2 = this.l.u();
				if (minecraftServer2.E()) {
					if (!this.aK()) {
						int integer3 = this.V();
						if (this.al++ >= integer3) {
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

			this.H();
			this.l.C.b();
		}

		this.am();
		this.ak();
		if (this.l.E) {
			this.X();
		} else if (this.ay > 0) {
			if (this.X) {
				this.ay -= 4;
				if (this.ay < 0) {
					this.X();
				}
			} else {
				if (this.ay % 20 == 0) {
					this.a(ry.c, 1.0F);
				}

				this.ay--;
			}
		}

		if (this.ao()) {
			this.W();
			this.L *= 0.5F;
		}

		if (this.q < -64.0) {
			this.Y();
		}

		if (!this.l.E) {
			this.b(0, this.ay > 0);
		}

		this.W = false;
		this.l.C.b();
	}

	protected void H() {
		if (this.aj > 0) {
			this.aj--;
		}
	}

	public int V() {
		return 1;
	}

	protected void W() {
		if (!this.X) {
			this.a(ry.d, 4.0F);
			this.i(15);
		}
	}

	public void i(int integer) {
		int integer3 = integer * 20;
		if (this instanceof sw) {
			integer3 = aiu.a((sw)this, integer3);
		}

		if (this.ay < integer3) {
			this.ay = integer3;
		}
	}

	public void X() {
		this.ay = 0;
	}

	protected void Y() {
		this.T();
	}

	public boolean c(double double1, double double2, double double3) {
		bdt bdt8 = this.bo().d(double1, double2, double3);
		return this.b(bdt8);
	}

	private boolean b(bdt bdt) {
		return this.l.a(this, bdt).isEmpty() && !this.l.d(bdt);
	}

	public void a(tc tc, double double2, double double3, double double4) {
		if (this.Q) {
			this.a(this.bo().d(double2, double3, double4));
			this.Z();
		} else {
			if (tc == tc.PISTON) {
				long long9 = this.l.P();
				if (long9 != this.aJ) {
					Arrays.fill(this.aI, 0.0);
					this.aJ = long9;
				}

				if (double2 != 0.0) {
					int integer11 = cv.a.X.ordinal();
					double double12 = ot.a(double2 + this.aI[integer11], -0.51, 0.51);
					double2 = double12 - this.aI[integer11];
					this.aI[integer11] = double12;
					if (Math.abs(double2) <= 1.0E-5F) {
						return;
					}
				} else if (double3 != 0.0) {
					int integer11 = cv.a.Y.ordinal();
					double double12 = ot.a(double3 + this.aI[integer11], -0.51, 0.51);
					double3 = double12 - this.aI[integer11];
					this.aI[integer11] = double12;
					if (Math.abs(double3) <= 1.0E-5F) {
						return;
					}
				} else {
					if (double4 == 0.0) {
						return;
					}

					int integer11 = cv.a.Z.ordinal();
					double double12 = ot.a(double4 + this.aI[integer11], -0.51, 0.51);
					double4 = double12 - this.aI[integer11];
					this.aI[integer11] = double12;
					if (Math.abs(double4) <= 1.0E-5F) {
						return;
					}
				}
			}

			this.l.C.a("move");
			double double9 = this.p;
			double double11 = this.q;
			double double13 = this.r;
			if (this.E) {
				this.E = false;
				double2 *= 0.25;
				double3 *= 0.05F;
				double4 *= 0.25;
				this.s = 0.0;
				this.t = 0.0;
				this.u = 0.0;
			}

			double double15 = double2;
			double double17 = double3;
			double double19 = double4;
			if ((tc == tc.SELF || tc == tc.PLAYER) && this.z && this.aM() && this instanceof aay) {
				for (double double21 = 0.05; double2 != 0.0 && this.l.a(this, this.bo().d(double2, (double)(-this.P), 0.0)).isEmpty(); double15 = double2) {
					if (double2 < 0.05 && double2 >= -0.05) {
						double2 = 0.0;
					} else if (double2 > 0.0) {
						double2 -= 0.05;
					} else {
						double2 += 0.05;
					}
				}

				for (; double4 != 0.0 && this.l.a(this, this.bo().d(0.0, (double)(-this.P), double4)).isEmpty(); double19 = double4) {
					if (double4 < 0.05 && double4 >= -0.05) {
						double4 = 0.0;
					} else if (double4 > 0.0) {
						double4 -= 0.05;
					} else {
						double4 += 0.05;
					}
				}

				for (; double2 != 0.0 && double4 != 0.0 && this.l.a(this, this.bo().d(double2, (double)(-this.P), double4)).isEmpty(); double19 = double4) {
					if (double2 < 0.05 && double2 >= -0.05) {
						double2 = 0.0;
					} else if (double2 > 0.0) {
						double2 -= 0.05;
					} else {
						double2 += 0.05;
					}

					double15 = double2;
					if (double4 < 0.05 && double4 >= -0.05) {
						double4 = 0.0;
					} else if (double4 > 0.0) {
						double4 -= 0.05;
					} else {
						double4 += 0.05;
					}
				}
			}

			List<bdt> list21 = this.l.a(this, this.bo().b(double2, double3, double4));
			bdt bdt22 = this.bo();
			if (double3 != 0.0) {
				int integer23 = 0;

				for (int integer24 = list21.size(); integer23 < integer24; integer23++) {
					double3 = ((bdt)list21.get(integer23)).b(this.bo(), double3);
				}

				this.a(this.bo().d(0.0, double3, 0.0));
			}

			if (double2 != 0.0) {
				int integer23 = 0;

				for (int integer24 = list21.size(); integer23 < integer24; integer23++) {
					double2 = ((bdt)list21.get(integer23)).a(this.bo(), double2);
				}

				if (double2 != 0.0) {
					this.a(this.bo().d(double2, 0.0, 0.0));
				}
			}

			if (double4 != 0.0) {
				int integer23 = 0;

				for (int integer24 = list21.size(); integer23 < integer24; integer23++) {
					double4 = ((bdt)list21.get(integer23)).c(this.bo(), double4);
				}

				if (double4 != 0.0) {
					this.a(this.bo().d(0.0, 0.0, double4));
				}
			}

			boolean boolean23 = this.z || double17 != double3 && double17 < 0.0;
			if (this.P > 0.0F && boolean23 && (double15 != double2 || double19 != double4)) {
				double double24 = double2;
				double double26 = double3;
				double double28 = double4;
				bdt bdt30 = this.bo();
				this.a(bdt22);
				double3 = (double)this.P;
				List<bdt> list31 = this.l.a(this, this.bo().b(double15, double3, double19));
				bdt bdt32 = this.bo();
				bdt bdt33 = bdt32.b(double15, 0.0, double19);
				double double34 = double3;
				int integer36 = 0;

				for (int integer37 = list31.size(); integer36 < integer37; integer36++) {
					double34 = ((bdt)list31.get(integer36)).b(bdt33, double34);
				}

				bdt32 = bdt32.d(0.0, double34, 0.0);
				double double36 = double15;
				int integer38 = 0;

				for (int integer39 = list31.size(); integer38 < integer39; integer38++) {
					double36 = ((bdt)list31.get(integer38)).a(bdt32, double36);
				}

				bdt32 = bdt32.d(double36, 0.0, 0.0);
				double double38 = double19;
				int integer40 = 0;

				for (int integer41 = list31.size(); integer40 < integer41; integer40++) {
					double38 = ((bdt)list31.get(integer40)).c(bdt32, double38);
				}

				bdt32 = bdt32.d(0.0, 0.0, double38);
				bdt bdt40 = this.bo();
				double double41 = double3;
				int integer43 = 0;

				for (int integer44 = list31.size(); integer43 < integer44; integer43++) {
					double41 = ((bdt)list31.get(integer43)).b(bdt40, double41);
				}

				bdt var88 = bdt40.d(0.0, double41, 0.0);
				double double43 = double15;
				int integer45 = 0;

				for (int integer46 = list31.size(); integer45 < integer46; integer45++) {
					double43 = ((bdt)list31.get(integer45)).a(var88, double43);
				}

				bdt var89 = var88.d(double43, 0.0, 0.0);
				double double45 = double19;
				int integer47 = 0;

				for (int integer48 = list31.size(); integer47 < integer48; integer47++) {
					double45 = ((bdt)list31.get(integer47)).c(var89, double45);
				}

				bdt var90 = var89.d(0.0, 0.0, double45);
				double double47 = double36 * double36 + double38 * double38;
				double double49 = double43 * double43 + double45 * double45;
				if (double47 > double49) {
					double2 = double36;
					double4 = double38;
					double3 = -double34;
					this.a(bdt32);
				} else {
					double2 = double43;
					double4 = double45;
					double3 = -double41;
					this.a(var90);
				}

				int integer51 = 0;

				for (int integer52 = list31.size(); integer51 < integer52; integer51++) {
					double3 = ((bdt)list31.get(integer51)).b(this.bo(), double3);
				}

				this.a(this.bo().d(0.0, double3, 0.0));
				if (double24 * double24 + double28 * double28 >= double2 * double2 + double4 * double4) {
					double2 = double24;
					double3 = double26;
					double4 = double28;
					this.a(bdt30);
				}
			}

			this.l.C.b();
			this.l.C.a("rest");
			this.Z();
			this.A = double15 != double2 || double19 != double4;
			this.B = double17 != double3;
			this.z = this.B && double17 < 0.0;
			this.C = this.A || this.B;
			int integer24 = ot.c(this.p);
			int integer25 = ot.c(this.q - 0.2F);
			int integer26 = ot.c(this.r);
			co co27 = new co(integer24, integer25, integer26);
			atl atl28 = this.l.o(co27);
			if (atl28.a() == azs.a) {
				co co29 = co27.b();
				atl atl30 = this.l.o(co29);
				alu alu31 = atl30.v();
				if (alu31 instanceof anl || alu31 instanceof arq || alu31 instanceof anm) {
					atl28 = atl30;
					co27 = co29;
				}
			}

			this.a(double3, this.z, atl28, co27);
			if (double15 != double2) {
				this.s = 0.0;
			}

			if (double19 != double4) {
				this.u = 0.0;
			}

			alu alu29 = atl28.v();
			if (double17 != double3) {
				alu29.a(this.l, this);
			}

			if (this.af() && (!this.z || !this.aM() || !(this instanceof aay)) && !this.aK()) {
				double double30 = this.p - double9;
				double double32 = this.q - double11;
				double double34 = this.r - double13;
				if (alu29 != alv.au) {
					double32 = 0.0;
				}

				if (alu29 != null && this.z) {
					alu29.a(this.l, co27, this);
				}

				this.J = (float)((double)this.J + (double)ot.a(double30 * double30 + double34 * double34) * 0.6);
				this.K = (float)((double)this.K + (double)ot.a(double30 * double30 + double32 * double32 + double34 * double34) * 0.6);
				if (this.K > (float)this.ax && atl28.a() != azs.a) {
					this.ax = (int)this.K + 1;
					if (this.aj()) {
						sn sn36 = this.aL() && this.bw() != null ? this.bw() : this;
						float float37 = sn36 == this ? 0.35F : 0.4F;
						float float38 = ot.a(sn36.s * sn36.s * 0.2F + sn36.t * sn36.t + sn36.u * sn36.u * 0.2F) * float37;
						if (float38 > 1.0F) {
							float38 = 1.0F;
						}

						this.a(this.aa(), float38, 1.0F + (this.S.nextFloat() - this.S.nextFloat()) * 0.4F);
					} else {
						this.a(co27, alu29);
					}
				}
			}

			try {
				this.ac();
			} catch (Throwable var52) {
				b b31 = b.a(var52, "Checking entity block collision");
				c c32 = b31.a("Entity being checked for collision");
				this.a(c32);
				throw new f(b31);
			}

			boolean boolean30 = this.ai();
			if (this.l.e(this.bo().h(0.001))) {
				this.j(1);
				if (!boolean30) {
					this.ay++;
					if (this.ay == 0) {
						this.i(8);
					}
				}
			} else if (this.ay <= 0) {
				this.ay = -this.bD();
			}

			if (boolean30 && this.aJ()) {
				this.a(nn.bQ, 0.7F, 1.6F + (this.S.nextFloat() - this.S.nextFloat()) * 0.4F);
				this.ay = -this.bD();
			}

			this.l.C.b();
		}
	}

	public void Z() {
		bdt bdt2 = this.bo();
		this.p = (bdt2.a + bdt2.d) / 2.0;
		this.q = bdt2.b;
		this.r = (bdt2.c + bdt2.f) / 2.0;
	}

	protected nm aa() {
		return nn.bU;
	}

	protected nm ab() {
		return nn.bT;
	}

	protected void ac() {
		bdt bdt2 = this.bo();
		co.b b3 = co.b.d(bdt2.a + 0.001, bdt2.b + 0.001, bdt2.c + 0.001);
		co.b b4 = co.b.d(bdt2.d - 0.001, bdt2.e - 0.001, bdt2.f - 0.001);
		co.b b5 = co.b.s();
		if (this.l.a(b3, b4)) {
			for (int integer6 = b3.p(); integer6 <= b4.p(); integer6++) {
				for (int integer7 = b3.q(); integer7 <= b4.q(); integer7++) {
					for (int integer8 = b3.r(); integer8 <= b4.r(); integer8++) {
						b5.f(integer6, integer7, integer8);
						atl atl9 = this.l.o(b5);

						try {
							atl9.v().a(this.l, b5, atl9, this);
						} catch (Throwable var12) {
							b b11 = b.a(var12, "Colliding entity with block");
							c c12 = b11.a("Block being collided with");
							c.a(c12, b5, atl9);
							throw new f(b11);
						}
					}
				}
			}
		}

		b3.t();
		b4.t();
		b5.t();
	}

	protected void a(co co, alu alu) {
		aqu aqu4 = alu.v();
		if (this.l.o(co.a()).v() == alv.aH) {
			aqu4 = alv.aH.v();
			this.a(aqu4.d(), aqu4.a() * 0.15F, aqu4.b());
		} else if (!alu.t().a().d()) {
			this.a(aqu4.d(), aqu4.a() * 0.15F, aqu4.b());
		}
	}

	public void a(nm nm, float float2, float float3) {
		if (!this.ad()) {
			this.l.a(null, this.p, this.q, this.r, nm, this.bC(), float2, float3);
		}
	}

	public boolean ad() {
		return this.Y.a(aC);
	}

	public void c(boolean boolean1) {
		this.Y.b(aC, boolean1);
	}

	public boolean ae() {
		return this.Y.a(aD);
	}

	public void d(boolean boolean1) {
		this.Y.b(aD, boolean1);
	}

	protected boolean af() {
		return true;
	}

	protected void a(double double1, boolean boolean2, atl atl, co co) {
		if (boolean2) {
			if (this.L > 0.0F) {
				atl.v().a(this.l, co, this, this.L);
			}

			this.L = 0.0F;
		} else if (double1 < 0.0) {
			this.L = (float)((double)this.L - double1);
		}
	}

	@Nullable
	public bdt ag() {
		return null;
	}

	protected void j(int integer) {
		if (!this.X) {
			this.a(ry.a, (float)integer);
		}
	}

	public final boolean ah() {
		return this.X;
	}

	public void e(float float1, float float2) {
		if (this.aL()) {
			for (sn sn5 : this.bx()) {
				sn5.e(float1, float2);
			}
		}
	}

	public boolean ai() {
		if (this.U) {
			return true;
		} else {
			co.b b2 = co.b.d(this.p, this.q, this.r);
			if (!this.l.B(b2) && !this.l.B(b2.e(this.p, this.q + (double)this.H, this.r))) {
				b2.t();
				return false;
			} else {
				b2.t();
				return true;
			}
		}
	}

	public boolean aj() {
		return this.U;
	}

	public boolean ak() {
		if (this.bB() instanceof abx) {
			this.U = false;
		} else if (this.l.a(this.bo().c(0.0, -0.4F, 0.0).h(0.001), azs.h, this)) {
			if (!this.U && !this.W) {
				this.al();
			}

			this.L = 0.0F;
			this.U = true;
			this.X();
		} else {
			this.U = false;
		}

		return this.U;
	}

	protected void al() {
		sn sn2 = this.aL() && this.bw() != null ? this.bw() : this;
		float float3 = sn2 == this ? 0.2F : 0.9F;
		float float4 = ot.a(sn2.s * sn2.s * 0.2F + sn2.t * sn2.t + sn2.u * sn2.u * 0.2F) * float3;
		if (float4 > 1.0F) {
			float4 = 1.0F;
		}

		this.a(this.ab(), float4, 1.0F + (this.S.nextFloat() - this.S.nextFloat()) * 0.4F);
		float float5 = (float)ot.c(this.bo().b);

		for (int integer6 = 0; (float)integer6 < 1.0F + this.G * 20.0F; integer6++) {
			float float7 = (this.S.nextFloat() * 2.0F - 1.0F) * this.G;
			float float8 = (this.S.nextFloat() * 2.0F - 1.0F) * this.G;
			this.l
				.a(de.WATER_BUBBLE, this.p + (double)float7, (double)(float5 + 1.0F), this.r + (double)float8, this.s, this.t - (double)(this.S.nextFloat() * 0.2F), this.u);
		}

		for (int integer6 = 0; (float)integer6 < 1.0F + this.G * 20.0F; integer6++) {
			float float7 = (this.S.nextFloat() * 2.0F - 1.0F) * this.G;
			float float8 = (this.S.nextFloat() * 2.0F - 1.0F) * this.G;
			this.l.a(de.WATER_SPLASH, this.p + (double)float7, (double)(float5 + 1.0F), this.r + (double)float8, this.s, this.t, this.u);
		}
	}

	public void am() {
		if (this.aN() && !this.aj()) {
			this.an();
		}
	}

	protected void an() {
		int integer2 = ot.c(this.p);
		int integer3 = ot.c(this.q - 0.2F);
		int integer4 = ot.c(this.r);
		co co5 = new co(integer2, integer3, integer4);
		atl atl6 = this.l.o(co5);
		if (atl6.j() != aqf.INVISIBLE) {
			this.l
				.a(
					de.BLOCK_CRACK,
					this.p + ((double)this.S.nextFloat() - 0.5) * (double)this.G,
					this.bo().b + 0.1,
					this.r + ((double)this.S.nextFloat() - 0.5) * (double)this.G,
					-this.s * 4.0,
					1.5,
					-this.u * 4.0,
					alu.j(atl6)
				);
		}
	}

	public boolean a(azs azs) {
		if (this.bB() instanceof abx) {
			return false;
		} else {
			double double3 = this.q + (double)this.bq();
			co co5 = new co(this.p, double3, this.r);
			atl atl6 = this.l.o(co5);
			if (atl6.a() == azs) {
				float float7 = aoq.e(atl6.v().e(atl6)) - 0.11111111F;
				float float8 = (float)(co5.q() + 1) - float7;
				boolean boolean9 = double3 < (double)float8;
				return !boolean9 && this instanceof aay ? false : boolean9;
			} else {
				return false;
			}
		}
	}

	public boolean ao() {
		return this.l.a(this.bo().c(-0.1F, -0.4F, -0.1F), azs.i);
	}

	public void a(float float1, float float2, float float3) {
		float float5 = float1 * float1 + float2 * float2;
		if (!(float5 < 1.0E-4F)) {
			float5 = ot.c(float5);
			if (float5 < 1.0F) {
				float5 = 1.0F;
			}

			float5 = float3 / float5;
			float1 *= float5;
			float2 *= float5;
			float float6 = ot.a(this.v * (float) (Math.PI / 180.0));
			float float7 = ot.b(this.v * (float) (Math.PI / 180.0));
			this.s += (double)(float1 * float7 - float2 * float6);
			this.u += (double)(float2 * float7 + float1 * float6);
		}
	}

	public int d(float float1) {
		co.a a3 = new co.a(ot.c(this.p), 0, ot.c(this.r));
		if (this.l.e(a3)) {
			a3.p(ot.c(this.q + (double)this.bq()));
			return this.l.b(a3, 0);
		} else {
			return 0;
		}
	}

	public float e(float float1) {
		co.a a3 = new co.a(ot.c(this.p), 0, ot.c(this.r));
		if (this.l.e(a3)) {
			a3.p(ot.c(this.q + (double)this.bq()));
			return this.l.n(a3);
		} else {
			return 0.0F;
		}
	}

	public void a(ajs ajs) {
		this.l = ajs;
	}

	public void a(double double1, double double2, double double3, float float4, float float5) {
		this.p = ot.a(double1, -3.0E7, 3.0E7);
		this.q = double2;
		this.r = ot.a(double3, -3.0E7, 3.0E7);
		this.m = this.p;
		this.n = this.q;
		this.o = this.r;
		float5 = ot.a(float5, -90.0F, 90.0F);
		this.v = float4;
		this.w = float5;
		this.x = this.v;
		this.y = this.w;
		double double10 = (double)(this.x - float4);
		if (double10 < -180.0) {
			this.x += 360.0F;
		}

		if (double10 >= 180.0) {
			this.x -= 360.0F;
		}

		this.b(this.p, this.q, this.r);
		this.b(float4, float5);
	}

	public void a(co co, float float2, float float3) {
		this.b((double)co.p() + 0.5, (double)co.q(), (double)co.r() + 0.5, float2, float3);
	}

	public void b(double double1, double double2, double double3, float float4, float float5) {
		this.p = double1;
		this.q = double2;
		this.r = double3;
		this.m = this.p;
		this.n = this.q;
		this.o = this.r;
		this.M = this.p;
		this.N = this.q;
		this.O = this.r;
		this.v = float4;
		this.w = float5;
		this.b(this.p, this.q, this.r);
	}

	public float g(sn sn) {
		float float3 = (float)(this.p - sn.p);
		float float4 = (float)(this.q - sn.q);
		float float5 = (float)(this.r - sn.r);
		return ot.c(float3 * float3 + float4 * float4 + float5 * float5);
	}

	public double d(double double1, double double2, double double3) {
		double double8 = this.p - double1;
		double double10 = this.q - double2;
		double double12 = this.r - double3;
		return double8 * double8 + double10 * double10 + double12 * double12;
	}

	public double c(co co) {
		return co.f(this.p, this.q, this.r);
	}

	public double d(co co) {
		return co.g(this.p, this.q, this.r);
	}

	public double e(double double1, double double2, double double3) {
		double double8 = this.p - double1;
		double double10 = this.q - double2;
		double double12 = this.r - double3;
		return (double)ot.a(double8 * double8 + double10 * double10 + double12 * double12);
	}

	public double h(sn sn) {
		double double3 = this.p - sn.p;
		double double5 = this.q - sn.q;
		double double7 = this.r - sn.r;
		return double3 * double3 + double5 * double5 + double7 * double7;
	}

	public void d(aay aay) {
	}

	public void i(sn sn) {
		if (!this.x(sn)) {
			if (!sn.Q && !this.Q) {
				double double3 = sn.p - this.p;
				double double5 = sn.r - this.r;
				double double7 = ot.a(double3, double5);
				if (double7 >= 0.01F) {
					double7 = (double)ot.a(double7);
					double3 /= double7;
					double5 /= double7;
					double double9 = 1.0 / double7;
					if (double9 > 1.0) {
						double9 = 1.0;
					}

					double3 *= double9;
					double5 *= double9;
					double3 *= 0.05F;
					double5 *= 0.05F;
					double3 *= (double)(1.0F - this.R);
					double5 *= (double)(1.0F - this.R);
					if (!this.aL()) {
						this.f(-double3, 0.0, -double5);
					}

					if (!sn.aL()) {
						sn.f(double3, 0.0, double5);
					}
				}
			}
		}
	}

	public void f(double double1, double double2, double double3) {
		this.s += double1;
		this.t += double2;
		this.u += double3;
		this.ai = true;
	}

	protected void ap() {
		this.D = true;
	}

	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			this.ap();
			return false;
		}
	}

	public bdw f(float float1) {
		if (float1 == 1.0F) {
			return this.f(this.w, this.v);
		} else {
			float float3 = this.y + (this.w - this.y) * float1;
			float float4 = this.x + (this.v - this.x) * float1;
			return this.f(float3, float4);
		}
	}

	protected final bdw f(float float1, float float2) {
		float float4 = ot.b(-float2 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float5 = ot.a(-float2 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float6 = -ot.b(-float1 * (float) (Math.PI / 180.0));
		float float7 = ot.a(-float1 * (float) (Math.PI / 180.0));
		return new bdw((double)(float5 * float6), (double)float7, (double)(float4 * float6));
	}

	public bdw g(float float1) {
		if (float1 == 1.0F) {
			return new bdw(this.p, this.q + (double)this.bq(), this.r);
		} else {
			double double3 = this.m + (this.p - this.m) * (double)float1;
			double double5 = this.n + (this.q - this.n) * (double)float1 + (double)this.bq();
			double double7 = this.o + (this.r - this.o) * (double)float1;
			return new bdw(double3, double5, double7);
		}
	}

	@Nullable
	public bdu a(double double1, float float2) {
		bdw bdw5 = this.g(float2);
		bdw bdw6 = this.f(float2);
		bdw bdw7 = bdw5.b(bdw6.b * double1, bdw6.c * double1, bdw6.d * double1);
		return this.l.a(bdw5, bdw7, false, false, true);
	}

	public boolean aq() {
		return false;
	}

	public boolean ar() {
		return false;
	}

	public void b(sn sn, int integer) {
	}

	public boolean g(double double1, double double2, double double3) {
		double double8 = this.p - double1;
		double double10 = this.q - double2;
		double double12 = this.r - double3;
		double double14 = double8 * double8 + double10 * double10 + double12 * double12;
		return this.a(double14);
	}

	public boolean a(double double1) {
		double double4 = this.bo().a();
		if (Double.isNaN(double4)) {
			double4 = 1.0;
		}

		double4 *= 64.0 * f;
		return double1 < double4 * double4;
	}

	public boolean c(du du) {
		String string3 = this.at();
		if (!this.F && string3 != null) {
			du.a("id", string3);
			this.e(du);
			return true;
		} else {
			return false;
		}
	}

	public boolean d(du du) {
		String string3 = this.at();
		if (!this.F && string3 != null && !this.aK()) {
			du.a("id", string3);
			this.e(du);
			return true;
		} else {
			return false;
		}
	}

	public static void b(ph ph) {
		ph.a(pf.ENTITY, new pj() {
			@Override
			public du a(pg pg, du du, int integer) {
				if (du.b("Passengers", 9)) {
					ea ea5 = du.c("Passengers", 10);

					for (int integer6 = 0; integer6 < ea5.c(); integer6++) {
						ea5.a(integer6, pg.a(pf.ENTITY, ea5.b(integer6), integer));
					}
				}

				return du;
			}
		});
	}

	public du e(du du) {
		try {
			du.a("Pos", this.a(this.p, this.q, this.r));
			du.a("Motion", this.a(this.s, this.t, this.u));
			du.a("Rotation", this.a(this.v, this.w));
			du.a("FallDistance", this.L);
			du.a("Fire", (short)this.ay);
			du.a("Air", (short)this.aR());
			du.a("OnGround", this.z);
			du.a("Dimension", this.am);
			du.a("Invulnerable", this.aE);
			du.a("PortalCooldown", this.aj);
			du.a("UUID", this.be());
			if (this.n_()) {
				du.a("CustomName", this.bi());
			}

			if (this.bj()) {
				du.a("CustomNameVisible", this.bj());
			}

			this.aF.b(du);
			if (this.ad()) {
				du.a("Silent", this.ad());
			}

			if (this.ae()) {
				du.a("NoGravity", this.ae());
			}

			if (this.as) {
				du.a("Glowing", this.as);
			}

			if (this.aG.size() > 0) {
				ea ea3 = new ea();

				for (String string5 : this.aG) {
					ea3.a(new eh(string5));
				}

				du.a("Tags", ea3);
			}

			this.b(du);
			if (this.aL()) {
				ea ea3 = new ea();

				for (sn sn5 : this.bx()) {
					du du6 = new du();
					if (sn5.c(du6)) {
						ea3.a(du6);
					}
				}

				if (!ea3.b_()) {
					du.a("Passengers", ea3);
				}
			}

			return du;
		} catch (Throwable var6) {
			b b4 = b.a(var6, "Saving entity NBT");
			c c5 = b4.a("Entity being saved");
			this.a(c5);
			throw new f(b4);
		}
	}

	public void f(du du) {
		try {
			ea ea3 = du.c("Pos", 6);
			ea ea4 = du.c("Motion", 6);
			ea ea5 = du.c("Rotation", 5);
			this.s = ea4.e(0);
			this.t = ea4.e(1);
			this.u = ea4.e(2);
			if (Math.abs(this.s) > 10.0) {
				this.s = 0.0;
			}

			if (Math.abs(this.t) > 10.0) {
				this.t = 0.0;
			}

			if (Math.abs(this.u) > 10.0) {
				this.u = 0.0;
			}

			this.p = ea3.e(0);
			this.q = ea3.e(1);
			this.r = ea3.e(2);
			this.M = this.p;
			this.N = this.q;
			this.O = this.r;
			this.m = this.p;
			this.n = this.q;
			this.o = this.r;
			this.v = ea5.f(0);
			this.w = ea5.f(1);
			this.x = this.v;
			this.y = this.w;
			this.h(this.v);
			this.i(this.v);
			this.L = du.j("FallDistance");
			this.ay = du.g("Fire");
			this.l(du.g("Air"));
			this.z = du.p("OnGround");
			if (du.e("Dimension")) {
				this.am = du.h("Dimension");
			}

			this.aE = du.p("Invulnerable");
			this.aj = du.h("PortalCooldown");
			if (du.b("UUID")) {
				this.aq = du.a("UUID");
				this.ar = this.aq.toString();
			}

			this.b(this.p, this.q, this.r);
			this.b(this.v, this.w);
			if (du.b("CustomName", 8)) {
				this.c(du.l("CustomName"));
			}

			this.j(du.p("CustomNameVisible"));
			this.aF.a(du);
			this.c(du.p("Silent"));
			this.d(du.p("NoGravity"));
			this.g(du.p("Glowing"));
			if (du.b("Tags", 9)) {
				this.aG.clear();
				ea ea6 = du.c("Tags", 8);
				int integer7 = Math.min(ea6.c(), 1024);

				for (int integer8 = 0; integer8 < integer7; integer8++) {
					this.aG.add(ea6.g(integer8));
				}
			}

			this.a(du);
			if (this.as()) {
				this.b(this.p, this.q, this.r);
			}
		} catch (Throwable var8) {
			b b4 = b.a(var8, "Loading entity NBT");
			c c5 = b4.a("Entity being loaded");
			this.a(c5);
			throw new f(b4);
		}
	}

	protected boolean as() {
		return true;
	}

	@Nullable
	protected final String at() {
		kq kq2 = sp.a(this);
		return kq2 == null ? null : kq2.toString();
	}

	protected abstract void a(du du);

	protected abstract void b(du du);

	protected ea a(double... arr) {
		ea ea3 = new ea();

		for (double double7 : arr) {
			ea3.a(new dv(double7));
		}

		return ea3;
	}

	protected ea a(float... arr) {
		ea ea3 = new ea();

		for (float float7 : arr) {
			ea3.a(new dx(float7));
		}

		return ea3;
	}

	@Nullable
	public zj a(afh afh, int integer) {
		return this.a(afh, integer, 0.0F);
	}

	@Nullable
	public zj a(afh afh, int integer, float float3) {
		return this.a(new afj(afh, integer, 0), float3);
	}

	@Nullable
	public zj a(afj afj, float float2) {
		if (afj.b()) {
			return null;
		} else {
			zj zj4 = new zj(this.l, this.p, this.q + (double)float2, this.r, afj);
			zj4.q();
			this.l.a(zj4);
			return zj4;
		}
	}

	public boolean au() {
		return !this.F;
	}

	public boolean av() {
		if (this.Q) {
			return false;
		} else {
			co.b b2 = co.b.s();

			for (int integer3 = 0; integer3 < 8; integer3++) {
				int integer4 = ot.c(this.q + (double)(((float)((integer3 >> 0) % 2) - 0.5F) * 0.1F) + (double)this.bq());
				int integer5 = ot.c(this.p + (double)(((float)((integer3 >> 1) % 2) - 0.5F) * this.G * 0.8F));
				int integer6 = ot.c(this.r + (double)(((float)((integer3 >> 2) % 2) - 0.5F) * this.G * 0.8F));
				if (b2.p() != integer5 || b2.q() != integer4 || b2.r() != integer6) {
					b2.f(integer5, integer4, integer6);
					if (this.l.o(b2).s()) {
						b2.t();
						return true;
					}
				}
			}

			b2.t();
			return false;
		}
	}

	public boolean b(aay aay, ri ri) {
		return false;
	}

	@Nullable
	public bdt j(sn sn) {
		return null;
	}

	public void aw() {
		sn sn2 = this.bB();
		if (this.aK() && sn2.F) {
			this.p();
		} else {
			this.s = 0.0;
			this.t = 0.0;
			this.u = 0.0;
			this.A_();
			if (this.aK()) {
				sn2.k(this);
			}
		}
	}

	public void k(sn sn) {
		if (this.w(sn)) {
			sn.b(this.p, this.q + this.ay() + sn.ax(), this.r);
		}
	}

	public void l(sn sn) {
	}

	public double ax() {
		return 0.0;
	}

	public double ay() {
		return (double)this.H * 0.75;
	}

	public boolean m(sn sn) {
		return this.a(sn, false);
	}

	public boolean a(sn sn, boolean boolean2) {
		for (sn sn4 = sn; sn4.au != null; sn4 = sn4.au) {
			if (sn4.au == this) {
				return false;
			}
		}

		if (boolean2 || this.n(sn) && sn.q(this)) {
			if (this.aK()) {
				this.p();
			}

			this.au = sn;
			this.au.o(this);
			return true;
		} else {
			return false;
		}
	}

	protected boolean n(sn sn) {
		return this.j <= 0;
	}

	public void az() {
		for (int integer2 = this.at.size() - 1; integer2 >= 0; integer2--) {
			((sn)this.at.get(integer2)).p();
		}
	}

	public void p() {
		if (this.au != null) {
			sn sn2 = this.au;
			this.au = null;
			sn2.p(this);
		}
	}

	protected void o(sn sn) {
		if (sn.bB() != this) {
			throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
		} else {
			if (!this.l.E && sn instanceof aay && !(this.bw() instanceof aay)) {
				this.at.add(0, sn);
			} else {
				this.at.add(sn);
			}
		}
	}

	protected void p(sn sn) {
		if (sn.bB() == this) {
			throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
		} else {
			this.at.remove(sn);
			sn.j = 60;
		}
	}

	protected boolean q(sn sn) {
		return this.bx().size() < 1;
	}

	public void a(double double1, double double2, double double3, float float4, float float5, int integer, boolean boolean7) {
		this.b(double1, double2, double3);
		this.b(float4, float5);
	}

	public float aA() {
		return 0.0F;
	}

	public bdw aB() {
		return null;
	}

	public bdv aC() {
		return new bdv(this.w, this.v);
	}

	public bdw aD() {
		return bdw.a(this.aC());
	}

	public void e(co co) {
		if (this.aj > 0) {
			this.aj = this.aE();
		} else {
			if (!this.l.E && !co.equals(this.an)) {
				this.an = new co(co);
				atp.b b3 = alv.aY.c(this.l, this.an);
				double double4 = b3.b().k() == cv.a.X ? (double)b3.a().r() : (double)b3.a().p();
				double double6 = b3.b().k() == cv.a.X ? this.r : this.p;
				double6 = Math.abs(ot.c(double6 - (double)(b3.b().e().c() == cv.b.NEGATIVE ? 1 : 0), double4, double4 - (double)b3.d()));
				double double8 = ot.c(this.q - 1.0, (double)b3.a().q(), (double)(b3.a().q() - b3.e()));
				this.ao = new bdw(double6, double8, 0.0);
				this.ap = b3.b();
			}

			this.ak = true;
		}
	}

	public int aE() {
		return 300;
	}

	public void h(double double1, double double2, double double3) {
		this.s = double1;
		this.t = double2;
		this.u = double3;
	}

	public void a(byte byte1) {
	}

	public void aF() {
	}

	public Iterable<afj> aG() {
		return b;
	}

	public Iterable<afj> aH() {
		return b;
	}

	public Iterable<afj> aI() {
		return Iterables.concat(this.aG(), this.aH());
	}

	public void a(ss ss, afj afj) {
	}

	public boolean aJ() {
		boolean boolean2 = this.l != null && this.l.E;
		return !this.X && (this.ay > 0 || boolean2 && this.k(0));
	}

	public boolean aK() {
		return this.bB() != null;
	}

	public boolean aL() {
		return !this.bx().isEmpty();
	}

	public boolean aM() {
		return this.k(1);
	}

	public void e(boolean boolean1) {
		this.b(1, boolean1);
	}

	public boolean aN() {
		return this.k(3);
	}

	public void f(boolean boolean1) {
		this.b(3, boolean1);
	}

	public boolean aO() {
		return this.as || this.l.E && this.k(6);
	}

	public void g(boolean boolean1) {
		this.as = boolean1;
		if (!this.l.E) {
			this.b(6, this.as);
		}
	}

	public boolean aP() {
		return this.k(5);
	}

	public boolean e(aay aay) {
		if (aay.y()) {
			return false;
		} else {
			bee bee3 = this.aQ();
			return bee3 != null && aay != null && aay.aQ() == bee3 && bee3.h() ? false : this.aP();
		}
	}

	@Nullable
	public bee aQ() {
		return this.l.ad().g(this.bf());
	}

	public boolean r(sn sn) {
		return this.a(sn.aQ());
	}

	public boolean a(bee bee) {
		return this.aQ() != null ? this.aQ().a(bee) : false;
	}

	public void h(boolean boolean1) {
		this.b(5, boolean1);
	}

	protected boolean k(int integer) {
		return (this.Y.a(Z) & 1 << integer) != 0;
	}

	protected void b(int integer, boolean boolean2) {
		byte byte4 = this.Y.a(Z);
		if (boolean2) {
			this.Y.b(Z, (byte)(byte4 | 1 << integer));
		} else {
			this.Y.b(Z, (byte)(byte4 & ~(1 << integer)));
		}
	}

	public int aR() {
		return this.Y.a(az);
	}

	public void l(int integer) {
		this.Y.b(az, integer);
	}

	public void a(zg zg) {
		this.a(ry.b, 5.0F);
		this.ay++;
		if (this.ay == 0) {
			this.i(8);
		}
	}

	public void b(sw sw) {
	}

	protected boolean i(double double1, double double2, double double3) {
		co co8 = new co(double1, double2, double3);
		double double9 = double1 - (double)co8.p();
		double double11 = double2 - (double)co8.q();
		double double13 = double3 - (double)co8.r();
		if (!this.l.a(this.bo())) {
			return false;
		} else {
			cv cv15 = cv.UP;
			double double16 = Double.MAX_VALUE;
			if (!this.l.t(co8.e()) && double9 < double16) {
				double16 = double9;
				cv15 = cv.WEST;
			}

			if (!this.l.t(co8.f()) && 1.0 - double9 < double16) {
				double16 = 1.0 - double9;
				cv15 = cv.EAST;
			}

			if (!this.l.t(co8.c()) && double13 < double16) {
				double16 = double13;
				cv15 = cv.NORTH;
			}

			if (!this.l.t(co8.d()) && 1.0 - double13 < double16) {
				double16 = 1.0 - double13;
				cv15 = cv.SOUTH;
			}

			if (!this.l.t(co8.a()) && 1.0 - double11 < double16) {
				double16 = 1.0 - double11;
				cv15 = cv.UP;
			}

			float float18 = this.S.nextFloat() * 0.2F + 0.1F;
			float float19 = (float)cv15.c().a();
			if (cv15.k() == cv.a.X) {
				this.s = (double)(float19 * float18);
				this.t *= 0.75;
				this.u *= 0.75;
			} else if (cv15.k() == cv.a.Y) {
				this.s *= 0.75;
				this.t = (double)(float19 * float18);
				this.u *= 0.75;
			} else if (cv15.k() == cv.a.Z) {
				this.s *= 0.75;
				this.t *= 0.75;
				this.u = (double)(float19 * float18);
			}

			return true;
		}
	}

	public void aS() {
		this.E = true;
		this.L = 0.0F;
	}

	@Override
	public String h_() {
		if (this.n_()) {
			return this.bi();
		} else {
			String string2 = sp.b(this);
			if (string2 == null) {
				string2 = "generic";
			}

			return dp.a("entity." + string2 + ".name");
		}
	}

	@Nullable
	public sn[] aT() {
		return null;
	}

	public boolean s(sn sn) {
		return this == sn;
	}

	public float aU() {
		return 0.0F;
	}

	public void h(float float1) {
	}

	public void i(float float1) {
	}

	public boolean aV() {
		return true;
	}

	public boolean t(sn sn) {
		return false;
	}

	public String toString() {
		return String.format(
			"%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
			this.getClass().getSimpleName(),
			this.h_(),
			this.h,
			this.l == null ? "~NULL~" : this.l.T().j(),
			this.p,
			this.q,
			this.r
		);
	}

	public boolean b(ry ry) {
		return this.aE && ry != ry.m && !ry.u();
	}

	public boolean aW() {
		return this.aE;
	}

	public void i(boolean boolean1) {
		this.aE = boolean1;
	}

	public void u(sn sn) {
		this.b(sn.p, sn.q, sn.r, sn.v, sn.w);
	}

	private void a(sn sn) {
		du du3 = sn.e(new du());
		du3.q("Dimension");
		this.f(du3);
		this.aj = sn.aj;
		this.an = sn.an;
		this.ao = sn.ao;
		this.ap = sn.ap;
	}

	@Nullable
	public sn c(int integer) {
		if (!this.l.E && !this.F) {
			this.l.C.a("changeDimension");
			MinecraftServer minecraftServer3 = this.B_();
			int integer4 = this.am;
			lw lw5 = minecraftServer3.a(integer4);
			lw lw6 = minecraftServer3.a(integer);
			this.am = integer;
			if (integer4 == 1 && integer == 1) {
				lw6 = minecraftServer3.a(0);
				this.am = 0;
			}

			this.l.e(this);
			this.F = false;
			this.l.C.a("reposition");
			co co7;
			if (integer == 1) {
				co7 = lw6.p();
			} else {
				double double8 = this.p;
				double double10 = this.r;
				double double12 = 8.0;
				if (integer == -1) {
					double8 = ot.a(double8 / 8.0, lw6.aj().b() + 16.0, lw6.aj().d() - 16.0);
					double10 = ot.a(double10 / 8.0, lw6.aj().c() + 16.0, lw6.aj().e() - 16.0);
				} else if (integer == 0) {
					double8 = ot.a(double8 * 8.0, lw6.aj().b() + 16.0, lw6.aj().d() - 16.0);
					double10 = ot.a(double10 * 8.0, lw6.aj().c() + 16.0, lw6.aj().e() - 16.0);
				}

				double8 = (double)ot.a((int)double8, -29999872, 29999872);
				double10 = (double)ot.a((int)double10, -29999872, 29999872);
				float float14 = this.v;
				this.b(double8, this.q, double10, 90.0F, 0.0F);
				aka aka15 = lw6.x();
				aka15.b(this, float14);
				co7 = new co(this);
			}

			lw5.a(this, false);
			this.l.C.c("reloading");
			sn sn8 = sp.a(this.getClass(), lw6);
			if (sn8 != null) {
				sn8.a(this);
				if (integer4 == 1 && integer == 1) {
					co co9 = lw6.q(lw6.R());
					sn8.a(co9, sn8.v, sn8.w);
				} else {
					sn8.a(co7, sn8.v, sn8.w);
				}

				boolean boolean9 = sn8.k;
				sn8.k = true;
				lw6.a(sn8);
				sn8.k = boolean9;
				lw6.a(sn8, false);
			}

			this.F = true;
			this.l.C.b();
			lw5.m();
			lw6.m();
			this.l.C.b();
			return sn8;
		} else {
			return null;
		}
	}

	public boolean aX() {
		return true;
	}

	public float a(ajn ajn, ajs ajs, co co, atl atl) {
		return atl.v().a(this);
	}

	public boolean a(ajn ajn, ajs ajs, co co, atl atl, float float5) {
		return true;
	}

	public int aY() {
		return 3;
	}

	public bdw ba() {
		return this.ao;
	}

	public cv bb() {
		return this.ap;
	}

	public boolean bc() {
		return false;
	}

	public void a(c c) {
		c.a("Entity Type", new d<String>() {
			public String call() throws Exception {
				return sp.a(sn.this) + " (" + sn.this.getClass().getCanonicalName() + ")";
			}
		});
		c.a("Entity ID", this.h);
		c.a("Entity Name", new d<String>() {
			public String call() throws Exception {
				return sn.this.h_();
			}
		});
		c.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", this.p, this.q, this.r));
		c.a("Entity's Block location", c.a(ot.c(this.p), ot.c(this.q), ot.c(this.r)));
		c.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", this.s, this.t, this.u));
		c.a("Entity's Passengers", new d<String>() {
			public String call() throws Exception {
				return sn.this.bx().toString();
			}
		});
		c.a("Entity's Vehicle", new d<String>() {
			public String call() throws Exception {
				return sn.this.bB().toString();
			}
		});
	}

	public boolean bd() {
		return this.aJ();
	}

	public void a(UUID uUID) {
		this.aq = uUID;
		this.ar = this.aq.toString();
	}

	public UUID be() {
		return this.aq;
	}

	public String bf() {
		return this.ar;
	}

	public boolean bg() {
		return true;
	}

	public static double bh() {
		return f;
	}

	public static void b(double double1) {
		f = double1;
	}

	@Override
	public fb i_() {
		fh fh2 = new fh(bdz.a(this.aQ(), this.h_()));
		fh2.b().a(this.bn());
		fh2.b().a(this.bf());
		return fh2;
	}

	public void c(String string) {
		this.Y.b(aA, string);
	}

	public String bi() {
		return this.Y.a(aA);
	}

	public boolean n_() {
		return !this.Y.a(aA).isEmpty();
	}

	public void j(boolean boolean1) {
		this.Y.b(aB, boolean1);
	}

	public boolean bj() {
		return this.Y.a(aB);
	}

	public void a(double double1, double double2, double double3) {
		this.aH = true;
		this.b(double1, double2, double3, this.v, this.w);
		this.l.a(this, false);
	}

	public boolean bk() {
		return this.bj();
	}

	public void a(kk<?> kk) {
	}

	public cv bl() {
		return cv.b(ot.c((double)(this.v * 4.0F / 360.0F) + 0.5) & 3);
	}

	public cv bm() {
		return this.bl();
	}

	protected fd bn() {
		du du2 = new du();
		kq kq3 = sp.a(this);
		du2.a("id", this.bf());
		if (kq3 != null) {
			du2.a("type", kq3.toString());
		}

		du2.a("name", this.h_());
		return new fd(fd.a.SHOW_ENTITY, new fh(du2.toString()));
	}

	public boolean a(ly ly) {
		return true;
	}

	public bdt bo() {
		return this.av;
	}

	public bdt bp() {
		return this.bo();
	}

	public void a(bdt bdt) {
		this.av = bdt;
	}

	public float bq() {
		return this.H * 0.85F;
	}

	public boolean br() {
		return this.aw;
	}

	public void k(boolean boolean1) {
		this.aw = boolean1;
	}

	public boolean c(int integer, afj afj) {
		return false;
	}

	@Override
	public void a(fb fb) {
	}

	@Override
	public boolean a(int integer, String string) {
		return true;
	}

	@Override
	public co c() {
		return new co(this.p, this.q + 0.5, this.r);
	}

	@Override
	public bdw d() {
		return new bdw(this.p, this.q, this.r);
	}

	@Override
	public ajs e() {
		return this.l;
	}

	@Override
	public sn f() {
		return this;
	}

	@Override
	public boolean g() {
		return false;
	}

	@Override
	public void a(o.a a, int integer) {
		if (this.l != null && !this.l.E) {
			this.aF.a(this.l.u(), this, a, integer);
		}
	}

	@Nullable
	@Override
	public MinecraftServer B_() {
		return this.l.u();
	}

	public o bs() {
		return this.aF;
	}

	public void v(sn sn) {
		this.aF.a(sn.bs());
	}

	public rk a(aay aay, bdw bdw, ri ri) {
		return rk.PASS;
	}

	public boolean bt() {
		return false;
	}

	protected void a(sw sw, sn sn) {
		if (sn instanceof sw) {
			aik.a((sw)sn, sw);
		}

		aik.b(sw, sn);
	}

	public void b(ly ly) {
	}

	public void c(ly ly) {
	}

	public float a(aqi aqi) {
		float float3 = ot.g(this.v);
		switch (aqi) {
			case CLOCKWISE_180:
				return float3 + 180.0F;
			case COUNTERCLOCKWISE_90:
				return float3 + 270.0F;
			case CLOCKWISE_90:
				return float3 + 90.0F;
			default:
				return float3;
		}
	}

	public float a(aou aou) {
		float float3 = ot.g(this.v);
		switch (aou) {
			case LEFT_RIGHT:
				return -float3;
			case FRONT_BACK:
				return 180.0F - float3;
			default:
				return float3;
		}
	}

	public boolean bu() {
		return false;
	}

	public boolean bv() {
		boolean boolean2 = this.aH;
		this.aH = false;
		return boolean2;
	}

	@Nullable
	public sn bw() {
		return null;
	}

	public List<sn> bx() {
		return (List<sn>)(this.at.isEmpty() ? Collections.emptyList() : Lists.newArrayList(this.at));
	}

	public boolean w(sn sn) {
		for (sn sn4 : this.bx()) {
			if (sn4.equals(sn)) {
				return true;
			}
		}

		return false;
	}

	public Collection<sn> by() {
		Set<sn> set2 = Sets.newHashSet();
		this.a(sn.class, set2);
		return set2;
	}

	public <T extends sn> Collection<T> b(Class<T> class1) {
		Set<T> set3 = Sets.newHashSet();
		this.a(class1, set3);
		return set3;
	}

	private <T extends sn> void a(Class<T> class1, Set<T> set) {
		for (sn sn5 : this.bx()) {
			if (class1.isAssignableFrom(sn5.getClass())) {
				set.add(sn5);
			}

			sn5.a(class1, set);
		}
	}

	public sn bz() {
		sn sn2 = this;

		while (sn2.aK()) {
			sn2 = sn2.bB();
		}

		return sn2;
	}

	public boolean x(sn sn) {
		return this.bz() == sn.bz();
	}

	public boolean y(sn sn) {
		for (sn sn4 : this.bx()) {
			if (sn4.equals(sn)) {
				return true;
			}

			if (sn4.y(sn)) {
				return true;
			}
		}

		return false;
	}

	public boolean bA() {
		sn sn2 = this.bw();
		return sn2 instanceof aay ? ((aay)sn2).cR() : !this.l.E;
	}

	@Nullable
	public sn bB() {
		return this.au;
	}

	public azv o_() {
		return azv.NORMAL;
	}

	public no bC() {
		return no.NEUTRAL;
	}

	protected int bD() {
		return 1;
	}
}

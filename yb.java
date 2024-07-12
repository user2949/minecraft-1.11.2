import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class yb extends sx implements xy, zt {
	private static final Logger bI = LogManager.getLogger();
	public static final kk<Integer> a = kn.a(yb.class, km.b);
	public double[][] b = new double[64][3];
	public int c = -1;
	public xz[] bu;
	public xz bv;
	public xz bw;
	public xz bx;
	public xz by;
	public xz bz;
	public xz bA;
	public xz bB;
	public xz bC;
	public float bD;
	public float bE;
	public boolean bF;
	public int bG;
	public ya bH;
	private final avk bJ;
	private final ys bK;
	private int bL = 200;
	private int bM;
	private final bbb[] bN = new bbb[24];
	private final int[] bO = new int[24];
	private final baz bP = new baz();

	public yb(ajs ajs) {
		super(ajs);
		this.bv = new xz(this, "head", 6.0F, 6.0F);
		this.bw = new xz(this, "neck", 6.0F, 6.0F);
		this.bx = new xz(this, "body", 8.0F, 8.0F);
		this.by = new xz(this, "tail", 4.0F, 4.0F);
		this.bz = new xz(this, "tail", 4.0F, 4.0F);
		this.bA = new xz(this, "tail", 4.0F, 4.0F);
		this.bB = new xz(this, "wing", 4.0F, 4.0F);
		this.bC = new xz(this, "wing", 4.0F, 4.0F);
		this.bu = new xz[]{this.bv, this.bw, this.bx, this.by, this.bz, this.bA, this.bB, this.bC};
		this.c(this.cb());
		this.a(16.0F, 8.0F);
		this.Q = true;
		this.X = true;
		this.bL = 100;
		this.ah = true;
		if (!ajs.E && ajs.s instanceof avl) {
			this.bJ = ((avl)ajs.s).t();
		} else {
			this.bJ = null;
		}

		this.bK = new ys(this);
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(200.0);
	}

	@Override
	protected void i() {
		super.i();
		this.R().a(a, yr.k.b());
	}

	public double[] a(int integer, float float2) {
		if (this.bU() <= 0.0F) {
			float2 = 0.0F;
		}

		float2 = 1.0F - float2;
		int integer4 = this.c - integer & 63;
		int integer5 = this.c - integer - 1 & 63;
		double[] arr6 = new double[3];
		double double7 = this.b[integer4][0];
		double double9 = ot.g(this.b[integer5][0] - double7);
		arr6[0] = double7 + double9 * (double)float2;
		double7 = this.b[integer4][1];
		double9 = this.b[integer5][1] - double7;
		arr6[1] = double7 + double9 * (double)float2;
		arr6[2] = this.b[integer4][2] + (this.b[integer5][2] - this.b[integer4][2]) * (double)float2;
		return arr6;
	}

	@Override
	public void n() {
		if (this.l.E) {
			this.c(this.bU());
			if (!this.ad()) {
				float float2 = ot.b(this.bE * (float) (Math.PI * 2));
				float float3 = ot.b(this.bD * (float) (Math.PI * 2));
				if (float3 <= -0.3F && float2 >= -0.3F) {
					this.l.a(this.p, this.q, this.r, nn.aU, this.bC(), 5.0F, 0.8F + this.S.nextFloat() * 0.3F, false);
				}

				if (!this.bK.a().a() && --this.bL < 0) {
					this.l.a(this.p, this.q, this.r, nn.aV, this.bC(), 2.5F, 0.8F + this.S.nextFloat() * 0.3F, false);
					this.bL = 200 + this.S.nextInt(200);
				}
			}
		}

		this.bD = this.bE;
		if (this.bU() <= 0.0F) {
			float float2x = (this.S.nextFloat() - 0.5F) * 8.0F;
			float float3x = (this.S.nextFloat() - 0.5F) * 4.0F;
			float float4 = (this.S.nextFloat() - 0.5F) * 8.0F;
			this.l.a(de.EXPLOSION_LARGE, this.p + (double)float2x, this.q + 2.0 + (double)float3x, this.r + (double)float4, 0.0, 0.0, 0.0);
		} else {
			this.dc();
			float float2x = 0.2F / (ot.a(this.s * this.s + this.u * this.u) * 10.0F + 1.0F);
			float2x *= (float)Math.pow(2.0, this.t);
			if (this.bK.a().a()) {
				this.bE += 0.1F;
			} else if (this.bF) {
				this.bE += float2x * 0.5F;
			} else {
				this.bE += float2x;
			}

			this.v = ot.g(this.v);
			if (this.cY()) {
				this.bE = 0.5F;
			} else {
				if (this.c < 0) {
					for (int integer3 = 0; integer3 < this.b.length; integer3++) {
						this.b[integer3][0] = (double)this.v;
						this.b[integer3][1] = this.q;
					}
				}

				if (++this.c == this.b.length) {
					this.c = 0;
				}

				this.b[this.c][0] = (double)this.v;
				this.b[this.c][1] = this.q;
				if (this.l.E) {
					if (this.bh > 0) {
						double double3 = this.p + (this.bi - this.p) / (double)this.bh;
						double double5 = this.q + (this.bj - this.q) / (double)this.bh;
						double double7 = this.r + (this.bk - this.r) / (double)this.bh;
						double double9 = ot.g(this.bl - (double)this.v);
						this.v = (float)((double)this.v + double9 / (double)this.bh);
						this.w = (float)((double)this.w + (this.bm - (double)this.w) / (double)this.bh);
						this.bh--;
						this.b(double3, double5, double7);
						this.b(this.v, this.w);
					}

					this.bK.a().b();
				} else {
					yl yl3 = this.bK.a();
					yl3.c();
					if (this.bK.a() != yl3) {
						yl3 = this.bK.a();
						yl3.c();
					}

					bdw bdw4 = yl3.g();
					if (bdw4 != null) {
						double double5 = bdw4.b - this.p;
						double double7 = bdw4.c - this.q;
						double double9 = bdw4.d - this.r;
						double double11 = double5 * double5 + double7 * double7 + double9 * double9;
						float float13 = yl3.f();
						double7 = ot.a(double7 / (double)ot.a(double5 * double5 + double9 * double9), (double)(-float13), (double)float13);
						this.t += double7 * 0.1F;
						this.v = ot.g(this.v);
						double double14 = ot.a(ot.g(180.0 - ot.c(double5, double9) * 180.0F / (float)Math.PI - (double)this.v), -50.0, 50.0);
						bdw bdw16 = new bdw(bdw4.b - this.p, bdw4.c - this.q, bdw4.d - this.r).a();
						bdw bdw17 = new bdw((double)ot.a(this.v * (float) (Math.PI / 180.0)), this.t, (double)(-ot.b(this.v * (float) (Math.PI / 180.0)))).a();
						float float18 = Math.max(((float)bdw17.b(bdw16) + 0.5F) / 1.5F, 0.0F);
						this.bg *= 0.8F;
						this.bg = (float)((double)this.bg + double14 * (double)yl3.h());
						this.v = this.v + this.bg * 0.1F;
						float float19 = (float)(2.0 / (double11 + 1.0));
						float float20 = 0.06F;
						this.a(0.0F, -1.0F, 0.06F * (float18 * float19 + (1.0F - float19)));
						if (this.bF) {
							this.a(tc.SELF, this.s * 0.8F, this.t * 0.8F, this.u * 0.8F);
						} else {
							this.a(tc.SELF, this.s, this.t, this.u);
						}

						bdw bdw21 = new bdw(this.s, this.t, this.u).a();
						float float22 = ((float)bdw21.b(bdw17) + 1.0F) / 2.0F;
						float22 = 0.8F + 0.15F * float22;
						this.s *= (double)float22;
						this.u *= (double)float22;
						this.t *= 0.91F;
					}
				}

				this.aN = this.v;
				this.bv.G = 1.0F;
				this.bv.H = 1.0F;
				this.bw.G = 3.0F;
				this.bw.H = 3.0F;
				this.by.G = 2.0F;
				this.by.H = 2.0F;
				this.bz.G = 2.0F;
				this.bz.H = 2.0F;
				this.bA.G = 2.0F;
				this.bA.H = 2.0F;
				this.bx.H = 3.0F;
				this.bx.G = 5.0F;
				this.bB.H = 2.0F;
				this.bB.G = 4.0F;
				this.bC.H = 3.0F;
				this.bC.G = 4.0F;
				bdw[] arr3 = new bdw[this.bu.length];

				for (int integer4 = 0; integer4 < this.bu.length; integer4++) {
					arr3[integer4] = new bdw(this.bu[integer4].p, this.bu[integer4].q, this.bu[integer4].r);
				}

				float float4 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
				float float5 = ot.b(float4);
				float float6 = ot.a(float4);
				float float7 = this.v * (float) (Math.PI / 180.0);
				float float8 = ot.a(float7);
				float float9 = ot.b(float7);
				this.bx.A_();
				this.bx.b(this.p + (double)(float8 * 0.5F), this.q, this.r - (double)(float9 * 0.5F), 0.0F, 0.0F);
				this.bB.A_();
				this.bB.b(this.p + (double)(float9 * 4.5F), this.q + 2.0, this.r + (double)(float8 * 4.5F), 0.0F, 0.0F);
				this.bC.A_();
				this.bC.b(this.p - (double)(float9 * 4.5F), this.q + 2.0, this.r - (double)(float8 * 4.5F), 0.0F, 0.0F);
				if (!this.l.E && this.ay == 0) {
					this.a(this.l.b(this, this.bB.bo().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0)));
					this.a(this.l.b(this, this.bC.bo().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0)));
					this.b(this.l.b(this, this.bv.bo().g(1.0)));
					this.b(this.l.b(this, this.bw.bo().g(1.0)));
				}

				double[] arr10 = this.a(5, 1.0F);
				float float11 = ot.a(this.v * (float) (Math.PI / 180.0) - this.bg * 0.01F);
				float float12 = ot.b(this.v * (float) (Math.PI / 180.0) - this.bg * 0.01F);
				this.bv.A_();
				this.bw.A_();
				float float13 = this.q(1.0F);
				this.bv
					.b(this.p + (double)(float11 * 6.5F * float5), this.q + (double)float13 + (double)(float6 * 6.5F), this.r - (double)(float12 * 6.5F * float5), 0.0F, 0.0F);
				this.bw
					.b(this.p + (double)(float11 * 5.5F * float5), this.q + (double)float13 + (double)(float6 * 5.5F), this.r - (double)(float12 * 5.5F * float5), 0.0F, 0.0F);

				for (int integer11 = 0; integer11 < 3; integer11++) {
					xz xz12 = null;
					if (integer11 == 0) {
						xz12 = this.by;
					}

					if (integer11 == 1) {
						xz12 = this.bz;
					}

					if (integer11 == 2) {
						xz12 = this.bA;
					}

					double[] arr13 = this.a(12 + integer11 * 2, 1.0F);
					float float14 = this.v * (float) (Math.PI / 180.0) + this.c(arr13[0] - arr10[0]) * (float) (Math.PI / 180.0);
					float float15 = ot.a(float14);
					float float16 = ot.b(float14);
					float float17 = 1.5F;
					float float18 = (float)(integer11 + 1) * 2.0F;
					xz12.A_();
					xz12.b(
						this.p - (double)((float8 * 1.5F + float15 * float18) * float5),
						this.q + (arr13[1] - arr10[1]) - (double)((float18 + 1.5F) * float6) + 1.5,
						this.r + (double)((float9 * 1.5F + float16 * float18) * float5),
						0.0F,
						0.0F
					);
				}

				if (!this.l.E) {
					this.bF = this.b(this.bv.bo()) | this.b(this.bw.bo()) | this.b(this.bx.bo());
					if (this.bJ != null) {
						this.bJ.b(this);
					}
				}

				for (int integer11 = 0; integer11 < this.bu.length; integer11++) {
					this.bu[integer11].m = arr3[integer11].b;
					this.bu[integer11].n = arr3[integer11].c;
					this.bu[integer11].o = arr3[integer11].d;
				}
			}
		}
	}

	private float q(float float1) {
		double double3;
		if (this.bK.a().a()) {
			double3 = -1.0;
		} else {
			double[] arr5 = this.a(5, 1.0F);
			double[] arr6 = this.a(0, 1.0F);
			double3 = arr5[1] - arr6[1];
		}

		return (float)double3;
	}

	private void dc() {
		if (this.bH != null) {
			if (this.bH.F) {
				this.bH = null;
			} else if (this.T % 10 == 0 && this.bU() < this.cb()) {
				this.c(this.bU() + 1.0F);
			}
		}

		if (this.S.nextInt(10) == 0) {
			List<ya> list2 = this.l.a(ya.class, this.bo().g(32.0));
			ya ya3 = null;
			double double4 = Double.MAX_VALUE;

			for (ya ya7 : list2) {
				double double8 = ya7.h(this);
				if (double8 < double4) {
					double4 = double8;
					ya3 = ya7;
				}
			}

			this.bH = ya3;
		}
	}

	private void a(List<sn> list) {
		double double3 = (this.bx.bo().a + this.bx.bo().d) / 2.0;
		double double5 = (this.bx.bo().c + this.bx.bo().f) / 2.0;

		for (sn sn8 : list) {
			if (sn8 instanceof sw) {
				double double9 = sn8.p - double3;
				double double11 = sn8.r - double5;
				double double13 = double9 * double9 + double11 * double11;
				sn8.f(double9 / double13 * 4.0, 0.2F, double11 / double13 * 4.0);
				if (!this.bK.a().a() && ((sw)sn8).bL() < sn8.T - 2) {
					sn8.a(ry.a((sw)this), 5.0F);
					this.a(this, sn8);
				}
			}
		}
	}

	private void b(List<sn> list) {
		for (int integer3 = 0; integer3 < list.size(); integer3++) {
			sn sn4 = (sn)list.get(integer3);
			if (sn4 instanceof sw) {
				sn4.a(ry.a((sw)this), 10.0F);
				this.a(this, sn4);
			}
		}
	}

	private float c(double double1) {
		return (float)ot.g(double1);
	}

	private boolean b(bdt bdt) {
		int integer3 = ot.c(bdt.a);
		int integer4 = ot.c(bdt.b);
		int integer5 = ot.c(bdt.c);
		int integer6 = ot.c(bdt.d);
		int integer7 = ot.c(bdt.e);
		int integer8 = ot.c(bdt.f);
		boolean boolean9 = false;
		boolean boolean10 = false;

		for (int integer11 = integer3; integer11 <= integer6; integer11++) {
			for (int integer12 = integer4; integer12 <= integer7; integer12++) {
				for (int integer13 = integer5; integer13 <= integer8; integer13++) {
					co co14 = new co(integer11, integer12, integer13);
					atl atl15 = this.l.o(co14);
					alu alu16 = atl15.v();
					if (atl15.a() != azs.a && atl15.a() != azs.o) {
						if (!this.l.U().b("mobGriefing")) {
							boolean9 = true;
						} else if (alu16 == alv.cv || alu16 == alv.Z || alu16 == alv.bH || alu16 == alv.h || alu16 == alv.bF || alu16 == alv.bG) {
							boolean9 = true;
						} else if (alu16 != alv.bX && alu16 != alv.dc && alu16 != alv.dd && alu16 != alv.bi && alu16 != alv.db) {
							boolean10 = this.l.g(co14) || boolean10;
						} else {
							boolean9 = true;
						}
					}
				}
			}
		}

		if (boolean10) {
			double double11 = bdt.a + (bdt.d - bdt.a) * (double)this.S.nextFloat();
			double double13 = bdt.b + (bdt.e - bdt.b) * (double)this.S.nextFloat();
			double double15 = bdt.c + (bdt.f - bdt.c) * (double)this.S.nextFloat();
			this.l.a(de.EXPLOSION_LARGE, double11, double13, double15, 0.0, 0.0, 0.0);
		}

		return boolean9;
	}

	@Override
	public boolean a(xz xz, ry ry, float float3) {
		float3 = this.bK.a().a(xz, ry, float3);
		if (xz != this.bv) {
			float3 = float3 / 4.0F + Math.min(float3, 1.0F);
		}

		if (float3 < 0.01F) {
			return false;
		} else {
			if (ry.j() instanceof aay || ry.c()) {
				float float5 = this.bU();
				this.e(ry, float3);
				if (this.bU() <= 0.0F && !this.bK.a().a()) {
					this.c(1.0F);
					this.bK.a(yr.j);
				}

				if (this.bK.a().a()) {
					this.bM = (int)((float)this.bM + (float5 - this.bU()));
					if ((float)this.bM > 0.25F * this.cb()) {
						this.bM = 0;
						this.bK.a(yr.e);
					}
				}
			}

			return true;
		}
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (ry instanceof rz && ((rz)ry).x()) {
			this.a(this.bx, ry, float2);
		}

		return false;
	}

	protected boolean e(ry ry, float float2) {
		return super.a(ry, float2);
	}

	@Override
	public void Q() {
		this.T();
		if (this.bJ != null) {
			this.bJ.b(this);
			this.bJ.a(this);
		}
	}

	@Override
	protected void bG() {
		if (this.bJ != null) {
			this.bJ.b(this);
		}

		this.bG++;
		if (this.bG >= 180 && this.bG <= 200) {
			float float2 = (this.S.nextFloat() - 0.5F) * 8.0F;
			float float3 = (this.S.nextFloat() - 0.5F) * 4.0F;
			float float4 = (this.S.nextFloat() - 0.5F) * 8.0F;
			this.l.a(de.EXPLOSION_HUGE, this.p + (double)float2, this.q + 2.0 + (double)float3, this.r + (double)float4, 0.0, 0.0, 0.0);
		}

		boolean boolean2 = this.l.U().b("doMobLoot");
		int integer3 = 500;
		if (this.bJ != null && !this.bJ.d()) {
			integer3 = 12000;
		}

		if (!this.l.E) {
			if (this.bG > 150 && this.bG % 5 == 0 && boolean2) {
				this.a(ot.d((float)integer3 * 0.08F));
			}

			if (this.bG == 1) {
				this.l.a(1028, new co(this), 0);
			}
		}

		this.a(tc.SELF, 0.0, 0.1F, 0.0);
		this.v += 20.0F;
		this.aN = this.v;
		if (this.bG == 200 && !this.l.E) {
			if (boolean2) {
				this.a(ot.d((float)integer3 * 0.2F));
			}

			if (this.bJ != null) {
				this.bJ.a(this);
			}

			this.T();
		}
	}

	private void a(int integer) {
		while (integer > 0) {
			int integer3 = st.a(integer);
			integer -= integer3;
			this.l.a(new st(this.l, this.p, this.q, this.r, integer3));
		}
	}

	@Override
	public int o() {
		if (this.bN[0] == null) {
			for (int integer2 = 0; integer2 < 24; integer2++) {
				int integer3 = 5;
				int integer5;
				int integer6;
				if (integer2 < 12) {
					integer5 = (int)(60.0F * ot.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)integer2)));
					integer6 = (int)(60.0F * ot.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)integer2)));
				} else if (integer2 < 20) {
					int integer4 = integer2 - 12;
					integer5 = (int)(40.0F * ot.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)integer4)));
					integer6 = (int)(40.0F * ot.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)integer4)));
					integer3 += 10;
				} else {
					int var7 = integer2 - 20;
					integer5 = (int)(20.0F * ot.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
					integer6 = (int)(20.0F * ot.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
				}

				int integer7 = Math.max(this.l.K() + 10, this.l.q(new co(integer5, 0, integer6)).q() + integer3);
				this.bN[integer2] = new bbb(integer5, integer7, integer6);
			}

			this.bO[0] = 6146;
			this.bO[1] = 8197;
			this.bO[2] = 8202;
			this.bO[3] = 16404;
			this.bO[4] = 32808;
			this.bO[5] = 32848;
			this.bO[6] = 65696;
			this.bO[7] = 131392;
			this.bO[8] = 131712;
			this.bO[9] = 263424;
			this.bO[10] = 526848;
			this.bO[11] = 525313;
			this.bO[12] = 1581057;
			this.bO[13] = 3166214;
			this.bO[14] = 2138120;
			this.bO[15] = 6373424;
			this.bO[16] = 4358208;
			this.bO[17] = 12910976;
			this.bO[18] = 9044480;
			this.bO[19] = 9706496;
			this.bO[20] = 15216640;
			this.bO[21] = 13688832;
			this.bO[22] = 11763712;
			this.bO[23] = 8257536;
		}

		return this.k(this.p, this.q, this.r);
	}

	public int k(double double1, double double2, double double3) {
		float float8 = 10000.0F;
		int integer9 = 0;
		bbb bbb10 = new bbb(ot.c(double1), ot.c(double2), ot.c(double3));
		int integer11 = 0;
		if (this.bJ == null || this.bJ.c() == 0) {
			integer11 = 12;
		}

		for (int integer12 = integer11; integer12 < 24; integer12++) {
			if (this.bN[integer12] != null) {
				float float13 = this.bN[integer12].b(bbb10);
				if (float13 < float8) {
					float8 = float13;
					integer9 = integer12;
				}
			}
		}

		return integer9;
	}

	@Nullable
	public bbd a(int integer1, int integer2, @Nullable bbb bbb) {
		for (int integer5 = 0; integer5 < 24; integer5++) {
			bbb bbb6 = this.bN[integer5];
			bbb6.i = false;
			bbb6.g = 0.0F;
			bbb6.e = 0.0F;
			bbb6.f = 0.0F;
			bbb6.h = null;
			bbb6.d = -1;
		}

		bbb bbb5 = this.bN[integer1];
		bbb bbb6 = this.bN[integer2];
		bbb5.e = 0.0F;
		bbb5.f = bbb5.a(bbb6);
		bbb5.g = bbb5.f;
		this.bP.a();
		this.bP.a(bbb5);
		bbb bbb7 = bbb5;
		int integer8 = 0;
		if (this.bJ == null || this.bJ.c() == 0) {
			integer8 = 12;
		}

		while (!this.bP.e()) {
			bbb bbb9 = this.bP.c();
			if (bbb9.equals(bbb6)) {
				if (bbb != null) {
					bbb.h = bbb6;
					bbb6 = bbb;
				}

				return this.a(bbb5, bbb6);
			}

			if (bbb9.a(bbb6) < bbb7.a(bbb6)) {
				bbb7 = bbb9;
			}

			bbb9.i = true;
			int integer10 = 0;

			for (int integer11 = 0; integer11 < 24; integer11++) {
				if (this.bN[integer11] == bbb9) {
					integer10 = integer11;
					break;
				}
			}

			for (int integer11x = integer8; integer11x < 24; integer11x++) {
				if ((this.bO[integer10] & 1 << integer11x) > 0) {
					bbb bbb12 = this.bN[integer11x];
					if (!bbb12.i) {
						float float13 = bbb9.e + bbb9.a(bbb12);
						if (!bbb12.a() || float13 < bbb12.e) {
							bbb12.h = bbb9;
							bbb12.e = float13;
							bbb12.f = bbb12.a(bbb6);
							if (bbb12.a()) {
								this.bP.a(bbb12, bbb12.e + bbb12.f);
							} else {
								bbb12.g = bbb12.e + bbb12.f;
								this.bP.a(bbb12);
							}
						}
					}
				}
			}
		}

		if (bbb7 == bbb5) {
			return null;
		} else {
			bI.debug("Failed to find path from {} to {}", new Object[]{integer1, integer2});
			if (bbb != null) {
				bbb.h = bbb7;
				bbb7 = bbb;
			}

			return this.a(bbb5, bbb7);
		}
	}

	private bbd a(bbb bbb1, bbb bbb2) {
		int integer4 = 1;

		for (bbb bbb5 = bbb2; bbb5.h != null; bbb5 = bbb5.h) {
			integer4++;
		}

		bbb[] arr6 = new bbb[integer4];
		bbb var7 = bbb2;
		integer4--;

		for (arr6[integer4] = bbb2; var7.h != null; arr6[integer4] = var7) {
			var7 = var7.h;
			integer4--;
		}

		return new bbd(arr6);
	}

	public static void a(ph ph) {
		sx.a(ph, yb.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("DragonPhase", this.bK.a().i().b());
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.e("DragonPhase")) {
			this.bK.a(yr.a(du.h("DragonPhase")));
		}
	}

	@Override
	protected void L() {
	}

	@Override
	public sn[] aT() {
		return this.bu;
	}

	@Override
	public boolean aq() {
		return false;
	}

	@Override
	public ajs a() {
		return this.l;
	}

	@Override
	public no bC() {
		return no.HOSTILE;
	}

	@Override
	protected nm G() {
		return nn.aR;
	}

	@Override
	protected nm bW() {
		return nn.aW;
	}

	@Override
	protected float ci() {
		return 5.0F;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.ay;
	}

	public float a(int integer, double[] arr2, double[] arr3) {
		yl yl5 = this.bK.a();
		yr<? extends yl> yr6 = yl5.i();
		double double7;
		if (yr6 == yr.d || yr6 == yr.e) {
			co co9 = this.l.q(awm.a);
			float float10 = Math.max(ot.a(this.d(co9)) / 4.0F, 1.0F);
			double7 = (double)((float)integer / float10);
		} else if (yl5.a()) {
			double7 = (double)integer;
		} else if (integer == 6) {
			double7 = 0.0;
		} else {
			double7 = arr3[1] - arr2[1];
		}

		return (float)double7;
	}

	public bdw a(float float1) {
		yl yl3 = this.bK.a();
		yr<? extends yl> yr4 = yl3.i();
		bdw bdw5;
		if (yr4 == yr.d || yr4 == yr.e) {
			co co6 = this.l.q(awm.a);
			float float7 = Math.max(ot.a(this.d(co6)) / 4.0F, 1.0F);
			float float8 = 6.0F / float7;
			float float9 = this.w;
			float float10 = 1.5F;
			this.w = -float8 * 1.5F * 5.0F;
			bdw5 = this.f(float1);
			this.w = float9;
		} else if (yl3.a()) {
			float float6 = this.w;
			float float7 = 1.5F;
			this.w = -45.0F;
			bdw5 = this.f(float1);
			this.w = float6;
		} else {
			bdw5 = this.f(float1);
		}

		return bdw5;
	}

	public void a(ya ya, co co, ry ry) {
		aay aay5;
		if (ry.j() instanceof aay) {
			aay5 = (aay)ry.j();
		} else {
			aay5 = this.l.a(co, 64.0, 64.0);
		}

		if (ya == this.bH) {
			this.a(this.bv, ry.b(aay5), 10.0F);
		}

		this.bK.a().a(ya, co, ry, aay5);
	}

	@Override
	public void a(kk<?> kk) {
		if (a.equals(kk) && this.l.E) {
			this.bK.a(yr.a(this.R().a(a)));
		}

		super.a(kk);
	}

	public ys da() {
		return this.bK;
	}

	@Nullable
	public avk db() {
		return this.bJ;
	}

	@Override
	public void c(sh sh) {
	}

	@Override
	protected boolean n(sn sn) {
		return false;
	}

	@Override
	public boolean aX() {
		return false;
	}
}

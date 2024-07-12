import java.util.List;
import javax.annotation.Nullable;

public class bps extends bpp {
	public final bno d;
	private final ob bX;
	private int bY = 0;
	private double bZ;
	private double ca;
	private double cb;
	private float cc;
	private float cd;
	private boolean ce;
	private boolean cf;
	private boolean cg;
	private int ch;
	private boolean ci;
	private String cj;
	public bpq e;
	protected bes f;
	protected int g;
	public int h;
	public float bR;
	public float bS;
	public float bT;
	public float bU;
	private int ck;
	private float cl;
	public float bV;
	public float bW;
	private boolean cn;
	private ri co;
	private boolean cp;
	private boolean cq = true;
	private int cr;
	private boolean cs;

	public bps(bes bes, ajs ajs, bno bno, ob ob) {
		super(ajs, bno.e());
		this.d = bno;
		this.bX = ob;
		this.f = bes;
		this.am = 0;
	}

	@Override
	public boolean a(ry ry, float float2) {
		return false;
	}

	@Override
	public void b(float float1) {
	}

	@Override
	public boolean a(sn sn, boolean boolean2) {
		if (!super.a(sn, boolean2)) {
			return false;
		} else {
			if (sn instanceof aby) {
				this.f.U().a(new cbx(this, (aby)sn));
			}

			if (sn instanceof abx) {
				this.x = sn.v;
				this.v = sn.v;
				this.h(sn.v);
			}

			return true;
		}
	}

	@Override
	public void p() {
		super.p();
		this.cp = false;
	}

	@Override
	public bdw f(float float1) {
		return this.f(this.w, this.v);
	}

	@Override
	public void A_() {
		if (this.l.e(new co(this.p, 0.0, this.r))) {
			super.A_();
			if (this.aK()) {
				this.d.a(new iz.c(this.v, this.w, this.z));
				this.d.a(new jf(this.be, this.bf, this.e.g, this.e.h));
				sn sn2 = this.bz();
				if (sn2 != this && sn2.bA()) {
					this.d.a(new ja(sn2));
				}
			} else {
				this.x();
			}
		}
	}

	public void x() {
		boolean boolean2 = this.aN();
		if (boolean2 != this.cg) {
			if (boolean2) {
				this.d.a(new je(this, je.a.START_SPRINTING));
			} else {
				this.d.a(new je(this, je.a.STOP_SPRINTING));
			}

			this.cg = boolean2;
		}

		boolean boolean3 = this.aM();
		if (boolean3 != this.cf) {
			if (boolean3) {
				this.d.a(new je(this, je.a.START_SNEAKING));
			} else {
				this.d.a(new je(this, je.a.STOP_SNEAKING));
			}

			this.cf = boolean3;
		}

		if (this.K()) {
			bdt bdt4 = this.bo();
			double double5 = this.p - this.bZ;
			double double7 = bdt4.b - this.ca;
			double double9 = this.r - this.cb;
			double double11 = (double)(this.v - this.cc);
			double double13 = (double)(this.w - this.cd);
			this.ch++;
			boolean boolean15 = double5 * double5 + double7 * double7 + double9 * double9 > 9.0E-4 || this.ch >= 20;
			boolean boolean16 = double11 != 0.0 || double13 != 0.0;
			if (this.aK()) {
				this.d.a(new iz.b(this.s, -999.0, this.u, this.v, this.w, this.z));
				boolean15 = false;
			} else if (boolean15 && boolean16) {
				this.d.a(new iz.b(this.p, bdt4.b, this.r, this.v, this.w, this.z));
			} else if (boolean15) {
				this.d.a(new iz.a(this.p, bdt4.b, this.r, this.z));
			} else if (boolean16) {
				this.d.a(new iz.c(this.v, this.w, this.z));
			} else if (this.ce != this.z) {
				this.d.a(new iz(this.z));
			}

			if (boolean15) {
				this.bZ = this.p;
				this.ca = bdt4.b;
				this.cb = this.r;
				this.ch = 0;
			}

			if (boolean16) {
				this.cc = this.v;
				this.cd = this.w;
			}

			this.ce = this.z;
			this.cq = this.f.u.R;
		}
	}

	@Nullable
	@Override
	public zj a(boolean boolean1) {
		jd.a a3 = boolean1 ? jd.a.DROP_ALL_ITEMS : jd.a.DROP_ITEM;
		this.d.a(new jd(a3, co.a, cv.DOWN));
		return null;
	}

	@Override
	protected afj a(zj zj) {
		return afj.a;
	}

	public void g(String string) {
		this.d.a(new ip(string));
	}

	@Override
	public void a(ri ri) {
		super.a(ri);
		this.d.a(new jk(ri));
	}

	@Override
	public void cQ() {
		this.d.a(new iq(iq.a.PERFORM_RESPAWN));
	}

	@Override
	protected void d(ry ry, float float2) {
		if (!this.b(ry)) {
			this.c(this.bU() - float2);
		}
	}

	@Override
	public void q() {
		this.d.a(new iv(this.bu.d));
		this.A();
	}

	public void A() {
		this.bs.e(afj.a);
		super.q();
		this.f.a(null);
	}

	public void p(float float1) {
		if (this.ci) {
			float float3 = this.bU() - float1;
			if (float3 <= 0.0F) {
				this.c(float1);
				if (float3 < 0.0F) {
					this.V = this.aI / 2;
				}
			} else {
				this.bc = float3;
				this.c(this.bU());
				this.V = this.aI;
				this.d(ry.n, float3);
				this.az = 10;
				this.ay = this.az;
			}
		} else {
			this.c(float1);
			this.ci = true;
		}
	}

	@Override
	public void a(nw nw, int integer) {
		if (nw != null) {
			if (nw.f) {
				super.a(nw, integer);
			}
		}
	}

	@Override
	public void w() {
		this.d.a(new jc(this.bK));
	}

	@Override
	public boolean cR() {
		return true;
	}

	protected void B() {
		this.d.a(new je(this, je.a.START_RIDING_JUMP, ot.d(this.J() * 100.0F)));
	}

	public void C() {
		this.d.a(new je(this, je.a.OPEN_INVENTORY));
	}

	public void h(String string) {
		this.cj = string;
	}

	public String D() {
		return this.cj;
	}

	public ob E() {
		return this.bX;
	}

	public int G() {
		return this.bY;
	}

	public void o(int integer) {
		this.bY = integer;
	}

	@Override
	public void a(fb fb, boolean boolean2) {
		if (boolean2) {
			this.f.r.a(fb, false);
		} else {
			this.f.r.d().a(fb);
		}
	}

	@Override
	protected boolean i(double double1, double double2, double double3) {
		if (this.Q) {
			return false;
		} else {
			co co8 = new co(double1, double2, double3);
			double double9 = double1 - (double)co8.p();
			double double11 = double3 - (double)co8.r();
			if (!this.f(co8)) {
				int integer13 = -1;
				double double14 = 9999.0;
				if (this.f(co8.e()) && double9 < double14) {
					double14 = double9;
					integer13 = 0;
				}

				if (this.f(co8.f()) && 1.0 - double9 < double14) {
					double14 = 1.0 - double9;
					integer13 = 1;
				}

				if (this.f(co8.c()) && double11 < double14) {
					double14 = double11;
					integer13 = 4;
				}

				if (this.f(co8.d()) && 1.0 - double11 < double14) {
					double14 = 1.0 - double11;
					integer13 = 5;
				}

				float float16 = 0.1F;
				if (integer13 == 0) {
					this.s = -0.1F;
				}

				if (integer13 == 1) {
					this.s = 0.1F;
				}

				if (integer13 == 4) {
					this.u = -0.1F;
				}

				if (integer13 == 5) {
					this.u = 0.1F;
				}
			}

			return false;
		}
	}

	private boolean f(co co) {
		return !this.l.o(co).m() && !this.l.o(co.a()).m();
	}

	@Override
	public void f(boolean boolean1) {
		super.f(boolean1);
		this.h = 0;
	}

	public void a(float float1, int integer2, int integer3) {
		this.bN = float1;
		this.bM = integer2;
		this.bL = integer3;
	}

	@Override
	public void a(fb fb) {
		this.f.r.d().a(fb);
	}

	@Override
	public boolean a(int integer, String string) {
		return integer <= this.G();
	}

	@Override
	public void a(byte byte1) {
		if (byte1 >= 24 && byte1 <= 28) {
			this.o(byte1 - 24);
		} else {
			super.a(byte1);
		}
	}

	@Override
	public co c() {
		return new co(this.p + 0.5, this.q + 0.5, this.r + 0.5);
	}

	@Override
	public void a(nm nm, float float2, float float3) {
		this.l.a(this.p, this.q, this.r, nm, this.bC(), float2, float3, false);
	}

	@Override
	public boolean cu() {
		return true;
	}

	@Override
	public void c(ri ri) {
		afj afj3 = this.b(ri);
		if (!afj3.b() && !this.cy()) {
			super.c(ri);
			this.cn = true;
			this.co = ri;
		}
	}

	@Override
	public boolean cy() {
		return this.cn;
	}

	@Override
	public void cF() {
		super.cF();
		this.cn = false;
	}

	@Override
	public ri cz() {
		return this.co;
	}

	@Override
	public void a(kk<?> kk) {
		super.a(kk);
		if (at.equals(kk)) {
			boolean boolean3 = (this.Y.a(at) & 1) > 0;
			ri ri4 = (this.Y.a(at) & 2) > 0 ? ri.OFF_HAND : ri.MAIN_HAND;
			if (boolean3 && !this.cn) {
				this.c(ri4);
			} else if (!boolean3 && this.cn) {
				this.cF();
			}
		}

		if (Z.equals(kk) && this.cH() && !this.cs) {
			this.f.U().a(new cbu(this));
		}
	}

	public boolean I() {
		sn sn2 = this.bB();
		return this.aK() && sn2 instanceof tg && ((tg)sn2).a();
	}

	public float J() {
		return this.cl;
	}

	@Override
	public void a(asv asv) {
		this.f.a(new bjb(asv));
	}

	@Override
	public void a(ajh ajh) {
		this.f.a(new biz(ajh));
	}

	@Override
	public void a(asf asf) {
		this.f.a(new bil(asf));
	}

	@Override
	public void a(asx asx) {
		this.f.a(new bjc(asx));
	}

	@Override
	public void a(afj afj, ri ri) {
		afh afh4 = afj.c();
		if (afh4 == afl.bX) {
			this.f.a(new bij(this, afj, true));
		}
	}

	@Override
	public void a(rc rc) {
		String string3 = rc instanceof rj ? ((rj)rc).l() : "minecraft:container";
		if ("minecraft:chest".equals(string3)) {
			this.f.a(new bim(this.bs, rc));
		} else if ("minecraft:hopper".equals(string3)) {
			this.f.a(new biv(this.bs, rc));
		} else if ("minecraft:furnace".equals(string3)) {
			this.f.a(new biu(this.bs, rc));
		} else if ("minecraft:brewing_stand".equals(string3)) {
			this.f.a(new bik(this.bs, rc));
		} else if ("minecraft:beacon".equals(string3)) {
			this.f.a(new bii(this.bs, rc));
		} else if ("minecraft:dispenser".equals(string3) || "minecraft:dropper".equals(string3)) {
			this.f.a(new biq(this.bs, rc));
		} else if ("minecraft:shulker_box".equals(string3)) {
			this.f.a(new bja(this.bs, rc));
		} else {
			this.f.a(new bim(this.bs, rc));
		}
	}

	@Override
	public void a(xm xm, rc rc) {
		this.f.a(new biw(this.bs, rc, xm));
	}

	@Override
	public void a(rj rj) {
		String string3 = rj.l();
		if ("minecraft:crafting_table".equals(string3)) {
			this.f.a(new bin(this.bs, this.l));
		} else if ("minecraft:enchanting_table".equals(string3)) {
			this.f.a(new bit(this.bs, this.l, rj));
		} else if ("minecraft:anvil".equals(string3)) {
			this.f.a(new bih(this.bs, this.l));
		}
	}

	@Override
	public void a(ajd ajd) {
		this.f.a(new biy(this.bs, ajd, this.l));
	}

	@Override
	public void a(sn sn) {
		this.f.j.a(sn, de.CRIT);
	}

	@Override
	public void b(sn sn) {
		this.f.j.a(sn, de.CRIT_MAGIC);
	}

	@Override
	public boolean aM() {
		boolean boolean2 = this.e != null && this.e.h;
		return boolean2 && !this.bG;
	}

	@Override
	public void cs() {
		super.cs();
		if (this.K()) {
			this.be = this.e.a;
			this.bf = this.e.b;
			this.bd = this.e.g;
			this.bT = this.bR;
			this.bU = this.bS;
			this.bS = (float)((double)this.bS + (double)(this.w - this.bS) * 0.5);
			this.bR = (float)((double)this.bR + (double)(this.v - this.bR) * 0.5);
		}
	}

	protected boolean K() {
		return this.f.aa() == this;
	}

	@Override
	public void n() {
		this.h++;
		if (this.g > 0) {
			this.g--;
		}

		this.bW = this.bV;
		if (this.ak) {
			if (this.f.m != null && !this.f.m.d()) {
				this.f.a(null);
			}

			if (this.bV == 0.0F) {
				this.f.U().a(cby.a(nn.eT, this.S.nextFloat() * 0.4F + 0.8F));
			}

			this.bV += 0.0125F;
			if (this.bV >= 1.0F) {
				this.bV = 1.0F;
			}

			this.ak = false;
		} else if (this.a(si.i) && this.b(si.i).b() > 60) {
			this.bV += 0.006666667F;
			if (this.bV > 1.0F) {
				this.bV = 1.0F;
			}
		} else {
			if (this.bV > 0.0F) {
				this.bV -= 0.05F;
			}

			if (this.bV < 0.0F) {
				this.bV = 0.0F;
			}
		}

		if (this.aj > 0) {
			this.aj--;
		}

		boolean boolean2 = this.e.g;
		boolean boolean3 = this.e.h;
		float float4 = 0.8F;
		boolean boolean5 = this.e.b >= 0.8F;
		this.e.a();
		if (this.cy() && !this.aK()) {
			this.e.a *= 0.2F;
			this.e.b *= 0.2F;
			this.g = 0;
		}

		boolean boolean6 = false;
		if (this.cr > 0) {
			this.cr--;
			boolean6 = true;
			this.e.g = true;
		}

		bdt bdt7 = this.bo();
		this.i(this.p - (double)this.G * 0.35, bdt7.b + 0.5, this.r + (double)this.G * 0.35);
		this.i(this.p - (double)this.G * 0.35, bdt7.b + 0.5, this.r - (double)this.G * 0.35);
		this.i(this.p + (double)this.G * 0.35, bdt7.b + 0.5, this.r - (double)this.G * 0.35);
		this.i(this.p + (double)this.G * 0.35, bdt7.b + 0.5, this.r + (double)this.G * 0.35);
		boolean boolean8 = (float)this.da().a() > 6.0F || this.bK.c;
		if (this.z && !boolean3 && !boolean5 && this.e.b >= 0.8F && !this.aN() && boolean8 && !this.cy() && !this.a(si.o)) {
			if (this.g <= 0 && !this.f.u.Y.e()) {
				this.g = 7;
			} else {
				this.f(true);
			}
		}

		if (!this.aN() && this.e.b >= 0.8F && boolean8 && !this.cy() && !this.a(si.o) && this.f.u.Y.e()) {
			this.f(true);
		}

		if (this.aN() && (this.e.b < 0.8F || this.A || !boolean8)) {
			this.f(false);
		}

		if (this.bK.c) {
			if (this.f.c.k()) {
				if (!this.bK.b) {
					this.bK.b = true;
					this.w();
				}
			} else if (!boolean2 && this.e.g && !boolean6) {
				if (this.bw == 0) {
					this.bw = 7;
				} else {
					this.bK.b = !this.bK.b;
					this.w();
					this.bw = 0;
				}
			}
		}

		if (this.e.g && !boolean2 && !this.z && this.t < 0.0 && !this.cH() && !this.bK.b) {
			afj afj9 = this.b(ss.CHEST);
			if (afj9.c() == afl.cS && aeq.d(afj9)) {
				this.d.a(new je(this, je.a.START_FALL_FLYING));
			}
		}

		this.cs = this.cH();
		if (this.bK.b && this.K()) {
			if (this.e.h) {
				this.e.a = (float)((double)this.e.a / 0.3);
				this.e.b = (float)((double)this.e.b / 0.3);
				this.t = this.t - (double)(this.bK.a() * 3.0F);
			}

			if (this.e.g) {
				this.t = this.t + (double)(this.bK.a() * 3.0F);
			}
		}

		if (this.I()) {
			tg tg9 = (tg)this.bB();
			if (this.ck < 0) {
				this.ck++;
				if (this.ck == 0) {
					this.cl = 0.0F;
				}
			}

			if (boolean2 && !this.e.g) {
				this.ck = -10;
				tg9.a_(ot.d(this.J() * 100.0F));
				this.B();
			} else if (!boolean2 && this.e.g) {
				this.ck = 0;
				this.cl = 0.0F;
			} else if (boolean2) {
				this.ck++;
				if (this.ck < 10) {
					this.cl = (float)this.ck * 0.1F;
				} else {
					this.cl = 0.8F + 2.0F / (float)(this.ck - 9) * 0.1F;
				}
			}
		} else {
			this.cl = 0.0F;
		}

		super.n();
		if (this.z && this.bK.b && !this.f.c.k()) {
			this.bK.b = false;
			this.w();
		}
	}

	@Override
	public void aw() {
		super.aw();
		this.cp = false;
		if (this.bB() instanceof abx) {
			abx abx2 = (abx)this.bB();
			abx2.a(this.e.e, this.e.f, this.e.c, this.e.d);
			this.cp = this.cp | (this.e.e || this.e.f || this.e.c || this.e.d);
		}
	}

	public boolean L() {
		return this.cp;
	}

	@Nullable
	@Override
	public sh c(@Nullable sg sg) {
		if (sg == si.i) {
			this.bW = 0.0F;
			this.bV = 0.0F;
		}

		return super.c(sg);
	}

	@Override
	public void a(tc tc, double double2, double double3, double double4) {
		double double9 = this.p;
		double double11 = this.r;
		super.a(tc, double2, double3, double4);
		this.i((float)(this.p - double9), (float)(this.r - double11));
	}

	public boolean M() {
		return this.cq;
	}

	protected void i(float float1, float float2) {
		if (this.M()) {
			if (this.cr <= 0 && this.z && !this.aM() && !this.aK()) {
				bdv bdv4 = this.e.b();
				if (bdv4.i != 0.0F || bdv4.j != 0.0F) {
					bdw bdw5 = new bdw(this.p, this.bo().b, this.r);
					bdw bdw6 = new bdw(this.p + (double)float1, this.bo().b, this.r + (double)float2);
					bdw bdw7 = new bdw((double)float1, 0.0, (double)float2);
					float float8 = this.cq();
					float float9 = (float)bdw7.c();
					if (float9 <= 0.001F) {
						float float10 = float8 * bdv4.i;
						float float11 = float8 * bdv4.j;
						float float12 = ot.a(this.v * (float) (Math.PI / 180.0));
						float float13 = ot.b(this.v * (float) (Math.PI / 180.0));
						bdw7 = new bdw((double)(float10 * float13 - float11 * float12), bdw7.c, (double)(float11 * float13 + float10 * float12));
						float9 = (float)bdw7.c();
						if (float9 <= 0.001F) {
							return;
						}
					}

					float float10 = (float)ot.i((double)float9);
					bdw bdw11 = bdw7.a((double)float10);
					bdw bdw12 = this.aD();
					float float13 = (float)(bdw12.b * bdw11.b + bdw12.d * bdw11.d);
					if (!(float13 < -0.15F)) {
						co co14 = new co(this.p, this.bo().e, this.r);
						atl atl15 = this.l.o(co14);
						if (atl15.c((ajw)this.l, co14) == null) {
							co14 = co14.a();
							atl atl16 = this.l.o(co14);
							if (atl16.c((ajw)this.l, co14) == null) {
								float float17 = 7.0F;
								float float18 = 1.2F;
								if (this.a(si.h)) {
									float18 += (float)(this.b(si.h).c() + 1) * 0.75F;
								}

								float float19 = Math.max(float8 * 7.0F, 1.0F / float10);
								bdw bdw21 = bdw6.e(bdw11.a((double)float19));
								float float22 = this.G;
								float float23 = this.H;
								bdt bdt24 = new bdt(bdw5, bdw21.b(0.0, (double)float23, 0.0)).c((double)float22, 0.0, (double)float22);
								bdw bdw20 = bdw5.b(0.0, 0.51F, 0.0);
								bdw21 = bdw21.b(0.0, 0.51F, 0.0);
								bdw bdw25 = bdw11.c(new bdw(0.0, 1.0, 0.0));
								bdw bdw26 = bdw25.a((double)(float22 * 0.5F));
								bdw bdw27 = bdw20.d(bdw26);
								bdw bdw28 = bdw21.d(bdw26);
								bdw bdw29 = bdw20.e(bdw26);
								bdw bdw30 = bdw21.e(bdw26);
								List<bdt> list31 = this.l.a(this, bdt24);
								if (!list31.isEmpty()) {
								}

								float float33 = Float.MIN_VALUE;

								for (bdt bdt36 : list31) {
									if (bdt36.a(bdw27, bdw28) || bdt36.a(bdw29, bdw30)) {
										float33 = (float)bdt36.e;
										bdw bdw32 = bdt36.c();
										co co37 = new co(bdw32);

										for (int integer38 = 1; (float)integer38 < float18; integer38++) {
											co co39 = co37.b(integer38);
											atl atl40 = this.l.o(co39);
											bdt bdt34;
											if ((bdt34 = atl40.c((ajw)this.l, co39)) != null) {
												float33 = (float)bdt34.e + (float)co39.q();
												if ((double)float33 - this.bo().b > (double)float18) {
													return;
												}
											}

											if (integer38 > 1) {
												co14 = co14.a();
												atl atl41 = this.l.o(co14);
												if (atl41.c((ajw)this.l, co14) != null) {
													return;
												}
											}
										}
										break;
									}
								}

								if (float33 != Float.MIN_VALUE) {
									float float35 = (float)((double)float33 - this.bo().b);
									if (!(float35 <= 0.5F) && !(float35 > float18)) {
										this.cr = 1;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

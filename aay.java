import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class aay extends sw {
	private static final kk<Float> a = kn.a(aay.class, km.c);
	private static final kk<Integer> b = kn.a(aay.class, km.b);
	protected static final kk<Byte> bq = kn.a(aay.class, km.a);
	protected static final kk<Byte> br = kn.a(aay.class, km.a);
	public aax bs = new aax(this);
	private adg c = new adg();
	public acl bt;
	public acl bu;
	protected acj bv = new acj();
	protected int bw;
	public float bx;
	public float by;
	public int bz;
	public double bA;
	public double bB;
	public double bC;
	public double bD;
	public double bE;
	public double bF;
	protected boolean bG;
	public co bH;
	private int d;
	public float bI;
	public float cm;
	public float bJ;
	private co e;
	private boolean f;
	private co g;
	public aaw bK = new aaw();
	public int bL;
	public int bM;
	public float bN;
	private int h;
	protected float bO = 0.1F;
	protected float bP = 0.02F;
	private int bR;
	private final GameProfile bS;
	private boolean bT;
	private afj bU = afj.a;
	private final afi bV = this.l();
	@Nullable
	public zd bQ;

	protected afi l() {
		return new afi();
	}

	public aay(ajs ajs, GameProfile gameProfile) {
		super(ajs);
		this.a(a(gameProfile));
		this.bS = gameProfile;
		this.bt = new adc(this.bs, !ajs.E, this);
		this.bu = this.bt;
		co co4 = ajs.R();
		this.b((double)co4.p() + 0.5, (double)(co4.q() + 1), (double)co4.r() + 0.5, 0.0F, 0.0F);
		this.ba = 180.0F;
	}

	@Override
	protected void bE() {
		super.bE();
		this.ce().b(aad.e).a(1.0);
		this.a(aad.d).a(0.1F);
		this.ce().b(aad.f);
		this.ce().b(aad.i);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, 0.0F);
		this.Y.a(b, 0);
		this.Y.a(bq, (byte)0);
		this.Y.a(br, (byte)1);
	}

	@Override
	public void A_() {
		this.Q = this.y();
		if (this.y()) {
			this.z = false;
		}

		if (this.bz > 0) {
			this.bz--;
		}

		if (this.cr()) {
			this.d++;
			if (this.d > 100) {
				this.d = 100;
			}

			if (!this.l.E) {
				if (!this.r()) {
					this.a(true, true, false);
				} else if (this.l.B()) {
					this.a(false, true, true);
				}
			}
		} else if (this.d > 0) {
			this.d++;
			if (this.d >= 110) {
				this.d = 0;
			}
		}

		super.A_();
		if (!this.l.E && this.bu != null && !this.bu.a(this)) {
			this.q();
			this.bu = this.bt;
		}

		if (this.aJ() && this.bK.a) {
			this.X();
		}

		this.o();
		if (!this.aK()) {
			this.g = null;
		}

		if (!this.l.E) {
			this.bv.a(this);
			this.b(oa.g);
			if (this.au()) {
				this.b(oa.h);
			}

			if (this.aM()) {
				this.b(oa.i);
			}
		}

		int integer2 = 29999999;
		double double3 = ot.a(this.p, -2.9999999E7, 2.9999999E7);
		double double5 = ot.a(this.r, -2.9999999E7, 2.9999999E7);
		if (double3 != this.p || double5 != this.r) {
			this.b(double3, this.q, double5);
		}

		this.aE++;
		afj afj7 = this.cg();
		if (!afj.b(this.bU, afj7)) {
			if (!afj.d(this.bU, afj7)) {
				this.dh();
			}

			this.bU = afj7.b() ? afj.a : afj7.l();
		}

		this.bV.a();
		this.cL();
	}

	private void o() {
		this.bA = this.bD;
		this.bB = this.bE;
		this.bC = this.bF;
		double double2 = this.p - this.bD;
		double double4 = this.q - this.bE;
		double double6 = this.r - this.bF;
		double double8 = 10.0;
		if (double2 > 10.0) {
			this.bD = this.p;
			this.bA = this.bD;
		}

		if (double6 > 10.0) {
			this.bF = this.r;
			this.bC = this.bF;
		}

		if (double4 > 10.0) {
			this.bE = this.q;
			this.bB = this.bE;
		}

		if (double2 < -10.0) {
			this.bD = this.p;
			this.bA = this.bD;
		}

		if (double6 < -10.0) {
			this.bF = this.r;
			this.bC = this.bF;
		}

		if (double4 < -10.0) {
			this.bE = this.q;
			this.bB = this.bE;
		}

		this.bD += double2 * 0.25;
		this.bF += double6 * 0.25;
		this.bE += double4 * 0.25;
	}

	protected void cL() {
		float float2;
		float float3;
		if (this.cH()) {
			float2 = 0.6F;
			float3 = 0.6F;
		} else if (this.cr()) {
			float2 = 0.2F;
			float3 = 0.2F;
		} else if (this.aM()) {
			float2 = 0.6F;
			float3 = 1.65F;
		} else {
			float2 = 0.6F;
			float3 = 1.8F;
		}

		if (float2 != this.G || float3 != this.H) {
			bdt bdt4 = this.bo();
			bdt4 = new bdt(bdt4.a, bdt4.b, bdt4.c, bdt4.a + (double)float2, bdt4.b + (double)float3, bdt4.c + (double)float2);
			if (!this.l.a(bdt4)) {
				this.a(float2, float3);
			}
		}
	}

	@Override
	public int V() {
		return this.bK.a ? 1 : 80;
	}

	@Override
	protected nm aa() {
		return nn.eK;
	}

	@Override
	protected nm ab() {
		return nn.eJ;
	}

	@Override
	public int aE() {
		return 10;
	}

	@Override
	public void a(nm nm, float float2, float float3) {
		this.l.a(this, this.p, this.q, this.r, nm, this.bC(), float2, float3);
	}

	@Override
	public no bC() {
		return no.PLAYERS;
	}

	@Override
	protected int bD() {
		return 20;
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 9) {
			this.v();
		} else if (byte1 == 23) {
			this.bT = false;
		} else if (byte1 == 22) {
			this.bT = true;
		} else {
			super.a(byte1);
		}
	}

	@Override
	protected boolean ck() {
		return this.bU() <= 0.0F || this.cr();
	}

	protected void q() {
		this.bu = this.bt;
	}

	@Override
	public void aw() {
		if (!this.l.E && this.aM() && this.aK()) {
			this.p();
			this.e(false);
		} else {
			double double2 = this.p;
			double double4 = this.q;
			double double6 = this.r;
			float float8 = this.v;
			float float9 = this.w;
			super.aw();
			this.bx = this.by;
			this.by = 0.0F;
			this.l(this.p - double2, this.q - double4, this.r - double6);
			if (this.bB() instanceof xc) {
				this.w = float9;
				this.v = float8;
				this.aN = ((xc)this.bB()).aN;
			}
		}
	}

	@Override
	public void S() {
		this.a(0.6F, 1.8F);
		super.S();
		this.c(this.cb());
		this.aB = 0;
	}

	@Override
	protected void cs() {
		super.cs();
		this.cd();
		this.aP = this.v;
	}

	@Override
	public void n() {
		if (this.bw > 0) {
			this.bw--;
		}

		if (this.l.ae() == rg.PEACEFUL && this.l.U().b("naturalRegeneration")) {
			if (this.bU() < this.cb() && this.T % 20 == 0) {
				this.b(1.0F);
			}

			if (this.bv.c() && this.T % 10 == 0) {
				this.bv.a(this.bv.a() + 1);
			}
		}

		this.bs.n();
		this.bx = this.by;
		super.n();
		tk tk2 = this.a(aad.d);
		if (!this.l.E) {
			tk2.a((double)this.bK.b());
		}

		this.aR = this.bP;
		if (this.aN()) {
			this.aR = (float)((double)this.aR + (double)this.bP * 0.3);
		}

		this.l((float)tk2.e());
		float float3 = ot.a(this.s * this.s + this.u * this.u);
		float float4 = (float)(Math.atan(-this.t * 0.2F) * 15.0);
		if (float3 > 0.1F) {
			float3 = 0.1F;
		}

		if (!this.z || this.bU() <= 0.0F) {
			float3 = 0.0F;
		}

		if (this.z || this.bU() <= 0.0F) {
			float4 = 0.0F;
		}

		this.by = this.by + (float3 - this.by) * 0.4F;
		this.aK = this.aK + (float4 - this.aK) * 0.8F;
		if (this.bU() > 0.0F && !this.y()) {
			bdt bdt5;
			if (this.aK() && !this.bB().F) {
				bdt5 = this.bo().b(this.bB().bo()).c(1.0, 0.0, 1.0);
			} else {
				bdt5 = this.bo().c(1.0, 0.5, 1.0);
			}

			List<sn> list6 = this.l.b(this, bdt5);

			for (int integer7 = 0; integer7 < list6.size(); integer7++) {
				sn sn8 = (sn)list6.get(integer7);
				if (!sn8.F) {
					this.c(sn8);
				}
			}
		}
	}

	private void c(sn sn) {
		sn.d(this);
	}

	public int cM() {
		return this.Y.a(b);
	}

	public void g(int integer) {
		this.Y.b(b, integer);
	}

	public void m(int integer) {
		int integer3 = this.cM();
		this.Y.b(b, integer3 + integer);
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		this.a(0.2F, 0.2F);
		this.b(this.p, this.q, this.r);
		this.t = 0.1F;
		if ("Notch".equals(this.h_())) {
			this.a(new afj(afl.f, 1), true, false);
		}

		if (!this.l.U().b("keepInventory") && !this.y()) {
			this.cN();
			this.bs.o();
		}

		if (ry != null) {
			this.s = (double)(-ot.b((this.aA + this.v) * (float) (Math.PI / 180.0)) * 0.1F);
			this.u = (double)(-ot.a((this.aA + this.v) * (float) (Math.PI / 180.0)) * 0.1F);
		} else {
			this.s = 0.0;
			this.u = 0.0;
		}

		this.b(oa.A);
		this.a(oa.h);
		this.X();
		this.b(0, false);
	}

	protected void cN() {
		for (int integer2 = 0; integer2 < this.bs.v_(); integer2++) {
			afj afj3 = this.bs.a(integer2);
			if (!afj3.b() && aik.e(afj3)) {
				this.bs.b(integer2);
			}
		}
	}

	@Override
	protected nm bW() {
		return nn.eG;
	}

	@Override
	protected nm bX() {
		return nn.eF;
	}

	@Override
	public void b(sn sn, int integer) {
		if (sn != this) {
			this.m(integer);
			Collection<bdy> collection4 = this.de().a(bei.f);
			if (sn instanceof aay) {
				this.b(oa.D);
				collection4.addAll(this.de().a(bei.e));
			} else {
				this.b(oa.B);
			}

			collection4.addAll(this.d(sn));

			for (bdy bdy6 : collection4) {
				this.de().c(this.h_(), bdy6).a();
			}
		}
	}

	private Collection<bdy> d(sn sn) {
		String string3 = sn instanceof aay ? sn.h_() : sn.bf();
		bdz bdz4 = this.de().g(this.h_());
		if (bdz4 != null) {
			int integer5 = bdz4.m().b();
			if (integer5 >= 0 && integer5 < bei.n.length) {
				for (bdy bdy7 : this.de().a(bei.n[integer5])) {
					bea bea8 = this.de().c(string3, bdy7);
					bea8.a();
				}
			}
		}

		bdz bdz5 = this.de().g(string3);
		if (bdz5 != null) {
			int integer6 = bdz5.m().b();
			if (integer6 >= 0 && integer6 < bei.m.length) {
				return this.de().a(bei.m[integer6]);
			}
		}

		return Lists.newArrayList();
	}

	@Nullable
	public zj a(boolean boolean1) {
		return this.a(this.bs.a(this.bs.d, boolean1 && !this.bs.i().b() ? this.bs.i().E() : 1), false, true);
	}

	@Nullable
	public zj a(afj afj, boolean boolean2) {
		return this.a(afj, false, boolean2);
	}

	@Nullable
	public zj a(afj afj, boolean boolean2, boolean boolean3) {
		if (afj.b()) {
			return null;
		} else {
			double double5 = this.q - 0.3F + (double)this.bq();
			zj zj7 = new zj(this.l, this.p, double5, this.r, afj);
			zj7.a(40);
			if (boolean3) {
				zj7.e(this.h_());
			}

			if (boolean2) {
				float float8 = this.S.nextFloat() * 0.5F;
				float float9 = this.S.nextFloat() * (float) (Math.PI * 2);
				zj7.s = (double)(-ot.a(float9) * float8);
				zj7.u = (double)(ot.b(float9) * float8);
				zj7.t = 0.2F;
			} else {
				float float8 = 0.3F;
				zj7.s = (double)(-ot.a(this.v * (float) (Math.PI / 180.0)) * ot.b(this.w * (float) (Math.PI / 180.0)) * float8);
				zj7.u = (double)(ot.b(this.v * (float) (Math.PI / 180.0)) * ot.b(this.w * (float) (Math.PI / 180.0)) * float8);
				zj7.t = (double)(-ot.a(this.w * (float) (Math.PI / 180.0)) * float8 + 0.1F);
				float float9 = this.S.nextFloat() * (float) (Math.PI * 2);
				float8 = 0.02F * this.S.nextFloat();
				zj7.s = zj7.s + Math.cos((double)float9) * (double)float8;
				zj7.t = zj7.t + (double)((this.S.nextFloat() - this.S.nextFloat()) * 0.1F);
				zj7.u = zj7.u + Math.sin((double)float9) * (double)float8;
			}

			afj afj8 = this.a(zj7);
			if (boolean3) {
				if (!afj8.b()) {
					this.a(oa.e(afj8.c()), afj.E());
				}

				this.b(oa.x);
			}

			return zj7;
		}
	}

	protected afj a(zj zj) {
		this.l.a(zj);
		return zj.k();
	}

	public float a(atl atl) {
		float float3 = this.bs.a(atl);
		if (float3 > 1.0F) {
			int integer4 = aik.f(this);
			afj afj5 = this.cg();
			if (integer4 > 0 && !afj5.b()) {
				float3 += (float)(integer4 * integer4 + 1);
			}
		}

		if (this.a(si.c)) {
			float3 *= 1.0F + (float)(this.b(si.c).c() + 1) * 0.2F;
		}

		if (this.a(si.d)) {
			float float4;
			switch (this.b(si.d).c()) {
				case 0:
					float4 = 0.3F;
					break;
				case 1:
					float4 = 0.09F;
					break;
				case 2:
					float4 = 0.0027F;
					break;
				case 3:
				default:
					float4 = 8.1E-4F;
			}

			float3 *= float4;
		}

		if (this.a(azs.h) && !aik.h(this)) {
			float3 /= 5.0F;
		}

		if (!this.z) {
			float3 /= 5.0F;
		}

		return float3;
	}

	public boolean b(atl atl) {
		return this.bs.b(atl);
	}

	public static void c(ph ph) {
		ph.a(pf.PLAYER, new pj() {
			@Override
			public du a(pg pg, du du, int integer) {
				pi.b(pg, du, integer, "Inventory");
				pi.b(pg, du, integer, "EnderItems");
				return du;
			}
		});
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a(a(this.bS));
		ea ea3 = du.c("Inventory", 10);
		this.bs.b(ea3);
		this.bs.d = du.h("SelectedItemSlot");
		this.bG = du.p("Sleeping");
		this.d = du.g("SleepTimer");
		this.bN = du.j("XpP");
		this.bL = du.h("XpLevel");
		this.bM = du.h("XpTotal");
		this.h = du.h("XpSeed");
		if (this.h == 0) {
			this.h = this.S.nextInt();
		}

		this.g(du.h("Score"));
		if (this.bG) {
			this.bH = new co(this);
			this.a(true, true, false);
		}

		if (du.b("SpawnX", 99) && du.b("SpawnY", 99) && du.b("SpawnZ", 99)) {
			this.e = new co(du.h("SpawnX"), du.h("SpawnY"), du.h("SpawnZ"));
			this.f = du.p("SpawnForced");
		}

		this.bv.a(du);
		this.bK.b(du);
		if (du.b("EnderItems", 9)) {
			ea ea4 = du.c("EnderItems", 10);
			this.c.a(ea4);
		}
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("DataVersion", 922);
		du.a("Inventory", this.bs.a(new ea()));
		du.a("SelectedItemSlot", this.bs.d);
		du.a("Sleeping", this.bG);
		du.a("SleepTimer", (short)this.d);
		du.a("XpP", this.bN);
		du.a("XpLevel", this.bL);
		du.a("XpTotal", this.bM);
		du.a("XpSeed", this.h);
		du.a("Score", this.cM());
		if (this.e != null) {
			du.a("SpawnX", this.e.p());
			du.a("SpawnY", this.e.q());
			du.a("SpawnZ", this.e.r());
			du.a("SpawnForced", this.f);
		}

		this.bv.b(du);
		this.bK.a(du);
		du.a("EnderItems", this.c.i());
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else if (this.bK.a && !ry.g()) {
			return false;
		} else {
			this.aV = 0;
			if (this.bU() <= 0.0F) {
				return false;
			} else {
				if (this.cr() && !this.l.E) {
					this.a(true, true, false);
				}

				if (ry.r()) {
					if (this.l.ae() == rg.PEACEFUL) {
						float2 = 0.0F;
					}

					if (this.l.ae() == rg.EASY) {
						float2 = Math.min(float2 / 2.0F + 1.0F, float2);
					}

					if (this.l.ae() == rg.HARD) {
						float2 = float2 * 3.0F / 2.0F;
					}
				}

				return float2 == 0.0F ? false : super.a(ry, float2);
			}
		}
	}

	@Override
	protected void c(sw sw) {
		super.c(sw);
		if (sw.cg().c() instanceof ads) {
			this.m(true);
		}
	}

	public boolean a(aay aay) {
		bee bee3 = this.aQ();
		bee bee4 = aay.aQ();
		if (bee3 == null) {
			return true;
		} else {
			return !bee3.a(bee4) ? true : bee3.g();
		}
	}

	@Override
	protected void j(float float1) {
		this.bs.a(float1);
	}

	@Override
	protected void k(float float1) {
		if (float1 >= 3.0F && this.bn.c() == afl.cR) {
			int integer3 = 1 + ot.d(float1);
			this.bn.a(integer3, this);
			if (this.bn.b()) {
				ri ri4 = this.cz();
				if (ri4 == ri.MAIN_HAND) {
					this.a(ss.MAINHAND, afj.a);
				} else {
					this.a(ss.OFFHAND, afj.a);
				}

				this.bn = afj.a;
				this.a(nn.fx, 0.8F, 0.8F + this.l.r.nextFloat() * 0.4F);
			}
		}
	}

	public float cO() {
		int integer2 = 0;

		for (afj afj4 : this.bs.b) {
			if (!afj4.b()) {
				integer2++;
			}
		}

		return (float)integer2 / (float)this.bs.b.size();
	}

	@Override
	protected void d(ry ry, float float2) {
		if (!this.b(ry)) {
			float2 = this.b(ry, float2);
			float2 = this.c(ry, float2);
			float var7 = Math.max(float2 - this.cv(), 0.0F);
			this.n(this.cv() - (float2 - var7));
			if (var7 != 0.0F) {
				this.a(ry.f());
				float float5 = this.bU();
				this.c(this.bU() - var7);
				this.bZ().a(ry, float5, var7);
				if (var7 < 3.4028235E37F) {
					this.a(oa.z, Math.round(var7 * 10.0F));
				}
			}
		}
	}

	public void a(asv asv) {
	}

	public void a(ajh ajh) {
	}

	public void a(asf asf) {
	}

	public void a(asx asx) {
	}

	public void a(ajd ajd) {
	}

	public void a(rc rc) {
	}

	public void a(xm xm, rc rc) {
	}

	public void a(rj rj) {
	}

	public void a(afj afj, ri ri) {
	}

	public rk a(sn sn, ri ri) {
		if (this.y()) {
			if (sn instanceof rc) {
				this.a((rc)sn);
			}

			return rk.PASS;
		} else {
			afj afj4 = this.b(ri);
			afj afj5 = afj4.b() ? afj.a : afj4.l();
			if (sn.b(this, ri)) {
				if (this.bK.d && afj4 == this.b(ri) && afj4.E() < afj5.E()) {
					afj4.e(afj5.E());
				}

				return rk.SUCCESS;
			} else {
				if (!afj4.b() && sn instanceof sw) {
					if (this.bK.d) {
						afj4 = afj5;
					}

					if (afj4.a(this, (sw)sn, ri)) {
						if (afj4.b() && !this.bK.d) {
							this.a(ri, afj.a);
						}

						return rk.SUCCESS;
					}
				}

				return rk.PASS;
			}
		}
	}

	@Override
	public double ax() {
		return -0.35;
	}

	@Override
	public void p() {
		super.p();
		this.j = 0;
	}

	public void f(sn sn) {
		if (sn.aV()) {
			if (!sn.t(this)) {
				float float3 = (float)this.a(aad.e).e();
				float float4;
				if (sn instanceof sw) {
					float4 = aik.a(this.cg(), ((sw)sn).cf());
				} else {
					float4 = aik.a(this.cg(), tb.UNDEFINED);
				}

				float float5 = this.o(0.5F);
				float3 *= 0.2F + float5 * float5 * 0.8F;
				float4 *= float5;
				this.dh();
				if (float3 > 0.0F || float4 > 0.0F) {
					boolean boolean6 = float5 > 0.9F;
					boolean boolean7 = false;
					int integer8 = 0;
					integer8 += aik.b(this);
					if (this.aN() && boolean6) {
						this.l.a(null, this.p, this.q, this.r, nn.ex, this.bC(), 1.0F, 1.0F);
						integer8++;
						boolean7 = true;
					}

					boolean boolean9 = boolean6 && this.L > 0.0F && !this.z && !this.m_() && !this.aj() && !this.a(si.o) && !this.aK() && sn instanceof sw;
					boolean9 = boolean9 && !this.aN();
					if (boolean9) {
						float3 *= 1.5F;
					}

					float3 += float4;
					boolean boolean10 = false;
					double double11 = (double)(this.J - this.I);
					if (boolean6 && !boolean9 && !boolean7 && this.z && double11 < (double)this.cq()) {
						afj afj13 = this.b(ri.MAIN_HAND);
						if (afj13.c() instanceof agr) {
							boolean10 = true;
						}
					}

					float float13 = 0.0F;
					boolean boolean14 = false;
					int integer15 = aik.c(this);
					if (sn instanceof sw) {
						float13 = ((sw)sn).bU();
						if (integer15 > 0 && !sn.aJ()) {
							boolean14 = true;
							sn.i(1);
						}
					}

					double double16 = sn.s;
					double double18 = sn.t;
					double double20 = sn.u;
					boolean boolean22 = sn.a(ry.a(this), float3);
					if (boolean22) {
						if (integer8 > 0) {
							if (sn instanceof sw) {
								((sw)sn).a(this, (float)integer8 * 0.5F, (double)ot.a(this.v * (float) (Math.PI / 180.0)), (double)(-ot.b(this.v * (float) (Math.PI / 180.0))));
							} else {
								sn.f(
									(double)(-ot.a(this.v * (float) (Math.PI / 180.0)) * (float)integer8 * 0.5F),
									0.1,
									(double)(ot.b(this.v * (float) (Math.PI / 180.0)) * (float)integer8 * 0.5F)
								);
							}

							this.s *= 0.6;
							this.u *= 0.6;
							this.f(false);
						}

						if (boolean10) {
							float float23 = 1.0F + aik.a(this) * float3;

							for (sw sw26 : this.l.a(sw.class, sn.bo().c(1.0, 0.25, 1.0))) {
								if (sw26 != this && sw26 != sn && !this.r(sw26) && this.h(sw26) < 9.0) {
									sw26.a(this, 0.4F, (double)ot.a(this.v * (float) (Math.PI / 180.0)), (double)(-ot.b(this.v * (float) (Math.PI / 180.0))));
									sw26.a(ry.a(this), float23);
								}
							}

							this.l.a(null, this.p, this.q, this.r, nn.eA, this.bC(), 1.0F, 1.0F);
							this.cP();
						}

						if (sn instanceof ly && sn.D) {
							((ly)sn).a.a(new hu(sn));
							sn.D = false;
							sn.s = double16;
							sn.t = double18;
							sn.u = double20;
						}

						if (boolean9) {
							this.l.a(null, this.p, this.q, this.r, nn.ew, this.bC(), 1.0F, 1.0F);
							this.a(sn);
						}

						if (!boolean9 && !boolean10) {
							if (boolean6) {
								this.l.a(null, this.p, this.q, this.r, nn.ez, this.bC(), 1.0F, 1.0F);
							} else {
								this.l.a(null, this.p, this.q, this.r, nn.eB, this.bC(), 1.0F, 1.0F);
							}
						}

						if (float4 > 0.0F) {
							this.b(sn);
						}

						if (float3 >= 18.0F) {
							this.b(nr.F);
						}

						this.z(sn);
						if (sn instanceof sw) {
							aik.a((sw)sn, this);
						}

						aik.b(this, sn);
						afj afj23 = this.cg();
						sn sn24 = sn;
						if (sn instanceof xz) {
							xy xy25 = ((xz)sn).a;
							if (xy25 instanceof sw) {
								sn24 = (sw)xy25;
							}
						}

						if (!afj23.b() && sn24 instanceof sw) {
							afj23.a((sw)sn24, this);
							if (afj23.b()) {
								this.a(ri.MAIN_HAND, afj.a);
							}
						}

						if (sn instanceof sw) {
							float float25 = float13 - ((sw)sn).bU();
							this.a(oa.y, Math.round(float25 * 10.0F));
							if (integer15 > 0) {
								sn.i(integer15 * 4);
							}

							if (this.l instanceof lw && float25 > 2.0F) {
								int integer26 = (int)((double)float25 * 0.5);
								((lw)this.l).a(de.DAMAGE_INDICATOR, sn.p, sn.q + (double)(sn.H * 0.5F), sn.r, integer26, 0.1, 0.0, 0.1, 0.2);
							}
						}

						this.a(0.1F);
					} else {
						this.l.a(null, this.p, this.q, this.r, nn.ey, this.bC(), 1.0F, 1.0F);
						if (boolean14) {
							sn.X();
						}
					}
				}
			}
		}
	}

	public void m(boolean boolean1) {
		float float3 = 0.25F + (float)aik.f(this) * 0.05F;
		if (boolean1) {
			float3 += 0.75F;
		}

		if (this.S.nextFloat() < float3) {
			this.di().a(afl.cR, 100);
			this.cF();
			this.l.a(this, (byte)30);
		}
	}

	@Override
	public void a(sn sn) {
	}

	public void b(sn sn) {
	}

	public void cP() {
		double double2 = (double)(-ot.a(this.v * (float) (Math.PI / 180.0)));
		double double4 = (double)ot.b(this.v * (float) (Math.PI / 180.0));
		if (this.l instanceof lw) {
			((lw)this.l).a(de.SWEEP_ATTACK, this.p + double2, this.q + (double)this.H * 0.5, this.r + double4, 0, double2, 0.0, double4, 0.0);
		}
	}

	public void cQ() {
	}

	@Override
	public void T() {
		super.T();
		this.bt.b(this);
		if (this.bu != null) {
			this.bu.b(this);
		}
	}

	@Override
	public boolean av() {
		return !this.bG && super.av();
	}

	public boolean cR() {
		return false;
	}

	public GameProfile cS() {
		return this.bS;
	}

	public aay.a a(co co) {
		cv cv3 = this.l.o(co).c(aoi.D);
		if (!this.l.E) {
			if (this.cr() || !this.au()) {
				return aay.a.OTHER_PROBLEM;
			}

			if (!this.l.s.d()) {
				return aay.a.NOT_POSSIBLE_HERE;
			}

			if (this.l.B()) {
				return aay.a.NOT_POSSIBLE_NOW;
			}

			if (!this.a(co, cv3)) {
				return aay.a.TOO_FAR_AWAY;
			}

			double double4 = 8.0;
			double double6 = 5.0;
			List<aaa> list8 = this.l
				.a(aaa.class, new bdt((double)co.p() - 8.0, (double)co.q() - 5.0, (double)co.r() - 8.0, (double)co.p() + 8.0, (double)co.q() + 5.0, (double)co.r() + 8.0));
			if (!list8.isEmpty()) {
				return aay.a.NOT_SAFE;
			}
		}

		if (this.aK()) {
			this.p();
		}

		this.a(0.2F, 0.2F);
		if (this.l.e(co)) {
			float float4 = 0.5F + (float)cv3.g() * 0.4F;
			float float5 = 0.5F + (float)cv3.i() * 0.4F;
			this.a(cv3);
			this.b((double)((float)co.p() + float4), (double)((float)co.q() + 0.6875F), (double)((float)co.r() + float5));
		} else {
			this.b((double)((float)co.p() + 0.5F), (double)((float)co.q() + 0.6875F), (double)((float)co.r() + 0.5F));
		}

		this.bG = true;
		this.d = 0;
		this.bH = co;
		this.s = 0.0;
		this.t = 0.0;
		this.u = 0.0;
		if (!this.l.E) {
			this.l.e();
		}

		return aay.a.OK;
	}

	private boolean a(co co, cv cv) {
		if (Math.abs(this.p - (double)co.p()) <= 3.0 && Math.abs(this.q - (double)co.q()) <= 2.0 && Math.abs(this.r - (double)co.r()) <= 3.0) {
			return true;
		} else {
			co co4 = co.a(cv.d());
			return Math.abs(this.p - (double)co4.p()) <= 3.0 && Math.abs(this.q - (double)co4.q()) <= 2.0 && Math.abs(this.r - (double)co4.r()) <= 3.0;
		}
	}

	private void a(cv cv) {
		this.bI = -1.8F * (float)cv.g();
		this.bJ = -1.8F * (float)cv.i();
	}

	public void a(boolean boolean1, boolean boolean2, boolean boolean3) {
		this.a(0.6F, 1.8F);
		atl atl5 = this.l.o(this.bH);
		if (this.bH != null && atl5.v() == alv.C) {
			this.l.a(this.bH, atl5.a(als.b, false), 4);
			co co6 = als.a(this.l, this.bH, 0);
			if (co6 == null) {
				co6 = this.bH.a();
			}

			this.b((double)((float)co6.p() + 0.5F), (double)((float)co6.q() + 0.1F), (double)((float)co6.r() + 0.5F));
		}

		this.bG = false;
		if (!this.l.E && boolean2) {
			this.l.e();
		}

		this.d = boolean1 ? 0 : 100;
		if (boolean3) {
			this.a(this.bH, false);
		}
	}

	private boolean r() {
		return this.l.o(this.bH).v() == alv.C;
	}

	@Nullable
	public static co a(ajs ajs, co co, boolean boolean3) {
		alu alu4 = ajs.o(co).v();
		if (alu4 != alv.C) {
			if (!boolean3) {
				return null;
			} else {
				boolean boolean5 = alu4.d();
				boolean boolean6 = ajs.o(co.a()).v().d();
				return boolean5 && boolean6 ? co : null;
			}
		} else {
			return als.a(ajs, co, 0);
		}
	}

	public float cT() {
		if (this.bH != null) {
			cv cv2 = this.l.o(this.bH).c(aoi.D);
			switch (cv2) {
				case SOUTH:
					return 90.0F;
				case WEST:
					return 0.0F;
				case NORTH:
					return 270.0F;
				case EAST:
					return 180.0F;
			}
		}

		return 0.0F;
	}

	@Override
	public boolean cr() {
		return this.bG;
	}

	public boolean cU() {
		return this.bG && this.d >= 100;
	}

	public int cV() {
		return this.d;
	}

	public void a(fb fb, boolean boolean2) {
	}

	public co cW() {
		return this.e;
	}

	public boolean cX() {
		return this.f;
	}

	public void a(co co, boolean boolean2) {
		if (co != null) {
			this.e = co;
			this.f = boolean2;
		} else {
			this.e = null;
			this.f = false;
		}
	}

	public boolean a(nq nq) {
		return false;
	}

	public void b(nw nw) {
		this.a(nw, 1);
	}

	public void a(nw nw, int integer) {
	}

	public void a(nw nw) {
	}

	@Override
	public void cm() {
		super.cm();
		this.b(oa.w);
		if (this.aN()) {
			this.a(0.2F);
		} else {
			this.a(0.05F);
		}
	}

	@Override
	public void g(float float1, float float2) {
		double double4 = this.p;
		double double6 = this.q;
		double double8 = this.r;
		if (this.bK.b && !this.aK()) {
			double double10 = this.t;
			float float12 = this.aR;
			this.aR = this.bK.a() * (float)(this.aN() ? 2 : 1);
			super.g(float1, float2);
			this.t = double10 * 0.6;
			this.aR = float12;
			this.L = 0.0F;
			this.b(7, false);
		} else {
			super.g(float1, float2);
		}

		this.k(this.p - double4, this.q - double6, this.r - double8);
	}

	@Override
	public float cq() {
		return (float)this.a(aad.d).e();
	}

	public void k(double double1, double double2, double double3) {
		if (!this.aK()) {
			if (this.a(azs.h)) {
				int integer8 = Math.round(ot.a(double1 * double1 + double2 * double2 + double3 * double3) * 100.0F);
				if (integer8 > 0) {
					this.a(oa.q, integer8);
					this.a(0.01F * (float)integer8 * 0.01F);
				}
			} else if (this.aj()) {
				int integer8 = Math.round(ot.a(double1 * double1 + double3 * double3) * 100.0F);
				if (integer8 > 0) {
					this.a(oa.m, integer8);
					this.a(0.01F * (float)integer8 * 0.01F);
				}
			} else if (this.m_()) {
				if (double2 > 0.0) {
					this.a(oa.o, (int)Math.round(double2 * 100.0));
				}
			} else if (this.z) {
				int integer8 = Math.round(ot.a(double1 * double1 + double3 * double3) * 100.0F);
				if (integer8 > 0) {
					if (this.aN()) {
						this.a(oa.l, integer8);
						this.a(0.1F * (float)integer8 * 0.01F);
					} else if (this.aM()) {
						this.a(oa.k, integer8);
						this.a(0.0F * (float)integer8 * 0.01F);
					} else {
						this.a(oa.j, integer8);
						this.a(0.0F * (float)integer8 * 0.01F);
					}
				}
			} else if (this.cH()) {
				int integer8 = Math.round(ot.a(double1 * double1 + double2 * double2 + double3 * double3) * 100.0F);
				this.a(oa.v, integer8);
			} else {
				int integer8 = Math.round(ot.a(double1 * double1 + double3 * double3) * 100.0F);
				if (integer8 > 25) {
					this.a(oa.p, integer8);
				}
			}
		}
	}

	private void l(double double1, double double2, double double3) {
		if (this.aK()) {
			int integer8 = Math.round(ot.a(double1 * double1 + double2 * double2 + double3 * double3) * 100.0F);
			if (integer8 > 0) {
				if (this.bB() instanceof aby) {
					this.a(oa.r, integer8);
					if (this.g == null) {
						this.g = new co(this);
					} else if (this.g.f((double)ot.c(this.p), (double)ot.c(this.q), (double)ot.c(this.r)) >= 1000000.0) {
						this.b(nr.q);
					}
				} else if (this.bB() instanceof abx) {
					this.a(oa.s, integer8);
				} else if (this.bB() instanceof xc) {
					this.a(oa.t, integer8);
				} else if (this.bB() instanceof xm) {
					this.a(oa.u, integer8);
				}
			}
		}
	}

	@Override
	public void e(float float1, float float2) {
		if (!this.bK.c) {
			if (float1 >= 2.0F) {
				this.a(oa.n, (int)Math.round((double)float1 * 100.0));
			}

			super.e(float1, float2);
		}
	}

	@Override
	protected void al() {
		if (!this.y()) {
			super.al();
		}
	}

	@Override
	protected nm e(int integer) {
		return integer > 4 ? nn.eC : nn.eI;
	}

	@Override
	public void b(sw sw) {
		if (sw instanceof zt) {
			this.b(nr.s);
		}

		sp.a a3 = (sp.a)sp.c.get(sp.a(sw));
		if (a3 != null) {
			this.b(a3.d);
		}
	}

	@Override
	public void aS() {
		if (!this.bK.b) {
			super.aS();
		}
	}

	public void n(int integer) {
		this.m(integer);
		int integer3 = Integer.MAX_VALUE - this.bM;
		if (integer > integer3) {
			integer = integer3;
		}

		this.bN = this.bN + (float)integer / (float)this.cZ();

		for (this.bM += integer; this.bN >= 1.0F; this.bN = this.bN / (float)this.cZ()) {
			this.bN = (this.bN - 1.0F) * (float)this.cZ();
			this.a(1);
		}
	}

	public int cY() {
		return this.h;
	}

	public void b(int integer) {
		this.bL -= integer;
		if (this.bL < 0) {
			this.bL = 0;
			this.bN = 0.0F;
			this.bM = 0;
		}

		this.h = this.S.nextInt();
	}

	public void a(int integer) {
		this.bL += integer;
		if (this.bL < 0) {
			this.bL = 0;
			this.bN = 0.0F;
			this.bM = 0;
		}

		if (integer > 0 && this.bL % 5 == 0 && (float)this.bR < (float)this.T - 100.0F) {
			float float3 = this.bL > 30 ? 1.0F : (float)this.bL / 30.0F;
			this.l.a(null, this.p, this.q, this.r, nn.eH, this.bC(), float3 * 0.75F, 1.0F);
			this.bR = this.T;
		}
	}

	public int cZ() {
		if (this.bL >= 30) {
			return 112 + (this.bL - 30) * 9;
		} else {
			return this.bL >= 15 ? 37 + (this.bL - 15) * 5 : 7 + this.bL * 2;
		}
	}

	public void a(float float1) {
		if (!this.bK.a) {
			if (!this.l.E) {
				this.bv.a(float1);
			}
		}
	}

	public acj da() {
		return this.bv;
	}

	public boolean n(boolean boolean1) {
		return (boolean1 || this.bv.c()) && !this.bK.a;
	}

	public boolean db() {
		return this.bU() > 0.0F && this.bU() < this.cb();
	}

	public boolean dc() {
		return this.bK.e;
	}

	public boolean a(co co, cv cv, afj afj) {
		if (this.bK.e) {
			return true;
		} else if (afj.b()) {
			return false;
		} else {
			co co5 = co.a(cv.d());
			alu alu6 = this.l.o(co5).v();
			return afj.b(alu6) || afj.y();
		}
	}

	@Override
	protected int b(aay aay) {
		if (!this.l.U().b("keepInventory") && !this.y()) {
			int integer3 = this.bL * 7;
			return integer3 > 100 ? 100 : integer3;
		} else {
			return 0;
		}
	}

	@Override
	protected boolean bI() {
		return true;
	}

	@Override
	public boolean bk() {
		return true;
	}

	public void a(aay aay, boolean boolean2) {
		if (boolean2) {
			this.bs.a(aay.bs);
			this.c(aay.bU());
			this.bv = aay.bv;
			this.bL = aay.bL;
			this.bM = aay.bM;
			this.bN = aay.bN;
			this.g(aay.cM());
			this.an = aay.an;
			this.ao = aay.ao;
			this.ap = aay.ap;
		} else if (this.l.U().b("keepInventory") || aay.y()) {
			this.bs.a(aay.bs);
			this.bL = aay.bL;
			this.bM = aay.bM;
			this.bN = aay.bN;
			this.g(aay.cM());
		}

		this.h = aay.h;
		this.c = aay.c;
		this.R().b(bq, aay.R().a(bq));
	}

	@Override
	protected boolean af() {
		return !this.bK.b;
	}

	public void w() {
	}

	public void a(ajq ajq) {
	}

	@Override
	public String h_() {
		return this.bS.getName();
	}

	public adg dd() {
		return this.c;
	}

	@Override
	public afj b(ss ss) {
		if (ss == ss.MAINHAND) {
			return this.bs.i();
		} else if (ss == ss.OFFHAND) {
			return this.bs.c.get(0);
		} else {
			return ss.a() == ss.a.ARMOR ? this.bs.b.get(ss.b()) : afj.a;
		}
	}

	@Override
	public void a(ss ss, afj afj) {
		if (ss == ss.MAINHAND) {
			this.a_(afj);
			this.bs.a.set(this.bs.d, afj);
		} else if (ss == ss.OFFHAND) {
			this.a_(afj);
			this.bs.c.set(0, afj);
		} else if (ss.a() == ss.a.ARMOR) {
			this.a_(afj);
			this.bs.b.set(ss.b(), afj);
		}
	}

	public boolean c(afj afj) {
		this.a_(afj);
		return this.bs.c(afj);
	}

	@Override
	public Iterable<afj> aG() {
		return Lists.newArrayList(new afj[]{this.cg(), this.ch()});
	}

	@Override
	public Iterable<afj> aH() {
		return this.bs.b;
	}

	@Override
	public boolean e(aay aay) {
		if (!this.aP()) {
			return false;
		} else if (aay.y()) {
			return false;
		} else {
			bee bee3 = this.aQ();
			return bee3 == null || aay == null || aay.aQ() != bee3 || !bee3.h();
		}
	}

	public abstract boolean y();

	public abstract boolean z();

	@Override
	public boolean bg() {
		return !this.bK.b;
	}

	public bec de() {
		return this.l.ad();
	}

	@Override
	public bee aQ() {
		return this.de().g(this.h_());
	}

	@Override
	public fb i_() {
		fb fb2 = new fh(bdz.a(this.aQ(), this.h_()));
		fb2.b().a(new fa(fa.a.SUGGEST_COMMAND, "/msg " + this.h_() + " "));
		fb2.b().a(this.bn());
		fb2.b().a(this.h_());
		return fb2;
	}

	@Override
	public float bq() {
		float float2 = 1.62F;
		if (this.cr()) {
			float2 = 0.2F;
		} else if (this.aM() || this.H == 1.65F) {
			float2 -= 0.08F;
		} else if (this.cH() || this.H == 0.6F) {
			float2 = 0.4F;
		}

		return float2;
	}

	@Override
	public void n(float float1) {
		if (float1 < 0.0F) {
			float1 = 0.0F;
		}

		this.R().b(a, float1);
	}

	@Override
	public float cv() {
		return this.R().a(a);
	}

	public static UUID a(GameProfile gameProfile) {
		UUID uUID2 = gameProfile.getId();
		if (uUID2 == null) {
			uUID2 = d(gameProfile.getName());
		}

		return uUID2;
	}

	public static UUID d(String string) {
		return UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(Charsets.UTF_8));
	}

	public boolean a(rn rn) {
		if (rn.a()) {
			return true;
		} else {
			afj afj3 = this.cg();
			return !afj3.b() && afj3.t() ? afj3.r().equals(rn.b()) : false;
		}
	}

	public boolean a(aaz aaz) {
		return (this.R().a(bq) & aaz.a()) == aaz.a();
	}

	@Override
	public boolean g() {
		return this.B_().d[0].U().b("sendCommandFeedback");
	}

	@Override
	public boolean c(int integer, afj afj) {
		if (integer >= 0 && integer < this.bs.a.size()) {
			this.bs.a(integer, afj);
			return true;
		} else {
			ss ss4;
			if (integer == 100 + ss.HEAD.b()) {
				ss4 = ss.HEAD;
			} else if (integer == 100 + ss.CHEST.b()) {
				ss4 = ss.CHEST;
			} else if (integer == 100 + ss.LEGS.b()) {
				ss4 = ss.LEGS;
			} else if (integer == 100 + ss.FEET.b()) {
				ss4 = ss.FEET;
			} else {
				ss4 = null;
			}

			if (integer == 98) {
				this.a(ss.MAINHAND, afj);
				return true;
			} else if (integer == 99) {
				this.a(ss.OFFHAND, afj);
				return true;
			} else if (ss4 == null) {
				int integer5 = integer - 200;
				if (integer5 >= 0 && integer5 < this.c.v_()) {
					this.c.a(integer5, afj);
					return true;
				} else {
					return false;
				}
			} else {
				if (!afj.b()) {
					if (!(afj.c() instanceof adp) && !(afj.c() instanceof aeq)) {
						if (ss4 != ss.HEAD) {
							return false;
						}
					} else if (sx.d(afj) != ss4) {
						return false;
					}
				}

				this.bs.a(ss4.b() + this.bs.a.size(), afj);
				return true;
			}
		}
	}

	public boolean df() {
		return this.bT;
	}

	public void o(boolean boolean1) {
		this.bT = boolean1;
	}

	@Override
	public sv cx() {
		return this.Y.a(br) == 0 ? sv.LEFT : sv.RIGHT;
	}

	public void a(sv sv) {
		this.Y.b(br, (byte)(sv == sv.LEFT ? 0 : 1));
	}

	public float dg() {
		return (float)(1.0 / this.a(aad.f).e() * 20.0);
	}

	public float o(float float1) {
		return ot.a(((float)this.aE + float1) / this.dg(), 0.0F, 1.0F);
	}

	public void dh() {
		this.aE = 0;
	}

	public afi di() {
		return this.bV;
	}

	@Override
	public void i(sn sn) {
		if (!this.cr()) {
			super.i(sn);
		}
	}

	public float dj() {
		return (float)this.a(aad.i).e();
	}

	public boolean dk() {
		return this.bK.d && this.a(2, "");
	}

	public static enum a {
		OK,
		NOT_POSSIBLE_HERE,
		NOT_POSSIBLE_NOW,
		TOO_FAR_AWAY,
		OTHER_PROBLEM,
		NOT_SAFE;
	}

	public static enum b {
		FULL(0, "options.chat.visibility.full"),
		SYSTEM(1, "options.chat.visibility.system"),
		HIDDEN(2, "options.chat.visibility.hidden");

		private static final aay.b[] d = new aay.b[values().length];
		private final int e;
		private final String f;

		private b(int integer3, String string4) {
			this.e = integer3;
			this.f = string4;
		}

		public int a() {
			return this.e;
		}

		public static aay.b a(int integer) {
			return d[integer % d.length];
		}

		public String b() {
			return this.f;
		}

		static {
			for (aay.b b4 : values()) {
				d[b4.e] = b4;
			}
		}
	}
}

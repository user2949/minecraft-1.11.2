import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class xm extends ww implements re, tg {
	private static final Predicate<sn> bG = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn instanceof xm && ((xm)sn).dv();
		}
	};
	protected static final tj bw = new tq(null, "horse.jumpStrength", 0.7, 0.0, 2.0).a("Jump Strength").a(true);
	private static final kk<Byte> bH = kn.a(xm.class, km.a);
	private static final kk<Optional<UUID>> bI = kn.a(xm.class, km.m);
	private int bJ;
	private int bK;
	private int bL;
	public int bx;
	public int by;
	protected boolean bA;
	protected ada bB;
	protected int bC;
	protected float bD;
	private boolean bM;
	private float bN;
	private float bO;
	private float bP;
	private float bQ;
	private float bR;
	private float bS;
	protected boolean bE = true;
	protected int bF;

	public xm(ajs ajs) {
		super(ajs);
		this.a(1.3964844F, 1.6F);
		this.P = 1.0F;
		this.dx();
	}

	@Override
	protected void r() {
		this.bq.a(0, new uf(this));
		this.bq.a(1, new vb(this, 1.2));
		this.bq.a(1, new vk(this, 1.2));
		this.bq.a(2, new ub(this, 1.0, xm.class));
		this.bq.a(4, new uh(this, 1.0));
		this.bq.a(6, new vr(this, 0.7));
		this.bq.a(7, new uo(this, aay.class, 6.0F));
		this.bq.a(8, new ve(this));
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bH, (byte)0);
		this.Y.a(bI, Optional.absent());
	}

	protected boolean g(int integer) {
		return (this.Y.a(bH) & integer) != 0;
	}

	protected void c(int integer, boolean boolean2) {
		byte byte4 = this.Y.a(bH);
		if (boolean2) {
			this.Y.b(bH, (byte)(byte4 | integer));
		} else {
			this.Y.b(bH, (byte)(byte4 & ~integer));
		}
	}

	public boolean dp() {
		return this.g(2);
	}

	@Nullable
	public UUID dq() {
		return (UUID)this.Y.a(bI).orNull();
	}

	public void b(@Nullable UUID uUID) {
		this.Y.b(bI, Optional.fromNullable(uUID));
	}

	public float dr() {
		return 0.5F;
	}

	@Override
	public void a(boolean boolean1) {
		this.a(boolean1 ? this.dr() : 1.0F);
	}

	public boolean ds() {
		return this.bA;
	}

	public void q(boolean boolean1) {
		this.c(2, boolean1);
	}

	public void r(boolean boolean1) {
		this.bA = boolean1;
	}

	@Override
	public boolean a(aay aay) {
		return super.a(aay) && this.cf() != tb.UNDEAD;
	}

	@Override
	protected void q(float float1) {
		if (float1 > 6.0F && this.dt()) {
			this.u(false);
		}
	}

	public boolean dt() {
		return this.g(16);
	}

	public boolean du() {
		return this.g(32);
	}

	public boolean dv() {
		return this.g(8);
	}

	public void s(boolean boolean1) {
		this.c(8, boolean1);
	}

	public void t(boolean boolean1) {
		this.c(4, boolean1);
	}

	public int dw() {
		return this.bC;
	}

	public void m(int integer) {
		this.bC = integer;
	}

	public int n(int integer) {
		int integer3 = ot.a(this.dw() + integer, 0, this.dC());
		this.m(integer3);
		return integer3;
	}

	@Override
	public boolean a(ry ry, float float2) {
		sn sn4 = ry.j();
		return this.aL() && sn4 != null && this.y(sn4) ? false : super.a(ry, float2);
	}

	@Override
	public boolean ar() {
		return !this.aL();
	}

	private void dh() {
		this.dl();
		if (!this.ad()) {
			this.l.a(null, this.p, this.q, this.r, nn.cE, this.bC(), 1.0F, 1.0F + (this.S.nextFloat() - this.S.nextFloat()) * 0.2F);
		}
	}

	@Override
	public void e(float float1, float float2) {
		if (float1 > 1.0F) {
			this.a(nn.cI, 0.4F, 1.0F);
		}

		int integer4 = ot.f((float1 * 0.5F - 3.0F) * float2);
		if (integer4 > 0) {
			this.a(ry.k, (float)integer4);
			if (this.aL()) {
				for (sn sn6 : this.by()) {
					sn6.a(ry.k, (float)integer4);
				}
			}

			atl atl5 = this.l.o(new co(this.p, this.q - 0.2 - (double)this.x, this.r));
			alu alu6 = atl5.v();
			if (atl5.a() != azs.a && !this.ad()) {
				aqu aqu7 = alu6.v();
				this.l.a(null, this.p, this.q, this.r, aqu7.d(), this.bC(), aqu7.a() * 0.5F, aqu7.b() * 0.75F);
			}
		}
	}

	protected int di() {
		return 2;
	}

	protected void dx() {
		ada ada2 = this.bB;
		this.bB = new ada("HorseChest", this.di());
		this.bB.a(this.h_());
		if (ada2 != null) {
			ada2.b(this);
			int integer3 = Math.min(ada2.v_(), this.bB.v_());

			for (int integer4 = 0; integer4 < integer3; integer4++) {
				afj afj5 = ada2.a(integer4);
				if (!afj5.b()) {
					this.bB.a(integer4, afj5.l());
				}
			}
		}

		this.bB.a(this);
		this.dy();
	}

	protected void dy() {
		if (!this.l.E) {
			this.t(!this.bB.a(0).b() && this.dA());
		}
	}

	@Override
	public void a(rc rc) {
		boolean boolean3 = this.dB();
		this.dy();
		if (this.T > 20 && !boolean3 && this.dB()) {
			this.a(nn.cJ, 0.5F, 1.0F);
		}
	}

	@Nullable
	protected xm a(sn sn, double double2) {
		// $VF: Couldn't be decompiled
		// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
		//
		// Bytecode:
		// 00: ldc2_w 1.7976931348623157E308
		// 03: dstore 4
		// 05: aconst_null
		// 06: astore 6
		// 08: aload 0
		// 09: getfield xm.l Lajs;
		// 0c: aload 1
		// 0d: aload 1
		// 0e: invokevirtual sn.bo ()Lbdt;
		// 11: dload 2
		// 12: dload 2
		// 13: dload 2
		// 14: invokevirtual bdt.b (DDD)Lbdt;
		// 17: getstatic xm.bG Lcom/google/common/base/Predicate;
		// 1a: invokevirtual ajs.a (Lsn;Lbdt;Lcom/google/common/base/Predicate;)Ljava/util/List;
		// 1d: astore 7
		// 1f: aload 7
		// 21: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
		// 26: astore 8
		// 28: aload 8
		// 2a: invokeinterface java/util/Iterator.hasNext ()Z 1
		// 2f: ifeq 64
		// 32: aload 8
		// 34: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
		// 39: checkcast sn
		// 3c: astore 9
		// 3e: aload 9
		// 40: aload 1
		// 41: getfield sn.p D
		// 44: aload 1
		// 45: getfield sn.q D
		// 48: aload 1
		// 49: getfield sn.r D
		// 4c: invokevirtual sn.d (DDD)D
		// 4f: dstore 10
		// 51: dload 10
		// 53: dload 4
		// 55: dcmpg
		// 56: ifge 61
		// 59: aload 9
		// 5b: astore 6
		// 5d: dload 10
		// 5f: dstore 4
		// 61: goto 28
		// 64: aload 6
		// 66: checkcast xm
		// 69: areturn
	}

	public double dz() {
		return this.a(bw).e();
	}

	@Nullable
	@Override
	protected nm bX() {
		this.dl();
		return null;
	}

	@Nullable
	@Override
	protected nm bW() {
		this.dl();
		if (this.S.nextInt(3) == 0) {
			this.dL();
		}

		return null;
	}

	@Nullable
	@Override
	protected nm G() {
		this.dl();
		if (this.S.nextInt(10) == 0 && !this.ck()) {
			this.dL();
		}

		return null;
	}

	public boolean dA() {
		return true;
	}

	public boolean dB() {
		return this.g(4);
	}

	@Nullable
	protected nm dj() {
		this.dl();
		this.dL();
		return null;
	}

	@Override
	protected void a(co co, alu alu) {
		if (!alu.t().a().d()) {
			aqu aqu4 = alu.v();
			if (this.l.o(co.a()).v() == alv.aH) {
				aqu4 = alv.aH.v();
			}

			if (this.aL() && this.bE) {
				this.bF++;
				if (this.bF > 5 && this.bF % 3 == 0) {
					this.a(aqu4);
				} else if (this.bF <= 5) {
					this.a(nn.cL, aqu4.a() * 0.15F, aqu4.b());
				}
			} else if (aqu4 == aqu.a) {
				this.a(nn.cL, aqu4.a() * 0.15F, aqu4.b());
			} else {
				this.a(nn.cK, aqu4.a() * 0.15F, aqu4.b());
			}
		}
	}

	protected void a(aqu aqu) {
		this.a(nn.cF, aqu.a() * 0.15F, aqu.b());
	}

	@Override
	protected void bE() {
		super.bE();
		this.ce().b(bw);
		this.a(aad.a).a(53.0);
		this.a(aad.d).a(0.225F);
	}

	@Override
	public int cQ() {
		return 6;
	}

	public int dC() {
		return 100;
	}

	@Override
	protected float ci() {
		return 0.8F;
	}

	@Override
	public int C() {
		return 400;
	}

	public void f(aay aay) {
		if (!this.l.E && (!this.aL() || this.w(aay)) && this.dp()) {
			this.bB.a(this.h_());
			aay.a(this, this.bB);
		}
	}

	protected boolean b(aay aay, afj afj) {
		boolean boolean4 = false;
		float float5 = 0.0F;
		int integer6 = 0;
		int integer7 = 0;
		afh afh8 = afj.c();
		if (afh8 == afl.R) {
			float5 = 2.0F;
			integer6 = 20;
			integer7 = 3;
		} else if (afh8 == afl.bg) {
			float5 = 1.0F;
			integer6 = 30;
			integer7 = 3;
		} else if (afh8 == afh.a(alv.cx)) {
			float5 = 20.0F;
			integer6 = 180;
		} else if (afh8 == afl.f) {
			float5 = 3.0F;
			integer6 = 60;
			integer7 = 3;
		} else if (afh8 == afl.ch) {
			float5 = 4.0F;
			integer6 = 60;
			integer7 = 5;
			if (this.dp() && this.l() == 0 && !this.dn()) {
				boolean4 = true;
				this.c(aay);
			}
		} else if (afh8 == afl.ar) {
			float5 = 10.0F;
			integer6 = 240;
			integer7 = 10;
			if (this.dp() && this.l() == 0 && !this.dn()) {
				boolean4 = true;
				this.c(aay);
			}
		}

		if (this.bU() < this.cb() && float5 > 0.0F) {
			this.b(float5);
			boolean4 = true;
		}

		if (this.l_() && integer6 > 0) {
			this.l
				.a(
					de.VILLAGER_HAPPY,
					this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
					this.q + 0.5 + (double)(this.S.nextFloat() * this.H),
					this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
					0.0,
					0.0,
					0.0
				);
			if (!this.l.E) {
				this.a(integer6);
			}

			boolean4 = true;
		}

		if (integer7 > 0 && (boolean4 || !this.dp()) && this.dw() < this.dC()) {
			boolean4 = true;
			if (!this.l.E) {
				this.n(integer7);
			}
		}

		if (boolean4) {
			this.dh();
		}

		return boolean4;
	}

	protected void g(aay aay) {
		aay.v = this.v;
		aay.w = this.w;
		this.u(false);
		this.v(false);
		if (!this.l.E) {
			aay.m(this);
		}
	}

	@Override
	protected boolean ck() {
		return super.ck() && this.aL() && this.dB() || this.dt() || this.du();
	}

	@Override
	public boolean e(afj afj) {
		return false;
	}

	private void dk() {
		this.bx = 1;
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (!this.l.E && this.bB != null) {
			for (int integer3 = 0; integer3 < this.bB.v_(); integer3++) {
				afj afj4 = this.bB.a(integer3);
				if (!afj4.b()) {
					this.a(afj4, 0.0F);
				}
			}
		}
	}

	@Override
	public void n() {
		if (this.S.nextInt(200) == 0) {
			this.dk();
		}

		super.n();
		if (!this.l.E) {
			if (this.S.nextInt(900) == 0 && this.aB == 0) {
				this.b(1.0F);
			}

			if (this.dE()) {
				if (!this.dt() && !this.aL() && this.S.nextInt(300) == 0 && this.l.o(new co(ot.c(this.p), ot.c(this.q) - 1, ot.c(this.r))).v() == alv.c) {
					this.u(true);
				}

				if (this.dt() && ++this.bJ > 50) {
					this.bJ = 0;
					this.u(false);
				}
			}

			this.dD();
		}
	}

	protected void dD() {
		if (this.dv() && this.l_() && !this.dt()) {
			xm xm2 = this.a(this, 16.0);
			if (xm2 != null && this.h(xm2) > 4.0) {
				this.h.a(xm2);
			}
		}
	}

	public boolean dE() {
		return true;
	}

	@Override
	public void A_() {
		super.A_();
		if (this.bK > 0 && ++this.bK > 30) {
			this.bK = 0;
			this.c(64, false);
		}

		if (this.bA() && this.bL > 0 && ++this.bL > 20) {
			this.bL = 0;
			this.v(false);
		}

		if (this.bx > 0 && ++this.bx > 8) {
			this.bx = 0;
		}

		if (this.by > 0) {
			this.by++;
			if (this.by > 300) {
				this.by = 0;
			}
		}

		this.bO = this.bN;
		if (this.dt()) {
			this.bN = this.bN + (1.0F - this.bN) * 0.4F + 0.05F;
			if (this.bN > 1.0F) {
				this.bN = 1.0F;
			}
		} else {
			this.bN = this.bN + ((0.0F - this.bN) * 0.4F - 0.05F);
			if (this.bN < 0.0F) {
				this.bN = 0.0F;
			}
		}

		this.bQ = this.bP;
		if (this.du()) {
			this.bN = 0.0F;
			this.bO = this.bN;
			this.bP = this.bP + (1.0F - this.bP) * 0.4F + 0.05F;
			if (this.bP > 1.0F) {
				this.bP = 1.0F;
			}
		} else {
			this.bM = false;
			this.bP = this.bP + ((0.8F * this.bP * this.bP * this.bP - this.bP) * 0.6F - 0.05F);
			if (this.bP < 0.0F) {
				this.bP = 0.0F;
			}
		}

		this.bS = this.bR;
		if (this.g(64)) {
			this.bR = this.bR + (1.0F - this.bR) * 0.7F + 0.05F;
			if (this.bR > 1.0F) {
				this.bR = 1.0F;
			}
		} else {
			this.bR = this.bR + ((0.0F - this.bR) * 0.7F - 0.05F);
			if (this.bR < 0.0F) {
				this.bR = 0.0F;
			}
		}
	}

	private void dl() {
		if (!this.l.E) {
			this.bK = 1;
			this.c(64, true);
		}
	}

	public void u(boolean boolean1) {
		this.c(16, boolean1);
	}

	public void v(boolean boolean1) {
		if (boolean1) {
			this.u(false);
		}

		this.c(32, boolean1);
	}

	private void dL() {
		if (this.bA()) {
			this.bL = 1;
			this.v(true);
		}
	}

	public void dF() {
		this.dL();
		nm nm2 = this.dj();
		if (nm2 != null) {
			this.a(nm2, this.ci(), this.cj());
		}
	}

	public boolean h(aay aay) {
		this.b(aay.be());
		this.q(true);
		this.l.a(this, (byte)7);
		return true;
	}

	@Override
	public void g(float float1, float float2) {
		if (this.aL() && this.cR() && this.dB()) {
			sw sw4 = (sw)this.bw();
			this.v = sw4.v;
			this.x = this.v;
			this.w = sw4.w * 0.5F;
			this.b(this.v, this.w);
			this.aN = this.v;
			this.aP = this.aN;
			float1 = sw4.be * 0.5F;
			float2 = sw4.bf;
			if (float2 <= 0.0F) {
				float2 *= 0.25F;
				this.bF = 0;
			}

			if (this.z && this.bD == 0.0F && this.du() && !this.bM) {
				float1 = 0.0F;
				float2 = 0.0F;
			}

			if (this.bD > 0.0F && !this.ds() && this.z) {
				this.t = this.dz() * (double)this.bD;
				if (this.a(si.h)) {
					this.t = this.t + (double)((float)(this.b(si.h).c() + 1) * 0.1F);
				}

				this.r(true);
				this.ai = true;
				if (float2 > 0.0F) {
					float float5 = ot.a(this.v * (float) (Math.PI / 180.0));
					float float6 = ot.b(this.v * (float) (Math.PI / 180.0));
					this.s = this.s + (double)(-0.4F * float5 * this.bD);
					this.u = this.u + (double)(0.4F * float6 * this.bD);
					this.a(nn.cH, 0.4F, 1.0F);
				}

				this.bD = 0.0F;
			}

			this.aR = this.cq() * 0.1F;
			if (this.bA()) {
				this.l((float)this.a(aad.d).e());
				super.g(float1, float2);
			} else if (sw4 instanceof aay) {
				this.s = 0.0;
				this.t = 0.0;
				this.u = 0.0;
			}

			if (this.z) {
				this.bD = 0.0F;
				this.r(false);
			}

			this.aF = this.aG;
			double double5 = this.p - this.m;
			double double7 = this.r - this.o;
			float float9 = ot.a(double5 * double5 + double7 * double7) * 4.0F;
			if (float9 > 1.0F) {
				float9 = 1.0F;
			}

			this.aG = this.aG + (float9 - this.aG) * 0.4F;
			this.aH = this.aH + this.aG;
		} else {
			this.aR = 0.02F;
			super.g(float1, float2);
		}
	}

	public static void c(ph ph, Class<?> class2) {
		sx.a(ph, class2);
		ph.a(pf.ENTITY, new qr(class2, "SaddleItem"));
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("EatingHaystack", this.dt());
		du.a("Bred", this.dv());
		du.a("Temper", this.dw());
		du.a("Tame", this.dp());
		if (this.dq() != null) {
			du.a("OwnerUUID", this.dq().toString());
		}

		if (!this.bB.a(0).b()) {
			du.a("SaddleItem", this.bB.a(0).a(new du()));
		}
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.u(du.p("EatingHaystack"));
		this.s(du.p("Bred"));
		this.m(du.h("Temper"));
		this.q(du.p("Tame"));
		String string3;
		if (du.b("OwnerUUID", 8)) {
			string3 = du.l("OwnerUUID");
		} else {
			String string4 = du.l("Owner");
			string3 = ms.a(this.B_(), string4);
		}

		if (!string3.isEmpty()) {
			this.b(UUID.fromString(string3));
		}

		tk tk4 = this.ce().a("Speed");
		if (tk4 != null) {
			this.a(aad.d).a(tk4.b() * 0.25);
		}

		if (du.b("SaddleItem", 10)) {
			afj afj5 = new afj(du.o("SaddleItem"));
			if (afj5.c() == afl.aD) {
				this.bB.a(0, afj5);
			}
		}

		this.dy();
	}

	@Override
	public boolean a(ww ww) {
		return false;
	}

	protected boolean dG() {
		return !this.aL() && !this.aK() && this.dp() && !this.l_() && this.bU() >= this.cb() && this.dn();
	}

	@Nullable
	@Override
	public sk a(sk sk) {
		return null;
	}

	protected void a(sk sk, xm xm) {
		double double4 = this.a(aad.a).b() + sk.a(aad.a).b() + (double)this.dH();
		xm.a(aad.a).a(double4 / 3.0);
		double double6 = this.a(bw).b() + sk.a(bw).b() + this.dI();
		xm.a(bw).a(double6 / 3.0);
		double double8 = this.a(aad.d).b() + sk.a(aad.d).b() + this.dJ();
		xm.a(aad.d).a(double8 / 3.0);
	}

	@Override
	public boolean cR() {
		return this.bw() instanceof sw;
	}

	public float r(float float1) {
		return this.bO + (this.bN - this.bO) * float1;
	}

	public float s(float float1) {
		return this.bQ + (this.bP - this.bQ) * float1;
	}

	public float t(float float1) {
		return this.bS + (this.bR - this.bS) * float1;
	}

	@Override
	public void a_(int integer) {
		if (this.dB()) {
			if (integer < 0) {
				integer = 0;
			} else {
				this.bM = true;
				this.dL();
			}

			if (integer >= 90) {
				this.bD = 1.0F;
			} else {
				this.bD = 0.4F + 0.4F * (float)integer / 90.0F;
			}
		}
	}

	@Override
	public boolean a() {
		return this.dB();
	}

	@Override
	public void b(int integer) {
		this.bM = true;
		this.dL();
	}

	@Override
	public void q_() {
	}

	protected void w(boolean boolean1) {
		de de3 = boolean1 ? de.HEART : de.SMOKE_NORMAL;

		for (int integer4 = 0; integer4 < 7; integer4++) {
			double double5 = this.S.nextGaussian() * 0.02;
			double double7 = this.S.nextGaussian() * 0.02;
			double double9 = this.S.nextGaussian() * 0.02;
			this.l
				.a(
					de3,
					this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
					this.q + 0.5 + (double)(this.S.nextFloat() * this.H),
					this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
					double5,
					double7,
					double9
				);
		}
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 7) {
			this.w(true);
		} else if (byte1 == 6) {
			this.w(false);
		} else {
			super.a(byte1);
		}
	}

	@Override
	public void k(sn sn) {
		super.k(sn);
		if (sn instanceof sx) {
			sx sx3 = (sx)sn;
			this.aN = sx3.aN;
		}

		if (this.bQ > 0.0F) {
			float float3 = ot.a(this.aN * (float) (Math.PI / 180.0));
			float float4 = ot.b(this.aN * (float) (Math.PI / 180.0));
			float float5 = 0.7F * this.bQ;
			float float6 = 0.15F * this.bQ;
			sn.b(this.p + (double)(float5 * float3), this.q + this.ay() + sn.ax() + (double)float6, this.r - (double)(float5 * float4));
			if (sn instanceof sw) {
				((sw)sn).aN = this.aN;
			}
		}
	}

	protected float dH() {
		return 15.0F + (float)this.S.nextInt(8) + (float)this.S.nextInt(9);
	}

	protected double dI() {
		return 0.4F + this.S.nextDouble() * 0.2 + this.S.nextDouble() * 0.2 + this.S.nextDouble() * 0.2;
	}

	protected double dJ() {
		return (0.45F + this.S.nextDouble() * 0.3 + this.S.nextDouble() * 0.3 + this.S.nextDouble() * 0.3) * 0.25;
	}

	@Override
	public boolean m_() {
		return false;
	}

	@Override
	public float bq() {
		return this.H;
	}

	public boolean dK() {
		return false;
	}

	public boolean f(afj afj) {
		return false;
	}

	@Override
	public boolean c(int integer, afj afj) {
		int integer4 = integer - 400;
		if (integer4 >= 0 && integer4 < 2 && integer4 < this.bB.v_()) {
			if (integer4 == 0 && afj.c() != afl.aD) {
				return false;
			} else if (integer4 != 1 || this.dK() && this.f(afj)) {
				this.bB.a(integer4, afj);
				this.dy();
				return true;
			} else {
				return false;
			}
		} else {
			int integer5 = integer - 500 + 2;
			if (integer5 >= 2 && integer5 < this.bB.v_()) {
				this.bB.a(integer5, afj);
				return true;
			} else {
				return false;
			}
		}
	}

	@Nullable
	@Override
	public sn bw() {
		return this.bx().isEmpty() ? null : (sn)this.bx().get(0);
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz = super.a(rh, sz);
		if (this.S.nextInt(5) == 0) {
			this.b_(-24000);
		}

		return sz;
	}
}

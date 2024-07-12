import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class sx extends sw {
	private static final kk<Byte> a = kn.a(sx.class, km.a);
	public int a_;
	protected int b_;
	private final tv b;
	protected tw f;
	protected tu g;
	private final ts c;
	protected wf h;
	protected final uj bq;
	protected final uj br;
	private sw bu;
	private final wk bv;
	private final dd<afj> bw = dd.a(2, afj.a);
	protected float[] bs = new float[2];
	private final dd<afj> bx = dd.a(4, afj.a);
	protected float[] bt = new float[4];
	private boolean by;
	private boolean bz;
	private final Map<bba, Float> bA = Maps.newEnumMap(bba.class);
	private kq bB;
	private long bC;
	private boolean bD;
	private sn bE;
	private du bF;

	public sx(ajs ajs) {
		super(ajs);
		this.bq = new uj(ajs != null && ajs.C != null ? ajs.C : null);
		this.br = new uj(ajs != null && ajs.C != null ? ajs.C : null);
		this.b = new tv(this);
		this.f = new tw(this);
		this.g = new tu(this);
		this.c = this.s();
		this.h = this.b(ajs);
		this.bv = new wk(this);
		Arrays.fill(this.bt, 0.085F);
		Arrays.fill(this.bs, 0.085F);
		if (ajs != null && !ajs.E) {
			this.r();
		}
	}

	@Override
	protected void r() {
	}

	@Override
	protected void bE() {
		super.bE();
		this.ce().b(aad.b).a(16.0);
	}

	protected wf b(ajs ajs) {
		return new we(this, ajs);
	}

	public float a(bba bba) {
		Float float3 = (Float)this.bA.get(bba);
		return float3 == null ? bba.a() : float3;
	}

	public void a(bba bba, float float2) {
		this.bA.put(bba, float2);
	}

	protected ts s() {
		return new ts(this);
	}

	public tv t() {
		return this.b;
	}

	public tw u() {
		return this.f;
	}

	public tu w() {
		return this.g;
	}

	public wf x() {
		return this.h;
	}

	public wk y() {
		return this.bv;
	}

	@Nullable
	public sw z() {
		return this.bu;
	}

	public void d(@Nullable sw sw) {
		this.bu = sw;
	}

	public boolean d(Class<? extends sw> class1) {
		return class1 != zv.class;
	}

	public void A() {
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, (byte)0);
	}

	public int C() {
		return 80;
	}

	public void D() {
		nm nm2 = this.G();
		if (nm2 != null) {
			this.a(nm2, this.ci(), this.cj());
		}
	}

	@Override
	public void U() {
		super.U();
		this.l.C.a("mobBaseTick");
		if (this.au() && this.S.nextInt(1000) < this.a_++) {
			this.o();
			this.D();
		}

		this.l.C.b();
	}

	@Override
	protected void c(ry ry) {
		this.o();
		super.c(ry);
	}

	private void o() {
		this.a_ = -this.C();
	}

	@Override
	protected int b(aay aay) {
		if (this.b_ > 0) {
			int integer3 = this.b_;

			for (int integer4 = 0; integer4 < this.bx.size(); integer4++) {
				if (!this.bx.get(integer4).b() && this.bt[integer4] <= 1.0F) {
					integer3 += 1 + this.S.nextInt(3);
				}
			}

			for (int integer4x = 0; integer4x < this.bw.size(); integer4x++) {
				if (!this.bw.get(integer4x).b() && this.bs[integer4x] <= 1.0F) {
					integer3 += 1 + this.S.nextInt(3);
				}
			}

			return integer3;
		} else {
			return this.b_;
		}
	}

	public void E() {
		if (this.l.E) {
			for (int integer2 = 0; integer2 < 20; integer2++) {
				double double3 = this.S.nextGaussian() * 0.02;
				double double5 = this.S.nextGaussian() * 0.02;
				double double7 = this.S.nextGaussian() * 0.02;
				double double9 = 10.0;
				this.l
					.a(
						de.EXPLOSION_NORMAL,
						this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G - double3 * 10.0,
						this.q + (double)(this.S.nextFloat() * this.H) - double5 * 10.0,
						this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G - double7 * 10.0,
						double3,
						double5,
						double7
					);
			}
		} else {
			this.l.a(this, (byte)20);
		}
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 20) {
			this.E();
		} else {
			super.a(byte1);
		}
	}

	@Override
	public void A_() {
		super.A_();
		if (!this.l.E) {
			this.cV();
			if (this.T % 5 == 0) {
				boolean boolean2 = !(this.bw() instanceof sx);
				boolean boolean3 = !(this.bB() instanceof abx);
				this.bq.a(1, boolean2);
				this.bq.a(4, boolean2 && boolean3);
				this.bq.a(2, boolean2);
			}
		}
	}

	@Override
	protected float h(float float1, float float2) {
		this.c.a();
		return float2;
	}

	@Nullable
	protected nm G() {
		return null;
	}

	@Nullable
	protected afh I() {
		return null;
	}

	@Override
	protected void b(boolean boolean1, int integer) {
		afh afh4 = this.I();
		if (afh4 != null) {
			int integer5 = this.S.nextInt(3);
			if (integer > 0) {
				integer5 += this.S.nextInt(integer + 1);
			}

			for (int integer6 = 0; integer6 < integer5; integer6++) {
				this.a(afh4, 1);
			}
		}
	}

	public static void a(ph ph, Class<?> class2) {
		ph.a(pf.ENTITY, new qu(class2, "ArmorItems", "HandItems"));
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("CanPickUpLoot", this.cT());
		du.a("PersistenceRequired", this.bz);
		ea ea3 = new ea();

		for (afj afj5 : this.bx) {
			du du6 = new du();
			if (!afj5.b()) {
				afj5.a(du6);
			}

			ea3.a(du6);
		}

		du.a("ArmorItems", ea3);
		ea ea4 = new ea();

		for (afj afj6 : this.bw) {
			du du7 = new du();
			if (!afj6.b()) {
				afj6.a(du7);
			}

			ea4.a(du7);
		}

		du.a("HandItems", ea4);
		ea ea5 = new ea();

		for (float float9 : this.bt) {
			ea5.a(new dx(float9));
		}

		du.a("ArmorDropChances", ea5);
		ea ea6 = new ea();

		for (float float10 : this.bs) {
			ea6.a(new dx(float10));
		}

		du.a("HandDropChances", ea6);
		du.a("Leashed", this.bD);
		if (this.bE != null) {
			du du7 = new du();
			if (this.bE instanceof sw) {
				UUID uUID8 = this.bE.be();
				du7.a("UUID", uUID8);
			} else if (this.bE instanceof yy) {
				co co8 = ((yy)this.bE).q();
				du7.a("X", co8.p());
				du7.a("Y", co8.q());
				du7.a("Z", co8.r());
			}

			du.a("Leash", du7);
		}

		du.a("LeftHanded", this.cZ());
		if (this.bB != null) {
			du.a("DeathLootTable", this.bB.toString());
			if (this.bC != 0L) {
				du.a("DeathLootTableSeed", this.bC);
			}
		}

		if (this.cY()) {
			du.a("NoAI", this.cY());
		}
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.b("CanPickUpLoot", 1)) {
			this.m(du.p("CanPickUpLoot"));
		}

		this.bz = du.p("PersistenceRequired");
		if (du.b("ArmorItems", 9)) {
			ea ea3 = du.c("ArmorItems", 10);

			for (int integer4 = 0; integer4 < this.bx.size(); integer4++) {
				this.bx.set(integer4, new afj(ea3.b(integer4)));
			}
		}

		if (du.b("HandItems", 9)) {
			ea ea3 = du.c("HandItems", 10);

			for (int integer4 = 0; integer4 < this.bw.size(); integer4++) {
				this.bw.set(integer4, new afj(ea3.b(integer4)));
			}
		}

		if (du.b("ArmorDropChances", 9)) {
			ea ea3 = du.c("ArmorDropChances", 5);

			for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
				this.bt[integer4] = ea3.f(integer4);
			}
		}

		if (du.b("HandDropChances", 9)) {
			ea ea3 = du.c("HandDropChances", 5);

			for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
				this.bs[integer4] = ea3.f(integer4);
			}
		}

		this.bD = du.p("Leashed");
		if (this.bD && du.b("Leash", 10)) {
			this.bF = du.o("Leash");
		}

		this.o(du.p("LeftHanded"));
		if (du.b("DeathLootTable", 8)) {
			this.bB = new kq(du.l("DeathLootTable"));
			this.bC = du.i("DeathLootTableSeed");
		}

		this.n(du.p("NoAI"));
	}

	@Nullable
	protected kq J() {
		return null;
	}

	@Override
	protected void a(boolean boolean1, int integer, ry ry) {
		kq kq5 = this.bB;
		if (kq5 == null) {
			kq5 = this.J();
		}

		if (kq5 != null) {
			bck bck6 = this.l.ak().a(kq5);
			this.bB = null;
			bcl.a a7 = new bcl.a((lw)this.l).a(this).a(ry);
			if (boolean1 && this.aS != null) {
				a7 = a7.a(this.aS).a(this.aS.dj());
			}

			for (afj afj10 : bck6.a(this.bC == 0L ? this.S : new Random(this.bC), a7.a())) {
				this.a(afj10, 0.0F);
			}

			this.a(boolean1, integer);
		} else {
			super.a(boolean1, integer, ry);
		}
	}

	public void o(float float1) {
		this.bf = float1;
	}

	public void p(float float1) {
		this.be = float1;
	}

	@Override
	public void l(float float1) {
		super.l(float1);
		this.o(float1);
	}

	@Override
	public void n() {
		super.n();
		this.l.C.a("looting");
		if (!this.l.E && this.cT() && !this.aU && this.l.U().b("mobGriefing")) {
			for (zj zj4 : this.l.a(zj.class, this.bo().c(1.0, 0.0, 1.0))) {
				if (!zj4.F && !zj4.k().b() && !zj4.t()) {
					this.a(zj4);
				}
			}
		}

		this.l.C.b();
	}

	protected void a(zj zj) {
		afj afj3 = zj.k();
		ss ss4 = d(afj3);
		boolean boolean5 = true;
		afj afj6 = this.b(ss4);
		if (!afj6.b()) {
			if (ss4.a() == ss.a.HAND) {
				if (afj3.c() instanceof agr && !(afj6.c() instanceof agr)) {
					boolean5 = true;
				} else if (afj3.c() instanceof agr && afj6.c() instanceof agr) {
					agr agr7 = (agr)afj3.c();
					agr agr8 = (agr)afj6.c();
					if (agr7.g() == agr8.g()) {
						boolean5 = afj3.j() > afj6.j() || afj3.o() && !afj6.o();
					} else {
						boolean5 = agr7.g() > agr8.g();
					}
				} else if (afj3.c() instanceof aea && afj6.c() instanceof aea) {
					boolean5 = afj3.o() && !afj6.o();
				} else {
					boolean5 = false;
				}
			} else if (afj3.c() instanceof adp && !(afj6.c() instanceof adp)) {
				boolean5 = true;
			} else if (afj3.c() instanceof adp && afj6.c() instanceof adp && !aik.d(afj6)) {
				adp adp7 = (adp)afj3.c();
				adp adp8 = (adp)afj6.c();
				if (adp7.d == adp8.d) {
					boolean5 = afj3.j() > afj6.j() || afj3.o() && !afj6.o();
				} else {
					boolean5 = adp7.d > adp8.d;
				}
			} else {
				boolean5 = false;
			}
		}

		if (boolean5 && this.c(afj3)) {
			double double7;
			switch (ss4.a()) {
				case HAND:
					double7 = (double)this.bs[ss4.b()];
					break;
				case ARMOR:
					double7 = (double)this.bt[ss4.b()];
					break;
				default:
					double7 = 0.0;
			}

			if (!afj6.b() && (double)(this.S.nextFloat() - 0.1F) < double7) {
				this.a(afj6, 0.0F);
			}

			if (afj3.c() == afl.l && zj.n() != null) {
				aay aay9 = this.l.a(zj.n());
				if (aay9 != null) {
					aay9.b(nr.x);
				}
			}

			this.a(ss4, afj3);
			switch (ss4.a()) {
				case HAND:
					this.bs[ss4.b()] = 2.0F;
					break;
				case ARMOR:
					this.bt[ss4.b()] = 2.0F;
			}

			this.bz = true;
			this.a(zj, afj3.E());
			zj.T();
		}
	}

	protected boolean c(afj afj) {
		return true;
	}

	protected boolean K() {
		return true;
	}

	protected void L() {
		if (this.bz) {
			this.aV = 0;
		} else {
			sn sn2 = this.l.a(this, -1.0);
			if (sn2 != null) {
				double double3 = sn2.p - this.p;
				double double5 = sn2.q - this.q;
				double double7 = sn2.r - this.r;
				double double9 = double3 * double3 + double5 * double5 + double7 * double7;
				if (this.K() && double9 > 16384.0) {
					this.T();
				}

				if (this.aV > 600 && this.S.nextInt(800) == 0 && double9 > 1024.0 && this.K()) {
					this.T();
				} else if (double9 < 1024.0) {
					this.aV = 0;
				}
			}
		}
	}

	@Override
	protected final void cs() {
		this.aV++;
		this.l.C.a("checkDespawn");
		this.L();
		this.l.C.b();
		this.l.C.a("sensing");
		this.bv.a();
		this.l.C.b();
		this.l.C.a("targetSelector");
		this.br.a();
		this.l.C.b();
		this.l.C.a("goalSelector");
		this.bq.a();
		this.l.C.b();
		this.l.C.a("navigation");
		this.h.l();
		this.l.C.b();
		this.l.C.a("mob tick");
		this.M();
		this.l.C.b();
		if (this.aK() && this.bB() instanceof sx) {
			sx sx2 = (sx)this.bB();
			sx2.x().a(this.x().k(), 1.5);
			sx2.u().a(this.u());
		}

		this.l.C.a("controls");
		this.l.C.a("move");
		this.f.c();
		this.l.C.c("look");
		this.b.a();
		this.l.C.c("jump");
		this.g.b();
		this.l.C.b();
		this.l.C.b();
	}

	protected void M() {
	}

	public int N() {
		return 40;
	}

	public int cL() {
		return 10;
	}

	public void a(sn sn, float float2, float float3) {
		double double5 = sn.p - this.p;
		double double9 = sn.r - this.r;
		double double7;
		if (sn instanceof sw) {
			sw sw11 = (sw)sn;
			double7 = sw11.q + (double)sw11.bq() - (this.q + (double)this.bq());
		} else {
			double7 = (sn.bo().b + sn.bo().e) / 2.0 - (this.q + (double)this.bq());
		}

		double double11 = (double)ot.a(double5 * double5 + double9 * double9);
		float float13 = (float)(ot.c(double9, double5) * 180.0F / (float)Math.PI) - 90.0F;
		float float14 = (float)(-(ot.c(double7, double11) * 180.0F / (float)Math.PI));
		this.w = this.b(this.w, float14, float3);
		this.v = this.b(this.v, float13, float2);
	}

	private float b(float float1, float float2, float float3) {
		float float5 = ot.g(float2 - float1);
		if (float5 > float3) {
			float5 = float3;
		}

		if (float5 < -float3) {
			float5 = -float3;
		}

		return float1 + float5;
	}

	public boolean cM() {
		atl atl2 = this.l.o(new co(this).b());
		return atl2.a(this);
	}

	public boolean cN() {
		return !this.l.d(this.bo()) && this.l.a(this, this.bo()).isEmpty() && this.l.a(this.bo(), this);
	}

	public float cO() {
		return 1.0F;
	}

	public int cQ() {
		return 4;
	}

	@Override
	public int aY() {
		if (this.z() == null) {
			return 3;
		} else {
			int integer2 = (int)(this.bU() - this.cb() * 0.33F);
			integer2 -= (3 - this.l.ae().a()) * 4;
			if (integer2 < 0) {
				integer2 = 0;
			}

			return integer2 + 3;
		}
	}

	@Override
	public Iterable<afj> aG() {
		return this.bw;
	}

	@Override
	public Iterable<afj> aH() {
		return this.bx;
	}

	@Override
	public afj b(ss ss) {
		switch (ss.a()) {
			case HAND:
				return this.bw.get(ss.b());
			case ARMOR:
				return this.bx.get(ss.b());
			default:
				return afj.a;
		}
	}

	@Override
	public void a(ss ss, afj afj) {
		switch (ss.a()) {
			case HAND:
				this.bw.set(ss.b(), afj);
				break;
			case ARMOR:
				this.bx.set(ss.b(), afj);
		}
	}

	@Override
	protected void a(boolean boolean1, int integer) {
		for (ss ss7 : ss.values()) {
			afj afj8 = this.b(ss7);
			double double9;
			switch (ss7.a()) {
				case HAND:
					double9 = (double)this.bs[ss7.b()];
					break;
				case ARMOR:
					double9 = (double)this.bt[ss7.b()];
					break;
				default:
					double9 = 0.0;
			}

			boolean boolean11 = double9 > 1.0;
			if (!afj8.b() && !aik.e(afj8) && (boolean1 || boolean11) && (double)(this.S.nextFloat() - (float)integer * 0.01F) < double9) {
				if (!boolean11 && afj8.f()) {
					afj8.b(afj8.k() - this.S.nextInt(1 + this.S.nextInt(Math.max(afj8.k() - 3, 1))));
				}

				this.a(afj8, 0.0F);
			}
		}
	}

	protected void a(rh rh) {
		if (this.S.nextFloat() < 0.15F * rh.d()) {
			int integer3 = this.S.nextInt(2);
			float float4 = this.l.ae() == rg.HARD ? 0.1F : 0.25F;
			if (this.S.nextFloat() < 0.095F) {
				integer3++;
			}

			if (this.S.nextFloat() < 0.095F) {
				integer3++;
			}

			if (this.S.nextFloat() < 0.095F) {
				integer3++;
			}

			boolean boolean5 = true;

			for (ss ss9 : ss.values()) {
				if (ss9.a() == ss.a.ARMOR) {
					afj afj10 = this.b(ss9);
					if (!boolean5 && this.S.nextFloat() < float4) {
						break;
					}

					boolean5 = false;
					if (afj10.b()) {
						afh afh11 = a(ss9, integer3);
						if (afh11 != null) {
							this.a(ss9, new afj(afh11));
						}
					}
				}
			}
		}
	}

	public static ss d(afj afj) {
		if (afj.c() == afh.a(alv.aU) || afj.c() == afl.ci) {
			return ss.HEAD;
		} else if (afj.c() instanceof adp) {
			return ((adp)afj.c()).c;
		} else if (afj.c() == afl.cS) {
			return ss.CHEST;
		} else {
			return afj.c() == afl.cR ? ss.OFFHAND : ss.MAINHAND;
		}
	}

	@Nullable
	public static afh a(ss ss, int integer) {
		switch (ss) {
			case HEAD:
				if (integer == 0) {
					return afl.T;
				} else if (integer == 1) {
					return afl.aj;
				} else if (integer == 2) {
					return afl.X;
				} else if (integer == 3) {
					return afl.ab;
				} else if (integer == 4) {
					return afl.af;
				}
			case CHEST:
				if (integer == 0) {
					return afl.U;
				} else if (integer == 1) {
					return afl.ak;
				} else if (integer == 2) {
					return afl.Y;
				} else if (integer == 3) {
					return afl.ac;
				} else if (integer == 4) {
					return afl.ag;
				}
			case LEGS:
				if (integer == 0) {
					return afl.V;
				} else if (integer == 1) {
					return afl.al;
				} else if (integer == 2) {
					return afl.Z;
				} else if (integer == 3) {
					return afl.ad;
				} else if (integer == 4) {
					return afl.ah;
				}
			case FEET:
				if (integer == 0) {
					return afl.W;
				} else if (integer == 1) {
					return afl.am;
				} else if (integer == 2) {
					return afl.aa;
				} else if (integer == 3) {
					return afl.ae;
				} else if (integer == 4) {
					return afl.ai;
				}
			default:
				return null;
		}
	}

	protected void b(rh rh) {
		float float3 = rh.d();
		if (!this.cg().b() && this.S.nextFloat() < 0.25F * float3) {
			this.a(ss.MAINHAND, aik.a(this.S, this.cg(), (int)(5.0F + float3 * (float)this.S.nextInt(18)), false));
		}

		for (ss ss7 : ss.values()) {
			if (ss7.a() == ss.a.ARMOR) {
				afj afj8 = this.b(ss7);
				if (!afj8.b() && this.S.nextFloat() < 0.5F * float3) {
					this.a(ss7, aik.a(this.S, afj8, (int)(5.0F + float3 * (float)this.S.nextInt(18)), false));
				}
			}
		}
	}

	@Nullable
	public sz a(rh rh, @Nullable sz sz) {
		this.a(aad.b).b(new tl("Random spawn bonus", this.S.nextGaussian() * 0.05, 1));
		if (this.S.nextFloat() < 0.05F) {
			this.o(true);
		} else {
			this.o(false);
		}

		return sz;
	}

	public boolean cR() {
		return false;
	}

	public void cS() {
		this.bz = true;
	}

	public void a(ss ss, float float2) {
		switch (ss.a()) {
			case HAND:
				this.bs[ss.b()] = float2;
				break;
			case ARMOR:
				this.bt[ss.b()] = float2;
		}
	}

	public boolean cT() {
		return this.by;
	}

	public void m(boolean boolean1) {
		this.by = boolean1;
	}

	public boolean cU() {
		return this.bz;
	}

	@Override
	public final boolean b(aay aay, ri ri) {
		if (this.cW() && this.cX() == aay) {
			this.a(true, !aay.bK.d);
			return true;
		} else {
			afj afj4 = aay.b(ri);
			if (afj4.c() == afl.cy && this.a(aay)) {
				this.b(aay, true);
				afj4.g(1);
				return true;
			} else {
				return this.a(aay, ri) ? true : super.b(aay, ri);
			}
		}
	}

	protected boolean a(aay aay, ri ri) {
		return false;
	}

	protected void cV() {
		if (this.bF != null) {
			this.da();
		}

		if (this.bD) {
			if (!this.au()) {
				this.a(true, true);
			}

			if (this.bE == null || this.bE.F) {
				this.a(true, true);
			}
		}
	}

	public void a(boolean boolean1, boolean boolean2) {
		if (this.bD) {
			this.bD = false;
			this.bE = null;
			if (!this.l.E && boolean2) {
				this.a(afl.cy, 1);
			}

			if (!this.l.E && boolean1 && this.l instanceof lw) {
				((lw)this.l).v().a(this, new ht(this, null));
			}
		}
	}

	public boolean a(aay aay) {
		return !this.cW() && !(this instanceof zt);
	}

	public boolean cW() {
		return this.bD;
	}

	public sn cX() {
		return this.bE;
	}

	public void b(sn sn, boolean boolean2) {
		this.bD = true;
		this.bE = sn;
		if (!this.l.E && boolean2 && this.l instanceof lw) {
			((lw)this.l).v().a(this, new ht(this, this.bE));
		}

		if (this.aK()) {
			this.p();
		}
	}

	@Override
	public boolean a(sn sn, boolean boolean2) {
		boolean boolean4 = super.a(sn, boolean2);
		if (boolean4 && this.cW()) {
			this.a(true, true);
		}

		return boolean4;
	}

	private void da() {
		if (this.bD && this.bF != null) {
			if (this.bF.b("UUID")) {
				UUID uUID2 = this.bF.a("UUID");

				for (sw sw5 : this.l.a(sw.class, this.bo().g(10.0))) {
					if (sw5.be().equals(uUID2)) {
						this.b(sw5, true);
						break;
					}
				}
			} else if (this.bF.b("X", 99) && this.bF.b("Y", 99) && this.bF.b("Z", 99)) {
				co co2 = new co(this.bF.h("X"), this.bF.h("Y"), this.bF.h("Z"));
				za za3 = za.b(this.l, co2);
				if (za3 == null) {
					za3 = za.a(this.l, co2);
				}

				this.b(za3, true);
			} else {
				this.a(false, true);
			}
		}

		this.bF = null;
	}

	@Override
	public boolean c(int integer, afj afj) {
		ss ss4;
		if (integer == 98) {
			ss4 = ss.MAINHAND;
		} else if (integer == 99) {
			ss4 = ss.OFFHAND;
		} else if (integer == 100 + ss.HEAD.b()) {
			ss4 = ss.HEAD;
		} else if (integer == 100 + ss.CHEST.b()) {
			ss4 = ss.CHEST;
		} else if (integer == 100 + ss.LEGS.b()) {
			ss4 = ss.LEGS;
		} else {
			if (integer != 100 + ss.FEET.b()) {
				return false;
			}

			ss4 = ss.FEET;
		}

		if (!afj.b() && !b(ss4, afj) && ss4 != ss.HEAD) {
			return false;
		} else {
			this.a(ss4, afj);
			return true;
		}
	}

	@Override
	public boolean bA() {
		return this.cR() && super.bA();
	}

	public static boolean b(ss ss, afj afj) {
		ss ss3 = d(afj);
		return ss3 == ss || ss3 == ss.MAINHAND && ss == ss.OFFHAND || ss3 == ss.OFFHAND && ss == ss.MAINHAND;
	}

	@Override
	public boolean cu() {
		return super.cu() && !this.cY();
	}

	public void n(boolean boolean1) {
		byte byte3 = this.Y.a(a);
		this.Y.b(a, boolean1 ? (byte)(byte3 | 1) : (byte)(byte3 & -2));
	}

	public void o(boolean boolean1) {
		byte byte3 = this.Y.a(a);
		this.Y.b(a, boolean1 ? (byte)(byte3 | 2) : (byte)(byte3 & -3));
	}

	public boolean cY() {
		return (this.Y.a(a) & 1) != 0;
	}

	public boolean cZ() {
		return (this.Y.a(a) & 2) != 0;
	}

	@Override
	public sv cx() {
		return this.cZ() ? sv.LEFT : sv.RIGHT;
	}

	public static enum a {
		ON_GROUND,
		IN_AIR,
		IN_WATER;
	}
}

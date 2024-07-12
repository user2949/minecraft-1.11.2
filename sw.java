import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class sw extends sn {
	private static final Logger a = LogManager.getLogger();
	private static final UUID b = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
	private static final tl c = new tl(b, "Sprinting speed boost", 0.3F, 2).a(false);
	protected static final kk<Byte> at = kn.a(sw.class, km.a);
	private static final kk<Float> f = kn.a(sw.class, km.c);
	private static final kk<Integer> g = kn.a(sw.class, km.b);
	private static final kk<Boolean> h = kn.a(sw.class, km.h);
	private static final kk<Integer> bq = kn.a(sw.class, km.b);
	private tn br;
	private final rx bs = new rx(this);
	private final Map<sg, sh> bt = Maps.newHashMap();
	private final dd<afj> bu = dd.a(2, afj.a);
	private final dd<afj> bv = dd.a(4, afj.a);
	public boolean au;
	public ri av;
	public int aw;
	public int ax;
	public int ay;
	public int az;
	public float aA;
	public int aB;
	public float aC;
	public float aD;
	protected int aE;
	public float aF;
	public float aG;
	public float aH;
	public int aI = 20;
	public float aJ;
	public float aK;
	public float aL;
	public float aM;
	public float aN;
	public float aO;
	public float aP;
	public float aQ;
	public float aR = 0.02F;
	protected aay aS;
	protected int aT;
	protected boolean aU;
	protected int aV;
	protected float aW;
	protected float aX;
	protected float aY;
	protected float aZ;
	protected float ba;
	protected int bb;
	protected float bc;
	protected boolean bd;
	public float be;
	public float bf;
	public float bg;
	protected int bh;
	protected double bi;
	protected double bj;
	protected double bk;
	protected double bl;
	protected double bm;
	private boolean bw = true;
	private sw bx;
	private int by;
	private sw bz;
	private int bA;
	private float bB;
	private int bC;
	private float bD;
	protected afj bn = afj.a;
	protected int bo;
	protected int bp;
	private co bE;
	private ry bF;
	private long bG;

	@Override
	public void Q() {
		this.a(ry.m, Float.MAX_VALUE);
	}

	public sw(ajs ajs) {
		super(ajs);
		this.bE();
		this.c(this.cb());
		this.i = true;
		this.aM = (float)((Math.random() + 1.0) * 0.01F);
		this.b(this.p, this.q, this.r);
		this.aL = (float)Math.random() * 12398.0F;
		this.v = (float)(Math.random() * (float) (Math.PI * 2));
		this.aP = this.v;
		this.P = 0.6F;
	}

	@Override
	protected void i() {
		this.Y.a(at, (byte)0);
		this.Y.a(g, 0);
		this.Y.a(h, false);
		this.Y.a(bq, 0);
		this.Y.a(f, 1.0F);
	}

	protected void bE() {
		this.ce().b(aad.a);
		this.ce().b(aad.c);
		this.ce().b(aad.d);
		this.ce().b(aad.g);
		this.ce().b(aad.h);
	}

	@Override
	protected void a(double double1, boolean boolean2, atl atl, co co) {
		if (!this.aj()) {
			this.ak();
		}

		if (!this.l.E && this.L > 3.0F && boolean2) {
			float float7 = (float)ot.f(this.L - 3.0F);
			if (atl.a() != azs.a) {
				double double8 = Math.min((double)(0.2F + float7 / 15.0F), 2.5);
				int integer10 = (int)(150.0 * double8);
				((lw)this.l).a(de.BLOCK_DUST, this.p, this.q, this.r, integer10, 0.0, 0.0, 0.0, 0.15F, alu.j(atl));
			}
		}

		super.a(double1, boolean2, atl, co);
	}

	public boolean bF() {
		return false;
	}

	@Override
	public void U() {
		this.aC = this.aD;
		super.U();
		this.l.C.a("livingEntityBaseTick");
		boolean boolean2 = this instanceof aay;
		if (this.au()) {
			if (this.av()) {
				this.a(ry.f, 1.0F);
			} else if (boolean2 && !this.l.aj().a(this.bo())) {
				double double3 = this.l.aj().a(this) + this.l.aj().m();
				if (double3 < 0.0) {
					double double5 = this.l.aj().n();
					if (double5 > 0.0) {
						this.a(ry.f, (float)Math.max(1, ot.c(-double3 * double5)));
					}
				}
			}
		}

		if (this.ah() || this.l.E) {
			this.X();
		}

		boolean boolean3 = boolean2 && ((aay)this).bK.a;
		if (this.au()) {
			if (!this.a(azs.h)) {
				this.l(300);
			} else {
				if (!this.bF() && !this.a(si.m) && !boolean3) {
					this.l(this.d(this.aR()));
					if (this.aR() == -20) {
						this.l(0);

						for (int integer4 = 0; integer4 < 8; integer4++) {
							float float5 = this.S.nextFloat() - this.S.nextFloat();
							float float6 = this.S.nextFloat() - this.S.nextFloat();
							float float7 = this.S.nextFloat() - this.S.nextFloat();
							this.l.a(de.WATER_BUBBLE, this.p + (double)float5, this.q + (double)float6, this.r + (double)float7, this.s, this.t, this.u);
						}

						this.a(ry.h, 2.0F);
					}
				}

				if (!this.l.E && this.aK() && this.bB() instanceof sw) {
					this.p();
				}
			}

			if (!this.l.E) {
				co co4 = new co(this);
				if (!Objects.equal(this.bE, co4)) {
					this.bE = co4;
					this.b(co4);
				}
			}
		}

		if (this.au() && this.ai()) {
			this.X();
		}

		this.aJ = this.aK;
		if (this.ay > 0) {
			this.ay--;
		}

		if (this.V > 0 && !(this instanceof ly)) {
			this.V--;
		}

		if (this.bU() <= 0.0F) {
			this.bG();
		}

		if (this.aT > 0) {
			this.aT--;
		} else {
			this.aS = null;
		}

		if (this.bz != null && !this.bz.au()) {
			this.bz = null;
		}

		if (this.bx != null) {
			if (!this.bx.au()) {
				this.a(null);
			} else if (this.T - this.by > 100) {
				this.a(null);
			}
		}

		this.bP();
		this.aZ = this.aY;
		this.aO = this.aN;
		this.aQ = this.aP;
		this.x = this.v;
		this.y = this.w;
		this.l.C.b();
	}

	protected void b(co co) {
		int integer3 = aik.a(aim.j, this);
		if (integer3 > 0) {
			aip.a(this, this.l, co, integer3);
		}
	}

	public boolean l_() {
		return false;
	}

	protected void bG() {
		this.aB++;
		if (this.aB == 20) {
			if (!this.l.E && (this.bI() || this.aT > 0 && this.bH() && this.l.U().b("doMobLoot"))) {
				int integer2 = this.b(this.aS);

				while (integer2 > 0) {
					int integer3 = st.a(integer2);
					integer2 -= integer3;
					this.l.a(new st(this.l, this.p, this.q, this.r, integer3));
				}
			}

			this.T();

			for (int integer2 = 0; integer2 < 20; integer2++) {
				double double3 = this.S.nextGaussian() * 0.02;
				double double5 = this.S.nextGaussian() * 0.02;
				double double7 = this.S.nextGaussian() * 0.02;
				this.l
					.a(
						de.EXPLOSION_NORMAL,
						this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
						this.q + (double)(this.S.nextFloat() * this.H),
						this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
						double3,
						double5,
						double7
					);
			}
		}
	}

	protected boolean bH() {
		return !this.l_();
	}

	protected int d(int integer) {
		int integer3 = aik.d(this);
		return integer3 > 0 && this.S.nextInt(integer3 + 1) > 0 ? integer : integer - 1;
	}

	protected int b(aay aay) {
		return 0;
	}

	protected boolean bI() {
		return false;
	}

	public Random bJ() {
		return this.S;
	}

	@Nullable
	public sw bK() {
		return this.bx;
	}

	public int bL() {
		return this.by;
	}

	public void a(@Nullable sw sw) {
		this.bx = sw;
		this.by = this.T;
	}

	public sw bM() {
		return this.bz;
	}

	public int bN() {
		return this.bA;
	}

	public void z(sn sn) {
		if (sn instanceof sw) {
			this.bz = (sw)sn;
		} else {
			this.bz = null;
		}

		this.bA = this.T;
	}

	public int bO() {
		return this.aV;
	}

	protected void a_(afj afj) {
		if (!afj.b()) {
			nm nm3 = nn.q;
			afh afh4 = afj.c();
			if (afh4 instanceof adp) {
				nm3 = ((adp)afh4).d().b();
			} else if (afh4 == afl.cS) {
				nm3 = nn.p;
			}

			this.a(nm3, 1.0F, 1.0F);
		}
	}

	@Override
	public void b(du du) {
		du.a("Health", this.bU());
		du.a("HurtTime", (short)this.ay);
		du.a("HurtByTimestamp", this.by);
		du.a("DeathTime", (short)this.aB);
		du.a("AbsorptionAmount", this.cv());

		for (ss ss6 : ss.values()) {
			afj afj7 = this.b(ss6);
			if (!afj7.b()) {
				this.ce().a(afj7.a(ss6));
			}
		}

		du.a("Attributes", aad.a(this.ce()));

		for (ss ss6x : ss.values()) {
			afj afj7 = this.b(ss6x);
			if (!afj7.b()) {
				this.ce().b(afj7.a(ss6x));
			}
		}

		if (!this.bt.isEmpty()) {
			ea ea3 = new ea();

			for (sh sh5 : this.bt.values()) {
				ea3.a(sh5.a(new du()));
			}

			du.a("ActiveEffects", ea3);
		}

		du.a("FallFlying", this.cH());
	}

	@Override
	public void a(du du) {
		this.n(du.j("AbsorptionAmount"));
		if (du.b("Attributes", 9) && this.l != null && !this.l.E) {
			aad.a(this.ce(), du.c("Attributes", 10));
		}

		if (du.b("ActiveEffects", 9)) {
			ea ea3 = du.c("ActiveEffects", 10);

			for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
				du du5 = ea3.b(integer4);
				sh sh6 = sh.b(du5);
				if (sh6 != null) {
					this.bt.put(sh6.a(), sh6);
				}
			}
		}

		if (du.b("Health", 99)) {
			this.c(du.j("Health"));
		}

		this.ay = du.g("HurtTime");
		this.aB = du.g("DeathTime");
		this.by = du.h("HurtByTimestamp");
		if (du.b("Team", 8)) {
			String string3 = du.l("Team");
			boolean boolean4 = this.l.ad().a(this.bf(), string3);
			if (!boolean4) {
				a.info("Unable to add mob to team \"" + string3 + "\" (that team probably doesn't exist)");
			}
		}

		if (du.p("FallFlying")) {
			this.b(7, true);
		}
	}

	protected void bP() {
		Iterator<sg> iterator2 = this.bt.keySet().iterator();

		try {
			while (iterator2.hasNext()) {
				sg sg3 = (sg)iterator2.next();
				sh sh4 = (sh)this.bt.get(sg3);
				if (!sh4.a(this)) {
					if (!this.l.E) {
						iterator2.remove();
						this.b(sh4);
					}
				} else if (sh4.b() % 600 == 0) {
					this.a(sh4, false);
				}
			}
		} catch (ConcurrentModificationException var11) {
		}

		if (this.bw) {
			if (!this.l.E) {
				this.F();
			}

			this.bw = false;
		}

		int integer3 = this.Y.a(g);
		boolean boolean4 = this.Y.a(h);
		if (integer3 > 0) {
			boolean boolean5;
			if (this.aP()) {
				boolean5 = this.S.nextInt(15) == 0;
			} else {
				boolean5 = this.S.nextBoolean();
			}

			if (boolean4) {
				boolean5 &= this.S.nextInt(5) == 0;
			}

			if (boolean5 && integer3 > 0) {
				double double6 = (double)(integer3 >> 16 & 0xFF) / 255.0;
				double double8 = (double)(integer3 >> 8 & 0xFF) / 255.0;
				double double10 = (double)(integer3 >> 0 & 0xFF) / 255.0;
				this.l
					.a(
						boolean4 ? de.SPELL_MOB_AMBIENT : de.SPELL_MOB,
						this.p + (this.S.nextDouble() - 0.5) * (double)this.G,
						this.q + this.S.nextDouble() * (double)this.H,
						this.r + (this.S.nextDouble() - 0.5) * (double)this.G,
						double6,
						double8,
						double10
					);
			}
		}
	}

	protected void F() {
		if (this.bt.isEmpty()) {
			this.bQ();
			this.h(false);
		} else {
			Collection<sh> collection2 = this.bt.values();
			this.Y.b(h, a(collection2));
			this.Y.b(g, aha.a(collection2));
			this.h(this.a(si.n));
		}
	}

	public static boolean a(Collection<sh> collection) {
		for (sh sh3 : collection) {
			if (!sh3.d()) {
				return false;
			}
		}

		return true;
	}

	protected void bQ() {
		this.Y.b(h, false);
		this.Y.b(g, 0);
	}

	public void bR() {
		if (!this.l.E) {
			Iterator<sh> iterator2 = this.bt.values().iterator();

			while (iterator2.hasNext()) {
				this.b((sh)iterator2.next());
				iterator2.remove();
			}
		}
	}

	public Collection<sh> bS() {
		return this.bt.values();
	}

	public boolean a(sg sg) {
		return this.bt.containsKey(sg);
	}

	@Nullable
	public sh b(sg sg) {
		return (sh)this.bt.get(sg);
	}

	public void c(sh sh) {
		if (this.d(sh)) {
			sh sh3 = (sh)this.bt.get(sh.a());
			if (sh3 == null) {
				this.bt.put(sh.a(), sh);
				this.a(sh);
			} else {
				sh3.a(sh);
				this.a(sh3, true);
			}
		}
	}

	public boolean d(sh sh) {
		if (this.cf() == tb.UNDEAD) {
			sg sg3 = sh.a();
			if (sg3 == si.j || sg3 == si.s) {
				return false;
			}
		}

		return true;
	}

	public boolean bT() {
		return this.cf() == tb.UNDEAD;
	}

	@Nullable
	public sh c(@Nullable sg sg) {
		return (sh)this.bt.remove(sg);
	}

	public void d(sg sg) {
		sh sh3 = this.c(sg);
		if (sh3 != null) {
			this.b(sh3);
		}
	}

	protected void a(sh sh) {
		this.bw = true;
		if (!this.l.E) {
			sh.a().b(this, this.ce(), sh.c());
		}
	}

	protected void a(sh sh, boolean boolean2) {
		this.bw = true;
		if (boolean2 && !this.l.E) {
			sg sg4 = sh.a();
			sg4.a(this, this.ce(), sh.c());
			sg4.b(this, this.ce(), sh.c());
		}
	}

	protected void b(sh sh) {
		this.bw = true;
		if (!this.l.E) {
			sh.a().a(this, this.ce(), sh.c());
		}
	}

	public void b(float float1) {
		float float3 = this.bU();
		if (float3 > 0.0F) {
			this.c(float3 + float1);
		}
	}

	public final float bU() {
		return this.Y.a(f);
	}

	public void c(float float1) {
		this.Y.b(f, ot.a(float1, 0.0F, this.cb()));
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else if (this.l.E) {
			return false;
		} else {
			this.aV = 0;
			if (this.bU() <= 0.0F) {
				return false;
			} else if (ry.o() && this.a(si.l)) {
				return false;
			} else {
				if ((ry == ry.q || ry == ry.r) && !this.b(ss.HEAD).b()) {
					this.b(ss.HEAD).a((int)(float2 * 4.0F + this.S.nextFloat() * float2 * 2.0F), this);
					float2 *= 0.75F;
				}

				boolean boolean4 = false;
				if (float2 > 0.0F && this.e(ry)) {
					this.k(float2);
					float2 = 0.0F;
					if (!ry.a()) {
						sn sn5 = ry.i();
						if (sn5 instanceof sw) {
							this.c((sw)sn5);
						}
					}

					boolean4 = true;
				}

				this.aG = 1.5F;
				boolean boolean5 = true;
				if ((float)this.V > (float)this.aI / 2.0F) {
					if (float2 <= this.bc) {
						return false;
					}

					this.d(ry, float2 - this.bc);
					this.bc = float2;
					boolean5 = false;
				} else {
					this.bc = float2;
					this.V = this.aI;
					this.d(ry, float2);
					this.az = 10;
					this.ay = this.az;
				}

				this.aA = 0.0F;
				sn sn6 = ry.j();
				if (sn6 != null) {
					if (sn6 instanceof sw) {
						this.a((sw)sn6);
					}

					if (sn6 instanceof aay) {
						this.aT = 100;
						this.aS = (aay)sn6;
					} else if (sn6 instanceof xk) {
						xk xk7 = (xk)sn6;
						if (xk7.dh()) {
							this.aT = 100;
							this.aS = null;
						}
					}
				}

				if (boolean5) {
					if (boolean4) {
						this.l.a(this, (byte)29);
					} else if (ry instanceof rz && ((rz)ry).x()) {
						this.l.a(this, (byte)33);
					} else {
						this.l.a(this, (byte)2);
					}

					if (ry != ry.h && (!boolean4 || float2 > 0.0F)) {
						this.ap();
					}

					if (sn6 != null) {
						double double7 = sn6.p - this.p;

						double double9;
						for (double9 = sn6.r - this.r; double7 * double7 + double9 * double9 < 1.0E-4; double9 = (Math.random() - Math.random()) * 0.01) {
							double7 = (Math.random() - Math.random()) * 0.01;
						}

						this.aA = (float)(ot.c(double9, double7) * 180.0F / (float)Math.PI - (double)this.v);
						this.a(sn6, 0.4F, double7, double9);
					} else {
						this.aA = (float)((int)(Math.random() * 2.0) * 180);
					}
				}

				if (this.bU() <= 0.0F) {
					if (!this.d(ry)) {
						nm nm7 = this.bX();
						if (boolean5 && nm7 != null) {
							this.a(nm7, this.ci(), this.cj());
						}

						this.a(ry);
					}
				} else if (boolean5) {
					this.c(ry);
				}

				if (!boolean4 || float2 > 0.0F) {
					this.bF = ry;
					this.bG = this.l.P();
				}

				return !boolean4 || float2 > 0.0F;
			}
		}
	}

	protected void c(sw sw) {
		sw.a(this, 0.5F, this.p - sw.p, this.r - sw.r);
	}

	private boolean d(ry ry) {
		if (ry.g()) {
			return false;
		} else {
			boolean boolean3 = false;

			for (ri ri8 : ri.values()) {
				afj afj4 = this.b(ri8);
				if (afj4.c() == afl.cY) {
					afj4.g(1);
					boolean3 = true;
					break;
				}
			}

			if (boolean3) {
				if (this instanceof aay) {
					((aay)this).b(oa.b(afl.cY));
				}

				this.c(1.0F);
				this.bR();
				this.c(new sh(si.j, 900, 1));
				this.c(new sh(si.v, 100, 1));
				this.l.a(this, (byte)35);
			}

			return boolean3;
		}
	}

	@Nullable
	public ry bV() {
		if (this.l.P() - this.bG > 40L) {
			this.bF = null;
		}

		return this.bF;
	}

	protected void c(ry ry) {
		nm nm3 = this.bW();
		if (nm3 != null) {
			this.a(nm3, this.ci(), this.cj());
		}
	}

	private boolean e(ry ry) {
		if (!ry.e() && this.cG()) {
			bdw bdw3 = ry.v();
			if (bdw3 != null) {
				bdw bdw4 = this.f(1.0F);
				bdw bdw5 = bdw3.a(new bdw(this.p, this.q, this.r)).a();
				bdw5 = new bdw(bdw5.b, 0.0, bdw5.d);
				if (bdw5.b(bdw4) < 0.0) {
					return true;
				}
			}
		}

		return false;
	}

	public void b(afj afj) {
		this.a(nn.dj, 0.8F, 0.8F + this.l.r.nextFloat() * 0.4F);

		for (int integer3 = 0; integer3 < 5; integer3++) {
			bdw bdw4 = new bdw(((double)this.S.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
			bdw4 = bdw4.a(-this.w * (float) (Math.PI / 180.0));
			bdw4 = bdw4.b(-this.v * (float) (Math.PI / 180.0));
			double double5 = (double)(-this.S.nextFloat()) * 0.6 - 0.3;
			bdw bdw7 = new bdw(((double)this.S.nextFloat() - 0.5) * 0.3, double5, 0.6);
			bdw7 = bdw7.a(-this.w * (float) (Math.PI / 180.0));
			bdw7 = bdw7.b(-this.v * (float) (Math.PI / 180.0));
			bdw7 = bdw7.b(this.p, this.q + (double)this.bq(), this.r);
			this.l.a(de.ITEM_CRACK, bdw7.b, bdw7.c, bdw7.d, bdw4.b, bdw4.c + 0.05, bdw4.d, afh.a(afj.c()));
		}
	}

	public void a(ry ry) {
		if (!this.aU) {
			sn sn3 = ry.j();
			sw sw4 = this.ca();
			if (this.bb >= 0 && sw4 != null) {
				sw4.b(this, this.bb);
			}

			if (sn3 != null) {
				sn3.b(this);
			}

			this.aU = true;
			this.bZ().g();
			if (!this.l.E) {
				int integer5 = 0;
				if (sn3 instanceof aay) {
					integer5 = aik.g((sw)sn3);
				}

				if (this.bH() && this.l.U().b("doMobLoot")) {
					boolean boolean6 = this.aT > 0;
					this.a(boolean6, integer5, ry);
				}
			}

			this.l.a(this, (byte)3);
		}
	}

	protected void a(boolean boolean1, int integer, ry ry) {
		this.b(boolean1, integer);
		this.a(boolean1, integer);
	}

	protected void a(boolean boolean1, int integer) {
	}

	public void a(sn sn, float float2, double double3, double double4) {
		if (!(this.S.nextDouble() < this.a(aad.c).e())) {
			this.ai = true;
			float float8 = ot.a(double3 * double3 + double4 * double4);
			this.s /= 2.0;
			this.u /= 2.0;
			this.s -= double3 / (double)float8 * (double)float2;
			this.u -= double4 / (double)float8 * (double)float2;
			if (this.z) {
				this.t /= 2.0;
				this.t += (double)float2;
				if (this.t > 0.4F) {
					this.t = 0.4F;
				}
			}
		}
	}

	@Nullable
	protected nm bW() {
		return nn.bR;
	}

	@Nullable
	protected nm bX() {
		return nn.bM;
	}

	protected nm e(int integer) {
		return integer > 4 ? nn.bK : nn.bS;
	}

	protected void b(boolean boolean1, int integer) {
	}

	public boolean m_() {
		int integer2 = ot.c(this.p);
		int integer3 = ot.c(this.bo().b);
		int integer4 = ot.c(this.r);
		if (this instanceof aay && ((aay)this).y()) {
			return false;
		} else {
			co co5 = new co(integer2, integer3, integer4);
			atl atl6 = this.l.o(co5);
			alu alu7 = atl6.v();
			return alu7 != alv.au && alu7 != alv.bn ? alu7 instanceof arm && this.a(co5, atl6) : true;
		}
	}

	private boolean a(co co, atl atl) {
		if ((Boolean)atl.c(arm.b)) {
			atl atl4 = this.l.o(co.b());
			if (atl4.v() == alv.au && atl4.c(aom.a) == atl.c(arm.a)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean au() {
		return !this.F && this.bU() > 0.0F;
	}

	@Override
	public void e(float float1, float float2) {
		super.e(float1, float2);
		sh sh4 = this.b(si.h);
		float float5 = sh4 == null ? 0.0F : (float)(sh4.c() + 1);
		int integer6 = ot.f((float1 - 3.0F - float5) * float2);
		if (integer6 > 0) {
			this.a(this.e(integer6), 1.0F, 1.0F);
			this.a(ry.k, (float)integer6);
			int integer7 = ot.c(this.p);
			int integer8 = ot.c(this.q - 0.2F);
			int integer9 = ot.c(this.r);
			atl atl10 = this.l.o(new co(integer7, integer8, integer9));
			if (atl10.a() != azs.a) {
				aqu aqu11 = atl10.v().v();
				this.a(aqu11.g(), aqu11.a() * 0.5F, aqu11.b() * 0.75F);
			}
		}
	}

	@Override
	public void aF() {
		this.az = 10;
		this.ay = this.az;
		this.aA = 0.0F;
	}

	public int bY() {
		tk tk2 = this.a(aad.g);
		return ot.c(tk2.e());
	}

	protected void j(float float1) {
	}

	protected void k(float float1) {
	}

	protected float b(ry ry, float float2) {
		if (!ry.e()) {
			this.j(float2);
			float2 = rw.a(float2, (float)this.bY(), (float)this.a(aad.h).e());
		}

		return float2;
	}

	protected float c(ry ry, float float2) {
		if (ry.h()) {
			return float2;
		} else {
			if (this.a(si.k) && ry != ry.m) {
				int integer4 = (this.b(si.k).c() + 1) * 5;
				int integer5 = 25 - integer4;
				float float6 = float2 * (float)integer5;
				float2 = float6 / 25.0F;
			}

			if (float2 <= 0.0F) {
				return 0.0F;
			} else {
				int integer4 = aik.a(this.aH(), ry);
				if (integer4 > 0) {
					float2 = rw.a(float2, (float)integer4);
				}

				return float2;
			}
		}
	}

	protected void d(ry ry, float float2) {
		if (!this.b(ry)) {
			float2 = this.b(ry, float2);
			float2 = this.c(ry, float2);
			float var7 = Math.max(float2 - this.cv(), 0.0F);
			this.n(this.cv() - (float2 - var7));
			if (var7 != 0.0F) {
				float float5 = this.bU();
				this.c(float5 - var7);
				this.bZ().a(ry, float5, var7);
				this.n(this.cv() - var7);
			}
		}
	}

	public rx bZ() {
		return this.bs;
	}

	@Nullable
	public sw ca() {
		if (this.bs.c() != null) {
			return this.bs.c();
		} else if (this.aS != null) {
			return this.aS;
		} else {
			return this.bx != null ? this.bx : null;
		}
	}

	public final float cb() {
		return (float)this.a(aad.a).e();
	}

	public final int cc() {
		return this.Y.a(bq);
	}

	public final void f(int integer) {
		this.Y.b(bq, integer);
	}

	private int o() {
		if (this.a(si.c)) {
			return 6 - (1 + this.b(si.c).c());
		} else {
			return this.a(si.d) ? 6 + (1 + this.b(si.d).c()) * 2 : 6;
		}
	}

	public void a(ri ri) {
		if (!this.au || this.aw >= this.o() / 2 || this.aw < 0) {
			this.aw = -1;
			this.au = true;
			this.av = ri;
			if (this.l instanceof lw) {
				((lw)this.l).v().a(this, new fw(this, ri == ri.MAIN_HAND ? 0 : 3));
			}
		}
	}

	@Override
	public void a(byte byte1) {
		boolean boolean3 = byte1 == 33;
		if (byte1 == 2 || boolean3) {
			this.aG = 1.5F;
			this.V = this.aI;
			this.az = 10;
			this.ay = this.az;
			this.aA = 0.0F;
			if (boolean3) {
				this.a(nn.gU, this.ci(), (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
			}

			nm nm4 = this.bW();
			if (nm4 != null) {
				this.a(nm4, this.ci(), (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
			}

			this.a(ry.n, 0.0F);
		} else if (byte1 == 3) {
			nm nm4 = this.bX();
			if (nm4 != null) {
				this.a(nm4, this.ci(), (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
			}

			this.c(0.0F);
			this.a(ry.n);
		} else if (byte1 == 30) {
			this.a(nn.fx, 0.8F, 0.8F + this.l.r.nextFloat() * 0.4F);
		} else if (byte1 == 29) {
			this.a(nn.fw, 1.0F, 0.8F + this.l.r.nextFloat() * 0.4F);
		} else {
			super.a(byte1);
		}
	}

	@Override
	protected void Y() {
		this.a(ry.m, 4.0F);
	}

	protected void cd() {
		int integer2 = this.o();
		if (this.au) {
			this.aw++;
			if (this.aw >= integer2) {
				this.aw = 0;
				this.au = false;
			}
		} else {
			this.aw = 0;
		}

		this.aD = (float)this.aw / (float)integer2;
	}

	public tk a(tj tj) {
		return this.ce().a(tj);
	}

	public tn ce() {
		if (this.br == null) {
			this.br = new tp();
		}

		return this.br;
	}

	public tb cf() {
		return tb.UNDEFINED;
	}

	public afj cg() {
		return this.b(ss.MAINHAND);
	}

	public afj ch() {
		return this.b(ss.OFFHAND);
	}

	public afj b(ri ri) {
		if (ri == ri.MAIN_HAND) {
			return this.b(ss.MAINHAND);
		} else if (ri == ri.OFF_HAND) {
			return this.b(ss.OFFHAND);
		} else {
			throw new IllegalArgumentException("Invalid hand " + ri);
		}
	}

	public void a(ri ri, afj afj) {
		if (ri == ri.MAIN_HAND) {
			this.a(ss.MAINHAND, afj);
		} else {
			if (ri != ri.OFF_HAND) {
				throw new IllegalArgumentException("Invalid hand " + ri);
			}

			this.a(ss.OFFHAND, afj);
		}
	}

	public boolean a(ss ss) {
		return !this.b(ss).b();
	}

	@Override
	public abstract Iterable<afj> aH();

	public abstract afj b(ss ss);

	@Override
	public abstract void a(ss ss, afj afj);

	@Override
	public void f(boolean boolean1) {
		super.f(boolean1);
		tk tk3 = this.a(aad.d);
		if (tk3.a(b) != null) {
			tk3.c(c);
		}

		if (boolean1) {
			tk3.b(c);
		}
	}

	protected float ci() {
		return 1.0F;
	}

	protected float cj() {
		return this.l_() ? (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.5F : (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F;
	}

	protected boolean ck() {
		return this.bU() <= 0.0F;
	}

	public void A(sn sn) {
		if (!(sn instanceof abx) && !(sn instanceof xm)) {
			double double4 = sn.p;
			double double6 = sn.bo().b + (double)sn.H;
			double double8 = sn.r;
			cv cv10 = sn.bm();
			if (cv10 != null) {
				cv cv11 = cv10.e();
				int[][] arr12 = new int[][]{{0, 1}, {0, -1}, {-1, 1}, {-1, -1}, {1, 1}, {1, -1}, {-1, 0}, {1, 0}, {0, 1}};
				double double13 = Math.floor(this.p) + 0.5;
				double double15 = Math.floor(this.r) + 0.5;
				double double17 = this.bo().d - this.bo().a;
				double double19 = this.bo().f - this.bo().c;
				bdt bdt21 = new bdt(
					double13 - double17 / 2.0,
					this.bo().b - (double)sn.H,
					double15 - double19 / 2.0,
					double13 + double17 / 2.0,
					this.bo().e - (double)sn.H,
					double15 + double19 / 2.0
				);

				for (int[] arr25 : arr12) {
					double double26 = (double)(cv10.g() * arr25[0] + cv11.g() * arr25[1]);
					double double28 = (double)(cv10.i() * arr25[0] + cv11.i() * arr25[1]);
					double double30 = double13 + double26;
					double double32 = double15 + double28;
					bdt bdt3 = bdt21.d(double26, 1.0, double28);
					if (!this.l.a(bdt3)) {
						if (this.l.o(new co(double30, this.q, double32)).r()) {
							this.a(double30, this.q + 1.0, double32);
							return;
						}

						co co34 = new co(double30, this.q - 1.0, double32);
						if (this.l.o(co34).r() || this.l.o(co34).a() == azs.h) {
							double4 = double30;
							double6 = this.q + 1.0;
							double8 = double32;
						}
					} else if (!this.l.a(bdt3.d(0.0, 1.0, 0.0)) && this.l.o(new co(double30, this.q + 1.0, double32)).r()) {
						double4 = double30;
						double6 = this.q + 2.0;
						double8 = double32;
					}
				}
			}

			this.a(double4, double6, double8);
		} else {
			double double3 = (double)(this.G / 2.0F + sn.G / 2.0F) + 0.4;
			float float5;
			if (sn instanceof abx) {
				float5 = 0.0F;
			} else {
				float5 = (float) (Math.PI / 2) * (float)(this.cx() == sv.RIGHT ? -1 : 1);
			}

			float float6 = -ot.a(-this.v * (float) (Math.PI / 180.0) - (float) Math.PI + float5);
			float float7 = -ot.b(-this.v * (float) (Math.PI / 180.0) - (float) Math.PI + float5);
			double double8 = Math.abs(float6) > Math.abs(float7) ? double3 / (double)Math.abs(float6) : double3 / (double)Math.abs(float7);
			double double10 = this.p + (double)float6 * double8;
			double double12 = this.r + (double)float7 * double8;
			this.b(double10, sn.q + (double)sn.H + 0.001, double12);
			if (this.l.a(this.bo())) {
				this.b(double10, sn.q + (double)sn.H + 1.001, double12);
				if (this.l.a(this.bo())) {
					this.b(sn.p, sn.q + (double)this.H + 0.001, sn.r);
				}
			}
		}
	}

	@Override
	public boolean bk() {
		return this.bj();
	}

	protected float cl() {
		return 0.42F;
	}

	protected void cm() {
		this.t = (double)this.cl();
		if (this.a(si.h)) {
			this.t = this.t + (double)((float)(this.b(si.h).c() + 1) * 0.1F);
		}

		if (this.aN()) {
			float float2 = this.v * (float) (Math.PI / 180.0);
			this.s = this.s - (double)(ot.a(float2) * 0.2F);
			this.u = this.u + (double)(ot.b(float2) * 0.2F);
		}

		this.ai = true;
	}

	protected void cn() {
		this.t += 0.04F;
	}

	protected void co() {
		this.t += 0.04F;
	}

	protected float cp() {
		return 0.8F;
	}

	public void g(float float1, float float2) {
		if (this.cu() || this.bA()) {
			if (!this.aj() || this instanceof aay && ((aay)this).bK.b) {
				if (!this.ao() || this instanceof aay && ((aay)this).bK.b) {
					if (this.cH()) {
						if (this.t > -0.5) {
							this.L = 1.0F;
						}

						bdw bdw4 = this.aB();
						float float5 = this.w * (float) (Math.PI / 180.0);
						double double6 = Math.sqrt(bdw4.b * bdw4.b + bdw4.d * bdw4.d);
						double double8 = Math.sqrt(this.s * this.s + this.u * this.u);
						double double10 = bdw4.b();
						float float12 = ot.b(float5);
						float12 = (float)((double)float12 * (double)float12 * Math.min(1.0, double10 / 0.4));
						this.t += -0.08 + (double)float12 * 0.06;
						if (this.t < 0.0 && double6 > 0.0) {
							double double13 = this.t * -0.1 * (double)float12;
							this.t += double13;
							this.s = this.s + bdw4.b * double13 / double6;
							this.u = this.u + bdw4.d * double13 / double6;
						}

						if (float5 < 0.0F) {
							double double13 = double8 * (double)(-ot.a(float5)) * 0.04;
							this.t += double13 * 3.2;
							this.s = this.s - bdw4.b * double13 / double6;
							this.u = this.u - bdw4.d * double13 / double6;
						}

						if (double6 > 0.0) {
							this.s = this.s + (bdw4.b / double6 * double8 - this.s) * 0.1;
							this.u = this.u + (bdw4.d / double6 * double8 - this.u) * 0.1;
						}

						this.s *= 0.99F;
						this.t *= 0.98F;
						this.u *= 0.99F;
						this.a(tc.SELF, this.s, this.t, this.u);
						if (this.A && !this.l.E) {
							double double13 = Math.sqrt(this.s * this.s + this.u * this.u);
							double double15 = double8 - double13;
							float float17 = (float)(double15 * 10.0 - 3.0);
							if (float17 > 0.0F) {
								this.a(this.e((int)float17), 1.0F, 1.0F);
								this.a(ry.l, float17);
							}
						}

						if (this.z && !this.l.E) {
							this.b(7, false);
						}
					} else {
						float float4 = 0.91F;
						co.b b5 = co.b.d(this.p, this.bo().b - 1.0, this.r);
						if (this.z) {
							float4 = this.l.o(b5).v().z * 0.91F;
						}

						float float6 = 0.16277136F / (float4 * float4 * float4);
						float float7;
						if (this.z) {
							float7 = this.cq() * float6;
						} else {
							float7 = this.aR;
						}

						this.a(float1, float2, float7);
						float4 = 0.91F;
						if (this.z) {
							float4 = this.l.o(b5.e(this.p, this.bo().b - 1.0, this.r)).v().z * 0.91F;
						}

						if (this.m_()) {
							float float8 = 0.15F;
							this.s = ot.a(this.s, -0.15F, 0.15F);
							this.u = ot.a(this.u, -0.15F, 0.15F);
							this.L = 0.0F;
							if (this.t < -0.15) {
								this.t = -0.15;
							}

							boolean boolean9 = this.aM() && this instanceof aay;
							if (boolean9 && this.t < 0.0) {
								this.t = 0.0;
							}
						}

						this.a(tc.SELF, this.s, this.t, this.u);
						if (this.A && this.m_()) {
							this.t = 0.2;
						}

						if (this.a(si.y)) {
							this.t = this.t + (0.05 * (double)(this.b(si.y).c() + 1) - this.t) * 0.2;
						} else {
							b5.e(this.p, 0.0, this.r);
							if (!this.l.E || this.l.e(b5) && this.l.f(b5).p()) {
								if (!this.ae()) {
									this.t -= 0.08;
								}
							} else if (this.q > 0.0) {
								this.t = -0.1;
							} else {
								this.t = 0.0;
							}
						}

						this.t *= 0.98F;
						this.s *= (double)float4;
						this.u *= (double)float4;
						b5.t();
					}
				} else {
					double double4 = this.q;
					this.a(float1, float2, 0.02F);
					this.a(tc.SELF, this.s, this.t, this.u);
					this.s *= 0.5;
					this.t *= 0.5;
					this.u *= 0.5;
					if (!this.ae()) {
						this.t -= 0.02;
					}

					if (this.A && this.c(this.s, this.t + 0.6F - this.q + double4, this.u)) {
						this.t = 0.3F;
					}
				}
			} else {
				double double4x = this.q;
				float float6x = this.cp();
				float float7x = 0.02F;
				float float8x = (float)aik.e(this);
				if (float8x > 3.0F) {
					float8x = 3.0F;
				}

				if (!this.z) {
					float8x *= 0.5F;
				}

				if (float8x > 0.0F) {
					float6x += (0.54600006F - float6x) * float8x / 3.0F;
					float7x += (this.cq() - float7x) * float8x / 3.0F;
				}

				this.a(float1, float2, float7x);
				this.a(tc.SELF, this.s, this.t, this.u);
				this.s *= (double)float6x;
				this.t *= 0.8F;
				this.u *= (double)float6x;
				if (!this.ae()) {
					this.t -= 0.02;
				}

				if (this.A && this.c(this.s, this.t + 0.6F - this.q + double4x, this.u)) {
					this.t = 0.3F;
				}
			}
		}

		this.aF = this.aG;
		double double4xx = this.p - this.m;
		double double6x = this.r - this.o;
		float float8xx = ot.a(double4xx * double4xx + double6x * double6x) * 4.0F;
		if (float8xx > 1.0F) {
			float8xx = 1.0F;
		}

		this.aG = this.aG + (float8xx - this.aG) * 0.4F;
		this.aH = this.aH + this.aG;
	}

	public float cq() {
		return this.bB;
	}

	public void l(float float1) {
		this.bB = float1;
	}

	public boolean B(sn sn) {
		this.z(sn);
		return false;
	}

	public boolean cr() {
		return false;
	}

	@Override
	public void A_() {
		super.A_();
		this.cA();
		if (!this.l.E) {
			int integer2 = this.cc();
			if (integer2 > 0) {
				if (this.ax <= 0) {
					this.ax = 20 * (30 - integer2);
				}

				this.ax--;
				if (this.ax <= 0) {
					this.f(integer2 - 1);
				}
			}

			for (ss ss6 : ss.values()) {
				afj afj7;
				switch (ss6.a()) {
					case HAND:
						afj7 = this.bu.get(ss6.b());
						break;
					case ARMOR:
						afj7 = this.bv.get(ss6.b());
						break;
					default:
						continue;
				}

				afj afj8 = this.b(ss6);
				if (!afj.b(afj8, afj7)) {
					((lw)this.l).v().a(this, new hv(this.O(), ss6, afj8));
					if (!afj7.b()) {
						this.ce().a(afj7.a(ss6));
					}

					if (!afj8.b()) {
						this.ce().b(afj8.a(ss6));
					}

					switch (ss6.a()) {
						case HAND:
							this.bu.set(ss6.b(), afj8.b() ? afj.a : afj8.l());
							break;
						case ARMOR:
							this.bv.set(ss6.b(), afj8.b() ? afj.a : afj8.l());
					}
				}
			}

			if (this.T % 20 == 0) {
				this.bZ().g();
			}

			if (!this.as) {
				boolean boolean3 = this.a(si.x);
				if (this.k(6) != boolean3) {
					this.b(6, boolean3);
				}
			}
		}

		this.n();
		double double2 = this.p - this.m;
		double double4 = this.r - this.o;
		float float6 = (float)(double2 * double2 + double4 * double4);
		float float7 = this.aN;
		float float8 = 0.0F;
		this.aW = this.aX;
		float float9 = 0.0F;
		if (float6 > 0.0025000002F) {
			float9 = 1.0F;
			float8 = (float)Math.sqrt((double)float6) * 3.0F;
			float7 = (float)ot.c(double4, double2) * (180.0F / (float)Math.PI) - 90.0F;
		}

		if (this.aD > 0.0F) {
			float7 = this.v;
		}

		if (!this.z) {
			float9 = 0.0F;
		}

		this.aX = this.aX + (float9 - this.aX) * 0.3F;
		this.l.C.a("headTurn");
		float8 = this.h(float7, float8);
		this.l.C.b();
		this.l.C.a("rangeChecks");

		while (this.v - this.x < -180.0F) {
			this.x -= 360.0F;
		}

		while (this.v - this.x >= 180.0F) {
			this.x += 360.0F;
		}

		while (this.aN - this.aO < -180.0F) {
			this.aO -= 360.0F;
		}

		while (this.aN - this.aO >= 180.0F) {
			this.aO += 360.0F;
		}

		while (this.w - this.y < -180.0F) {
			this.y -= 360.0F;
		}

		while (this.w - this.y >= 180.0F) {
			this.y += 360.0F;
		}

		while (this.aP - this.aQ < -180.0F) {
			this.aQ -= 360.0F;
		}

		while (this.aP - this.aQ >= 180.0F) {
			this.aQ += 360.0F;
		}

		this.l.C.b();
		this.aY += float8;
		if (this.cH()) {
			this.bp++;
		} else {
			this.bp = 0;
		}
	}

	protected float h(float float1, float float2) {
		float float4 = ot.g(float1 - this.aN);
		this.aN += float4 * 0.3F;
		float float5 = ot.g(this.v - this.aN);
		boolean boolean6 = float5 < -90.0F || float5 >= 90.0F;
		if (float5 < -75.0F) {
			float5 = -75.0F;
		}

		if (float5 >= 75.0F) {
			float5 = 75.0F;
		}

		this.aN = this.v - float5;
		if (float5 * float5 > 2500.0F) {
			this.aN += float5 * 0.2F;
		}

		if (boolean6) {
			float2 *= -1.0F;
		}

		return float2;
	}

	public void n() {
		if (this.bC > 0) {
			this.bC--;
		}

		if (this.bh > 0 && !this.bA()) {
			double double2 = this.p + (this.bi - this.p) / (double)this.bh;
			double double4 = this.q + (this.bj - this.q) / (double)this.bh;
			double double6 = this.r + (this.bk - this.r) / (double)this.bh;
			double double8 = ot.g(this.bl - (double)this.v);
			this.v = (float)((double)this.v + double8 / (double)this.bh);
			this.w = (float)((double)this.w + (this.bm - (double)this.w) / (double)this.bh);
			this.bh--;
			this.b(double2, double4, double6);
			this.b(this.v, this.w);
		} else if (!this.cu()) {
			this.s *= 0.98;
			this.t *= 0.98;
			this.u *= 0.98;
		}

		if (Math.abs(this.s) < 0.003) {
			this.s = 0.0;
		}

		if (Math.abs(this.t) < 0.003) {
			this.t = 0.0;
		}

		if (Math.abs(this.u) < 0.003) {
			this.u = 0.0;
		}

		this.l.C.a("ai");
		if (this.ck()) {
			this.bd = false;
			this.be = 0.0F;
			this.bf = 0.0F;
			this.bg = 0.0F;
		} else if (this.cu()) {
			this.l.C.a("newAi");
			this.cs();
			this.l.C.b();
		}

		this.l.C.b();
		this.l.C.a("jump");
		if (this.bd) {
			if (this.aj()) {
				this.cn();
			} else if (this.ao()) {
				this.co();
			} else if (this.z && this.bC == 0) {
				this.cm();
				this.bC = 10;
			}
		} else {
			this.bC = 0;
		}

		this.l.C.b();
		this.l.C.a("travel");
		this.be *= 0.98F;
		this.bf *= 0.98F;
		this.bg *= 0.9F;
		this.r();
		this.g(this.be, this.bf);
		this.l.C.b();
		this.l.C.a("push");
		this.ct();
		this.l.C.b();
	}

	private void r() {
		boolean boolean2 = this.k(7);
		if (boolean2 && !this.z && !this.aK()) {
			afj afj3 = this.b(ss.CHEST);
			if (afj3.c() == afl.cS && aeq.d(afj3)) {
				boolean2 = true;
				if (!this.l.E && (this.bp + 1) % 20 == 0) {
					afj3.a(1, this);
				}
			} else {
				boolean2 = false;
			}
		} else {
			boolean2 = false;
		}

		if (!this.l.E) {
			this.b(7, boolean2);
		}
	}

	protected void cs() {
	}

	protected void ct() {
		List<sn> list2 = this.l.a(this, this.bo(), sr.a(this));
		if (!list2.isEmpty()) {
			int integer3 = this.l.U().c("maxEntityCramming");
			if (integer3 > 0 && list2.size() > integer3 - 1 && this.S.nextInt(4) == 0) {
				int integer4 = 0;

				for (int integer5 = 0; integer5 < list2.size(); integer5++) {
					if (!((sn)list2.get(integer5)).aK()) {
						integer4++;
					}
				}

				if (integer4 > integer3 - 1) {
					this.a(ry.g, 6.0F);
				}
			}

			for (int integer4 = 0; integer4 < list2.size(); integer4++) {
				sn sn5 = (sn)list2.get(integer4);
				this.C(sn5);
			}
		}
	}

	protected void C(sn sn) {
		sn.i(this);
	}

	@Override
	public void p() {
		sn sn2 = this.bB();
		super.p();
		if (sn2 != null && sn2 != this.bB() && !this.l.E) {
			this.A(sn2);
		}
	}

	@Override
	public void aw() {
		super.aw();
		this.aW = this.aX;
		this.aX = 0.0F;
		this.L = 0.0F;
	}

	@Override
	public void a(double double1, double double2, double double3, float float4, float float5, int integer, boolean boolean7) {
		this.bi = double1;
		this.bj = double2;
		this.bk = double3;
		this.bl = (double)float4;
		this.bm = (double)float5;
		this.bh = integer;
	}

	public void l(boolean boolean1) {
		this.bd = boolean1;
	}

	public void a(sn sn, int integer) {
		if (!sn.F && !this.l.E) {
			lt lt4 = ((lw)this.l).v();
			if (sn instanceof zj || sn instanceof abb || sn instanceof st) {
				lt4.a(sn, new ii(sn.O(), this.O(), integer));
			}
		}
	}

	public boolean D(sn sn) {
		return this.l.a(new bdw(this.p, this.q + (double)this.bq(), this.r), new bdw(sn.p, sn.q + (double)sn.bq(), sn.r), false, true, false) == null;
	}

	@Override
	public bdw aB() {
		return this.f(1.0F);
	}

	@Override
	public bdw f(float float1) {
		if (float1 == 1.0F) {
			return this.f(this.w, this.aP);
		} else {
			float float3 = this.y + (this.w - this.y) * float1;
			float float4 = this.aQ + (this.aP - this.aQ) * float1;
			return this.f(float3, float4);
		}
	}

	public float m(float float1) {
		float float3 = this.aD - this.aC;
		if (float3 < 0.0F) {
			float3++;
		}

		return this.aC + float3 * float1;
	}

	public boolean cu() {
		return !this.l.E;
	}

	@Override
	public boolean aq() {
		return !this.F;
	}

	@Override
	public boolean ar() {
		return this.au() && !this.m_();
	}

	@Override
	protected void ap() {
		this.D = this.S.nextDouble() >= this.a(aad.c).e();
	}

	@Override
	public float aU() {
		return this.aP;
	}

	@Override
	public void h(float float1) {
		this.aP = float1;
	}

	@Override
	public void i(float float1) {
		this.aN = float1;
	}

	public float cv() {
		return this.bD;
	}

	public void n(float float1) {
		if (float1 < 0.0F) {
			float1 = 0.0F;
		}

		this.bD = float1;
	}

	public void j() {
	}

	public void k() {
	}

	protected void cw() {
		this.bw = true;
	}

	public abstract sv cx();

	public boolean cy() {
		return (this.Y.a(at) & 1) > 0;
	}

	public ri cz() {
		return (this.Y.a(at) & 2) > 0 ? ri.OFF_HAND : ri.MAIN_HAND;
	}

	protected void cA() {
		if (this.cy()) {
			afj afj2 = this.b(this.cz());
			if (afj2 == this.bn) {
				if (this.cC() <= 25 && this.cC() % 4 == 0) {
					this.a(this.bn, 5);
				}

				if (--this.bo == 0 && !this.l.E) {
					this.v();
				}
			} else {
				this.cF();
			}
		}
	}

	public void c(ri ri) {
		afj afj3 = this.b(ri);
		if (!afj3.b() && !this.cy()) {
			this.bn = afj3;
			this.bo = afj3.m();
			if (!this.l.E) {
				int integer4 = 1;
				if (ri == ri.OFF_HAND) {
					integer4 |= 2;
				}

				this.Y.b(at, (byte)integer4);
			}
		}
	}

	@Override
	public void a(kk<?> kk) {
		super.a(kk);
		if (at.equals(kk) && this.l.E) {
			if (this.cy() && this.bn.b()) {
				this.bn = this.b(this.cz());
				if (!this.bn.b()) {
					this.bo = this.bn.m();
				}
			} else if (!this.cy() && !this.bn.b()) {
				this.bn = afj.a;
				this.bo = 0;
			}
		}
	}

	protected void a(afj afj, int integer) {
		if (!afj.b() && this.cy()) {
			if (afj.n() == agu.DRINK) {
				this.a(nn.bN, 0.5F, this.l.r.nextFloat() * 0.1F + 0.9F);
			}

			if (afj.n() == agu.EAT) {
				for (int integer4 = 0; integer4 < integer; integer4++) {
					bdw bdw5 = new bdw(((double)this.S.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
					bdw5 = bdw5.a(-this.w * (float) (Math.PI / 180.0));
					bdw5 = bdw5.b(-this.v * (float) (Math.PI / 180.0));
					double double6 = (double)(-this.S.nextFloat()) * 0.6 - 0.3;
					bdw bdw8 = new bdw(((double)this.S.nextFloat() - 0.5) * 0.3, double6, 0.6);
					bdw8 = bdw8.a(-this.w * (float) (Math.PI / 180.0));
					bdw8 = bdw8.b(-this.v * (float) (Math.PI / 180.0));
					bdw8 = bdw8.b(this.p, this.q + (double)this.bq(), this.r);
					if (afj.g()) {
						this.l.a(de.ITEM_CRACK, bdw8.b, bdw8.c, bdw8.d, bdw5.b, bdw5.c + 0.05, bdw5.d, afh.a(afj.c()), afj.j());
					} else {
						this.l.a(de.ITEM_CRACK, bdw8.b, bdw8.c, bdw8.d, bdw5.b, bdw5.c + 0.05, bdw5.d, afh.a(afj.c()));
					}
				}

				this.a(nn.bO, 0.5F + 0.5F * (float)this.S.nextInt(2), (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
			}
		}
	}

	protected void v() {
		if (!this.bn.b() && this.cy()) {
			this.a(this.bn, 16);
			this.a(this.cz(), this.bn.a(this.l, this));
			this.cF();
		}
	}

	public afj cB() {
		return this.bn;
	}

	public int cC() {
		return this.bo;
	}

	public int cD() {
		return this.cy() ? this.bn.m() - this.cC() : 0;
	}

	public void cE() {
		if (!this.bn.b()) {
			this.bn.a(this.l, this, this.cC());
		}

		this.cF();
	}

	public void cF() {
		if (!this.l.E) {
			this.Y.b(at, (byte)0);
		}

		this.bn = afj.a;
		this.bo = 0;
	}

	public boolean cG() {
		if (this.cy() && !this.bn.b()) {
			afh afh2 = this.bn.c();
			return afh2.f(this.bn) != agu.BLOCK ? false : afh2.e(this.bn) - this.bo >= 5;
		} else {
			return false;
		}
	}

	public boolean cH() {
		return this.k(7);
	}

	public int cI() {
		return this.bp;
	}

	public boolean j(double double1, double double2, double double3) {
		double double8 = this.p;
		double double10 = this.q;
		double double12 = this.r;
		this.p = double1;
		this.q = double2;
		this.r = double3;
		boolean boolean14 = false;
		co co15 = new co(this);
		ajs ajs16 = this.l;
		Random random17 = this.bJ();
		if (ajs16.e(co15)) {
			boolean boolean18 = false;

			while (!boolean18 && co15.q() > 0) {
				co co19 = co15.b();
				atl atl20 = ajs16.o(co19);
				if (atl20.a().c()) {
					boolean18 = true;
				} else {
					this.q--;
					co15 = co19;
				}
			}

			if (boolean18) {
				this.a(this.p, this.q, this.r);
				if (ajs16.a(this, this.bo()).isEmpty() && !ajs16.d(this.bo())) {
					boolean14 = true;
				}
			}
		}

		if (!boolean14) {
			this.a(double8, double10, double12);
			return false;
		} else {
			int integer18 = 128;

			for (int integer19 = 0; integer19 < 128; integer19++) {
				double double20 = (double)integer19 / 127.0;
				float float22 = (random17.nextFloat() - 0.5F) * 0.2F;
				float float23 = (random17.nextFloat() - 0.5F) * 0.2F;
				float float24 = (random17.nextFloat() - 0.5F) * 0.2F;
				double double25 = double8 + (this.p - double8) * double20 + (random17.nextDouble() - 0.5) * (double)this.G * 2.0;
				double double27 = double10 + (this.q - double10) * double20 + random17.nextDouble() * (double)this.H;
				double double29 = double12 + (this.r - double12) * double20 + (random17.nextDouble() - 0.5) * (double)this.G * 2.0;
				ajs16.a(de.PORTAL, double25, double27, double29, (double)float22, (double)float23, (double)float24);
			}

			if (this instanceof te) {
				((te)this).x().o();
			}

			return true;
		}
	}

	public boolean cJ() {
		return true;
	}

	public boolean cK() {
		return true;
	}
}

import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;

public class yx extends sw {
	private static final di bq = new di(0.0F, 0.0F, 0.0F);
	private static final di br = new di(0.0F, 0.0F, 0.0F);
	private static final di bs = new di(-10.0F, 0.0F, -10.0F);
	private static final di bt = new di(-15.0F, 0.0F, 10.0F);
	private static final di bu = new di(-1.0F, 0.0F, -1.0F);
	private static final di bv = new di(1.0F, 0.0F, 1.0F);
	public static final kk<Byte> a = kn.a(yx.class, km.a);
	public static final kk<di> b = kn.a(yx.class, km.i);
	public static final kk<di> c = kn.a(yx.class, km.i);
	public static final kk<di> d = kn.a(yx.class, km.i);
	public static final kk<di> e = kn.a(yx.class, km.i);
	public static final kk<di> f = kn.a(yx.class, km.i);
	public static final kk<di> g = kn.a(yx.class, km.i);
	private static final Predicate<sn> bw = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn instanceof aby && ((aby)sn).v() == aby.a.RIDEABLE;
		}
	};
	private final dd<afj> bx = dd.a(2, afj.a);
	private final dd<afj> by = dd.a(4, afj.a);
	private boolean bz;
	public long h;
	private int bA;
	private boolean bB;
	private di bC = bq;
	private di bD = br;
	private di bE = bs;
	private di bF = bt;
	private di bG = bu;
	private di bH = bv;

	public yx(ajs ajs) {
		super(ajs);
		this.Q = this.ae();
		this.a(0.5F, 1.975F);
	}

	public yx(ajs ajs, double double2, double double3, double double4) {
		this(ajs);
		this.b(double2, double3, double4);
	}

	@Override
	protected final void a(float float1, float float2) {
		double double4 = this.p;
		double double6 = this.q;
		double double8 = this.r;
		float float10 = this.t() ? 0.0F : (this.l_() ? 0.5F : 1.0F);
		super.a(float1 * float10, float2 * float10);
		this.b(double4, double6, double8);
	}

	@Override
	public boolean cu() {
		return super.cu() && !this.ae();
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, (byte)0);
		this.Y.a(b, bq);
		this.Y.a(c, br);
		this.Y.a(d, bs);
		this.Y.a(e, bt);
		this.Y.a(f, bu);
		this.Y.a(g, bv);
	}

	@Override
	public Iterable<afj> aG() {
		return this.bx;
	}

	@Override
	public Iterable<afj> aH() {
		return this.by;
	}

	@Override
	public afj b(ss ss) {
		switch (ss.a()) {
			case HAND:
				return this.bx.get(ss.b());
			case ARMOR:
				return this.by.get(ss.b());
			default:
				return afj.a;
		}
	}

	@Override
	public void a(ss ss, afj afj) {
		switch (ss.a()) {
			case HAND:
				this.a_(afj);
				this.bx.set(ss.b(), afj);
				break;
			case ARMOR:
				this.a_(afj);
				this.by.set(ss.b(), afj);
		}
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

		if (!afj.b() && !sx.b(ss4, afj) && ss4 != ss.HEAD) {
			return false;
		} else {
			this.a(ss4, afj);
			return true;
		}
	}

	public static void a(ph ph) {
		ph.a(pf.ENTITY, new qu(yx.class, "ArmorItems", "HandItems"));
	}

	@Override
	public void b(du du) {
		super.b(du);
		ea ea3 = new ea();

		for (afj afj5 : this.by) {
			du du6 = new du();
			if (!afj5.b()) {
				afj5.a(du6);
			}

			ea3.a(du6);
		}

		du.a("ArmorItems", ea3);
		ea ea4 = new ea();

		for (afj afj6 : this.bx) {
			du du7 = new du();
			if (!afj6.b()) {
				afj6.a(du7);
			}

			ea4.a(du7);
		}

		du.a("HandItems", ea4);
		du.a("Invisible", this.aP());
		du.a("Small", this.o());
		du.a("ShowArms", this.r());
		du.a("DisabledSlots", this.bA);
		du.a("NoBasePlate", this.s());
		if (this.t()) {
			du.a("Marker", this.t());
		}

		du.a("Pose", this.C());
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.b("ArmorItems", 9)) {
			ea ea3 = du.c("ArmorItems", 10);

			for (int integer4 = 0; integer4 < this.by.size(); integer4++) {
				this.by.set(integer4, new afj(ea3.b(integer4)));
			}
		}

		if (du.b("HandItems", 9)) {
			ea ea3 = du.c("HandItems", 10);

			for (int integer4 = 0; integer4 < this.bx.size(); integer4++) {
				this.bx.set(integer4, new afj(ea3.b(integer4)));
			}
		}

		this.h(du.p("Invisible"));
		this.m(du.p("Small"));
		this.n(du.p("ShowArms"));
		this.bA = du.h("DisabledSlots");
		this.o(du.p("NoBasePlate"));
		this.p(du.p("Marker"));
		this.bB = !this.t();
		this.Q = this.ae();
		du du3 = du.o("Pose");
		this.g(du3);
	}

	private void g(du du) {
		ea ea3 = du.c("Head", 5);
		this.a(ea3.b_() ? bq : new di(ea3));
		ea ea4 = du.c("Body", 5);
		this.b(ea4.b_() ? br : new di(ea4));
		ea ea5 = du.c("LeftArm", 5);
		this.c(ea5.b_() ? bs : new di(ea5));
		ea ea6 = du.c("RightArm", 5);
		this.d(ea6.b_() ? bt : new di(ea6));
		ea ea7 = du.c("LeftLeg", 5);
		this.e(ea7.b_() ? bu : new di(ea7));
		ea ea8 = du.c("RightLeg", 5);
		this.f(ea8.b_() ? bv : new di(ea8));
	}

	private du C() {
		du du2 = new du();
		if (!bq.equals(this.bC)) {
			du2.a("Head", this.bC.a());
		}

		if (!br.equals(this.bD)) {
			du2.a("Body", this.bD.a());
		}

		if (!bs.equals(this.bE)) {
			du2.a("LeftArm", this.bE.a());
		}

		if (!bt.equals(this.bF)) {
			du2.a("RightArm", this.bF.a());
		}

		if (!bu.equals(this.bG)) {
			du2.a("LeftLeg", this.bG.a());
		}

		if (!bv.equals(this.bH)) {
			du2.a("RightLeg", this.bH.a());
		}

		return du2;
	}

	@Override
	public boolean ar() {
		return false;
	}

	@Override
	protected void C(sn sn) {
	}

	@Override
	protected void ct() {
		List<sn> list2 = this.l.a(this, this.bo(), bw);

		for (int integer3 = 0; integer3 < list2.size(); integer3++) {
			sn sn4 = (sn)list2.get(integer3);
			if (this.h(sn4) <= 0.2) {
				sn4.i(this);
			}
		}
	}

	@Override
	public rk a(aay aay, bdw bdw, ri ri) {
		afj afj5 = aay.b(ri);
		if (this.t() || afj5.c() == afl.cz) {
			return rk.PASS;
		} else if (!this.l.E && !aay.y()) {
			ss ss6 = sx.d(afj5);
			if (afj5.b()) {
				ss ss7 = this.a(bdw);
				ss ss8 = this.c(ss7) ? ss6 : ss7;
				if (this.a(ss8)) {
					this.a(aay, ss8, afj5, ri);
				}
			} else {
				if (this.c(ss6)) {
					return rk.FAIL;
				}

				if (ss6.a() == ss.a.HAND && !this.r()) {
					return rk.FAIL;
				}

				this.a(aay, ss6, afj5, ri);
			}

			return rk.SUCCESS;
		} else {
			return rk.SUCCESS;
		}
	}

	protected ss a(bdw bdw) {
		ss ss3 = ss.MAINHAND;
		boolean boolean4 = this.o();
		double double5 = boolean4 ? bdw.c * 2.0 : bdw.c;
		ss ss7 = ss.FEET;
		if (double5 >= 0.1 && double5 < 0.1 + (boolean4 ? 0.8 : 0.45) && this.a(ss7)) {
			ss3 = ss.FEET;
		} else if (double5 >= 0.9 + (boolean4 ? 0.3 : 0.0) && double5 < 0.9 + (boolean4 ? 1.0 : 0.7) && this.a(ss.CHEST)) {
			ss3 = ss.CHEST;
		} else if (double5 >= 0.4 && double5 < 0.4 + (boolean4 ? 1.0 : 0.8) && this.a(ss.LEGS)) {
			ss3 = ss.LEGS;
		} else if (double5 >= 1.6 && this.a(ss.HEAD)) {
			ss3 = ss.HEAD;
		}

		return ss3;
	}

	private boolean c(ss ss) {
		return (this.bA & 1 << ss.c()) != 0;
	}

	private void a(aay aay, ss ss, afj afj, ri ri) {
		afj afj6 = this.b(ss);
		if (afj6.b() || (this.bA & 1 << ss.c() + 8) == 0) {
			if (!afj6.b() || (this.bA & 1 << ss.c() + 16) == 0) {
				if (aay.bK.d && afj6.b() && !afj.b()) {
					afj afj7 = afj.l();
					afj7.e(1);
					this.a(ss, afj7);
				} else if (afj.b() || afj.E() <= 1) {
					this.a(ss, afj);
					aay.a(ri, afj6);
				} else if (afj6.b()) {
					afj afj7 = afj.l();
					afj7.e(1);
					this.a(ss, afj7);
					afj.g(1);
				}
			}
		}
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.l.E || this.F) {
			return false;
		} else if (ry.m.equals(ry)) {
			this.T();
			return false;
		} else if (this.b(ry) || this.bz || this.t()) {
			return false;
		} else if (ry.c()) {
			this.G();
			this.T();
			return false;
		} else if (ry.a.equals(ry)) {
			if (this.aJ()) {
				this.a(0.15F);
			} else {
				this.i(5);
			}

			return false;
		} else if (ry.c.equals(ry) && this.bU() > 0.5F) {
			this.a(4.0F);
			return false;
		} else {
			boolean boolean4 = "arrow".equals(ry.p());
			boolean boolean5 = "player".equals(ry.p());
			if (!boolean5 && !boolean4) {
				return false;
			} else {
				if (ry.i() instanceof abb) {
					ry.i().T();
				}

				if (ry.j() instanceof aay && !((aay)ry.j()).bK.e) {
					return false;
				} else if (ry.u()) {
					this.I();
					this.D();
					this.T();
					return false;
				} else {
					long long6 = this.l.P();
					if (long6 - this.h > 5L && !boolean4) {
						this.l.a(this, (byte)32);
						this.h = long6;
					} else {
						this.E();
						this.D();
						this.T();
					}

					return false;
				}
			}
		}
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 32) {
			if (this.l.E) {
				this.l.a(this.p, this.q, this.r, nn.l, this.bC(), 0.3F, 1.0F, false);
				this.h = this.l.P();
			}
		} else {
			super.a(byte1);
		}
	}

	@Override
	public boolean a(double double1) {
		double double4 = this.bo().a() * 4.0;
		if (Double.isNaN(double4) || double4 == 0.0) {
			double4 = 4.0;
		}

		double4 *= 64.0;
		return double1 < double4 * double4;
	}

	private void D() {
		if (this.l instanceof lw) {
			((lw)this.l)
				.a(
					de.BLOCK_DUST,
					this.p,
					this.q + (double)this.H / 1.5,
					this.r,
					10,
					(double)(this.G / 4.0F),
					(double)(this.H / 4.0F),
					(double)(this.G / 4.0F),
					0.05,
					alu.j(alv.f.t())
				);
		}
	}

	private void a(float float1) {
		float float3 = this.bU();
		float3 -= float1;
		if (float3 <= 0.5F) {
			this.G();
			this.T();
		} else {
			this.c(float3);
		}
	}

	private void E() {
		alu.a(this.l, new co(this), new afj(afl.cu));
		this.G();
	}

	private void G() {
		this.I();

		for (int integer2 = 0; integer2 < this.bx.size(); integer2++) {
			afj afj3 = this.bx.get(integer2);
			if (!afj3.b()) {
				alu.a(this.l, new co(this).a(), afj3);
				this.bx.set(integer2, afj.a);
			}
		}

		for (int integer2x = 0; integer2x < this.by.size(); integer2x++) {
			afj afj3 = this.by.get(integer2x);
			if (!afj3.b()) {
				alu.a(this.l, new co(this).a(), afj3);
				this.by.set(integer2x, afj.a);
			}
		}
	}

	private void I() {
		this.l.a(null, this.p, this.q, this.r, nn.j, this.bC(), 1.0F, 1.0F);
	}

	@Override
	protected float h(float float1, float float2) {
		this.aO = this.x;
		this.aN = this.v;
		return 0.0F;
	}

	@Override
	public float bq() {
		return this.l_() ? this.H * 0.5F : this.H * 0.9F;
	}

	@Override
	public double ax() {
		return this.t() ? 0.0 : 0.1F;
	}

	@Override
	public void g(float float1, float float2) {
		if (!this.ae()) {
			super.g(float1, float2);
		}
	}

	@Override
	public void i(float float1) {
		this.aO = this.x = float1;
		this.aQ = this.aP = float1;
	}

	@Override
	public void h(float float1) {
		this.aO = this.x = float1;
		this.aQ = this.aP = float1;
	}

	@Override
	public void A_() {
		super.A_();
		di di2 = this.Y.a(b);
		if (!this.bC.equals(di2)) {
			this.a(di2);
		}

		di di3 = this.Y.a(c);
		if (!this.bD.equals(di3)) {
			this.b(di3);
		}

		di di4 = this.Y.a(d);
		if (!this.bE.equals(di4)) {
			this.c(di4);
		}

		di di5 = this.Y.a(e);
		if (!this.bF.equals(di5)) {
			this.d(di5);
		}

		di di6 = this.Y.a(f);
		if (!this.bG.equals(di6)) {
			this.e(di6);
		}

		di di7 = this.Y.a(g);
		if (!this.bH.equals(di7)) {
			this.f(di7);
		}

		boolean boolean8 = this.t();
		if (this.bB != boolean8) {
			this.a(boolean8);
			this.i = !boolean8;
			this.bB = boolean8;
		}
	}

	private void a(boolean boolean1) {
		if (boolean1) {
			this.a(0.0F, 0.0F);
		} else {
			this.a(0.5F, 1.975F);
		}
	}

	@Override
	protected void F() {
		this.h(this.bz);
	}

	@Override
	public void h(boolean boolean1) {
		this.bz = boolean1;
		super.h(boolean1);
	}

	@Override
	public boolean l_() {
		return this.o();
	}

	@Override
	public void Q() {
		this.T();
	}

	@Override
	public boolean bt() {
		return this.aP();
	}

	@Override
	public azv o_() {
		return this.t() ? azv.IGNORE : super.o_();
	}

	private void m(boolean boolean1) {
		this.Y.b(a, this.a(this.Y.a(a), 1, boolean1));
		this.a(0.5F, 1.975F);
	}

	public boolean o() {
		return (this.Y.a(a) & 1) != 0;
	}

	private void n(boolean boolean1) {
		this.Y.b(a, this.a(this.Y.a(a), 4, boolean1));
	}

	public boolean r() {
		return (this.Y.a(a) & 4) != 0;
	}

	private void o(boolean boolean1) {
		this.Y.b(a, this.a(this.Y.a(a), 8, boolean1));
	}

	public boolean s() {
		return (this.Y.a(a) & 8) != 0;
	}

	private void p(boolean boolean1) {
		this.Y.b(a, this.a(this.Y.a(a), 16, boolean1));
		this.a(0.5F, 1.975F);
	}

	public boolean t() {
		return (this.Y.a(a) & 16) != 0;
	}

	private byte a(byte byte1, int integer, boolean boolean3) {
		if (boolean3) {
			byte1 = (byte)(byte1 | integer);
		} else {
			byte1 = (byte)(byte1 & ~integer);
		}

		return byte1;
	}

	public void a(di di) {
		this.bC = di;
		this.Y.b(b, di);
	}

	public void b(di di) {
		this.bD = di;
		this.Y.b(c, di);
	}

	public void c(di di) {
		this.bE = di;
		this.Y.b(d, di);
	}

	public void d(di di) {
		this.bF = di;
		this.Y.b(e, di);
	}

	public void e(di di) {
		this.bG = di;
		this.Y.b(f, di);
	}

	public void f(di di) {
		this.bH = di;
		this.Y.b(g, di);
	}

	public di u() {
		return this.bC;
	}

	public di w() {
		return this.bD;
	}

	public di x() {
		return this.bE;
	}

	public di y() {
		return this.bF;
	}

	public di z() {
		return this.bG;
	}

	public di A() {
		return this.bH;
	}

	@Override
	public boolean aq() {
		return super.aq() && !this.t();
	}

	@Override
	public sv cx() {
		return sv.RIGHT;
	}

	@Override
	protected nm e(int integer) {
		return nn.k;
	}

	@Nullable
	@Override
	protected nm bW() {
		return nn.l;
	}

	@Nullable
	@Override
	protected nm bX() {
		return nn.j;
	}

	@Override
	public void a(zg zg) {
	}

	@Override
	public boolean cJ() {
		return false;
	}

	@Override
	public void a(kk<?> kk) {
		if (a.equals(kk)) {
			this.a(0.5F, 1.975F);
		}

		super.a(kk);
	}

	@Override
	public boolean cK() {
		return false;
	}
}

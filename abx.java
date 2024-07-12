import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class abx extends sn {
	private static final kk<Integer> a = kn.a(abx.class, km.b);
	private static final kk<Integer> b = kn.a(abx.class, km.b);
	private static final kk<Float> c = kn.a(abx.class, km.c);
	private static final kk<Integer> d = kn.a(abx.class, km.b);
	private static final kk<Boolean>[] e = new kk[]{kn.a(abx.class, km.h), kn.a(abx.class, km.h)};
	private final float[] f = new float[2];
	private float g;
	private float h;
	private float at;
	private int au;
	private double av;
	private double aw;
	private double ax;
	private double ay;
	private double az;
	private boolean aA;
	private boolean aB;
	private boolean aC;
	private boolean aD;
	private double aE;
	private float aF;
	private abx.a aG;
	private abx.a aH;
	private double aI;

	public abx(ajs ajs) {
		super(ajs);
		this.i = true;
		this.a(1.375F, 0.5625F);
	}

	public abx(ajs ajs, double double2, double double3, double double4) {
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
	protected boolean af() {
		return false;
	}

	@Override
	protected void i() {
		this.Y.a(a, 0);
		this.Y.a(b, 1);
		this.Y.a(c, 0.0F);
		this.Y.a(d, abx.b.OAK.ordinal());

		for (kk<Boolean> kk5 : e) {
			this.Y.a(kk5, false);
		}
	}

	@Nullable
	@Override
	public bdt j(sn sn) {
		return sn.ar() ? sn.bo() : null;
	}

	@Nullable
	@Override
	public bdt ag() {
		return this.bo();
	}

	@Override
	public boolean ar() {
		return true;
	}

	@Override
	public double ay() {
		return -0.1;
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else if (this.l.E || this.F) {
			return true;
		} else if (ry instanceof sa && ry.j() != null && this.w(ry.j())) {
			return false;
		} else {
			this.d(-this.q());
			this.b(10);
			this.a(this.n() + float2 * 10.0F);
			this.ap();
			boolean boolean4 = ry.j() instanceof aay && ((aay)ry.j()).bK.d;
			if (boolean4 || this.n() > 40.0F) {
				if (!boolean4 && this.l.U().b("doEntityDrops")) {
					this.a(this.j(), 1, 0.0F);
				}

				this.T();
			}

			return true;
		}
	}

	@Override
	public void i(sn sn) {
		if (sn instanceof abx) {
			if (sn.bo().b < this.bo().e) {
				super.i(sn);
			}
		} else if (sn.bo().b <= this.bo().b) {
			super.i(sn);
		}
	}

	public afh j() {
		switch (this.r()) {
			case OAK:
			default:
				return afl.aH;
			case SPRUCE:
				return afl.aI;
			case BIRCH:
				return afl.aJ;
			case JUNGLE:
				return afl.aK;
			case ACACIA:
				return afl.aL;
			case DARK_OAK:
				return afl.aM;
		}
	}

	@Override
	public void aF() {
		this.d(-this.q());
		this.b(10);
		this.a(this.n() * 11.0F);
	}

	@Override
	public boolean aq() {
		return !this.F;
	}

	@Override
	public void a(double double1, double double2, double double3, float float4, float float5, int integer, boolean boolean7) {
		this.av = double1;
		this.aw = double2;
		this.ax = double3;
		this.ay = (double)float4;
		this.az = (double)float5;
		this.au = 10;
	}

	@Override
	public cv bm() {
		return this.bl().e();
	}

	@Override
	public void A_() {
		this.aH = this.aG;
		this.aG = this.t();
		if (this.aG != abx.a.UNDER_WATER && this.aG != abx.a.UNDER_FLOWING_WATER) {
			this.h = 0.0F;
		} else {
			this.h++;
		}

		if (!this.l.E && this.h >= 60.0F) {
			this.az();
		}

		if (this.o() > 0) {
			this.b(this.o() - 1);
		}

		if (this.n() > 0.0F) {
			this.a(this.n() - 1.0F);
		}

		this.m = this.p;
		this.n = this.q;
		this.o = this.r;
		super.A_();
		this.s();
		if (this.bA()) {
			if (this.bx().size() == 0 || !(this.bx().get(0) instanceof aay)) {
				this.a(false, false);
			}

			this.w();
			if (this.l.E) {
				this.x();
				this.l.a(new jb(this.a(0), this.a(1)));
			}

			this.a(tc.SELF, this.s, this.t, this.u);
		} else {
			this.s = 0.0;
			this.t = 0.0;
			this.u = 0.0;
		}

		for (int integer2 = 0; integer2 <= 1; integer2++) {
			if (this.a(integer2)) {
				this.f[integer2] = (float)((double)this.f[integer2] + 0.01);
			} else {
				this.f[integer2] = 0.0F;
			}
		}

		this.ac();
		List<sn> list2 = this.l.a(this, this.bo().c(0.2F, -0.01F, 0.2F), sr.a(this));
		if (!list2.isEmpty()) {
			boolean boolean3 = !this.l.E && !(this.bw() instanceof aay);

			for (int integer4 = 0; integer4 < list2.size(); integer4++) {
				sn sn5 = (sn)list2.get(integer4);
				if (!sn5.w(this)) {
					if (boolean3 && this.bx().size() < 2 && !sn5.aK() && sn5.G < this.G && sn5 instanceof sw && !(sn5 instanceof xj) && !(sn5 instanceof aay)) {
						sn5.m(this);
					} else {
						this.i(sn5);
					}
				}
			}
		}
	}

	private void s() {
		if (this.au > 0 && !this.bA()) {
			double double2 = this.p + (this.av - this.p) / (double)this.au;
			double double4 = this.q + (this.aw - this.q) / (double)this.au;
			double double6 = this.r + (this.ax - this.r) / (double)this.au;
			double double8 = ot.g(this.ay - (double)this.v);
			this.v = (float)((double)this.v + double8 / (double)this.au);
			this.w = (float)((double)this.w + (this.az - (double)this.w) / (double)this.au);
			this.au--;
			this.b(double2, double4, double6);
			this.b(this.v, this.w);
		}
	}

	public void a(boolean boolean1, boolean boolean2) {
		this.Y.b(e[0], boolean1);
		this.Y.b(e[1], boolean2);
	}

	public float a(int integer, float float2) {
		return this.a(integer) ? (float)ot.b((double)this.f[integer] - 0.01, (double)this.f[integer], (double)float2) : 0.0F;
	}

	private abx.a t() {
		abx.a a2 = this.v();
		if (a2 != null) {
			this.aE = this.bo().e;
			return a2;
		} else if (this.u()) {
			return abx.a.IN_WATER;
		} else {
			float float3 = this.l();
			if (float3 > 0.0F) {
				this.aF = float3;
				return abx.a.ON_LAND;
			} else {
				return abx.a.IN_AIR;
			}
		}
	}

	public float k() {
		bdt bdt2 = this.bo();
		int integer3 = ot.c(bdt2.a);
		int integer4 = ot.f(bdt2.d);
		int integer5 = ot.c(bdt2.e);
		int integer6 = ot.f(bdt2.e - this.aI);
		int integer7 = ot.c(bdt2.c);
		int integer8 = ot.f(bdt2.f);
		co.b b9 = co.b.s();

		try {
			label87:
			for (int integer10 = integer5; integer10 < integer6; integer10++) {
				float float11 = 0.0F;
				int integer12 = integer3;

				while (true) {
					if (integer12 < integer4) {
						for (int integer13 = integer7; integer13 < integer8; integer13++) {
							b9.f(integer12, integer10, integer13);
							atl atl14 = this.l.o(b9);
							if (atl14.a() == azs.h) {
								float11 = Math.max(float11, aoq.f(atl14, this.l, b9));
							}

							if (float11 >= 1.0F) {
								continue label87;
							}
						}

						integer12++;
					} else {
						if (float11 < 1.0F) {
							return (float)b9.q() + float11;
						}
						break;
					}
				}
			}

			return (float)(integer6 + 1);
		} finally {
			b9.t();
		}
	}

	public float l() {
		bdt bdt2 = this.bo();
		bdt bdt3 = new bdt(bdt2.a, bdt2.b - 0.001, bdt2.c, bdt2.d, bdt2.b, bdt2.f);
		int integer4 = ot.c(bdt3.a) - 1;
		int integer5 = ot.f(bdt3.d) + 1;
		int integer6 = ot.c(bdt3.b) - 1;
		int integer7 = ot.f(bdt3.e) + 1;
		int integer8 = ot.c(bdt3.c) - 1;
		int integer9 = ot.f(bdt3.f) + 1;
		List<bdt> list10 = Lists.newArrayList();
		float float11 = 0.0F;
		int integer12 = 0;
		co.b b13 = co.b.s();

		try {
			for (int integer14 = integer4; integer14 < integer5; integer14++) {
				for (int integer15 = integer8; integer15 < integer9; integer15++) {
					int integer16 = (integer14 != integer4 && integer14 != integer5 - 1 ? 0 : 1) + (integer15 != integer8 && integer15 != integer9 - 1 ? 0 : 1);
					if (integer16 != 2) {
						for (int integer17 = integer6; integer17 < integer7; integer17++) {
							if (integer16 <= 0 || integer17 != integer6 && integer17 != integer7 - 1) {
								b13.f(integer14, integer17, integer15);
								atl atl18 = this.l.o(b13);
								atl18.a(this.l, b13, bdt3, list10, this, false);
								if (!list10.isEmpty()) {
									float11 += atl18.v().z;
									integer12++;
								}

								list10.clear();
							}
						}
					}
				}
			}
		} finally {
			b13.t();
		}

		return float11 / (float)integer12;
	}

	private boolean u() {
		bdt bdt2 = this.bo();
		int integer3 = ot.c(bdt2.a);
		int integer4 = ot.f(bdt2.d);
		int integer5 = ot.c(bdt2.b);
		int integer6 = ot.f(bdt2.b + 0.001);
		int integer7 = ot.c(bdt2.c);
		int integer8 = ot.f(bdt2.f);
		boolean boolean9 = false;
		this.aE = Double.MIN_VALUE;
		co.b b10 = co.b.s();

		try {
			for (int integer11 = integer3; integer11 < integer4; integer11++) {
				for (int integer12 = integer5; integer12 < integer6; integer12++) {
					for (int integer13 = integer7; integer13 < integer8; integer13++) {
						b10.f(integer11, integer12, integer13);
						atl atl14 = this.l.o(b10);
						if (atl14.a() == azs.h) {
							float float15 = aoq.g(atl14, this.l, b10);
							this.aE = Math.max((double)float15, this.aE);
							boolean9 |= bdt2.b < (double)float15;
						}
					}
				}
			}
		} finally {
			b10.t();
		}

		return boolean9;
	}

	@Nullable
	private abx.a v() {
		bdt bdt2 = this.bo();
		double double3 = bdt2.e + 0.001;
		int integer5 = ot.c(bdt2.a);
		int integer6 = ot.f(bdt2.d);
		int integer7 = ot.c(bdt2.e);
		int integer8 = ot.f(double3);
		int integer9 = ot.c(bdt2.c);
		int integer10 = ot.f(bdt2.f);
		boolean boolean11 = false;
		co.b b12 = co.b.s();

		try {
			for (int integer13 = integer5; integer13 < integer6; integer13++) {
				for (int integer14 = integer7; integer14 < integer8; integer14++) {
					for (int integer15 = integer9; integer15 < integer10; integer15++) {
						b12.f(integer13, integer14, integer15);
						atl atl16 = this.l.o(b12);
						if (atl16.a() == azs.h && double3 < (double)aoq.g(atl16, this.l, b12)) {
							if ((Integer)atl16.c(aoq.b) != 0) {
								return abx.a.UNDER_FLOWING_WATER;
							}

							boolean11 = true;
						}
					}
				}
			}
		} finally {
			b12.t();
		}

		return boolean11 ? abx.a.UNDER_WATER : null;
	}

	private void w() {
		double double2 = -0.04F;
		double double4 = this.ae() ? 0.0 : -0.04F;
		double double6 = 0.0;
		this.g = 0.05F;
		if (this.aH == abx.a.IN_AIR && this.aG != abx.a.IN_AIR && this.aG != abx.a.ON_LAND) {
			this.aE = this.bo().b + (double)this.H;
			this.b(this.p, (double)(this.k() - this.H) + 0.101, this.r);
			this.t = 0.0;
			this.aI = 0.0;
			this.aG = abx.a.IN_WATER;
		} else {
			if (this.aG == abx.a.IN_WATER) {
				double6 = (this.aE - this.bo().b) / (double)this.H;
				this.g = 0.9F;
			} else if (this.aG == abx.a.UNDER_FLOWING_WATER) {
				double4 = -7.0E-4;
				this.g = 0.9F;
			} else if (this.aG == abx.a.UNDER_WATER) {
				double6 = 0.01F;
				this.g = 0.45F;
			} else if (this.aG == abx.a.IN_AIR) {
				this.g = 0.9F;
			} else if (this.aG == abx.a.ON_LAND) {
				this.g = this.aF;
				if (this.bw() instanceof aay) {
					this.aF /= 2.0F;
				}
			}

			this.s = this.s * (double)this.g;
			this.u = this.u * (double)this.g;
			this.at = this.at * this.g;
			this.t += double4;
			if (double6 > 0.0) {
				double double8 = 0.65;
				this.t += double6 * 0.06153846016296973;
				double double10 = 0.75;
				this.t *= 0.75;
			}
		}
	}

	private void x() {
		if (this.aL()) {
			float float2 = 0.0F;
			if (this.aA) {
				this.at += -1.0F;
			}

			if (this.aB) {
				this.at++;
			}

			if (this.aB != this.aA && !this.aC && !this.aD) {
				float2 += 0.005F;
			}

			this.v = this.v + this.at;
			if (this.aC) {
				float2 += 0.04F;
			}

			if (this.aD) {
				float2 -= 0.005F;
			}

			this.s = this.s + (double)(ot.a(-this.v * (float) (Math.PI / 180.0)) * float2);
			this.u = this.u + (double)(ot.b(this.v * (float) (Math.PI / 180.0)) * float2);
			this.a(this.aB && !this.aA || this.aC, this.aA && !this.aB || this.aC);
		}
	}

	@Override
	public void k(sn sn) {
		if (this.w(sn)) {
			float float3 = 0.0F;
			float float4 = (float)((this.F ? 0.01F : this.ay()) + sn.ax());
			if (this.bx().size() > 1) {
				int integer5 = this.bx().indexOf(sn);
				if (integer5 == 0) {
					float3 = 0.2F;
				} else {
					float3 = -0.6F;
				}

				if (sn instanceof ww) {
					float3 = (float)((double)float3 + 0.2);
				}
			}

			bdw bdw5 = new bdw((double)float3, 0.0, 0.0).b(-this.v * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
			sn.b(this.p + bdw5.b, this.q + (double)float4, this.r + bdw5.d);
			sn.v = sn.v + this.at;
			sn.h(sn.aU() + this.at);
			this.a(sn);
			if (sn instanceof ww && this.bx().size() > 1) {
				int integer6 = sn.O() % 2 == 0 ? 90 : 270;
				sn.i(((ww)sn).aN + (float)integer6);
				sn.h(sn.aU() + (float)integer6);
			}
		}
	}

	@Override
	protected void a(sn sn) {
		sn.i(this.v);
		float float3 = ot.g(sn.v - this.v);
		float float4 = ot.a(float3, -105.0F, 105.0F);
		sn.x += float4 - float3;
		sn.v += float4 - float3;
		sn.h(sn.v);
	}

	@Override
	public void l(sn sn) {
		this.a(sn);
	}

	@Override
	protected void b(du du) {
		du.a("Type", this.r().a());
	}

	@Override
	protected void a(du du) {
		if (du.b("Type", 8)) {
			this.a(abx.b.a(du.l("Type")));
		}
	}

	@Override
	public boolean b(aay aay, ri ri) {
		if (aay.aM()) {
			return false;
		} else {
			if (!this.l.E && this.h < 60.0F) {
				aay.m(this);
			}

			return true;
		}
	}

	@Override
	protected void a(double double1, boolean boolean2, atl atl, co co) {
		this.aI = this.t;
		if (!this.aK()) {
			if (boolean2) {
				if (this.L > 3.0F) {
					if (this.aG != abx.a.ON_LAND) {
						this.L = 0.0F;
						return;
					}

					this.e(this.L, 1.0F);
					if (!this.l.E && !this.F) {
						this.T();
						if (this.l.U().b("doEntityDrops")) {
							for (int integer7 = 0; integer7 < 3; integer7++) {
								this.a(new afj(afh.a(alv.f), 1, this.r().b()), 0.0F);
							}

							for (int integer7 = 0; integer7 < 2; integer7++) {
								this.a(afl.B, 1, 0.0F);
							}
						}
					}
				}

				this.L = 0.0F;
			} else if (this.l.o(new co(this).b()).a() != azs.h && double1 < 0.0) {
				this.L = (float)((double)this.L - double1);
			}
		}
	}

	public boolean a(int integer) {
		return this.Y.a(e[integer]) && this.bw() != null;
	}

	public void a(float float1) {
		this.Y.b(c, float1);
	}

	public float n() {
		return this.Y.a(c);
	}

	public void b(int integer) {
		this.Y.b(a, integer);
	}

	public int o() {
		return this.Y.a(a);
	}

	public void d(int integer) {
		this.Y.b(b, integer);
	}

	public int q() {
		return this.Y.a(b);
	}

	public void a(abx.b b) {
		this.Y.b(d, b.ordinal());
	}

	public abx.b r() {
		return abx.b.a(this.Y.a(d));
	}

	@Override
	protected boolean q(sn sn) {
		return this.bx().size() < 2;
	}

	@Nullable
	@Override
	public sn bw() {
		List<sn> list2 = this.bx();
		return list2.isEmpty() ? null : (sn)list2.get(0);
	}

	public void a(boolean boolean1, boolean boolean2, boolean boolean3, boolean boolean4) {
		this.aA = boolean1;
		this.aB = boolean2;
		this.aC = boolean3;
		this.aD = boolean4;
	}

	public static enum a {
		IN_WATER,
		UNDER_WATER,
		UNDER_FLOWING_WATER,
		ON_LAND,
		IN_AIR;
	}

	public static enum b {
		OAK(apn.a.OAK.a(), "oak"),
		SPRUCE(apn.a.SPRUCE.a(), "spruce"),
		BIRCH(apn.a.BIRCH.a(), "birch"),
		JUNGLE(apn.a.JUNGLE.a(), "jungle"),
		ACACIA(apn.a.ACACIA.a(), "acacia"),
		DARK_OAK(apn.a.DARK_OAK.a(), "dark_oak");

		private final String g;
		private final int h;

		private b(int integer3, String string4) {
			this.g = string4;
			this.h = integer3;
		}

		public String a() {
			return this.g;
		}

		public int b() {
			return this.h;
		}

		public String toString() {
			return this.g;
		}

		public static abx.b a(int integer) {
			if (integer < 0 || integer >= values().length) {
				integer = 0;
			}

			return values()[integer];
		}

		public static abx.b a(String string) {
			for (int integer2 = 0; integer2 < values().length; integer2++) {
				if (values()[integer2].a().equals(string)) {
					return values()[integer2];
				}
			}

			return values()[0];
		}
	}
}

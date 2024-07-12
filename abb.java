import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;

public abstract class abb extends sn implements abj {
	private static final Predicate<sn> f = Predicates.and(new Predicate[]{sr.e, sr.a, new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn.aq();
		}
	}});
	private static final kk<Byte> g = kn.a(abb.class, km.a);
	private int h = -1;
	private int at = -1;
	private int au = -1;
	private alu av;
	private int aw;
	protected boolean a;
	protected int b;
	public abb.a c = abb.a.DISALLOWED;
	public int d;
	public sn e;
	private int ax;
	private int ay;
	private double az = 2.0;
	private int aA;

	public abb(ajs ajs) {
		super(ajs);
		this.a(0.5F, 0.5F);
	}

	public abb(ajs ajs, double double2, double double3, double double4) {
		this(ajs);
		this.b(double2, double3, double4);
	}

	public abb(ajs ajs, sw sw) {
		this(ajs, sw.p, sw.q + (double)sw.bq() - 0.1F, sw.r);
		this.e = sw;
		if (sw instanceof aay) {
			this.c = abb.a.ALLOWED;
		}
	}

	@Override
	public boolean a(double double1) {
		double double4 = this.bo().a() * 10.0;
		if (Double.isNaN(double4)) {
			double4 = 1.0;
		}

		double4 *= 64.0 * bh();
		return double1 < double4 * double4;
	}

	@Override
	protected void i() {
		this.Y.a(g, (byte)0);
	}

	public void a(sn sn, float float2, float float3, float float4, float float5, float float6) {
		float float8 = -ot.a(float3 * (float) (Math.PI / 180.0)) * ot.b(float2 * (float) (Math.PI / 180.0));
		float float9 = -ot.a(float2 * (float) (Math.PI / 180.0));
		float float10 = ot.b(float3 * (float) (Math.PI / 180.0)) * ot.b(float2 * (float) (Math.PI / 180.0));
		this.c((double)float8, (double)float9, (double)float10, float5, float6);
		this.s = this.s + sn.s;
		this.u = this.u + sn.u;
		if (!sn.z) {
			this.t = this.t + sn.t;
		}
	}

	@Override
	public void c(double double1, double double2, double double3, float float4, float float5) {
		float float10 = ot.a(double1 * double1 + double2 * double2 + double3 * double3);
		double1 /= (double)float10;
		double2 /= (double)float10;
		double3 /= (double)float10;
		double1 += this.S.nextGaussian() * 0.0075F * (double)float5;
		double2 += this.S.nextGaussian() * 0.0075F * (double)float5;
		double3 += this.S.nextGaussian() * 0.0075F * (double)float5;
		double1 *= (double)float4;
		double2 *= (double)float4;
		double3 *= (double)float4;
		this.s = double1;
		this.t = double2;
		this.u = double3;
		float float11 = ot.a(double1 * double1 + double3 * double3);
		this.v = (float)(ot.c(double1, double3) * 180.0F / (float)Math.PI);
		this.w = (float)(ot.c(double2, (double)float11) * 180.0F / (float)Math.PI);
		this.x = this.v;
		this.y = this.w;
		this.ax = 0;
	}

	@Override
	public void a(double double1, double double2, double double3, float float4, float float5, int integer, boolean boolean7) {
		this.b(double1, double2, double3);
		this.b(float4, float5);
	}

	@Override
	public void h(double double1, double double2, double double3) {
		this.s = double1;
		this.t = double2;
		this.u = double3;
		if (this.y == 0.0F && this.x == 0.0F) {
			float float8 = ot.a(double1 * double1 + double3 * double3);
			this.w = (float)(ot.c(double2, (double)float8) * 180.0F / (float)Math.PI);
			this.v = (float)(ot.c(double1, double3) * 180.0F / (float)Math.PI);
			this.y = this.w;
			this.x = this.v;
			this.b(this.p, this.q, this.r, this.v, this.w);
			this.ax = 0;
		}
	}

	@Override
	public void A_() {
		super.A_();
		if (this.y == 0.0F && this.x == 0.0F) {
			float float2 = ot.a(this.s * this.s + this.u * this.u);
			this.v = (float)(ot.c(this.s, this.u) * 180.0F / (float)Math.PI);
			this.w = (float)(ot.c(this.t, (double)float2) * 180.0F / (float)Math.PI);
			this.x = this.v;
			this.y = this.w;
		}

		co co2 = new co(this.h, this.at, this.au);
		atl atl3 = this.l.o(co2);
		alu alu4 = atl3.v();
		if (atl3.a() != azs.a) {
			bdt bdt5 = atl3.c((ajw)this.l, co2);
			if (bdt5 != alu.k && bdt5.a(co2).b(new bdw(this.p, this.q, this.r))) {
				this.a = true;
			}
		}

		if (this.d > 0) {
			this.d--;
		}

		if (this.a) {
			int integer5 = alu4.e(atl3);
			if ((alu4 != this.av || integer5 != this.aw) && !this.l.a(this.bo().g(0.05))) {
				this.a = false;
				this.s = this.s * (double)(this.S.nextFloat() * 0.2F);
				this.t = this.t * (double)(this.S.nextFloat() * 0.2F);
				this.u = this.u * (double)(this.S.nextFloat() * 0.2F);
				this.ax = 0;
				this.ay = 0;
			} else {
				this.ax++;
				if (this.ax >= 1200) {
					this.T();
				}
			}

			this.b++;
		} else {
			this.b = 0;
			this.ay++;
			bdw bdw5 = new bdw(this.p, this.q, this.r);
			bdw bdw6 = new bdw(this.p + this.s, this.q + this.t, this.r + this.u);
			bdu bdu7 = this.l.a(bdw5, bdw6, false, true, false);
			bdw5 = new bdw(this.p, this.q, this.r);
			bdw6 = new bdw(this.p + this.s, this.q + this.t, this.r + this.u);
			if (bdu7 != null) {
				bdw6 = new bdw(bdu7.c.b, bdu7.c.c, bdu7.c.d);
			}

			sn sn8 = this.a(bdw5, bdw6);
			if (sn8 != null) {
				bdu7 = new bdu(sn8);
			}

			if (bdu7 != null && bdu7.d instanceof aay) {
				aay aay9 = (aay)bdu7.d;
				if (this.e instanceof aay && !((aay)this.e).a(aay9)) {
					bdu7 = null;
				}
			}

			if (bdu7 != null) {
				this.a(bdu7);
			}

			if (this.n()) {
				for (int integer9 = 0; integer9 < 4; integer9++) {
					this.l
						.a(
							de.CRIT,
							this.p + this.s * (double)integer9 / 4.0,
							this.q + this.t * (double)integer9 / 4.0,
							this.r + this.u * (double)integer9 / 4.0,
							-this.s,
							-this.t + 0.2,
							-this.u
						);
				}
			}

			this.p = this.p + this.s;
			this.q = this.q + this.t;
			this.r = this.r + this.u;
			float float9 = ot.a(this.s * this.s + this.u * this.u);
			this.v = (float)(ot.c(this.s, this.u) * 180.0F / (float)Math.PI);
			this.w = (float)(ot.c(this.t, (double)float9) * 180.0F / (float)Math.PI);

			while (this.w - this.y < -180.0F) {
				this.y -= 360.0F;
			}

			while (this.w - this.y >= 180.0F) {
				this.y += 360.0F;
			}

			while (this.v - this.x < -180.0F) {
				this.x -= 360.0F;
			}

			while (this.v - this.x >= 180.0F) {
				this.x += 360.0F;
			}

			this.w = this.y + (this.w - this.y) * 0.2F;
			this.v = this.x + (this.v - this.x) * 0.2F;
			float float10 = 0.99F;
			float float11 = 0.05F;
			if (this.aj()) {
				for (int integer12 = 0; integer12 < 4; integer12++) {
					float float13 = 0.25F;
					this.l.a(de.WATER_BUBBLE, this.p - this.s * 0.25, this.q - this.t * 0.25, this.r - this.u * 0.25, this.s, this.t, this.u);
				}

				float10 = 0.6F;
			}

			if (this.ai()) {
				this.X();
			}

			this.s *= (double)float10;
			this.t *= (double)float10;
			this.u *= (double)float10;
			if (!this.ae()) {
				this.t -= 0.05F;
			}

			this.b(this.p, this.q, this.r);
			this.ac();
		}
	}

	protected void a(bdu bdu) {
		sn sn3 = bdu.d;
		if (sn3 != null) {
			float float4 = ot.a(this.s * this.s + this.t * this.t + this.u * this.u);
			int integer5 = ot.f((double)float4 * this.az);
			if (this.n()) {
				integer5 += this.S.nextInt(integer5 / 2 + 2);
			}

			ry ry6;
			if (this.e == null) {
				ry6 = ry.a(this, this);
			} else {
				ry6 = ry.a(this, this.e);
			}

			if (this.aJ() && !(sn3 instanceof zr)) {
				sn3.i(5);
			}

			if (sn3.a(ry6, (float)integer5)) {
				if (sn3 instanceof sw) {
					sw sw7 = (sw)sn3;
					if (!this.l.E) {
						sw7.f(sw7.cc() + 1);
					}

					if (this.aA > 0) {
						float float8 = ot.a(this.s * this.s + this.u * this.u);
						if (float8 > 0.0F) {
							sw7.f(this.s * (double)this.aA * 0.6F / (double)float8, 0.1, this.u * (double)this.aA * 0.6F / (double)float8);
						}
					}

					if (this.e instanceof sw) {
						aik.a(sw7, this.e);
						aik.b((sw)this.e, sw7);
					}

					this.a(sw7);
					if (this.e != null && sw7 != this.e && sw7 instanceof aay && this.e instanceof ly) {
						((ly)this.e).a.a(new gu(6, 0.0F));
					}
				}

				this.a(nn.u, 1.0F, 1.2F / (this.S.nextFloat() * 0.2F + 0.9F));
				if (!(sn3 instanceof zr)) {
					this.T();
				}
			} else {
				this.s *= -0.1F;
				this.t *= -0.1F;
				this.u *= -0.1F;
				this.v += 180.0F;
				this.x += 180.0F;
				this.ay = 0;
				if (!this.l.E && this.s * this.s + this.t * this.t + this.u * this.u < 0.001F) {
					if (this.c == abb.a.ALLOWED) {
						this.a(this.j(), 0.1F);
					}

					this.T();
				}
			}
		} else {
			co co4 = bdu.a();
			this.h = co4.p();
			this.at = co4.q();
			this.au = co4.r();
			atl atl5 = this.l.o(co4);
			this.av = atl5.v();
			this.aw = this.av.e(atl5);
			this.s = (double)((float)(bdu.c.b - this.p));
			this.t = (double)((float)(bdu.c.c - this.q));
			this.u = (double)((float)(bdu.c.d - this.r));
			float float6 = ot.a(this.s * this.s + this.t * this.t + this.u * this.u);
			this.p = this.p - this.s / (double)float6 * 0.05F;
			this.q = this.q - this.t / (double)float6 * 0.05F;
			this.r = this.r - this.u / (double)float6 * 0.05F;
			this.a(nn.u, 1.0F, 1.2F / (this.S.nextFloat() * 0.2F + 0.9F));
			this.a = true;
			this.d = 7;
			this.a(false);
			if (atl5.a() != azs.a) {
				this.av.a(this.l, co4, atl5, this);
			}
		}
	}

	@Override
	public void a(tc tc, double double2, double double3, double double4) {
		super.a(tc, double2, double3, double4);
		if (this.a) {
			this.h = ot.c(this.p);
			this.at = ot.c(this.q);
			this.au = ot.c(this.r);
		}
	}

	protected void a(sw sw) {
	}

	@Nullable
	protected sn a(bdw bdw1, bdw bdw2) {
		sn sn4 = null;
		List<sn> list5 = this.l.a(this, this.bo().b(this.s, this.t, this.u).g(1.0), f);
		double double6 = 0.0;

		for (int integer8 = 0; integer8 < list5.size(); integer8++) {
			sn sn9 = (sn)list5.get(integer8);
			if (sn9 != this.e || this.ay >= 5) {
				bdt bdt10 = sn9.bo().g(0.3F);
				bdu bdu11 = bdt10.b(bdw1, bdw2);
				if (bdu11 != null) {
					double double12 = bdw1.g(bdu11.c);
					if (double12 < double6 || double6 == 0.0) {
						sn4 = sn9;
						double6 = double12;
					}
				}
			}
		}

		return sn4;
	}

	public static void a(ph ph, String string) {
	}

	public static void a(ph ph) {
		a(ph, "Arrow");
	}

	@Override
	public void b(du du) {
		du.a("xTile", this.h);
		du.a("yTile", this.at);
		du.a("zTile", this.au);
		du.a("life", (short)this.ax);
		kq kq3 = alu.h.b(this.av);
		du.a("inTile", kq3 == null ? "" : kq3.toString());
		du.a("inData", (byte)this.aw);
		du.a("shake", (byte)this.d);
		du.a("inGround", (byte)(this.a ? 1 : 0));
		du.a("pickup", (byte)this.c.ordinal());
		du.a("damage", this.az);
		du.a("crit", this.n());
	}

	@Override
	public void a(du du) {
		this.h = du.h("xTile");
		this.at = du.h("yTile");
		this.au = du.h("zTile");
		this.ax = du.g("life");
		if (du.b("inTile", 8)) {
			this.av = alu.b(du.l("inTile"));
		} else {
			this.av = alu.b(du.f("inTile") & 255);
		}

		this.aw = du.f("inData") & 255;
		this.d = du.f("shake") & 255;
		this.a = du.f("inGround") == 1;
		if (du.b("damage", 99)) {
			this.az = du.k("damage");
		}

		if (du.b("pickup", 99)) {
			this.c = abb.a.a(du.f("pickup"));
		} else if (du.b("player", 99)) {
			this.c = du.p("player") ? abb.a.ALLOWED : abb.a.DISALLOWED;
		}

		this.a(du.p("crit"));
	}

	@Override
	public void d(aay aay) {
		if (!this.l.E && this.a && this.d <= 0) {
			boolean boolean3 = this.c == abb.a.ALLOWED || this.c == abb.a.CREATIVE_ONLY && aay.bK.d;
			if (this.c == abb.a.ALLOWED && !aay.bs.c(this.j())) {
				boolean3 = false;
			}

			if (boolean3) {
				aay.a(this, 1);
				this.T();
			}
		}
	}

	protected abstract afj j();

	@Override
	protected boolean af() {
		return false;
	}

	public void c(double double1) {
		this.az = double1;
	}

	public double k() {
		return this.az;
	}

	public void a(int integer) {
		this.aA = integer;
	}

	@Override
	public boolean aV() {
		return false;
	}

	@Override
	public float bq() {
		return 0.0F;
	}

	public void a(boolean boolean1) {
		byte byte3 = this.Y.a(g);
		if (boolean1) {
			this.Y.b(g, (byte)(byte3 | 1));
		} else {
			this.Y.b(g, (byte)(byte3 & -2));
		}
	}

	public boolean n() {
		byte byte2 = this.Y.a(g);
		return (byte2 & 1) != 0;
	}

	public void a(sw sw, float float2) {
		int integer4 = aik.a(aim.w, sw);
		int integer5 = aik.a(aim.x, sw);
		this.c((double)(float2 * 2.0F) + this.S.nextGaussian() * 0.25 + (double)((float)this.l.ae().a() * 0.11F));
		if (integer4 > 0) {
			this.c(this.k() + (double)integer4 * 0.5 + 0.5);
		}

		if (integer5 > 0) {
			this.a(integer5);
		}

		if (aik.a(aim.y, sw) > 0) {
			this.i(100);
		}
	}

	public static enum a {
		DISALLOWED,
		ALLOWED,
		CREATIVE_ONLY;

		public static abb.a a(int integer) {
			if (integer < 0 || integer > values().length) {
				integer = 0;
			}

			return values()[integer];
		}
	}
}

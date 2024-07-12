import java.util.Random;
import javax.annotation.Nullable;

public class zv extends su implements zt {
	private static final kk<Boolean> a = kn.a(zv.class, km.h);
	private int b = 1;

	public zv(ajs ajs) {
		super(ajs);
		this.a(4.0F, 4.0F);
		this.X = true;
		this.b_ = 5;
		this.f = new zv.b(this);
	}

	@Override
	protected void r() {
		this.bq.a(5, new zv.d(this));
		this.bq.a(7, new zv.a(this));
		this.bq.a(7, new zv.c(this));
		this.br.a(1, new vx(this));
	}

	public boolean o() {
		return this.Y.a(a);
	}

	public void a(boolean boolean1) {
		this.Y.b(a, boolean1);
	}

	public int da() {
		return this.b;
	}

	@Override
	public void A_() {
		super.A_();
		if (!this.l.E && this.l.ae() == rg.PEACEFUL) {
			this.T();
		}
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else if ("fireball".equals(ry.p()) && ry.j() instanceof aay) {
			super.a(ry, 1000.0F);
			((aay)ry.j()).b(nr.z);
			return true;
		} else {
			return super.a(ry, float2);
		}
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, false);
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(10.0);
		this.a(aad.b).a(100.0);
	}

	@Override
	public no bC() {
		return no.HOSTILE;
	}

	@Override
	protected nm G() {
		return nn.bV;
	}

	@Override
	protected nm bW() {
		return nn.bX;
	}

	@Override
	protected nm bX() {
		return nn.bW;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.aj;
	}

	@Override
	protected float ci() {
		return 10.0F;
	}

	@Override
	public boolean cM() {
		return this.S.nextInt(20) == 0 && super.cM() && this.l.ae() != rg.PEACEFUL;
	}

	@Override
	public int cQ() {
		return 1;
	}

	public static void a(ph ph) {
		sx.a(ph, zv.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("ExplosionPower", this.b);
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.b("ExplosionPower", 99)) {
			this.b = du.h("ExplosionPower");
		}
	}

	@Override
	public float bq() {
		return 2.6F;
	}

	static class a extends ui {
		private final zv a;

		public a(zv zv) {
			this.a = zv;
			this.a(2);
		}

		@Override
		public boolean a() {
			return true;
		}

		@Override
		public void e() {
			if (this.a.z() == null) {
				this.a.v = -((float)ot.c(this.a.s, this.a.u)) * (180.0F / (float)Math.PI);
				this.a.aN = this.a.v;
			} else {
				sw sw2 = this.a.z();
				double double3 = 64.0;
				if (sw2.h(this.a) < 4096.0) {
					double double5 = sw2.p - this.a.p;
					double double7 = sw2.r - this.a.r;
					this.a.v = -((float)ot.c(double5, double7)) * (180.0F / (float)Math.PI);
					this.a.aN = this.a.v;
				}
			}
		}
	}

	static class b extends tw {
		private final zv i;
		private int j;

		public b(zv zv) {
			super(zv);
			this.i = zv;
		}

		@Override
		public void c() {
			if (this.h == tw.a.MOVE_TO) {
				double double2 = this.b - this.i.p;
				double double4 = this.c - this.i.q;
				double double6 = this.d - this.i.r;
				double double8 = double2 * double2 + double4 * double4 + double6 * double6;
				if (this.j-- <= 0) {
					this.j = this.j + this.i.bJ().nextInt(5) + 2;
					double8 = (double)ot.a(double8);
					if (this.b(this.b, this.c, this.d, double8)) {
						this.i.s += double2 / double8 * 0.1;
						this.i.t += double4 / double8 * 0.1;
						this.i.u += double6 / double8 * 0.1;
					} else {
						this.h = tw.a.WAIT;
					}
				}
			}
		}

		private boolean b(double double1, double double2, double double3, double double4) {
			double double10 = (double1 - this.i.p) / double4;
			double double12 = (double2 - this.i.q) / double4;
			double double14 = (double3 - this.i.r) / double4;
			bdt bdt16 = this.i.bo();

			for (int integer17 = 1; (double)integer17 < double4; integer17++) {
				bdt16 = bdt16.d(double10, double12, double14);
				if (!this.i.l.a(this.i, bdt16).isEmpty()) {
					return false;
				}
			}

			return true;
		}
	}

	static class c extends ui {
		private final zv b;
		public int a;

		public c(zv zv) {
			this.b = zv;
		}

		@Override
		public boolean a() {
			return this.b.z() != null;
		}

		@Override
		public void c() {
			this.a = 0;
		}

		@Override
		public void d() {
			this.b.a(false);
		}

		@Override
		public void e() {
			sw sw2 = this.b.z();
			double double3 = 64.0;
			if (sw2.h(this.b) < 4096.0 && this.b.D(sw2)) {
				ajs ajs5 = this.b.l;
				this.a++;
				if (this.a == 10) {
					ajs5.a(null, 1015, new co(this.b), 0);
				}

				if (this.a == 20) {
					double double6 = 4.0;
					bdw bdw8 = this.b.f(1.0F);
					double double9 = sw2.p - (this.b.p + bdw8.b * 4.0);
					double double11 = sw2.bo().b + (double)(sw2.H / 2.0F) - (0.5 + this.b.q + (double)(this.b.H / 2.0F));
					double double13 = sw2.r - (this.b.r + bdw8.d * 4.0);
					ajs5.a(null, 1016, new co(this.b), 0);
					abh abh15 = new abh(ajs5, this.b, double9, double11, double13);
					abh15.e = this.b.da();
					abh15.p = this.b.p + bdw8.b * 4.0;
					abh15.q = this.b.q + (double)(this.b.H / 2.0F) + 0.5;
					abh15.r = this.b.r + bdw8.d * 4.0;
					ajs5.a(abh15);
					this.a = -40;
				}
			} else if (this.a > 0) {
				this.a--;
			}

			this.b.a(this.a > 10);
		}
	}

	static class d extends ui {
		private final zv a;

		public d(zv zv) {
			this.a = zv;
			this.a(1);
		}

		@Override
		public boolean a() {
			tw tw2 = this.a.u();
			if (!tw2.a()) {
				return true;
			} else {
				double double3 = tw2.d() - this.a.p;
				double double5 = tw2.e() - this.a.q;
				double double7 = tw2.f() - this.a.r;
				double double9 = double3 * double3 + double5 * double5 + double7 * double7;
				return double9 < 1.0 || double9 > 3600.0;
			}
		}

		@Override
		public boolean b() {
			return false;
		}

		@Override
		public void c() {
			Random random2 = this.a.bJ();
			double double3 = this.a.p + (double)((random2.nextFloat() * 2.0F - 1.0F) * 16.0F);
			double double5 = this.a.q + (double)((random2.nextFloat() * 2.0F - 1.0F) * 16.0F);
			double double7 = this.a.r + (double)((random2.nextFloat() * 2.0F - 1.0F) * 16.0F);
			this.a.u().a(double3, double5, double7, 1.0);
		}
	}
}

import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class zx extends aaa {
	private static final kk<Boolean> bz = kn.a(zx.class, km.h);
	private static final kk<Integer> bA = kn.a(zx.class, km.b);
	protected float a;
	protected float b;
	protected float c;
	protected float bw;
	protected float bx;
	private sw bB;
	private int bC;
	private boolean bD;
	protected vf by;

	public zx(ajs ajs) {
		super(ajs);
		this.b_ = 10;
		this.a(0.85F, 0.85F);
		this.f = new zx.c(this);
		this.a = this.S.nextFloat();
		this.b = this.a;
	}

	@Override
	protected void r() {
		uv uv2 = new uv(this, 1.0);
		this.by = new vf(this, 1.0, 80);
		this.bq.a(4, new zx.a(this));
		this.bq.a(5, uv2);
		this.bq.a(7, this.by);
		this.bq.a(8, new uo(this, aay.class, 8.0F));
		this.bq.a(8, new uo(this, zx.class, 12.0F, 0.01F));
		this.bq.a(9, new ve(this));
		this.by.a(3);
		uv2.a(3);
		this.br.a(1, new vy(this, sw.class, 10, true, false, new zx.b(this)));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.e).a(6.0);
		this.a(aad.d).a(0.5);
		this.a(aad.b).a(16.0);
		this.a(aad.a).a(30.0);
	}

	public static void c(ph ph) {
		sx.a(ph, zx.class);
	}

	@Override
	protected wf b(ajs ajs) {
		return new wi(this, ajs);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bz, false);
		this.Y.a(bA, 0);
	}

	public boolean dk() {
		return this.Y.a(bz);
	}

	private void a(boolean boolean1) {
		this.Y.b(bz, boolean1);
	}

	@Override
	public int o() {
		return 80;
	}

	private void a(int integer) {
		this.Y.b(bA, integer);
	}

	public boolean dl() {
		return this.Y.a(bA) != 0;
	}

	@Nullable
	public sw dm() {
		if (!this.dl()) {
			return null;
		} else if (this.l.E) {
			if (this.bB != null) {
				return this.bB;
			} else {
				sn sn2 = this.l.a(this.Y.a(bA));
				if (sn2 instanceof sw) {
					this.bB = (sw)sn2;
					return this.bB;
				} else {
					return null;
				}
			}
		} else {
			return this.z();
		}
	}

	@Override
	public void a(kk<?> kk) {
		super.a(kk);
		if (bA.equals(kk)) {
			this.bC = 0;
			this.bB = null;
		}
	}

	@Override
	public int C() {
		return 160;
	}

	@Override
	protected nm G() {
		return this.aj() ? nn.cq : nn.cr;
	}

	@Override
	protected nm bW() {
		return this.aj() ? nn.cw : nn.cx;
	}

	@Override
	protected nm bX() {
		return this.aj() ? nn.ct : nn.cu;
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Override
	public float bq() {
		return this.H * 0.5F;
	}

	@Override
	public float a(co co) {
		return this.l.o(co).a() == azs.h ? 10.0F + this.l.n(co) - 0.5F : super.a(co);
	}

	@Override
	public void n() {
		if (this.l.E) {
			this.b = this.a;
			if (!this.aj()) {
				this.c = 2.0F;
				if (this.t > 0.0 && this.bD && !this.ad()) {
					this.l.a(this.p, this.q, this.r, this.dj(), this.bC(), 1.0F, 1.0F, false);
				}

				this.bD = this.t < 0.0 && this.l.d(new co(this).b(), false);
			} else if (this.dk()) {
				if (this.c < 0.5F) {
					this.c = 4.0F;
				} else {
					this.c = this.c + (0.5F - this.c) * 0.1F;
				}
			} else {
				this.c = this.c + (0.125F - this.c) * 0.2F;
			}

			this.a = this.a + this.c;
			this.bx = this.bw;
			if (!this.aj()) {
				this.bw = this.S.nextFloat();
			} else if (this.dk()) {
				this.bw = this.bw + (0.0F - this.bw) * 0.25F;
			} else {
				this.bw = this.bw + (1.0F - this.bw) * 0.06F;
			}

			if (this.dk() && this.aj()) {
				bdw bdw2 = this.f(0.0F);

				for (int integer3 = 0; integer3 < 2; integer3++) {
					this.l
						.a(
							de.WATER_BUBBLE,
							this.p + (this.S.nextDouble() - 0.5) * (double)this.G - bdw2.b * 1.5,
							this.q + this.S.nextDouble() * (double)this.H - bdw2.c * 1.5,
							this.r + (this.S.nextDouble() - 0.5) * (double)this.G - bdw2.d * 1.5,
							0.0,
							0.0,
							0.0
						);
				}
			}

			if (this.dl()) {
				if (this.bC < this.o()) {
					this.bC++;
				}

				sw sw2 = this.dm();
				if (sw2 != null) {
					this.t().a(sw2, 90.0F, 90.0F);
					this.t().a();
					double double3 = (double)this.s(0.0F);
					double double5 = sw2.p - this.p;
					double double7 = sw2.q + (double)(sw2.H * 0.5F) - (this.q + (double)this.bq());
					double double9 = sw2.r - this.r;
					double double11 = Math.sqrt(double5 * double5 + double7 * double7 + double9 * double9);
					double5 /= double11;
					double7 /= double11;
					double9 /= double11;
					double double13 = this.S.nextDouble();

					while (double13 < double11) {
						double13 += 1.8 - double3 + this.S.nextDouble() * (1.7 - double3);
						this.l.a(de.WATER_BUBBLE, this.p + double5 * double13, this.q + double7 * double13 + (double)this.bq(), this.r + double9 * double13, 0.0, 0.0, 0.0);
					}
				}
			}
		}

		if (this.U) {
			this.l(300);
		} else if (this.z) {
			this.t += 0.5;
			this.s = this.s + (double)((this.S.nextFloat() * 2.0F - 1.0F) * 0.4F);
			this.u = this.u + (double)((this.S.nextFloat() * 2.0F - 1.0F) * 0.4F);
			this.v = this.S.nextFloat() * 360.0F;
			this.z = false;
			this.ai = true;
		}

		if (this.dl()) {
			this.v = this.aP;
		}

		super.n();
	}

	protected nm dj() {
		return nn.cv;
	}

	public float a(float float1) {
		return this.b + (this.a - this.b) * float1;
	}

	public float r(float float1) {
		return this.bx + (this.bw - this.bx) * float1;
	}

	public float s(float float1) {
		return ((float)this.bC + float1) / (float)this.o();
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.x;
	}

	@Override
	protected boolean r_() {
		return true;
	}

	@Override
	public boolean cN() {
		return this.l.a(this.bo(), this) && this.l.a(this, this.bo()).isEmpty();
	}

	@Override
	public boolean cM() {
		return (this.S.nextInt(20) == 0 || !this.l.i(new co(this))) && super.cM();
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (!this.dk() && !ry.s() && ry.i() instanceof sw) {
			sw sw4 = (sw)ry.i();
			if (!ry.c()) {
				sw4.a(ry.a((sn)this), 2.0F);
			}
		}

		if (this.by != null) {
			this.by.i();
		}

		return super.a(ry, float2);
	}

	@Override
	public int N() {
		return 180;
	}

	@Override
	public void g(float float1, float float2) {
		if (this.cu() && this.aj()) {
			this.a(float1, float2, 0.1F);
			this.a(tc.SELF, this.s, this.t, this.u);
			this.s *= 0.9F;
			this.t *= 0.9F;
			this.u *= 0.9F;
			if (!this.dk() && this.z() == null) {
				this.t -= 0.005;
			}
		} else {
			super.g(float1, float2);
		}
	}

	static class a extends ui {
		private final zx a;
		private int b;
		private final boolean c;

		public a(zx zx) {
			this.a = zx;
			this.c = zx instanceof zq;
			this.a(3);
		}

		@Override
		public boolean a() {
			sw sw2 = this.a.z();
			return sw2 != null && sw2.au();
		}

		@Override
		public boolean b() {
			return super.b() && (this.c || this.a.h(this.a.z()) > 9.0);
		}

		@Override
		public void c() {
			this.b = -10;
			this.a.x().o();
			this.a.t().a(this.a.z(), 90.0F, 90.0F);
			this.a.ai = true;
		}

		@Override
		public void d() {
			this.a.a(0);
			this.a.d(null);
			this.a.by.i();
		}

		@Override
		public void e() {
			sw sw2 = this.a.z();
			this.a.x().o();
			this.a.t().a(sw2, 90.0F, 90.0F);
			if (!this.a.D(sw2)) {
				this.a.d(null);
			} else {
				this.b++;
				if (this.b == 0) {
					this.a.a(this.a.z().O());
					this.a.l.a(this.a, (byte)21);
				} else if (this.b >= this.a.o()) {
					float float3 = 1.0F;
					if (this.a.l.ae() == rg.HARD) {
						float3 += 2.0F;
					}

					if (this.c) {
						float3 += 2.0F;
					}

					sw2.a(ry.b(this.a, this.a), float3);
					sw2.a(ry.a((sw)this.a), (float)this.a.a(aad.e).e());
					this.a.d(null);
				}

				super.e();
			}
		}
	}

	static class b implements Predicate<sw> {
		private final zx a;

		public b(zx zx) {
			this.a = zx;
		}

		public boolean apply(@Nullable sw sw) {
			return (sw instanceof aay || sw instanceof xh) && sw.h(this.a) > 9.0;
		}
	}

	static class c extends tw {
		private final zx i;

		public c(zx zx) {
			super(zx);
			this.i = zx;
		}

		@Override
		public void c() {
			if (this.h == tw.a.MOVE_TO && !this.i.x().n()) {
				double double2 = this.b - this.i.p;
				double double4 = this.c - this.i.q;
				double double6 = this.d - this.i.r;
				double double8 = (double)ot.a(double2 * double2 + double4 * double4 + double6 * double6);
				double4 /= double8;
				float float10 = (float)(ot.c(double6, double2) * 180.0F / (float)Math.PI) - 90.0F;
				this.i.v = this.a(this.i.v, float10, 90.0F);
				this.i.aN = this.i.v;
				float float11 = (float)(this.e * this.i.a(aad.d).e());
				this.i.l(this.i.cq() + (float11 - this.i.cq()) * 0.125F);
				double double12 = Math.sin((double)(this.i.T + this.i.O()) * 0.5) * 0.05;
				double double14 = Math.cos((double)(this.i.v * (float) (Math.PI / 180.0)));
				double double16 = Math.sin((double)(this.i.v * (float) (Math.PI / 180.0)));
				this.i.s += double12 * double14;
				this.i.u += double12 * double16;
				double12 = Math.sin((double)(this.i.T + this.i.O()) * 0.75) * 0.05;
				this.i.t += double12 * (double16 + double14) * 0.25;
				this.i.t = this.i.t + (double)this.i.cq() * double4 * 0.1;
				tv tv18 = this.i.t();
				double double19 = this.i.p + double2 / double8 * 2.0;
				double double21 = (double)this.i.bq() + this.i.q + double4 / double8;
				double double23 = this.i.r + double6 / double8 * 2.0;
				double double25 = tv18.e();
				double double27 = tv18.f();
				double double29 = tv18.g();
				if (!tv18.b()) {
					double25 = double19;
					double27 = double21;
					double29 = double23;
				}

				this.i.t().a(double25 + (double19 - double25) * 0.125, double27 + (double21 - double27) * 0.125, double29 + (double23 - double29) * 0.125, 10.0F, 40.0F);
				this.i.a(true);
			} else {
				this.i.l(0.0F);
				this.i.a(false);
			}
		}
	}
}

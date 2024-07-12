import javax.annotation.Nullable;

public class zn extends aaa {
	private float a = 0.5F;
	private int b;
	private static final kk<Byte> c = kn.a(zn.class, km.a);

	public zn(ajs ajs) {
		super(ajs);
		this.a(bba.WATER, -1.0F);
		this.a(bba.LAVA, 8.0F);
		this.a(bba.DANGER_FIRE, 0.0F);
		this.a(bba.DAMAGE_FIRE, 0.0F);
		this.X = true;
		this.b_ = 10;
	}

	public static void a(ph ph) {
		sx.a(ph, zn.class);
	}

	@Override
	protected void r() {
		this.bq.a(4, new zn.a(this));
		this.bq.a(5, new uv(this, 1.0));
		this.bq.a(7, new vr(this, 1.0, 0.0F));
		this.bq.a(8, new uo(this, aay.class, 8.0F));
		this.bq.a(8, new ve(this));
		this.br.a(1, new vv(this, true));
		this.br.a(2, new vy(this, aay.class, true));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.e).a(6.0);
		this.a(aad.d).a(0.23F);
		this.a(aad.b).a(48.0);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(c, (byte)0);
	}

	@Override
	protected nm G() {
		return nn.C;
	}

	@Override
	protected nm bW() {
		return nn.F;
	}

	@Override
	protected nm bX() {
		return nn.E;
	}

	@Override
	public int d(float float1) {
		return 15728880;
	}

	@Override
	public float e(float float1) {
		return 1.0F;
	}

	@Override
	public void n() {
		if (!this.z && this.t < 0.0) {
			this.t *= 0.6;
		}

		if (this.l.E) {
			if (this.S.nextInt(24) == 0 && !this.ad()) {
				this.l.a(this.p + 0.5, this.q + 0.5, this.r + 0.5, nn.D, this.bC(), 1.0F + this.S.nextFloat(), this.S.nextFloat() * 0.7F + 0.3F, false);
			}

			for (int integer2 = 0; integer2 < 2; integer2++) {
				this.l
					.a(
						de.SMOKE_LARGE,
						this.p + (this.S.nextDouble() - 0.5) * (double)this.G,
						this.q + this.S.nextDouble() * (double)this.H,
						this.r + (this.S.nextDouble() - 0.5) * (double)this.G,
						0.0,
						0.0,
						0.0
					);
			}
		}

		super.n();
	}

	@Override
	protected void M() {
		if (this.ai()) {
			this.a(ry.h, 1.0F);
		}

		this.b--;
		if (this.b <= 0) {
			this.b = 100;
			this.a = 0.5F + (float)this.S.nextGaussian() * 3.0F;
		}

		sw sw2 = this.z();
		if (sw2 != null && sw2.q + (double)sw2.bq() > this.q + (double)this.bq() + (double)this.a) {
			this.t = this.t + (0.3F - this.t) * 0.3F;
			this.ai = true;
		}

		super.M();
	}

	@Override
	public void e(float float1, float float2) {
	}

	@Override
	public boolean aJ() {
		return this.o();
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.q;
	}

	public boolean o() {
		return (this.Y.a(c) & 1) != 0;
	}

	public void a(boolean boolean1) {
		byte byte3 = this.Y.a(c);
		if (boolean1) {
			byte3 = (byte)(byte3 | 1);
		} else {
			byte3 = (byte)(byte3 & -2);
		}

		this.Y.b(c, byte3);
	}

	@Override
	protected boolean r_() {
		return true;
	}

	static class a extends ui {
		private final zn a;
		private int b;
		private int c;

		public a(zn zn) {
			this.a = zn;
			this.a(3);
		}

		@Override
		public boolean a() {
			sw sw2 = this.a.z();
			return sw2 != null && sw2.au();
		}

		@Override
		public void c() {
			this.b = 0;
		}

		@Override
		public void d() {
			this.a.a(false);
		}

		@Override
		public void e() {
			this.c--;
			sw sw2 = this.a.z();
			double double3 = this.a.h(sw2);
			if (double3 < 4.0) {
				if (this.c <= 0) {
					this.c = 20;
					this.a.B(sw2);
				}

				this.a.u().a(sw2.p, sw2.q, sw2.r, 1.0);
			} else if (double3 < this.f() * this.f()) {
				double double5 = sw2.p - this.a.p;
				double double7 = sw2.bo().b + (double)(sw2.H / 2.0F) - (this.a.q + (double)(this.a.H / 2.0F));
				double double9 = sw2.r - this.a.r;
				if (this.c <= 0) {
					this.b++;
					if (this.b == 1) {
						this.c = 60;
						this.a.a(true);
					} else if (this.b <= 4) {
						this.c = 6;
					} else {
						this.c = 100;
						this.b = 0;
						this.a.a(false);
					}

					if (this.b > 1) {
						float float11 = ot.c(ot.a(double3)) * 0.5F;
						this.a.l.a(null, 1018, new co((int)this.a.p, (int)this.a.q, (int)this.a.r), 0);

						for (int integer12 = 0; integer12 < 1; integer12++) {
							abm abm13 = new abm(
								this.a.l, this.a, double5 + this.a.bJ().nextGaussian() * (double)float11, double7, double9 + this.a.bJ().nextGaussian() * (double)float11
							);
							abm13.q = this.a.q + (double)(this.a.H / 2.0F) + 0.5;
							this.a.l.a(abm13);
						}
					}
				}

				this.a.t().a(sw2, 10.0F, 10.0F);
			} else {
				this.a.x().o();
				this.a.u().a(sw2.p, sw2.q, sw2.r, 1.0);
			}

			super.e();
		}

		private double f() {
			tk tk2 = this.a.a(aad.b);
			return tk2 == null ? 16.0 : tk2.e();
		}
	}
}

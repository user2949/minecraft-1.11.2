import javax.annotation.Nullable;

public class xh extends xj {
	public float a;
	public float b;
	public float c;
	public float bu;
	public float bv;
	public float bw;
	public float bx;
	public float by;
	private float bz;
	private float bA;
	private float bB;
	private float bC;
	private float bD;
	private float bE;

	public xh(ajs ajs) {
		super(ajs);
		this.a(0.8F, 0.8F);
		this.S.setSeed((long)(1 + this.O()));
		this.bA = 1.0F / (this.S.nextFloat() + 1.0F) * 0.2F;
	}

	public static void a(ph ph) {
		sx.a(ph, xh.class);
	}

	@Override
	protected void r() {
		this.bq.a(0, new xh.a(this));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(10.0);
	}

	@Override
	public float bq() {
		return this.H * 0.5F;
	}

	@Override
	protected nm G() {
		return nn.gE;
	}

	@Override
	protected nm bW() {
		return nn.gG;
	}

	@Override
	protected nm bX() {
		return nn.gF;
	}

	@Override
	protected float ci() {
		return 0.4F;
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.ak;
	}

	@Override
	public void n() {
		super.n();
		this.b = this.a;
		this.bu = this.c;
		this.bw = this.bv;
		this.by = this.bx;
		this.bv = this.bv + this.bA;
		if ((double)this.bv > Math.PI * 2) {
			if (this.l.E) {
				this.bv = (float) (Math.PI * 2);
			} else {
				this.bv = (float)((double)this.bv - (Math.PI * 2));
				if (this.S.nextInt(10) == 0) {
					this.bA = 1.0F / (this.S.nextFloat() + 1.0F) * 0.2F;
				}

				this.l.a(this, (byte)19);
			}
		}

		if (this.U) {
			if (this.bv < (float) Math.PI) {
				float float2 = this.bv / (float) Math.PI;
				this.bx = ot.a(float2 * float2 * (float) Math.PI) * (float) Math.PI * 0.25F;
				if ((double)float2 > 0.75) {
					this.bz = 1.0F;
					this.bB = 1.0F;
				} else {
					this.bB *= 0.8F;
				}
			} else {
				this.bx = 0.0F;
				this.bz *= 0.9F;
				this.bB *= 0.99F;
			}

			if (!this.l.E) {
				this.s = (double)(this.bC * this.bz);
				this.t = (double)(this.bD * this.bz);
				this.u = (double)(this.bE * this.bz);
			}

			float float2 = ot.a(this.s * this.s + this.u * this.u);
			this.aN = this.aN + (-((float)ot.c(this.s, this.u)) * (180.0F / (float)Math.PI) - this.aN) * 0.1F;
			this.v = this.aN;
			this.c = (float)((double)this.c + Math.PI * (double)this.bB * 1.5);
			this.a = this.a + (-((float)ot.c((double)float2, this.t)) * (180.0F / (float)Math.PI) - this.a) * 0.1F;
		} else {
			this.bx = ot.e(ot.a(this.bv)) * (float) Math.PI * 0.25F;
			if (!this.l.E) {
				this.s = 0.0;
				this.u = 0.0;
				if (this.a(si.y)) {
					this.t = this.t + (0.05 * (double)(this.b(si.y).c() + 1) - this.t);
				} else if (!this.ae()) {
					this.t -= 0.08;
				}

				this.t *= 0.98F;
			}

			this.a = (float)((double)this.a + (double)(-90.0F - this.a) * 0.02);
		}
	}

	@Override
	public void g(float float1, float float2) {
		this.a(tc.SELF, this.s, this.t, this.u);
	}

	@Override
	public boolean cM() {
		return this.q > 45.0 && this.q < (double)this.l.K() && super.cM();
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 19) {
			this.bv = 0.0F;
		} else {
			super.a(byte1);
		}
	}

	public void b(float float1, float float2, float float3) {
		this.bC = float1;
		this.bD = float2;
		this.bE = float3;
	}

	public boolean o() {
		return this.bC != 0.0F || this.bD != 0.0F || this.bE != 0.0F;
	}

	static class a extends ui {
		private final xh a;

		public a(xh xh) {
			this.a = xh;
		}

		@Override
		public boolean a() {
			return true;
		}

		@Override
		public void e() {
			int integer2 = this.a.bO();
			if (integer2 > 100) {
				this.a.b(0.0F, 0.0F, 0.0F);
			} else if (this.a.bJ().nextInt(50) == 0 || !this.a.U || !this.a.o()) {
				float float3 = this.a.bJ().nextFloat() * (float) (Math.PI * 2);
				float float4 = ot.b(float3) * 0.2F;
				float float5 = -0.1F + this.a.bJ().nextFloat() * 0.2F;
				float float6 = ot.a(float3) * 0.2F;
				this.a.b(float4, float5, float6);
			}
		}
	}
}

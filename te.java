import java.util.UUID;

public abstract class te extends sx {
	public static final UUID bu = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
	public static final tl bv = new tl(bu, "Fleeing speed bonus", 2.0, 2).a(false);
	private co a;
	private float b;
	private float c;

	public te(ajs ajs) {
		super(ajs);
		this.a = co.a;
		this.b = -1.0F;
		this.c = bba.WATER.a();
	}

	public float a(co co) {
		return 0.0F;
	}

	@Override
	public boolean cM() {
		return super.cM() && this.a(new co(this.p, this.bo().b, this.r)) >= 0.0F;
	}

	public boolean da() {
		return !this.h.n();
	}

	public boolean db() {
		return this.f(new co(this));
	}

	public boolean f(co co) {
		return this.b == -1.0F ? true : this.a.n(co) < (double)(this.b * this.b);
	}

	public void a(co co, int integer) {
		this.a = co;
		this.b = (float)integer;
	}

	public co dc() {
		return this.a;
	}

	public float dd() {
		return this.b;
	}

	public void de() {
		this.b = -1.0F;
	}

	public boolean df() {
		return this.b != -1.0F;
	}

	@Override
	protected void cV() {
		super.cV();
		if (this.cW() && this.cX() != null && this.cX().l == this.l) {
			sn sn2 = this.cX();
			this.a(new co((int)sn2.p, (int)sn2.q, (int)sn2.r), 5);
			float float3 = this.g(sn2);
			if (this instanceof ti && ((ti)this).dj()) {
				if (float3 > 10.0F) {
					this.a(true, true);
				}

				return;
			}

			this.q(float3);
			if (float3 > 10.0F) {
				this.a(true, true);
				this.bq.c(1);
			} else if (float3 > 6.0F) {
				double double4 = (sn2.p - this.p) / (double)float3;
				double double6 = (sn2.q - this.q) / (double)float3;
				double double8 = (sn2.r - this.r) / (double)float3;
				this.s = this.s + double4 * Math.abs(double4) * 0.4;
				this.t = this.t + double6 * Math.abs(double6) * 0.4;
				this.u = this.u + double8 * Math.abs(double8) * 0.4;
			} else {
				this.bq.d(1);
				float float4 = 2.0F;
				bdw bdw5 = new bdw(sn2.p - this.p, sn2.q - this.q, sn2.r - this.r).a().a((double)Math.max(float3 - 2.0F, 0.0F));
				this.x().a(this.p + bdw5.b, this.q + bdw5.c, this.r + bdw5.d, this.dg());
			}
		}
	}

	protected double dg() {
		return 1.0;
	}

	protected void q(float float1) {
	}
}

public class bmw extends bln {
	public bmw() {
		this(0.0F, 0.0F, false);
	}

	public bmw(float float1, float float2, boolean boolean3) {
		super(float1, 0.0F, 64, boolean3 ? 32 : 64);
		if (boolean3) {
			this.e = new bni(this, 0, 0);
			this.e.a(-4.0F, -10.0F, -4.0F, 8, 8, 8, float1);
			this.e.a(0.0F, 0.0F + float2, 0.0F);
			this.g = new bni(this, 16, 16);
			this.g.a(0.0F, 0.0F + float2, 0.0F);
			this.g.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, float1 + 0.1F);
			this.j = new bni(this, 0, 16);
			this.j.a(-2.0F, 12.0F + float2, 0.0F);
			this.j.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1 + 0.1F);
			this.k = new bni(this, 0, 16);
			this.k.i = true;
			this.k.a(2.0F, 12.0F + float2, 0.0F);
			this.k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1 + 0.1F);
		} else {
			this.e = new bni(this, 0, 0);
			this.e.a(0.0F, float2, 0.0F);
			this.e.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, float1);
			this.e.a(24, 0).a(-1.0F, -3.0F, -6.0F, 2, 4, 2, float1);
			this.g = new bni(this, 16, 20);
			this.g.a(0.0F, 0.0F + float2, 0.0F);
			this.g.a(-4.0F, 0.0F, -3.0F, 8, 12, 6, float1);
			this.g.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8, 18, 6, float1 + 0.05F);
			this.h = new bni(this, 44, 38);
			this.h.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, float1);
			this.h.a(-5.0F, 2.0F + float2, 0.0F);
			this.i = new bni(this, 44, 38);
			this.i.i = true;
			this.i.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, float1);
			this.i.a(5.0F, 2.0F + float2, 0.0F);
			this.j = new bni(this, 0, 22);
			this.j.a(-2.0F, 12.0F + float2, 0.0F);
			this.j.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1);
			this.k = new bni(this, 0, 22);
			this.k.i = true;
			this.k.a(2.0F, 12.0F + float2, 0.0F);
			this.k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1);
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		aao aao9 = (aao)sn;
		float float10 = ot.a(this.o * (float) Math.PI);
		float float11 = ot.a((1.0F - (1.0F - this.o) * (1.0F - this.o)) * (float) Math.PI);
		this.h.h = 0.0F;
		this.i.h = 0.0F;
		this.h.g = -(0.1F - float10 * 0.6F);
		this.i.g = 0.1F - float10 * 0.6F;
		float float12 = (float) -Math.PI / (aao9.dm() ? 1.5F : 2.25F);
		this.h.f = float12;
		this.i.f = float12;
		this.h.f += float10 * 1.2F - float11 * 0.4F;
		this.i.f += float10 * 1.2F - float11 * 0.4F;
		this.h.h = this.h.h + ot.b(float3 * 0.09F) * 0.05F + 0.05F;
		this.i.h = this.i.h - (ot.b(float3 * 0.09F) * 0.05F + 0.05F);
		this.h.f = this.h.f + ot.a(float3 * 0.067F) * 0.05F;
		this.i.f = this.i.f - ot.a(float3 * 0.067F) * 0.05F;
	}
}

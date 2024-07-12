public class bna extends blv {
	public bni a;
	public bni b;
	public bni c;
	public bni d;
	public bni e;
	public bni f;
	bni g;
	bni h;

	public bna() {
		float float2 = 0.0F;
		float float3 = 13.5F;
		this.a = new bni(this, 0, 0);
		this.a.a(-2.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
		this.a.a(-1.0F, 13.5F, -7.0F);
		this.b = new bni(this, 18, 14);
		this.b.a(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
		this.b.a(0.0F, 14.0F, 2.0F);
		this.h = new bni(this, 21, 0);
		this.h.a(-3.0F, -3.0F, -3.0F, 8, 6, 7, 0.0F);
		this.h.a(-1.0F, 14.0F, 2.0F);
		this.c = new bni(this, 0, 18);
		this.c.a(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.c.a(-2.5F, 16.0F, 7.0F);
		this.d = new bni(this, 0, 18);
		this.d.a(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.d.a(0.5F, 16.0F, 7.0F);
		this.e = new bni(this, 0, 18);
		this.e.a(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.e.a(-2.5F, 16.0F, -4.0F);
		this.f = new bni(this, 0, 18);
		this.f.a(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.f.a(0.5F, 16.0F, -4.0F);
		this.g = new bni(this, 9, 18);
		this.g.a(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.g.a(-1.0F, 12.0F, 8.0F);
		this.a.a(16, 14).a(-2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
		this.a.a(16, 14).a(2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
		this.a.a(0, 10).a(-0.5F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		super.a(sn, float2, float3, float4, float5, float6, float7);
		this.a(float2, float3, float4, float5, float6, float7, sn);
		if (this.q) {
			float float9 = 2.0F;
			bqg.G();
			bqg.c(0.0F, 5.0F * float7, 2.0F * float7);
			this.a.b(float7);
			bqg.H();
			bqg.G();
			bqg.b(0.5F, 0.5F, 0.5F);
			bqg.c(0.0F, 24.0F * float7, 0.0F);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
			this.e.a(float7);
			this.f.a(float7);
			this.g.b(float7);
			this.h.a(float7);
			bqg.H();
		} else {
			this.a.b(float7);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
			this.e.a(float7);
			this.f.a(float7);
			this.g.b(float7);
			this.h.a(float7);
		}
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4) {
		xk xk6 = (xk)sw;
		if (xk6.dr()) {
			this.g.g = 0.0F;
		} else {
			this.g.g = ot.b(float2 * 0.6662F) * 1.4F * float3;
		}

		if (xk6.dj()) {
			this.h.a(-1.0F, 16.0F, -3.0F);
			this.h.f = (float) (Math.PI * 2.0 / 5.0);
			this.h.g = 0.0F;
			this.b.a(0.0F, 18.0F, 0.0F);
			this.b.f = (float) (Math.PI / 4);
			this.g.a(-1.0F, 21.0F, 6.0F);
			this.c.a(-2.5F, 22.0F, 2.0F);
			this.c.f = (float) (Math.PI * 3.0 / 2.0);
			this.d.a(0.5F, 22.0F, 2.0F);
			this.d.f = (float) (Math.PI * 3.0 / 2.0);
			this.e.f = 5.811947F;
			this.e.a(-2.49F, 17.0F, -4.0F);
			this.f.f = 5.811947F;
			this.f.a(0.51F, 17.0F, -4.0F);
		} else {
			this.b.a(0.0F, 14.0F, 2.0F);
			this.b.f = (float) (Math.PI / 2);
			this.h.a(-1.0F, 14.0F, -3.0F);
			this.h.f = this.b.f;
			this.g.a(-1.0F, 12.0F, 8.0F);
			this.c.a(-2.5F, 16.0F, 7.0F);
			this.d.a(0.5F, 16.0F, 7.0F);
			this.e.a(-2.5F, 16.0F, -4.0F);
			this.f.a(0.5F, 16.0F, -4.0F);
			this.c.f = ot.b(float2 * 0.6662F) * 1.4F * float3;
			this.d.f = ot.b(float2 * 0.6662F + (float) Math.PI) * 1.4F * float3;
			this.e.f = ot.b(float2 * 0.6662F + (float) Math.PI) * 1.4F * float3;
			this.f.f = ot.b(float2 * 0.6662F) * 1.4F * float3;
		}

		this.a.h = xk6.s(float4) + xk6.i(float4, 0.0F);
		this.h.h = xk6.i(float4, -0.08F);
		this.b.h = xk6.i(float4, -0.16F);
		this.g.h = xk6.i(float4, -0.2F);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		this.a.f = float5 * (float) (Math.PI / 180.0);
		this.a.g = float4 * (float) (Math.PI / 180.0);
		this.g.f = float3;
	}
}

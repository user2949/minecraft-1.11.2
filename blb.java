public class blb extends blv {
	public bni a;
	public bni b;
	public bni c;
	public bni d;
	public bni e;
	public bni f;
	public bni g;
	public bni h;

	public blb() {
		int integer2 = 16;
		this.a = new bni(this, 0, 0);
		this.a.a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
		this.a.a(0.0F, 15.0F, -4.0F);
		this.g = new bni(this, 14, 0);
		this.g.a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
		this.g.a(0.0F, 15.0F, -4.0F);
		this.h = new bni(this, 14, 4);
		this.h.a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
		this.h.a(0.0F, 15.0F, -4.0F);
		this.b = new bni(this, 0, 9);
		this.b.a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
		this.b.a(0.0F, 16.0F, 0.0F);
		this.c = new bni(this, 26, 0);
		this.c.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
		this.c.a(-2.0F, 19.0F, 1.0F);
		this.d = new bni(this, 26, 0);
		this.d.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
		this.d.a(1.0F, 19.0F, 1.0F);
		this.e = new bni(this, 24, 13);
		this.e.a(0.0F, 0.0F, -3.0F, 1, 4, 6);
		this.e.a(-4.0F, 13.0F, 0.0F);
		this.f = new bni(this, 24, 13);
		this.f.a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
		this.f.a(4.0F, 13.0F, 0.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		if (this.q) {
			float float9 = 2.0F;
			bqg.G();
			bqg.c(0.0F, 5.0F * float7, 2.0F * float7);
			this.a.a(float7);
			this.g.a(float7);
			this.h.a(float7);
			bqg.H();
			bqg.G();
			bqg.b(0.5F, 0.5F, 0.5F);
			bqg.c(0.0F, 24.0F * float7, 0.0F);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
			this.e.a(float7);
			this.f.a(float7);
			bqg.H();
		} else {
			this.a.a(float7);
			this.g.a(float7);
			this.h.a(float7);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
			this.e.a(float7);
			this.f.a(float7);
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		this.a.f = float5 * (float) (Math.PI / 180.0);
		this.a.g = float4 * (float) (Math.PI / 180.0);
		this.g.f = this.a.f;
		this.g.g = this.a.g;
		this.h.f = this.a.f;
		this.h.g = this.a.g;
		this.b.f = (float) (Math.PI / 2);
		this.c.f = ot.b(float1 * 0.6662F) * 1.4F * float2;
		this.d.f = ot.b(float1 * 0.6662F + (float) Math.PI) * 1.4F * float2;
		this.e.h = float3;
		this.f.h = -float3;
	}
}

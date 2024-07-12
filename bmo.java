public class bmo extends blv {
	public bni a;
	public bni b;
	public bni c;
	public bni d;
	public bni e;

	public bmo() {
		float float2 = 4.0F;
		float float3 = 0.0F;
		this.c = new bni(this, 0, 0).b(64, 64);
		this.c.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, -0.5F);
		this.c.a(0.0F, 4.0F, 0.0F);
		this.d = new bni(this, 32, 0).b(64, 64);
		this.d.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, -0.5F);
		this.d.a(0.0F, 6.0F, 0.0F);
		this.e = new bni(this, 32, 0).b(64, 64);
		this.e.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, -0.5F);
		this.e.a(0.0F, 6.0F, 0.0F);
		this.a = new bni(this, 0, 16).b(64, 64);
		this.a.a(-5.0F, -10.0F, -5.0F, 10, 10, 10, -0.5F);
		this.a.a(0.0F, 13.0F, 0.0F);
		this.b = new bni(this, 0, 36).b(64, 64);
		this.b.a(-6.0F, -12.0F, -6.0F, 12, 12, 12, -0.5F);
		this.b.a(0.0F, 24.0F, 0.0F);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		this.c.g = float4 * (float) (Math.PI / 180.0);
		this.c.f = float5 * (float) (Math.PI / 180.0);
		this.a.g = float4 * (float) (Math.PI / 180.0) * 0.25F;
		float float9 = ot.a(this.a.g);
		float float10 = ot.b(this.a.g);
		this.d.h = 1.0F;
		this.e.h = -1.0F;
		this.d.g = 0.0F + this.a.g;
		this.e.g = (float) Math.PI + this.a.g;
		this.d.c = float10 * 5.0F;
		this.d.e = -float9 * 5.0F;
		this.e.c = -float10 * 5.0F;
		this.e.e = float9 * 5.0F;
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.a.a(float7);
		this.b.a(float7);
		this.c.a(float7);
		this.d.a(float7);
		this.e.a(float7);
	}
}

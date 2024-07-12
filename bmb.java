public class bmb extends blv {
	public bni a;
	public bni b;
	public bni c;
	public bni d;
	public bni e;
	public bni f;
	protected float g = 8.0F;
	protected float h = 4.0F;

	public bmb(int integer, float float2) {
		this.a = new bni(this, 0, 0);
		this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, float2);
		this.a.a(0.0F, (float)(18 - integer), -6.0F);
		this.b = new bni(this, 28, 8);
		this.b.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, float2);
		this.b.a(0.0F, (float)(17 - integer), 2.0F);
		this.c = new bni(this, 0, 16);
		this.c.a(-2.0F, 0.0F, -2.0F, 4, integer, 4, float2);
		this.c.a(-3.0F, (float)(24 - integer), 7.0F);
		this.d = new bni(this, 0, 16);
		this.d.a(-2.0F, 0.0F, -2.0F, 4, integer, 4, float2);
		this.d.a(3.0F, (float)(24 - integer), 7.0F);
		this.e = new bni(this, 0, 16);
		this.e.a(-2.0F, 0.0F, -2.0F, 4, integer, 4, float2);
		this.e.a(-3.0F, (float)(24 - integer), -5.0F);
		this.f = new bni(this, 0, 16);
		this.f.a(-2.0F, 0.0F, -2.0F, 4, integer, 4, float2);
		this.f.a(3.0F, (float)(24 - integer), -5.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		if (this.q) {
			float float9 = 2.0F;
			bqg.G();
			bqg.c(0.0F, this.g * float7, this.h * float7);
			this.a.a(float7);
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
		this.b.f = (float) (Math.PI / 2);
		this.c.f = ot.b(float1 * 0.6662F) * 1.4F * float2;
		this.d.f = ot.b(float1 * 0.6662F + (float) Math.PI) * 1.4F * float2;
		this.e.f = ot.b(float1 * 0.6662F + (float) Math.PI) * 1.4F * float2;
		this.f.f = ot.b(float1 * 0.6662F) * 1.4F * float2;
	}
}

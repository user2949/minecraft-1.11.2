public class bkz extends blv {
	public bni a = new bni(this).a(0, 0).a(-6.0F, -5.0F, 0.0F, 6, 10, 0);
	public bni b = new bni(this).a(16, 0).a(0.0F, -5.0F, 0.0F, 6, 10, 0);
	public bni c;
	public bni d;
	public bni e;
	public bni f;
	public bni g = new bni(this).a(12, 0).a(-1.0F, -5.0F, 0.0F, 2, 10, 0);

	public bkz() {
		this.c = new bni(this).a(0, 10).a(0.0F, -4.0F, -0.99F, 5, 8, 1);
		this.d = new bni(this).a(12, 10).a(0.0F, -4.0F, -0.01F, 5, 8, 1);
		this.e = new bni(this).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
		this.f = new bni(this).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
		this.a.a(0.0F, 0.0F, -1.0F);
		this.b.a(0.0F, 0.0F, 1.0F);
		this.g.g = (float) (Math.PI / 2);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.a.a(float7);
		this.b.a(float7);
		this.g.a(float7);
		this.c.a(float7);
		this.d.a(float7);
		this.e.a(float7);
		this.f.a(float7);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		float float9 = (ot.a(float1 * 0.02F) * 0.1F + 1.25F) * float4;
		this.a.g = (float) Math.PI + float9;
		this.b.g = -float9;
		this.c.g = float9;
		this.d.g = -float9;
		this.e.g = float9 - float9 * 2.0F * float2;
		this.f.g = float9 - float9 * 2.0F * float3;
		this.c.c = ot.a(float9);
		this.d.c = ot.a(float9);
		this.e.c = ot.a(float9);
		this.f.c = ot.a(float9);
	}
}

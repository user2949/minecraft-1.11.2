public class bld extends blv {
	public bni a;
	public bni b;
	public bni c;
	public bni d;
	public bni e;
	public bni f;
	public bni g;

	public bld() {
		this(0.0F);
	}

	public bld(float float1) {
		int integer3 = 6;
		this.a = new bni(this, 0, 0);
		this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, float1);
		this.a.a(0.0F, 6.0F, 0.0F);
		this.b = new bni(this, 32, 0);
		this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, float1 + 0.5F);
		this.b.a(0.0F, 6.0F, 0.0F);
		this.c = new bni(this, 16, 16);
		this.c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, float1);
		this.c.a(0.0F, 6.0F, 0.0F);
		this.d = new bni(this, 0, 16);
		this.d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, float1);
		this.d.a(-2.0F, 18.0F, 4.0F);
		this.e = new bni(this, 0, 16);
		this.e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, float1);
		this.e.a(2.0F, 18.0F, 4.0F);
		this.f = new bni(this, 0, 16);
		this.f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, float1);
		this.f.a(-2.0F, 18.0F, -4.0F);
		this.g = new bni(this, 0, 16);
		this.g.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, float1);
		this.g.a(2.0F, 18.0F, -4.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.a.a(float7);
		this.c.a(float7);
		this.d.a(float7);
		this.e.a(float7);
		this.f.a(float7);
		this.g.a(float7);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		this.a.g = float4 * (float) (Math.PI / 180.0);
		this.a.f = float5 * (float) (Math.PI / 180.0);
		this.d.f = ot.b(float1 * 0.6662F) * 1.4F * float2;
		this.e.f = ot.b(float1 * 0.6662F + (float) Math.PI) * 1.4F * float2;
		this.f.f = ot.b(float1 * 0.6662F + (float) Math.PI) * 1.4F * float2;
		this.g.f = ot.b(float1 * 0.6662F) * 1.4F * float2;
	}
}

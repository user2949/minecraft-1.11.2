public class bmd extends bmb {
	private float i;

	public bmd() {
		super(12, 0.0F);
		this.a = new bni(this, 0, 0);
		this.a.a(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
		this.a.a(0.0F, 6.0F, -8.0F);
		this.b = new bni(this, 28, 8);
		this.b.a(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
		this.b.a(0.0F, 5.0F, 2.0F);
		float float2 = 0.5F;
		this.c = new bni(this, 0, 16);
		this.c.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
		this.c.a(-3.0F, 12.0F, 7.0F);
		this.d = new bni(this, 0, 16);
		this.d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
		this.d.a(3.0F, 12.0F, 7.0F);
		this.e = new bni(this, 0, 16);
		this.e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
		this.e.a(-3.0F, 12.0F, -5.0F);
		this.f = new bni(this, 0, 16);
		this.f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
		this.f.a(3.0F, 12.0F, -5.0F);
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4) {
		super.a(sw, float2, float3, float4);
		this.a.d = 6.0F + ((xf)sw).r(float4) * 9.0F;
		this.i = ((xf)sw).s(float4);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		this.a.f = this.i;
	}
}

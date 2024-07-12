public class bmg extends blv {
	public bni a;

	public bmg() {
		this.s = 64;
		this.t = 32;
		this.a = new bni(this);
		this.a.a(0, 0).a(-4.0F, -4.0F, -1.0F, 8, 8, 2, 0.0F);
		this.a.a(0, 10).a(-1.0F, -4.0F, -4.0F, 2, 8, 8, 0.0F);
		this.a.a(20, 0).a(-4.0F, -1.0F, -4.0F, 8, 2, 8, 0.0F);
		this.a.a(0.0F, 0.0F, 0.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.a.a(float7);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		this.a.g = float4 * (float) (Math.PI / 180.0);
		this.a.f = float5 * (float) (Math.PI / 180.0);
	}
}

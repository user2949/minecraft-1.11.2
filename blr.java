public class blr extends blv {
	public bni a;

	public blr() {
		this(0, 0, 32, 32);
	}

	public blr(int integer1, int integer2, int integer3, int integer4) {
		this.s = integer3;
		this.t = integer4;
		this.a = new bni(this, integer1, integer2);
		this.a.a(-3.0F, -6.0F, -3.0F, 6, 8, 6, 0.0F);
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

public class blm extends bmk {
	private final bni b = new bni(this, 32, 0);

	public blm() {
		super(0, 0, 64, 64);
		this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F);
		this.b.a(0.0F, 0.0F, 0.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		super.a(sn, float2, float3, float4, float5, float6, float7);
		this.b.a(float7);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		this.b.g = this.a.g;
		this.b.f = this.a.f;
	}
}

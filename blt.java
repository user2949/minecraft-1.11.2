public class blt extends blv {
	private final bni a = new bni(this);

	public blt() {
		this(0.0F);
	}

	public blt(float float1) {
		int integer3 = 2;
		this.a.a(0, 0).a(-4.0F, 0.0F, 0.0F, 2, 2, 2, float1);
		this.a.a(0, 0).a(0.0F, -4.0F, 0.0F, 2, 2, 2, float1);
		this.a.a(0, 0).a(0.0F, 0.0F, -4.0F, 2, 2, 2, float1);
		this.a.a(0, 0).a(0.0F, 0.0F, 0.0F, 2, 2, 2, float1);
		this.a.a(0, 0).a(2.0F, 0.0F, 0.0F, 2, 2, 2, float1);
		this.a.a(0, 0).a(0.0F, 2.0F, 0.0F, 2, 2, 2, float1);
		this.a.a(0, 0).a(0.0F, 0.0F, 2.0F, 2, 2, 2, float1);
		this.a.a(0.0F, 0.0F, 0.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.a.a(float7);
	}
}

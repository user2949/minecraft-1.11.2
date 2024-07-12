public class bne extends blv {
	private final bni a;
	private final bni b = new bni(this, "glass");
	private bni c;

	public bne(float float1, boolean boolean2) {
		this.b.a(0, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
		this.a = new bni(this, "cube");
		this.a.a(32, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
		if (boolean2) {
			this.c = new bni(this, "base");
			this.c.a(0, 16).a(-6.0F, 0.0F, -6.0F, 12, 4, 12);
		}
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		bqg.G();
		bqg.b(2.0F, 2.0F, 2.0F);
		bqg.c(0.0F, -0.5F, 0.0F);
		if (this.c != null) {
			this.c.a(float7);
		}

		bqg.b(float3, 0.0F, 1.0F, 0.0F);
		bqg.c(0.0F, 0.8F + float4, 0.0F);
		bqg.b(60.0F, 0.7071F, 0.0F, 0.7071F);
		this.b.a(float7);
		float float9 = 0.875F;
		bqg.b(0.875F, 0.875F, 0.875F);
		bqg.b(60.0F, 0.7071F, 0.0F, 0.7071F);
		bqg.b(float3, 0.0F, 1.0F, 0.0F);
		this.b.a(float7);
		bqg.b(0.875F, 0.875F, 0.875F);
		bqg.b(60.0F, 0.7071F, 0.0F, 0.7071F);
		bqg.b(float3, 0.0F, 1.0F, 0.0F);
		this.a.a(float7);
		bqg.H();
	}
}

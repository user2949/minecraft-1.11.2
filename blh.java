public class blh extends blv {
	private final bni a = new bni(this, 0, 0);
	private final bni b;
	private final bni c;

	public blh() {
		this.a.a(-5.0F, 22.0F, -5.0F);
		this.a.a(0.0F, 0.0F, 0.0F, 10, 12, 10);
		this.b = new bni(this, 40, 0);
		this.b.a(1.5F, 22.0F, -4.0F);
		this.b.a(0.0F, 0.0F, 0.0F, 4, 14, 8);
		this.c = new bni(this, 40, 0);
		this.c.a(-1.5F, 22.0F, 4.0F);
		this.c.a(0.0F, 0.0F, 0.0F, 4, 14, 8);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		float float9 = float2 * 2.0F;
		if (float9 > 1.0F) {
			float9 = 1.0F;
		}

		float9 = 1.0F - float9 * float9 * float9;
		this.b.h = (float) Math.PI - float9 * 0.35F * (float) Math.PI;
		this.c.h = (float) Math.PI + float9 * 0.35F * (float) Math.PI;
		this.c.g = (float) Math.PI;
		float float10 = (float2 + ot.a(float2 * 2.7F)) * 0.6F * 12.0F;
		this.b.d = 24.0F - float10;
		this.c.d = this.b.d;
		this.a.d = this.b.d;
		this.a.a(float7);
		this.b.a(float7);
		this.c.a(float7);
	}
}

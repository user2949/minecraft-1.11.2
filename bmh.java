public class bmh extends blv {
	public final bni a;
	public final bni b;
	public bni c;

	public bmh() {
		this.t = 64;
		this.s = 64;
		this.b = new bni(this);
		this.a = new bni(this);
		this.c = new bni(this);
		this.b.a(0, 0).a(-8.0F, -16.0F, -8.0F, 16, 12, 16);
		this.b.a(0.0F, 24.0F, 0.0F);
		this.a.a(0, 28).a(-8.0F, -8.0F, -8.0F, 16, 8, 16);
		this.a.a(0.0F, 24.0F, 0.0F);
		this.c.a(0, 52).a(-3.0F, 0.0F, -3.0F, 6, 6, 6);
		this.c.a(0.0F, 12.0F, 0.0F);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		aae aae9 = (aae)sn;
		float float10 = float3 - (float)aae9.T;
		float float11 = (0.5F + aae9.a(float10)) * (float) Math.PI;
		float float12 = -1.0F + ot.a(float11);
		float float13 = 0.0F;
		if (float11 > (float) Math.PI) {
			float13 = ot.a(float3 * 0.1F) * 0.7F;
		}

		this.b.a(0.0F, 16.0F + ot.a(float11) * 8.0F + float13, 0.0F);
		if (aae9.a(float10) > 0.3F) {
			this.b.g = float12 * float12 * float12 * float12 * (float) Math.PI * 0.125F;
		} else {
			this.b.g = 0.0F;
		}

		this.c.f = float5 * (float) (Math.PI / 180.0);
		this.c.g = float4 * (float) (Math.PI / 180.0);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a.a(float7);
		this.b.a(float7);
	}
}

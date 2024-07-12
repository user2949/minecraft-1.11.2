public class bkx extends blv {
	private final bni[] a = new bni[12];
	private final bni b;

	public bkx() {
		for (int integer2 = 0; integer2 < this.a.length; integer2++) {
			this.a[integer2] = new bni(this, 0, 16);
			this.a[integer2].a(0.0F, 0.0F, 0.0F, 2, 8, 2);
		}

		this.b = new bni(this, 0, 0);
		this.b.a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.b.a(float7);

		for (bni bni12 : this.a) {
			bni12.a(float7);
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		float float9 = float3 * (float) Math.PI * -0.1F;

		for (int integer10 = 0; integer10 < 4; integer10++) {
			this.a[integer10].d = -2.0F + ot.b(((float)(integer10 * 2) + float3) * 0.25F);
			this.a[integer10].c = ot.b(float9) * 9.0F;
			this.a[integer10].e = ot.a(float9) * 9.0F;
			float9++;
		}

		float9 = (float) (Math.PI / 4) + float3 * (float) Math.PI * 0.03F;

		for (int integer10 = 4; integer10 < 8; integer10++) {
			this.a[integer10].d = 2.0F + ot.b(((float)(integer10 * 2) + float3) * 0.25F);
			this.a[integer10].c = ot.b(float9) * 7.0F;
			this.a[integer10].e = ot.a(float9) * 7.0F;
			float9++;
		}

		float9 = 0.47123894F + float3 * (float) Math.PI * -0.05F;

		for (int integer10 = 8; integer10 < 12; integer10++) {
			this.a[integer10].d = 11.0F + ot.b(((float)integer10 * 1.5F + float3) * 0.5F);
			this.a[integer10].c = ot.b(float9) * 5.0F;
			this.a[integer10].e = ot.a(float9) * 5.0F;
			float9++;
		}

		this.b.g = float4 * (float) (Math.PI / 180.0);
		this.b.f = float5 * (float) (Math.PI / 180.0);
	}
}

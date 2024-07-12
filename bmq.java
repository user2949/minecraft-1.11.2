public class bmq extends blv {
	bni a;
	bni[] b = new bni[8];

	public bmq() {
		int integer2 = -16;
		this.a = new bni(this, 0, 0);
		this.a.a(-6.0F, -8.0F, -6.0F, 12, 16, 12);
		this.a.d += 8.0F;

		for (int integer3 = 0; integer3 < this.b.length; integer3++) {
			this.b[integer3] = new bni(this, 48, 0);
			double double4 = (double)integer3 * Math.PI * 2.0 / (double)this.b.length;
			float float6 = (float)Math.cos(double4) * 5.0F;
			float float7 = (float)Math.sin(double4) * 5.0F;
			this.b[integer3].a(-1.0F, 0.0F, -1.0F, 2, 18, 2);
			this.b[integer3].c = float6;
			this.b[integer3].e = float7;
			this.b[integer3].d = 15.0F;
			double4 = (double)integer3 * Math.PI * -2.0 / (double)this.b.length + (Math.PI / 2);
			this.b[integer3].g = (float)double4;
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		for (bni bni12 : this.b) {
			bni12.f = float3;
		}
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.a.a(float7);

		for (bni bni12 : this.b) {
			bni12.a(float7);
		}
	}
}

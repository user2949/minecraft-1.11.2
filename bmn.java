public class bmn extends blv {
	bni a;
	bni b;
	bni c;
	bni d;

	public bmn(int integer) {
		if (integer > 0) {
			this.a = new bni(this, 0, integer);
			this.a.a(-3.0F, 17.0F, -3.0F, 6, 6, 6);
			this.b = new bni(this, 32, 0);
			this.b.a(-3.25F, 18.0F, -3.5F, 2, 2, 2);
			this.c = new bni(this, 32, 4);
			this.c.a(1.25F, 18.0F, -3.5F, 2, 2, 2);
			this.d = new bni(this, 32, 8);
			this.d.a(0.0F, 21.0F, -3.5F, 1, 1, 1);
		} else {
			this.a = new bni(this, 0, integer);
			this.a.a(-4.0F, 16.0F, -4.0F, 8, 8, 8);
		}
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		bqg.c(0.0F, 0.001F, 0.0F);
		this.a.a(float7);
		if (this.b != null) {
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
		}
	}
}

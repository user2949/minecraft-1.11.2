public class blu extends blv {
	public bni[] a = new bni[7];

	public blu() {
		this.a[0] = new bni(this, 0, 10);
		this.a[1] = new bni(this, 0, 0);
		this.a[2] = new bni(this, 0, 0);
		this.a[3] = new bni(this, 0, 0);
		this.a[4] = new bni(this, 0, 0);
		this.a[5] = new bni(this, 44, 10);
		int integer2 = 20;
		int integer3 = 8;
		int integer4 = 16;
		int integer5 = 4;
		this.a[0].a(-10.0F, -8.0F, -1.0F, 20, 16, 2, 0.0F);
		this.a[0].a(0.0F, 4.0F, 0.0F);
		this.a[5].a(-9.0F, -7.0F, -1.0F, 18, 14, 1, 0.0F);
		this.a[5].a(0.0F, 4.0F, 0.0F);
		this.a[1].a(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
		this.a[1].a(-9.0F, 4.0F, 0.0F);
		this.a[2].a(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
		this.a[2].a(9.0F, 4.0F, 0.0F);
		this.a[3].a(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
		this.a[3].a(0.0F, 4.0F, -7.0F);
		this.a[4].a(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
		this.a[4].a(0.0F, 4.0F, 7.0F);
		this.a[0].f = (float) (Math.PI / 2);
		this.a[1].g = (float) (Math.PI * 3.0 / 2.0);
		this.a[2].g = (float) (Math.PI / 2);
		this.a[3].g = (float) Math.PI;
		this.a[5].f = (float) (-Math.PI / 2);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a[5].d = 4.0F - float4;

		for (int integer9 = 0; integer9 < 6; integer9++) {
			this.a[integer9].a(float7);
		}
	}
}

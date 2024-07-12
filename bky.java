public class bky extends blv implements bmr {
	public bni[] a = new bni[5];
	public bni[] b = new bni[2];
	public bni c;
	private final int d = ber.a(1);

	public bky() {
		this.a[0] = new bni(this, 0, 0).b(128, 64);
		this.a[1] = new bni(this, 0, 19).b(128, 64);
		this.a[2] = new bni(this, 0, 27).b(128, 64);
		this.a[3] = new bni(this, 0, 35).b(128, 64);
		this.a[4] = new bni(this, 0, 43).b(128, 64);
		int integer2 = 32;
		int integer3 = 6;
		int integer4 = 20;
		int integer5 = 4;
		int integer6 = 28;
		this.a[0].a(-14.0F, -9.0F, -3.0F, 28, 16, 3, 0.0F);
		this.a[0].a(0.0F, 3.0F, 1.0F);
		this.a[1].a(-13.0F, -7.0F, -1.0F, 18, 6, 2, 0.0F);
		this.a[1].a(-15.0F, 4.0F, 4.0F);
		this.a[2].a(-8.0F, -7.0F, -1.0F, 16, 6, 2, 0.0F);
		this.a[2].a(15.0F, 4.0F, 0.0F);
		this.a[3].a(-14.0F, -7.0F, -1.0F, 28, 6, 2, 0.0F);
		this.a[3].a(0.0F, 4.0F, -9.0F);
		this.a[4].a(-14.0F, -7.0F, -1.0F, 28, 6, 2, 0.0F);
		this.a[4].a(0.0F, 4.0F, 9.0F);
		this.a[0].f = (float) (Math.PI / 2);
		this.a[1].g = (float) (Math.PI * 3.0 / 2.0);
		this.a[2].g = (float) (Math.PI / 2);
		this.a[3].g = (float) Math.PI;
		this.b[0] = this.a(true);
		this.b[0].a(3.0F, -5.0F, 9.0F);
		this.b[1] = this.a(false);
		this.b[1].a(3.0F, -5.0F, -9.0F);
		this.b[1].g = (float) Math.PI;
		this.b[0].h = (float) (Math.PI / 16);
		this.b[1].h = (float) (Math.PI / 16);
		this.c = new bni(this, 0, 0).b(128, 64);
		this.c.a(-14.0F, -9.0F, -3.0F, 28, 16, 3, 0.0F);
		this.c.a(0.0F, -3.0F, 1.0F);
		this.c.f = (float) (Math.PI / 2);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		bqg.b(90.0F, 0.0F, 1.0F, 0.0F);
		abx abx9 = (abx)sn;
		this.a(float2, float3, float4, float5, float6, float7, sn);

		for (int integer10 = 0; integer10 < 5; integer10++) {
			this.a[integer10].a(float7);
		}

		this.a(abx9, 0, float7, float2);
		this.a(abx9, 1, float7, float2);
	}

	@Override
	public void b(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		bqg.b(90.0F, 0.0F, 1.0F, 0.0F);
		bqg.a(false, false, false, false);
		this.c.a(float7);
		bqg.a(true, true, true, true);
	}

	protected bni a(boolean boolean1) {
		bni bni3 = new bni(this, 62, boolean1 ? 0 : 20).b(128, 64);
		int integer4 = 20;
		int integer5 = 7;
		int integer6 = 6;
		float float7 = -5.0F;
		bni3.a(-1.0F, 0.0F, -5.0F, 2, 2, 18);
		bni3.a(boolean1 ? -1.001F : 0.001F, -3.0F, 8.0F, 1, 6, 7);
		return bni3;
	}

	protected void a(abx abx, int integer, float float3, float float4) {
		float float6 = 40.0F;
		float float7 = abx.a(integer, float4) * 40.0F;
		bni bni8 = this.b[integer];
		bni8.f = (float)ot.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (double)((ot.a(-float7) + 1.0F) / 2.0F));
		bni8.g = (float)ot.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (double)((ot.a(-float7 + 1.0F) + 1.0F) / 2.0F));
		if (integer == 1) {
			bni8.g = (float) Math.PI - bni8.g;
		}

		bni8.a(float3);
	}
}

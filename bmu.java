public class bmu extends blv {
	public bni a;
	public bni b;
	public bni c;
	public bni d;
	public bni e;
	public bni f;

	public bmu() {
		this(0.0F);
	}

	public bmu(float float1) {
		this(float1, -7.0F);
	}

	public bmu(float float1, float float2) {
		int integer4 = 128;
		int integer5 = 128;
		this.a = new bni(this).b(128, 128);
		this.a.a(0.0F, 0.0F + float2, -2.0F);
		this.a.a(0, 0).a(-4.0F, -12.0F, -5.5F, 8, 10, 8, float1);
		this.a.a(24, 0).a(-1.0F, -5.0F, -7.5F, 2, 4, 2, float1);
		this.b = new bni(this).b(128, 128);
		this.b.a(0.0F, 0.0F + float2, 0.0F);
		this.b.a(0, 40).a(-9.0F, -2.0F, -6.0F, 18, 12, 11, float1);
		this.b.a(0, 70).a(-4.5F, 10.0F, -3.0F, 9, 5, 6, float1 + 0.5F);
		this.c = new bni(this).b(128, 128);
		this.c.a(0.0F, -7.0F, 0.0F);
		this.c.a(60, 21).a(-13.0F, -2.5F, -3.0F, 4, 30, 6, float1);
		this.d = new bni(this).b(128, 128);
		this.d.a(0.0F, -7.0F, 0.0F);
		this.d.a(60, 58).a(9.0F, -2.5F, -3.0F, 4, 30, 6, float1);
		this.e = new bni(this, 0, 22).b(128, 128);
		this.e.a(-4.0F, 18.0F + float2, 0.0F);
		this.e.a(37, 0).a(-3.5F, -3.0F, -3.0F, 6, 16, 5, float1);
		this.f = new bni(this, 0, 22).b(128, 128);
		this.f.i = true;
		this.f.a(60, 0).a(5.0F, 18.0F + float2, 0.0F);
		this.f.a(-3.5F, -3.0F, -3.0F, 6, 16, 5, float1);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.a.a(float7);
		this.b.a(float7);
		this.e.a(float7);
		this.f.a(float7);
		this.c.a(float7);
		this.d.a(float7);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		this.a.g = float4 * (float) (Math.PI / 180.0);
		this.a.f = float5 * (float) (Math.PI / 180.0);
		this.e.f = -1.5F * this.a(float1, 13.0F) * float2;
		this.f.f = 1.5F * this.a(float1, 13.0F) * float2;
		this.e.g = 0.0F;
		this.f.g = 0.0F;
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4) {
		xi xi6 = (xi)sw;
		int integer7 = xi6.dh();
		if (integer7 > 0) {
			this.c.f = -2.0F + 1.5F * this.a((float)integer7 - float4, 10.0F);
			this.d.f = -2.0F + 1.5F * this.a((float)integer7 - float4, 10.0F);
		} else {
			int integer8 = xi6.di();
			if (integer8 > 0) {
				this.c.f = -0.8F + 0.025F * this.a((float)integer8, 70.0F);
				this.d.f = 0.0F;
			} else {
				this.c.f = (-0.2F + 1.5F * this.a(float2, 13.0F)) * float3;
				this.d.f = (-0.2F - 1.5F * this.a(float2, 13.0F)) * float3;
			}
		}
	}

	private float a(float float1, float float2) {
		return (Math.abs(float1 % float2 - float2 * 0.5F) - float2 * 0.25F) / (float2 * 0.25F);
	}
}

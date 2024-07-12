public class bls extends bmb {
	private final bni i;
	private final bni j;

	public bls(float float1) {
		super(15, float1);
		this.s = 128;
		this.t = 64;
		this.a = new bni(this, 0, 0);
		this.a.a(-2.0F, -14.0F, -10.0F, 4, 4, 9, float1);
		this.a.a(0.0F, 7.0F, -6.0F);
		this.a.a(0, 14).a(-4.0F, -16.0F, -6.0F, 8, 18, 6, float1);
		this.a.a(17, 0).a(-4.0F, -19.0F, -4.0F, 3, 3, 2, float1);
		this.a.a(17, 0).a(1.0F, -19.0F, -4.0F, 3, 3, 2, float1);
		this.b = new bni(this, 29, 0);
		this.b.a(-6.0F, -10.0F, -7.0F, 12, 18, 10, float1);
		this.b.a(0.0F, 5.0F, 2.0F);
		this.i = new bni(this, 45, 28);
		this.i.a(-3.0F, 0.0F, 0.0F, 8, 8, 3, float1);
		this.i.a(-8.5F, 3.0F, 3.0F);
		this.i.g = (float) (Math.PI / 2);
		this.j = new bni(this, 45, 41);
		this.j.a(-3.0F, 0.0F, 0.0F, 8, 8, 3, float1);
		this.j.a(5.5F, 3.0F, 3.0F);
		this.j.g = (float) (Math.PI / 2);
		int integer3 = 4;
		int integer4 = 14;
		this.c = new bni(this, 29, 29);
		this.c.a(-2.0F, 0.0F, -2.0F, 4, 14, 4, float1);
		this.c.a(-2.5F, 10.0F, 6.0F);
		this.d = new bni(this, 29, 29);
		this.d.a(-2.0F, 0.0F, -2.0F, 4, 14, 4, float1);
		this.d.a(2.5F, 10.0F, 6.0F);
		this.e = new bni(this, 29, 29);
		this.e.a(-2.0F, 0.0F, -2.0F, 4, 14, 4, float1);
		this.e.a(-2.5F, 10.0F, -4.0F);
		this.f = new bni(this, 29, 29);
		this.f.a(-2.0F, 0.0F, -2.0F, 4, 14, 4, float1);
		this.f.a(2.5F, 10.0F, -4.0F);
		this.c.c--;
		this.d.c++;
		this.c.e += 0.0F;
		this.d.e += 0.0F;
		this.e.c--;
		this.f.c++;
		this.e.e--;
		this.f.e--;
		this.h += 2.0F;
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		xl xl9 = (xl)sn;
		boolean boolean10 = !xl9.l_() && xl9.dh();
		this.a(float2, float3, float4, float5, float6, float7, sn);
		if (this.q) {
			float float11 = 2.0F;
			bqg.G();
			bqg.c(0.0F, this.g * float7, this.h * float7);
			bqg.H();
			bqg.G();
			float float12 = 0.7F;
			bqg.b(0.71428573F, 0.64935064F, 0.7936508F);
			bqg.c(0.0F, 21.0F * float7, 0.22F);
			this.a.a(float7);
			bqg.H();
			bqg.G();
			float float13 = 1.1F;
			bqg.b(0.625F, 0.45454544F, 0.45454544F);
			bqg.c(0.0F, 33.0F * float7, 0.0F);
			this.b.a(float7);
			bqg.H();
			bqg.G();
			bqg.b(0.45454544F, 0.41322312F, 0.45454544F);
			bqg.c(0.0F, 33.0F * float7, 0.0F);
			this.c.a(float7);
			this.d.a(float7);
			this.e.a(float7);
			this.f.a(float7);
			bqg.H();
		} else {
			this.a.a(float7);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
			this.e.a(float7);
			this.f.a(float7);
		}

		if (boolean10) {
			this.i.a(float7);
			this.j.a(float7);
		}
	}
}

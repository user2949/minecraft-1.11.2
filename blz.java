public class blz extends bmb {
	public blz() {
		super(12, 0.0F);
		this.s = 128;
		this.t = 64;
		this.a = new bni(this, 0, 0);
		this.a.a(-3.5F, -3.0F, -3.0F, 7, 7, 7, 0.0F);
		this.a.a(0.0F, 10.0F, -16.0F);
		this.a.a(0, 44).a(-2.5F, 1.0F, -6.0F, 5, 3, 3, 0.0F);
		this.a.a(26, 0).a(-4.5F, -4.0F, -1.0F, 2, 2, 1, 0.0F);
		bni bni2 = this.a.a(26, 0);
		bni2.i = true;
		bni2.a(2.5F, -4.0F, -1.0F, 2, 2, 1, 0.0F);
		this.b = new bni(this);
		this.b.a(0, 19).a(-5.0F, -13.0F, -7.0F, 14, 14, 11, 0.0F);
		this.b.a(39, 0).a(-4.0F, -25.0F, -7.0F, 12, 12, 10, 0.0F);
		this.b.a(-2.0F, 9.0F, 12.0F);
		int integer3 = 10;
		this.c = new bni(this, 50, 22);
		this.c.a(-2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F);
		this.c.a(-3.5F, 14.0F, 6.0F);
		this.d = new bni(this, 50, 22);
		this.d.a(-2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F);
		this.d.a(3.5F, 14.0F, 6.0F);
		this.e = new bni(this, 50, 40);
		this.e.a(-2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F);
		this.e.a(-2.5F, 14.0F, -7.0F);
		this.f = new bni(this, 50, 40);
		this.f.a(-2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F);
		this.f.a(2.5F, 14.0F, -7.0F);
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
		this.a(float2, float3, float4, float5, float6, float7, sn);
		if (this.q) {
			float float9 = 2.0F;
			this.g = 16.0F;
			this.h = 4.0F;
			bqg.G();
			bqg.b(0.6666667F, 0.6666667F, 0.6666667F);
			bqg.c(0.0F, this.g * float7, this.h * float7);
			this.a.a(float7);
			bqg.H();
			bqg.G();
			bqg.b(0.5F, 0.5F, 0.5F);
			bqg.c(0.0F, 24.0F * float7, 0.0F);
			this.b.a(float7);
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
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		float float9 = float3 - (float)sn.T;
		float float10 = ((xd)sn).r(float9);
		float10 *= float10;
		float float11 = 1.0F - float10;
		this.b.f = (float) (Math.PI / 2) - float10 * (float) Math.PI * 0.35F;
		this.b.d = 9.0F * float11 + 11.0F * float10;
		this.e.d = 14.0F * float11 + -6.0F * float10;
		this.e.e = -8.0F * float11 + -4.0F * float10;
		this.e.f -= float10 * (float) Math.PI * 0.45F;
		this.f.d = this.e.d;
		this.f.e = this.e.e;
		this.f.f -= float10 * (float) Math.PI * 0.45F;
		this.a.d = 10.0F * float11 + -12.0F * float10;
		this.a.e = -16.0F * float11 + -3.0F * float10;
		this.a.f += float10 * (float) Math.PI * 0.15F;
	}
}

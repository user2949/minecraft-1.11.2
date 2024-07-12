public class bku extends bkt {
	public bni a;
	public bni b;
	public bni c;
	public bni d;

	public bku() {
		this(0.0F);
	}

	public bku(float float1) {
		super(float1, 64, 64);
		this.e = new bni(this, 0, 0);
		this.e.a(-1.0F, -7.0F, -1.0F, 2, 7, 2, float1);
		this.e.a(0.0F, 0.0F, 0.0F);
		this.g = new bni(this, 0, 26);
		this.g.a(-6.0F, 0.0F, -1.5F, 12, 3, 3, float1);
		this.g.a(0.0F, 0.0F, 0.0F);
		this.h = new bni(this, 24, 0);
		this.h.a(-2.0F, -2.0F, -1.0F, 2, 12, 2, float1);
		this.h.a(-5.0F, 2.0F, 0.0F);
		this.i = new bni(this, 32, 16);
		this.i.i = true;
		this.i.a(0.0F, -2.0F, -1.0F, 2, 12, 2, float1);
		this.i.a(5.0F, 2.0F, 0.0F);
		this.j = new bni(this, 8, 0);
		this.j.a(-1.0F, 0.0F, -1.0F, 2, 11, 2, float1);
		this.j.a(-1.9F, 12.0F, 0.0F);
		this.k = new bni(this, 40, 16);
		this.k.i = true;
		this.k.a(-1.0F, 0.0F, -1.0F, 2, 11, 2, float1);
		this.k.a(1.9F, 12.0F, 0.0F);
		this.a = new bni(this, 16, 0);
		this.a.a(-3.0F, 3.0F, -1.0F, 2, 7, 2, float1);
		this.a.a(0.0F, 0.0F, 0.0F);
		this.a.j = true;
		this.b = new bni(this, 48, 16);
		this.b.a(1.0F, 3.0F, -1.0F, 2, 7, 2, float1);
		this.b.a(0.0F, 0.0F, 0.0F);
		this.c = new bni(this, 0, 48);
		this.c.a(-4.0F, 10.0F, -1.0F, 8, 2, 2, float1);
		this.c.a(0.0F, 0.0F, 0.0F);
		this.d = new bni(this, 0, 32);
		this.d.a(-6.0F, 11.0F, -6.0F, 12, 1, 12, float1);
		this.d.a(0.0F, 12.0F, 0.0F);
		this.f.j = false;
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		if (sn instanceof yx) {
			yx yx9 = (yx)sn;
			this.i.j = yx9.r();
			this.h.j = yx9.r();
			this.d.j = !yx9.s();
			this.k.a(1.9F, 12.0F, 0.0F);
			this.j.a(-1.9F, 12.0F, 0.0F);
			this.a.f = (float) (Math.PI / 180.0) * yx9.w().b();
			this.a.g = (float) (Math.PI / 180.0) * yx9.w().c();
			this.a.h = (float) (Math.PI / 180.0) * yx9.w().d();
			this.b.f = (float) (Math.PI / 180.0) * yx9.w().b();
			this.b.g = (float) (Math.PI / 180.0) * yx9.w().c();
			this.b.h = (float) (Math.PI / 180.0) * yx9.w().d();
			this.c.f = (float) (Math.PI / 180.0) * yx9.w().b();
			this.c.g = (float) (Math.PI / 180.0) * yx9.w().c();
			this.c.h = (float) (Math.PI / 180.0) * yx9.w().d();
			this.d.f = 0.0F;
			this.d.g = (float) (Math.PI / 180.0) * -sn.v;
			this.d.h = 0.0F;
		}
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		super.a(sn, float2, float3, float4, float5, float6, float7);
		bqg.G();
		if (this.q) {
			float float9 = 2.0F;
			bqg.b(0.5F, 0.5F, 0.5F);
			bqg.c(0.0F, 24.0F * float7, 0.0F);
			this.a.a(float7);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
		} else {
			if (sn.aM()) {
				bqg.c(0.0F, 0.2F, 0.0F);
			}

			this.a.a(float7);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
		}

		bqg.H();
	}

	@Override
	public void a(float float1, sv sv) {
		bni bni4 = this.a(sv);
		boolean boolean5 = bni4.j;
		bni4.j = true;
		super.a(float1, sv);
		bni4.j = boolean5;
	}
}

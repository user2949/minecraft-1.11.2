public class blf extends bln {
	public boolean a;
	public boolean b;

	public blf(float float1) {
		super(0.0F, -14.0F, 64, 32);
		float float3 = -14.0F;
		this.f = new bni(this, 0, 16);
		this.f.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, float1 - 0.5F);
		this.f.a(0.0F, -14.0F, 0.0F);
		this.g = new bni(this, 32, 16);
		this.g.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, float1);
		this.g.a(0.0F, -14.0F, 0.0F);
		this.h = new bni(this, 56, 0);
		this.h.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, float1);
		this.h.a(-3.0F, -12.0F, 0.0F);
		this.i = new bni(this, 56, 0);
		this.i.i = true;
		this.i.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, float1);
		this.i.a(5.0F, -12.0F, 0.0F);
		this.j = new bni(this, 56, 0);
		this.j.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, float1);
		this.j.a(-2.0F, -2.0F, 0.0F);
		this.k = new bni(this, 56, 0);
		this.k.i = true;
		this.k.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, float1);
		this.k.a(2.0F, -2.0F, 0.0F);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		this.e.j = true;
		float float9 = -14.0F;
		this.g.f = 0.0F;
		this.g.d = -14.0F;
		this.g.e = -0.0F;
		this.j.f -= 0.0F;
		this.k.f -= 0.0F;
		this.h.f = (float)((double)this.h.f * 0.5);
		this.i.f = (float)((double)this.i.f * 0.5);
		this.j.f = (float)((double)this.j.f * 0.5);
		this.k.f = (float)((double)this.k.f * 0.5);
		float float10 = 0.4F;
		if (this.h.f > 0.4F) {
			this.h.f = 0.4F;
		}

		if (this.i.f > 0.4F) {
			this.i.f = 0.4F;
		}

		if (this.h.f < -0.4F) {
			this.h.f = -0.4F;
		}

		if (this.i.f < -0.4F) {
			this.i.f = -0.4F;
		}

		if (this.j.f > 0.4F) {
			this.j.f = 0.4F;
		}

		if (this.k.f > 0.4F) {
			this.k.f = 0.4F;
		}

		if (this.j.f < -0.4F) {
			this.j.f = -0.4F;
		}

		if (this.k.f < -0.4F) {
			this.k.f = -0.4F;
		}

		if (this.a) {
			this.h.f = -0.5F;
			this.i.f = -0.5F;
			this.h.h = 0.05F;
			this.i.h = -0.05F;
		}

		this.h.e = 0.0F;
		this.i.e = 0.0F;
		this.j.e = 0.0F;
		this.k.e = 0.0F;
		this.j.d = -5.0F;
		this.k.d = -5.0F;
		this.e.e = -0.0F;
		this.e.d = -13.0F;
		this.f.c = this.e.c;
		this.f.d = this.e.d;
		this.f.e = this.e.e;
		this.f.f = this.e.f;
		this.f.g = this.e.g;
		this.f.h = this.e.h;
		if (this.b) {
			float float11 = 1.0F;
			this.e.d -= 5.0F;
		}
	}
}

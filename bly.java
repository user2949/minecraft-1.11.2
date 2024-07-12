public class bly extends bln {
	public bni a;
	public bni b;
	public bni c;
	public bni d;
	public bni u;
	private final bni v;
	private final bni w;
	private final boolean x;

	public bly(float float1, boolean boolean2) {
		super(float1, 0.0F, 64, 64);
		this.x = boolean2;
		this.w = new bni(this, 24, 0);
		this.w.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, float1);
		this.v = new bni(this, 0, 0);
		this.v.b(64, 32);
		this.v.a(-5.0F, 0.0F, -1.0F, 10, 16, 1, float1);
		if (boolean2) {
			this.i = new bni(this, 32, 48);
			this.i.a(-1.0F, -2.0F, -2.0F, 3, 12, 4, float1);
			this.i.a(5.0F, 2.5F, 0.0F);
			this.h = new bni(this, 40, 16);
			this.h.a(-2.0F, -2.0F, -2.0F, 3, 12, 4, float1);
			this.h.a(-5.0F, 2.5F, 0.0F);
			this.a = new bni(this, 48, 48);
			this.a.a(-1.0F, -2.0F, -2.0F, 3, 12, 4, float1 + 0.25F);
			this.a.a(5.0F, 2.5F, 0.0F);
			this.b = new bni(this, 40, 32);
			this.b.a(-2.0F, -2.0F, -2.0F, 3, 12, 4, float1 + 0.25F);
			this.b.a(-5.0F, 2.5F, 10.0F);
		} else {
			this.i = new bni(this, 32, 48);
			this.i.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, float1);
			this.i.a(5.0F, 2.0F, 0.0F);
			this.a = new bni(this, 48, 48);
			this.a.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, float1 + 0.25F);
			this.a.a(5.0F, 2.0F, 0.0F);
			this.b = new bni(this, 40, 32);
			this.b.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, float1 + 0.25F);
			this.b.a(-5.0F, 2.0F, 10.0F);
		}

		this.k = new bni(this, 16, 48);
		this.k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1);
		this.k.a(1.9F, 12.0F, 0.0F);
		this.c = new bni(this, 0, 48);
		this.c.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1 + 0.25F);
		this.c.a(1.9F, 12.0F, 0.0F);
		this.d = new bni(this, 0, 32);
		this.d.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1 + 0.25F);
		this.d.a(-1.9F, 12.0F, 0.0F);
		this.u = new bni(this, 16, 32);
		this.u.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, float1 + 0.25F);
		this.u.a(0.0F, 0.0F, 0.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		super.a(sn, float2, float3, float4, float5, float6, float7);
		bqg.G();
		if (this.q) {
			float float9 = 2.0F;
			bqg.b(0.5F, 0.5F, 0.5F);
			bqg.c(0.0F, 24.0F * float7, 0.0F);
			this.c.a(float7);
			this.d.a(float7);
			this.a.a(float7);
			this.b.a(float7);
			this.u.a(float7);
		} else {
			if (sn.aM()) {
				bqg.c(0.0F, 0.2F, 0.0F);
			}

			this.c.a(float7);
			this.d.a(float7);
			this.a.a(float7);
			this.b.a(float7);
			this.u.a(float7);
		}

		bqg.H();
	}

	public void a(float float1) {
		a(this.e, this.w);
		this.w.c = 0.0F;
		this.w.d = 0.0F;
		this.w.a(float1);
	}

	public void b(float float1) {
		this.v.a(float1);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		a(this.k, this.c);
		a(this.j, this.d);
		a(this.i, this.a);
		a(this.h, this.b);
		a(this.g, this.u);
		if (sn.aM()) {
			this.v.d = 2.0F;
		} else {
			this.v.d = 0.0F;
		}
	}

	@Override
	public void a(boolean boolean1) {
		super.a(boolean1);
		this.a.j = boolean1;
		this.b.j = boolean1;
		this.c.j = boolean1;
		this.d.j = boolean1;
		this.u.j = boolean1;
		this.v.j = boolean1;
		this.w.j = boolean1;
	}

	@Override
	public void a(float float1, sv sv) {
		bni bni4 = this.a(sv);
		if (this.x) {
			float float5 = 0.5F * (float)(sv == sv.RIGHT ? 1 : -1);
			bni4.c += float5;
			bni4.c(float1);
			bni4.c -= float5;
		} else {
			bni4.c(float1);
		}
	}
}

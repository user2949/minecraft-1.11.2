public class blw extends blv {
	private final bni a;
	private final bni b;
	private final bni c;
	private final bni d;
	private final bni e;
	private final bni f;
	private final bni g;
	private final bni h;
	private int i = 1;

	public blw() {
		this.a("head.main", 0, 0);
		this.a("head.nose", 0, 24);
		this.a("head.ear1", 0, 10);
		this.a("head.ear2", 6, 10);
		this.g = new bni(this, "head");
		this.g.a("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
		this.g.a("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
		this.g.a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
		this.g.a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
		this.g.a(0.0F, 15.0F, -9.0F);
		this.h = new bni(this, 20, 0);
		this.h.a(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
		this.h.a(0.0F, 12.0F, -10.0F);
		this.e = new bni(this, 0, 15);
		this.e.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
		this.e.f = 0.9F;
		this.e.a(0.0F, 15.0F, 8.0F);
		this.f = new bni(this, 4, 15);
		this.f.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
		this.f.a(0.0F, 20.0F, 14.0F);
		this.a = new bni(this, 8, 13);
		this.a.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
		this.a.a(1.1F, 18.0F, 5.0F);
		this.b = new bni(this, 8, 13);
		this.b.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
		this.b.a(-1.1F, 18.0F, 5.0F);
		this.c = new bni(this, 40, 0);
		this.c.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
		this.c.a(1.2F, 13.8F, -5.0F);
		this.d = new bni(this, 40, 0);
		this.d.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
		this.d.a(-1.2F, 13.8F, -5.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		if (this.q) {
			float float9 = 2.0F;
			bqg.G();
			bqg.b(0.75F, 0.75F, 0.75F);
			bqg.c(0.0F, 10.0F * float7, 4.0F * float7);
			this.g.a(float7);
			bqg.H();
			bqg.G();
			bqg.b(0.5F, 0.5F, 0.5F);
			bqg.c(0.0F, 24.0F * float7, 0.0F);
			this.h.a(float7);
			this.a.a(float7);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
			this.e.a(float7);
			this.f.a(float7);
			bqg.H();
		} else {
			this.g.a(float7);
			this.h.a(float7);
			this.e.a(float7);
			this.f.a(float7);
			this.a.a(float7);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		this.g.f = float5 * (float) (Math.PI / 180.0);
		this.g.g = float4 * (float) (Math.PI / 180.0);
		if (this.i != 3) {
			this.h.f = (float) (Math.PI / 2);
			if (this.i == 2) {
				this.a.f = ot.b(float1 * 0.6662F) * float2;
				this.b.f = ot.b(float1 * 0.6662F + 0.3F) * float2;
				this.c.f = ot.b(float1 * 0.6662F + (float) Math.PI + 0.3F) * float2;
				this.d.f = ot.b(float1 * 0.6662F + (float) Math.PI) * float2;
				this.f.f = 1.7278761F + (float) (Math.PI / 10) * ot.b(float1) * float2;
			} else {
				this.a.f = ot.b(float1 * 0.6662F) * float2;
				this.b.f = ot.b(float1 * 0.6662F + (float) Math.PI) * float2;
				this.c.f = ot.b(float1 * 0.6662F + (float) Math.PI) * float2;
				this.d.f = ot.b(float1 * 0.6662F) * float2;
				if (this.i == 1) {
					this.f.f = 1.7278761F + (float) (Math.PI / 4) * ot.b(float1) * float2;
				} else {
					this.f.f = 1.7278761F + 0.47123894F * ot.b(float1) * float2;
				}
			}
		}
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4) {
		xb xb6 = (xb)sw;
		this.h.d = 12.0F;
		this.h.e = -10.0F;
		this.g.d = 15.0F;
		this.g.e = -9.0F;
		this.e.d = 15.0F;
		this.e.e = 8.0F;
		this.f.d = 20.0F;
		this.f.e = 14.0F;
		this.c.d = 13.8F;
		this.c.e = -5.0F;
		this.d.d = 13.8F;
		this.d.e = -5.0F;
		this.a.d = 18.0F;
		this.a.e = 5.0F;
		this.b.d = 18.0F;
		this.b.e = 5.0F;
		this.e.f = 0.9F;
		if (xb6.aM()) {
			this.h.d++;
			this.g.d += 2.0F;
			this.e.d++;
			this.f.d += -4.0F;
			this.f.e += 2.0F;
			this.e.f = (float) (Math.PI / 2);
			this.f.f = (float) (Math.PI / 2);
			this.i = 0;
		} else if (xb6.aN()) {
			this.f.d = this.e.d;
			this.f.e += 2.0F;
			this.e.f = (float) (Math.PI / 2);
			this.f.f = (float) (Math.PI / 2);
			this.i = 2;
		} else if (xb6.dj()) {
			this.h.f = (float) (Math.PI / 4);
			this.h.d += -4.0F;
			this.h.e += 5.0F;
			this.g.d += -3.3F;
			this.g.e++;
			this.e.d += 8.0F;
			this.e.e += -2.0F;
			this.f.d += 2.0F;
			this.f.e += -0.8F;
			this.e.f = 1.7278761F;
			this.f.f = 2.670354F;
			this.c.f = (float) (-Math.PI / 20);
			this.c.d = 15.8F;
			this.c.e = -7.0F;
			this.d.f = (float) (-Math.PI / 20);
			this.d.d = 15.8F;
			this.d.e = -7.0F;
			this.a.f = (float) (-Math.PI / 2);
			this.a.d = 21.0F;
			this.a.e = 1.0F;
			this.b.f = (float) (-Math.PI / 2);
			this.b.d = 21.0F;
			this.b.e = 1.0F;
			this.i = 3;
		} else {
			this.i = 1;
		}
	}
}

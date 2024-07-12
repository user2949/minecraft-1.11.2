public class bkw extends blv {
	private final bni a;
	private final bni b;
	private final bni c;
	private final bni d;
	private final bni e;
	private final bni f;

	public bkw() {
		this.s = 64;
		this.t = 64;
		this.a = new bni(this, 0, 0);
		this.a.a(-3.0F, -3.0F, -3.0F, 6, 6, 6);
		bni bni2 = new bni(this, 24, 0);
		bni2.a(-4.0F, -6.0F, -2.0F, 3, 4, 1);
		this.a.a(bni2);
		bni bni3 = new bni(this, 24, 0);
		bni3.i = true;
		bni3.a(1.0F, -6.0F, -2.0F, 3, 4, 1);
		this.a.a(bni3);
		this.b = new bni(this, 0, 16);
		this.b.a(-3.0F, 4.0F, -3.0F, 6, 12, 6);
		this.b.a(0, 34).a(-5.0F, 16.0F, 0.0F, 10, 6, 1);
		this.c = new bni(this, 42, 0);
		this.c.a(-12.0F, 1.0F, 1.5F, 10, 16, 1);
		this.e = new bni(this, 24, 16);
		this.e.a(-12.0F, 1.0F, 1.5F);
		this.e.a(-8.0F, 1.0F, 0.0F, 8, 12, 1);
		this.d = new bni(this, 42, 0);
		this.d.i = true;
		this.d.a(2.0F, 1.0F, 1.5F, 10, 16, 1);
		this.f = new bni(this, 24, 16);
		this.f.i = true;
		this.f.a(12.0F, 1.0F, 1.5F);
		this.f.a(0.0F, 1.0F, 0.0F, 8, 12, 1);
		this.b.a(this.c);
		this.b.a(this.d);
		this.c.a(this.e);
		this.d.a(this.f);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.a.a(float7);
		this.b.a(float7);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		if (((wu)sn).o()) {
			this.a.f = float5 * (float) (Math.PI / 180.0);
			this.a.g = (float) Math.PI - float4 * (float) (Math.PI / 180.0);
			this.a.h = (float) Math.PI;
			this.a.a(0.0F, -2.0F, 0.0F);
			this.c.a(-3.0F, 0.0F, 3.0F);
			this.d.a(3.0F, 0.0F, 3.0F);
			this.b.f = (float) Math.PI;
			this.c.f = (float) (-Math.PI / 20);
			this.c.g = (float) (-Math.PI * 2.0 / 5.0);
			this.e.g = -1.7278761F;
			this.d.f = this.c.f;
			this.d.g = -this.c.g;
			this.f.g = -this.e.g;
		} else {
			this.a.f = float5 * (float) (Math.PI / 180.0);
			this.a.g = float4 * (float) (Math.PI / 180.0);
			this.a.h = 0.0F;
			this.a.a(0.0F, 0.0F, 0.0F);
			this.c.a(0.0F, 0.0F, 0.0F);
			this.d.a(0.0F, 0.0F, 0.0F);
			this.b.f = (float) (Math.PI / 4) + ot.b(float3 * 0.1F) * 0.15F;
			this.b.g = 0.0F;
			this.c.g = ot.b(float3 * 1.3F) * (float) Math.PI * 0.25F;
			this.d.g = -this.c.g;
			this.e.g = this.c.g * 0.5F;
			this.f.g = -this.c.g * 0.5F;
		}
	}
}

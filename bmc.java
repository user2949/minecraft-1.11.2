public class bmc extends blv {
	private final bni a;
	private final bni b;
	private final bni c;
	private final bni d;
	private final bni e;
	private final bni f;
	private final bni g;
	private final bni h;
	private final bni i;
	private final bni j;
	private final bni k;
	private final bni l;
	private float m;

	public bmc() {
		this.a("head.main", 0, 0);
		this.a("head.nose", 0, 24);
		this.a("head.ear1", 0, 10);
		this.a("head.ear2", 6, 10);
		this.a = new bni(this, 26, 24);
		this.a.a(-1.0F, 5.5F, -3.7F, 2, 1, 7);
		this.a.a(3.0F, 17.5F, 3.7F);
		this.a.i = true;
		this.a(this.a, 0.0F, 0.0F, 0.0F);
		this.b = new bni(this, 8, 24);
		this.b.a(-1.0F, 5.5F, -3.7F, 2, 1, 7);
		this.b.a(-3.0F, 17.5F, 3.7F);
		this.b.i = true;
		this.a(this.b, 0.0F, 0.0F, 0.0F);
		this.c = new bni(this, 30, 15);
		this.c.a(-1.0F, 0.0F, 0.0F, 2, 4, 5);
		this.c.a(3.0F, 17.5F, 3.7F);
		this.c.i = true;
		this.a(this.c, (float) (-Math.PI / 9), 0.0F, 0.0F);
		this.d = new bni(this, 16, 15);
		this.d.a(-1.0F, 0.0F, 0.0F, 2, 4, 5);
		this.d.a(-3.0F, 17.5F, 3.7F);
		this.d.i = true;
		this.a(this.d, (float) (-Math.PI / 9), 0.0F, 0.0F);
		this.e = new bni(this, 0, 0);
		this.e.a(-3.0F, -2.0F, -10.0F, 6, 5, 10);
		this.e.a(0.0F, 19.0F, 8.0F);
		this.e.i = true;
		this.a(this.e, (float) (-Math.PI / 9), 0.0F, 0.0F);
		this.f = new bni(this, 8, 15);
		this.f.a(-1.0F, 0.0F, -1.0F, 2, 7, 2);
		this.f.a(3.0F, 17.0F, -1.0F);
		this.f.i = true;
		this.a(this.f, (float) (-Math.PI / 18), 0.0F, 0.0F);
		this.g = new bni(this, 0, 15);
		this.g.a(-1.0F, 0.0F, -1.0F, 2, 7, 2);
		this.g.a(-3.0F, 17.0F, -1.0F);
		this.g.i = true;
		this.a(this.g, (float) (-Math.PI / 18), 0.0F, 0.0F);
		this.h = new bni(this, 32, 0);
		this.h.a(-2.5F, -4.0F, -5.0F, 5, 4, 5);
		this.h.a(0.0F, 16.0F, -1.0F);
		this.h.i = true;
		this.a(this.h, 0.0F, 0.0F, 0.0F);
		this.i = new bni(this, 52, 0);
		this.i.a(-2.5F, -9.0F, -1.0F, 2, 5, 1);
		this.i.a(0.0F, 16.0F, -1.0F);
		this.i.i = true;
		this.a(this.i, 0.0F, (float) (-Math.PI / 12), 0.0F);
		this.j = new bni(this, 58, 0);
		this.j.a(0.5F, -9.0F, -1.0F, 2, 5, 1);
		this.j.a(0.0F, 16.0F, -1.0F);
		this.j.i = true;
		this.a(this.j, 0.0F, (float) (Math.PI / 12), 0.0F);
		this.k = new bni(this, 52, 6);
		this.k.a(-1.5F, -1.5F, 0.0F, 3, 3, 2);
		this.k.a(0.0F, 20.0F, 7.0F);
		this.k.i = true;
		this.a(this.k, -0.3490659F, 0.0F, 0.0F);
		this.l = new bni(this, 32, 9);
		this.l.a(-0.5F, -2.5F, -5.5F, 1, 1, 1);
		this.l.a(0.0F, 16.0F, -1.0F);
		this.l.i = true;
		this.a(this.l, 0.0F, 0.0F, 0.0F);
	}

	private void a(bni bni, float float2, float float3, float float4) {
		bni.f = float2;
		bni.g = float3;
		bni.h = float4;
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		if (this.q) {
			float float9 = 1.5F;
			bqg.G();
			bqg.b(0.56666666F, 0.56666666F, 0.56666666F);
			bqg.c(0.0F, 22.0F * float7, 2.0F * float7);
			this.h.a(float7);
			this.j.a(float7);
			this.i.a(float7);
			this.l.a(float7);
			bqg.H();
			bqg.G();
			bqg.b(0.4F, 0.4F, 0.4F);
			bqg.c(0.0F, 36.0F * float7, 0.0F);
			this.a.a(float7);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
			this.e.a(float7);
			this.f.a(float7);
			this.g.a(float7);
			this.k.a(float7);
			bqg.H();
		} else {
			bqg.G();
			bqg.b(0.6F, 0.6F, 0.6F);
			bqg.c(0.0F, 16.0F * float7, 0.0F);
			this.a.a(float7);
			this.b.a(float7);
			this.c.a(float7);
			this.d.a(float7);
			this.e.a(float7);
			this.f.a(float7);
			this.g.a(float7);
			this.h.a(float7);
			this.i.a(float7);
			this.j.a(float7);
			this.k.a(float7);
			this.l.a(float7);
			bqg.H();
		}
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		float float9 = float3 - (float)sn.T;
		xe xe10 = (xe)sn;
		this.l.f = float5 * (float) (Math.PI / 180.0);
		this.h.f = float5 * (float) (Math.PI / 180.0);
		this.i.f = float5 * (float) (Math.PI / 180.0);
		this.j.f = float5 * (float) (Math.PI / 180.0);
		this.l.g = float4 * (float) (Math.PI / 180.0);
		this.h.g = float4 * (float) (Math.PI / 180.0);
		this.i.g = this.l.g - (float) (Math.PI / 12);
		this.j.g = this.l.g + (float) (Math.PI / 12);
		this.m = ot.a(xe10.r(float9) * (float) Math.PI);
		this.c.f = (this.m * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
		this.d.f = (this.m * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
		this.a.f = this.m * 50.0F * (float) (Math.PI / 180.0);
		this.b.f = this.m * 50.0F * (float) (Math.PI / 180.0);
		this.f.f = (this.m * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
		this.g.f = (this.m * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
	}

	@Override
	public void a(sw sw, float float2, float float3, float float4) {
		super.a(sw, float2, float3, float4);
		this.m = ot.a(((xe)sw).r(float4) * (float) Math.PI);
	}
}

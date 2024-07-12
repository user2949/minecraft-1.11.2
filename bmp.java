public class bmp extends blv {
	public bni a;
	public bni b;
	public bni c;
	public bni d;
	public bni e;
	public bni f;
	public bni g;
	public bni h;
	public bni i;
	public bni j;
	public bni k;

	public bmp() {
		float float2 = 0.0F;
		int integer3 = 15;
		this.a = new bni(this, 32, 4);
		this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
		this.a.a(0.0F, 15.0F, -3.0F);
		this.b = new bni(this, 0, 0);
		this.b.a(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
		this.b.a(0.0F, 15.0F, 0.0F);
		this.c = new bni(this, 0, 12);
		this.c.a(-5.0F, -4.0F, -6.0F, 10, 8, 12, 0.0F);
		this.c.a(0.0F, 15.0F, 9.0F);
		this.d = new bni(this, 18, 0);
		this.d.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
		this.d.a(-4.0F, 15.0F, 2.0F);
		this.e = new bni(this, 18, 0);
		this.e.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
		this.e.a(4.0F, 15.0F, 2.0F);
		this.f = new bni(this, 18, 0);
		this.f.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
		this.f.a(-4.0F, 15.0F, 1.0F);
		this.g = new bni(this, 18, 0);
		this.g.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
		this.g.a(4.0F, 15.0F, 1.0F);
		this.h = new bni(this, 18, 0);
		this.h.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
		this.h.a(-4.0F, 15.0F, 0.0F);
		this.i = new bni(this, 18, 0);
		this.i.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
		this.i.a(4.0F, 15.0F, 0.0F);
		this.j = new bni(this, 18, 0);
		this.j.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
		this.j.a(-4.0F, 15.0F, -1.0F);
		this.k = new bni(this, 18, 0);
		this.k.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
		this.k.a(4.0F, 15.0F, -1.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
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
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		this.a.g = float4 * (float) (Math.PI / 180.0);
		this.a.f = float5 * (float) (Math.PI / 180.0);
		float float9 = (float) (Math.PI / 4);
		this.d.h = (float) (-Math.PI / 4);
		this.e.h = (float) (Math.PI / 4);
		this.f.h = -0.58119464F;
		this.g.h = 0.58119464F;
		this.h.h = -0.58119464F;
		this.i.h = 0.58119464F;
		this.j.h = (float) (-Math.PI / 4);
		this.k.h = (float) (Math.PI / 4);
		float float10 = -0.0F;
		float float11 = (float) (Math.PI / 8);
		this.d.g = (float) (Math.PI / 4);
		this.e.g = (float) (-Math.PI / 4);
		this.f.g = (float) (Math.PI / 8);
		this.g.g = (float) (-Math.PI / 8);
		this.h.g = (float) (-Math.PI / 8);
		this.i.g = (float) (Math.PI / 8);
		this.j.g = (float) (-Math.PI / 4);
		this.k.g = (float) (Math.PI / 4);
		float float12 = -(ot.b(float1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * float2;
		float float13 = -(ot.b(float1 * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * float2;
		float float14 = -(ot.b(float1 * 0.6662F * 2.0F + (float) (Math.PI / 2)) * 0.4F) * float2;
		float float15 = -(ot.b(float1 * 0.6662F * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * float2;
		float float16 = Math.abs(ot.a(float1 * 0.6662F + 0.0F) * 0.4F) * float2;
		float float17 = Math.abs(ot.a(float1 * 0.6662F + (float) Math.PI) * 0.4F) * float2;
		float float18 = Math.abs(ot.a(float1 * 0.6662F + (float) (Math.PI / 2)) * 0.4F) * float2;
		float float19 = Math.abs(ot.a(float1 * 0.6662F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * float2;
		this.d.g += float12;
		this.e.g += -float12;
		this.f.g += float13;
		this.g.g += -float13;
		this.h.g += float14;
		this.i.g += -float14;
		this.j.g += float15;
		this.k.g += -float15;
		this.d.h += float16;
		this.e.h += -float16;
		this.f.h += float17;
		this.g.h += -float17;
		this.h.h += float18;
		this.i.h += -float18;
		this.j.h += float19;
		this.k.h += -float19;
	}
}

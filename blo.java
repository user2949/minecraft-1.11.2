public class blo extends blv {
	public bni a;
	public bni b;
	public bni c;
	public bni d;
	public bni e;
	public bni f;
	public bni g;
	public bni h;

	public blo(float float1, float float2, int integer3, int integer4) {
		this.a = new bni(this).b(integer3, integer4);
		this.a.a(0.0F, 0.0F + float2, 0.0F);
		this.a.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, float1);
		this.f = new bni(this).b(integer3, integer4);
		this.f.a(0.0F, float2 - 2.0F, 0.0F);
		this.f.a(24, 0).a(-1.0F, -1.0F, -6.0F, 2, 4, 2, float1);
		this.a.a(this.f);
		this.b = new bni(this).b(integer3, integer4);
		this.b.a(0.0F, 0.0F + float2, 0.0F);
		this.b.a(16, 20).a(-4.0F, 0.0F, -3.0F, 8, 12, 6, float1);
		this.b.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8, 18, 6, float1 + 0.5F);
		this.c = new bni(this).b(integer3, integer4);
		this.c.a(0.0F, 0.0F + float2 + 2.0F, 0.0F);
		this.c.a(44, 22).a(-8.0F, -2.0F, -2.0F, 4, 8, 4, float1);
		this.c.a(44, 22).a(4.0F, -2.0F, -2.0F, 4, 8, 4, float1);
		this.c.a(40, 38).a(-4.0F, 2.0F, -2.0F, 8, 4, 4, float1);
		this.d = new bni(this, 0, 22).b(integer3, integer4);
		this.d.a(-2.0F, 12.0F + float2, 0.0F);
		this.d.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1);
		this.e = new bni(this, 0, 22).b(integer3, integer4);
		this.e.i = true;
		this.e.a(2.0F, 12.0F + float2, 0.0F);
		this.e.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, float1);
		this.g = new bni(this, 40, 46).b(integer3, integer4);
		this.g.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, float1);
		this.g.a(-5.0F, 2.0F + float2, 0.0F);
		this.h = new bni(this, 40, 46).b(integer3, integer4);
		this.h.i = true;
		this.h.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, float1);
		this.h.a(5.0F, 2.0F + float2, 0.0F);
	}

	@Override
	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
		this.a(float2, float3, float4, float5, float6, float7, sn);
		this.a.a(float7);
		this.b.a(float7);
		this.d.a(float7);
		this.e.a(float7);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		this.a.g = float4 * (float) (Math.PI / 180.0);
		this.a.f = float5 * (float) (Math.PI / 180.0);
		this.c.d = 3.0F;
		this.c.e = -1.0F;
		this.c.f = -0.75F;
		this.d.f = ot.b(float1 * 0.6662F) * 1.4F * float2 * 0.5F;
		this.e.f = ot.b(float1 * 0.6662F + (float) Math.PI) * 1.4F * float2 * 0.5F;
		this.d.g = 0.0F;
		this.e.g = 0.0F;
	}

	public bni a(sv sv) {
		return sv == sv.LEFT ? this.h : this.g;
	}
}

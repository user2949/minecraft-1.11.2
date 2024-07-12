public class bmy extends bmv {
	public boolean g;
	private final bni h = new bni(this).b(64, 128);
	private final bni i;

	public bmy(float float1) {
		super(float1, 0.0F, 64, 128);
		this.h.a(0.0F, -2.0F, 0.0F);
		this.h.a(0, 0).a(0.0F, 3.0F, -6.75F, 1, 1, 1, -0.25F);
		this.f.a(this.h);
		this.i = new bni(this).b(64, 128);
		this.i.a(-5.0F, -10.03125F, -5.0F);
		this.i.a(0, 64).a(0.0F, 0.0F, 0.0F, 10, 2, 10);
		this.a.a(this.i);
		bni bni3 = new bni(this).b(64, 128);
		bni3.a(1.75F, -4.0F, 2.0F);
		bni3.a(0, 76).a(0.0F, 0.0F, 0.0F, 7, 4, 7);
		bni3.f = -0.05235988F;
		bni3.h = 0.02617994F;
		this.i.a(bni3);
		bni bni4 = new bni(this).b(64, 128);
		bni4.a(1.75F, -4.0F, 2.0F);
		bni4.a(0, 87).a(0.0F, 0.0F, 0.0F, 4, 4, 4);
		bni4.f = -0.10471976F;
		bni4.h = 0.05235988F;
		bni3.a(bni4);
		bni bni5 = new bni(this).b(64, 128);
		bni5.a(1.75F, -2.0F, 2.0F);
		bni5.a(0, 95).a(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
		bni5.f = (float) (-Math.PI / 15);
		bni5.h = 0.10471976F;
		bni4.a(bni5);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		super.a(float1, float2, float3, float4, float5, float6, sn);
		this.f.o = 0.0F;
		this.f.p = 0.0F;
		this.f.q = 0.0F;
		float float9 = 0.01F * (float)(sn.O() % 10);
		this.f.f = ot.a((float)sn.T * float9) * 4.5F * (float) (Math.PI / 180.0);
		this.f.g = 0.0F;
		this.f.h = ot.b((float)sn.T * float9) * 2.5F * (float) (Math.PI / 180.0);
		if (this.g) {
			this.f.f = -0.9F;
			this.f.q = -0.09375F;
			this.f.p = 0.1875F;
		}
	}
}

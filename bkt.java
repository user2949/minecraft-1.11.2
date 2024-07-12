public class bkt extends bln {
	public bkt() {
		this(0.0F);
	}

	public bkt(float float1) {
		this(float1, 64, 32);
	}

	protected bkt(float float1, int integer2, int integer3) {
		super(float1, 0.0F, integer2, integer3);
	}

	@Override
	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
		if (sn instanceof yx) {
			yx yx9 = (yx)sn;
			this.e.f = (float) (Math.PI / 180.0) * yx9.u().b();
			this.e.g = (float) (Math.PI / 180.0) * yx9.u().c();
			this.e.h = (float) (Math.PI / 180.0) * yx9.u().d();
			this.e.a(0.0F, 1.0F, 0.0F);
			this.g.f = (float) (Math.PI / 180.0) * yx9.w().b();
			this.g.g = (float) (Math.PI / 180.0) * yx9.w().c();
			this.g.h = (float) (Math.PI / 180.0) * yx9.w().d();
			this.i.f = (float) (Math.PI / 180.0) * yx9.x().b();
			this.i.g = (float) (Math.PI / 180.0) * yx9.x().c();
			this.i.h = (float) (Math.PI / 180.0) * yx9.x().d();
			this.h.f = (float) (Math.PI / 180.0) * yx9.y().b();
			this.h.g = (float) (Math.PI / 180.0) * yx9.y().c();
			this.h.h = (float) (Math.PI / 180.0) * yx9.y().d();
			this.k.f = (float) (Math.PI / 180.0) * yx9.z().b();
			this.k.g = (float) (Math.PI / 180.0) * yx9.z().c();
			this.k.h = (float) (Math.PI / 180.0) * yx9.z().d();
			this.k.a(1.9F, 11.0F, 0.0F);
			this.j.f = (float) (Math.PI / 180.0) * yx9.A().b();
			this.j.g = (float) (Math.PI / 180.0) * yx9.A().c();
			this.j.h = (float) (Math.PI / 180.0) * yx9.A().d();
			this.j.a(-1.9F, 11.0F, 0.0F);
			a(this.e, this.f);
		}
	}
}

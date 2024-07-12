public class bux extends bus<abf> {
	private final float a;

	public bux(bur bur, float float2) {
		super(bur);
		this.a = float2;
	}

	public void a(abf abf, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		this.d(abf);
		bqg.c((float)double2, (float)double3, (float)double4);
		bqg.D();
		bqg.b(this.a, this.a, this.a);
		byz byz11 = bes.z().ad().a().a(afl.bW);
		bqs bqs12 = bqs.a();
		bpy bpy13 = bqs12.c();
		float float14 = byz11.e();
		float float15 = byz11.f();
		float float16 = byz11.g();
		float float17 = byz11.h();
		float float18 = 1.0F;
		float float19 = 0.5F;
		float float20 = 0.25F;
		bqg.b(180.0F - this.b.e, 0.0F, 1.0F, 0.0F);
		bqg.b((float)(this.b.g.as == 2 ? -1 : 1) * -this.b.f, 1.0F, 0.0F, 0.0F);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(abf));
		}

		bpy13.a(7, bzh.j);
		bpy13.b(-0.5, -0.25, 0.0).a((double)float14, (double)float17).c(0.0F, 1.0F, 0.0F).d();
		bpy13.b(0.5, -0.25, 0.0).a((double)float15, (double)float17).c(0.0F, 1.0F, 0.0F).d();
		bpy13.b(0.5, 0.75, 0.0).a((double)float15, (double)float16).c(0.0F, 1.0F, 0.0F).d();
		bpy13.b(-0.5, 0.75, 0.0).a((double)float14, (double)float16).c(0.0F, 1.0F, 0.0F).d();
		bqs12.b();
		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.E();
		bqg.H();
		super.a(abf, double2, double3, double4, float5, float6);
	}

	protected kq a(abf abf) {
		return byy.g;
	}
}

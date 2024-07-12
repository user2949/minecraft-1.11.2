public class bvj extends bus<za> {
	private static final kq a = new kq("textures/entity/lead_knot.png");
	private final blr f = new blr();

	public bvj(bur bur) {
		super(bur);
	}

	public void a(za za, double double2, double double3, double double4, float float5, float float6) {
		bqg.G();
		bqg.r();
		bqg.c((float)double2, (float)double3, (float)double4);
		float float11 = 0.0625F;
		bqg.D();
		bqg.b(-1.0F, -1.0F, 1.0F);
		bqg.e();
		this.d(za);
		if (this.e) {
			bqg.h();
			bqg.e(this.c(za));
		}

		this.f.a(za, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.H();
		super.a(za, double2, double3, double4, float5, float6);
	}

	protected kq a(za za) {
		return a;
	}
}

public class bun extends bus<ya> {
	private static final kq a = new kq("textures/entity/endercrystal/endercrystal.png");
	private final blv f = new bne(0.0F, true);
	private final blv g = new bne(0.0F, false);

	public bun(bur bur) {
		super(bur);
		this.c = 0.5F;
	}

	public void a(ya ya, double double2, double double3, double double4, float float5, float float6) {
		float float11 = (float)ya.a + float6;
		bqg.G();
		bqg.c((float)double2, (float)double3, (float)double4);
		this.a(a);
		float float12 = ot.a(float11 * 0.2F) / 2.0F + 0.5F;
		float12 = float12 * float12 + float12;
		if (this.e) {
			bqg.h();
			bqg.e(this.c(ya));
		}

		if (ya.k()) {
			this.f.a(ya, 0.0F, float11 * 3.0F, float12 * 0.2F, 0.0F, 0.0F, 0.0625F);
		} else {
			this.g.a(ya, 0.0F, float11 * 3.0F, float12 * 0.2F, 0.0F, 0.0F, 0.0625F);
		}

		if (this.e) {
			bqg.n();
			bqg.i();
		}

		bqg.H();
		co co13 = ya.j();
		if (co13 != null) {
			this.a(buo.a);
			float float14 = (float)co13.p() + 0.5F;
			float float15 = (float)co13.q() + 0.5F;
			float float16 = (float)co13.r() + 0.5F;
			double double17 = (double)float14 - ya.p;
			double double19 = (double)float15 - ya.q;
			double double21 = (double)float16 - ya.r;
			buo.a(
				double2 + double17,
				double3 - 0.3 + (double)(float12 * 0.4F) + double19,
				double4 + double21,
				float6,
				(double)float14,
				(double)float15,
				(double)float16,
				ya.a,
				ya.p,
				ya.q,
				ya.r
			);
		}

		super.a(ya, double2, double3, double4, float5, float6);
	}

	protected kq a(ya ya) {
		return a;
	}

	public boolean a(ya ya, btl btl, double double3, double double4, double double5) {
		return super.a(ya, btl, double3, double4, double5) || ya.j() != null;
	}
}

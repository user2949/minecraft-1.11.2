public class but extends bus<abd> {
	private static final kq a = new kq("textures/entity/illager/fangs.png");
	private final blh f = new blh();

	public but(bur bur) {
		super(bur);
	}

	public void a(abd abd, double double2, double double3, double double4, float float5, float float6) {
		float float11 = abd.a(float6);
		if (float11 != 0.0F) {
			float float12 = 2.0F;
			if (float11 > 0.9F) {
				float12 = (float)((double)float12 * ((1.0 - (double)float11) / 0.1F));
			}

			bqg.G();
			bqg.r();
			bqg.e();
			this.d(abd);
			bqg.c((float)double2, (float)double3, (float)double4);
			bqg.b(90.0F - abd.v, 0.0F, 1.0F, 0.0F);
			bqg.b(-float12, -float12, float12);
			float float13 = 0.03125F;
			bqg.c(0.0F, -0.626F, 0.0F);
			this.f.a(abd, float11, 0.0F, 0.0F, abd.v, abd.w, 0.03125F);
			bqg.H();
			bqg.q();
			super.a(abd, double2, double3, double4, float5, float6);
		}
	}

	protected kq a(abd abd) {
		return a;
	}
}

public class bww extends bvq<xk> {
	private static final kq a = new kq("textures/entity/wolf/wolf.png");
	private static final kq j = new kq("textures/entity/wolf/wolf_tame.png");
	private static final kq k = new kq("textures/entity/wolf/wolf_angry.png");

	public bww(bur bur) {
		super(bur, new bna(), 0.5F);
		this.a(new bxz(this));
	}

	protected float b(xk xk, float float2) {
		return xk.dq();
	}

	public void a(xk xk, double double2, double double3, double double4, float float5, float float6) {
		if (xk.dp()) {
			float float11 = xk.e(float6) * xk.r(float6);
			bqg.d(float11, float11, float11);
		}

		super.a(xk, double2, double3, double4, float5, float6);
	}

	protected kq a(xk xk) {
		if (xk.dh()) {
			return j;
		} else {
			return xk.dr() ? k : a;
		}
	}
}

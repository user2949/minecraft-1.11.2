public class bso extends bsl<asl> {
	private static final kq a = new kq("textures/entity/chest/ender.png");
	private final bla d = new bla();

	public void a(asl asl, double double2, double double3, double double4, float float5, int integer) {
		int integer11 = 0;
		if (asl.u()) {
			integer11 = asl.v();
		}

		if (integer >= 0) {
			this.a(b[integer]);
			bqg.n(5890);
			bqg.G();
			bqg.b(4.0F, 4.0F, 1.0F);
			bqg.c(0.0625F, 0.0625F, 0.0625F);
			bqg.n(5888);
		} else {
			this.a(a);
		}

		bqg.G();
		bqg.D();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.c((float)double2, (float)double3 + 1.0F, (float)double4 + 1.0F);
		bqg.b(1.0F, -1.0F, -1.0F);
		bqg.c(0.5F, 0.5F, 0.5F);
		int integer12 = 0;
		if (integer11 == 2) {
			integer12 = 180;
		}

		if (integer11 == 3) {
			integer12 = 0;
		}

		if (integer11 == 4) {
			integer12 = 90;
		}

		if (integer11 == 5) {
			integer12 = -90;
		}

		bqg.b((float)integer12, 0.0F, 1.0F, 0.0F);
		bqg.c(-0.5F, -0.5F, -0.5F);
		float float13 = asl.f + (asl.a - asl.f) * float5;
		float13 = 1.0F - float13;
		float13 = 1.0F - float13 * float13 * float13;
		this.d.a.f = -(float13 * (float) (Math.PI / 2));
		this.d.a();
		bqg.E();
		bqg.H();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		if (integer >= 0) {
			bqg.n(5890);
			bqg.H();
			bqg.n(5888);
		}
	}
}

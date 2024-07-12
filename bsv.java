public class bsv extends bsw {
	private static final kq a = new kq("textures/entity/end_gateway_beam.png");

	@Override
	public void a(asz asz, double double2, double double3, double double4, float float5, int integer) {
		bqg.p();
		asy asy11 = (asy)asz;
		if (asy11.a() || asy11.e()) {
			bqg.a(516, 0.1F);
			this.a(a);
			float float12 = asy11.a() ? asy11.a(float5) : asy11.b(float5);
			double double13 = asy11.a() ? 256.0 - double3 : 50.0;
			float12 = ot.a(float12 * (float) Math.PI);
			int integer15 = ot.c((double)float12 * double13);
			float[] arr16 = xf.a(asy11.a() ? aem.MAGENTA : aem.PURPLE);
			bsj.a(double2, double3, double4, (double)float5, (double)float12, (double)asy11.D().P(), 0, integer15, arr16, 0.15, 0.175);
			bsj.a(double2, double3, double4, (double)float5, (double)float12, (double)asy11.D().P(), 0, -integer15, arr16, 0.15, 0.175);
		}

		super.a(asz, double2, double3, double4, float5, integer);
		bqg.o();
	}

	@Override
	protected int a(double double1) {
		return super.a(double1) + 1;
	}

	@Override
	protected float c() {
		return 1.0F;
	}
}

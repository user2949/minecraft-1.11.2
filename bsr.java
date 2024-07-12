public class bsr extends bsl<asu> {
	private final bmh a;

	public bsr(bmh bmh) {
		this.a = bmh;
	}

	public void a(asu asu, double double2, double double3, double double4, float float5, int integer) {
		cv cv11 = cv.UP;
		if (asu.u()) {
			atl atl12 = this.a().o(asu.w());
			if (atl12.v() instanceof aqn) {
				cv11 = atl12.c(aqn.a);
			}
		}

		bqg.k();
		bqg.c(515);
		bqg.a(true);
		bqg.r();
		if (integer >= 0) {
			this.a(b[integer]);
			bqg.n(5890);
			bqg.G();
			bqg.b(4.0F, 4.0F, 1.0F);
			bqg.c(0.0625F, 0.0625F, 0.0625F);
			bqg.n(5888);
		} else {
			this.a(bwa.a[asu.s().a()]);
		}

		bqg.G();
		bqg.D();
		if (integer < 0) {
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		}

		bqg.c((float)double2 + 0.5F, (float)double3 + 1.5F, (float)double4 + 0.5F);
		bqg.b(1.0F, -1.0F, -1.0F);
		bqg.c(0.0F, 1.0F, 0.0F);
		float float12 = 0.9995F;
		bqg.b(0.9995F, 0.9995F, 0.9995F);
		bqg.c(0.0F, -1.0F, 0.0F);
		switch (cv11) {
			case DOWN:
				bqg.c(0.0F, 2.0F, 0.0F);
				bqg.b(180.0F, 1.0F, 0.0F, 0.0F);
			case UP:
			default:
				break;
			case NORTH:
				bqg.c(0.0F, 1.0F, 1.0F);
				bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(180.0F, 0.0F, 0.0F, 1.0F);
				break;
			case SOUTH:
				bqg.c(0.0F, 1.0F, -1.0F);
				bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
				break;
			case WEST:
				bqg.c(-1.0F, 1.0F, 0.0F);
				bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(-90.0F, 0.0F, 0.0F, 1.0F);
				break;
			case EAST:
				bqg.c(1.0F, 1.0F, 0.0F);
				bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(90.0F, 0.0F, 0.0F, 1.0F);
		}

		this.a.a.a(0.0625F);
		bqg.c(0.0F, -asu.a(float5) * 0.5F, 0.0F);
		bqg.b(270.0F * asu.a(float5), 0.0F, 1.0F, 0.0F);
		this.a.b.a(0.0625F);
		bqg.q();
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

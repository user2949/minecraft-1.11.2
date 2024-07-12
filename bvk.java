import java.util.Random;
import javax.annotation.Nullable;

public class bvk extends bus<zg> {
	public bvk(bur bur) {
		super(bur);
	}

	public void a(zg zg, double double2, double double3, double double4, float float5, float float6) {
		bqs bqs11 = bqs.a();
		bpy bpy12 = bqs11.c();
		bqg.z();
		bqg.g();
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE);
		double[] arr13 = new double[8];
		double[] arr14 = new double[8];
		double double15 = 0.0;
		double double17 = 0.0;
		Random random19 = new Random(zg.a);

		for (int integer20 = 7; integer20 >= 0; integer20--) {
			arr13[integer20] = double15;
			arr14[integer20] = double17;
			double15 += (double)(random19.nextInt(11) - 5);
			double17 += (double)(random19.nextInt(11) - 5);
		}

		for (int integer19 = 0; integer19 < 4; integer19++) {
			Random random20 = new Random(zg.a);

			for (int integer21 = 0; integer21 < 3; integer21++) {
				int integer22 = 7;
				int integer23 = 0;
				if (integer21 > 0) {
					integer22 = 7 - integer21;
				}

				if (integer21 > 0) {
					integer23 = integer22 - 2;
				}

				double double24 = arr13[integer22] - double15;
				double double26 = arr14[integer22] - double17;

				for (int integer28 = integer22; integer28 >= integer23; integer28--) {
					double double29 = double24;
					double double31 = double26;
					if (integer21 == 0) {
						double24 += (double)(random20.nextInt(11) - 5);
						double26 += (double)(random20.nextInt(11) - 5);
					} else {
						double24 += (double)(random20.nextInt(31) - 15);
						double26 += (double)(random20.nextInt(31) - 15);
					}

					bpy12.a(5, bzh.f);
					float float33 = 0.5F;
					float float34 = 0.45F;
					float float35 = 0.45F;
					float float36 = 0.5F;
					double double37 = 0.1 + (double)integer19 * 0.2;
					if (integer21 == 0) {
						double37 *= (double)integer28 * 0.1 + 1.0;
					}

					double double39 = 0.1 + (double)integer19 * 0.2;
					if (integer21 == 0) {
						double39 *= (double)(integer28 - 1) * 0.1 + 1.0;
					}

					for (int integer41 = 0; integer41 < 5; integer41++) {
						double double42 = double2 + 0.5 - double37;
						double double44 = double4 + 0.5 - double37;
						if (integer41 == 1 || integer41 == 2) {
							double42 += double37 * 2.0;
						}

						if (integer41 == 2 || integer41 == 3) {
							double44 += double37 * 2.0;
						}

						double double46 = double2 + 0.5 - double39;
						double double48 = double4 + 0.5 - double39;
						if (integer41 == 1 || integer41 == 2) {
							double46 += double39 * 2.0;
						}

						if (integer41 == 2 || integer41 == 3) {
							double48 += double39 * 2.0;
						}

						bpy12.b(double46 + double24, double3 + (double)(integer28 * 16), double48 + double26).a(0.45F, 0.45F, 0.5F, 0.3F).d();
						bpy12.b(double42 + double29, double3 + (double)((integer28 + 1) * 16), double44 + double31).a(0.45F, 0.45F, 0.5F, 0.3F).d();
					}

					bqs11.b();
				}
			}
		}

		bqg.l();
		bqg.f();
		bqg.y();
	}

	@Nullable
	protected kq a(zg zg) {
		return null;
	}
}

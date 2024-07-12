import java.util.Random;

public class azh extends azn {
	private final int[] d = new int[512];
	public double a;
	public double b;
	public double c;
	private static final double[] e = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
	private static final double[] f = new double[]{1.0, 1.0, -1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0};
	private static final double[] g = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
	private static final double[] h = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
	private static final double[] i = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};

	public azh() {
		this(new Random());
	}

	public azh(Random random) {
		this.a = random.nextDouble() * 256.0;
		this.b = random.nextDouble() * 256.0;
		this.c = random.nextDouble() * 256.0;
		int integer3 = 0;

		while (integer3 < 256) {
			this.d[integer3] = integer3++;
		}

		for (int integer3x = 0; integer3x < 256; integer3x++) {
			int integer4 = random.nextInt(256 - integer3x) + integer3x;
			int integer5 = this.d[integer3x];
			this.d[integer3x] = this.d[integer4];
			this.d[integer4] = integer5;
			this.d[integer3x + 256] = this.d[integer3x];
		}
	}

	public final double b(double double1, double double2, double double3) {
		return double2 + double1 * (double3 - double2);
	}

	public final double a(int integer, double double2, double double3) {
		int integer7 = integer & 15;
		return h[integer7] * double2 + i[integer7] * double3;
	}

	public final double a(int integer, double double2, double double3, double double4) {
		int integer9 = integer & 15;
		return e[integer9] * double2 + f[integer9] * double3 + g[integer9] * double4;
	}

	public void a(
		double[] arr,
		double double2,
		double double3,
		double double4,
		int integer5,
		int integer6,
		int integer7,
		double double8,
		double double9,
		double double10,
		double double11
	) {
		if (integer6 == 1) {
			int integer20 = 0;
			int integer21 = 0;
			int integer22 = 0;
			int integer23 = 0;
			double double24 = 0.0;
			double double26 = 0.0;
			int integer28 = 0;
			double double29 = 1.0 / double11;

			for (int integer31 = 0; integer31 < integer5; integer31++) {
				double double32 = double2 + (double)integer31 * double8 + this.a;
				int integer34 = (int)double32;
				if (double32 < (double)integer34) {
					integer34--;
				}

				int integer35 = integer34 & 0xFF;
				double32 -= (double)integer34;
				double double36 = double32 * double32 * double32 * (double32 * (double32 * 6.0 - 15.0) + 10.0);

				for (int integer38 = 0; integer38 < integer7; integer38++) {
					double double39 = double4 + (double)integer38 * double10 + this.c;
					int integer41 = (int)double39;
					if (double39 < (double)integer41) {
						integer41--;
					}

					int integer42 = integer41 & 0xFF;
					double39 -= (double)integer41;
					double double43 = double39 * double39 * double39 * (double39 * (double39 * 6.0 - 15.0) + 10.0);
					integer20 = this.d[integer35] + 0;
					integer21 = this.d[integer20] + integer42;
					integer22 = this.d[integer35 + 1] + 0;
					integer23 = this.d[integer22] + integer42;
					double24 = this.b(double36, this.a(this.d[integer21], double32, double39), this.a(this.d[integer23], double32 - 1.0, 0.0, double39));
					double26 = this.b(
						double36, this.a(this.d[integer21 + 1], double32, 0.0, double39 - 1.0), this.a(this.d[integer23 + 1], double32 - 1.0, 0.0, double39 - 1.0)
					);
					double double45 = this.b(double43, double24, double26);
					arr[integer28++] += double45 * double29;
				}
			}
		} else {
			int integer20 = 0;
			double double21 = 1.0 / double11;
			int integer23 = -1;
			int integer24 = 0;
			int integer25 = 0;
			int integer26 = 0;
			int integer27 = 0;
			int integer28 = 0;
			int integer29 = 0;
			double double30 = 0.0;
			double double32 = 0.0;
			double double34 = 0.0;
			double double36 = 0.0;

			for (int integer38 = 0; integer38 < integer5; integer38++) {
				double double39 = double2 + (double)integer38 * double8 + this.a;
				int integer41 = (int)double39;
				if (double39 < (double)integer41) {
					integer41--;
				}

				int integer42 = integer41 & 0xFF;
				double39 -= (double)integer41;
				double double43 = double39 * double39 * double39 * (double39 * (double39 * 6.0 - 15.0) + 10.0);

				for (int integer45 = 0; integer45 < integer7; integer45++) {
					double double46 = double4 + (double)integer45 * double10 + this.c;
					int integer48 = (int)double46;
					if (double46 < (double)integer48) {
						integer48--;
					}

					int integer49 = integer48 & 0xFF;
					double46 -= (double)integer48;
					double double50 = double46 * double46 * double46 * (double46 * (double46 * 6.0 - 15.0) + 10.0);

					for (int integer52 = 0; integer52 < integer6; integer52++) {
						double double53 = double3 + (double)integer52 * double9 + this.b;
						int integer55 = (int)double53;
						if (double53 < (double)integer55) {
							integer55--;
						}

						int integer56 = integer55 & 0xFF;
						double53 -= (double)integer55;
						double double57 = double53 * double53 * double53 * (double53 * (double53 * 6.0 - 15.0) + 10.0);
						if (integer52 == 0 || integer56 != integer23) {
							integer23 = integer56;
							integer24 = this.d[integer42] + integer56;
							integer25 = this.d[integer24] + integer49;
							integer26 = this.d[integer24 + 1] + integer49;
							integer27 = this.d[integer42 + 1] + integer56;
							integer28 = this.d[integer27] + integer49;
							integer29 = this.d[integer27 + 1] + integer49;
							double30 = this.b(double43, this.a(this.d[integer25], double39, double53, double46), this.a(this.d[integer28], double39 - 1.0, double53, double46));
							double32 = this.b(
								double43, this.a(this.d[integer26], double39, double53 - 1.0, double46), this.a(this.d[integer29], double39 - 1.0, double53 - 1.0, double46)
							);
							double34 = this.b(
								double43, this.a(this.d[integer25 + 1], double39, double53, double46 - 1.0), this.a(this.d[integer28 + 1], double39 - 1.0, double53, double46 - 1.0)
							);
							double36 = this.b(
								double43,
								this.a(this.d[integer26 + 1], double39, double53 - 1.0, double46 - 1.0),
								this.a(this.d[integer29 + 1], double39 - 1.0, double53 - 1.0, double46 - 1.0)
							);
						}

						double double59 = this.b(double57, double30, double32);
						double double61 = this.b(double57, double34, double36);
						double double63 = this.b(double50, double59, double61);
						arr[integer20++] += double63 * double21;
					}
				}
			}
		}
	}
}

import java.util.Random;

public class azm {
	private static final int[][] e = new int[][]{
		{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}
	};
	public static final double a = Math.sqrt(3.0);
	private final int[] f = new int[512];
	public double b;
	public double c;
	public double d;
	private static final double g = 0.5 * (a - 1.0);
	private static final double h = (3.0 - a) / 6.0;

	public azm() {
		this(new Random());
	}

	public azm(Random random) {
		this.b = random.nextDouble() * 256.0;
		this.c = random.nextDouble() * 256.0;
		this.d = random.nextDouble() * 256.0;
		int integer3 = 0;

		while (integer3 < 256) {
			this.f[integer3] = integer3++;
		}

		for (int integer3x = 0; integer3x < 256; integer3x++) {
			int integer4 = random.nextInt(256 - integer3x) + integer3x;
			int integer5 = this.f[integer3x];
			this.f[integer3x] = this.f[integer4];
			this.f[integer4] = integer5;
			this.f[integer3x + 256] = this.f[integer3x];
		}
	}

	private static int a(double double1) {
		return double1 > 0.0 ? (int)double1 : (int)double1 - 1;
	}

	private static double a(int[] arr, double double2, double double3) {
		return (double)arr[0] * double2 + (double)arr[1] * double3;
	}

	public double a(double double1, double double2) {
		double double12 = 0.5 * (a - 1.0);
		double double14 = (double1 + double2) * double12;
		int integer16 = a(double1 + double14);
		int integer17 = a(double2 + double14);
		double double18 = (3.0 - a) / 6.0;
		double double20 = (double)(integer16 + integer17) * double18;
		double double22 = (double)integer16 - double20;
		double double24 = (double)integer17 - double20;
		double double26 = double1 - double22;
		double double28 = double2 - double24;
		int integer30;
		int integer31;
		if (double26 > double28) {
			integer30 = 1;
			integer31 = 0;
		} else {
			integer30 = 0;
			integer31 = 1;
		}

		double double32 = double26 - (double)integer30 + double18;
		double double34 = double28 - (double)integer31 + double18;
		double double36 = double26 - 1.0 + 2.0 * double18;
		double double38 = double28 - 1.0 + 2.0 * double18;
		int integer40 = integer16 & 0xFF;
		int integer41 = integer17 & 0xFF;
		int integer42 = this.f[integer40 + this.f[integer41]] % 12;
		int integer43 = this.f[integer40 + integer30 + this.f[integer41 + integer31]] % 12;
		int integer44 = this.f[integer40 + 1 + this.f[integer41 + 1]] % 12;
		double double45 = 0.5 - double26 * double26 - double28 * double28;
		double double6;
		if (double45 < 0.0) {
			double6 = 0.0;
		} else {
			double45 *= double45;
			double6 = double45 * double45 * a(e[integer42], double26, double28);
		}

		double double47 = 0.5 - double32 * double32 - double34 * double34;
		double double8;
		if (double47 < 0.0) {
			double8 = 0.0;
		} else {
			double47 *= double47;
			double8 = double47 * double47 * a(e[integer43], double32, double34);
		}

		double double49 = 0.5 - double36 * double36 - double38 * double38;
		double double10;
		if (double49 < 0.0) {
			double10 = 0.0;
		} else {
			double49 *= double49;
			double10 = double49 * double49 * a(e[integer44], double36, double38);
		}

		return 70.0 * (double6 + double8 + double10);
	}

	public void a(double[] arr, double double2, double double3, int integer4, int integer5, double double6, double double7, double double8) {
		int integer15 = 0;

		for (int integer16 = 0; integer16 < integer5; integer16++) {
			double double17 = (double3 + (double)integer16) * double7 + this.c;

			for (int integer19 = 0; integer19 < integer4; integer19++) {
				double double20 = (double2 + (double)integer19) * double6 + this.b;
				double double28 = (double20 + double17) * g;
				int integer30 = a(double20 + double28);
				int integer31 = a(double17 + double28);
				double double32 = (double)(integer30 + integer31) * h;
				double double34 = (double)integer30 - double32;
				double double36 = (double)integer31 - double32;
				double double38 = double20 - double34;
				double double40 = double17 - double36;
				int integer42;
				int integer43;
				if (double38 > double40) {
					integer42 = 1;
					integer43 = 0;
				} else {
					integer42 = 0;
					integer43 = 1;
				}

				double double44 = double38 - (double)integer42 + h;
				double double46 = double40 - (double)integer43 + h;
				double double48 = double38 - 1.0 + 2.0 * h;
				double double50 = double40 - 1.0 + 2.0 * h;
				int integer52 = integer30 & 0xFF;
				int integer53 = integer31 & 0xFF;
				int integer54 = this.f[integer52 + this.f[integer53]] % 12;
				int integer55 = this.f[integer52 + integer42 + this.f[integer53 + integer43]] % 12;
				int integer56 = this.f[integer52 + 1 + this.f[integer53 + 1]] % 12;
				double double57 = 0.5 - double38 * double38 - double40 * double40;
				double double22;
				if (double57 < 0.0) {
					double22 = 0.0;
				} else {
					double57 *= double57;
					double22 = double57 * double57 * a(e[integer54], double38, double40);
				}

				double double59 = 0.5 - double44 * double44 - double46 * double46;
				double double24;
				if (double59 < 0.0) {
					double24 = 0.0;
				} else {
					double59 *= double59;
					double24 = double59 * double59 * a(e[integer55], double44, double46);
				}

				double double61 = 0.5 - double48 * double48 - double50 * double50;
				double double26;
				if (double61 < 0.0) {
					double26 = 0.0;
				} else {
					double61 *= double61;
					double26 = double61 * double61 * a(e[integer56], double48, double50);
				}

				arr[integer15++] += 70.0 * (double22 + double24 + double26) * double8;
			}
		}
	}
}

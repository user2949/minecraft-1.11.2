import java.util.Random;

public class azj extends azn {
	private final azm[] a;
	private final int b;

	public azj(Random random, int integer) {
		this.b = integer;
		this.a = new azm[integer];

		for (int integer4 = 0; integer4 < integer; integer4++) {
			this.a[integer4] = new azm(random);
		}
	}

	public double a(double double1, double double2) {
		double double6 = 0.0;
		double double8 = 1.0;

		for (int integer10 = 0; integer10 < this.b; integer10++) {
			double6 += this.a[integer10].a(double1 * double8, double2 * double8) / double8;
			double8 /= 2.0;
		}

		return double6;
	}

	public double[] a(double[] arr, double double2, double double3, int integer4, int integer5, double double6, double double7, double double8) {
		return this.a(arr, double2, double3, integer4, integer5, double6, double7, double8, 0.5);
	}

	public double[] a(double[] arr, double double2, double double3, int integer4, int integer5, double double6, double double7, double double8, double double9) {
		if (arr != null && arr.length >= integer4 * integer5) {
			for (int integer17 = 0; integer17 < arr.length; integer17++) {
				arr[integer17] = 0.0;
			}
		} else {
			arr = new double[integer4 * integer5];
		}

		double double17 = 1.0;
		double double19 = 1.0;

		for (int integer21 = 0; integer21 < this.b; integer21++) {
			this.a[integer21].a(arr, double2, double3, integer4, integer5, double6 * double19 * double17, double7 * double19 * double17, 0.55 / double17);
			double19 *= double8;
			double17 *= double9;
		}

		return arr;
	}
}

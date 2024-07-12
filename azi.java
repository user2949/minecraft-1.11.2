import java.util.Random;

public class azi extends azn {
	private final azh[] a;
	private final int b;

	public azi(Random random, int integer) {
		this.b = integer;
		this.a = new azh[integer];

		for (int integer4 = 0; integer4 < integer; integer4++) {
			this.a[integer4] = new azh(random);
		}
	}

	public double[] a(
		double[] arr, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, double double8, double double9, double double10
	) {
		if (arr == null) {
			arr = new double[integer5 * integer6 * integer7];
		} else {
			for (int integer15 = 0; integer15 < arr.length; integer15++) {
				arr[integer15] = 0.0;
			}
		}

		double double15 = 1.0;

		for (int integer17 = 0; integer17 < this.b; integer17++) {
			double double18 = (double)integer2 * double15 * double8;
			double double20 = (double)integer3 * double15 * double9;
			double double22 = (double)integer4 * double15 * double10;
			long long24 = ot.d(double18);
			long long26 = ot.d(double22);
			double18 -= (double)long24;
			double22 -= (double)long26;
			long24 %= 16777216L;
			long26 %= 16777216L;
			double18 += (double)long24;
			double22 += (double)long26;
			this.a[integer17].a(arr, double18, double20, double22, integer5, integer6, integer7, double8 * double15, double9 * double15, double10 * double15, double15);
			double15 /= 2.0;
		}

		return arr;
	}

	public double[] a(double[] arr, int integer2, int integer3, int integer4, int integer5, double double6, double double7, double double8) {
		return this.a(arr, integer2, 10, integer3, integer4, 1, integer5, double6, 1.0, double7);
	}
}

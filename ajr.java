public class ajr {
	private static int[] a = new int[65536];

	public static void a(int[] arr) {
		a = arr;
	}

	public static int a(double double1, double double2) {
		double2 *= double1;
		int integer5 = (int)((1.0 - double1) * 255.0);
		int integer6 = (int)((1.0 - double2) * 255.0);
		int integer7 = integer6 << 8 | integer5;
		return integer7 > a.length ? -65281 : a[integer7];
	}
}

public class on {
	private static final Integer[] a = new Integer[65535];

	public static Integer a(int integer) {
		return integer > 0 && integer < a.length ? a[integer] : integer;
	}

	static {
		int integer1 = 0;

		for (int integer2 = a.length; integer1 < integer2; integer1++) {
			a[integer1] = integer1;
		}
	}
}

public class ban extends baj {
	public ban(long long1, baj baj) {
		super(long1);
		this.a = baj;
	}

	@Override
	public int[] a(int integer1, int integer2, int integer3, int integer4) {
		int[] arr6 = this.a.a(integer1, integer2, integer3, integer4);
		int[] arr7 = bah.a(integer3 * integer4);

		for (int integer8 = 0; integer8 < integer4; integer8++) {
			for (int integer9 = 0; integer9 < integer3; integer9++) {
				this.a((long)(integer9 + integer1), (long)(integer8 + integer2));
				arr7[integer9 + integer8 * integer3] = arr6[integer9 + integer8 * integer3] > 0 ? this.a(299999) + 2 : 0;
			}
		}

		return arr7;
	}
}

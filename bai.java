public class bai extends baj {
	public bai(long long1) {
		super(long1);
	}

	@Override
	public int[] a(int integer1, int integer2, int integer3, int integer4) {
		int[] arr6 = bah.a(integer3 * integer4);

		for (int integer7 = 0; integer7 < integer4; integer7++) {
			for (int integer8 = 0; integer8 < integer3; integer8++) {
				this.a((long)(integer1 + integer8), (long)(integer2 + integer7));
				arr6[integer8 + integer7 * integer3] = this.a(10) == 0 ? 1 : 0;
			}
		}

		if (integer1 > -integer3 && integer1 <= 0 && integer2 > -integer4 && integer2 <= 0) {
			arr6[-integer1 + -integer2 * integer3] = 1;
		}

		return arr6;
	}
}

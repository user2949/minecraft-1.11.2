public class bak extends baj {
	public bak(long long1, baj baj) {
		super(long1);
		this.a = baj;
	}

	@Override
	public int[] a(int integer1, int integer2, int integer3, int integer4) {
		int[] arr6 = this.a.a(integer1 - 1, integer2 - 1, integer3 + 2, integer4 + 2);
		int[] arr7 = bah.a(integer3 * integer4);

		for (int integer8 = 0; integer8 < integer4; integer8++) {
			for (int integer9 = 0; integer9 < integer3; integer9++) {
				this.a((long)(integer9 + integer1), (long)(integer8 + integer2));
				int integer10 = arr6[integer9 + 1 + (integer8 + 1) * (integer3 + 2)];
				if (this.a(57) == 0) {
					if (integer10 == akf.a(akk.c)) {
						arr7[integer9 + integer8 * integer3] = akf.a(akk.Q);
					} else {
						arr7[integer9 + integer8 * integer3] = integer10;
					}
				} else {
					arr7[integer9 + integer8 * integer3] = integer10;
				}
			}
		}

		return arr7;
	}
}

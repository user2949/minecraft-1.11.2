public class bab extends baj {
	public bab(long long1, baj baj) {
		super(long1);
		this.a = baj;
	}

	@Override
	public int[] a(int integer1, int integer2, int integer3, int integer4) {
		int integer6 = integer1 - 1;
		int integer7 = integer2 - 1;
		int integer8 = integer3 + 2;
		int integer9 = integer4 + 2;
		int[] arr10 = this.a.a(integer6, integer7, integer8, integer9);
		int[] arr11 = bah.a(integer3 * integer4);

		for (int integer12 = 0; integer12 < integer4; integer12++) {
			for (int integer13 = 0; integer13 < integer3; integer13++) {
				int integer14 = arr10[integer13 + 1 + (integer12 + 1) * integer8];
				this.a((long)(integer13 + integer1), (long)(integer12 + integer2));
				if (integer14 == 0) {
					arr11[integer13 + integer12 * integer3] = 0;
				} else {
					int integer15 = this.a(6);
					byte var15;
					if (integer15 == 0) {
						var15 = 4;
					} else if (integer15 <= 1) {
						var15 = 3;
					} else {
						var15 = 1;
					}

					arr11[integer13 + integer12 * integer3] = var15;
				}
			}
		}

		return arr11;
	}
}

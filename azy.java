public class azy extends baj {
	private final azy.a c;

	public azy(long long1, baj baj, azy.a a) {
		super(long1);
		this.a = baj;
		this.c = a;
	}

	@Override
	public int[] a(int integer1, int integer2, int integer3, int integer4) {
		switch (this.c) {
			case COOL_WARM:
			default:
				return this.c(integer1, integer2, integer3, integer4);
			case HEAT_ICE:
				return this.d(integer1, integer2, integer3, integer4);
			case SPECIAL:
				return this.e(integer1, integer2, integer3, integer4);
		}
	}

	private int[] c(int integer1, int integer2, int integer3, int integer4) {
		int integer6 = integer1 - 1;
		int integer7 = integer2 - 1;
		int integer8 = 1 + integer3 + 1;
		int integer9 = 1 + integer4 + 1;
		int[] arr10 = this.a.a(integer6, integer7, integer8, integer9);
		int[] arr11 = bah.a(integer3 * integer4);

		for (int integer12 = 0; integer12 < integer4; integer12++) {
			for (int integer13 = 0; integer13 < integer3; integer13++) {
				this.a((long)(integer13 + integer1), (long)(integer12 + integer2));
				int integer14 = arr10[integer13 + 1 + (integer12 + 1) * integer8];
				if (integer14 == 1) {
					int integer15 = arr10[integer13 + 1 + (integer12 + 1 - 1) * integer8];
					int integer16 = arr10[integer13 + 1 + 1 + (integer12 + 1) * integer8];
					int integer17 = arr10[integer13 + 1 - 1 + (integer12 + 1) * integer8];
					int integer18 = arr10[integer13 + 1 + (integer12 + 1 + 1) * integer8];
					boolean boolean19 = integer15 == 3 || integer16 == 3 || integer17 == 3 || integer18 == 3;
					boolean boolean20 = integer15 == 4 || integer16 == 4 || integer17 == 4 || integer18 == 4;
					if (boolean19 || boolean20) {
						integer14 = 2;
					}
				}

				arr11[integer13 + integer12 * integer3] = integer14;
			}
		}

		return arr11;
	}

	private int[] d(int integer1, int integer2, int integer3, int integer4) {
		int integer6 = integer1 - 1;
		int integer7 = integer2 - 1;
		int integer8 = 1 + integer3 + 1;
		int integer9 = 1 + integer4 + 1;
		int[] arr10 = this.a.a(integer6, integer7, integer8, integer9);
		int[] arr11 = bah.a(integer3 * integer4);

		for (int integer12 = 0; integer12 < integer4; integer12++) {
			for (int integer13 = 0; integer13 < integer3; integer13++) {
				int integer14 = arr10[integer13 + 1 + (integer12 + 1) * integer8];
				if (integer14 == 4) {
					int integer15 = arr10[integer13 + 1 + (integer12 + 1 - 1) * integer8];
					int integer16 = arr10[integer13 + 1 + 1 + (integer12 + 1) * integer8];
					int integer17 = arr10[integer13 + 1 - 1 + (integer12 + 1) * integer8];
					int integer18 = arr10[integer13 + 1 + (integer12 + 1 + 1) * integer8];
					boolean boolean19 = integer15 == 2 || integer16 == 2 || integer17 == 2 || integer18 == 2;
					boolean boolean20 = integer15 == 1 || integer16 == 1 || integer17 == 1 || integer18 == 1;
					if (boolean20 || boolean19) {
						integer14 = 3;
					}
				}

				arr11[integer13 + integer12 * integer3] = integer14;
			}
		}

		return arr11;
	}

	private int[] e(int integer1, int integer2, int integer3, int integer4) {
		int[] arr6 = this.a.a(integer1, integer2, integer3, integer4);
		int[] arr7 = bah.a(integer3 * integer4);

		for (int integer8 = 0; integer8 < integer4; integer8++) {
			for (int integer9 = 0; integer9 < integer3; integer9++) {
				this.a((long)(integer9 + integer1), (long)(integer8 + integer2));
				int integer10 = arr6[integer9 + integer8 * integer3];
				if (integer10 != 0 && this.a(13) == 0) {
					integer10 |= 1 + this.a(15) << 8 & 3840;
				}

				arr7[integer9 + integer8 * integer3] = integer10;
			}
		}

		return arr7;
	}

	public static enum a {
		COOL_WARM,
		HEAT_ICE,
		SPECIAL;
	}
}

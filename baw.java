public class baw extends baj {
	public baw(long long1, baj baj) {
		super(long1);
		super.a = baj;
	}

	@Override
	public int[] a(int integer1, int integer2, int integer3, int integer4) {
		int integer6 = integer1 >> 1;
		int integer7 = integer2 >> 1;
		int integer8 = (integer3 >> 1) + 2;
		int integer9 = (integer4 >> 1) + 2;
		int[] arr10 = this.a.a(integer6, integer7, integer8, integer9);
		int integer11 = integer8 - 1 << 1;
		int integer12 = integer9 - 1 << 1;
		int[] arr13 = bah.a(integer11 * integer12);

		for (int integer14 = 0; integer14 < integer9 - 1; integer14++) {
			int integer15 = (integer14 << 1) * integer11;
			int integer16 = 0;
			int integer17 = arr10[integer16 + 0 + (integer14 + 0) * integer8];

			for (int integer18 = arr10[integer16 + 0 + (integer14 + 1) * integer8]; integer16 < integer8 - 1; integer16++) {
				this.a((long)(integer16 + integer6 << 1), (long)(integer14 + integer7 << 1));
				int integer19 = arr10[integer16 + 1 + (integer14 + 0) * integer8];
				int integer20 = arr10[integer16 + 1 + (integer14 + 1) * integer8];
				arr13[integer15] = integer17;
				arr13[integer15++ + integer11] = this.a(new int[]{integer17, integer18});
				arr13[integer15] = this.a(new int[]{integer17, integer19});
				arr13[integer15++ + integer11] = this.b(integer17, integer19, integer18, integer20);
				integer17 = integer19;
				integer18 = integer20;
			}
		}

		int[] arr14 = bah.a(integer3 * integer4);

		for (int integer15 = 0; integer15 < integer4; integer15++) {
			System.arraycopy(arr13, (integer15 + (integer2 & 1)) * integer11 + (integer1 & 1), arr14, integer15 * integer3, integer3);
		}

		return arr14;
	}

	public static baj b(long long1, baj baj, int integer) {
		baj baj5 = baj;

		for (int integer6 = 0; integer6 < integer; integer6++) {
			baj5 = new baw(long1 + (long)integer6, baj5);
		}

		return baj5;
	}
}

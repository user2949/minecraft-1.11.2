public class bav extends baj {
	public bav(long long1, baj baj) {
		super(long1);
		super.a = baj;
	}

	@Override
	public int[] a(int integer1, int integer2, int integer3, int integer4) {
		integer1 -= 2;
		integer2 -= 2;
		int integer6 = integer1 >> 2;
		int integer7 = integer2 >> 2;
		int integer8 = (integer3 >> 2) + 2;
		int integer9 = (integer4 >> 2) + 2;
		int[] arr10 = this.a.a(integer6, integer7, integer8, integer9);
		int integer11 = integer8 - 1 << 2;
		int integer12 = integer9 - 1 << 2;
		int[] arr13 = bah.a(integer11 * integer12);

		for (int integer14 = 0; integer14 < integer9 - 1; integer14++) {
			int integer15 = 0;
			int integer16 = arr10[integer15 + 0 + (integer14 + 0) * integer8];

			for (int integer17 = arr10[integer15 + 0 + (integer14 + 1) * integer8]; integer15 < integer8 - 1; integer15++) {
				double double18 = 3.6;
				this.a((long)(integer15 + integer6 << 2), (long)(integer14 + integer7 << 2));
				double double20 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
				double double22 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
				this.a((long)(integer15 + integer6 + 1 << 2), (long)(integer14 + integer7 << 2));
				double double24 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
				double double26 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
				this.a((long)(integer15 + integer6 << 2), (long)(integer14 + integer7 + 1 << 2));
				double double28 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
				double double30 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
				this.a((long)(integer15 + integer6 + 1 << 2), (long)(integer14 + integer7 + 1 << 2));
				double double32 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
				double double34 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
				int integer36 = arr10[integer15 + 1 + (integer14 + 0) * integer8] & 0xFF;
				int integer37 = arr10[integer15 + 1 + (integer14 + 1) * integer8] & 0xFF;

				for (int integer38 = 0; integer38 < 4; integer38++) {
					int integer39 = ((integer14 << 2) + integer38) * integer11 + (integer15 << 2);

					for (int integer40 = 0; integer40 < 4; integer40++) {
						double double41 = ((double)integer38 - double22) * ((double)integer38 - double22) + ((double)integer40 - double20) * ((double)integer40 - double20);
						double double43 = ((double)integer38 - double26) * ((double)integer38 - double26) + ((double)integer40 - double24) * ((double)integer40 - double24);
						double double45 = ((double)integer38 - double30) * ((double)integer38 - double30) + ((double)integer40 - double28) * ((double)integer40 - double28);
						double double47 = ((double)integer38 - double34) * ((double)integer38 - double34) + ((double)integer40 - double32) * ((double)integer40 - double32);
						if (double41 < double43 && double41 < double45 && double41 < double47) {
							arr13[integer39++] = integer16;
						} else if (double43 < double41 && double43 < double45 && double43 < double47) {
							arr13[integer39++] = integer36;
						} else if (double45 < double41 && double45 < double43 && double45 < double47) {
							arr13[integer39++] = integer17;
						} else {
							arr13[integer39++] = integer37;
						}
					}
				}

				integer16 = integer36;
				integer17 = integer37;
			}
		}

		int[] arr14 = bah.a(integer3 * integer4);

		for (int integer15 = 0; integer15 < integer4; integer15++) {
			System.arraycopy(arr13, (integer15 + (integer2 & 3)) * integer11 + (integer1 & 3), arr14, integer15 * integer3, integer3);
		}

		return arr14;
	}
}

public class baa extends baj {
	public baa(long long1, baj baj) {
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
				int integer14 = arr10[integer13 + 0 + (integer12 + 0) * integer8];
				int integer15 = arr10[integer13 + 2 + (integer12 + 0) * integer8];
				int integer16 = arr10[integer13 + 0 + (integer12 + 2) * integer8];
				int integer17 = arr10[integer13 + 2 + (integer12 + 2) * integer8];
				int integer18 = arr10[integer13 + 1 + (integer12 + 1) * integer8];
				this.a((long)(integer13 + integer1), (long)(integer12 + integer2));
				if (integer18 == 0 && integer14 == 0 && integer15 == 0 && integer16 == 0 && integer17 == 0 && this.a(100) == 0) {
					arr11[integer13 + integer12 * integer3] = akf.a(akk.p);
				} else {
					arr11[integer13 + integer12 * integer3] = integer18;
				}
			}
		}

		return arr11;
	}
}

public class bap extends baj {
	private final baj c;
	private final baj d;

	public bap(long long1, baj baj2, baj baj3) {
		super(long1);
		this.c = baj2;
		this.d = baj3;
	}

	@Override
	public void a(long long1) {
		this.c.a(long1);
		this.d.a(long1);
		super.a(long1);
	}

	@Override
	public int[] a(int integer1, int integer2, int integer3, int integer4) {
		int[] arr6 = this.c.a(integer1, integer2, integer3, integer4);
		int[] arr7 = this.d.a(integer1, integer2, integer3, integer4);
		int[] arr8 = bah.a(integer3 * integer4);

		for (int integer9 = 0; integer9 < integer3 * integer4; integer9++) {
			if (arr6[integer9] == akf.a(akk.a) || arr6[integer9] == akf.a(akk.z)) {
				arr8[integer9] = arr6[integer9];
			} else if (arr7[integer9] == akf.a(akk.i)) {
				if (arr6[integer9] == akf.a(akk.n)) {
					arr8[integer9] = akf.a(akk.m);
				} else if (arr6[integer9] != akf.a(akk.p) && arr6[integer9] != akf.a(akk.q)) {
					arr8[integer9] = arr7[integer9] & 0xFF;
				} else {
					arr8[integer9] = akf.a(akk.q);
				}
			} else {
				arr8[integer9] = arr6[integer9];
			}
		}

		return arr8;
	}
}

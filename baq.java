public class baq extends baj {
	public baq(long long1, baj baj) {
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
				akf akf11 = akf.b(integer10);
				if (integer10 == akf.a(akk.p)) {
					int integer12 = arr6[integer9 + 1 + (integer8 + 1 - 1) * (integer3 + 2)];
					int integer13 = arr6[integer9 + 1 + 1 + (integer8 + 1) * (integer3 + 2)];
					int integer14 = arr6[integer9 + 1 - 1 + (integer8 + 1) * (integer3 + 2)];
					int integer15 = arr6[integer9 + 1 + (integer8 + 1 + 1) * (integer3 + 2)];
					if (integer12 != akf.a(akk.a) && integer13 != akf.a(akk.a) && integer14 != akf.a(akk.a) && integer15 != akf.a(akk.a)) {
						arr7[integer9 + integer8 * integer3] = integer10;
					} else {
						arr7[integer9 + integer8 * integer3] = akf.a(akk.q);
					}
				} else if (akf11 != null && akf11.g() == akt.class) {
					int integer12 = arr6[integer9 + 1 + (integer8 + 1 - 1) * (integer3 + 2)];
					int integer13 = arr6[integer9 + 1 + 1 + (integer8 + 1) * (integer3 + 2)];
					int integer14 = arr6[integer9 + 1 - 1 + (integer8 + 1) * (integer3 + 2)];
					int integer15 = arr6[integer9 + 1 + (integer8 + 1 + 1) * (integer3 + 2)];
					if (!this.c(integer12) || !this.c(integer13) || !this.c(integer14) || !this.c(integer15)) {
						arr7[integer9 + integer8 * integer3] = akf.a(akk.y);
					} else if (!b(integer12) && !b(integer13) && !b(integer14) && !b(integer15)) {
						arr7[integer9 + integer8 * integer3] = integer10;
					} else {
						arr7[integer9 + integer8 * integer3] = akf.a(akk.r);
					}
				} else if (integer10 == akf.a(akk.e) || integer10 == akf.a(akk.J) || integer10 == akf.a(akk.v)) {
					this.a(arr6, arr7, integer9, integer8, integer3, integer10, akf.a(akk.A));
				} else if (akf11 != null && akf11.p()) {
					this.a(arr6, arr7, integer9, integer8, integer3, integer10, akf.a(akk.B));
				} else if (integer10 == akf.a(akk.M) || integer10 == akf.a(akk.N)) {
					int integer12 = arr6[integer9 + 1 + (integer8 + 1 - 1) * (integer3 + 2)];
					int integer13 = arr6[integer9 + 1 + 1 + (integer8 + 1) * (integer3 + 2)];
					int integer14 = arr6[integer9 + 1 - 1 + (integer8 + 1) * (integer3 + 2)];
					int integer15 = arr6[integer9 + 1 + (integer8 + 1 + 1) * (integer3 + 2)];
					if (b(integer12) || b(integer13) || b(integer14) || b(integer15)) {
						arr7[integer9 + integer8 * integer3] = integer10;
					} else if (this.d(integer12) && this.d(integer13) && this.d(integer14) && this.d(integer15)) {
						arr7[integer9 + integer8 * integer3] = integer10;
					} else {
						arr7[integer9 + integer8 * integer3] = akf.a(akk.d);
					}
				} else if (integer10 != akf.a(akk.a) && integer10 != akf.a(akk.z) && integer10 != akf.a(akk.i) && integer10 != akf.a(akk.h)) {
					int integer12 = arr6[integer9 + 1 + (integer8 + 1 - 1) * (integer3 + 2)];
					int integer13 = arr6[integer9 + 1 + 1 + (integer8 + 1) * (integer3 + 2)];
					int integer14 = arr6[integer9 + 1 - 1 + (integer8 + 1) * (integer3 + 2)];
					int integer15 = arr6[integer9 + 1 + (integer8 + 1 + 1) * (integer3 + 2)];
					if (!b(integer12) && !b(integer13) && !b(integer14) && !b(integer15)) {
						arr7[integer9 + integer8 * integer3] = integer10;
					} else {
						arr7[integer9 + integer8 * integer3] = akf.a(akk.r);
					}
				} else {
					arr7[integer9 + integer8 * integer3] = integer10;
				}
			}
		}

		return arr7;
	}

	private void a(int[] arr1, int[] arr2, int integer3, int integer4, int integer5, int integer6, int integer7) {
		if (b(integer6)) {
			arr2[integer3 + integer4 * integer5] = integer6;
		} else {
			int integer9 = arr1[integer3 + 1 + (integer4 + 1 - 1) * (integer5 + 2)];
			int integer10 = arr1[integer3 + 1 + 1 + (integer4 + 1) * (integer5 + 2)];
			int integer11 = arr1[integer3 + 1 - 1 + (integer4 + 1) * (integer5 + 2)];
			int integer12 = arr1[integer3 + 1 + (integer4 + 1 + 1) * (integer5 + 2)];
			if (!b(integer9) && !b(integer10) && !b(integer11) && !b(integer12)) {
				arr2[integer3 + integer4 * integer5] = integer6;
			} else {
				arr2[integer3 + integer4 * integer5] = integer7;
			}
		}
	}

	private boolean c(int integer) {
		return akf.b(integer) != null && akf.b(integer).g() == akt.class
			? true
			: integer == akf.a(akk.y) || integer == akf.a(akk.w) || integer == akf.a(akk.x) || integer == akf.a(akk.f) || integer == akf.a(akk.g) || b(integer);
	}

	private boolean d(int integer) {
		return akf.b(integer) instanceof aku;
	}
}

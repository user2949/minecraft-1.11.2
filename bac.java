public class bac extends baj {
	public bac(long long1, baj baj) {
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
				if (!this.a(arr6, arr7, integer9, integer8, integer3, integer10, akf.a(akk.e), akf.a(akk.v))
					&& !this.b(arr6, arr7, integer9, integer8, integer3, integer10, akf.a(akk.N), akf.a(akk.M))
					&& !this.b(arr6, arr7, integer9, integer8, integer3, integer10, akf.a(akk.O), akf.a(akk.M))
					&& !this.b(arr6, arr7, integer9, integer8, integer3, integer10, akf.a(akk.H), akf.a(akk.g))) {
					if (integer10 == akf.a(akk.d)) {
						int integer11 = arr6[integer9 + 1 + (integer8 + 1 - 1) * (integer3 + 2)];
						int integer12 = arr6[integer9 + 1 + 1 + (integer8 + 1) * (integer3 + 2)];
						int integer13 = arr6[integer9 + 1 - 1 + (integer8 + 1) * (integer3 + 2)];
						int integer14 = arr6[integer9 + 1 + (integer8 + 1 + 1) * (integer3 + 2)];
						if (integer11 != akf.a(akk.n) && integer12 != akf.a(akk.n) && integer13 != akf.a(akk.n) && integer14 != akf.a(akk.n)) {
							arr7[integer9 + integer8 * integer3] = integer10;
						} else {
							arr7[integer9 + integer8 * integer3] = akf.a(akk.J);
						}
					} else if (integer10 == akf.a(akk.h)) {
						int integer11 = arr6[integer9 + 1 + (integer8 + 1 - 1) * (integer3 + 2)];
						int integer12 = arr6[integer9 + 1 + 1 + (integer8 + 1) * (integer3 + 2)];
						int integer13 = arr6[integer9 + 1 - 1 + (integer8 + 1) * (integer3 + 2)];
						int integer14 = arr6[integer9 + 1 + (integer8 + 1 + 1) * (integer3 + 2)];
						if (integer11 == akf.a(akk.d)
							|| integer12 == akf.a(akk.d)
							|| integer13 == akf.a(akk.d)
							|| integer14 == akf.a(akk.d)
							|| integer11 == akf.a(akk.F)
							|| integer12 == akf.a(akk.F)
							|| integer13 == akf.a(akk.F)
							|| integer14 == akf.a(akk.F)
							|| integer11 == akf.a(akk.n)
							|| integer12 == akf.a(akk.n)
							|| integer13 == akf.a(akk.n)
							|| integer14 == akf.a(akk.n)) {
							arr7[integer9 + integer8 * integer3] = akf.a(akk.c);
						} else if (integer11 != akf.a(akk.w) && integer14 != akf.a(akk.w) && integer12 != akf.a(akk.w) && integer13 != akf.a(akk.w)) {
							arr7[integer9 + integer8 * integer3] = integer10;
						} else {
							arr7[integer9 + integer8 * integer3] = akf.a(akk.y);
						}
					} else {
						arr7[integer9 + integer8 * integer3] = integer10;
					}
				}
			}
		}

		return arr7;
	}

	private boolean a(int[] arr1, int[] arr2, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8) {
		if (!a(integer6, integer7)) {
			return false;
		} else {
			int integer10 = arr1[integer3 + 1 + (integer4 + 1 - 1) * (integer5 + 2)];
			int integer11 = arr1[integer3 + 1 + 1 + (integer4 + 1) * (integer5 + 2)];
			int integer12 = arr1[integer3 + 1 - 1 + (integer4 + 1) * (integer5 + 2)];
			int integer13 = arr1[integer3 + 1 + (integer4 + 1 + 1) * (integer5 + 2)];
			if (this.b(integer10, integer7) && this.b(integer11, integer7) && this.b(integer12, integer7) && this.b(integer13, integer7)) {
				arr2[integer3 + integer4 * integer5] = integer6;
			} else {
				arr2[integer3 + integer4 * integer5] = integer8;
			}

			return true;
		}
	}

	private boolean b(int[] arr1, int[] arr2, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8) {
		if (integer6 != integer7) {
			return false;
		} else {
			int integer10 = arr1[integer3 + 1 + (integer4 + 1 - 1) * (integer5 + 2)];
			int integer11 = arr1[integer3 + 1 + 1 + (integer4 + 1) * (integer5 + 2)];
			int integer12 = arr1[integer3 + 1 - 1 + (integer4 + 1) * (integer5 + 2)];
			int integer13 = arr1[integer3 + 1 + (integer4 + 1 + 1) * (integer5 + 2)];
			if (a(integer10, integer7) && a(integer11, integer7) && a(integer12, integer7) && a(integer13, integer7)) {
				arr2[integer3 + integer4 * integer5] = integer6;
			} else {
				arr2[integer3 + integer4 * integer5] = integer8;
			}

			return true;
		}
	}

	private boolean b(int integer1, int integer2) {
		if (a(integer1, integer2)) {
			return true;
		} else {
			akf akf4 = akf.b(integer1);
			akf akf5 = akf.b(integer2);
			if (akf4 != null && akf5 != null) {
				akf.b b6 = akf4.h();
				akf.b b7 = akf5.h();
				return b6 == b7 || b6 == akf.b.MEDIUM || b7 == akf.b.MEDIUM;
			} else {
				return false;
			}
		}
	}
}

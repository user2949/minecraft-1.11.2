import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bal extends baj {
	private static final Logger c = LogManager.getLogger();
	private final baj d;

	public bal(long long1, baj baj2, baj baj3) {
		super(long1);
		this.a = baj2;
		this.d = baj3;
	}

	@Override
	public int[] a(int integer1, int integer2, int integer3, int integer4) {
		int[] arr6 = this.a.a(integer1 - 1, integer2 - 1, integer3 + 2, integer4 + 2);
		int[] arr7 = this.d.a(integer1 - 1, integer2 - 1, integer3 + 2, integer4 + 2);
		int[] arr8 = bah.a(integer3 * integer4);

		for (int integer9 = 0; integer9 < integer4; integer9++) {
			for (int integer10 = 0; integer10 < integer3; integer10++) {
				this.a((long)(integer10 + integer1), (long)(integer9 + integer2));
				int integer11 = arr6[integer10 + 1 + (integer9 + 1) * (integer3 + 2)];
				int integer12 = arr7[integer10 + 1 + (integer9 + 1) * (integer3 + 2)];
				boolean boolean13 = (integer12 - 2) % 29 == 0;
				if (integer11 > 255) {
					c.debug("old! {}", new Object[]{integer11});
				}

				akf akf14 = akf.a(integer11);
				boolean boolean15 = akf14 != null && akf14.b();
				if (integer11 != 0 && integer12 >= 2 && (integer12 - 2) % 29 == 1 && !boolean15) {
					akf akf16 = akf.b(akf14);
					arr8[integer10 + integer9 * integer3] = akf16 == null ? integer11 : akf.a(akf16);
				} else if (this.a(3) != 0 && !boolean13) {
					arr8[integer10 + integer9 * integer3] = integer11;
				} else {
					akf akf16 = akf14;
					if (akf14 == akk.d) {
						akf16 = akk.s;
					} else if (akf14 == akk.f) {
						akf16 = akk.t;
					} else if (akf14 == akk.C) {
						akf16 = akk.D;
					} else if (akf14 == akk.E) {
						akf16 = akk.c;
					} else if (akf14 == akk.g) {
						akf16 = akk.u;
					} else if (akf14 == akk.H) {
						akf16 = akk.I;
					} else if (akf14 == akk.F) {
						akf16 = akk.G;
					} else if (akf14 == akk.c) {
						if (this.a(3) == 0) {
							akf16 = akk.t;
						} else {
							akf16 = akk.f;
						}
					} else if (akf14 == akk.n) {
						akf16 = akk.o;
					} else if (akf14 == akk.w) {
						akf16 = akk.x;
					} else if (akf14 == akk.a) {
						akf16 = akk.z;
					} else if (akf14 == akk.e) {
						akf16 = akk.J;
					} else if (akf14 == akk.K) {
						akf16 = akk.L;
					} else if (a(integer11, akf.a(akk.N))) {
						akf16 = akk.M;
					} else if (akf14 == akk.z && this.a(3) == 0) {
						int integer17 = this.a(2);
						if (integer17 == 0) {
							akf16 = akk.c;
						} else {
							akf16 = akk.f;
						}
					}

					int integer17 = akf.a(akf16);
					if (boolean13 && integer17 != integer11) {
						akf akf18 = akf.b(akf16);
						integer17 = akf18 == null ? integer11 : akf.a(akf18);
					}

					if (integer17 == integer11) {
						arr8[integer10 + integer9 * integer3] = integer11;
					} else {
						int integer18 = arr6[integer10 + 1 + (integer9 + 0) * (integer3 + 2)];
						int integer19 = arr6[integer10 + 2 + (integer9 + 1) * (integer3 + 2)];
						int integer20 = arr6[integer10 + 0 + (integer9 + 1) * (integer3 + 2)];
						int integer21 = arr6[integer10 + 1 + (integer9 + 2) * (integer3 + 2)];
						int integer22 = 0;
						if (a(integer18, integer11)) {
							integer22++;
						}

						if (a(integer19, integer11)) {
							integer22++;
						}

						if (a(integer20, integer11)) {
							integer22++;
						}

						if (a(integer21, integer11)) {
							integer22++;
						}

						if (integer22 >= 3) {
							arr8[integer10 + integer9 * integer3] = integer17;
						} else {
							arr8[integer10 + integer9 * integer3] = integer11;
						}
					}
				}
			}
		}

		return arr8;
	}
}

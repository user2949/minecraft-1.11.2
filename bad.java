public class bad extends baj {
	private akf[] c = new akf[]{akk.d, akk.d, akk.d, akk.K, akk.K, akk.c};
	private final akf[] d = new akf[]{akk.f, akk.E, akk.e, akk.c, akk.C, akk.h};
	private final akf[] e = new akf[]{akk.f, akk.e, akk.g, akk.c};
	private final akf[] f = new akf[]{akk.n, akk.n, akk.n, akk.F};
	private final avq g;

	public bad(long long1, baj baj, ajx ajx, avq avq) {
		super(long1);
		this.a = baj;
		if (ajx == ajx.h) {
			this.c = new akf[]{akk.d, akk.f, akk.e, akk.h, akk.c, akk.g};
			this.g = null;
		} else {
			this.g = avq;
		}
	}

	@Override
	public int[] a(int integer1, int integer2, int integer3, int integer4) {
		int[] arr6 = this.a.a(integer1, integer2, integer3, integer4);
		int[] arr7 = bah.a(integer3 * integer4);

		for (int integer8 = 0; integer8 < integer4; integer8++) {
			for (int integer9 = 0; integer9 < integer3; integer9++) {
				this.a((long)(integer9 + integer1), (long)(integer8 + integer2));
				int integer10 = arr6[integer9 + integer8 * integer3];
				int integer11 = (integer10 & 3840) >> 8;
				integer10 &= -3841;
				if (this.g != null && this.g.G >= 0) {
					arr7[integer9 + integer8 * integer3] = this.g.G;
				} else if (b(integer10)) {
					arr7[integer9 + integer8 * integer3] = integer10;
				} else if (integer10 == akf.a(akk.p)) {
					arr7[integer9 + integer8 * integer3] = integer10;
				} else if (integer10 == 1) {
					if (integer11 > 0) {
						if (this.a(3) == 0) {
							arr7[integer9 + integer8 * integer3] = akf.a(akk.O);
						} else {
							arr7[integer9 + integer8 * integer3] = akf.a(akk.N);
						}
					} else {
						arr7[integer9 + integer8 * integer3] = akf.a(this.c[this.a(this.c.length)]);
					}
				} else if (integer10 == 2) {
					if (integer11 > 0) {
						arr7[integer9 + integer8 * integer3] = akf.a(akk.w);
					} else {
						arr7[integer9 + integer8 * integer3] = akf.a(this.d[this.a(this.d.length)]);
					}
				} else if (integer10 == 3) {
					if (integer11 > 0) {
						arr7[integer9 + integer8 * integer3] = akf.a(akk.H);
					} else {
						arr7[integer9 + integer8 * integer3] = akf.a(this.e[this.a(this.e.length)]);
					}
				} else if (integer10 == 4) {
					arr7[integer9 + integer8 * integer3] = akf.a(this.f[this.a(this.f.length)]);
				} else {
					arr7[integer9 + integer8 * integer3] = akf.a(akk.p);
				}
			}
		}

		return arr7;
	}
}

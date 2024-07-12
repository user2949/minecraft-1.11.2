public abstract class baj {
	private long c;
	protected baj a;
	private long d;
	protected long b;

	public static baj[] a(long long1, ajx ajx, avq avq) {
		baj baj5 = new bai(1L);
		baj5 = new baf(2000L, baj5);
		baj5 = new azz(1L, baj5);
		baj5 = new baw(2001L, baj5);
		baj5 = new azz(2L, baj5);
		baj5 = new azz(50L, baj5);
		baj5 = new azz(70L, baj5);
		baj5 = new bam(2L, baj5);
		baj5 = new bab(2L, baj5);
		baj5 = new azz(3L, baj5);
		baj5 = new azy(2L, baj5, azy.a.COOL_WARM);
		baj5 = new azy(2L, baj5, azy.a.HEAT_ICE);
		baj5 = new azy(3L, baj5, azy.a.SPECIAL);
		baj5 = new baw(2002L, baj5);
		baj5 = new baw(2003L, baj5);
		baj5 = new azz(4L, baj5);
		baj5 = new baa(5L, baj5);
		baj5 = new azx(4L, baj5);
		baj5 = baw.b(1000L, baj5, 0);
		int integer6 = 4;
		int integer7 = integer6;
		if (avq != null) {
			integer6 = avq.H;
			integer7 = avq.I;
		}

		if (ajx == ajx.d) {
			integer6 = 6;
		}

		baj baj8 = baw.b(1000L, baj5, 0);
		baj var30 = new ban(100L, baj8);
		baj baj9 = new bad(200L, baj5, ajx, avq);
		baj var35 = baw.b(1000L, baj9, 2);
		baj var36 = new bac(1000L, var35);
		baj baj10 = baw.b(1000L, var30, 2);
		baj var37 = new bal(1000L, var36, baj10);
		baj8 = baw.b(1000L, var30, 2);
		baj8 = baw.b(1000L, baj8, integer7);
		baj var33 = new bao(1L, baj8);
		baj var34 = new bar(1000L, var33);
		baj9 = new bak(1001L, var37);

		for (int integer11 = 0; integer11 < integer6; integer11++) {
			baj9 = new baw((long)(1000 + integer11), baj9);
			if (integer11 == 0) {
				baj9 = new azz(3L, baj9);
			}

			if (integer11 == 1 || integer6 == 1) {
				baj9 = new baq(1000L, baj9);
			}
		}

		baj var39 = new bar(1000L, baj9);
		baj var40 = new bap(100L, var39, var34);
		baj baj12 = new bav(10L, var40);
		var40.a(long1);
		baj12.a(long1);
		return new baj[]{var40, baj12, var40};
	}

	public baj(long long1) {
		this.b = long1;
		this.b = this.b * (this.b * 6364136223846793005L + 1442695040888963407L);
		this.b += long1;
		this.b = this.b * (this.b * 6364136223846793005L + 1442695040888963407L);
		this.b += long1;
		this.b = this.b * (this.b * 6364136223846793005L + 1442695040888963407L);
		this.b += long1;
	}

	public void a(long long1) {
		this.c = long1;
		if (this.a != null) {
			this.a.a(long1);
		}

		this.c = this.c * (this.c * 6364136223846793005L + 1442695040888963407L);
		this.c = this.c + this.b;
		this.c = this.c * (this.c * 6364136223846793005L + 1442695040888963407L);
		this.c = this.c + this.b;
		this.c = this.c * (this.c * 6364136223846793005L + 1442695040888963407L);
		this.c = this.c + this.b;
	}

	public void a(long long1, long long2) {
		this.d = this.c;
		this.d = this.d * (this.d * 6364136223846793005L + 1442695040888963407L);
		this.d += long1;
		this.d = this.d * (this.d * 6364136223846793005L + 1442695040888963407L);
		this.d += long2;
		this.d = this.d * (this.d * 6364136223846793005L + 1442695040888963407L);
		this.d += long1;
		this.d = this.d * (this.d * 6364136223846793005L + 1442695040888963407L);
		this.d += long2;
	}

	protected int a(int integer) {
		int integer3 = (int)((this.d >> 24) % (long)integer);
		if (integer3 < 0) {
			integer3 += integer;
		}

		this.d = this.d * (this.d * 6364136223846793005L + 1442695040888963407L);
		this.d = this.d + this.c;
		return integer3;
	}

	public abstract int[] a(int integer1, int integer2, int integer3, int integer4);

	protected static boolean a(int integer1, int integer2) {
		if (integer1 == integer2) {
			return true;
		} else {
			akf akf3 = akf.b(integer1);
			akf akf4 = akf.b(integer2);
			if (akf3 == null || akf4 == null) {
				return false;
			} else {
				return akf3 != akk.N && akf3 != akk.O ? akf3 == akf4 || akf3.g() == akf4.g() : akf4 == akk.N || akf4 == akk.O;
			}
		}
	}

	protected static boolean b(int integer) {
		akf akf2 = akf.b(integer);
		return akf2 == akk.a || akf2 == akk.z || akf2 == akk.l;
	}

	protected int a(int... arr) {
		return arr[this.a(arr.length)];
	}

	protected int b(int integer1, int integer2, int integer3, int integer4) {
		if (integer2 == integer3 && integer3 == integer4) {
			return integer2;
		} else if (integer1 == integer2 && integer1 == integer3) {
			return integer1;
		} else if (integer1 == integer2 && integer1 == integer4) {
			return integer1;
		} else if (integer1 == integer3 && integer1 == integer4) {
			return integer1;
		} else if (integer1 == integer2 && integer3 != integer4) {
			return integer1;
		} else if (integer1 == integer3 && integer2 != integer4) {
			return integer1;
		} else if (integer1 == integer4 && integer2 != integer3) {
			return integer1;
		} else if (integer2 == integer3 && integer1 != integer4) {
			return integer2;
		} else if (integer2 == integer4 && integer1 != integer3) {
			return integer2;
		} else {
			return integer3 == integer4 && integer1 != integer2 ? integer3 : this.a(integer1, integer2, integer3, integer4);
		}
	}
}

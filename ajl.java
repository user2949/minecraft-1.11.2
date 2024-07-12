public class ajl {
	public final int a;
	public final int b;

	public ajl(int integer1, int integer2) {
		this.a = integer1;
		this.b = integer2;
	}

	public ajl(co co) {
		this.a = co.p() >> 4;
		this.b = co.r() >> 4;
	}

	public static long a(int integer1, int integer2) {
		return (long)integer1 & 4294967295L | ((long)integer2 & 4294967295L) << 32;
	}

	public int hashCode() {
		int integer2 = 1664525 * this.a + 1013904223;
		int integer3 = 1664525 * (this.b ^ -559038737) + 1013904223;
		return integer2 ^ integer3;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof ajl)) {
			return false;
		} else {
			ajl ajl3 = (ajl)object;
			return this.a == ajl3.a && this.b == ajl3.b;
		}
	}

	public double a(sn sn) {
		double double3 = (double)(this.a * 16 + 8);
		double double5 = (double)(this.b * 16 + 8);
		double double7 = double3 - sn.p;
		double double9 = double5 - sn.r;
		return double7 * double7 + double9 * double9;
	}

	public int c() {
		return this.a << 4;
	}

	public int d() {
		return this.b << 4;
	}

	public int e() {
		return (this.a << 4) + 15;
	}

	public int f() {
		return (this.b << 4) + 15;
	}

	public co a(int integer1, int integer2, int integer3) {
		return new co((this.a << 4) + integer1, integer2, (this.b << 4) + integer3);
	}

	public String toString() {
		return "[" + this.a + ", " + this.b + "]";
	}
}

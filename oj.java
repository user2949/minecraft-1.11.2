public class oj {
	private final long[] a = new long[240];
	private int b;
	private int c;
	private int d;

	public void a(long long1) {
		this.a[this.d] = long1;
		this.d++;
		if (this.d == 240) {
			this.d = 0;
		}

		if (this.c < 240) {
			this.b = 0;
			this.c++;
		} else {
			this.b = this.b(this.d + 1);
		}
	}

	public int a(long long1, int integer) {
		double double5 = (double)long1 / 1.6666666E7;
		return (int)(double5 * (double)integer);
	}

	public int a() {
		return this.b;
	}

	public int b() {
		return this.d;
	}

	public int b(int integer) {
		return integer % 240;
	}

	public long[] c() {
		return this.a;
	}
}

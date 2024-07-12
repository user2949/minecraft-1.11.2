public class bfk {
	private final double a;
	private final double b;
	private int c;
	private int d;
	private int e;

	public bfk(bes bes) {
		this.c = bes.d;
		this.d = bes.e;
		this.e = 1;
		boolean boolean3 = bes.e();
		int integer4 = bes.u.aC;
		if (integer4 == 0) {
			integer4 = 1000;
		}

		while (this.e < integer4 && this.c / (this.e + 1) >= 320 && this.d / (this.e + 1) >= 240) {
			this.e++;
		}

		if (boolean3 && this.e % 2 != 0 && this.e != 1) {
			this.e--;
		}

		this.a = (double)this.c / (double)this.e;
		this.b = (double)this.d / (double)this.e;
		this.c = ot.f(this.a);
		this.d = ot.f(this.b);
	}

	public int a() {
		return this.c;
	}

	public int b() {
		return this.d;
	}

	public double c() {
		return this.a;
	}

	public double d() {
		return this.b;
	}

	public int e() {
		return this.e;
	}
}

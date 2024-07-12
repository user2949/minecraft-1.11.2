public class bey {
	float a;
	private double f;
	public int b;
	public float c;
	public float d = 1.0F;
	public float e;
	private long g;
	private long h;
	private long i;
	private double j = 1.0;

	public bey(float float1) {
		this.a = float1;
		this.g = bes.I();
		this.h = System.nanoTime() / 1000000L;
	}

	public void a() {
		long long2 = bes.I();
		long long4 = long2 - this.g;
		long long6 = System.nanoTime() / 1000000L;
		double double8 = (double)long6 / 1000.0;
		if (long4 <= 1000L && long4 >= 0L) {
			this.i += long4;
			if (this.i > 1000L) {
				long long10 = long6 - this.h;
				double double12 = (double)this.i / (double)long10;
				this.j = this.j + (double12 - this.j) * 0.2F;
				this.h = long6;
				this.i = 0L;
			}

			if (this.i < 0L) {
				this.h = long6;
			}
		} else {
			this.f = double8;
		}

		this.g = long2;
		double double10 = (double8 - this.f) * this.j;
		this.f = double8;
		double10 = ot.a(double10, 0.0, 1.0);
		this.e = (float)((double)this.e + double10 * (double)this.d * (double)this.a);
		this.b = (int)this.e;
		this.e = this.e - (float)this.b;
		if (this.b > 10) {
			this.b = 10;
		}

		this.c = this.e;
	}
}

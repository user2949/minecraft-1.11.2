public class lp {
	private final int a;
	private final co b;
	private int c;
	private int d;

	public lp(int integer, co co) {
		this.a = integer;
		this.b = co;
	}

	public co b() {
		return this.b;
	}

	public void a(int integer) {
		if (integer > 10) {
			integer = 10;
		}

		this.c = integer;
	}

	public int c() {
		return this.c;
	}

	public void b(int integer) {
		this.d = integer;
	}

	public int d() {
		return this.d;
	}
}

public class wo {
	private final co a;
	private final co b;
	private final cv c;
	private int d;
	private boolean e;
	private int f;

	public wo(co co, int integer2, int integer3, int integer4) {
		this(co, a(integer2, integer3), integer4);
	}

	private static cv a(int integer1, int integer2) {
		if (integer1 < 0) {
			return cv.WEST;
		} else if (integer1 > 0) {
			return cv.EAST;
		} else {
			return integer2 < 0 ? cv.NORTH : cv.SOUTH;
		}
	}

	public wo(co co, cv cv, int integer) {
		this.a = co;
		this.c = cv;
		this.b = co.a(cv, 2);
		this.d = integer;
	}

	public int b(int integer1, int integer2, int integer3) {
		return (int)this.a.f((double)integer1, (double)integer2, (double)integer3);
	}

	public int a(co co) {
		return (int)co.n(this.d());
	}

	public int b(co co) {
		return (int)this.b.n(co);
	}

	public boolean c(co co) {
		int integer3 = co.p() - this.a.p();
		int integer4 = co.r() - this.a.q();
		return integer3 * this.c.g() + integer4 * this.c.i() >= 0;
	}

	public void a() {
		this.f = 0;
	}

	public void b() {
		this.f++;
	}

	public int c() {
		return this.f;
	}

	public co d() {
		return this.a;
	}

	public co e() {
		return this.b;
	}

	public int f() {
		return this.c.g() * 2;
	}

	public int g() {
		return this.c.i() * 2;
	}

	public int h() {
		return this.d;
	}

	public void a(int integer) {
		this.d = integer;
	}

	public boolean i() {
		return this.e;
	}

	public void a(boolean boolean1) {
		this.e = boolean1;
	}

	public cv j() {
		return this.c;
	}
}

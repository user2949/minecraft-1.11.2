public class axv {
	private final int a;
	private atl b;
	private int c = 1;
	private int d;

	public axv(int integer, alu alu) {
		this(3, integer, alu);
	}

	public axv(int integer1, int integer2, alu alu) {
		this.a = integer1;
		this.c = integer2;
		this.b = alu.t();
	}

	public axv(int integer1, int integer2, alu alu, int integer4) {
		this(integer1, integer2, alu);
		this.b = alu.a(integer4);
	}

	public int b() {
		return this.c;
	}

	public atl c() {
		return this.b;
	}

	private alu e() {
		return this.b.v();
	}

	private int f() {
		return this.b.v().e(this.b);
	}

	public int d() {
		return this.d;
	}

	public void b(int integer) {
		this.d = integer;
	}

	public String toString() {
		String string2;
		if (this.a >= 3) {
			kq kq3 = alu.h.b(this.e());
			string2 = kq3 == null ? "null" : kq3.toString();
			if (this.c > 1) {
				string2 = this.c + "*" + string2;
			}
		} else {
			string2 = Integer.toString(alu.a(this.e()));
			if (this.c > 1) {
				string2 = this.c + "x" + string2;
			}
		}

		int integer3 = this.f();
		if (integer3 > 0) {
			string2 = string2 + ":" + integer3;
		}

		return string2;
	}
}

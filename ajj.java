public class ajj {
	private final co a;
	private final alu b;
	private final int c;
	private final int d;

	public ajj(co co, alu alu, int integer3, int integer4) {
		this.a = co;
		this.c = integer3;
		this.d = integer4;
		this.b = alu;
	}

	public co a() {
		return this.a;
	}

	public int b() {
		return this.c;
	}

	public int c() {
		return this.d;
	}

	public alu d() {
		return this.b;
	}

	public boolean equals(Object object) {
		if (!(object instanceof ajj)) {
			return false;
		} else {
			ajj ajj3 = (ajj)object;
			return this.a.equals(ajj3.a) && this.c == ajj3.c && this.d == ajj3.d && this.b == ajj3.b;
		}
	}

	public String toString() {
		return "TE(" + this.a + ")," + this.c + "," + this.d + "," + this.b;
	}
}

public class aup {
	private final int a;
	private int b;
	private int c;
	private final auh d;
	private auk e;
	private auk f;

	public aup(int integer, boolean boolean2) {
		this.a = integer;
		this.d = new auh();
		this.e = new auk();
		if (boolean2) {
			this.f = new auk();
		}
	}

	public atl a(int integer1, int integer2, int integer3) {
		return this.d.a(integer1, integer2, integer3);
	}

	public void a(int integer1, int integer2, int integer3, atl atl) {
		atl atl6 = this.a(integer1, integer2, integer3);
		alu alu7 = atl6.v();
		alu alu8 = atl.v();
		if (alu7 != alv.a) {
			this.b--;
			if (alu7.k()) {
				this.c--;
			}
		}

		if (alu8 != alv.a) {
			this.b++;
			if (alu8.k()) {
				this.c++;
			}
		}

		this.d.a(integer1, integer2, integer3, atl);
	}

	public boolean a() {
		return this.b == 0;
	}

	public boolean b() {
		return this.c > 0;
	}

	public int d() {
		return this.a;
	}

	public void a(int integer1, int integer2, int integer3, int integer4) {
		this.f.a(integer1, integer2, integer3, integer4);
	}

	public int b(int integer1, int integer2, int integer3) {
		return this.f.a(integer1, integer2, integer3);
	}

	public void b(int integer1, int integer2, int integer3, int integer4) {
		this.e.a(integer1, integer2, integer3, integer4);
	}

	public int c(int integer1, int integer2, int integer3) {
		return this.e.a(integer1, integer2, integer3);
	}

	public void e() {
		this.b = 0;
		this.c = 0;

		for (int integer2 = 0; integer2 < 16; integer2++) {
			for (int integer3 = 0; integer3 < 16; integer3++) {
				for (int integer4 = 0; integer4 < 16; integer4++) {
					alu alu5 = this.a(integer2, integer3, integer4).v();
					if (alu5 != alv.a) {
						this.b++;
						if (alu5.k()) {
							this.c++;
						}
					}
				}
			}
		}
	}

	public auh g() {
		return this.d;
	}

	public auk h() {
		return this.e;
	}

	public auk i() {
		return this.f;
	}

	public void a(auk auk) {
		this.e = auk;
	}

	public void b(auk auk) {
		this.f = auk;
	}
}

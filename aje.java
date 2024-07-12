public class aje {
	private afj a;
	private afj b;
	private afj c;
	private int d;
	private int e;
	private boolean f;

	public aje(du du) {
		this.a = afj.a;
		this.b = afj.a;
		this.c = afj.a;
		this.a(du);
	}

	public aje(afj afj1, afj afj2, afj afj3) {
		this(afj1, afj2, afj3, 0, 7);
	}

	public aje(afj afj1, afj afj2, afj afj3, int integer4, int integer5) {
		this.a = afj.a;
		this.b = afj.a;
		this.c = afj.a;
		this.a = afj1;
		this.b = afj2;
		this.c = afj3;
		this.d = integer4;
		this.e = integer5;
		this.f = true;
	}

	public aje(afj afj1, afj afj2) {
		this(afj1, afj.a, afj2);
	}

	public aje(afj afj, afh afh) {
		this(afj, new afj(afh));
	}

	public afj a() {
		return this.a;
	}

	public afj b() {
		return this.b;
	}

	public boolean c() {
		return !this.b.b();
	}

	public afj d() {
		return this.c;
	}

	public int e() {
		return this.d;
	}

	public int f() {
		return this.e;
	}

	public void g() {
		this.d++;
	}

	public void a(int integer) {
		this.e += integer;
	}

	public boolean h() {
		return this.d >= this.e;
	}

	public void i() {
		this.d = this.e;
	}

	public boolean j() {
		return this.f;
	}

	public void a(du du) {
		du du3 = du.o("buy");
		this.a = new afj(du3);
		du du4 = du.o("sell");
		this.c = new afj(du4);
		if (du.b("buyB", 10)) {
			this.b = new afj(du.o("buyB"));
		}

		if (du.b("uses", 99)) {
			this.d = du.h("uses");
		}

		if (du.b("maxUses", 99)) {
			this.e = du.h("maxUses");
		} else {
			this.e = 7;
		}

		if (du.b("rewardExp", 1)) {
			this.f = du.p("rewardExp");
		} else {
			this.f = true;
		}
	}

	public du k() {
		du du2 = new du();
		du2.a("buy", this.a.a(new du()));
		du2.a("sell", this.c.a(new du()));
		if (!this.b.b()) {
			du2.a("buyB", this.b.a(new du()));
		}

		du2.a("uses", this.d);
		du2.a("maxUses", this.e);
		du2.a("rewardExp", this.f);
		return du2;
	}
}

public class adf extends adl {
	private final add a;
	private final aay b;
	private int c;
	private final ajd h;

	public adf(aay aay, ajd ajd, add add, int integer4, int integer5, int integer6) {
		super(add, integer4, integer5, integer6);
		this.b = aay;
		this.h = ajd;
		this.a = add;
	}

	@Override
	public boolean a(afj afj) {
		return false;
	}

	@Override
	public afj a(int integer) {
		if (this.e()) {
			this.c = this.c + Math.min(integer, this.d().E());
		}

		return super.a(integer);
	}

	@Override
	protected void a(afj afj, int integer) {
		this.c += integer;
		this.c(afj);
	}

	@Override
	protected void c(afj afj) {
		afj.a(this.b.l, this.b, this.c);
		this.c = 0;
	}

	@Override
	public afj a(aay aay, afj afj) {
		this.c(afj);
		aje aje4 = this.a.j();
		if (aje4 != null) {
			afj afj5 = this.a.a(0);
			afj afj6 = this.a.a(1);
			if (this.a(aje4, afj5, afj6) || this.a(aje4, afj6, afj5)) {
				this.h.a(aje4);
				aay.b(oa.G);
				this.a.a(0, afj5);
				this.a.a(1, afj6);
			}
		}

		return afj;
	}

	private boolean a(aje aje, afj afj2, afj afj3) {
		afj afj5 = aje.a();
		afj afj6 = aje.b();
		if (afj2.c() == afj5.c() && afj2.E() >= afj5.E()) {
			if (!afj6.b() && !afj3.b() && afj6.c() == afj3.c() && afj3.E() >= afj6.E()) {
				afj2.g(afj5.E());
				afj3.g(afj6.E());
				return true;
			}

			if (afj6.b() && afj3.b()) {
				afj2.g(afj5.E());
				return true;
			}
		}

		return false;
	}
}

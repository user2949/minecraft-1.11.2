public class adi extends adl {
	private final acs a;
	private final aay b;
	private int c;

	public adi(aay aay, acs acs, rc rc, int integer4, int integer5, int integer6) {
		super(rc, integer4, integer5, integer6);
		this.b = aay;
		this.a = acs;
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
	protected void b(int integer) {
		this.c += integer;
	}

	@Override
	protected void c(afj afj) {
		if (this.c > 0) {
			afj.a(this.b.l, this.b, this.c);
		}

		this.c = 0;
		if (afj.c() == afh.a(alv.ai)) {
			this.b.b(nr.h);
		}

		if (afj.c() instanceof afu) {
			this.b.b(nr.i);
		}

		if (afj.c() == afh.a(alv.al)) {
			this.b.b(nr.j);
		}

		if (afj.c() instanceof afg) {
			this.b.b(nr.l);
		}

		if (afj.c() == afl.S) {
			this.b.b(nr.m);
		}

		if (afj.c() == afl.bh) {
			this.b.b(nr.n);
		}

		if (afj.c() instanceof afu && ((afu)afj.c()).g() != afh.a.WOOD) {
			this.b.b(nr.o);
		}

		if (afj.c() instanceof agr) {
			this.b.b(nr.r);
		}

		if (afj.c() == afh.a(alv.bC)) {
			this.b.b(nr.E);
		}

		if (afj.c() == afh.a(alv.X)) {
			this.b.b(nr.G);
		}
	}

	@Override
	public afj a(aay aay, afj afj) {
		this.c(afj);
		dd<afj> dd4 = ahp.a().b(this.a, aay.l);

		for (int integer5 = 0; integer5 < dd4.size(); integer5++) {
			afj afj6 = this.a.a(integer5);
			afj afj7 = dd4.get(integer5);
			if (!afj6.b()) {
				this.a.a(integer5, 1);
				afj6 = this.a.a(integer5);
			}

			if (!afj7.b()) {
				if (afj6.b()) {
					this.a.a(integer5, afj7);
				} else if (afj.c(afj6, afj7) && afj.a(afj6, afj7)) {
					afj7.f(afj6.E());
					this.a.a(integer5, afj7);
				} else if (!this.b.bs.c(afj7)) {
					this.b.a(afj7, false);
				}
			}
		}

		return afj;
	}
}

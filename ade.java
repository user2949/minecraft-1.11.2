public class ade extends acl {
	private final ajd a;
	private final add f;
	private final ajs g;

	public ade(aax aax, ajd ajd, ajs ajs) {
		this.a = ajd;
		this.g = ajs;
		this.f = new add(aax.e, ajd);
		this.a(new adl(this.f, 0, 36, 53));
		this.a(new adl(this.f, 1, 62, 53));
		this.a(new adf(aax.e, ajd, this.f, 2, 120, 53));

		for (int integer5 = 0; integer5 < 3; integer5++) {
			for (int integer6 = 0; integer6 < 9; integer6++) {
				this.a(new adl(aax, integer6 + integer5 * 9 + 9, 8 + integer6 * 18, 84 + integer5 * 18));
			}
		}

		for (int integer5 = 0; integer5 < 9; integer5++) {
			this.a(new adl(aax, integer5, 8 + integer5 * 18, 142));
		}
	}

	public add e() {
		return this.f;
	}

	@Override
	public void a(rc rc) {
		this.f.i();
		super.a(rc);
	}

	public void d(int integer) {
		this.f.d(integer);
	}

	@Override
	public boolean a(aay aay) {
		return this.a.s_() == aay;
	}

	@Override
	public afj b(aay aay, int integer) {
		afj afj4 = afj.a;
		adl adl5 = (adl)this.c.get(integer);
		if (adl5 != null && adl5.e()) {
			afj afj6 = adl5.d();
			afj4 = afj6.l();
			if (integer == 2) {
				if (!this.a(afj6, 3, 39, true)) {
					return afj.a;
				}

				adl5.a(afj6, afj4);
			} else if (integer != 0 && integer != 1) {
				if (integer >= 3 && integer < 30) {
					if (!this.a(afj6, 30, 39, false)) {
						return afj.a;
					}
				} else if (integer >= 30 && integer < 39 && !this.a(afj6, 3, 30, false)) {
					return afj.a;
				}
			} else if (!this.a(afj6, 3, 39, false)) {
				return afj.a;
			}

			if (afj6.b()) {
				adl5.d(afj.a);
			} else {
				adl5.f();
			}

			if (afj6.E() == afj4.E()) {
				return afj.a;
			}

			adl5.a(aay, afj6);
		}

		return afj4;
	}

	@Override
	public void b(aay aay) {
		super.b(aay);
		this.a.a_(null);
		super.b(aay);
		if (!this.g.E) {
			afj afj3 = this.f.b(0);
			if (!afj3.b()) {
				aay.a(afj3, false);
			}

			afj3 = this.f.b(1);
			if (!afj3.b()) {
				aay.a(afj3, false);
			}
		}
	}
}

public class acn extends acl {
	private final rc a;
	private final acn.a f;

	public acn(rc rc1, rc rc2) {
		this.a = rc2;
		this.f = new acn.a(rc2, 0, 136, 110);
		this.a(this.f);
		int integer4 = 36;
		int integer5 = 137;

		for (int integer6 = 0; integer6 < 3; integer6++) {
			for (int integer7 = 0; integer7 < 9; integer7++) {
				this.a(new adl(rc1, integer7 + integer6 * 9 + 9, 36 + integer7 * 18, 137 + integer6 * 18));
			}
		}

		for (int integer6 = 0; integer6 < 9; integer6++) {
			this.a(new adl(rc1, integer6, 36 + integer6 * 18, 195));
		}
	}

	@Override
	public void a(acr acr) {
		super.a(acr);
		acr.a(this, this.a);
	}

	@Override
	public void b(int integer1, int integer2) {
		this.a.b(integer1, integer2);
	}

	public rc e() {
		return this.a;
	}

	@Override
	public void b(aay aay) {
		super.b(aay);
		if (aay != null && !aay.l.E) {
			afj afj3 = this.f.a(this.f.a());
			if (!afj3.b()) {
				aay.a(afj3, false);
			}
		}
	}

	@Override
	public boolean a(aay aay) {
		return this.a.a(aay);
	}

	@Override
	public afj b(aay aay, int integer) {
		afj afj4 = afj.a;
		adl adl5 = (adl)this.c.get(integer);
		if (adl5 != null && adl5.e()) {
			afj afj6 = adl5.d();
			afj4 = afj6.l();
			if (integer == 0) {
				if (!this.a(afj6, 1, 37, true)) {
					return afj.a;
				}

				adl5.a(afj6, afj4);
			} else if (!this.f.e() && this.f.a(afj6) && afj6.E() == 1) {
				if (!this.a(afj6, 0, 1, false)) {
					return afj.a;
				}
			} else if (integer >= 1 && integer < 28) {
				if (!this.a(afj6, 28, 37, false)) {
					return afj.a;
				}
			} else if (integer >= 28 && integer < 37) {
				if (!this.a(afj6, 1, 28, false)) {
					return afj.a;
				}
			} else if (!this.a(afj6, 1, 37, false)) {
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

	class a extends adl {
		public a(rc rc, int integer3, int integer4, int integer5) {
			super(rc, integer3, integer4, integer5);
		}

		@Override
		public boolean a(afj afj) {
			afh afh3 = afj.c();
			return afh3 == afl.bZ || afh3 == afl.l || afh3 == afl.n || afh3 == afl.m;
		}

		@Override
		public int a() {
			return 1;
		}
	}
}

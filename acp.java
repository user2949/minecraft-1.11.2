public class acp extends acl {
	private final rc a;
	private final int f;

	public acp(rc rc1, rc rc2, aay aay) {
		this.a = rc2;
		this.f = rc2.v_() / 9;
		rc2.b(aay);
		int integer5 = (this.f - 4) * 18;

		for (int integer6 = 0; integer6 < this.f; integer6++) {
			for (int integer7 = 0; integer7 < 9; integer7++) {
				this.a(new adl(rc2, integer7 + integer6 * 9, 8 + integer7 * 18, 18 + integer6 * 18));
			}
		}

		for (int integer6 = 0; integer6 < 3; integer6++) {
			for (int integer7 = 0; integer7 < 9; integer7++) {
				this.a(new adl(rc1, integer7 + integer6 * 9 + 9, 8 + integer7 * 18, 103 + integer6 * 18 + integer5));
			}
		}

		for (int integer6 = 0; integer6 < 9; integer6++) {
			this.a(new adl(rc1, integer6, 8 + integer6 * 18, 161 + integer5));
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
			if (integer < this.f * 9) {
				if (!this.a(afj6, this.f * 9, this.c.size(), true)) {
					return afj.a;
				}
			} else if (!this.a(afj6, 0, this.f * 9, false)) {
				return afj.a;
			}

			if (afj6.b()) {
				adl5.d(afj.a);
			} else {
				adl5.f();
			}
		}

		return afj4;
	}

	@Override
	public void b(aay aay) {
		super.b(aay);
		this.a.c(aay);
	}

	public rc e() {
		return this.a;
	}
}

public class acu extends acl {
	private final rc a;

	public acu(rc rc1, rc rc2) {
		this.a = rc2;

		for (int integer4 = 0; integer4 < 3; integer4++) {
			for (int integer5 = 0; integer5 < 3; integer5++) {
				this.a(new adl(rc2, integer5 + integer4 * 3, 62 + integer5 * 18, 17 + integer4 * 18));
			}
		}

		for (int integer4 = 0; integer4 < 3; integer4++) {
			for (int integer5 = 0; integer5 < 9; integer5++) {
				this.a(new adl(rc1, integer5 + integer4 * 9 + 9, 8 + integer5 * 18, 84 + integer4 * 18));
			}
		}

		for (int integer4 = 0; integer4 < 9; integer4++) {
			this.a(new adl(rc1, integer4, 8 + integer4 * 18, 142));
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
			if (integer < 9) {
				if (!this.a(afj6, 9, 45, true)) {
					return afj.a;
				}
			} else if (!this.a(afj6, 0, 9, false)) {
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
}

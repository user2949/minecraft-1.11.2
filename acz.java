public class acz extends acl {
	private final rc a;

	public acz(aax aax, rc rc, aay aay) {
		this.a = rc;
		rc.b(aay);
		int integer5 = 51;

		for (int integer6 = 0; integer6 < rc.v_(); integer6++) {
			this.a(new adl(rc, integer6, 44 + integer6 * 18, 20));
		}

		for (int integer6 = 0; integer6 < 3; integer6++) {
			for (int integer7 = 0; integer7 < 9; integer7++) {
				this.a(new adl(aax, integer7 + integer6 * 9 + 9, 8 + integer7 * 18, integer6 * 18 + 51));
			}
		}

		for (int integer6 = 0; integer6 < 9; integer6++) {
			this.a(new adl(aax, integer6, 8 + integer6 * 18, 109));
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
			if (integer < this.a.v_()) {
				if (!this.a(afj6, this.a.v_(), this.c.size(), true)) {
					return afj.a;
				}
			} else if (!this.a(afj6, 0, this.a.v_(), false)) {
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
}

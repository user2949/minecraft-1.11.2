public class acx extends acl {
	private final rc a;
	private int f;
	private int g;
	private int h;
	private int i;

	public acx(aax aax, rc rc) {
		this.a = rc;
		this.a(new adl(rc, 0, 56, 17));
		this.a(new acw(rc, 1, 56, 53));
		this.a(new acy(aax.e, rc, 2, 116, 35));

		for (int integer4 = 0; integer4 < 3; integer4++) {
			for (int integer5 = 0; integer5 < 9; integer5++) {
				this.a(new adl(aax, integer5 + integer4 * 9 + 9, 8 + integer5 * 18, 84 + integer4 * 18));
			}
		}

		for (int integer4 = 0; integer4 < 9; integer4++) {
			this.a(new adl(aax, integer4, 8 + integer4 * 18, 142));
		}
	}

	@Override
	public void a(acr acr) {
		super.a(acr);
		acr.a(this, this.a);
	}

	@Override
	public void b() {
		super.b();

		for (int integer2 = 0; integer2 < this.e.size(); integer2++) {
			acr acr3 = (acr)this.e.get(integer2);
			if (this.f != this.a.c_(2)) {
				acr3.a(this, 2, this.a.c_(2));
			}

			if (this.h != this.a.c_(0)) {
				acr3.a(this, 0, this.a.c_(0));
			}

			if (this.i != this.a.c_(1)) {
				acr3.a(this, 1, this.a.c_(1));
			}

			if (this.g != this.a.c_(3)) {
				acr3.a(this, 3, this.a.c_(3));
			}
		}

		this.f = this.a.c_(2);
		this.h = this.a.c_(0);
		this.i = this.a.c_(1);
		this.g = this.a.c_(3);
	}

	@Override
	public void b(int integer1, int integer2) {
		this.a.b(integer1, integer2);
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
			if (integer == 2) {
				if (!this.a(afj6, 3, 39, true)) {
					return afj.a;
				}

				adl5.a(afj6, afj4);
			} else if (integer != 1 && integer != 0) {
				if (!ahk.a().a(afj6).b()) {
					if (!this.a(afj6, 0, 1, false)) {
						return afj.a;
					}
				} else if (asn.c(afj6)) {
					if (!this.a(afj6, 1, 2, false)) {
						return afj.a;
					}
				} else if (integer >= 3 && integer < 30) {
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
}

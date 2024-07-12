public class act extends acl {
	public acs a = new acs(this, 3, 3);
	public rc f = new adh();
	private final ajs g;
	private final co h;

	public act(aax aax, ajs ajs, co co) {
		this.g = ajs;
		this.h = co;
		this.a(new adi(aax.e, this.a, this.f, 0, 124, 35));

		for (int integer5 = 0; integer5 < 3; integer5++) {
			for (int integer6 = 0; integer6 < 3; integer6++) {
				this.a(new adl(this.a, integer6 + integer5 * 3, 30 + integer6 * 18, 17 + integer5 * 18));
			}
		}

		for (int integer5 = 0; integer5 < 3; integer5++) {
			for (int integer6 = 0; integer6 < 9; integer6++) {
				this.a(new adl(aax, integer6 + integer5 * 9 + 9, 8 + integer6 * 18, 84 + integer5 * 18));
			}
		}

		for (int integer5 = 0; integer5 < 9; integer5++) {
			this.a(new adl(aax, integer5, 8 + integer5 * 18, 142));
		}

		this.a(this.a);
	}

	@Override
	public void a(rc rc) {
		this.f.a(0, ahp.a().a(this.a, this.g));
	}

	@Override
	public void b(aay aay) {
		super.b(aay);
		if (!this.g.E) {
			for (int integer3 = 0; integer3 < 9; integer3++) {
				afj afj4 = this.a.b(integer3);
				if (!afj4.b()) {
					aay.a(afj4, false);
				}
			}
		}
	}

	@Override
	public boolean a(aay aay) {
		return this.g.o(this.h).v() != alv.ai ? false : !(aay.d((double)this.h.p() + 0.5, (double)this.h.q() + 0.5, (double)this.h.r() + 0.5) > 64.0);
	}

	@Override
	public afj b(aay aay, int integer) {
		afj afj4 = afj.a;
		adl adl5 = (adl)this.c.get(integer);
		if (adl5 != null && adl5.e()) {
			afj afj6 = adl5.d();
			afj4 = afj6.l();
			if (integer == 0) {
				afj6.c().b(afj6, this.g, aay);
				if (!this.a(afj6, 10, 46, true)) {
					return afj.a;
				}

				adl5.a(afj6, afj4);
			} else if (integer >= 10 && integer < 37) {
				if (!this.a(afj6, 37, 46, false)) {
					return afj.a;
				}
			} else if (integer >= 37 && integer < 46) {
				if (!this.a(afj6, 10, 37, false)) {
					return afj.a;
				}
			} else if (!this.a(afj6, 10, 46, false)) {
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

			afj afj7 = adl5.a(aay, afj6);
			if (integer == 0) {
				aay.a(afj7, false);
			}
		}

		return afj4;
	}

	@Override
	public boolean a(afj afj, adl adl) {
		return adl.d != this.f && super.a(afj, adl);
	}
}

public class adb extends acl {
	private final rc a;
	private final xm f;

	public adb(rc rc1, rc rc2, xm xm, aay aay) {
		this.a = rc2;
		this.f = xm;
		int integer6 = 3;
		rc2.b(aay);
		int integer7 = -18;
		this.a(new adl(rc2, 0, 8, 18) {
			@Override
			public boolean a(afj afj) {
				return afj.c() == afl.aD && !this.e() && xm.dA();
			}

			@Override
			public boolean b() {
				return xm.dA();
			}
		});
		this.a(new adl(rc2, 1, 8, 36) {
			@Override
			public boolean a(afj afj) {
				return xm.f(afj);
			}

			@Override
			public boolean b() {
				return xm.dK();
			}

			@Override
			public int a() {
				return 1;
			}
		});
		if (xm instanceof xl && ((xl)xm).dh()) {
			for (int integer8 = 0; integer8 < 3; integer8++) {
				for (int integer9 = 0; integer9 < ((xl)xm).dl(); integer9++) {
					this.a(new adl(rc2, 2 + integer9 + integer8 * ((xl)xm).dl(), 80 + integer9 * 18, 18 + integer8 * 18));
				}
			}
		}

		for (int integer8 = 0; integer8 < 3; integer8++) {
			for (int integer9 = 0; integer9 < 9; integer9++) {
				this.a(new adl(rc1, integer9 + integer8 * 9 + 9, 8 + integer9 * 18, 102 + integer8 * 18 + -18));
			}
		}

		for (int integer8 = 0; integer8 < 9; integer8++) {
			this.a(new adl(rc1, integer8, 8 + integer8 * 18, 142));
		}
	}

	@Override
	public boolean a(aay aay) {
		return this.a.a(aay) && this.f.au() && this.f.g(aay) < 8.0F;
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
			} else if (this.a(1).a(afj6) && !this.a(1).e()) {
				if (!this.a(afj6, 1, 2, false)) {
					return afj.a;
				}
			} else if (this.a(0).a(afj6)) {
				if (!this.a(afj6, 0, 1, false)) {
					return afj.a;
				}
			} else if (this.a.v_() <= 2 || !this.a(afj6, 2, this.a.v_(), false)) {
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

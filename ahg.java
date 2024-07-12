public class ahg implements aho {
	@Override
	public boolean a(acs acs, ajs ajs) {
		int integer4 = 0;
		afj afj5 = afj.a;

		for (int integer6 = 0; integer6 < acs.v_(); integer6++) {
			afj afj7 = acs.a(integer6);
			if (!afj7.b()) {
				if (afj7.c() == afl.bY) {
					if (!afj5.b()) {
						return false;
					}

					afj5 = afj7;
				} else {
					if (afj7.c() != afl.bX) {
						return false;
					}

					integer4++;
				}
			}
		}

		return !afj5.b() && afj5.o() && integer4 > 0;
	}

	@Override
	public afj a(acs acs) {
		int integer3 = 0;
		afj afj4 = afj.a;

		for (int integer5 = 0; integer5 < acs.v_(); integer5++) {
			afj afj6 = acs.a(integer5);
			if (!afj6.b()) {
				if (afj6.c() == afl.bY) {
					if (!afj4.b()) {
						return afj.a;
					}

					afj4 = afj6;
				} else {
					if (afj6.c() != afl.bX) {
						return afj.a;
					}

					integer3++;
				}
			}
		}

		if (!afj4.b() && afj4.o() && integer3 >= 1 && agx.h(afj4) < 2) {
			afj afj5 = new afj(afl.bY, integer3);
			afj5.b(afj4.p().g());
			afj5.p().a("generation", agx.h(afj4) + 1);
			if (afj4.t()) {
				afj5.g(afj4.r());
			}

			return afj5;
		} else {
			return afj.a;
		}
	}

	@Override
	public int a() {
		return 9;
	}

	@Override
	public afj b() {
		return afj.a;
	}

	@Override
	public dd<afj> b(acs acs) {
		dd<afj> dd3 = dd.a(acs.v_(), afj.a);

		for (int integer4 = 0; integer4 < dd3.size(); integer4++) {
			afj afj5 = acs.a(integer4);
			if (afj5.c() instanceof agx) {
				afj afj6 = afj5.l();
				afj6.e(1);
				dd3.set(integer4, afj6);
				break;
			}
		}

		return dd3;
	}
}

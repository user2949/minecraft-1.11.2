public class ahl implements aho {
	@Override
	public boolean a(acs acs, ajs ajs) {
		int integer4 = 0;
		afj afj5 = afj.a;

		for (int integer6 = 0; integer6 < acs.v_(); integer6++) {
			afj afj7 = acs.a(integer6);
			if (!afj7.b()) {
				if (afj7.c() == afl.bl) {
					if (!afj5.b()) {
						return false;
					}

					afj5 = afj7;
				} else {
					if (afj7.c() != afl.cg) {
						return false;
					}

					integer4++;
				}
			}
		}

		return !afj5.b() && integer4 > 0;
	}

	@Override
	public afj a(acs acs) {
		int integer3 = 0;
		afj afj4 = afj.a;

		for (int integer5 = 0; integer5 < acs.v_(); integer5++) {
			afj afj6 = acs.a(integer5);
			if (!afj6.b()) {
				if (afj6.c() == afl.bl) {
					if (!afj4.b()) {
						return afj.a;
					}

					afj4 = afj6;
				} else {
					if (afj6.c() != afl.cg) {
						return afj.a;
					}

					integer3++;
				}
			}
		}

		if (!afj4.b() && integer3 >= 1) {
			afj afj5 = new afj(afl.bl, integer3 + 1, afj4.j());
			if (afj4.t()) {
				afj5.g(afj4.r());
			}

			if (afj4.o()) {
				afj5.b(afj4.p());
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
			if (afj5.c().s()) {
				dd3.set(integer4, new afj(afj5.c().r()));
			}
		}

		return dd3;
	}
}

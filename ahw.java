public class ahw implements aho {
	@Override
	public boolean a(acs acs, ajs ajs) {
		if (acs.j() == 3 && acs.i() == 3) {
			for (int integer4 = 0; integer4 < acs.j(); integer4++) {
				for (int integer5 = 0; integer5 < acs.i(); integer5++) {
					afj afj6 = acs.c(integer4, integer5);
					if (afj6.b()) {
						return false;
					}

					afh afh7 = afj6.c();
					if (integer4 == 1 && integer5 == 1) {
						if (afh7 != afl.bJ) {
							return false;
						}
					} else if (afh7 != afl.h) {
						return false;
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	public afj a(acs acs) {
		afj afj3 = acs.c(1, 1);
		if (afj3.c() != afl.bJ) {
			return afj.a;
		} else {
			afj afj4 = new afj(afl.j, 8);
			aha.a(afj4, aha.d(afj3));
			aha.a(afj4, aha.b(afj3));
			return afj4;
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
		return dd.a(acs.v_(), afj.a);
	}
}

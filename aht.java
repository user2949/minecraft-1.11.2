public class aht {
	public void a(ahp ahp) {
		ahp.a(new afj(afl.cR), "WoW", "WWW", " W ", 'W', alv.f, 'o', afl.m);
		ahp.a(new aht.a());
	}

	static class a implements aho {
		private a() {
		}

		@Override
		public boolean a(acs acs, ajs ajs) {
			afj afj4 = afj.a;
			afj afj5 = afj.a;

			for (int integer6 = 0; integer6 < acs.v_(); integer6++) {
				afj afj7 = acs.a(integer6);
				if (!afj7.b()) {
					if (afj7.c() == afl.cP) {
						if (!afj5.b()) {
							return false;
						}

						afj5 = afj7;
					} else {
						if (afj7.c() != afl.cR) {
							return false;
						}

						if (!afj4.b()) {
							return false;
						}

						if (afj7.d("BlockEntityTag") != null) {
							return false;
						}

						afj4 = afj7;
					}
				}
			}

			return !afj4.b() && !afj5.b();
		}

		@Override
		public afj a(acs acs) {
			afj afj3 = afj.a;
			afj afj4 = afj.a;

			for (int integer5 = 0; integer5 < acs.v_(); integer5++) {
				afj afj6 = acs.a(integer5);
				if (!afj6.b()) {
					if (afj6.c() == afl.cP) {
						afj3 = afj6;
					} else if (afj6.c() == afl.cR) {
						afj4 = afj6.l();
					}
				}
			}

			if (afj4.b()) {
				return afj4;
			} else {
				du du5 = afj3.d("BlockEntityTag");
				du du6 = du5 == null ? new du() : du5.g();
				du6.a("Base", afj3.j() & 15);
				afj4.a("BlockEntityTag", du6);
				return afj4;
			}
		}

		@Override
		public int a() {
			return 2;
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
}

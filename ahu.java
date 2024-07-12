public class ahu {
	void a(ahp ahp) {
		ahp.a(aqn.b(aae.bx), "-", "#", "-", '-', afl.cZ, '#', alv.ae);
		ahp.a(new ahu.a());
	}

	static class a implements aho {
		private a() {
		}

		@Override
		public boolean a(acs acs, ajs ajs) {
			int integer4 = 0;
			int integer5 = 0;

			for (int integer6 = 0; integer6 < acs.v_(); integer6++) {
				afj afj7 = acs.a(integer6);
				if (!afj7.b()) {
					if (alu.a(afj7.c()) instanceof aqn) {
						integer4++;
					} else {
						if (afj7.c() != afl.be) {
							return false;
						}

						integer5++;
					}

					if (integer5 > 1 || integer4 > 1) {
						return false;
					}
				}
			}

			return integer4 == 1 && integer5 == 1;
		}

		@Override
		public afj a(acs acs) {
			afj afj3 = afj.a;
			afj afj4 = afj.a;

			for (int integer5 = 0; integer5 < acs.v_(); integer5++) {
				afj afj6 = acs.a(integer5);
				if (!afj6.b()) {
					if (alu.a(afj6.c()) instanceof aqn) {
						afj3 = afj6;
					} else if (afj6.c() == afl.be) {
						afj4 = afj6;
					}
				}
			}

			afj afj5 = aqn.b(aem.a(afj4.j()));
			if (afj3.o()) {
				afj5.b(afj3.p().g());
			}

			return afj5;
		}

		@Override
		public int a() {
			return 10;
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

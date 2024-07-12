public class ahr implements aho {
	private final int a;
	private final int b;
	private final afj[] c;
	private final afj d;
	private boolean e;

	public ahr(int integer1, int integer2, afj[] arr, afj afj) {
		this.a = integer1;
		this.b = integer2;
		this.c = arr;

		for (int integer6 = 0; integer6 < this.c.length; integer6++) {
			if (this.c[integer6] == null) {
				this.c[integer6] = afj.a;
			}
		}

		this.d = afj;
	}

	@Override
	public afj b() {
		return this.d;
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

	@Override
	public boolean a(acs acs, ajs ajs) {
		for (int integer4 = 0; integer4 <= 3 - this.a; integer4++) {
			for (int integer5 = 0; integer5 <= 3 - this.b; integer5++) {
				if (this.a(acs, integer4, integer5, true)) {
					return true;
				}

				if (this.a(acs, integer4, integer5, false)) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean a(acs acs, int integer2, int integer3, boolean boolean4) {
		for (int integer6 = 0; integer6 < 3; integer6++) {
			for (int integer7 = 0; integer7 < 3; integer7++) {
				int integer8 = integer6 - integer2;
				int integer9 = integer7 - integer3;
				afj afj10 = afj.a;
				if (integer8 >= 0 && integer9 >= 0 && integer8 < this.a && integer9 < this.b) {
					if (boolean4) {
						afj10 = this.c[this.a - integer8 - 1 + integer9 * this.a];
					} else {
						afj10 = this.c[integer8 + integer9 * this.a];
					}
				}

				afj afj11 = acs.c(integer6, integer7);
				if (!afj11.b() || !afj10.b()) {
					if (afj11.b() != afj10.b()) {
						return false;
					}

					if (afj10.c() != afj11.c()) {
						return false;
					}

					if (afj10.j() != 32767 && afj10.j() != afj11.j()) {
						return false;
					}
				}
			}
		}

		return true;
	}

	@Override
	public afj a(acs acs) {
		afj afj3 = this.b().l();
		if (this.e) {
			for (int integer4 = 0; integer4 < acs.v_(); integer4++) {
				afj afj5 = acs.a(integer4);
				if (!afj5.b() && afj5.o()) {
					afj3.b(afj5.p().g());
				}
			}
		}

		return afj3;
	}

	@Override
	public int a() {
		return this.a * this.b;
	}
}

public class aco extends acl {
	private final rc a;
	private final adl f;
	private int g;
	private int h;

	public aco(aax aax, rc rc) {
		this.a = rc;
		this.a(new aco.c(aax.e, rc, 0, 56, 51));
		this.a(new aco.c(aax.e, rc, 1, 79, 58));
		this.a(new aco.c(aax.e, rc, 2, 102, 51));
		this.f = this.a(new aco.b(rc, 3, 79, 17));
		this.a(new aco.a(rc, 4, 17, 17));

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
			if (this.g != this.a.c_(0)) {
				acr3.a(this, 0, this.a.c_(0));
			}

			if (this.h != this.a.c_(1)) {
				acr3.a(this, 1, this.a.c_(1));
			}
		}

		this.g = this.a.c_(0);
		this.h = this.a.c_(1);
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
			if ((integer < 0 || integer > 2) && integer != 3 && integer != 4) {
				if (this.f.a(afj6)) {
					if (!this.a(afj6, 3, 4, false)) {
						return afj.a;
					}
				} else if (aco.c.c_(afj4) && afj4.E() == 1) {
					if (!this.a(afj6, 0, 3, false)) {
						return afj.a;
					}
				} else if (aco.a.b_(afj4)) {
					if (!this.a(afj6, 4, 5, false)) {
						return afj.a;
					}
				} else if (integer >= 5 && integer < 32) {
					if (!this.a(afj6, 32, 41, false)) {
						return afj.a;
					}
				} else if (integer >= 32 && integer < 41) {
					if (!this.a(afj6, 5, 32, false)) {
						return afj.a;
					}
				} else if (!this.a(afj6, 5, 41, false)) {
					return afj.a;
				}
			} else {
				if (!this.a(afj6, 5, 41, true)) {
					return afj.a;
				}

				adl5.a(afj6, afj4);
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

	static class a extends adl {
		public a(rc rc, int integer2, int integer3, int integer4) {
			super(rc, integer2, integer3, integer4);
		}

		@Override
		public boolean a(afj afj) {
			return b_(afj);
		}

		public static boolean b_(afj afj) {
			return afj.c() == afl.bO;
		}

		@Override
		public int a() {
			return 64;
		}
	}

	static class b extends adl {
		public b(rc rc, int integer2, int integer3, int integer4) {
			super(rc, integer2, integer3, integer4);
		}

		@Override
		public boolean a(afj afj) {
			return agz.a(afj);
		}

		@Override
		public int a() {
			return 64;
		}
	}

	static class c extends adl {
		private final aay a;

		public c(aay aay, rc rc, int integer3, int integer4, int integer5) {
			super(rc, integer3, integer4, integer5);
			this.a = aay;
		}

		@Override
		public boolean a(afj afj) {
			return c_(afj);
		}

		@Override
		public int a() {
			return 1;
		}

		@Override
		public afj a(aay aay, afj afj) {
			agy agy4 = aha.d(afj);
			if (agy4 != ahb.b && agy4 != ahb.a) {
				this.a.b(nr.B);
			}

			super.a(aay, afj);
			return afj;
		}

		public static boolean c_(afj afj) {
			afh afh2 = afj.c();
			return afh2 == afl.bH || afh2 == afl.bI || afh2 == afl.bJ || afh2 == afl.bK;
		}
	}
}

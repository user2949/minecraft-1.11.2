public class asn extends asq implements lf, ru {
	private static final int[] a = new int[]{0};
	private static final int[] f = new int[]{2, 1};
	private static final int[] g = new int[]{1};
	private dd<afj> h = dd.a(3, afj.a);
	private int i;
	private int j;
	private int k;
	private int l;
	private String m;

	@Override
	public int v_() {
		return this.h.size();
	}

	@Override
	public boolean w_() {
		for (afj afj3 : this.h) {
			if (!afj3.b()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public afj a(int integer) {
		return this.h.get(integer);
	}

	@Override
	public afj a(int integer1, int integer2) {
		return rd.a(this.h, integer1, integer2);
	}

	@Override
	public afj b(int integer) {
		return rd.a(this.h, integer);
	}

	@Override
	public void a(int integer, afj afj) {
		afj afj4 = this.h.get(integer);
		boolean boolean5 = !afj.b() && afj.a(afj4) && afj.a(afj, afj4);
		this.h.set(integer, afj);
		if (afj.E() > this.y_()) {
			afj.e(this.y_());
		}

		if (integer == 0 && !boolean5) {
			this.l = this.a(afj);
			this.k = 0;
			this.x_();
		}
	}

	@Override
	public String h_() {
		return this.n_() ? this.m : "container.furnace";
	}

	@Override
	public boolean n_() {
		return this.m != null && !this.m.isEmpty();
	}

	public void a(String string) {
		this.m = string;
	}

	public static void a(ph ph) {
		ph.a(pf.BLOCK_ENTITY, new qu(asn.class, "Items"));
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.h = dd.a(this.v_(), afj.a);
		rd.b(du, this.h);
		this.i = du.g("BurnTime");
		this.k = du.g("CookTime");
		this.l = du.g("CookTimeTotal");
		this.j = b(this.h.get(1));
		if (du.b("CustomName", 8)) {
			this.m = du.l("CustomName");
		}
	}

	@Override
	public du b(du du) {
		super.b(du);
		du.a("BurnTime", (short)this.i);
		du.a("CookTime", (short)this.k);
		du.a("CookTimeTotal", (short)this.l);
		rd.a(du, this.h);
		if (this.n_()) {
			du.a("CustomName", this.m);
		}

		return du;
	}

	@Override
	public int y_() {
		return 64;
	}

	public boolean n() {
		return this.i > 0;
	}

	public static boolean a(rc rc) {
		return rc.c_(0) > 0;
	}

	@Override
	public void F_() {
		boolean boolean2 = this.n();
		boolean boolean3 = false;
		if (this.n()) {
			this.i--;
		}

		if (!this.b.E) {
			afj afj4 = this.h.get(1);
			if (this.n() || !afj4.b() && !this.h.get(0).b()) {
				if (!this.n() && this.p()) {
					this.i = b(afj4);
					this.j = this.i;
					if (this.n()) {
						boolean3 = true;
						if (!afj4.b()) {
							afh afh5 = afj4.c();
							afj4.g(1);
							if (afj4.b()) {
								afh afh6 = afh5.r();
								this.h.set(1, afh6 == null ? afj.a : new afj(afh6));
							}
						}
					}
				}

				if (this.n() && this.p()) {
					this.k++;
					if (this.k == this.l) {
						this.k = 0;
						this.l = this.a(this.h.get(0));
						this.o();
						boolean3 = true;
					}
				} else {
					this.k = 0;
				}
			} else if (!this.n() && this.k > 0) {
				this.k = ot.a(this.k - 2, 0, this.l);
			}

			if (boolean2 != this.n()) {
				boolean3 = true;
				anu.a(this.n(), this.b, this.c);
			}
		}

		if (boolean3) {
			this.x_();
		}
	}

	public int a(afj afj) {
		return 200;
	}

	private boolean p() {
		if (this.h.get(0).b()) {
			return false;
		} else {
			afj afj2 = ahk.a().a(this.h.get(0));
			if (afj2.b()) {
				return false;
			} else {
				afj afj3 = this.h.get(2);
				if (afj3.b()) {
					return true;
				} else if (!afj3.a(afj2)) {
					return false;
				} else {
					return afj3.E() < this.y_() && afj3.E() < afj3.d() ? true : afj3.E() < afj2.d();
				}
			}
		}
	}

	public void o() {
		if (this.p()) {
			afj afj2 = this.h.get(0);
			afj afj3 = ahk.a().a(afj2);
			afj afj4 = this.h.get(2);
			if (afj4.b()) {
				this.h.set(2, afj3.l());
			} else if (afj4.c() == afj3.c()) {
				afj4.f(1);
			}

			if (afj2.c() == afh.a(alv.v) && afj2.j() == 1 && !this.h.get(1).b() && this.h.get(1).c() == afl.az) {
				this.h.set(1, new afj(afl.aA));
			}

			afj2.g(1);
		}
	}

	public static int b(afj afj) {
		if (afj.b()) {
			return 0;
		} else {
			afh afh2 = afj.c();
			if (afh2 == afh.a(alv.bM)) {
				return 150;
			} else if (afh2 == afh.a(alv.L)) {
				return 100;
			} else if (afh2 == afh.a(alv.cy)) {
				return 67;
			} else if (afh2 == afh.a(alv.au)) {
				return 300;
			} else if (afh2 == afh.a(alv.cd)) {
				return 100;
			} else if (alu.a(afh2).t().a() == azs.d) {
				return 300;
			} else if (afh2 == afh.a(alv.cA)) {
				return 16000;
			} else if (afh2 instanceof aek && "WOOD".equals(((aek)afh2).h())) {
				return 200;
			} else if (afh2 instanceof agr && "WOOD".equals(((agr)afh2).h())) {
				return 200;
			} else if (afh2 instanceof afg && "WOOD".equals(((afg)afh2).g())) {
				return 200;
			} else if (afh2 == afl.B) {
				return 100;
			} else if (afh2 == afl.g || afh2 == afl.aZ) {
				return 300;
			} else if (afh2 == afl.as) {
				return 200;
			} else if (afh2 == afl.k) {
				return 1600;
			} else if (afh2 == afl.aB) {
				return 20000;
			} else if (afh2 == afh.a(alv.g) || afh2 == afl.C) {
				return 100;
			} else if (afh2 == afl.bD) {
				return 2400;
			} else if (afh2 instanceof ael && afh2 != afl.aE) {
				return 200;
			} else {
				return afh2 instanceof adx ? 400 : 0;
			}
		}
	}

	public static boolean c(afj afj) {
		return b(afj) > 0;
	}

	@Override
	public boolean a(aay aay) {
		return this.b.r(this.c) != this ? false : !(aay.d((double)this.c.p() + 0.5, (double)this.c.q() + 0.5, (double)this.c.r() + 0.5) > 64.0);
	}

	@Override
	public void b(aay aay) {
	}

	@Override
	public void c(aay aay) {
	}

	@Override
	public boolean b(int integer, afj afj) {
		if (integer == 2) {
			return false;
		} else if (integer != 1) {
			return true;
		} else {
			afj afj4 = this.h.get(1);
			return c(afj) || acw.d_(afj) && afj4.c() != afl.az;
		}
	}

	@Override
	public int[] a(cv cv) {
		if (cv == cv.DOWN) {
			return f;
		} else {
			return cv == cv.UP ? a : g;
		}
	}

	@Override
	public boolean a(int integer, afj afj, cv cv) {
		return this.b(integer, afj);
	}

	@Override
	public boolean b(int integer, afj afj, cv cv) {
		if (cv == cv.DOWN && integer == 1) {
			afh afh5 = afj.c();
			if (afh5 != afl.aA && afh5 != afl.az) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String l() {
		return "minecraft:furnace";
	}

	@Override
	public acl a(aax aax, aay aay) {
		return new acx(aax, this);
	}

	@Override
	public int c_(int integer) {
		switch (integer) {
			case 0:
				return this.i;
			case 1:
				return this.j;
			case 2:
				return this.k;
			case 3:
				return this.l;
			default:
				return 0;
		}
	}

	@Override
	public void b(int integer1, int integer2) {
		switch (integer1) {
			case 0:
				this.i = integer2;
				break;
			case 1:
				this.j = integer2;
				break;
			case 2:
				this.k = integer2;
				break;
			case 3:
				this.l = integer2;
		}
	}

	@Override
	public int h() {
		return 4;
	}

	@Override
	public void m() {
		this.h.clear();
	}
}

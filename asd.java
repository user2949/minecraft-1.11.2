import java.util.Arrays;

public class asd extends asq implements lf, ru {
	private static final int[] a = new int[]{3};
	private static final int[] f = new int[]{0, 1, 2, 3};
	private static final int[] g = new int[]{0, 1, 2, 4};
	private dd<afj> h = dd.a(5, afj.a);
	private int i;
	private boolean[] j;
	private afh k;
	private String l;
	private int m;

	@Override
	public String h_() {
		return this.n_() ? this.l : "container.brewing";
	}

	@Override
	public boolean n_() {
		return this.l != null && !this.l.isEmpty();
	}

	public void a(String string) {
		this.l = string;
	}

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
	public void F_() {
		afj afj2 = this.h.get(4);
		if (this.m <= 0 && afj2.c() == afl.bO) {
			this.m = 20;
			afj2.g(1);
			this.x_();
		}

		boolean boolean3 = this.o();
		boolean boolean4 = this.i > 0;
		afj afj5 = this.h.get(3);
		if (boolean4) {
			this.i--;
			boolean boolean6 = this.i == 0;
			if (boolean6 && boolean3) {
				this.p();
				this.x_();
			} else if (!boolean3) {
				this.i = 0;
				this.x_();
			} else if (this.k != afj5.c()) {
				this.i = 0;
				this.x_();
			}
		} else if (boolean3 && this.m > 0) {
			this.m--;
			this.i = 400;
			this.k = afj5.c();
			this.x_();
		}

		if (!this.b.E) {
			boolean[] arr6 = this.n();
			if (!Arrays.equals(arr6, this.j)) {
				this.j = arr6;
				atl atl7 = this.b.o(this.w());
				if (!(atl7.v() instanceof alz)) {
					return;
				}

				for (int integer8 = 0; integer8 < alz.a.length; integer8++) {
					atl7 = atl7.a(alz.a[integer8], arr6[integer8]);
				}

				this.b.a(this.c, atl7, 2);
			}
		}
	}

	public boolean[] n() {
		boolean[] arr2 = new boolean[3];

		for (int integer3 = 0; integer3 < 3; integer3++) {
			if (!this.h.get(integer3).b()) {
				arr2[integer3] = true;
			}
		}

		return arr2;
	}

	private boolean o() {
		afj afj2 = this.h.get(3);
		if (afj2.b()) {
			return false;
		} else if (!agz.a(afj2)) {
			return false;
		} else {
			for (int integer3 = 0; integer3 < 3; integer3++) {
				afj afj4 = this.h.get(integer3);
				if (!afj4.b() && agz.a(afj4, afj2)) {
					return true;
				}
			}

			return false;
		}
	}

	private void p() {
		afj afj2 = this.h.get(3);

		for (int integer3 = 0; integer3 < 3; integer3++) {
			this.h.set(integer3, agz.d(afj2, this.h.get(integer3)));
		}

		afj2.g(1);
		co co3 = this.w();
		if (afj2.c().s()) {
			afj afj4 = new afj(afj2.c().r());
			if (afj2.b()) {
				afj2 = afj4;
			} else {
				rf.a(this.b, (double)co3.p(), (double)co3.q(), (double)co3.r(), afj4);
			}
		}

		this.h.set(3, afj2);
		this.b.b(1035, co3, 0);
	}

	public static void a(ph ph) {
		ph.a(pf.BLOCK_ENTITY, new qu(asd.class, "Items"));
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.h = dd.a(this.v_(), afj.a);
		rd.b(du, this.h);
		this.i = du.g("BrewTime");
		if (du.b("CustomName", 8)) {
			this.l = du.l("CustomName");
		}

		this.m = du.f("Fuel");
	}

	@Override
	public du b(du du) {
		super.b(du);
		du.a("BrewTime", (short)this.i);
		rd.a(du, this.h);
		if (this.n_()) {
			du.a("CustomName", this.l);
		}

		du.a("Fuel", (byte)this.m);
		return du;
	}

	@Override
	public afj a(int integer) {
		return integer >= 0 && integer < this.h.size() ? this.h.get(integer) : afj.a;
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
		if (integer >= 0 && integer < this.h.size()) {
			this.h.set(integer, afj);
		}
	}

	@Override
	public int y_() {
		return 64;
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
		if (integer == 3) {
			return agz.a(afj);
		} else {
			afh afh4 = afj.c();
			return integer == 4 ? afh4 == afl.bO : (afh4 == afl.bH || afh4 == afl.bI || afh4 == afl.bJ || afh4 == afl.bK) && this.a(integer) == afj.a;
		}
	}

	@Override
	public int[] a(cv cv) {
		if (cv == cv.UP) {
			return a;
		} else {
			return cv == cv.DOWN ? f : g;
		}
	}

	@Override
	public boolean a(int integer, afj afj, cv cv) {
		return this.b(integer, afj);
	}

	@Override
	public boolean b(int integer, afj afj, cv cv) {
		return integer == 3 ? afj.c() == afl.bK : true;
	}

	@Override
	public String l() {
		return "minecraft:brewing_stand";
	}

	@Override
	public acl a(aax aax, aay aay) {
		return new aco(aax, this);
	}

	@Override
	public int c_(int integer) {
		switch (integer) {
			case 0:
				return this.i;
			case 1:
				return this.m;
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
				this.m = integer2;
		}
	}

	@Override
	public int h() {
		return 2;
	}

	@Override
	public void m() {
		this.h.clear();
	}
}

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class asb extends asq implements lf, ru {
	public static final sg[][] a = new sg[][]{{si.a, si.c}, {si.k, si.h}, {si.e}, {si.j}};
	private static final Set<sg> f = Sets.newHashSet();
	private final List<asb.a> g = Lists.newArrayList();
	private long h;
	private float i;
	private boolean j;
	private int k = -1;
	@Nullable
	private sg l;
	@Nullable
	private sg m;
	private afj n = afj.a;
	private String o;

	@Override
	public void F_() {
		if (this.b.P() % 80L == 0L) {
			this.n();
		}
	}

	public void n() {
		if (this.b != null) {
			this.F();
			this.E();
		}
	}

	private void E() {
		if (this.j && this.k > 0 && !this.b.E && this.l != null) {
			double double2 = (double)(this.k * 10 + 10);
			int integer4 = 0;
			if (this.k >= 4 && this.l == this.m) {
				integer4 = 1;
			}

			int integer5 = (9 + this.k * 2) * 20;
			int integer6 = this.c.p();
			int integer7 = this.c.q();
			int integer8 = this.c.r();
			bdt bdt9 = new bdt((double)integer6, (double)integer7, (double)integer8, (double)(integer6 + 1), (double)(integer7 + 1), (double)(integer8 + 1))
				.g(double2)
				.b(0.0, (double)this.b.Y(), 0.0);
			List<aay> list10 = this.b.a(aay.class, bdt9);

			for (aay aay12 : list10) {
				aay12.c(new sh(this.l, integer5, integer4, true, true));
			}

			if (this.k >= 4 && this.l != this.m && this.m != null) {
				for (aay aay12 : list10) {
					aay12.c(new sh(this.m, integer5, 0, true, true));
				}
			}
		}
	}

	private void F() {
		int integer2 = this.k;
		int integer3 = this.c.p();
		int integer4 = this.c.q();
		int integer5 = this.c.r();
		this.k = 0;
		this.g.clear();
		this.j = true;
		asb.a a6 = new asb.a(xf.a(aem.WHITE));
		this.g.add(a6);
		boolean boolean7 = true;
		co.a a8 = new co.a();

		for (int integer9 = integer4 + 1; integer9 < 256; integer9++) {
			atl atl10 = this.b.o(a8.c(integer3, integer9, integer5));
			float[] arr11;
			if (atl10.v() == alv.cG) {
				arr11 = xf.a(atl10.c(aqw.a));
			} else {
				if (atl10.v() != alv.cH) {
					if (atl10.c() >= 15 && atl10.v() != alv.h) {
						this.j = false;
						this.g.clear();
						break;
					}

					a6.a();
					continue;
				}

				arr11 = xf.a(atl10.c(aqx.a));
			}

			if (!boolean7) {
				arr11 = new float[]{(a6.b()[0] + arr11[0]) / 2.0F, (a6.b()[1] + arr11[1]) / 2.0F, (a6.b()[2] + arr11[2]) / 2.0F};
			}

			if (Arrays.equals(arr11, a6.b())) {
				a6.a();
			} else {
				a6 = new asb.a(arr11);
				this.g.add(a6);
			}

			boolean7 = false;
		}

		if (this.j) {
			for (int integer9 = 1; integer9 <= 4; this.k = integer9++) {
				int integer10 = integer4 - integer9;
				if (integer10 < 0) {
					break;
				}

				boolean boolean11 = true;

				for (int integer12 = integer3 - integer9; integer12 <= integer3 + integer9 && boolean11; integer12++) {
					for (int integer13 = integer5 - integer9; integer13 <= integer5 + integer9; integer13++) {
						alu alu14 = this.b.o(new co(integer12, integer10, integer13)).v();
						if (alu14 != alv.bT && alu14 != alv.R && alu14 != alv.ah && alu14 != alv.S) {
							boolean11 = false;
							break;
						}
					}
				}

				if (!boolean11) {
					break;
				}
			}

			if (this.k == 0) {
				this.j = false;
			}
		}

		if (!this.b.E && this.k == 4 && integer2 < this.k) {
			for (aay aay10 : this.b
				.a(aay.class, new bdt((double)integer3, (double)integer4, (double)integer5, (double)integer3, (double)(integer4 - 4), (double)integer5).c(10.0, 5.0, 10.0))) {
				aay10.b(nr.K);
			}
		}
	}

	public List<asb.a> o() {
		return this.g;
	}

	public float p() {
		if (!this.j) {
			return 0.0F;
		} else {
			int integer2 = (int)(this.b.P() - this.h);
			this.h = this.b.P();
			if (integer2 > 1) {
				this.i -= (float)integer2 / 40.0F;
				if (this.i < 0.0F) {
					this.i = 0.0F;
				}
			}

			this.i += 0.025F;
			if (this.i > 1.0F) {
				this.i = 1.0F;
			}

			return this.i;
		}
	}

	@Nullable
	@Override
	public fz c() {
		return new fz(this.c, 3, this.d());
	}

	@Override
	public du d() {
		return this.b(new du());
	}

	@Override
	public double t() {
		return 65536.0;
	}

	@Nullable
	private static sg f(int integer) {
		sg sg2 = sg.a(integer);
		return f.contains(sg2) ? sg2 : null;
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.l = f(du.h("Primary"));
		this.m = f(du.h("Secondary"));
		this.k = du.h("Levels");
	}

	@Override
	public du b(du du) {
		super.b(du);
		du.a("Primary", sg.a(this.l));
		du.a("Secondary", sg.a(this.m));
		du.a("Levels", this.k);
		return du;
	}

	@Override
	public int v_() {
		return 1;
	}

	@Override
	public boolean w_() {
		return this.n.b();
	}

	@Override
	public afj a(int integer) {
		return integer == 0 ? this.n : afj.a;
	}

	@Override
	public afj a(int integer1, int integer2) {
		if (integer1 != 0 || this.n.b()) {
			return afj.a;
		} else if (integer2 >= this.n.E()) {
			afj afj4 = this.n;
			this.n = afj.a;
			return afj4;
		} else {
			return this.n.a(integer2);
		}
	}

	@Override
	public afj b(int integer) {
		if (integer == 0) {
			afj afj3 = this.n;
			this.n = afj.a;
			return afj3;
		} else {
			return afj.a;
		}
	}

	@Override
	public void a(int integer, afj afj) {
		if (integer == 0) {
			this.n = afj;
		}
	}

	@Override
	public String h_() {
		return this.n_() ? this.o : "container.beacon";
	}

	@Override
	public boolean n_() {
		return this.o != null && !this.o.isEmpty();
	}

	public void a(String string) {
		this.o = string;
	}

	@Override
	public int y_() {
		return 1;
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
		return afj.c() == afl.bZ || afj.c() == afl.l || afj.c() == afl.n || afj.c() == afl.m;
	}

	@Override
	public String l() {
		return "minecraft:beacon";
	}

	@Override
	public acl a(aax aax, aay aay) {
		return new acn(aax, this);
	}

	@Override
	public int c_(int integer) {
		switch (integer) {
			case 0:
				return this.k;
			case 1:
				return sg.a(this.l);
			case 2:
				return sg.a(this.m);
			default:
				return 0;
		}
	}

	@Override
	public void b(int integer1, int integer2) {
		switch (integer1) {
			case 0:
				this.k = integer2;
				break;
			case 1:
				this.l = f(integer2);
				break;
			case 2:
				this.m = f(integer2);
		}
	}

	@Override
	public int h() {
		return 3;
	}

	@Override
	public void m() {
		this.n = afj.a;
	}

	@Override
	public boolean c(int integer1, int integer2) {
		if (integer1 == 1) {
			this.n();
			return true;
		} else {
			return super.c(integer1, integer2);
		}
	}

	@Override
	public int[] a(cv cv) {
		return new int[0];
	}

	@Override
	public boolean a(int integer, afj afj, cv cv) {
		return false;
	}

	@Override
	public boolean b(int integer, afj afj, cv cv) {
		return false;
	}

	static {
		for (sg[] arr4 : a) {
			Collections.addAll(f, arr4);
		}
	}

	public static class a {
		private final float[] a;
		private int b;

		public a(float[] arr) {
			this.a = arr;
			this.b = 1;
		}

		protected void a() {
			this.b++;
		}

		public float[] b() {
			return this.a;
		}

		public int c() {
			return this.b;
		}
	}
}

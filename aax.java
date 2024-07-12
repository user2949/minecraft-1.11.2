import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public class aax implements rc {
	public final dd<afj> a = dd.a(36, afj.a);
	public final dd<afj> b = dd.a(4, afj.a);
	public final dd<afj> c = dd.a(1, afj.a);
	private final List<dd<afj>> g = Arrays.asList(this.a, this.b, this.c);
	public int d;
	public aay e;
	private afj h = afj.a;
	public boolean f;

	public aax(aay aay) {
		this.e = aay;
	}

	public afj i() {
		return e(this.d) ? this.a.get(this.d) : afj.a;
	}

	public static int j() {
		return 9;
	}

	private boolean a(afj afj1, afj afj2) {
		return !afj1.b() && this.b(afj1, afj2) && afj1.e() && afj1.E() < afj1.d() && afj1.E() < this.y_();
	}

	private boolean b(afj afj1, afj afj2) {
		return afj1.c() == afj2.c() && (!afj1.g() || afj1.j() == afj2.j()) && afj.a(afj1, afj2);
	}

	public int k() {
		for (int integer2 = 0; integer2 < this.a.size(); integer2++) {
			if (this.a.get(integer2).b()) {
				return integer2;
			}
		}

		return -1;
	}

	public void a(afj afj) {
		int integer3 = this.b(afj);
		if (e(integer3)) {
			this.d = integer3;
		} else {
			if (integer3 == -1) {
				this.d = this.l();
				if (!this.a.get(this.d).b()) {
					int integer4 = this.k();
					if (integer4 != -1) {
						this.a.set(integer4, this.a.get(this.d));
					}
				}

				this.a.set(this.d, afj);
			} else {
				this.d(integer3);
			}
		}
	}

	public void d(int integer) {
		this.d = this.l();
		afj afj3 = this.a.get(this.d);
		this.a.set(this.d, this.a.get(integer));
		this.a.set(integer, afj3);
	}

	public static boolean e(int integer) {
		return integer >= 0 && integer < 9;
	}

	public int b(afj afj) {
		for (int integer3 = 0; integer3 < this.a.size(); integer3++) {
			if (!this.a.get(integer3).b() && this.b(afj, this.a.get(integer3))) {
				return integer3;
			}
		}

		return -1;
	}

	public int l() {
		for (int integer2 = 0; integer2 < 9; integer2++) {
			int integer3 = (this.d + integer2) % 9;
			if (this.a.get(integer3).b()) {
				return integer3;
			}
		}

		for (int integer2x = 0; integer2x < 9; integer2x++) {
			int integer3 = (this.d + integer2x) % 9;
			if (!this.a.get(integer3).x()) {
				return integer3;
			}
		}

		return this.d;
	}

	public void f(int integer) {
		if (integer > 0) {
			integer = 1;
		}

		if (integer < 0) {
			integer = -1;
		}

		this.d -= integer;

		while (this.d < 0) {
			this.d += 9;
		}

		while (this.d >= 9) {
			this.d -= 9;
		}
	}

	public int a(@Nullable afh afh, int integer2, int integer3, @Nullable du du) {
		int integer6 = 0;

		for (int integer7 = 0; integer7 < this.v_(); integer7++) {
			afj afj8 = this.a(integer7);
			if (!afj8.b() && (afh == null || afj8.c() == afh) && (integer2 <= -1 || afj8.j() == integer2) && (du == null || ee.a(du, afj8.p(), true))) {
				int integer9 = integer3 <= 0 ? afj8.E() : Math.min(integer3 - integer6, afj8.E());
				integer6 += integer9;
				if (integer3 != 0) {
					afj8.g(integer9);
					if (afj8.b()) {
						this.a(integer7, afj.a);
					}

					if (integer3 > 0 && integer6 >= integer3) {
						return integer6;
					}
				}
			}
		}

		if (!this.h.b()) {
			if (afh != null && this.h.c() != afh) {
				return integer6;
			}

			if (integer2 > -1 && this.h.j() != integer2) {
				return integer6;
			}

			if (du != null && !ee.a(du, this.h.p(), true)) {
				return integer6;
			}

			int integer7x = integer3 <= 0 ? this.h.E() : Math.min(integer3 - integer6, this.h.E());
			integer6 += integer7x;
			if (integer3 != 0) {
				this.h.g(integer7x);
				if (this.h.b()) {
					this.h = afj.a;
				}

				if (integer3 > 0 && integer6 >= integer3) {
					return integer6;
				}
			}
		}

		return integer6;
	}

	private int g(afj afj) {
		afh afh3 = afj.c();
		int integer4 = afj.E();
		int integer5 = this.h(afj);
		if (integer5 == -1) {
			integer5 = this.k();
		}

		if (integer5 == -1) {
			return integer4;
		} else {
			afj afj6 = this.a(integer5);
			if (afj6.b()) {
				afj6 = new afj(afh3, 0, afj.j());
				if (afj.o()) {
					afj6.b(afj.p().g());
				}

				this.a(integer5, afj6);
			}

			int integer7 = integer4;
			if (integer4 > afj6.d() - afj6.E()) {
				integer7 = afj6.d() - afj6.E();
			}

			if (integer7 > this.y_() - afj6.E()) {
				integer7 = this.y_() - afj6.E();
			}

			if (integer7 == 0) {
				return integer4;
			} else {
				integer4 -= integer7;
				afj6.f(integer7);
				afj6.d(5);
				return integer4;
			}
		}
	}

	private int h(afj afj) {
		if (this.a(this.a(this.d), afj)) {
			return this.d;
		} else if (this.a(this.a(40), afj)) {
			return 40;
		} else {
			for (int integer3 = 0; integer3 < this.a.size(); integer3++) {
				if (this.a(this.a.get(integer3), afj)) {
					return integer3;
				}
			}

			return -1;
		}
	}

	public void n() {
		for (dd<afj> dd3 : this.g) {
			for (int integer4 = 0; integer4 < dd3.size(); integer4++) {
				if (!dd3.get(integer4).b()) {
					dd3.get(integer4).a(this.e.l, this.e, integer4, this.d == integer4);
				}
			}
		}
	}

	public boolean c(afj afj) {
		if (afj.b()) {
			return false;
		} else {
			try {
				if (afj.h()) {
					int integer3 = this.k();
					if (integer3 >= 0) {
						this.a.set(integer3, afj.l());
						this.a.get(integer3).d(5);
						afj.e(0);
						return true;
					} else if (this.e.bK.d) {
						afj.e(0);
						return true;
					} else {
						return false;
					}
				} else {
					int integer3;
					do {
						integer3 = afj.E();
						afj.e(this.g(afj));
					} while (!afj.b() && afj.E() < integer3);

					if (afj.E() == integer3 && this.e.bK.d) {
						afj.e(0);
						return true;
					} else {
						return afj.E() < integer3;
					}
				}
			} catch (Throwable var5) {
				b b4 = b.a(var5, "Adding item to inventory");
				c c5 = b4.a("Item being added");
				c5.a("Item ID", afh.a(afj.c()));
				c5.a("Item data", afj.j());
				c5.a("Item name", new d<String>() {
					public String call() throws Exception {
						return afj.r();
					}
				});
				throw new f(b4);
			}
		}
	}

	@Override
	public afj a(int integer1, int integer2) {
		List<afj> list4 = null;

		for (dd<afj> dd6 : this.g) {
			if (integer1 < dd6.size()) {
				list4 = dd6;
				break;
			}

			integer1 -= dd6.size();
		}

		return list4 != null && !((afj)list4.get(integer1)).b() ? rd.a(list4, integer1, integer2) : afj.a;
	}

	public void d(afj afj) {
		for (dd<afj> dd4 : this.g) {
			for (int integer5 = 0; integer5 < dd4.size(); integer5++) {
				if (dd4.get(integer5) == afj) {
					dd4.set(integer5, afj.a);
					break;
				}
			}
		}
	}

	@Override
	public afj b(int integer) {
		dd<afj> dd3 = null;

		for (dd<afj> dd5 : this.g) {
			if (integer < dd5.size()) {
				dd3 = dd5;
				break;
			}

			integer -= dd5.size();
		}

		if (dd3 != null && !dd3.get(integer).b()) {
			afj afj4 = dd3.get(integer);
			dd3.set(integer, afj.a);
			return afj4;
		} else {
			return afj.a;
		}
	}

	@Override
	public void a(int integer, afj afj) {
		dd<afj> dd4 = null;

		for (dd<afj> dd6 : this.g) {
			if (integer < dd6.size()) {
				dd4 = dd6;
				break;
			}

			integer -= dd6.size();
		}

		if (dd4 != null) {
			dd4.set(integer, afj);
		}
	}

	public float a(atl atl) {
		float float3 = 1.0F;
		if (!this.a.get(this.d).b()) {
			float3 *= this.a.get(this.d).a(atl);
		}

		return float3;
	}

	public ea a(ea ea) {
		for (int integer3 = 0; integer3 < this.a.size(); integer3++) {
			if (!this.a.get(integer3).b()) {
				du du4 = new du();
				du4.a("Slot", (byte)integer3);
				this.a.get(integer3).a(du4);
				ea.a(du4);
			}
		}

		for (int integer3x = 0; integer3x < this.b.size(); integer3x++) {
			if (!this.b.get(integer3x).b()) {
				du du4 = new du();
				du4.a("Slot", (byte)(integer3x + 100));
				this.b.get(integer3x).a(du4);
				ea.a(du4);
			}
		}

		for (int integer3xx = 0; integer3xx < this.c.size(); integer3xx++) {
			if (!this.c.get(integer3xx).b()) {
				du du4 = new du();
				du4.a("Slot", (byte)(integer3xx + 150));
				this.c.get(integer3xx).a(du4);
				ea.a(du4);
			}
		}

		return ea;
	}

	public void b(ea ea) {
		this.a.clear();
		this.b.clear();
		this.c.clear();

		for (int integer3 = 0; integer3 < ea.c(); integer3++) {
			du du4 = ea.b(integer3);
			int integer5 = du4.f("Slot") & 255;
			afj afj6 = new afj(du4);
			if (!afj6.b()) {
				if (integer5 >= 0 && integer5 < this.a.size()) {
					this.a.set(integer5, afj6);
				} else if (integer5 >= 100 && integer5 < this.b.size() + 100) {
					this.b.set(integer5 - 100, afj6);
				} else if (integer5 >= 150 && integer5 < this.c.size() + 150) {
					this.c.set(integer5 - 150, afj6);
				}
			}
		}
	}

	@Override
	public int v_() {
		return this.a.size() + this.b.size() + this.c.size();
	}

	@Override
	public boolean w_() {
		for (afj afj3 : this.a) {
			if (!afj3.b()) {
				return false;
			}
		}

		for (afj afj3x : this.b) {
			if (!afj3x.b()) {
				return false;
			}
		}

		for (afj afj3xx : this.c) {
			if (!afj3xx.b()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public afj a(int integer) {
		List<afj> list3 = null;

		for (dd<afj> dd5 : this.g) {
			if (integer < dd5.size()) {
				list3 = dd5;
				break;
			}

			integer -= dd5.size();
		}

		return list3 == null ? afj.a : (afj)list3.get(integer);
	}

	@Override
	public String h_() {
		return "container.inventory";
	}

	@Override
	public boolean n_() {
		return false;
	}

	@Override
	public fb i_() {
		return (fb)(this.n_() ? new fh(this.h_()) : new fi(this.h_()));
	}

	@Override
	public int y_() {
		return 64;
	}

	public boolean b(atl atl) {
		if (atl.a().l()) {
			return true;
		} else {
			afj afj3 = this.a(this.d);
			return !afj3.b() ? afj3.b(atl) : false;
		}
	}

	public afj g(int integer) {
		return this.b.get(integer);
	}

	public void a(float float1) {
		float1 /= 4.0F;
		if (float1 < 1.0F) {
			float1 = 1.0F;
		}

		for (int integer3 = 0; integer3 < this.b.size(); integer3++) {
			afj afj4 = this.b.get(integer3);
			if (afj4.c() instanceof adp) {
				afj4.a((int)float1, this.e);
			}
		}
	}

	public void o() {
		for (List<afj> list3 : this.g) {
			for (int integer4 = 0; integer4 < list3.size(); integer4++) {
				afj afj5 = (afj)list3.get(integer4);
				if (!afj5.b()) {
					this.e.a(afj5, true, false);
					list3.set(integer4, afj.a);
				}
			}
		}
	}

	@Override
	public void x_() {
		this.f = true;
	}

	public void e(afj afj) {
		this.h = afj;
	}

	public afj p() {
		return this.h;
	}

	@Override
	public boolean a(aay aay) {
		return this.e.F ? false : !(aay.h(this.e) > 64.0);
	}

	public boolean f(afj afj) {
		for (List<afj> list4 : this.g) {
			for (afj afj6 : list4) {
				if (!afj6.b() && afj6.a(afj)) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public void b(aay aay) {
	}

	@Override
	public void c(aay aay) {
	}

	@Override
	public boolean b(int integer, afj afj) {
		return true;
	}

	public void a(aax aax) {
		for (int integer3 = 0; integer3 < this.v_(); integer3++) {
			this.a(integer3, aax.a(integer3));
		}

		this.d = aax.d;
	}

	@Override
	public int c_(int integer) {
		return 0;
	}

	@Override
	public void b(int integer1, int integer2) {
	}

	@Override
	public int h() {
		return 0;
	}

	@Override
	public void m() {
		for (List<afj> list3 : this.g) {
			list3.clear();
		}
	}
}

import java.util.Random;
import javax.annotation.Nullable;

public abstract class acb extends aby implements ro, rq {
	private dd<afj> a = dd.a(36, afj.a);
	private boolean b = true;
	private kq c;
	private long d;

	public acb(ajs ajs) {
		super(ajs);
	}

	public acb(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (this.l.U().b("doEntityDrops")) {
			rf.a(this.l, this, this);
		}
	}

	@Override
	public boolean w_() {
		for (afj afj3 : this.a) {
			if (!afj3.b()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public afj a(int integer) {
		this.f(null);
		return this.a.get(integer);
	}

	@Override
	public afj a(int integer1, int integer2) {
		this.f(null);
		return rd.a(this.a, integer1, integer2);
	}

	@Override
	public afj b(int integer) {
		this.f(null);
		afj afj3 = this.a.get(integer);
		if (afj3.b()) {
			return afj.a;
		} else {
			this.a.set(integer, afj.a);
			return afj3;
		}
	}

	@Override
	public void a(int integer, afj afj) {
		this.f(null);
		this.a.set(integer, afj);
		if (!afj.b() && afj.E() > this.y_()) {
			afj.e(this.y_());
		}
	}

	@Override
	public void x_() {
	}

	@Override
	public boolean a(aay aay) {
		return this.F ? false : !(aay.h(this) > 64.0);
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

	@Override
	public int y_() {
		return 64;
	}

	@Nullable
	@Override
	public sn c(int integer) {
		this.b = false;
		return super.c(integer);
	}

	@Override
	public void T() {
		if (this.b) {
			rf.a(this.l, this, this);
		}

		super.T();
	}

	@Override
	public void b(boolean boolean1) {
		this.b = boolean1;
	}

	public static void b(ph ph, Class<?> class2) {
		aby.a(ph, class2);
		ph.a(pf.ENTITY, new qu(class2, "Items"));
	}

	@Override
	protected void b(du du) {
		super.b(du);
		if (this.c != null) {
			du.a("LootTable", this.c.toString());
			if (this.d != 0L) {
				du.a("LootTableSeed", this.d);
			}
		} else {
			rd.a(du, this.a);
		}
	}

	@Override
	protected void a(du du) {
		super.a(du);
		this.a = dd.a(this.v_(), afj.a);
		if (du.b("LootTable", 8)) {
			this.c = new kq(du.l("LootTable"));
			this.d = du.i("LootTableSeed");
		} else {
			rd.b(du, this.a);
		}
	}

	@Override
	public boolean b(aay aay, ri ri) {
		if (!this.l.E) {
			aay.a((rc)this);
		}

		return true;
	}

	@Override
	protected void r() {
		float float2 = 0.98F;
		if (this.c == null) {
			int integer3 = 15 - acl.b(this);
			float2 += (float)integer3 * 0.001F;
		}

		this.s *= (double)float2;
		this.t *= 0.0;
		this.u *= (double)float2;
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
	public boolean z_() {
		return false;
	}

	@Override
	public void a(rn rn) {
	}

	@Override
	public rn j() {
		return rn.a;
	}

	public void f(@Nullable aay aay) {
		if (this.c != null) {
			bck bck3 = this.l.ak().a(this.c);
			this.c = null;
			Random random4;
			if (this.d == 0L) {
				random4 = new Random();
			} else {
				random4 = new Random(this.d);
			}

			bcl.a a5 = new bcl.a((lw)this.l);
			if (aay != null) {
				a5.a(aay.dj());
			}

			bck3.a(this, random4, a5.a());
		}
	}

	@Override
	public void m() {
		this.f(null);
		this.a.clear();
	}

	public void a(kq kq, long long2) {
		this.c = kq;
		this.d = long2;
	}

	@Override
	public kq b() {
		return this.c;
	}
}

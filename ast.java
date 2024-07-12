import java.util.Random;
import javax.annotation.Nullable;

public abstract class ast extends asq implements rq {
	protected kq m;
	protected long n;
	protected String o;

	protected boolean c(du du) {
		if (du.b("LootTable", 8)) {
			this.m = new kq(du.l("LootTable"));
			this.n = du.i("LootTableSeed");
			return true;
		} else {
			return false;
		}
	}

	protected boolean d(du du) {
		if (this.m != null) {
			du.a("LootTable", this.m.toString());
			if (this.n != 0L) {
				du.a("LootTableSeed", this.n);
			}

			return true;
		} else {
			return false;
		}
	}

	public void d(@Nullable aay aay) {
		if (this.m != null) {
			bck bck3 = this.b.ak().a(this.m);
			this.m = null;
			Random random4;
			if (this.n == 0L) {
				random4 = new Random();
			} else {
				random4 = new Random(this.n);
			}

			bcl.a a5 = new bcl.a((lw)this.b);
			if (aay != null) {
				a5.a(aay.dj());
			}

			bck3.a(this, random4, a5.a());
		}
	}

	@Override
	public kq b() {
		return this.m;
	}

	public void a(kq kq, long long2) {
		this.m = kq;
		this.n = long2;
	}

	@Override
	public boolean n_() {
		return this.o != null && !this.o.isEmpty();
	}

	public void a(String string) {
		this.o = string;
	}

	@Override
	public afj a(int integer) {
		this.d(null);
		return this.q().get(integer);
	}

	@Override
	public afj a(int integer1, int integer2) {
		this.d(null);
		afj afj4 = rd.a(this.q(), integer1, integer2);
		if (!afj4.b()) {
			this.x_();
		}

		return afj4;
	}

	@Override
	public afj b(int integer) {
		this.d(null);
		return rd.a(this.q(), integer);
	}

	@Override
	public void a(int integer, @Nullable afj afj) {
		this.d(null);
		this.q().set(integer, afj);
		if (afj.E() > this.y_()) {
			afj.e(this.y_());
		}

		this.x_();
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
		return true;
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
		this.d(null);
		this.q().clear();
	}

	protected abstract dd<afj> q();
}

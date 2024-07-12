import com.google.common.collect.Lists;
import java.util.List;

public class rr implements rc {
	private String a;
	private final int b;
	private final dd<afj> c;
	private List<re> d;
	private boolean e;

	public rr(String string, boolean boolean2, int integer) {
		this.a = string;
		this.e = boolean2;
		this.b = integer;
		this.c = dd.a(integer, afj.a);
	}

	public rr(fb fb, int integer) {
		this(fb.c(), true, integer);
	}

	public void a(re re) {
		if (this.d == null) {
			this.d = Lists.newArrayList();
		}

		this.d.add(re);
	}

	public void b(re re) {
		this.d.remove(re);
	}

	@Override
	public afj a(int integer) {
		return integer >= 0 && integer < this.c.size() ? this.c.get(integer) : afj.a;
	}

	@Override
	public afj a(int integer1, int integer2) {
		afj afj4 = rd.a(this.c, integer1, integer2);
		if (!afj4.b()) {
			this.x_();
		}

		return afj4;
	}

	public afj a(afj afj) {
		afj afj3 = afj.l();

		for (int integer4 = 0; integer4 < this.b; integer4++) {
			afj afj5 = this.a(integer4);
			if (afj5.b()) {
				this.a(integer4, afj3);
				this.x_();
				return afj.a;
			}

			if (afj.c(afj5, afj3)) {
				int integer6 = Math.min(this.y_(), afj5.d());
				int integer7 = Math.min(afj3.E(), integer6 - afj5.E());
				if (integer7 > 0) {
					afj5.f(integer7);
					afj3.g(integer7);
					if (afj3.b()) {
						this.x_();
						return afj.a;
					}
				}
			}
		}

		if (afj3.E() != afj.E()) {
			this.x_();
		}

		return afj3;
	}

	@Override
	public afj b(int integer) {
		afj afj3 = this.c.get(integer);
		if (afj3.b()) {
			return afj.a;
		} else {
			this.c.set(integer, afj.a);
			return afj3;
		}
	}

	@Override
	public void a(int integer, afj afj) {
		this.c.set(integer, afj);
		if (!afj.b() && afj.E() > this.y_()) {
			afj.e(this.y_());
		}

		this.x_();
	}

	@Override
	public int v_() {
		return this.b;
	}

	@Override
	public boolean w_() {
		for (afj afj3 : this.c) {
			if (!afj3.b()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String h_() {
		return this.a;
	}

	@Override
	public boolean n_() {
		return this.e;
	}

	public void a(String string) {
		this.e = true;
		this.a = string;
	}

	@Override
	public fb i_() {
		return (fb)(this.n_() ? new fh(this.h_()) : new fi(this.h_()));
	}

	@Override
	public int y_() {
		return 64;
	}

	@Override
	public void x_() {
		if (this.d != null) {
			for (int integer2 = 0; integer2 < this.d.size(); integer2++) {
				((re)this.d.get(integer2)).a(this);
			}
		}
	}

	@Override
	public boolean a(aay aay) {
		return true;
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
		this.c.clear();
	}
}

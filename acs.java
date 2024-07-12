public class acs implements rc {
	private final dd<afj> a;
	private final int b;
	private final int c;
	private final acl d;

	public acs(acl acl, int integer2, int integer3) {
		this.a = dd.a(integer2 * integer3, afj.a);
		this.d = acl;
		this.b = integer2;
		this.c = integer3;
	}

	@Override
	public int v_() {
		return this.a.size();
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
		return integer >= this.v_() ? afj.a : this.a.get(integer);
	}

	public afj c(int integer1, int integer2) {
		return integer1 >= 0 && integer1 < this.b && integer2 >= 0 && integer2 <= this.c ? this.a(integer1 + integer2 * this.b) : afj.a;
	}

	@Override
	public String h_() {
		return "container.crafting";
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
	public afj b(int integer) {
		return rd.a(this.a, integer);
	}

	@Override
	public afj a(int integer1, int integer2) {
		afj afj4 = rd.a(this.a, integer1, integer2);
		if (!afj4.b()) {
			this.d.a(this);
		}

		return afj4;
	}

	@Override
	public void a(int integer, afj afj) {
		this.a.set(integer, afj);
		this.d.a(this);
	}

	@Override
	public int y_() {
		return 64;
	}

	@Override
	public void x_() {
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
		this.a.clear();
	}

	public int i() {
		return this.c;
	}

	public int j() {
		return this.b;
	}
}

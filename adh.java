public class adh implements rc {
	private final dd<afj> a = dd.a(1, afj.a);

	@Override
	public int v_() {
		return 1;
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
		return this.a.get(0);
	}

	@Override
	public String h_() {
		return "Result";
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
	public afj a(int integer1, int integer2) {
		return rd.a(this.a, 0);
	}

	@Override
	public afj b(int integer) {
		return rd.a(this.a, 0);
	}

	@Override
	public void a(int integer, afj afj) {
		this.a.set(0, afj);
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
}

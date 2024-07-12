public class rb implements ro {
	private final String a;
	private final ro b;
	private final ro c;

	public rb(String string, ro ro2, ro ro3) {
		this.a = string;
		if (ro2 == null) {
			ro2 = ro3;
		}

		if (ro3 == null) {
			ro3 = ro2;
		}

		this.b = ro2;
		this.c = ro3;
		if (ro2.z_()) {
			ro3.a(ro2.j());
		} else if (ro3.z_()) {
			ro2.a(ro3.j());
		}
	}

	@Override
	public int v_() {
		return this.b.v_() + this.c.v_();
	}

	@Override
	public boolean w_() {
		return this.b.w_() && this.c.w_();
	}

	public boolean a(rc rc) {
		return this.b == rc || this.c == rc;
	}

	@Override
	public String h_() {
		if (this.b.n_()) {
			return this.b.h_();
		} else {
			return this.c.n_() ? this.c.h_() : this.a;
		}
	}

	@Override
	public boolean n_() {
		return this.b.n_() || this.c.n_();
	}

	@Override
	public fb i_() {
		return (fb)(this.n_() ? new fh(this.h_()) : new fi(this.h_()));
	}

	@Override
	public afj a(int integer) {
		return integer >= this.b.v_() ? this.c.a(integer - this.b.v_()) : this.b.a(integer);
	}

	@Override
	public afj a(int integer1, int integer2) {
		return integer1 >= this.b.v_() ? this.c.a(integer1 - this.b.v_(), integer2) : this.b.a(integer1, integer2);
	}

	@Override
	public afj b(int integer) {
		return integer >= this.b.v_() ? this.c.b(integer - this.b.v_()) : this.b.b(integer);
	}

	@Override
	public void a(int integer, afj afj) {
		if (integer >= this.b.v_()) {
			this.c.a(integer - this.b.v_(), afj);
		} else {
			this.b.a(integer, afj);
		}
	}

	@Override
	public int y_() {
		return this.b.y_();
	}

	@Override
	public void x_() {
		this.b.x_();
		this.c.x_();
	}

	@Override
	public boolean a(aay aay) {
		return this.b.a(aay) && this.c.a(aay);
	}

	@Override
	public void b(aay aay) {
		this.b.b(aay);
		this.c.b(aay);
	}

	@Override
	public void c(aay aay) {
		this.b.c(aay);
		this.c.c(aay);
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
	public boolean z_() {
		return this.b.z_() || this.c.z_();
	}

	@Override
	public void a(rn rn) {
		this.b.a(rn);
		this.c.a(rn);
	}

	@Override
	public rn j() {
		return this.b.j();
	}

	@Override
	public String l() {
		return this.b.l();
	}

	@Override
	public acl a(aax aax, aay aay) {
		return new acp(aax, this, aay);
	}

	@Override
	public void m() {
		this.b.m();
		this.c.m();
	}
}

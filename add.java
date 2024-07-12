public class add implements rc {
	private final ajd a;
	private final dd<afj> b = dd.a(3, afj.a);
	private final aay c;
	private aje d;
	private int e;

	public add(aay aay, ajd ajd) {
		this.c = aay;
		this.a = ajd;
	}

	@Override
	public int v_() {
		return this.b.size();
	}

	@Override
	public boolean w_() {
		for (afj afj3 : this.b) {
			if (!afj3.b()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public afj a(int integer) {
		return this.b.get(integer);
	}

	@Override
	public afj a(int integer1, int integer2) {
		afj afj4 = this.b.get(integer1);
		if (integer1 == 2 && !afj4.b()) {
			return rd.a(this.b, integer1, afj4.E());
		} else {
			afj afj5 = rd.a(this.b, integer1, integer2);
			if (!afj5.b() && this.e(integer1)) {
				this.i();
			}

			return afj5;
		}
	}

	private boolean e(int integer) {
		return integer == 0 || integer == 1;
	}

	@Override
	public afj b(int integer) {
		return rd.a(this.b, integer);
	}

	@Override
	public void a(int integer, afj afj) {
		this.b.set(integer, afj);
		if (!afj.b() && afj.E() > this.y_()) {
			afj.e(this.y_());
		}

		if (this.e(integer)) {
			this.i();
		}
	}

	@Override
	public String h_() {
		return "mob.villager";
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

	@Override
	public boolean a(aay aay) {
		return this.a.s_() == aay;
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
	public void x_() {
		this.i();
	}

	public void i() {
		this.d = null;
		afj afj2 = this.b.get(0);
		afj afj3 = this.b.get(1);
		if (afj2.b()) {
			afj2 = afj3;
			afj3 = afj.a;
		}

		if (afj2.b()) {
			this.a(2, afj.a);
		} else {
			ajf ajf4 = this.a.b_(this.c);
			if (ajf4 != null) {
				aje aje5 = ajf4.a(afj2, afj3, this.e);
				if (aje5 != null && !aje5.h()) {
					this.d = aje5;
					this.a(2, aje5.d().l());
				} else if (!afj3.b()) {
					aje5 = ajf4.a(afj3, afj2, this.e);
					if (aje5 != null && !aje5.h()) {
						this.d = aje5;
						this.a(2, aje5.d().l());
					} else {
						this.a(2, afj.a);
					}
				} else {
					this.a(2, afj.a);
				}
			}

			this.a.a(this.a(2));
		}
	}

	public aje j() {
		return this.d;
	}

	public void d(int integer) {
		this.e = integer;
		this.i();
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
		this.b.clear();
	}
}

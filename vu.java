public class vu extends wc {
	xi a;
	sw b;

	public vu(xi xi) {
		super(xi, false, true);
		this.a = xi;
		this.a(1);
	}

	@Override
	public boolean a() {
		wp wp2 = this.a.o();
		if (wp2 == null) {
			return false;
		} else {
			this.b = wp2.b(this.a);
			if (this.b instanceof zp) {
				return false;
			} else if (this.a(this.b, false)) {
				return true;
			} else if (this.e.bJ().nextInt(20) == 0) {
				this.b = wp2.c(this.a);
				return this.a(this.b, false);
			} else {
				return false;
			}
		}
	}

	@Override
	public void c() {
		this.a.d(this.b);
		super.c();
	}
}

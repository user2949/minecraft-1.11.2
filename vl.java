public class vl extends ui {
	private final ti a;
	private boolean b;

	public vl(ti ti) {
		this.a = ti;
		this.a(5);
	}

	@Override
	public boolean a() {
		if (!this.a.dh()) {
			return false;
		} else if (this.a.aj()) {
			return false;
		} else if (!this.a.z) {
			return false;
		} else {
			sw sw2 = this.a.dk();
			if (sw2 == null) {
				return true;
			} else {
				return this.a.h(sw2) < 144.0 && sw2.bK() != null ? false : this.b;
			}
		}
	}

	@Override
	public void c() {
		this.a.x().o();
		this.a.r(true);
	}

	@Override
	public void d() {
		this.a.r(false);
	}

	public void a(boolean boolean1) {
		this.b = boolean1;
	}
}

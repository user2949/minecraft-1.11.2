public class vm extends ui {
	zp a;
	sw b;

	public vm(zp zp) {
		this.a = zp;
		this.a(1);
	}

	@Override
	public boolean a() {
		sw sw2 = this.a.z();
		return this.a.di() > 0 || sw2 != null && this.a.h(sw2) < 9.0;
	}

	@Override
	public void c() {
		this.a.x().o();
		this.b = this.a.z();
	}

	@Override
	public void d() {
		this.b = null;
	}

	@Override
	public void e() {
		if (this.b == null) {
			this.a.a(-1);
		} else if (this.a.h(this.b) > 49.0) {
			this.a.a(-1);
		} else if (!this.a.y().a(this.b)) {
			this.a.a(-1);
		} else {
			this.a.a(1);
		}
	}
}

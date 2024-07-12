public class vi extends ui {
	private final te a;
	private wo b;

	public vi(te te) {
		this.a = te;
		if (!(te.x() instanceof we)) {
			throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
		}
	}

	@Override
	public boolean a() {
		if (this.a.l.B()) {
			return false;
		} else {
			co co2 = new co(this.a);
			wp wp3 = this.a.l.ai().a(co2, 16);
			if (wp3 == null) {
				return false;
			} else {
				this.b = wp3.b(co2);
				return this.b == null ? false : (double)this.b.b(co2) < 2.25;
			}
		}
	}

	@Override
	public boolean b() {
		return this.a.l.B() ? false : !this.b.i() && this.b.c(new co(this.a));
	}

	@Override
	public void c() {
		((we)this.a.x()).a(false);
		((we)this.a.x()).b(false);
	}

	@Override
	public void d() {
		((we)this.a.x()).a(true);
		((we)this.a.x()).b(true);
		this.b = null;
	}

	@Override
	public void e() {
		this.b.b();
	}
}

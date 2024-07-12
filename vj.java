public class vj extends ui {
	private final te a;

	public vj(te te) {
		this.a = te;
	}

	@Override
	public boolean a() {
		return this.a.l.B() && this.a.b(ss.HEAD).b();
	}

	@Override
	public void c() {
		((we)this.a.x()).d(true);
	}

	@Override
	public void d() {
		((we)this.a.x()).d(false);
	}
}

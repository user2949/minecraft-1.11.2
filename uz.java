public class uz extends ui {
	private final xi a;
	private aat b;
	private int c;

	public uz(xi xi) {
		this.a = xi;
		this.a(3);
	}

	@Override
	public boolean a() {
		if (!this.a.l.B()) {
			return false;
		} else if (this.a.bJ().nextInt(8000) != 0) {
			return false;
		} else {
			this.b = this.a.l.a(aat.class, this.a.bo().c(6.0, 2.0, 6.0), this.a);
			return this.b != null;
		}
	}

	@Override
	public boolean b() {
		return this.c > 0;
	}

	@Override
	public void c() {
		this.c = 400;
		this.a.a(true);
	}

	@Override
	public void d() {
		this.a.a(false);
		this.b = null;
	}

	@Override
	public void e() {
		this.a.t().a(this.b, 30.0F, 30.0F);
		this.c--;
	}
}

public class ym extends ye {
	private int b;

	public ym(yb yb) {
		super(yb);
	}

	@Override
	public void b() {
		this.a.l.a(this.a.p, this.a.q, this.a.r, nn.aV, this.a.bC(), 2.5F, 0.8F + this.a.bJ().nextFloat() * 0.3F, false);
	}

	@Override
	public void c() {
		if (this.b++ >= 40) {
			this.a.da().a(yr.f);
		}
	}

	@Override
	public void d() {
		this.b = 0;
	}

	@Override
	public yr<ym> i() {
		return yr.h;
	}
}

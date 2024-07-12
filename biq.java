public class biq extends big {
	private static final kq v = new kq("textures/gui/container/dispenser.png");
	private final aax w;
	public rc u;

	public biq(aax aax, rc rc) {
		super(new acu(aax, rc));
		this.w = aax;
		this.u = rc;
	}

	@Override
	protected void b(int integer1, int integer2) {
		String string4 = this.u.i_().c();
		this.q.a(string4, this.f / 2 - this.q.a(string4) / 2, 6, 4210752);
		this.q.a(this.w.i_().c(), 8, this.g - 96 + 2, 4210752);
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(v);
		int integer5 = (this.l - this.f) / 2;
		int integer6 = (this.m - this.g) / 2;
		this.b(integer5, integer6, 0, 0, this.f, this.g);
	}
}

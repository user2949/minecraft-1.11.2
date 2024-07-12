public class biv extends big {
	private static final kq u = new kq("textures/gui/container/hopper.png");
	private final rc v;
	private final rc w;

	public biv(aax aax, rc rc) {
		super(new acz(aax, rc, bes.z().h));
		this.v = aax;
		this.w = rc;
		this.p = false;
		this.g = 133;
	}

	@Override
	protected void b(int integer1, int integer2) {
		this.q.a(this.w.i_().c(), 8, 6, 4210752);
		this.q.a(this.v.i_().c(), 8, this.g - 96 + 2, 4210752);
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(u);
		int integer5 = (this.l - this.f) / 2;
		int integer6 = (this.m - this.g) / 2;
		this.b(integer5, integer6, 0, 0, this.f, this.g);
	}
}

public class bim extends big {
	private static final kq u = new kq("textures/gui/container/generic_54.png");
	private final rc v;
	private final rc w;
	private final int x;

	public bim(rc rc1, rc rc2) {
		super(new acp(rc1, rc2, bes.z().h));
		this.v = rc1;
		this.w = rc2;
		this.p = false;
		int integer4 = 222;
		int integer5 = 114;
		this.x = rc2.v_() / 9;
		this.g = 114 + this.x * 18;
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
		this.b(integer5, integer6, 0, 0, this.f, this.x * 18 + 17);
		this.b(integer5, integer6 + this.x * 18 + 17, 0, 126, this.f, 96);
	}
}

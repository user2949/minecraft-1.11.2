public class biu extends big {
	private static final kq u = new kq("textures/gui/container/furnace.png");
	private final aax v;
	private final rc w;

	public biu(aax aax, rc rc) {
		super(new acx(aax, rc));
		this.v = aax;
		this.w = rc;
	}

	@Override
	protected void b(int integer1, int integer2) {
		String string4 = this.w.i_().c();
		this.q.a(string4, this.f / 2 - this.q.a(string4) / 2, 6, 4210752);
		this.q.a(this.v.i_().c(), 8, this.g - 96 + 2, 4210752);
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(u);
		int integer5 = (this.l - this.f) / 2;
		int integer6 = (this.m - this.g) / 2;
		this.b(integer5, integer6, 0, 0, this.f, this.g);
		if (asn.a(this.w)) {
			int integer7 = this.i(13);
			this.b(integer5 + 56, integer6 + 36 + 12 - integer7, 176, 12 - integer7, 14, integer7 + 1);
		}

		int integer7 = this.h(24);
		this.b(integer5 + 79, integer6 + 34, 176, 14, integer7 + 1, 16);
	}

	private int h(int integer) {
		int integer3 = this.w.c_(2);
		int integer4 = this.w.c_(3);
		return integer4 != 0 && integer3 != 0 ? integer3 * integer / integer4 : 0;
	}

	private int i(int integer) {
		int integer3 = this.w.c_(1);
		if (integer3 == 0) {
			integer3 = 200;
		}

		return this.w.c_(0) * integer / integer3;
	}
}

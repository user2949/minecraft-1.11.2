public class bik extends big {
	private static final kq u = new kq("textures/gui/container/brewing_stand.png");
	private static final int[] v = new int[]{29, 24, 20, 16, 11, 6, 0};
	private final aax w;
	private final rc x;

	public bik(aax aax, rc rc) {
		super(new aco(aax, rc));
		this.w = aax;
		this.x = rc;
	}

	@Override
	protected void b(int integer1, int integer2) {
		String string4 = this.x.i_().c();
		this.q.a(string4, this.f / 2 - this.q.a(string4) / 2, 6, 4210752);
		this.q.a(this.w.i_().c(), 8, this.g - 96 + 2, 4210752);
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(u);
		int integer5 = (this.l - this.f) / 2;
		int integer6 = (this.m - this.g) / 2;
		this.b(integer5, integer6, 0, 0, this.f, this.g);
		int integer7 = this.x.c_(1);
		int integer8 = ot.a((18 * integer7 + 20 - 1) / 20, 0, 18);
		if (integer8 > 0) {
			this.b(integer5 + 60, integer6 + 44, 176, 29, integer8, 4);
		}

		int integer9 = this.x.c_(0);
		if (integer9 > 0) {
			int integer10 = (int)(28.0F * (1.0F - (float)integer9 / 400.0F));
			if (integer10 > 0) {
				this.b(integer5 + 97, integer6 + 16, 176, 0, 9, integer10);
			}

			integer10 = v[integer9 / 2 % 7];
			if (integer10 > 0) {
				this.b(integer5 + 63, integer6 + 14 + 29 - integer10, 185, 29 - integer10, 12, integer10);
			}
		}
	}
}

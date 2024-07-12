public class biw extends big {
	private static final kq u = new kq("textures/gui/container/horse.png");
	private final rc v;
	private final rc w;
	private final xm x;
	private float y;
	private float z;

	public biw(rc rc1, rc rc2, xm xm) {
		super(new adb(rc1, rc2, xm, bes.z().h));
		this.v = rc1;
		this.w = rc2;
		this.x = xm;
		this.p = false;
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
		if (this.x instanceof xl) {
			xl xl7 = (xl)this.x;
			if (xl7.dh()) {
				this.b(integer5 + 79, integer6 + 17, 0, this.g, xl7.dl() * 18, 54);
			}
		}

		if (this.x.dA()) {
			this.b(integer5 + 7, integer6 + 35 - 18, 18, this.g + 54, 18, 18);
		}

		if (this.x.dK()) {
			if (this.x instanceof xq) {
				this.b(integer5 + 7, integer6 + 35, 36, this.g + 54, 18, 18);
			} else {
				this.b(integer5 + 7, integer6 + 35, 0, this.g + 54, 18, 18);
			}
		}

		bix.a(integer5 + 51, integer6 + 60, 17, (float)(integer5 + 51) - this.y, (float)(integer6 + 75 - 50) - this.z, this.x);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.y = (float)integer1;
		this.z = (float)integer2;
		super.a(integer1, integer2, float3);
	}
}

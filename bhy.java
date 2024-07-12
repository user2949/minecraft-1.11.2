public class bhy extends bfi {
	private static final kq a = new kq("textures/gui/achievement/achievement_background.png");
	private final bes f;
	private int g;
	private int h;
	private String i;
	private String j;
	private nq k;
	private long l;
	private final bvh m;
	private boolean n;

	public bhy(bes bes) {
		this.f = bes;
		this.m = bes.ad();
	}

	public void a(nq nq) {
		this.i = cah.a("achievement.get");
		this.j = nq.e().c();
		this.l = bes.I();
		this.k = nq;
		this.n = false;
	}

	public void b(nq nq) {
		this.i = nq.e().c();
		this.j = nq.f();
		this.l = bes.I() + 2500L;
		this.k = nq;
		this.n = true;
	}

	private void c() {
		bqg.b(0, 0, this.f.d, this.f.e);
		bqg.n(5889);
		bqg.F();
		bqg.n(5888);
		bqg.F();
		this.g = this.f.d;
		this.h = this.f.e;
		bfk bfk2 = new bfk(this.f);
		this.g = bfk2.a();
		this.h = bfk2.b();
		bqg.m(256);
		bqg.n(5889);
		bqg.F();
		bqg.a(0.0, (double)this.g, (double)this.h, 0.0, 1000.0, 3000.0);
		bqg.n(5888);
		bqg.F();
		bqg.c(0.0F, 0.0F, -2000.0F);
	}

	public void a() {
		if (this.k != null && this.l != 0L && bes.z().h != null) {
			double double2 = (double)(bes.I() - this.l) / 3000.0;
			if (this.n) {
				if (double2 > 0.5) {
					double2 = 0.5;
				}
			} else if (double2 < 0.0 || double2 > 1.0) {
				this.l = 0L;
				return;
			}

			this.c();
			bqg.j();
			bqg.a(false);
			double double4 = double2 * 2.0;
			if (double4 > 1.0) {
				double4 = 2.0 - double4;
			}

			double4 *= 4.0;
			double4 = 1.0 - double4;
			if (double4 < 0.0) {
				double4 = 0.0;
			}

			double4 *= double4;
			double4 *= double4;
			int integer6 = this.g - 160;
			int integer7 = 0 - (int)(double4 * 36.0);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bqg.y();
			this.f.N().a(a);
			bqg.g();
			this.b(integer6, integer7, 96, 202, 160, 32);
			if (this.n) {
				this.f.k.a(this.j, integer6 + 30, integer7 + 7, 120, -1);
			} else {
				this.f.k.a(this.i, integer6 + 30, integer7 + 7, -256);
				this.f.k.a(this.j, integer6 + 30, integer7 + 18, -1);
			}

			beq.c();
			bqg.g();
			bqg.D();
			bqg.h();
			bqg.f();
			this.m.b(this.k.d, integer6 + 8, integer7 + 8);
			bqg.g();
			bqg.a(true);
			bqg.k();
		}
	}

	public void b() {
		this.k = null;
		this.l = 0L;
	}
}

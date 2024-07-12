public class bfm extends bfi {
	protected static final kq a = new kq("textures/gui/widgets.png");
	protected int f = 200;
	protected int g = 20;
	public int h;
	public int i;
	public String j;
	public int k;
	public boolean l = true;
	public boolean m = true;
	protected boolean n;

	public bfm(int integer1, int integer2, int integer3, String string) {
		this(integer1, integer2, integer3, 200, 20, string);
	}

	public bfm(int integer1, int integer2, int integer3, int integer4, int integer5, String string) {
		this.k = integer1;
		this.h = integer2;
		this.i = integer3;
		this.f = integer4;
		this.g = integer5;
		this.j = string;
	}

	protected int a(boolean boolean1) {
		int integer3 = 1;
		if (!this.l) {
			integer3 = 0;
		} else if (boolean1) {
			integer3 = 2;
		}

		return integer3;
	}

	public void a(bes bes, int integer2, int integer3) {
		if (this.m) {
			bfg bfg5 = bes.k;
			bes.N().a(a);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.n = integer2 >= this.h && integer3 >= this.i && integer2 < this.h + this.f && integer3 < this.i + this.g;
			int integer6 = this.a(this.n);
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ONE, bqg.l.ZERO);
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
			this.b(this.h, this.i, 0, 46 + integer6 * 20, this.f / 2, this.g);
			this.b(this.h + this.f / 2, this.i, 200 - this.f / 2, 46 + integer6 * 20, this.f / 2, this.g);
			this.b(bes, integer2, integer3);
			int integer7 = 14737632;
			if (!this.l) {
				integer7 = 10526880;
			} else if (this.n) {
				integer7 = 16777120;
			}

			this.a(bfg5, this.j, this.h + this.f / 2, this.i + (this.g - 8) / 2, integer7);
		}
	}

	protected void b(bes bes, int integer2, int integer3) {
	}

	public void a(int integer1, int integer2) {
	}

	public boolean c(bes bes, int integer2, int integer3) {
		return this.l && this.m && integer2 >= this.h && integer3 >= this.i && integer2 < this.h + this.f && integer3 < this.i + this.g;
	}

	public boolean a() {
		return this.n;
	}

	public void b(int integer1, int integer2) {
	}

	public void a(ccs ccs) {
		ccs.a(cby.a(nn.hb, 1.0F));
	}

	public int b() {
		return this.f;
	}

	public void a(int integer) {
		this.f = integer;
	}
}

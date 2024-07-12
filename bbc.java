public abstract class bbc {
	protected ajw a;
	protected sx b;
	protected final oo<bbb> c = new oo<>();
	protected int d;
	protected int e;
	protected int f;
	protected boolean g;
	protected boolean h;
	protected boolean i;

	public void a(ajw ajw, sx sx) {
		this.a = ajw;
		this.b = sx;
		this.c.c();
		this.d = ot.d(sx.G + 1.0F);
		this.e = ot.d(sx.H + 1.0F);
		this.f = ot.d(sx.G + 1.0F);
	}

	public void a() {
		this.a = null;
		this.b = null;
	}

	protected bbb a(int integer1, int integer2, int integer3) {
		int integer5 = bbb.b(integer1, integer2, integer3);
		bbb bbb6 = this.c.a(integer5);
		if (bbb6 == null) {
			bbb6 = new bbb(integer1, integer2, integer3);
			this.c.a(integer5, bbb6);
		}

		return bbb6;
	}

	public abstract bbb b();

	public abstract bbb a(double double1, double double2, double double3);

	public abstract int a(bbb[] arr, bbb bbb2, bbb bbb3, float float4);

	public abstract bba a(ajw ajw, int integer2, int integer3, int integer4, sx sx, int integer6, int integer7, int integer8, boolean boolean9, boolean boolean10);

	public abstract bba a(ajw ajw, int integer2, int integer3, int integer4);

	public void a(boolean boolean1) {
		this.g = boolean1;
	}

	public void b(boolean boolean1) {
		this.h = boolean1;
	}

	public void c(boolean boolean1) {
		this.i = boolean1;
	}

	public boolean c() {
		return this.g;
	}

	public boolean d() {
		return this.h;
	}

	public boolean e() {
		return this.i;
	}
}

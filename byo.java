public abstract class byo implements bzb {
	protected int a = -1;
	protected boolean b;
	protected boolean c;
	protected boolean d;
	protected boolean e;

	public void a(boolean boolean1, boolean boolean2) {
		this.b = boolean1;
		this.c = boolean2;
		int integer4;
		int integer5;
		if (boolean1) {
			integer4 = boolean2 ? 9987 : 9729;
			integer5 = 9729;
		} else {
			integer4 = boolean2 ? 9986 : 9728;
			integer5 = 9728;
		}

		bqg.b(3553, 10241, integer4);
		bqg.b(3553, 10240, integer5);
	}

	@Override
	public void b(boolean boolean1, boolean boolean2) {
		this.d = this.b;
		this.e = this.c;
		this.a(boolean1, boolean2);
	}

	@Override
	public void a() {
		this.a(this.d, this.e);
	}

	@Override
	public int b() {
		if (this.a == -1) {
			this.a = bzc.a();
		}

		return this.a;
	}

	public void c() {
		if (this.a != -1) {
			bzc.a(this.a);
			this.a = -1;
		}
	}
}

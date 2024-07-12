public class va extends uc {
	boolean g;
	int h;

	public va(sx sx, boolean boolean2) {
		super(sx);
		this.a = sx;
		this.g = boolean2;
	}

	@Override
	public boolean b() {
		return this.g && this.h > 0 && super.b();
	}

	@Override
	public void c() {
		this.h = 20;
		this.c.a(this.a.l, this.b, true);
	}

	@Override
	public void d() {
		if (this.g) {
			this.c.a(this.a.l, this.b, false);
		}
	}

	@Override
	public void e() {
		this.h--;
		super.e();
	}
}

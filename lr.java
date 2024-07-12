public class lr extends lz {
	private boolean c;
	private boolean d;
	private int e;
	private int f;

	public lr(ajs ajs) {
		super(ajs);
	}

	@Override
	public void a() {
		super.a();
		this.f++;
		long long2 = this.a.P();
		long long4 = long2 / 24000L + 1L;
		if (!this.c && this.f > 20) {
			this.c = true;
			this.b.a.a(new gu(5, 0.0F));
		}

		this.d = long2 > 120500L;
		if (this.d) {
			this.e++;
		}

		if (long2 % 24000L == 500L) {
			if (long4 <= 6L) {
				this.b.a(new fi("demo.day." + long4));
			}
		} else if (long4 == 1L) {
			if (long2 == 100L) {
				this.b.a.a(new gu(5, 101.0F));
			} else if (long2 == 175L) {
				this.b.a.a(new gu(5, 102.0F));
			} else if (long2 == 250L) {
				this.b.a.a(new gu(5, 103.0F));
			}
		} else if (long4 == 5L && long2 % 24000L == 22000L) {
			this.b.a(new fi("demo.day.warning"));
		}
	}

	private void f() {
		if (this.e > 100) {
			this.b.a(new fi("demo.reminder"));
			this.e = 0;
		}
	}

	@Override
	public void a(co co, cv cv) {
		if (this.d) {
			this.f();
		} else {
			super.a(co, cv);
		}
	}

	@Override
	public void a(co co) {
		if (!this.d) {
			super.a(co);
		}
	}

	@Override
	public boolean b(co co) {
		return this.d ? false : super.b(co);
	}

	@Override
	public rk a(aay aay, ajs ajs, afj afj, ri ri) {
		if (this.d) {
			this.f();
			return rk.PASS;
		} else {
			return super.a(aay, ajs, afj, ri);
		}
	}

	@Override
	public rk a(aay aay, ajs ajs, afj afj, ri ri, co co, cv cv, float float7, float float8, float float9) {
		if (this.d) {
			this.f();
			return rk.PASS;
		} else {
			return super.a(aay, ajs, afj, ri, co, cv, float7, float8, float9);
		}
	}
}

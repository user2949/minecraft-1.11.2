public abstract class uu extends ui {
	private final te c;
	private final double d;
	protected int a;
	private int e;
	private int f;
	protected co b = co.a;
	private boolean g;
	private final int h;

	public uu(te te, double double2, int integer) {
		this.c = te;
		this.d = double2;
		this.h = integer;
		this.a(5);
	}

	@Override
	public boolean a() {
		if (this.a > 0) {
			this.a--;
			return false;
		} else {
			this.a = 200 + this.c.bJ().nextInt(200);
			return this.i();
		}
	}

	@Override
	public boolean b() {
		return this.e >= -this.f && this.e <= 1200 && this.a(this.c.l, this.b);
	}

	@Override
	public void c() {
		this.c.x().a((double)((float)this.b.p()) + 0.5, (double)(this.b.q() + 1), (double)((float)this.b.r()) + 0.5, this.d);
		this.e = 0;
		this.f = this.c.bJ().nextInt(this.c.bJ().nextInt(1200) + 1200) + 1200;
	}

	@Override
	public void e() {
		if (this.c.d(this.b.a()) > 1.0) {
			this.g = false;
			this.e++;
			if (this.e % 40 == 0) {
				this.c.x().a((double)((float)this.b.p()) + 0.5, (double)(this.b.q() + 1), (double)((float)this.b.r()) + 0.5, this.d);
			}
		} else {
			this.g = true;
			this.e--;
		}
	}

	protected boolean f() {
		return this.g;
	}

	private boolean i() {
		int integer2 = this.h;
		int integer3 = 1;
		co co4 = new co(this.c);

		for (int integer5 = 0; integer5 <= 1; integer5 = integer5 > 0 ? -integer5 : 1 - integer5) {
			for (int integer6 = 0; integer6 < integer2; integer6++) {
				for (int integer7 = 0; integer7 <= integer6; integer7 = integer7 > 0 ? -integer7 : 1 - integer7) {
					for (int integer8 = integer7 < integer6 && integer7 > -integer6 ? integer6 : 0; integer8 <= integer6; integer8 = integer8 > 0 ? -integer8 : 1 - integer8) {
						co co9 = co4.a(integer7, integer5 - 1, integer8);
						if (this.c.f(co9) && this.a(this.c.l, co9)) {
							this.b = co9;
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	protected abstract boolean a(ajs ajs, co co);
}

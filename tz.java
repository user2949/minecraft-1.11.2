public class tz extends ui {
	private final xk a;
	private aay b;
	private final ajs c;
	private final float d;
	private int e;

	public tz(xk xk, float float2) {
		this.a = xk;
		this.c = xk.l;
		this.d = float2;
		this.a(2);
	}

	@Override
	public boolean a() {
		this.b = this.c.a(this.a, (double)this.d);
		return this.b == null ? false : this.a(this.b);
	}

	@Override
	public boolean b() {
		if (!this.b.au()) {
			return false;
		} else {
			return this.a.h(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
		}
	}

	@Override
	public void c() {
		this.a.t(true);
		this.e = 40 + this.a.bJ().nextInt(40);
	}

	@Override
	public void d() {
		this.a.t(false);
		this.b = null;
	}

	@Override
	public void e() {
		this.a.t().a(this.b.p, this.b.q + (double)this.b.bq(), this.b.r, 10.0F, (float)this.a.N());
		this.e--;
	}

	private boolean a(aay aay) {
		for (ri ri6 : ri.values()) {
			afj afj7 = aay.b(ri6);
			if (this.a.dh() && afj7.c() == afl.bf) {
				return true;
			}

			if (this.a.e(afj7)) {
				return true;
			}
		}

		return false;
	}
}

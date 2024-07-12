import javax.annotation.Nullable;

public class yh extends yd {
	private bbd b;
	private bdw c;
	private boolean d;

	public yh(yb yb) {
		super(yb);
	}

	@Override
	public yr<yh> i() {
		return yr.a;
	}

	@Override
	public void c() {
		double double2 = this.c == null ? 0.0 : this.c.c(this.a.p, this.a.q, this.a.r);
		if (double2 < 100.0 || double2 > 22500.0 || this.a.A || this.a.B) {
			this.j();
		}
	}

	@Override
	public void d() {
		this.b = null;
		this.c = null;
	}

	@Nullable
	@Override
	public bdw g() {
		return this.c;
	}

	private void j() {
		if (this.b != null && this.b.b()) {
			co co2 = this.a.l.q(new co(awm.a));
			int integer3 = this.a.db() == null ? 0 : this.a.db().c();
			if (this.a.bJ().nextInt(integer3 + 3) == 0) {
				this.a.da().a(yr.c);
				return;
			}

			double double4 = 64.0;
			aay aay6 = this.a.l.a(co2, double4, double4);
			if (aay6 != null) {
				double4 = aay6.d(co2) / 512.0;
			}

			if (aay6 != null && (this.a.bJ().nextInt(ot.a((int)double4) + 2) == 0 || this.a.bJ().nextInt(integer3 + 2) == 0)) {
				this.a(aay6);
				return;
			}
		}

		if (this.b == null || this.b.b()) {
			int integer2 = this.a.o();
			int integer3x = integer2;
			if (this.a.bJ().nextInt(8) == 0) {
				this.d = !this.d;
				integer3x = integer2 + 6;
			}

			if (this.d) {
				integer3x++;
			} else {
				integer3x--;
			}

			if (this.a.db() != null && this.a.db().c() >= 0) {
				integer3x %= 12;
				if (integer3x < 0) {
					integer3x += 12;
				}
			} else {
				integer3x -= 12;
				integer3x &= 7;
				integer3x += 12;
			}

			this.b = this.a.a(integer2, integer3x, null);
			if (this.b != null) {
				this.b.a();
			}
		}

		this.k();
	}

	private void a(aay aay) {
		this.a.da().a(yr.b);
		this.a.da().b(yr.b).a(aay);
	}

	private void k() {
		if (this.b != null && !this.b.b()) {
			bdw bdw2 = this.b.f();
			this.b.a();
			double double3 = bdw2.b;
			double double5 = bdw2.d;

			double double7;
			do {
				double7 = bdw2.c + (double)(this.a.bJ().nextFloat() * 20.0F);
			} while (double7 < bdw2.c);

			this.c = new bdw(double3, double7, double5);
		}
	}

	@Override
	public void a(ya ya, co co, ry ry, @Nullable aay aay) {
		if (aay != null && !aay.bK.a) {
			this.a(aay);
		}
	}
}

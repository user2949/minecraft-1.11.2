import javax.annotation.Nullable;

public class yj extends yd {
	private bbd b;
	private bdw c;

	public yj(yb yb) {
		super(yb);
	}

	@Override
	public yr<yj> i() {
		return yr.c;
	}

	@Override
	public void d() {
		this.b = null;
		this.c = null;
	}

	@Override
	public void c() {
		double double2 = this.c == null ? 0.0 : this.c.c(this.a.p, this.a.q, this.a.r);
		if (double2 < 100.0 || double2 > 22500.0 || this.a.A || this.a.B) {
			this.j();
		}
	}

	@Nullable
	@Override
	public bdw g() {
		return this.c;
	}

	private void j() {
		if (this.b == null || this.b.b()) {
			int integer2 = this.a.o();
			co co3 = this.a.l.q(awm.a);
			aay aay4 = this.a.l.a(co3, 128.0, 128.0);
			int integer5;
			if (aay4 != null) {
				bdw bdw6 = new bdw(aay4.p, 0.0, aay4.r).a();
				integer5 = this.a.k(-bdw6.b * 40.0, 105.0, -bdw6.d * 40.0);
			} else {
				integer5 = this.a.k(40.0, (double)co3.q(), 0.0);
			}

			bbb bbb6 = new bbb(co3.p(), co3.q(), co3.r());
			this.b = this.a.a(integer2, integer5, bbb6);
			if (this.b != null) {
				this.b.a();
			}
		}

		this.k();
		if (this.b != null && this.b.b()) {
			this.a.da().a(yr.d);
		}
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
}

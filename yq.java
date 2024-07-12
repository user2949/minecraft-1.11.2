import javax.annotation.Nullable;

public class yq extends yd {
	private boolean b;
	private bbd c;
	private bdw d;

	public yq(yb yb) {
		super(yb);
	}

	@Override
	public void c() {
		if (!this.b && this.c != null) {
			co co2 = this.a.l.q(awm.a);
			double double3 = this.a.d(co2);
			if (double3 > 100.0) {
				this.a.da().a(yr.a);
			}
		} else {
			this.b = false;
			this.j();
		}
	}

	@Override
	public void d() {
		this.b = true;
		this.c = null;
		this.d = null;
	}

	private void j() {
		int integer2 = this.a.o();
		bdw bdw3 = this.a.a(1.0F);
		int integer4 = this.a.k(-bdw3.b * 40.0, 105.0, -bdw3.d * 40.0);
		if (this.a.db() != null && this.a.db().c() > 0) {
			integer4 %= 12;
			if (integer4 < 0) {
				integer4 += 12;
			}
		} else {
			integer4 -= 12;
			integer4 &= 7;
			integer4 += 12;
		}

		this.c = this.a.a(integer2, integer4, null);
		if (this.c != null) {
			this.c.a();
			this.k();
		}
	}

	private void k() {
		bdw bdw2 = this.c.f();
		this.c.a();

		double double3;
		do {
			double3 = bdw2.c + (double)(this.a.bJ().nextFloat() * 20.0F);
		} while (double3 < bdw2.c);

		this.d = new bdw(bdw2.b, double3, bdw2.d);
	}

	@Nullable
	@Override
	public bdw g() {
		return this.d;
	}

	@Override
	public yr<yq> i() {
		return yr.e;
	}
}

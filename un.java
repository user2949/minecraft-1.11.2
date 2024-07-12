import java.util.List;

public class un extends ui {
	public xq a;
	private double b;
	private int c;

	public un(xq xq, double double2) {
		this.a = xq;
		this.b = double2;
		this.a(1);
	}

	@Override
	public boolean a() {
		if (!this.a.cW() && !this.a.dR()) {
			List<xq> list2 = this.a.l.a(this.a.getClass(), this.a.bo().c(9.0, 4.0, 9.0));
			xq xq3 = null;
			double double4 = Double.MAX_VALUE;

			for (xq xq7 : list2) {
				if (xq7.dR() && !xq7.dQ()) {
					double double8 = this.a.h(xq7);
					if (!(double8 > double4)) {
						double4 = double8;
						xq3 = xq7;
					}
				}
			}

			if (xq3 == null) {
				for (xq xq7x : list2) {
					if (xq7x.cW() && !xq7x.dQ()) {
						double double8 = this.a.h(xq7x);
						if (!(double8 > double4)) {
							double4 = double8;
							xq3 = xq7x;
						}
					}
				}
			}

			if (xq3 == null) {
				return false;
			} else if (double4 < 4.0) {
				return false;
			} else if (!xq3.cW() && !this.a(xq3, 1)) {
				return false;
			} else {
				this.a.a(xq3);
				return true;
			}
		} else {
			return false;
		}
	}

	@Override
	public boolean b() {
		if (this.a.dR() && this.a.dS().au() && this.a(this.a, 0)) {
			double double2 = this.a.h(this.a.dS());
			if (double2 > 676.0) {
				if (this.b <= 3.0) {
					this.b *= 1.2;
					this.c = 40;
					return true;
				}

				if (this.c == 0) {
					return false;
				}
			}

			if (this.c > 0) {
				this.c--;
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	public void d() {
		this.a.dP();
		this.b = 2.1;
	}

	@Override
	public void e() {
		if (this.a.dR()) {
			xq xq2 = this.a.dS();
			double double3 = (double)this.a.g(xq2);
			float float5 = 2.0F;
			bdw bdw6 = new bdw(xq2.p - this.a.p, xq2.q - this.a.q, xq2.r - this.a.r).a().a(Math.max(double3 - 2.0, 0.0));
			this.a.x().a(this.a.p + bdw6.b, this.a.q + bdw6.c, this.a.r + bdw6.d, this.b);
		}
	}

	private boolean a(xq xq, int integer) {
		if (integer > 8) {
			return false;
		} else if (xq.dR()) {
			return xq.dS().cW() ? true : this.a(xq.dS(), ++integer);
		} else {
			return false;
		}
	}
}

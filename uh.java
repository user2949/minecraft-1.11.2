import java.util.List;

public class uh extends ui {
	ww a;
	ww b;
	double c;
	private int d;

	public uh(ww ww, double double2) {
		this.a = ww;
		this.c = double2;
	}

	@Override
	public boolean a() {
		if (this.a.l() >= 0) {
			return false;
		} else {
			List<ww> list2 = this.a.l.a(this.a.getClass(), this.a.bo().c(8.0, 4.0, 8.0));
			ww ww3 = null;
			double double4 = Double.MAX_VALUE;

			for (ww ww7 : list2) {
				if (ww7.l() >= 0) {
					double double8 = this.a.h(ww7);
					if (!(double8 > double4)) {
						double4 = double8;
						ww3 = ww7;
					}
				}
			}

			if (ww3 == null) {
				return false;
			} else if (double4 < 9.0) {
				return false;
			} else {
				this.b = ww3;
				return true;
			}
		}
	}

	@Override
	public boolean b() {
		if (this.a.l() >= 0) {
			return false;
		} else if (!this.b.au()) {
			return false;
		} else {
			double double2 = this.a.h(this.b);
			return !(double2 < 9.0) && !(double2 > 256.0);
		}
	}

	@Override
	public void c() {
		this.d = 0;
	}

	@Override
	public void d() {
		this.b = null;
	}

	@Override
	public void e() {
		if (--this.d <= 0) {
			this.d = 10;
			this.a.x().a(this.b, this.c);
		}
	}
}

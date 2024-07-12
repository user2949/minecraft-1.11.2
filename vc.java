import java.util.List;

public class vc extends ui {
	private final aat a;
	private sw b;
	private final double c;
	private int d;

	public vc(aat aat, double double2) {
		this.a = aat;
		this.c = double2;
		this.a(1);
	}

	@Override
	public boolean a() {
		if (this.a.l() >= 0) {
			return false;
		} else if (this.a.bJ().nextInt(400) != 0) {
			return false;
		} else {
			List<aat> list2 = this.a.l.a(aat.class, this.a.bo().c(6.0, 3.0, 6.0));
			double double3 = Double.MAX_VALUE;

			for (aat aat6 : list2) {
				if (aat6 != this.a && !aat6.dj() && aat6.l() < 0) {
					double double7 = aat6.h(this.a);
					if (!(double7 > double3)) {
						double3 = double7;
						this.b = aat6;
					}
				}
			}

			if (this.b == null) {
				bdw bdw5 = wm.a(this.a, 16, 3);
				if (bdw5 == null) {
					return false;
				}
			}

			return true;
		}
	}

	@Override
	public boolean b() {
		return this.d > 0;
	}

	@Override
	public void c() {
		if (this.b != null) {
			this.a.q(true);
		}

		this.d = 1000;
	}

	@Override
	public void d() {
		this.a.q(false);
		this.b = null;
	}

	@Override
	public void e() {
		this.d--;
		if (this.b != null) {
			if (this.a.h(this.b) > 4.0) {
				this.a.x().a(this.b, this.c);
			}
		} else if (this.a.x().n()) {
			bdw bdw2 = wm.a(this.a, 16, 3);
			if (bdw2 == null) {
				return;
			}

			this.a.x().a(bdw2.b, bdw2.c, bdw2.d, this.c);
		}
	}
}

public class uv extends ui {
	private final te a;
	private double b;
	private double c;
	private double d;
	private final double e;

	public uv(te te, double double2) {
		this.a = te;
		this.e = double2;
		this.a(1);
	}

	@Override
	public boolean a() {
		if (this.a.db()) {
			return false;
		} else {
			co co2 = this.a.dc();
			bdw bdw3 = wm.a(this.a, 16, 7, new bdw((double)co2.p(), (double)co2.q(), (double)co2.r()));
			if (bdw3 == null) {
				return false;
			} else {
				this.b = bdw3.b;
				this.c = bdw3.c;
				this.d = bdw3.d;
				return true;
			}
		}
	}

	@Override
	public boolean b() {
		return !this.a.x().n();
	}

	@Override
	public void c() {
		this.a.x().a(this.b, this.c, this.d, this.e);
	}
}

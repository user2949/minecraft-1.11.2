public class uw extends ui {
	private final te a;
	private sw b;
	private double c;
	private double d;
	private double e;
	private final double f;
	private final float g;

	public uw(te te, double double2, float float3) {
		this.a = te;
		this.f = double2;
		this.g = float3;
		this.a(1);
	}

	@Override
	public boolean a() {
		this.b = this.a.z();
		if (this.b == null) {
			return false;
		} else if (this.b.h(this.a) > (double)(this.g * this.g)) {
			return false;
		} else {
			bdw bdw2 = wm.a(this.a, 16, 7, new bdw(this.b.p, this.b.q, this.b.r));
			if (bdw2 == null) {
				return false;
			} else {
				this.c = bdw2.b;
				this.d = bdw2.c;
				this.e = bdw2.d;
				return true;
			}
		}
	}

	@Override
	public boolean b() {
		return !this.a.x().n() && this.b.au() && this.b.h(this.a) < (double)(this.g * this.g);
	}

	@Override
	public void d() {
		this.b = null;
	}

	@Override
	public void c() {
		this.a.x().a(this.c, this.d, this.e, this.f);
	}
}

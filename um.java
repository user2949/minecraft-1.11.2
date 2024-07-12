public class um extends ui {
	sx a;
	sw b;
	float c;

	public um(sx sx, float float2) {
		this.a = sx;
		this.c = float2;
		this.a(5);
	}

	@Override
	public boolean a() {
		this.b = this.a.z();
		if (this.b == null) {
			return false;
		} else {
			double double2 = this.a.h(this.b);
			if (double2 < 4.0 || double2 > 16.0) {
				return false;
			} else {
				return !this.a.z ? false : this.a.bJ().nextInt(5) == 0;
			}
		}
	}

	@Override
	public boolean b() {
		return !this.a.z;
	}

	@Override
	public void c() {
		double double2 = this.b.p - this.a.p;
		double double4 = this.b.r - this.a.r;
		float float6 = ot.a(double2 * double2 + double4 * double4);
		if ((double)float6 >= 1.0E-4) {
			this.a.s = this.a.s + double2 / (double)float6 * 0.5 * 0.8F + this.a.s * 0.2F;
			this.a.u = this.a.u + double4 / (double)float6 * 0.5 * 0.8F + this.a.u * 0.2F;
		}

		this.a.t = (double)this.c;
	}
}

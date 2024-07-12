public class yo extends ye {
	private int b;

	public yo(yb yb) {
		super(yb);
	}

	@Override
	public void c() {
		this.b++;
		sw sw2 = this.a.l.a(this.a, 20.0, 10.0);
		if (sw2 != null) {
			if (this.b > 25) {
				this.a.da().a(yr.h);
			} else {
				bdw bdw3 = new bdw(sw2.p - this.a.p, 0.0, sw2.r - this.a.r).a();
				bdw bdw4 = new bdw((double)ot.a(this.a.v * (float) (Math.PI / 180.0)), 0.0, (double)(-ot.b(this.a.v * (float) (Math.PI / 180.0)))).a();
				float float5 = (float)bdw4.b(bdw3);
				float float6 = (float)(Math.acos((double)float5) * 180.0F / (float)Math.PI) + 0.5F;
				if (float6 < 0.0F || float6 > 10.0F) {
					double double7 = sw2.p - this.a.bv.p;
					double double9 = sw2.r - this.a.bv.r;
					double double11 = ot.a(ot.g(180.0 - ot.c(double7, double9) * 180.0F / (float)Math.PI - (double)this.a.v), -100.0, 100.0);
					this.a.bg *= 0.8F;
					float float13 = ot.a(double7 * double7 + double9 * double9) + 1.0F;
					float float14 = float13;
					if (float13 > 40.0F) {
						float13 = 40.0F;
					}

					this.a.bg = (float)((double)this.a.bg + double11 * (double)(0.7F / float13 / float14));
					this.a.v = this.a.v + this.a.bg;
				}
			}
		} else if (this.b >= 100) {
			sw2 = this.a.l.a(this.a, 150.0, 150.0);
			this.a.da().a(yr.e);
			if (sw2 != null) {
				this.a.da().a(yr.i);
				this.a.da().b(yr.i).a(new bdw(sw2.p, sw2.q, sw2.r));
			}
		}
	}

	@Override
	public void d() {
		this.b = 0;
	}

	@Override
	public yr<yo> i() {
		return yr.g;
	}
}

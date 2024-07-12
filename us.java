public class us extends ui {
	private final te a;
	private wo b;
	private int c = -1;
	private int d = -1;

	public us(te te) {
		this.a = te;
		this.a(1);
	}

	@Override
	public boolean a() {
		co co2 = new co(this.a);
		if ((!this.a.l.B() || this.a.l.W() && !this.a.l.b(co2).d()) && this.a.l.s.m()) {
			if (this.a.bJ().nextInt(50) != 0) {
				return false;
			} else if (this.c != -1 && this.a.d((double)this.c, this.a.q, (double)this.d) < 4.0) {
				return false;
			} else {
				wp wp3 = this.a.l.ai().a(co2, 14);
				if (wp3 == null) {
					return false;
				} else {
					this.b = wp3.c(co2);
					return this.b != null;
				}
			}
		} else {
			return false;
		}
	}

	@Override
	public boolean b() {
		return !this.a.x().n();
	}

	@Override
	public void c() {
		this.c = -1;
		co co2 = this.b.e();
		int integer3 = co2.p();
		int integer4 = co2.q();
		int integer5 = co2.r();
		if (this.a.c(co2) > 256.0) {
			bdw bdw6 = wm.a(this.a, 14, 3, new bdw((double)integer3 + 0.5, (double)integer4, (double)integer5 + 0.5));
			if (bdw6 != null) {
				this.a.x().a(bdw6.b, bdw6.c, bdw6.d, 1.0);
			}
		} else {
			this.a.x().a((double)integer3 + 0.5, (double)integer4, (double)integer5 + 0.5, 1.0);
		}
	}

	@Override
	public void d() {
		this.c = this.b.e().p();
		this.d = this.b.e().r();
		this.b = null;
	}
}

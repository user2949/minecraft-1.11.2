public class vk extends ui {
	private final xm a;
	private final double b;
	private double c;
	private double d;
	private double e;

	public vk(xm xm, double double2) {
		this.a = xm;
		this.b = double2;
		this.a(1);
	}

	@Override
	public boolean a() {
		if (!this.a.dp() && this.a.aL()) {
			bdw bdw2 = wm.a(this.a, 5, 4);
			if (bdw2 == null) {
				return false;
			} else {
				this.c = bdw2.b;
				this.d = bdw2.c;
				this.e = bdw2.d;
				return true;
			}
		} else {
			return false;
		}
	}

	@Override
	public void c() {
		this.a.x().a(this.c, this.d, this.e, this.b);
	}

	@Override
	public boolean b() {
		return !this.a.x().n() && this.a.aL();
	}

	@Override
	public void e() {
		if (this.a.bJ().nextInt(50) == 0) {
			sn sn2 = (sn)this.a.bx().get(0);
			if (sn2 == null) {
				return;
			}

			if (sn2 instanceof aay) {
				int integer3 = this.a.dw();
				int integer4 = this.a.dC();
				if (integer4 > 0 && this.a.bJ().nextInt(integer4) < integer3) {
					this.a.h((aay)sn2);
					return;
				}

				this.a.n(5);
			}

			this.a.az();
			this.a.dF();
			this.a.l.a(this.a, (byte)6);
		}
	}
}

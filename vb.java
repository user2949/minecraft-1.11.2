import javax.annotation.Nullable;

public class vb extends ui {
	private final te b;
	protected double a;
	private double c;
	private double d;
	private double e;

	public vb(te te, double double2) {
		this.b = te;
		this.a = double2;
		this.a(1);
	}

	@Override
	public boolean a() {
		if (this.b.bK() == null && !this.b.aJ()) {
			return false;
		} else {
			if (this.b.aJ()) {
				co co2 = this.a(this.b.l, this.b, 5, 4);
				if (co2 != null) {
					this.c = (double)co2.p();
					this.d = (double)co2.q();
					this.e = (double)co2.r();
					return true;
				}
			}

			return this.f();
		}
	}

	private boolean f() {
		bdw bdw2 = wm.a(this.b, 5, 4);
		if (bdw2 == null) {
			return false;
		} else {
			this.c = bdw2.b;
			this.d = bdw2.c;
			this.e = bdw2.d;
			return true;
		}
	}

	@Override
	public void c() {
		this.b.x().a(this.c, this.d, this.e, this.a);
	}

	@Override
	public boolean b() {
		return !this.b.x().n();
	}

	@Nullable
	private co a(ajs ajs, sn sn, int integer3, int integer4) {
		co co6 = new co(sn);
		int integer7 = co6.p();
		int integer8 = co6.q();
		int integer9 = co6.r();
		float float10 = (float)(integer3 * integer3 * integer4 * 2);
		co co11 = null;
		co.a a12 = new co.a();

		for (int integer13 = integer7 - integer3; integer13 <= integer7 + integer3; integer13++) {
			for (int integer14 = integer8 - integer4; integer14 <= integer8 + integer4; integer14++) {
				for (int integer15 = integer9 - integer3; integer15 <= integer9 + integer3; integer15++) {
					a12.c(integer13, integer14, integer15);
					atl atl16 = ajs.o(a12);
					if (atl16.a() == azs.h) {
						float float17 = (float)(
							(integer13 - integer7) * (integer13 - integer7) + (integer14 - integer8) * (integer14 - integer8) + (integer15 - integer9) * (integer15 - integer9)
						);
						if (float17 < float10) {
							float10 = float17;
							co11 = new co(a12);
						}
					}
				}
			}
		}

		return co11;
	}
}

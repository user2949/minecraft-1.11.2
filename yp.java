import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class yp extends yd {
	private static final Logger b = LogManager.getLogger();
	private int c;
	private bbd d;
	private bdw e;
	private sw f;
	private boolean g;

	public yp(yb yb) {
		super(yb);
	}

	@Override
	public void c() {
		if (this.f == null) {
			b.warn("Skipping player strafe phase because no player was found");
			this.a.da().a(yr.a);
		} else {
			if (this.d != null && this.d.b()) {
				double double2 = this.f.p;
				double double4 = this.f.r;
				double double6 = double2 - this.a.p;
				double double8 = double4 - this.a.r;
				double double10 = (double)ot.a(double6 * double6 + double8 * double8);
				double double12 = Math.min(0.4F + double10 / 80.0 - 1.0, 10.0);
				this.e = new bdw(double2, this.f.q + double12, double4);
			}

			double double2 = this.e == null ? 0.0 : this.e.c(this.a.p, this.a.q, this.a.r);
			if (double2 < 100.0 || double2 > 22500.0) {
				this.j();
			}

			double double4 = 64.0;
			if (this.f.h(this.a) < 4096.0) {
				if (this.a.D(this.f)) {
					this.c++;
					bdw bdw6 = new bdw(this.f.p - this.a.p, 0.0, this.f.r - this.a.r).a();
					bdw bdw7 = new bdw((double)ot.a(this.a.v * (float) (Math.PI / 180.0)), 0.0, (double)(-ot.b(this.a.v * (float) (Math.PI / 180.0)))).a();
					float float8 = (float)bdw7.b(bdw6);
					float float9 = (float)(Math.acos((double)float8) * 180.0F / (float)Math.PI);
					float9 += 0.5F;
					if (this.c >= 5 && float9 >= 0.0F && float9 < 10.0F) {
						double double10 = 1.0;
						bdw bdw12 = this.a.f(1.0F);
						double double13 = this.a.bv.p - bdw12.b * 1.0;
						double double15 = this.a.bv.q + (double)(this.a.bv.H / 2.0F) + 0.5;
						double double17 = this.a.bv.r - bdw12.d * 1.0;
						double double19 = this.f.p - double13;
						double double21 = this.f.q + (double)(this.f.H / 2.0F) - (double15 + (double)(this.a.bv.H / 2.0F));
						double double23 = this.f.r - double17;
						this.a.l.a(null, 1017, new co(this.a), 0);
						abc abc25 = new abc(this.a.l, this.a, double19, double21, double23);
						abc25.b(double13, double15, double17, 0.0F, 0.0F);
						this.a.l.a(abc25);
						this.c = 0;
						if (this.d != null) {
							while (!this.d.b()) {
								this.d.a();
							}
						}

						this.a.da().a(yr.a);
					}
				} else if (this.c > 0) {
					this.c--;
				}
			} else if (this.c > 0) {
				this.c--;
			}
		}
	}

	private void j() {
		if (this.d == null || this.d.b()) {
			int integer2 = this.a.o();
			int integer3 = integer2;
			if (this.a.bJ().nextInt(8) == 0) {
				this.g = !this.g;
				integer3 = integer2 + 6;
			}

			if (this.g) {
				integer3++;
			} else {
				integer3--;
			}

			if (this.a.db() != null && this.a.db().c() > 0) {
				integer3 %= 12;
				if (integer3 < 0) {
					integer3 += 12;
				}
			} else {
				integer3 -= 12;
				integer3 &= 7;
				integer3 += 12;
			}

			this.d = this.a.a(integer2, integer3, null);
			if (this.d != null) {
				this.d.a();
			}
		}

		this.k();
	}

	private void k() {
		if (this.d != null && !this.d.b()) {
			bdw bdw2 = this.d.f();
			this.d.a();
			double double3 = bdw2.b;
			double double7 = bdw2.d;

			double double5;
			do {
				double5 = bdw2.c + (double)(this.a.bJ().nextFloat() * 20.0F);
			} while (double5 < bdw2.c);

			this.e = new bdw(double3, double5, double7);
		}
	}

	@Override
	public void d() {
		this.c = 0;
		this.e = null;
		this.d = null;
		this.f = null;
	}

	public void a(sw sw) {
		this.f = sw;
		int integer3 = this.a.o();
		int integer4 = this.a.k(this.f.p, this.f.q, this.f.r);
		int integer5 = ot.c(this.f.p);
		int integer6 = ot.c(this.f.r);
		double double7 = (double)integer5 - this.a.p;
		double double9 = (double)integer6 - this.a.r;
		double double11 = (double)ot.a(double7 * double7 + double9 * double9);
		double double13 = Math.min(0.4F + double11 / 80.0 - 1.0, 10.0);
		int integer15 = ot.c(this.f.q + double13);
		bbb bbb16 = new bbb(integer5, integer15, integer6);
		this.d = this.a.a(integer3, integer4, bbb16);
		if (this.d != null) {
			this.d.a();
			this.k();
		}
	}

	@Nullable
	@Override
	public bdw g() {
		return this.e;
	}

	@Override
	public yr<yp> i() {
		return yr.b;
	}
}

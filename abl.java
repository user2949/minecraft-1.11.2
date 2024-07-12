import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class abl extends sn {
	private sw a;
	private sn b;
	@Nullable
	private cv c;
	private int d;
	private double e;
	private double f;
	private double g;
	@Nullable
	private UUID h;
	private co at;
	@Nullable
	private UUID au;
	private co av;

	public abl(ajs ajs) {
		super(ajs);
		this.a(0.3125F, 0.3125F);
		this.Q = true;
	}

	@Override
	public no bC() {
		return no.HOSTILE;
	}

	public abl(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		this(ajs);
		this.b(double2, double3, double4, this.v, this.w);
		this.s = double5;
		this.t = double6;
		this.u = double7;
	}

	public abl(ajs ajs, sw sw, sn sn, cv.a a) {
		this(ajs);
		this.a = sw;
		co co6 = new co(sw);
		double double7 = (double)co6.p() + 0.5;
		double double9 = (double)co6.q() + 0.5;
		double double11 = (double)co6.r() + 0.5;
		this.b(double7, double9, double11, this.v, this.w);
		this.b = sn;
		this.c = cv.UP;
		this.a(a);
	}

	@Override
	protected void b(du du) {
		if (this.a != null) {
			co co3 = new co(this.a);
			du du4 = ee.a(this.a.be());
			du4.a("X", co3.p());
			du4.a("Y", co3.q());
			du4.a("Z", co3.r());
			du.a("Owner", du4);
		}

		if (this.b != null) {
			co co3 = new co(this.b);
			du du4 = ee.a(this.b.be());
			du4.a("X", co3.p());
			du4.a("Y", co3.q());
			du4.a("Z", co3.r());
			du.a("Target", du4);
		}

		if (this.c != null) {
			du.a("Dir", this.c.a());
		}

		du.a("Steps", this.d);
		du.a("TXD", this.e);
		du.a("TYD", this.f);
		du.a("TZD", this.g);
	}

	@Override
	protected void a(du du) {
		this.d = du.h("Steps");
		this.e = du.k("TXD");
		this.f = du.k("TYD");
		this.g = du.k("TZD");
		if (du.b("Dir", 99)) {
			this.c = cv.a(du.h("Dir"));
		}

		if (du.b("Owner", 10)) {
			du du3 = du.o("Owner");
			this.h = ee.b(du3);
			this.at = new co(du3.h("X"), du3.h("Y"), du3.h("Z"));
		}

		if (du.b("Target", 10)) {
			du du3 = du.o("Target");
			this.au = ee.b(du3);
			this.av = new co(du3.h("X"), du3.h("Y"), du3.h("Z"));
		}
	}

	@Override
	protected void i() {
	}

	private void a(@Nullable cv cv) {
		this.c = cv;
	}

	private void a(@Nullable cv.a a) {
		double double4 = 0.5;
		co co3;
		if (this.b == null) {
			co3 = new co(this).b();
		} else {
			double4 = (double)this.b.H * 0.5;
			co3 = new co(this.b.p, this.b.q + double4, this.b.r);
		}

		double double6 = (double)co3.p() + 0.5;
		double double8 = (double)co3.q() + double4;
		double double10 = (double)co3.r() + 0.5;
		cv cv12 = null;
		if (co3.g(this.p, this.q, this.r) >= 4.0) {
			co co13 = new co(this);
			List<cv> list14 = Lists.newArrayList();
			if (a != cv.a.X) {
				if (co13.p() < co3.p() && this.l.d(co13.f())) {
					list14.add(cv.EAST);
				} else if (co13.p() > co3.p() && this.l.d(co13.e())) {
					list14.add(cv.WEST);
				}
			}

			if (a != cv.a.Y) {
				if (co13.q() < co3.q() && this.l.d(co13.a())) {
					list14.add(cv.UP);
				} else if (co13.q() > co3.q() && this.l.d(co13.b())) {
					list14.add(cv.DOWN);
				}
			}

			if (a != cv.a.Z) {
				if (co13.r() < co3.r() && this.l.d(co13.d())) {
					list14.add(cv.SOUTH);
				} else if (co13.r() > co3.r() && this.l.d(co13.c())) {
					list14.add(cv.NORTH);
				}
			}

			cv12 = cv.a(this.S);
			if (list14.isEmpty()) {
				for (int integer15 = 5; !this.l.d(co13.a(cv12)) && integer15 > 0; integer15--) {
					cv12 = cv.a(this.S);
				}
			} else {
				cv12 = (cv)list14.get(this.S.nextInt(list14.size()));
			}

			double6 = this.p + (double)cv12.g();
			double8 = this.q + (double)cv12.h();
			double10 = this.r + (double)cv12.i();
		}

		this.a(cv12);
		double double13 = double6 - this.p;
		double double15 = double8 - this.q;
		double double17 = double10 - this.r;
		double double19 = (double)ot.a(double13 * double13 + double15 * double15 + double17 * double17);
		if (double19 == 0.0) {
			this.e = 0.0;
			this.f = 0.0;
			this.g = 0.0;
		} else {
			this.e = double13 / double19 * 0.15;
			this.f = double15 / double19 * 0.15;
			this.g = double17 / double19 * 0.15;
		}

		this.ai = true;
		this.d = 10 + this.S.nextInt(5) * 10;
	}

	@Override
	public void A_() {
		if (!this.l.E && this.l.ae() == rg.PEACEFUL) {
			this.T();
		} else {
			super.A_();
			if (!this.l.E) {
				if (this.b == null && this.au != null) {
					for (sw sw4 : this.l.a(sw.class, new bdt(this.av.a(-2, -2, -2), this.av.a(2, 2, 2)))) {
						if (sw4.be().equals(this.au)) {
							this.b = sw4;
							break;
						}
					}

					this.au = null;
				}

				if (this.a == null && this.h != null) {
					for (sw sw4x : this.l.a(sw.class, new bdt(this.at.a(-2, -2, -2), this.at.a(2, 2, 2)))) {
						if (sw4x.be().equals(this.h)) {
							this.a = sw4x;
							break;
						}
					}

					this.h = null;
				}

				if (this.b == null || !this.b.au() || this.b instanceof aay && ((aay)this.b).y()) {
					if (!this.ae()) {
						this.t -= 0.04;
					}
				} else {
					this.e = ot.a(this.e * 1.025, -1.0, 1.0);
					this.f = ot.a(this.f * 1.025, -1.0, 1.0);
					this.g = ot.a(this.g * 1.025, -1.0, 1.0);
					this.s = this.s + (this.e - this.s) * 0.2;
					this.t = this.t + (this.f - this.t) * 0.2;
					this.u = this.u + (this.g - this.u) * 0.2;
				}

				bdu bdu2 = abk.a(this, true, false, this.a);
				if (bdu2 != null) {
					this.a(bdu2);
				}
			}

			this.b(this.p + this.s, this.q + this.t, this.r + this.u);
			abk.a(this, 0.5F);
			if (this.l.E) {
				this.l.a(de.END_ROD, this.p - this.s, this.q - this.t + 0.15, this.r - this.u, 0.0, 0.0, 0.0);
			} else if (this.b != null && !this.b.F) {
				if (this.d > 0) {
					this.d--;
					if (this.d == 0) {
						this.a(this.c == null ? null : this.c.k());
					}
				}

				if (this.c != null) {
					co co2 = new co(this);
					cv.a a3 = this.c.k();
					if (this.l.d(co2.a(this.c), false)) {
						this.a(a3);
					} else {
						co co4 = new co(this.b);
						if (a3 == cv.a.X && co2.p() == co4.p() || a3 == cv.a.Z && co2.r() == co4.r() || a3 == cv.a.Y && co2.q() == co4.q()) {
							this.a(a3);
						}
					}
				}
			}
		}
	}

	@Override
	public boolean aJ() {
		return false;
	}

	@Override
	public boolean a(double double1) {
		return double1 < 16384.0;
	}

	@Override
	public float e(float float1) {
		return 1.0F;
	}

	@Override
	public int d(float float1) {
		return 15728880;
	}

	protected void a(bdu bdu) {
		if (bdu.d == null) {
			((lw)this.l).a(de.EXPLOSION_LARGE, this.p, this.q, this.r, 2, 0.2, 0.2, 0.2, 0.0);
			this.a(nn.fC, 1.0F, 1.0F);
		} else {
			boolean boolean3 = bdu.d.a(ry.a(this, this.a).b(), 4.0F);
			if (boolean3) {
				this.a(this.a, bdu.d);
				if (bdu.d instanceof sw) {
					((sw)bdu.d).c(new sh(si.y, 200));
				}
			}
		}

		this.T();
	}

	@Override
	public boolean aq() {
		return true;
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (!this.l.E) {
			this.a(nn.fD, 1.0F, 1.0F);
			((lw)this.l).a(de.CRIT, this.p, this.q, this.r, 15, 0.2, 0.2, 0.2, 0.0);
			this.T();
		}

		return true;
	}
}

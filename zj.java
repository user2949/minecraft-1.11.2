import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class zj extends sn {
	private static final Logger b = LogManager.getLogger();
	private static final kk<afj> c = kn.a(zj.class, km.f);
	private int d;
	private int e;
	private int f = 5;
	private String g;
	private String h;
	public float a = (float)(Math.random() * Math.PI * 2.0);

	public zj(ajs ajs, double double2, double double3, double double4) {
		super(ajs);
		this.a(0.25F, 0.25F);
		this.b(double2, double3, double4);
		this.v = (float)(Math.random() * 360.0);
		this.s = (double)((float)(Math.random() * 0.2F - 0.1F));
		this.t = 0.2F;
		this.u = (double)((float)(Math.random() * 0.2F - 0.1F));
	}

	public zj(ajs ajs, double double2, double double3, double double4, afj afj) {
		this(ajs, double2, double3, double4);
		this.a(afj);
	}

	@Override
	protected boolean af() {
		return false;
	}

	public zj(ajs ajs) {
		super(ajs);
		this.a(0.25F, 0.25F);
		this.a(afj.a);
	}

	@Override
	protected void i() {
		this.R().a(c, afj.a);
	}

	@Override
	public void A_() {
		if (this.k().b()) {
			this.T();
		} else {
			super.A_();
			if (this.e > 0 && this.e != 32767) {
				this.e--;
			}

			this.m = this.p;
			this.n = this.q;
			this.o = this.r;
			double double2 = this.s;
			double double4 = this.t;
			double double6 = this.u;
			if (!this.ae()) {
				this.t -= 0.04F;
			}

			if (this.l.E) {
				this.Q = false;
			} else {
				this.Q = this.i(this.p, (this.bo().b + this.bo().e) / 2.0, this.r);
			}

			this.a(tc.SELF, this.s, this.t, this.u);
			boolean boolean8 = (int)this.m != (int)this.p || (int)this.n != (int)this.q || (int)this.o != (int)this.r;
			if (boolean8 || this.T % 25 == 0) {
				if (this.l.o(new co(this)).a() == azs.i) {
					this.t = 0.2F;
					this.s = (double)((this.S.nextFloat() - this.S.nextFloat()) * 0.2F);
					this.u = (double)((this.S.nextFloat() - this.S.nextFloat()) * 0.2F);
					this.a(nn.bL, 0.4F, 2.0F + this.S.nextFloat() * 0.4F);
				}

				if (!this.l.E) {
					this.x();
				}
			}

			float float9 = 0.98F;
			if (this.z) {
				float9 = this.l.o(new co(ot.c(this.p), ot.c(this.bo().b) - 1, ot.c(this.r))).v().z * 0.98F;
			}

			this.s *= (double)float9;
			this.t *= 0.98F;
			this.u *= (double)float9;
			if (this.z) {
				this.t *= -0.5;
			}

			if (this.d != -32768) {
				this.d++;
			}

			this.ak();
			if (!this.l.E) {
				double double10 = this.s - double2;
				double double12 = this.t - double4;
				double double14 = this.u - double6;
				double double16 = double10 * double10 + double12 * double12 + double14 * double14;
				if (double16 > 0.01) {
					this.ai = true;
				}
			}

			if (!this.l.E && this.d >= 6000) {
				this.T();
			}
		}
	}

	private void x() {
		for (zj zj3 : this.l.a(zj.class, this.bo().c(0.5, 0.0, 0.5))) {
			this.a(zj3);
		}
	}

	private boolean a(zj zj) {
		if (zj == this) {
			return false;
		} else if (zj.au() && this.au()) {
			afj afj3 = this.k();
			afj afj4 = zj.k();
			if (this.e == 32767 || zj.e == 32767) {
				return false;
			} else if (this.d != -32768 && zj.d != -32768) {
				if (afj4.c() != afj3.c()) {
					return false;
				} else if (afj4.o() ^ afj3.o()) {
					return false;
				} else if (afj4.o() && !afj4.p().equals(afj3.p())) {
					return false;
				} else if (afj4.c() == null) {
					return false;
				} else if (afj4.c().l() && afj4.j() != afj3.j()) {
					return false;
				} else if (afj4.E() < afj3.E()) {
					return zj.a(this);
				} else if (afj4.E() + afj3.E() > afj4.d()) {
					return false;
				} else {
					afj4.f(afj3.E());
					zj.e = Math.max(zj.e, this.e);
					zj.d = Math.min(zj.d, this.d);
					zj.a(afj4);
					this.T();
					return true;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public void j() {
		this.d = 4800;
	}

	@Override
	public boolean ak() {
		if (this.l.a(this.bo(), azs.h, this)) {
			if (!this.U && !this.W) {
				this.al();
			}

			this.U = true;
		} else {
			this.U = false;
		}

		return this.U;
	}

	@Override
	protected void j(int integer) {
		this.a(ry.a, (float)integer);
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else if (!this.k().b() && this.k().c() == afl.ck && ry.c()) {
			return false;
		} else {
			this.ap();
			this.f = (int)((float)this.f - float2);
			if (this.f <= 0) {
				this.T();
			}

			return false;
		}
	}

	public static void a(ph ph) {
		ph.a(pf.ENTITY, new qr(zj.class, "Item"));
	}

	@Override
	public void b(du du) {
		du.a("Health", (short)this.f);
		du.a("Age", (short)this.d);
		du.a("PickupDelay", (short)this.e);
		if (this.n() != null) {
			du.a("Thrower", this.g);
		}

		if (this.l() != null) {
			du.a("Owner", this.h);
		}

		if (!this.k().b()) {
			du.a("Item", this.k().a(new du()));
		}
	}

	@Override
	public void a(du du) {
		this.f = du.g("Health");
		this.d = du.g("Age");
		if (du.e("PickupDelay")) {
			this.e = du.g("PickupDelay");
		}

		if (du.e("Owner")) {
			this.h = du.l("Owner");
		}

		if (du.e("Thrower")) {
			this.g = du.l("Thrower");
		}

		du du3 = du.o("Item");
		this.a(new afj(du3));
		if (this.k().b()) {
			this.T();
		}
	}

	@Override
	public void d(aay aay) {
		if (!this.l.E) {
			afj afj3 = this.k();
			afh afh4 = afj3.c();
			int integer5 = afj3.E();
			if (this.e == 0 && (this.h == null || 6000 - this.d <= 200 || this.h.equals(aay.h_())) && aay.bs.c(afj3)) {
				if (afh4 == afh.a(alv.r)) {
					aay.b(nr.g);
				}

				if (afh4 == afh.a(alv.s)) {
					aay.b(nr.g);
				}

				if (afh4 == afl.aN) {
					aay.b(nr.t);
				}

				if (afh4 == afl.l) {
					aay.b(nr.w);
				}

				if (afh4 == afl.bD) {
					aay.b(nr.A);
				}

				if (afh4 == afl.l && this.n() != null) {
					aay aay6 = this.l.a(this.n());
					if (aay6 != null && aay6 != aay) {
						aay6.b(nr.x);
					}
				}

				aay.a(this, integer5);
				if (afj3.b()) {
					this.T();
					afj3.e(integer5);
				}

				aay.a(oa.d(afh4), integer5);
			}
		}
	}

	@Override
	public String h_() {
		return this.n_() ? this.bi() : dp.a("item." + this.k().a());
	}

	@Override
	public boolean aV() {
		return false;
	}

	@Nullable
	@Override
	public sn c(int integer) {
		sn sn3 = super.c(integer);
		if (!this.l.E && sn3 instanceof zj) {
			((zj)sn3).x();
		}

		return sn3;
	}

	public afj k() {
		return this.R().a(c);
	}

	public void a(afj afj) {
		this.R().b(c, afj);
		this.R().b(c);
	}

	public String l() {
		return this.h;
	}

	public void d(String string) {
		this.h = string;
	}

	public String n() {
		return this.g;
	}

	public void e(String string) {
		this.g = string;
	}

	public int o() {
		return this.d;
	}

	public void q() {
		this.e = 10;
	}

	public void r() {
		this.e = 0;
	}

	public void s() {
		this.e = 32767;
	}

	public void a(int integer) {
		this.e = integer;
	}

	public boolean t() {
		return this.e > 0;
	}

	public void v() {
		this.d = -6000;
	}

	public void w() {
		this.s();
		this.d = 5999;
	}
}

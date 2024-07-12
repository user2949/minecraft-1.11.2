import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class abt extends abp {
	private static final kk<afj> e = kn.a(abt.class, km.f);
	private static final Logger f = LogManager.getLogger();
	public static final Predicate<sw> d = new Predicate<sw>() {
		public boolean apply(@Nullable sw sw) {
			return abt.c(sw);
		}
	};

	public abt(ajs ajs) {
		super(ajs);
	}

	public abt(ajs ajs, sw sw, afj afj) {
		super(ajs, sw);
		this.a(afj);
	}

	public abt(ajs ajs, double double2, double double3, double double4, afj afj) {
		super(ajs, double2, double3, double4);
		if (!afj.b()) {
			this.a(afj);
		}
	}

	@Override
	protected void i() {
		this.R().a(e, afj.a);
	}

	public afj l() {
		afj afj2 = this.R().a(e);
		if (afj2.c() != afl.bI && afj2.c() != afl.bJ) {
			if (this.l != null) {
				f.error("ThrownPotion entity {} has no item?!", new Object[]{this.O()});
			}

			return new afj(afl.bI);
		} else {
			return afj2;
		}
	}

	public void a(afj afj) {
		this.R().b(e, afj);
		this.R().b(e);
	}

	@Override
	protected float j() {
		return 0.05F;
	}

	@Override
	protected void a(bdu bdu) {
		if (!this.l.E) {
			afj afj3 = this.l();
			agy agy4 = aha.d(afj3);
			List<sh> list5 = aha.a(afj3);
			boolean boolean6 = agy4 == ahb.b && list5.isEmpty();
			if (bdu.a == bdu.a.BLOCK && boolean6) {
				co co7 = bdu.a().a(bdu.b);
				this.a(co7);

				for (cv cv9 : cv.c.HORIZONTAL) {
					this.a(co7.a(cv9));
				}
			}

			if (boolean6) {
				this.n();
			} else if (!list5.isEmpty()) {
				if (this.o()) {
					this.a(afj3, agy4);
				} else {
					this.a(bdu, list5);
				}
			}

			int integer7 = agy4.c() ? 2007 : 2002;
			this.l.b(integer7, new co(this), aha.c(afj3));
			this.T();
		}
	}

	private void n() {
		bdt bdt2 = this.bo().c(4.0, 2.0, 4.0);
		List<sw> list3 = this.l.a(sw.class, bdt2, d);
		if (!list3.isEmpty()) {
			for (sw sw5 : list3) {
				double double6 = this.h(sw5);
				if (double6 < 16.0 && c(sw5)) {
					sw5.a(ry.h, 1.0F);
				}
			}
		}
	}

	private void a(bdu bdu, List<sh> list) {
		bdt bdt4 = this.bo().c(4.0, 2.0, 4.0);
		List<sw> list5 = this.l.a(sw.class, bdt4);
		if (!list5.isEmpty()) {
			for (sw sw7 : list5) {
				if (sw7.cJ()) {
					double double8 = this.h(sw7);
					if (double8 < 16.0) {
						double double10 = 1.0 - Math.sqrt(double8) / 4.0;
						if (sw7 == bdu.d) {
							double10 = 1.0;
						}

						for (sh sh13 : list) {
							sg sg14 = sh13.a();
							if (sg14.b()) {
								sg14.a(this, this.k(), sw7, sh13.c(), double10);
							} else {
								int integer15 = (int)(double10 * (double)sh13.b() + 0.5);
								if (integer15 > 20) {
									sw7.c(new sh(sg14, integer15, sh13.c(), sh13.d(), sh13.e()));
								}
							}
						}
					}
				}
			}
		}
	}

	private void a(afj afj, agy agy) {
		sl sl4 = new sl(this.l, this.p, this.q, this.r);
		sl4.a(this.k());
		sl4.a(3.0F);
		sl4.b(-0.5F);
		sl4.g(10);
		sl4.c(-sl4.j() / (float)sl4.r());
		sl4.a(agy);

		for (sh sh6 : aha.b(afj)) {
			sl4.a(new sh(sh6));
		}

		du du5 = afj.p();
		if (du5 != null && du5.b("CustomPotionColor", 99)) {
			sl4.a(du5.h("CustomPotionColor"));
		}

		this.l.a(sl4);
	}

	private boolean o() {
		return this.l().c() == afl.bJ;
	}

	private void a(co co) {
		if (this.l.o(co).v() == alv.ab) {
			this.l.a(co, alv.a.t(), 2);
		}
	}

	public static void a(ph ph) {
		abp.a(ph, "ThrownPotion");
		ph.a(pf.ENTITY, new qr(abt.class, "Potion"));
	}

	@Override
	public void a(du du) {
		super.a(du);
		afj afj3 = new afj(du.o("Potion"));
		if (afj3.b()) {
			this.T();
		} else {
			this.a(afj3);
		}
	}

	@Override
	public void b(du du) {
		super.b(du);
		afj afj3 = this.l();
		if (!afj3.b()) {
			du.a("Potion", afj3.a(new du()));
		}
	}

	private static boolean c(sw sw) {
		return sw instanceof zr || sw instanceof zn;
	}
}

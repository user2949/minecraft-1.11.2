import java.util.Random;

public class amw extends alo {
	public static final aty a = amu.H;
	public static final atx b = atx.a("triggered");
	public static final cu<afh, cw> c = new cu<>(new cs());
	protected Random d = new Random();

	protected amw() {
		super(azs.e);
		this.y(this.A.b().a(a, cv.NORTH).a(b, false));
		this.a(aej.d);
	}

	@Override
	public int a(ajs ajs) {
		return 4;
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		super.c(ajs, co, atl);
		this.e(ajs, co, atl);
	}

	private void e(ajs ajs, co co, atl atl) {
		if (!ajs.E) {
			cv cv5 = atl.c(a);
			boolean boolean6 = ajs.o(co.c()).b();
			boolean boolean7 = ajs.o(co.d()).b();
			if (cv5 == cv.NORTH && boolean6 && !boolean7) {
				cv5 = cv.SOUTH;
			} else if (cv5 == cv.SOUTH && boolean7 && !boolean6) {
				cv5 = cv.NORTH;
			} else {
				boolean boolean8 = ajs.o(co.e()).b();
				boolean boolean9 = ajs.o(co.f()).b();
				if (cv5 == cv.WEST && boolean8 && !boolean9) {
					cv5 = cv.EAST;
				} else if (cv5 == cv.EAST && boolean9 && !boolean8) {
					cv5 = cv.WEST;
				}
			}

			ajs.a(co, atl.a(a, cv5).a(b, false), 2);
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			asc asc11 = ajs.r(co);
			if (asc11 instanceof asi) {
				aay.a((rc)((asi)asc11));
				if (asc11 instanceof asj) {
					aay.b(oa.O);
				} else {
					aay.b(oa.Q);
				}
			}

			return true;
		}
	}

	protected void c(ajs ajs, co co) {
		cq cq4 = new cq(ajs, co);
		asi asi5 = cq4.g();
		if (asi5 != null) {
			int integer6 = asi5.o();
			if (integer6 < 0) {
				ajs.b(1001, co, 0);
			} else {
				afj afj7 = asi5.a(integer6);
				cw cw8 = this.a(afj7);
				if (cw8 != cw.a) {
					asi5.a(integer6, cw8.a(cq4, afj7));
				}
			}
		}
	}

	protected cw a(afj afj) {
		return c.c(afj.c());
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		boolean boolean7 = ajs.y(co3) || ajs.y(co3.a());
		boolean boolean8 = (Boolean)atl.c(b);
		if (boolean7 && !boolean8) {
			ajs.a(co3, this, this.a(ajs));
			ajs.a(co3, atl.a(b, true), 4);
		} else if (!boolean7 && boolean8) {
			ajs.a(co3, atl.a(b, false), 4);
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			this.c(ajs, co);
		}
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asi();
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(a, cv.a(co, sw)).a(b, false);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		ajs.a(co, atl.a(a, cv.a(co, sw)), 2);
		if (afj.t()) {
			asc asc7 = ajs.r(co);
			if (asc7 instanceof asi) {
				((asi)asc7).a(afj.r());
			}
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		asc asc5 = ajs.r(co);
		if (asc5 instanceof asi) {
			rf.a(ajs, co, (asi)asc5);
			ajs.d(co, this);
		}

		super.b(ajs, co, atl);
	}

	public static df a(cp cp) {
		cv cv2 = cp.e().c(a);
		double double3 = cp.a() + 0.7 * (double)cv2.g();
		double double5 = cp.b() + 0.7 * (double)cv2.h();
		double double7 = cp.c() + 0.7 * (double)cv2.i();
		return new dg(double3, double5, double7);
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajs ajs, co co) {
		return acl.a(ajs.r(co));
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, cv.a(integer & 7)).a(b, (integer & 8) > 0);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(a)).a();
		if ((Boolean)atl.c(b)) {
			integer3 |= 8;
		}

		return integer3;
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(a, aqi.a(atl.c(a)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(a)));
	}

	@Override
	protected atm b() {
		return new atm(this, a, b);
	}
}

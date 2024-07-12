import java.util.Random;

public class amm extends alo {
	public static final aty a = amu.H;
	public static final atx b = atx.a("conditional");

	public amm(azt azt) {
		super(azs.f, azt);
		this.y(this.A.b().a(a, cv.NORTH).a(b, false));
	}

	@Override
	public asc a(ajs ajs, int integer) {
		asf asf4 = new asf();
		asf4.b(this == alv.dd);
		return asf4;
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!ajs.E) {
			asc asc7 = ajs.r(co3);
			if (asc7 instanceof asf) {
				asf asf8 = (asf)asc7;
				boolean boolean9 = ajs.y(co3);
				boolean boolean10 = asf8.f();
				boolean boolean11 = asf8.h();
				if (boolean9 && !boolean10) {
					asf8.a(true);
					if (asf8.k() != asf.a.SEQUENCE && !boolean11) {
						boolean boolean12 = !asf8.l() || this.e(ajs, co3, atl);
						asf8.c(boolean12);
						ajs.a(co3, this, this.a(ajs));
						if (boolean12) {
							this.c(ajs, co3);
						}
					}
				} else if (!boolean9 && boolean10) {
					asf8.a(false);
				}
			}
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			asc asc6 = ajs.r(co);
			if (asc6 instanceof asf) {
				asf asf7 = (asf)asc6;
				ajh ajh8 = asf7.a();
				boolean boolean9 = !oy.b(ajh8.m());
				asf.a a10 = asf7.k();
				boolean boolean11 = !asf7.l() || this.e(ajs, co, atl);
				boolean boolean12 = asf7.i();
				boolean boolean13 = false;
				if (a10 != asf.a.SEQUENCE && boolean12 && boolean9) {
					ajh8.a(ajs);
					boolean13 = true;
				}

				if (asf7.f() || asf7.h()) {
					if (a10 == asf.a.SEQUENCE && boolean11 && boolean9) {
						ajh8.a(ajs);
						boolean13 = true;
					}

					if (a10 == asf.a.AUTO) {
						ajs.a(co, this, this.a(ajs));
						if (boolean11) {
							this.c(ajs, co);
						}
					}
				}

				if (!boolean13) {
					ajh8.a(0);
				}

				asf7.c(boolean11);
				ajs.d(co, this);
			}
		}
	}

	public boolean e(ajs ajs, co co, atl atl) {
		cv cv5 = atl.c(a);
		asc asc6 = ajs.r(co.a(cv5.d()));
		return asc6 instanceof asf && ((asf)asc6).a().k() > 0;
	}

	@Override
	public int a(ajs ajs) {
		return 1;
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		asc asc11 = ajs.r(co);
		if (asc11 instanceof asf && aay.dk()) {
			aay.a((asf)asc11);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}

	@Override
	public int c(atl atl, ajs ajs, co co) {
		asc asc5 = ajs.r(co);
		return asc5 instanceof asf ? ((asf)asc5).a().k() : 0;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		asc asc7 = ajs.r(co);
		if (asc7 instanceof asf) {
			asf asf8 = (asf)asc7;
			ajh ajh9 = asf8.a();
			if (afj.t()) {
				ajh9.b(afj.r());
			}

			if (!ajs.E) {
				du du10 = afj.p();
				if (du10 == null || !du10.b("BlockEntityTag", 10)) {
					ajh9.a(ajs.U().b("sendCommandFeedback"));
					asf8.b(this == alv.dd);
				}

				if (asf8.k() == asf.a.SEQUENCE) {
					boolean boolean11 = ajs.y(co);
					asf8.a(boolean11);
				}
			}
		}
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, cv.a(integer & 7)).a(b, (integer & 8) != 0);
	}

	@Override
	public int e(atl atl) {
		return ((cv)atl.c(a)).a() | (atl.c(b) ? 8 : 0);
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

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(a, cv.a(co, sw)).a(b, false);
	}

	public void c(ajs ajs, co co) {
		atl atl4 = ajs.o(co);
		if (atl4.v() == alv.bX || atl4.v() == alv.dc) {
			co.a a5 = new co.a(co);
			a5.c(atl4.c(a));

			for (asc asc6 = ajs.r(a5); asc6 instanceof asf; asc6 = ajs.r(a5)) {
				asf asf7 = (asf)asc6;
				if (asf7.k() != asf.a.SEQUENCE) {
					break;
				}

				atl atl8 = ajs.o(a5);
				alu alu9 = atl8.v();
				if (alu9 != alv.dd || ajs.b(a5, alu9)) {
					break;
				}

				ajs.a(new co(a5), alu9, this.a(ajs));
				a5.c(atl8.c(a));
			}
		}
	}
}

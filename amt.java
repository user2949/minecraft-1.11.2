import java.util.Random;

public abstract class amt extends aoi {
	protected static final bdt c = new bdt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
	protected final boolean d;

	protected amt(boolean boolean1) {
		super(azs.q);
		this.d = boolean1;
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return c;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return ajs.o(co.b()).r() ? super.a(ajs, co) : false;
	}

	public boolean b(ajs ajs, co co) {
		return ajs.o(co.b()).r();
	}

	@Override
	public void a(ajs ajs, co co, atl atl, Random random) {
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!this.b(ajs, co, atl)) {
			boolean boolean6 = this.e(ajs, co, atl);
			if (this.d && !boolean6) {
				ajs.a(co, this.A(atl), 2);
			} else if (!this.d) {
				ajs.a(co, this.z(atl), 2);
				if (!boolean6) {
					ajs.a(co, this.z(atl).v(), this.F(atl), -1);
				}
			}
		}
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return cv.k() != cv.a.Y;
	}

	protected boolean B(atl atl) {
		return this.d;
	}

	@Override
	public int c(atl atl, ajw ajw, co co, cv cv) {
		return atl.a(ajw, co, cv);
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		if (!this.B(atl)) {
			return 0;
		} else {
			return atl.c(D) == cv ? this.a(ajw, co, atl) : 0;
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (this.b(ajs, co3)) {
			this.g(ajs, co3, atl);
		} else {
			this.b(ajs, co3, atl, 0);
			ajs.g(co3);

			for (cv cv10 : cv.values()) {
				ajs.b(co3.a(cv10), this, false);
			}
		}
	}

	protected void g(ajs ajs, co co, atl atl) {
		if (!this.b(ajs, co, atl)) {
			boolean boolean5 = this.e(ajs, co, atl);
			if (this.d != boolean5 && !ajs.a(co, this)) {
				int integer6 = -1;
				if (this.i(ajs, co, atl)) {
					integer6 = -3;
				} else if (this.d) {
					integer6 = -2;
				}

				ajs.a(co, this, this.i(atl), integer6);
			}
		}
	}

	public boolean b(ajw ajw, co co, atl atl) {
		return false;
	}

	protected boolean e(ajs ajs, co co, atl atl) {
		return this.f(ajs, co, atl) > 0;
	}

	protected int f(ajs ajs, co co, atl atl) {
		cv cv5 = atl.c(D);
		co co6 = co.a(cv5);
		int integer7 = ajs.c(co6, cv5);
		if (integer7 >= 15) {
			return integer7;
		} else {
			atl atl8 = ajs.o(co6);
			return Math.max(integer7, atl8.v() == alv.af ? (Integer)atl8.c(aqb.e) : 0);
		}
	}

	protected int c(ajw ajw, co co, atl atl) {
		cv cv5 = atl.c(D);
		cv cv6 = cv5.e();
		cv cv7 = cv5.f();
		return Math.max(this.b(ajw, co.a(cv6), cv6), this.b(ajw, co.a(cv7), cv7));
	}

	protected int b(ajw ajw, co co, cv cv) {
		atl atl5 = ajw.o(co);
		alu alu6 = atl5.v();
		if (this.C(atl5)) {
			if (alu6 == alv.cn) {
				return 15;
			} else {
				return alu6 == alv.af ? (Integer)atl5.c(aqb.e) : ajw.a(co, cv);
			}
		} else {
			return 0;
		}
	}

	@Override
	public boolean g(atl atl) {
		return true;
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(D, sw.bl().d());
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		if (this.e(ajs, co, atl)) {
			ajs.a(co, this, 1);
		}
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		this.h(ajs, co, atl);
	}

	protected void h(ajs ajs, co co, atl atl) {
		cv cv5 = atl.c(D);
		co co6 = co.a(cv5.d());
		ajs.a(co6, this, co);
		ajs.a(co6, this, cv5);
	}

	@Override
	public void d(ajs ajs, co co, atl atl) {
		if (this.d) {
			for (cv cv8 : cv.values()) {
				ajs.b(co.a(cv8), this, false);
			}
		}

		super.d(ajs, co, atl);
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	protected boolean C(atl atl) {
		return atl.n();
	}

	protected int a(ajw ajw, co co, atl atl) {
		return 15;
	}

	public static boolean D(atl atl) {
		return alv.bb.E(atl) || alv.cj.E(atl);
	}

	public boolean E(atl atl) {
		alu alu3 = atl.v();
		return alu3 == this.z(this.t()).v() || alu3 == this.A(this.t()).v();
	}

	public boolean i(ajs ajs, co co, atl atl) {
		cv cv5 = ((cv)atl.c(D)).d();
		co co6 = co.a(cv5);
		return D(ajs.o(co6)) ? ajs.o(co6).c(D) != cv5 : false;
	}

	protected int F(atl atl) {
		return this.i(atl);
	}

	protected abstract int i(atl atl);

	protected abstract atl z(atl atl);

	protected abstract atl A(atl atl);

	@Override
	public boolean b(alu alu) {
		return this.E(alu.t());
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}
}

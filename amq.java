import java.util.Random;

public class amq extends alo {
	public static final aua a = aua.a("power", 0, 15);
	protected static final bdt b = new bdt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0);
	private final boolean c;

	public amq(boolean boolean1) {
		super(azs.d);
		this.c = boolean1;
		this.y(this.A.b().a(a, 0));
		this.a(aej.d);
		this.c(0.2F);
		this.a(aqu.a);
		this.c("daylightDetector");
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return b;
	}

	@Override
	public int b(atl atl, ajw ajw, co co, cv cv) {
		return (Integer)atl.c(a);
	}

	public void c(ajs ajs, co co) {
		if (ajs.s.m()) {
			atl atl4 = ajs.o(co);
			int integer5 = ajs.b(ajy.SKY, co) - ajs.af();
			float float6 = ajs.d(1.0F);
			if (this.c) {
				integer5 = 15 - integer5;
			}

			if (integer5 > 0 && !this.c) {
				float float7 = float6 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
				float6 += (float7 - float6) * 0.2F;
				integer5 = Math.round((float)integer5 * ot.b(float6));
			}

			integer5 = ot.a(integer5, 0, 15);
			if ((Integer)atl4.c(a) != integer5) {
				ajs.a(co, atl4.a(a, integer5), 3);
			}
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (aay.dc()) {
			if (ajs.E) {
				return true;
			} else {
				if (this.c) {
					ajs.a(co, alv.cl.t().a(a, atl.c(a)), 4);
					alv.cl.c(ajs, co);
				} else {
					ajs.a(co, alv.cm.t().a(a, atl.c(a)), 4);
					alv.cm.c(ajs, co);
				}

				return true;
			}
		} else {
			return super.a(ajs, co, atl, aay, ri, cv, float7, float8, float9);
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(alv.cl);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(alv.cl);
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public boolean g(atl atl) {
		return true;
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new ash();
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(a);
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		if (!this.c) {
			super.a(afh, aej, dd);
		}
	}
}

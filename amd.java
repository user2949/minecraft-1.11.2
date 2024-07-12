import java.util.Random;

public class amd extends alu {
	public static final aua a = aua.a("bites", 0, 6);
	protected static final bdt[] b = new bdt[]{
		new bdt(0.0625, 0.0, 0.0625, 0.9375, 0.5, 0.9375),
		new bdt(0.1875, 0.0, 0.0625, 0.9375, 0.5, 0.9375),
		new bdt(0.3125, 0.0, 0.0625, 0.9375, 0.5, 0.9375),
		new bdt(0.4375, 0.0, 0.0625, 0.9375, 0.5, 0.9375),
		new bdt(0.5625, 0.0, 0.0625, 0.9375, 0.5, 0.9375),
		new bdt(0.6875, 0.0, 0.0625, 0.9375, 0.5, 0.9375),
		new bdt(0.8125, 0.0, 0.0625, 0.9375, 0.5, 0.9375)
	};

	protected amd() {
		super(azs.F);
		this.y(this.A.b().a(a, 0));
		this.a(true);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return b[atl.c(a)];
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
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (!ajs.E) {
			return this.b(ajs, co, atl, aay);
		} else {
			afj afj11 = aay.b(ri);
			return this.b(ajs, co, atl, aay) || afj11.b();
		}
	}

	private boolean b(ajs ajs, co co, atl atl, aay aay) {
		if (!aay.n(false)) {
			return false;
		} else {
			aay.b(oa.H);
			aay.da().a(2, 0.1F);
			int integer6 = (Integer)atl.c(a);
			if (integer6 < 6) {
				ajs.a(co, atl.a(a, integer6 + 1), 3);
			} else {
				ajs.g(co);
			}

			return true;
		}
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return super.a(ajs, co) ? this.b(ajs, co) : false;
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!this.b(ajs, co3)) {
			ajs.g(co3);
		}
	}

	private boolean b(ajs ajs, co co) {
		return ajs.o(co.b()).a().a();
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.a;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.bh);
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
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
	public int c(atl atl, ajs ajs, co co) {
		return (7 - (Integer)atl.c(a)) * 2;
	}

	@Override
	public boolean x(atl atl) {
		return true;
	}
}

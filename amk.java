import java.util.Random;

public class amk extends aoi implements alx {
	public static final aua a = aua.a("age", 0, 2);
	protected static final bdt[] b = new bdt[]{
		new bdt(0.6875, 0.4375, 0.375, 0.9375, 0.75, 0.625), new bdt(0.5625, 0.3125, 0.3125, 0.9375, 0.75, 0.6875), new bdt(0.4375, 0.1875, 0.25, 0.9375, 0.75, 0.75)
	};
	protected static final bdt[] c = new bdt[]{
		new bdt(0.0625, 0.4375, 0.375, 0.3125, 0.75, 0.625), new bdt(0.0625, 0.3125, 0.3125, 0.4375, 0.75, 0.6875), new bdt(0.0625, 0.1875, 0.25, 0.5625, 0.75, 0.75)
	};
	protected static final bdt[] d = new bdt[]{
		new bdt(0.375, 0.4375, 0.0625, 0.625, 0.75, 0.3125), new bdt(0.3125, 0.3125, 0.0625, 0.6875, 0.75, 0.4375), new bdt(0.25, 0.1875, 0.0625, 0.75, 0.75, 0.5625)
	};
	protected static final bdt[] e = new bdt[]{
		new bdt(0.375, 0.4375, 0.6875, 0.625, 0.75, 0.9375), new bdt(0.3125, 0.3125, 0.5625, 0.6875, 0.75, 0.9375), new bdt(0.25, 0.1875, 0.4375, 0.75, 0.75, 0.9375)
	};

	public amk() {
		super(azs.k);
		this.y(this.A.b().a(D, cv.NORTH).a(a, 0));
		this.a(true);
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!this.e(ajs, co, atl)) {
			this.f(ajs, co, atl);
		} else if (ajs.r.nextInt(5) == 0) {
			int integer6 = (Integer)atl.c(a);
			if (integer6 < 2) {
				ajs.a(co, atl.a(a, integer6 + 1), 2);
			}
		}
	}

	public boolean e(ajs ajs, co co, atl atl) {
		co = co.a(atl.c(D));
		atl atl5 = ajs.o(co);
		return atl5.v() == alv.r && atl5.c(apk.b) == apn.a.JUNGLE;
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
	public bdt b(atl atl, ajw ajw, co co) {
		int integer5 = (Integer)atl.c(a);
		switch ((cv)atl.c(D)) {
			case SOUTH:
				return e[integer5];
			case NORTH:
			default:
				return d[integer5];
			case WEST:
				return c[integer5];
			case EAST:
				return b[integer5];
		}
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(D, aqi.a(atl.c(D)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(aou.a(atl.c(D)));
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		cv cv7 = cv.a((double)sw.v);
		ajs.a(co, atl.a(D, cv7), 2);
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		if (!cv.k().c()) {
			cv = cv.NORTH;
		}

		return this.t().a(D, cv.d()).a(a, 0);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!this.e(ajs, co3, atl)) {
			this.f(ajs, co3, atl);
		}
	}

	private void f(ajs ajs, co co, atl atl) {
		ajs.a(co, alv.a.t(), 3);
		this.b(ajs, co, atl, 0);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		int integer7 = (Integer)atl.c(a);
		int integer8 = 1;
		if (integer7 >= 2) {
			integer8 = 3;
		}

		for (int integer9 = 0; integer9 < integer8; integer9++) {
			a(ajs, co, new afj(afl.be, 1, aem.BROWN.b()));
		}
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.be, 1, aem.BROWN.b());
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, boolean boolean4) {
		return (Integer)atl.c(a) < 2;
	}

	@Override
	public boolean a(ajs ajs, Random random, co co, atl atl) {
		return true;
	}

	@Override
	public void b(ajs ajs, Random random, co co, atl atl) {
		ajs.a(co, atl.a(a, (Integer)atl.c(a) + 1), 2);
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		return this.t().a(D, cv.b(integer)).a(a, (integer & 15) >> 2);
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(D)).b();
		return integer3 | (Integer)atl.c(a) << 2;
	}

	@Override
	protected atm b() {
		return new atm(this, D, a);
	}
}

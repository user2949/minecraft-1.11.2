import java.util.Random;

public class anh extends alo {
	public static final aty a = aoi.D;
	protected static final bdt b = new bdt(0.0625, 0.0, 0.0625, 0.9375, 0.875, 0.9375);

	protected anh() {
		super(azs.e);
		this.y(this.A.b().a(a, cv.NORTH));
		this.a(aej.c);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return b;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public boolean v(atl atl) {
		return true;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.ENTITYBLOCK_ANIMATED;
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afh.a(alv.Z);
	}

	@Override
	public int a(Random random) {
		return 8;
	}

	@Override
	protected boolean n() {
		return true;
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		return this.t().a(a, sw.bl().d());
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		ajs.a(co, atl.a(a, sw.bl().d()), 2);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		adg adg11 = aay.dd();
		asc asc12 = ajs.r(co);
		if (adg11 == null || !(asc12 instanceof asl)) {
			return true;
		} else if (ajs.o(co.a()).m()) {
			return true;
		} else if (ajs.E) {
			return true;
		} else {
			adg11.a((asl)asc12);
			aay.a(adg11);
			aay.b(oa.V);
			return true;
		}
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asl();
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		for (int integer6 = 0; integer6 < 3; integer6++) {
			int integer7 = random.nextInt(2) * 2 - 1;
			int integer8 = random.nextInt(2) * 2 - 1;
			double double9 = (double)co.p() + 0.5 + 0.25 * (double)integer7;
			double double11 = (double)((float)co.q() + random.nextFloat());
			double double13 = (double)co.r() + 0.5 + 0.25 * (double)integer8;
			double double15 = (double)(random.nextFloat() * (float)integer7);
			double double17 = ((double)random.nextFloat() - 0.5) * 0.125;
			double double19 = (double)(random.nextFloat() * (float)integer8);
			ajs.a(de.PORTAL, double9, double11, double13, double15, double17, double19);
		}
	}

	@Override
	public atl a(int integer) {
		cv cv3 = cv.a(integer);
		if (cv3.k() == cv.a.Y) {
			cv3 = cv.NORTH;
		}

		return this.t().a(a, cv3);
	}

	@Override
	public int e(atl atl) {
		return ((cv)atl.c(a)).a();
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
		return new atm(this, a);
	}
}

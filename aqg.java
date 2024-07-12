import java.util.Random;

public class aqg extends amt {
	public static final atx a = atx.a("locked");
	public static final aua b = aua.a("delay", 1, 4);

	protected aqg(boolean boolean1) {
		super(boolean1);
		this.y(this.A.b().a(D, cv.NORTH).a(b, 1).a(a, false));
	}

	@Override
	public String c() {
		return dp.a("item.diode.name");
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		return atl.a(a, this.b(ajw, co, atl));
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
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (!aay.bK.e) {
			return false;
		} else {
			ajs.a(co, atl.a(b), 3);
			return true;
		}
	}

	@Override
	protected int i(atl atl) {
		return (Integer)atl.c(b) * 2;
	}

	@Override
	protected atl z(atl atl) {
		Integer integer3 = atl.c(b);
		Boolean boolean4 = atl.c(a);
		cv cv5 = atl.c(D);
		return alv.bc.t().a(D, cv5).a(b, integer3).a(a, boolean4);
	}

	@Override
	protected atl A(atl atl) {
		Integer integer3 = atl.c(b);
		Boolean boolean4 = atl.c(a);
		cv cv5 = atl.c(D);
		return alv.bb.t().a(D, cv5).a(b, integer3).a(a, boolean4);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.bj;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.bj);
	}

	@Override
	public boolean b(ajw ajw, co co, atl atl) {
		return this.c(ajw, co, atl) > 0;
	}

	@Override
	protected boolean C(atl atl) {
		return D(atl);
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		if (this.d) {
			cv cv6 = atl.c(D);
			double double7 = (double)((float)co.p() + 0.5F) + (double)(random.nextFloat() - 0.5F) * 0.2;
			double double9 = (double)((float)co.q() + 0.4F) + (double)(random.nextFloat() - 0.5F) * 0.2;
			double double11 = (double)((float)co.r() + 0.5F) + (double)(random.nextFloat() - 0.5F) * 0.2;
			float float13 = -5.0F;
			if (random.nextBoolean()) {
				float13 = (float)((Integer)atl.c(b) * 2 - 1);
			}

			float13 /= 16.0F;
			double double14 = (double)(float13 * (float)cv6.g());
			double double16 = (double)(float13 * (float)cv6.i());
			ajs.a(de.REDSTONE, double7 + double14, double9, double11 + double16, 0.0, 0.0, 0.0);
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl) {
		super.b(ajs, co, atl);
		this.h(ajs, co, atl);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(D, cv.b(integer)).a(a, false).a(b, 1 + (integer >> 2));
	}

	@Override
	public int e(atl atl) {
		int integer3 = 0;
		integer3 |= ((cv)atl.c(D)).b();
		return integer3 | (Integer)atl.c(b) - 1 << 2;
	}

	@Override
	protected atm b() {
		return new atm(this, D, b, a);
	}
}

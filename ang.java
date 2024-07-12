import java.util.Random;

public class ang extends amu {
	protected static final bdt a = new bdt(0.375, 0.0, 0.375, 0.625, 1.0, 0.625);
	protected static final bdt b = new bdt(0.375, 0.375, 0.0, 0.625, 0.625, 1.0);
	protected static final bdt c = new bdt(0.0, 0.375, 0.375, 1.0, 0.625, 0.625);

	protected ang() {
		super(azs.q);
		this.y(this.A.b().a(H, cv.UP));
		this.a(aej.c);
	}

	@Override
	public atl a(atl atl, aqi aqi) {
		return atl.a(H, aqi.a(atl.c(H)));
	}

	@Override
	public atl a(atl atl, aou aou) {
		return atl.a(H, aou.b(atl.c(H)));
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		switch (((cv)atl.c(H)).k()) {
			case X:
			default:
				return c;
			case Z:
				return b;
			case Y:
				return a;
		}
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
	public boolean a(ajs ajs, co co) {
		return true;
	}

	@Override
	public atl a(ajs ajs, co co, cv cv, float float4, float float5, float float6, int integer, sw sw) {
		atl atl10 = ajs.o(co.a(cv.d()));
		if (atl10.v() == alv.cQ) {
			cv cv11 = atl10.c(H);
			if (cv11 == cv) {
				return this.t().a(H, cv.d());
			}
		}

		return this.t().a(H, cv);
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		cv cv6 = atl.c(H);
		double double7 = (double)co.p() + 0.55 - (double)(random.nextFloat() * 0.1F);
		double double9 = (double)co.q() + 0.55 - (double)(random.nextFloat() * 0.1F);
		double double11 = (double)co.r() + 0.55 - (double)(random.nextFloat() * 0.1F);
		double double13 = (double)(0.4F - (random.nextFloat() + random.nextFloat()) * 0.4F);
		if (random.nextInt(5) == 0) {
			ajs.a(
				de.END_ROD,
				double7 + (double)cv6.g() * double13,
				double9 + (double)cv6.h() * double13,
				double11 + (double)cv6.i() * double13,
				random.nextGaussian() * 0.005,
				random.nextGaussian() * 0.005,
				random.nextGaussian() * 0.005
			);
		}
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public atl a(int integer) {
		atl atl3 = this.t();
		return atl3.a(H, cv.a(integer));
	}

	@Override
	public int e(atl atl) {
		return ((cv)atl.c(H)).a();
	}

	@Override
	protected atm b() {
		return new atm(this, H);
	}

	@Override
	public azv h(atl atl) {
		return azv.NORMAL;
	}
}

public class cs implements cw {
	@Override
	public final afj a(cp cp, afj afj) {
		afj afj4 = this.b(cp, afj);
		this.a(cp);
		this.a(cp, cp.e().c(amw.a));
		return afj4;
	}

	protected afj b(cp cp, afj afj) {
		cv cv4 = cp.e().c(amw.a);
		df df5 = amw.a(cp);
		afj afj6 = afj.a(1);
		a(cp.h(), afj6, 6, cv4, df5);
		return afj;
	}

	public static void a(ajs ajs, afj afj, int integer, cv cv, df df) {
		double double6 = df.a();
		double double8 = df.b();
		double double10 = df.c();
		if (cv.k() == cv.a.Y) {
			double8 -= 0.125;
		} else {
			double8 -= 0.15625;
		}

		zj zj12 = new zj(ajs, double6, double8, double10, afj);
		double double13 = ajs.r.nextDouble() * 0.1 + 0.2;
		zj12.s = (double)cv.g() * double13;
		zj12.t = 0.2F;
		zj12.u = (double)cv.i() * double13;
		zj12.s = zj12.s + ajs.r.nextGaussian() * 0.0075F * (double)integer;
		zj12.t = zj12.t + ajs.r.nextGaussian() * 0.0075F * (double)integer;
		zj12.u = zj12.u + ajs.r.nextGaussian() * 0.0075F * (double)integer;
		ajs.a(zj12);
	}

	protected void a(cp cp) {
		cp.h().b(1000, cp.d(), 0);
	}

	protected void a(cp cp, cv cv) {
		cp.h().b(2000, cp.d(), this.a(cv));
	}

	private int a(cv cv) {
		return cv.g() + 1 + (cv.i() + 1) * 3;
	}
}

public abstract class ks extends cs {
	@Override
	public afj b(cp cp, afj afj) {
		ajs ajs4 = cp.h();
		df df5 = amw.a(cp);
		cv cv6 = cp.e().c(amw.a);
		abj abj7 = this.a(ajs4, df5, afj);
		abj7.c((double)cv6.g(), (double)((float)cv6.h() + 0.1F), (double)cv6.i(), this.b(), this.a());
		ajs4.a((sn)abj7);
		afj.g(1);
		return afj;
	}

	@Override
	protected void a(cp cp) {
		cp.h().b(1002, cp.d(), 0);
	}

	protected abstract abj a(ajs ajs, df df, afj afj);

	protected float a() {
		return 6.0F;
	}

	protected float b() {
		return 1.1F;
	}
}

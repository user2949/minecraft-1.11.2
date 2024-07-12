public class aev extends afh {
	public aev() {
		this.k = 16;
		this.a(aej.f);
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		if (!aay.bK.d) {
			afj5.g(1);
		}

		ajs.a(null, aay.p, aay.q, aay.r, nn.bj, no.NEUTRAL, 0.5F, 0.4F / (j.nextFloat() * 0.4F + 0.8F));
		aay.di().a(this, 20);
		if (!ajs.E) {
			abr abr6 = new abr(ajs, aay);
			abr6.a(aay, aay.w, aay.v, 0.0F, 1.5F, 1.0F);
			ajs.a(abr6);
		}

		aay.b(oa.b(this));
		return new rl<>(rk.SUCCESS, afj5);
	}
}

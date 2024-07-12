public class aep extends afh {
	public aep() {
		this.k = 16;
		this.a(aej.l);
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		if (!aay.bK.d) {
			afj5.g(1);
		}

		ajs.a(null, aay.p, aay.q, aay.r, nn.aE, no.PLAYERS, 0.5F, 0.4F / (j.nextFloat() * 0.4F + 0.8F));
		if (!ajs.E) {
			abq abq6 = new abq(ajs, aay);
			abq6.a(aay, aay.w, aay.v, 0.0F, 1.5F, 1.0F);
			ajs.a(abq6);
		}

		aay.b(oa.b(this));
		return new rl<>(rk.SUCCESS, afj5);
	}
}

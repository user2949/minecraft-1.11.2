public class aew extends afh {
	public aew() {
		this.a(aej.f);
	}

	@Override
	public boolean f_(afj afj) {
		return true;
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		if (!aay.bK.d) {
			afj5.g(1);
		}

		ajs.a(null, aay.p, aay.q, aay.r, nn.bt, no.NEUTRAL, 0.5F, 0.4F / (j.nextFloat() * 0.4F + 0.8F));
		if (!ajs.E) {
			abs abs6 = new abs(ajs, aay);
			abs6.a(aay, aay.w, aay.v, -20.0F, 0.7F, 1.0F);
			ajs.a(abs6);
		}

		aay.b(oa.b(this));
		return new rl<>(rk.SUCCESS, afj5);
	}
}

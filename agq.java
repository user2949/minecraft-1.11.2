public class agq extends afw {
	@Override
	public String b(afj afj) {
		return dp.a(aha.d(afj).b("splash_potion.effect."));
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		afj afj6 = aay.bK.d ? afj5.l() : afj5.a(1);
		ajs.a(null, aay.p, aay.q, aay.r, nn.gD, no.PLAYERS, 0.5F, 0.4F / (j.nextFloat() * 0.4F + 0.8F));
		if (!ajs.E) {
			abt abt7 = new abt(ajs, aay, afj6);
			abt7.a(aay, aay.w, aay.v, -20.0F, 0.5F, 1.0F);
			ajs.a(abt7);
		}

		aay.b(oa.b(this));
		return new rl<>(rk.SUCCESS, afj5);
	}
}

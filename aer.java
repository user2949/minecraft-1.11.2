public class aer extends aei {
	protected aer() {
		this.a(aej.f);
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = afp.a(ajs, aay.p, aay.r, (byte)0, true, false);
		afj afj6 = aay.b(ri);
		afj6.g(1);
		if (afj6.b()) {
			return new rl<>(rk.SUCCESS, afj5);
		} else {
			if (!aay.bs.c(afj5.l())) {
				aay.a(afj5, false);
			}

			aay.b(oa.b(this));
			return new rl<>(rk.SUCCESS, afj6);
		}
	}
}

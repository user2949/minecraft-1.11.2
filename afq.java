public class afq extends afh {
	public afq() {
		this.d(1);
		this.a(aej.f);
	}

	@Override
	public afj a(afj afj, ajs ajs, sw sw) {
		if (sw instanceof aay && !((aay)sw).bK.d) {
			afj.g(1);
		}

		if (!ajs.E) {
			sw.bR();
		}

		if (sw instanceof aay) {
			((aay)sw).b(oa.b(this));
		}

		return afj.b() ? new afj(afl.az) : afj;
	}

	@Override
	public int e(afj afj) {
		return 32;
	}

	@Override
	public agu f(afj afj) {
		return agu.DRINK;
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		aay.c(ri);
		return new rl<>(rk.SUCCESS, aay.b(ri));
	}
}

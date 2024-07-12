public class aed extends afh {
	public aed() {
		this.a(aej.e);
		this.d(1);
		this.e(25);
	}

	@Override
	public boolean C_() {
		return true;
	}

	@Override
	public boolean E_() {
		return true;
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		if (ajs.E) {
			return new rl<>(rk.PASS, afj5);
		} else {
			if (aay.aK() && aay.bB() instanceof xc) {
				xc xc6 = (xc)aay.bB();
				if (afj5.k() - afj5.j() >= 7 && xc6.di()) {
					afj5.a(7, aay);
					if (afj5.b()) {
						afj afj7 = new afj(afl.aZ);
						afj7.b(afj5.p());
						return new rl<>(rk.SUCCESS, afj7);
					}

					return new rl<>(rk.SUCCESS, afj5);
				}
			}

			aay.b(oa.b(this));
			return new rl<>(rk.PASS, afj5);
		}
	}
}

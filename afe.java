public class afe extends afd {
	public afe(int integer, float float2, boolean boolean3) {
		super(integer, float2, boolean3);
		this.a(true);
	}

	@Override
	public boolean f_(afj afj) {
		return super.f_(afj) || afj.j() > 0;
	}

	@Override
	public afx g(afj afj) {
		return afj.j() == 0 ? afx.RARE : afx.EPIC;
	}

	@Override
	protected void a(afj afj, ajs ajs, aay aay) {
		if (!ajs.E) {
			if (afj.j() > 0) {
				aay.b(nr.M);
				aay.c(new sh(si.j, 400, 1));
				aay.c(new sh(si.k, 6000, 0));
				aay.c(new sh(si.l, 6000, 0));
				aay.c(new sh(si.v, 2400, 3));
			} else {
				aay.c(new sh(si.j, 100, 1));
				aay.c(new sh(si.v, 2400, 0));
			}
		}
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		dd.add(new afj(afh));
		dd.add(new afj(afh, 1, 1));
	}
}

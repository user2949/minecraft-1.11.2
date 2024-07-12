import java.util.List;

public class afw extends afh {
	public afw() {
		this.d(1);
		this.a(aej.k);
	}

	@Override
	public afj i() {
		return aha.a(super.i(), ahb.b);
	}

	@Override
	public afj a(afj afj, ajs ajs, sw sw) {
		aay aay5 = sw instanceof aay ? (aay)sw : null;
		if (aay5 == null || !aay5.bK.d) {
			afj.g(1);
		}

		if (!ajs.E) {
			for (sh sh8 : aha.a(afj)) {
				if (sh8.a().b()) {
					sh8.a().a(aay5, aay5, sw, sh8.c(), 1.0);
				} else {
					sw.c(new sh(sh8));
				}
			}
		}

		if (aay5 != null) {
			aay5.b(oa.b(this));
		}

		if (aay5 == null || !aay5.bK.d) {
			if (afj.b()) {
				return new afj(afl.bK);
			}

			if (aay5 != null) {
				aay5.bs.c(new afj(afl.bK));
			}
		}

		return afj;
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

	@Override
	public String b(afj afj) {
		return dp.a(aha.d(afj).b("potion.effect."));
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		aha.a(afj, list, 1.0F);
	}

	@Override
	public boolean f_(afj afj) {
		return super.f_(afj) || !aha.a(afj).isEmpty();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		for (agy agy6 : agy.a) {
			if (agy6 != ahb.a) {
				dd.add(aha.a(new afj(afh), agy6));
			}
		}
	}
}

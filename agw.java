public class agw extends afh {
	public agw() {
		this.d(1);
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		aay.a(afj5, ri);
		aay.b(oa.b(this));
		return new rl<>(rk.SUCCESS, afj5);
	}

	public static boolean b(du du) {
		if (du == null) {
			return false;
		} else if (!du.b("pages", 9)) {
			return false;
		} else {
			ea ea2 = du.c("pages", 8);

			for (int integer3 = 0; integer3 < ea2.c(); integer3++) {
				String string4 = ea2.g(integer3);
				if (string4.length() > 32767) {
					return false;
				}
			}

			return true;
		}
	}
}

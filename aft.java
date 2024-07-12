public class aft extends afh {
	public aft() {
		this.a(aej.i);
	}

	@Override
	public boolean a(afj afj, aay aay, sw sw, ri ri) {
		if (afj.t() && !(sw instanceof aay)) {
			sw.c(afj.r());
			if (sw instanceof sx) {
				((sx)sw).cS();
			}

			afj.g(1);
			return true;
		} else {
			return false;
		}
	}
}

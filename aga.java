public class aga extends afh {
	public aga() {
		this.k = 1;
		this.a(aej.e);
	}

	@Override
	public boolean a(afj afj, aay aay, sw sw, ri ri) {
		if (sw instanceof xc) {
			xc xc6 = (xc)sw;
			if (!xc6.dh() && !xc6.l_()) {
				xc6.p(true);
				xc6.l.a(aay, xc6.p, xc6.q, xc6.r, nn.es, no.NEUTRAL, 0.5F, 1.0F);
				afj.g(1);
			}

			return true;
		} else {
			return false;
		}
	}
}

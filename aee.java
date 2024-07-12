public class aee extends afd {
	public aee(int integer, float float2) {
		super(integer, float2, false);
	}

	@Override
	public afj a(afj afj, ajs ajs, sw sw) {
		afj afj5 = super.a(afj, ajs, sw);
		if (!ajs.E) {
			double double6 = sw.p;
			double double8 = sw.q;
			double double10 = sw.r;

			for (int integer12 = 0; integer12 < 16; integer12++) {
				double double13 = sw.p + (sw.bJ().nextDouble() - 0.5) * 16.0;
				double double15 = ot.a(sw.q + (double)(sw.bJ().nextInt(16) - 8), 0.0, (double)(ajs.Z() - 1));
				double double17 = sw.r + (sw.bJ().nextDouble() - 0.5) * 16.0;
				if (sw.aK()) {
					sw.p();
				}

				if (sw.j(double13, double15, double17)) {
					ajs.a(null, double6, double8, double10, nn.ah, no.PLAYERS, 1.0F, 1.0F);
					sw.a(nn.ah, 1.0F, 1.0F);
					break;
				}
			}

			if (sw instanceof aay) {
				((aay)sw).di().a(this, 20);
			}
		}

		return afj5;
	}
}

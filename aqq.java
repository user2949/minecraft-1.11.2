public class aqq extends aod {
	public aqq() {
		super(azs.B, false, azt.c);
		this.a(aej.c);
		this.z = 0.8F;
	}

	@Override
	public ajk f() {
		return ajk.TRANSLUCENT;
	}

	@Override
	public void a(ajs ajs, co co, sn sn, float float4) {
		if (sn.aM()) {
			super.a(ajs, co, sn, float4);
		} else {
			sn.e(float4, 0.0F);
		}
	}

	@Override
	public void a(ajs ajs, sn sn) {
		if (sn.aM()) {
			super.a(ajs, sn);
		} else if (sn.t < 0.0) {
			sn.t = -sn.t;
			if (!(sn instanceof sw)) {
				sn.t *= 0.8;
			}
		}
	}

	@Override
	public void a(ajs ajs, co co, sn sn) {
		if (Math.abs(sn.t) < 0.1 && !sn.aM()) {
			double double5 = 0.4 + Math.abs(sn.t) * 0.2;
			sn.s *= double5;
			sn.u *= double5;
		}

		super.a(ajs, co, sn);
	}
}

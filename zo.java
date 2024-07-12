import javax.annotation.Nullable;

public class zo extends aai {
	public zo(ajs ajs) {
		super(ajs);
		this.a(0.7F, 0.5F);
	}

	public static void a(ph ph) {
		sx.a(ph, zo.class);
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(12.0);
	}

	@Override
	public boolean B(sn sn) {
		if (super.B(sn)) {
			if (sn instanceof sw) {
				int integer3 = 0;
				if (this.l.ae() == rg.NORMAL) {
					integer3 = 7;
				} else if (this.l.ae() == rg.HARD) {
					integer3 = 15;
				}

				if (integer3 > 0) {
					((sw)sn).c(new sh(si.s, integer3 * 20, 0));
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		return sz;
	}

	@Override
	public float bq() {
		return 0.45F;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.t;
	}
}

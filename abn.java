public class abn extends abp {
	public abn(ajs ajs) {
		super(ajs);
	}

	public abn(ajs ajs, sw sw) {
		super(ajs, sw);
	}

	public abn(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	public static void a(ph ph) {
		abp.a(ph, "Snowball");
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 3) {
			for (int integer3 = 0; integer3 < 8; integer3++) {
				this.l.a(de.SNOWBALL, this.p, this.q, this.r, 0.0, 0.0, 0.0);
			}
		}
	}

	@Override
	protected void a(bdu bdu) {
		if (bdu.d != null) {
			int integer3 = 0;
			if (bdu.d instanceof zn) {
				integer3 = 3;
			}

			bdu.d.a(ry.a(this, (sn)this.k()), (float)integer3);
		}

		if (!this.l.E) {
			this.l.a(this, (byte)3);
			this.T();
		}
	}
}

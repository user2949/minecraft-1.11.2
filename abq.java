public class abq extends abp {
	public abq(ajs ajs) {
		super(ajs);
	}

	public abq(ajs ajs, sw sw) {
		super(ajs, sw);
	}

	public abq(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	public static void a(ph ph) {
		abp.a(ph, "ThrownEgg");
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 3) {
			double double3 = 0.08;

			for (int integer5 = 0; integer5 < 8; integer5++) {
				this.l
					.a(
						de.ITEM_CRACK,
						this.p,
						this.q,
						this.r,
						((double)this.S.nextFloat() - 0.5) * 0.08,
						((double)this.S.nextFloat() - 0.5) * 0.08,
						((double)this.S.nextFloat() - 0.5) * 0.08,
						afh.a(afl.aX)
					);
			}
		}
	}

	@Override
	protected void a(bdu bdu) {
		if (bdu.d != null) {
			bdu.d.a(ry.a(this, (sn)this.k()), 0.0F);
		}

		if (!this.l.E) {
			if (this.S.nextInt(8) == 0) {
				int integer3 = 1;
				if (this.S.nextInt(32) == 0) {
					integer3 = 4;
				}

				for (int integer4 = 0; integer4 < integer3; integer4++) {
					wx wx5 = new wx(this.l);
					wx5.b_(-24000);
					wx5.b(this.p, this.q, this.r, this.v, 0.0F);
					this.l.a(wx5);
				}
			}

			this.l.a(this, (byte)3);
			this.T();
		}
	}
}

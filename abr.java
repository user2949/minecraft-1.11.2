public class abr extends abp {
	private sw d;

	public abr(ajs ajs) {
		super(ajs);
	}

	public abr(ajs ajs, sw sw) {
		super(ajs, sw);
		this.d = sw;
	}

	public abr(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	public static void a(ph ph) {
		abp.a(ph, "ThrownEnderpearl");
	}

	@Override
	protected void a(bdu bdu) {
		sw sw3 = this.k();
		if (bdu.d != null) {
			if (bdu.d == this.d) {
				return;
			}

			bdu.d.a(ry.a(this, (sn)sw3), 0.0F);
		}

		if (bdu.a == bdu.a.BLOCK) {
			co co4 = bdu.a();
			asc asc5 = this.l.r(co4);
			if (asc5 instanceof asy) {
				asy asy6 = (asy)asc5;
				if (sw3 != null) {
					asy6.a(sw3);
					this.T();
					return;
				}

				asy6.a(this);
				return;
			}
		}

		for (int integer4 = 0; integer4 < 32; integer4++) {
			this.l.a(de.PORTAL, this.p, this.q + this.S.nextDouble() * 2.0, this.r, this.S.nextGaussian(), 0.0, this.S.nextGaussian());
		}

		if (!this.l.E) {
			if (sw3 instanceof ly) {
				ly ly4 = (ly)sw3;
				if (ly4.a.a().g() && ly4.l == this.l && !ly4.cr()) {
					if (this.S.nextFloat() < 0.05F && this.l.U().b("doMobSpawning")) {
						zs zs5 = new zs(this.l);
						zs5.a(true);
						zs5.b(sw3.p, sw3.q, sw3.r, sw3.v, sw3.w);
						this.l.a(zs5);
					}

					if (sw3.aK()) {
						sw3.p();
					}

					sw3.a(this.p, this.q, this.r);
					sw3.L = 0.0F;
					sw3.a(ry.k, 5.0F);
				}
			} else if (sw3 != null) {
				sw3.a(this.p, this.q, this.r);
				sw3.L = 0.0F;
			}

			this.T();
		}
	}

	@Override
	public void A_() {
		sw sw2 = this.k();
		if (sw2 != null && sw2 instanceof aay && !sw2.au()) {
			this.T();
		} else {
			super.A_();
		}
	}
}

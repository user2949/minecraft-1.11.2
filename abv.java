public class abv extends abf {
	private static final kk<Boolean> e = kn.a(abv.class, km.h);

	public abv(ajs ajs) {
		super(ajs);
		this.a(0.3125F, 0.3125F);
	}

	public abv(ajs ajs, sw sw, double double3, double double4, double double5) {
		super(ajs, sw, double3, double4, double5);
		this.a(0.3125F, 0.3125F);
	}

	public static void a(ph ph) {
		abf.a(ph, "WitherSkull");
	}

	@Override
	protected float l() {
		return this.n() ? 0.73F : super.l();
	}

	public abv(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.a(0.3125F, 0.3125F);
	}

	@Override
	public boolean aJ() {
		return false;
	}

	@Override
	public float a(ajn ajn, ajs ajs, co co, atl atl) {
		float float6 = super.a(ajn, ajs, co, atl);
		alu alu7 = atl.v();
		if (this.n() && yv.a(alu7)) {
			float6 = Math.min(0.8F, float6);
		}

		return float6;
	}

	@Override
	protected void a(bdu bdu) {
		if (!this.l.E) {
			if (bdu.d != null) {
				if (this.a != null) {
					if (bdu.d.a(ry.a(this.a), 8.0F)) {
						if (bdu.d.au()) {
							this.a(this.a, bdu.d);
						} else {
							this.a.b(5.0F);
						}
					}
				} else {
					bdu.d.a(ry.o, 5.0F);
				}

				if (bdu.d instanceof sw) {
					int integer3 = 0;
					if (this.l.ae() == rg.NORMAL) {
						integer3 = 10;
					} else if (this.l.ae() == rg.HARD) {
						integer3 = 40;
					}

					if (integer3 > 0) {
						((sw)bdu.d).c(new sh(si.t, 20 * integer3, 1));
					}
				}
			}

			this.l.a(this, this.p, this.q, this.r, 1.0F, false, this.l.U().b("mobGriefing"));
			this.T();
		}
	}

	@Override
	public boolean aq() {
		return false;
	}

	@Override
	public boolean a(ry ry, float float2) {
		return false;
	}

	@Override
	protected void i() {
		this.Y.a(e, false);
	}

	public boolean n() {
		return this.Y.a(e);
	}

	public void a(boolean boolean1) {
		this.Y.b(e, boolean1);
	}

	@Override
	protected boolean k() {
		return false;
	}
}

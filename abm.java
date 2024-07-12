public class abm extends abf {
	public abm(ajs ajs) {
		super(ajs);
		this.a(0.3125F, 0.3125F);
	}

	public abm(ajs ajs, sw sw, double double3, double double4, double double5) {
		super(ajs, sw, double3, double4, double5);
		this.a(0.3125F, 0.3125F);
	}

	public abm(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.a(0.3125F, 0.3125F);
	}

	public static void a(ph ph) {
		abf.a(ph, "SmallFireball");
	}

	@Override
	protected void a(bdu bdu) {
		if (!this.l.E) {
			if (bdu.d != null) {
				if (!bdu.d.ah()) {
					boolean boolean3 = bdu.d.a(ry.a((abf)this, (sn)this.a), 5.0F);
					if (boolean3) {
						this.a(this.a, bdu.d);
						bdu.d.i(5);
					}
				}
			} else {
				boolean boolean3 = true;
				if (this.a != null && this.a instanceof sx) {
					boolean3 = this.l.U().b("mobGriefing");
				}

				if (boolean3) {
					co co4 = bdu.a().a(bdu.b);
					if (this.l.d(co4)) {
						this.l.a(co4, alv.ab.t());
					}
				}
			}

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
}

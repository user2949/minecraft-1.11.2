public class abh extends abf {
	public int e = 1;

	public abh(ajs ajs) {
		super(ajs);
	}

	public abh(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
	}

	public abh(ajs ajs, sw sw, double double3, double double4, double double5) {
		super(ajs, sw, double3, double4, double5);
	}

	@Override
	protected void a(bdu bdu) {
		if (!this.l.E) {
			if (bdu.d != null) {
				bdu.d.a(ry.a((abf)this, (sn)this.a), 6.0F);
				this.a(this.a, bdu.d);
			}

			boolean boolean3 = this.l.U().b("mobGriefing");
			this.l.a(null, this.p, this.q, this.r, (float)this.e, boolean3, boolean3);
			this.T();
		}
	}

	public static void a(ph ph) {
		abf.a(ph, "Fireball");
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("ExplosionPower", this.e);
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.b("ExplosionPower", 99)) {
			this.e = du.h("ExplosionPower");
		}
	}
}

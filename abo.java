public class abo extends abb {
	private int f = 200;

	public abo(ajs ajs) {
		super(ajs);
	}

	public abo(ajs ajs, sw sw) {
		super(ajs, sw);
	}

	public abo(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	@Override
	public void A_() {
		super.A_();
		if (this.l.E && !this.a) {
			this.l.a(de.SPELL_INSTANT, this.p, this.q, this.r, 0.0, 0.0, 0.0);
		}
	}

	@Override
	protected afj j() {
		return new afj(afl.i);
	}

	@Override
	protected void a(sw sw) {
		super.a(sw);
		sh sh3 = new sh(si.x, this.f, 0);
		sw.c(sh3);
	}

	public static void c(ph ph) {
		abb.a(ph, "SpectralArrow");
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.e("Duration")) {
			this.f = du.h("Duration");
		}
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Duration", this.f);
	}
}

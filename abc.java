import java.util.List;

public class abc extends abf {
	public abc(ajs ajs) {
		super(ajs);
		this.a(1.0F, 1.0F);
	}

	public abc(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.a(1.0F, 1.0F);
	}

	public abc(ajs ajs, sw sw, double double3, double double4, double double5) {
		super(ajs, sw, double3, double4, double5);
		this.a(1.0F, 1.0F);
	}

	public static void a(ph ph) {
		abf.a(ph, "DragonFireball");
	}

	@Override
	protected void a(bdu bdu) {
		if (bdu.d == null || !bdu.d.s(this.a)) {
			if (!this.l.E) {
				List<sw> list3 = this.l.a(sw.class, this.bo().c(4.0, 2.0, 4.0));
				sl sl4 = new sl(this.l, this.p, this.q, this.r);
				sl4.a(this.a);
				sl4.a(de.DRAGON_BREATH);
				sl4.a(3.0F);
				sl4.e(600);
				sl4.c((7.0F - sl4.j()) / (float)sl4.r());
				sl4.a(new sh(si.g, 1, 1));
				if (!list3.isEmpty()) {
					for (sw sw6 : list3) {
						double double7 = this.h(sw6);
						if (double7 < 16.0) {
							sl4.b(sw6.p, sw6.q, sw6.r);
							break;
						}
					}
				}

				this.l.b(2006, new co(this.p, this.q, this.r), 0);
				this.l.a(sl4);
				this.T();
			}
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
	protected de j() {
		return de.DRAGON_BREATH;
	}

	@Override
	protected boolean k() {
		return false;
	}
}

import javax.annotation.Nullable;

public class xs extends xm {
	private final xt bG = new xt(this);
	private boolean bH;
	private int bI;

	public xs(ajs ajs) {
		super(ajs);
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(15.0);
		this.a(aad.d).a(0.2F);
		this.a(bw).a(this.dI());
	}

	@Override
	protected nm G() {
		super.G();
		return nn.fR;
	}

	@Override
	protected nm bX() {
		super.bX();
		return nn.fS;
	}

	@Override
	protected nm bW() {
		super.bW();
		return nn.fT;
	}

	@Override
	public tb cf() {
		return tb.UNDEAD;
	}

	@Override
	public double ay() {
		return super.ay() - 0.1875;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.K;
	}

	@Override
	public void n() {
		super.n();
		if (this.dh() && this.bI++ >= 18000) {
			this.T();
		}
	}

	public static void a(ph ph) {
		xm.c(ph, xs.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("SkeletonTrap", this.dh());
		du.a("SkeletonTrapTime", this.bI);
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.p(du.p("SkeletonTrap"));
		this.bI = du.h("SkeletonTrapTime");
	}

	public boolean dh() {
		return this.bH;
	}

	public void p(boolean boolean1) {
		if (boolean1 != this.bH) {
			this.bH = boolean1;
			if (boolean1) {
				this.bq.a(1, this.bG);
			} else {
				this.bq.a(this.bG);
			}
		}
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		boolean boolean5 = !afj4.b();
		if (boolean5 && afj4.c() == afl.bU) {
			return super.a(aay, ri);
		} else if (!this.dp()) {
			return false;
		} else if (this.l_()) {
			return super.a(aay, ri);
		} else if (aay.aM()) {
			this.f(aay);
			return true;
		} else if (this.aL()) {
			return super.a(aay, ri);
		} else {
			if (boolean5) {
				if (afj4.c() == afl.aD && !this.dB()) {
					this.f(aay);
					return true;
				}

				if (afj4.a(aay, this, ri)) {
					return true;
				}
			}

			this.g(aay);
			return true;
		}
	}
}

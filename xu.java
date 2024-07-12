import javax.annotation.Nullable;

public class xu extends xm {
	public xu(ajs ajs) {
		super(ajs);
	}

	public static void a(ph ph) {
		xm.c(ph, xu.class);
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(15.0);
		this.a(aad.d).a(0.2F);
		this.a(bw).a(this.dI());
	}

	@Override
	public tb cf() {
		return tb.UNDEAD;
	}

	@Override
	protected nm G() {
		super.G();
		return nn.ij;
	}

	@Override
	protected nm bX() {
		super.bX();
		return nn.ik;
	}

	@Override
	protected nm bW() {
		super.bW();
		return nn.il;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.J;
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
				if (!this.dB() && afj4.c() == afl.aD) {
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

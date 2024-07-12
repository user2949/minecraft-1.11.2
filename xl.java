public abstract class xl extends xm {
	private static final kk<Boolean> bG = kn.a(xl.class, km.h);

	public xl(ajs ajs) {
		super(ajs);
		this.bE = false;
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bG, false);
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a((double)this.dH());
		this.a(aad.d).a(0.175F);
		this.a(bw).a(0.5);
	}

	public boolean dh() {
		return this.Y.a(bG);
	}

	public void p(boolean boolean1) {
		this.Y.b(bG, boolean1);
	}

	@Override
	protected int di() {
		return this.dh() ? 17 : super.di();
	}

	@Override
	public double ay() {
		return super.ay() - 0.25;
	}

	@Override
	protected nm dj() {
		super.dj();
		return nn.aA;
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (this.dh()) {
			if (!this.l.E) {
				this.a(afh.a(alv.ae), 1);
			}

			this.p(false);
		}
	}

	public static void b(ph ph, Class<?> class2) {
		xm.c(ph, class2);
		ph.a(pf.ENTITY, new qu(class2, "Items"));
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("ChestedHorse", this.dh());
		if (this.dh()) {
			ea ea3 = new ea();

			for (int integer4 = 2; integer4 < this.bB.v_(); integer4++) {
				afj afj5 = this.bB.a(integer4);
				if (!afj5.b()) {
					du du6 = new du();
					du6.a("Slot", (byte)integer4);
					afj5.a(du6);
					ea3.a(du6);
				}
			}

			du.a("Items", ea3);
		}
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.p(du.p("ChestedHorse"));
		if (this.dh()) {
			ea ea3 = du.c("Items", 10);
			this.dx();

			for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
				du du5 = ea3.b(integer4);
				int integer6 = du5.f("Slot") & 255;
				if (integer6 >= 2 && integer6 < this.bB.v_()) {
					this.bB.a(integer6, new afj(du5));
				}
			}
		}

		this.dy();
	}

	@Override
	public boolean c(int integer, afj afj) {
		if (integer == 499) {
			if (this.dh() && afj.b()) {
				this.p(false);
				this.dx();
				return true;
			}

			if (!this.dh() && afj.c() == afh.a(alv.ae)) {
				this.p(true);
				this.dx();
				return true;
			}
		}

		return super.c(integer, afj);
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (afj4.c() == afl.bU) {
			return super.a(aay, ri);
		} else {
			if (!this.l_()) {
				if (this.dp() && aay.aM()) {
					this.f(aay);
					return true;
				}

				if (this.aL()) {
					return super.a(aay, ri);
				}
			}

			if (!afj4.b()) {
				boolean boolean5 = this.b(aay, afj4);
				if (!boolean5 && !this.dp()) {
					if (afj4.a(aay, this, ri)) {
						return true;
					}

					this.dF();
					return true;
				}

				if (!boolean5 && !this.dh() && afj4.c() == afh.a(alv.ae)) {
					this.p(true);
					this.dk();
					boolean5 = true;
					this.dx();
				}

				if (!boolean5 && !this.l_() && !this.dB() && afj4.c() == afl.aD) {
					this.f(aay);
					return true;
				}

				if (boolean5) {
					if (!aay.bK.d) {
						afj4.g(1);
					}

					return true;
				}
			}

			if (this.l_()) {
				return super.a(aay, ri);
			} else if (afj4.a(aay, this, ri)) {
				return true;
			} else {
				this.g(aay);
				return true;
			}
		}
	}

	@Override
	protected void dk() {
		this.a(nn.aB, 1.0F, (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
	}

	public int dl() {
		return 5;
	}
}

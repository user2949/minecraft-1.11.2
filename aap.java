import javax.annotation.Nullable;

public class aap extends aao {
	private static final kk<Boolean> b = kn.a(aap.class, km.h);
	private static final kk<Integer> c = kn.a(aap.class, km.b);
	private int bw;

	public aap(ajs ajs) {
		super(ajs);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(b, false);
		this.Y.a(c, 0);
	}

	public void a(int integer) {
		this.Y.b(c, integer);
	}

	public int dl() {
		return Math.max(this.Y.a(c) % 6, 0);
	}

	public static void a(ph ph) {
		sx.a(ph, aap.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Profession", this.dl());
		du.a("ConversionTime", this.do() ? this.bw : -1);
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a(du.h("Profession"));
		if (du.b("ConversionTime", 99) && du.h("ConversionTime") > -1) {
			this.b(du.h("ConversionTime"));
		}
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		this.a(this.l.r.nextInt(6));
		return super.a(rh, sz);
	}

	@Override
	public void A_() {
		if (!this.l.E && this.do()) {
			int integer2 = this.dq();
			this.bw -= integer2;
			if (this.bw <= 0) {
				this.dp();
			}
		}

		super.A_();
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (afj4.c() == afl.ar && afj4.j() == 0 && this.a(si.r)) {
			if (!aay.bK.d) {
				afj4.g(1);
			}

			if (!this.l.E) {
				this.b(this.S.nextInt(2401) + 3600);
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	protected boolean K() {
		return !this.do();
	}

	public boolean do() {
		return this.R().a(b);
	}

	protected void b(int integer) {
		this.bw = integer;
		this.R().b(b, true);
		this.d(si.r);
		this.c(new sh(si.e, integer, Math.min(this.l.ae().a() - 1, 0)));
		this.l.a(this, (byte)16);
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 16) {
			if (!this.ad()) {
				this.l.a(this.p + 0.5, this.q + 0.5, this.r + 0.5, nn.iv, this.bC(), 1.0F + this.S.nextFloat(), this.S.nextFloat() * 0.7F + 0.3F, false);
			}
		} else {
			super.a(byte1);
		}
	}

	protected void dp() {
		aat aat2 = new aat(this.l);
		aat2.u(this);
		aat2.g(this.dl());
		aat2.a(this.l.D(new co(aat2)), null, false);
		aat2.dl();
		if (this.l_()) {
			aat2.b_(-24000);
		}

		this.l.e(this);
		aat2.n(this.cY());
		if (this.n_()) {
			aat2.c(this.bi());
			aat2.j(this.bj());
		}

		this.l.a(aat2);
		aat2.c(new sh(si.i, 200, 0));
		this.l.a(null, 1027, new co((int)this.p, (int)this.q, (int)this.r), 0);
	}

	protected int dq() {
		int integer2 = 1;
		if (this.S.nextFloat() < 0.01F) {
			int integer3 = 0;
			co.a a4 = new co.a();

			for (int integer5 = (int)this.p - 4; integer5 < (int)this.p + 4 && integer3 < 14; integer5++) {
				for (int integer6 = (int)this.q - 4; integer6 < (int)this.q + 4 && integer3 < 14; integer6++) {
					for (int integer7 = (int)this.r - 4; integer7 < (int)this.r + 4 && integer3 < 14; integer7++) {
						alu alu8 = this.l.o(a4.c(integer5, integer6, integer7)).v();
						if (alu8 == alv.bi || alu8 == alv.C) {
							if (this.S.nextFloat() < 0.3F) {
								integer2++;
							}

							integer3++;
						}
					}
				}
			}
		}

		return integer2;
	}

	@Override
	protected float cj() {
		return this.l_() ? (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 2.0F : (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F;
	}

	@Override
	public nm G() {
		return nn.it;
	}

	@Override
	public nm bW() {
		return nn.ix;
	}

	@Override
	public nm bX() {
		return nn.iw;
	}

	@Override
	public nm di() {
		return nn.iy;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.as;
	}

	@Override
	protected afj dj() {
		return afj.a;
	}
}

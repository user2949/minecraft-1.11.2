public abstract class ww extends sk implements sm {
	protected alu bz = alv.c;
	private int bw;
	private aay bx;

	public ww(ajs ajs) {
		super(ajs);
	}

	@Override
	protected void M() {
		if (this.l() != 0) {
			this.bw = 0;
		}

		super.M();
	}

	@Override
	public void n() {
		super.n();
		if (this.l() != 0) {
			this.bw = 0;
		}

		if (this.bw > 0) {
			this.bw--;
			if (this.bw % 10 == 0) {
				double double2 = this.S.nextGaussian() * 0.02;
				double double4 = this.S.nextGaussian() * 0.02;
				double double6 = this.S.nextGaussian() * 0.02;
				this.l
					.a(
						de.HEART,
						this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
						this.q + 0.5 + (double)(this.S.nextFloat() * this.H),
						this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
						double2,
						double4,
						double6
					);
			}
		}
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			this.bw = 0;
			return super.a(ry, float2);
		}
	}

	@Override
	public float a(co co) {
		return this.l.o(co.b()).v() == this.bz ? 10.0F : this.l.n(co) - 0.5F;
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("InLove", this.bw);
	}

	@Override
	public double ax() {
		return 0.14;
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.bw = du.h("InLove");
	}

	@Override
	public boolean cM() {
		int integer2 = ot.c(this.p);
		int integer3 = ot.c(this.bo().b);
		int integer4 = ot.c(this.r);
		co co5 = new co(integer2, integer3, integer4);
		return this.l.o(co5.b()).v() == this.bz && this.l.j(co5) > 8 && super.cM();
	}

	@Override
	public int C() {
		return 120;
	}

	@Override
	protected boolean K() {
		return false;
	}

	@Override
	protected int b(aay aay) {
		return 1 + this.l.r.nextInt(3);
	}

	public boolean e(afj afj) {
		return afj.c() == afl.R;
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (!afj4.b()) {
			if (this.e(afj4) && this.l() == 0 && this.bw <= 0) {
				this.a(aay, afj4);
				this.c(aay);
				return true;
			}

			if (this.l_() && this.e(afj4)) {
				this.a(aay, afj4);
				this.a((int)((float)(-this.l() / 20) * 0.1F), true);
				return true;
			}
		}

		return super.a(aay, ri);
	}

	protected void a(aay aay, afj afj) {
		if (!aay.bK.d) {
			afj.g(1);
		}
	}

	public void c(aay aay) {
		this.bw = 600;
		this.bx = aay;
		this.l.a(this, (byte)18);
	}

	public aay dm() {
		return this.bx;
	}

	public boolean dn() {
		return this.bw > 0;
	}

	public void do() {
		this.bw = 0;
	}

	public boolean a(ww ww) {
		if (ww == this) {
			return false;
		} else {
			return ww.getClass() != this.getClass() ? false : this.dn() && ww.dn();
		}
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 18) {
			for (int integer3 = 0; integer3 < 7; integer3++) {
				double double4 = this.S.nextGaussian() * 0.02;
				double double6 = this.S.nextGaussian() * 0.02;
				double double8 = this.S.nextGaussian() * 0.02;
				this.l
					.a(
						de.HEART,
						this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
						this.q + 0.5 + (double)(this.S.nextFloat() * this.H),
						this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
						double4,
						double6,
						double8
					);
			}
		} else {
			super.a(byte1);
		}
	}
}

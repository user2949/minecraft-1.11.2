public abstract class aaa extends te implements zt {
	public aaa(ajs ajs) {
		super(ajs);
		this.b_ = 5;
	}

	@Override
	public no bC() {
		return no.HOSTILE;
	}

	@Override
	public void n() {
		this.cd();
		float float2 = this.e(1.0F);
		if (float2 > 0.5F) {
			this.aV += 2;
		}

		super.n();
	}

	@Override
	public void A_() {
		super.A_();
		if (!this.l.E && this.l.ae() == rg.PEACEFUL) {
			this.T();
		}
	}

	@Override
	protected nm aa() {
		return nn.cR;
	}

	@Override
	protected nm ab() {
		return nn.cQ;
	}

	@Override
	public boolean a(ry ry, float float2) {
		return this.b(ry) ? false : super.a(ry, float2);
	}

	@Override
	protected nm bW() {
		return nn.cO;
	}

	@Override
	protected nm bX() {
		return nn.cN;
	}

	@Override
	protected nm e(int integer) {
		return integer > 4 ? nn.cM : nn.cP;
	}

	@Override
	public boolean B(sn sn) {
		float float3 = (float)this.a(aad.e).e();
		int integer4 = 0;
		if (sn instanceof sw) {
			float3 += aik.a(this.cg(), ((sw)sn).cf());
			integer4 += aik.b(this);
		}

		boolean boolean5 = sn.a(ry.a((sw)this), float3);
		if (boolean5) {
			if (integer4 > 0 && sn instanceof sw) {
				((sw)sn).a(this, (float)integer4 * 0.5F, (double)ot.a(this.v * (float) (Math.PI / 180.0)), (double)(-ot.b(this.v * (float) (Math.PI / 180.0))));
				this.s *= 0.6;
				this.u *= 0.6;
			}

			int integer6 = aik.c(this);
			if (integer6 > 0) {
				sn.i(integer6 * 4);
			}

			if (sn instanceof aay) {
				aay aay7 = (aay)sn;
				afj afj8 = this.cg();
				afj afj9 = aay7.cy() ? aay7.cB() : afj.a;
				if (!afj8.b() && !afj9.b() && afj8.c() instanceof ads && afj9.c() == afl.cR) {
					float float10 = 0.25F + (float)aik.f(this) * 0.05F;
					if (this.S.nextFloat() < float10) {
						aay7.di().a(afl.cR, 100);
						this.l.a(aay7, (byte)30);
					}
				}
			}

			this.a(this, sn);
		}

		return boolean5;
	}

	@Override
	public float a(co co) {
		return 0.5F - this.l.n(co);
	}

	protected boolean r_() {
		co co2 = new co(this.p, this.bo().b, this.r);
		if (this.l.b(ajy.SKY, co2) > this.S.nextInt(32)) {
			return false;
		} else {
			int integer3 = this.l.k(co2);
			if (this.l.V()) {
				int integer4 = this.l.af();
				this.l.c(10);
				integer3 = this.l.k(co2);
				this.l.c(integer4);
			}

			return integer3 <= this.S.nextInt(8);
		}
	}

	@Override
	public boolean cM() {
		return this.l.ae() != rg.PEACEFUL && this.r_() && super.cM();
	}

	@Override
	protected void bE() {
		super.bE();
		this.ce().b(aad.e);
	}

	@Override
	protected boolean bH() {
		return true;
	}
}

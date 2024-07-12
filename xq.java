import javax.annotation.Nullable;

public class xq extends xl implements aac {
	private static final kk<Integer> bG = kn.a(xq.class, km.b);
	private static final kk<Integer> bH = kn.a(xq.class, km.b);
	private static final kk<Integer> bI = kn.a(xq.class, km.b);
	private boolean bJ;
	@Nullable
	private xq bK;
	@Nullable
	private xq bL;

	public xq(ajs ajs) {
		super(ajs);
		this.a(0.9F, 1.87F);
	}

	private void p(int integer) {
		this.Y.b(bG, Math.max(1, Math.min(5, integer)));
	}

	private void dT() {
		int integer2 = this.S.nextFloat() < 0.04F ? 5 : 3;
		this.p(1 + this.S.nextInt(integer2));
	}

	public int dL() {
		return this.Y.a(bG);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Variant", this.dM());
		du.a("Strength", this.dL());
		if (!this.bB.a(1).b()) {
			du.a("DecorItem", this.bB.a(1).a(new du()));
		}
	}

	@Override
	public void a(du du) {
		this.p(du.h("Strength"));
		super.a(du);
		this.o(du.h("Variant"));
		if (du.b("DecorItem", 10)) {
			this.bB.a(1, new afj(du.o("DecorItem")));
		}

		this.dy();
	}

	@Override
	protected void r() {
		this.bq.a(0, new uf(this));
		this.bq.a(1, new vk(this, 1.2));
		this.bq.a(2, new un(this, 2.1F));
		this.bq.a(3, new vg(this, 1.25, 40, 20.0F));
		this.bq.a(3, new vb(this, 1.2));
		this.bq.a(4, new ub(this, 1.0));
		this.bq.a(5, new uh(this, 1.0));
		this.bq.a(6, new vr(this, 0.7));
		this.bq.a(7, new uo(this, aay.class, 6.0F));
		this.bq.a(8, new ve(this));
		this.br.a(1, new xq.c(this));
		this.br.a(2, new xq.a(this));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.b).a(40.0);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bG, 0);
		this.Y.a(bH, -1);
		this.Y.a(bI, 0);
	}

	public int dM() {
		return ot.a(this.Y.a(bI), 0, 3);
	}

	public void o(int integer) {
		this.Y.b(bI, integer);
	}

	@Override
	protected int di() {
		return this.dh() ? 2 + 3 * this.dl() : super.di();
	}

	@Override
	public void k(sn sn) {
		if (this.w(sn)) {
			float float3 = ot.b(this.aN * (float) (Math.PI / 180.0));
			float float4 = ot.a(this.aN * (float) (Math.PI / 180.0));
			float float5 = 0.3F;
			sn.b(this.p + (double)(0.3F * float4), this.q + this.ay() + sn.ax(), this.r - (double)(0.3F * float3));
		}
	}

	@Override
	public double ay() {
		return (double)this.H * 0.67;
	}

	@Override
	public boolean cR() {
		return false;
	}

	@Override
	protected boolean b(aay aay, afj afj) {
		int integer4 = 0;
		int integer5 = 0;
		float float6 = 0.0F;
		boolean boolean7 = false;
		afh afh8 = afj.c();
		if (afh8 == afl.R) {
			integer4 = 10;
			integer5 = 3;
			float6 = 2.0F;
		} else if (afh8 == afh.a(alv.cx)) {
			integer4 = 90;
			integer5 = 6;
			float6 = 10.0F;
			if (this.dp() && this.l() == 0) {
				boolean7 = true;
				this.c(aay);
			}
		}

		if (this.bU() < this.cb() && float6 > 0.0F) {
			this.b(float6);
			boolean7 = true;
		}

		if (this.l_() && integer4 > 0) {
			this.l
				.a(
					de.VILLAGER_HAPPY,
					this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
					this.q + 0.5 + (double)(this.S.nextFloat() * this.H),
					this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
					0.0,
					0.0,
					0.0
				);
			if (!this.l.E) {
				this.a(integer4);
			}

			boolean7 = true;
		}

		if (integer5 > 0 && (boolean7 || !this.dp()) && this.dw() < this.dC()) {
			boolean7 = true;
			if (!this.l.E) {
				this.n(integer5);
			}
		}

		if (boolean7 && !this.ad()) {
			this.l.a(null, this.p, this.q, this.r, nn.dD, this.bC(), 1.0F, 1.0F + (this.S.nextFloat() - this.S.nextFloat()) * 0.2F);
		}

		return boolean7;
	}

	@Override
	protected boolean ck() {
		return this.bU() <= 0.0F || this.dt();
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz = super.a(rh, sz);
		this.dT();
		int integer4;
		if (sz instanceof xq.b) {
			integer4 = ((xq.b)sz).a;
		} else {
			integer4 = this.S.nextInt(4);
			sz = new xq.b(integer4);
		}

		this.o(integer4);
		return sz;
	}

	public boolean dN() {
		return this.dO() != null;
	}

	@Override
	protected nm dj() {
		return nn.dA;
	}

	@Override
	protected nm G() {
		return nn.dz;
	}

	@Override
	protected nm bW() {
		return nn.dE;
	}

	@Override
	protected nm bX() {
		return nn.dC;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.dG, 0.15F, 1.0F);
	}

	@Override
	protected void dk() {
		this.a(nn.dB, 1.0F, (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
	}

	@Override
	public void dF() {
		nm nm2 = this.dj();
		if (nm2 != null) {
			this.a(nm2, this.ci(), this.cj());
		}
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.aw;
	}

	@Override
	public int dl() {
		return this.dL();
	}

	@Override
	public boolean dK() {
		return true;
	}

	@Override
	public boolean f(afj afj) {
		return afj.c() == afh.a(alv.cy);
	}

	@Override
	public boolean dA() {
		return false;
	}

	@Override
	public void a(rc rc) {
		aem aem3 = this.dO();
		super.a(rc);
		aem aem4 = this.dO();
		if (this.T > 20 && aem4 != null && aem4 != aem3) {
			this.a(nn.dH, 0.5F, 1.0F);
		}
	}

	@Override
	protected void dy() {
		if (!this.l.E) {
			super.dy();
			this.g(this.bB.a(1));
		}
	}

	private void a(@Nullable aem aem) {
		this.Y.b(bH, aem == null ? -1 : aem.a());
	}

	private void g(afj afj) {
		if (this.f(afj)) {
			this.a(aem.b(afj.j()));
		} else {
			this.a(null);
		}
	}

	@Nullable
	public aem dO() {
		int integer2 = this.Y.a(bH);
		return integer2 == -1 ? null : aem.b(integer2);
	}

	@Override
	public int dC() {
		return 30;
	}

	@Override
	public boolean a(ww ww) {
		return ww != this && ww instanceof xq && this.dG() && ((xq)ww).dG();
	}

	public xq a(sk sk) {
		xq xq3 = new xq(this.l);
		this.a(sk, xq3);
		xq xq4 = (xq)sk;
		int integer5 = this.S.nextInt(Math.max(this.dL(), xq4.dL())) + 1;
		if (this.S.nextFloat() < 0.03F) {
			integer5++;
		}

		xq3.p(integer5);
		xq3.o(this.S.nextBoolean() ? this.dM() : xq4.dM());
		return xq3;
	}

	private void e(sw sw) {
		abi abi3 = new abi(this.l, this);
		double double4 = sw.p - this.p;
		double double6 = sw.bo().b + (double)(sw.H / 3.0F) - abi3.q;
		double double8 = sw.r - this.r;
		float float10 = ot.a(double4 * double4 + double8 * double8) * 0.2F;
		abi3.c(double4, double6 + (double)float10, double8, 1.5F, 10.0F);
		this.l.a(null, this.p, this.q, this.r, nn.dF, this.bC(), 1.0F, 1.0F + (this.S.nextFloat() - this.S.nextFloat()) * 0.2F);
		this.l.a(abi3);
		this.bJ = true;
	}

	private void x(boolean boolean1) {
		this.bJ = boolean1;
	}

	@Override
	public void e(float float1, float float2) {
		int integer4 = ot.f((float1 * 0.5F - 3.0F) * float2);
		if (integer4 > 0) {
			if (float1 >= 6.0F) {
				this.a(ry.k, (float)integer4);
				if (this.aL()) {
					for (sn sn6 : this.by()) {
						sn6.a(ry.k, (float)integer4);
					}
				}
			}

			atl atl5 = this.l.o(new co(this.p, this.q - 0.2 - (double)this.x, this.r));
			alu alu6 = atl5.v();
			if (atl5.a() != azs.a && !this.ad()) {
				aqu aqu7 = alu6.v();
				this.l.a(null, this.p, this.q, this.r, aqu7.d(), this.bC(), aqu7.a() * 0.5F, aqu7.b() * 0.75F);
			}
		}
	}

	public void dP() {
		if (this.bK != null) {
			this.bK.bL = null;
		}

		this.bK = null;
	}

	public void a(xq xq) {
		this.bK = xq;
		this.bK.bL = this;
	}

	public boolean dQ() {
		return this.bL != null;
	}

	public boolean dR() {
		return this.bK != null;
	}

	@Nullable
	public xq dS() {
		return this.bK;
	}

	@Override
	protected double dg() {
		return 2.0;
	}

	@Override
	protected void dD() {
		if (!this.dR() && this.l_()) {
			super.dD();
		}
	}

	@Override
	public boolean dE() {
		return false;
	}

	@Override
	public void a(sw sw, float float2) {
		this.e(sw);
	}

	static class a extends vy<xk> {
		public a(xq xq) {
			super(xq, xk.class, 16, false, true, null);
		}

		@Override
		public boolean a() {
			if (super.a() && this.d != null && !this.d.dh()) {
				return true;
			} else {
				this.e.d(null);
				return false;
			}
		}

		@Override
		protected double i() {
			return super.i() * 0.25;
		}
	}

	static class b implements sz {
		public int a;

		private b(int integer) {
			this.a = integer;
		}
	}

	static class c extends vv {
		public c(xq xq) {
			super(xq, false);
		}

		@Override
		public boolean b() {
			if (this.e instanceof xq) {
				xq xq2 = (xq)this.e;
				if (xq2.bJ) {
					xq2.x(false);
					return false;
				}
			}

			return super.b();
		}
	}
}

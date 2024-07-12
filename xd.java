import javax.annotation.Nullable;

public class xd extends ww {
	private static final kk<Boolean> bw = kn.a(xd.class, km.h);
	private float bx;
	private float by;
	private int bA;

	public xd(ajs ajs) {
		super(ajs);
		this.a(1.3F, 1.4F);
	}

	@Override
	public sk a(sk sk) {
		return new xd(this.l);
	}

	@Override
	public boolean e(afj afj) {
		return false;
	}

	@Override
	protected void r() {
		super.r();
		this.bq.a(0, new uf(this));
		this.bq.a(1, new xd.d());
		this.bq.a(1, new xd.e());
		this.bq.a(4, new uh(this, 1.25));
		this.bq.a(5, new vf(this, 1.0));
		this.bq.a(6, new uo(this, aay.class, 6.0F));
		this.bq.a(7, new ve(this));
		this.br.a(1, new xd.c());
		this.br.a(2, new xd.a());
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(30.0);
		this.a(aad.b).a(20.0);
		this.a(aad.d).a(0.25);
		this.ce().b(aad.e);
		this.a(aad.e).a(6.0);
	}

	@Override
	protected nm G() {
		return this.l_() ? nn.eM : nn.eL;
	}

	@Override
	protected nm bW() {
		return nn.eO;
	}

	@Override
	protected nm bX() {
		return nn.eN;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.eP, 0.15F, 1.0F);
	}

	protected void dh() {
		if (this.bA <= 0) {
			this.a(nn.eQ, 1.0F, 1.0F);
			this.bA = 40;
		}
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.F;
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bw, false);
	}

	@Override
	public void A_() {
		super.A_();
		if (this.l.E) {
			this.bx = this.by;
			if (this.di()) {
				this.by = ot.a(this.by + 1.0F, 0.0F, 6.0F);
			} else {
				this.by = ot.a(this.by - 1.0F, 0.0F, 6.0F);
			}
		}

		if (this.bA > 0) {
			this.bA--;
		}
	}

	@Override
	public boolean B(sn sn) {
		boolean boolean3 = sn.a(ry.a((sw)this), (float)((int)this.a(aad.e).e()));
		if (boolean3) {
			this.a(this, sn);
		}

		return boolean3;
	}

	public boolean di() {
		return this.Y.a(bw);
	}

	public void p(boolean boolean1) {
		this.Y.b(bw, boolean1);
	}

	public float r(float float1) {
		return (this.bx + (this.by - this.bx) * float1) / 6.0F;
	}

	@Override
	protected float cp() {
		return 0.98F;
	}

	@Override
	public sz a(rh rh, sz sz) {
		if (sz instanceof xd.b) {
			if (((xd.b)sz).a) {
				this.b_(-24000);
			}
		} else {
			xd.b b4 = new xd.b();
			b4.a = true;
			sz = b4;
		}

		return sz;
	}

	class a extends vy<aay> {
		public a() {
			super(xd.this, aay.class, 20, true, true, null);
		}

		@Override
		public boolean a() {
			if (xd.this.l_()) {
				return false;
			} else {
				if (super.a()) {
					for (xd xd4 : xd.this.l.a(xd.class, xd.this.bo().c(8.0, 4.0, 8.0))) {
						if (xd4.l_()) {
							return true;
						}
					}
				}

				xd.this.d(null);
				return false;
			}
		}

		@Override
		protected double i() {
			return super.i() * 0.5;
		}
	}

	static class b implements sz {
		public boolean a;

		private b() {
		}
	}

	class c extends vv {
		public c() {
			super(xd.this, false);
		}

		@Override
		public void c() {
			super.c();
			if (xd.this.l_()) {
				this.f();
				this.d();
			}
		}

		@Override
		protected void a(te te, sw sw) {
			if (te instanceof xd && !te.l_()) {
				super.a(te, sw);
			}
		}
	}

	class d extends ur {
		public d() {
			super(xd.this, 1.25, true);
		}

		@Override
		protected void a(sw sw, double double2) {
			double double5 = this.a(sw);
			if (double2 <= double5 && this.c <= 0) {
				this.c = 20;
				this.b.B(sw);
				xd.this.p(false);
			} else if (double2 <= double5 * 2.0) {
				if (this.c <= 0) {
					xd.this.p(false);
					this.c = 20;
				}

				if (this.c <= 10) {
					xd.this.p(true);
					xd.this.dh();
				}
			} else {
				this.c = 20;
				xd.this.p(false);
			}
		}

		@Override
		public void d() {
			xd.this.p(false);
			super.d();
		}

		@Override
		protected double a(sw sw) {
			return (double)(4.0F + sw.G);
		}
	}

	class e extends vb {
		public e() {
			super(xd.this, 2.0);
		}

		@Override
		public boolean a() {
			return !xd.this.l_() && !xd.this.aJ() ? false : super.a();
		}
	}
}

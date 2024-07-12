import javax.annotation.Nullable;

public class aah extends sx implements zt {
	private static final kk<Integer> bu = kn.a(aah.class, km.b);
	public float a;
	public float b;
	public float c;
	private boolean bv;

	public aah(ajs ajs) {
		super(ajs);
		this.f = new aah.d(this);
	}

	@Override
	protected void r() {
		this.bq.a(1, new aah.b(this));
		this.bq.a(2, new aah.a(this));
		this.bq.a(3, new aah.e(this));
		this.bq.a(5, new aah.c(this));
		this.br.a(1, new vx(this));
		this.br.a(3, new vw(this, xi.class));
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bu, 1);
	}

	protected void a(int integer, boolean boolean2) {
		this.Y.b(bu, integer);
		this.a(0.51000005F * (float)integer, 0.51000005F * (float)integer);
		this.b(this.p, this.q, this.r);
		this.a(aad.a).a((double)(integer * integer));
		this.a(aad.d).a((double)(0.2F + 0.1F * (float)integer));
		if (boolean2) {
			this.c(this.cb());
		}

		this.b_ = integer;
	}

	public int dh() {
		return this.Y.a(bu);
	}

	public static void c(ph ph) {
		sx.a(ph, aah.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Size", this.dh() - 1);
		du.a("wasOnGround", this.bv);
	}

	@Override
	public void a(du du) {
		super.a(du);
		int integer3 = du.h("Size");
		if (integer3 < 0) {
			integer3 = 0;
		}

		this.a(integer3 + 1, false);
		this.bv = du.p("wasOnGround");
	}

	public boolean di() {
		return this.dh() <= 1;
	}

	protected de o() {
		return de.SLIME;
	}

	@Override
	public void A_() {
		if (!this.l.E && this.l.ae() == rg.PEACEFUL && this.dh() > 0) {
			this.F = true;
		}

		this.b = this.b + (this.a - this.b) * 0.5F;
		this.c = this.b;
		super.A_();
		if (this.z && !this.bv) {
			int integer2 = this.dh();

			for (int integer3 = 0; integer3 < integer2 * 8; integer3++) {
				float float4 = this.S.nextFloat() * (float) (Math.PI * 2);
				float float5 = this.S.nextFloat() * 0.5F + 0.5F;
				float float6 = ot.a(float4) * (float)integer2 * 0.5F * float5;
				float float7 = ot.b(float4) * (float)integer2 * 0.5F * float5;
				ajs var10000 = this.l;
				de var10001 = this.o();
				double var10002 = this.p + (double)float6;
				double var10004 = this.r + (double)float7;
				var10000.a(var10001, var10002, this.bo().b, var10004, 0.0, 0.0, 0.0);
			}

			this.a(this.df(), this.ci(), ((this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F) / 0.8F);
			this.a = -0.5F;
		} else if (!this.z && this.bv) {
			this.a = 1.0F;
		}

		this.bv = this.z;
		this.dc();
	}

	protected void dc() {
		this.a *= 0.6F;
	}

	protected int db() {
		return this.S.nextInt(20) + 10;
	}

	protected aah da() {
		return new aah(this.l);
	}

	@Override
	public void a(kk<?> kk) {
		if (bu.equals(kk)) {
			int integer3 = this.dh();
			this.a(0.51000005F * (float)integer3, 0.51000005F * (float)integer3);
			this.v = this.aP;
			this.aN = this.aP;
			if (this.aj() && this.S.nextInt(20) == 0) {
				this.al();
			}
		}

		super.a(kk);
	}

	@Override
	public void T() {
		int integer2 = this.dh();
		if (!this.l.E && integer2 > 1 && this.bU() <= 0.0F) {
			int integer3 = 2 + this.S.nextInt(3);

			for (int integer4 = 0; integer4 < integer3; integer4++) {
				float float5 = ((float)(integer4 % 2) - 0.5F) * (float)integer2 / 4.0F;
				float float6 = ((float)(integer4 / 2) - 0.5F) * (float)integer2 / 4.0F;
				aah aah7 = this.da();
				if (this.n_()) {
					aah7.c(this.bi());
				}

				if (this.cU()) {
					aah7.cS();
				}

				aah7.a(integer2 / 2, true);
				aah7.b(this.p + (double)float5, this.q + 0.5, this.r + (double)float6, this.S.nextFloat() * 360.0F, 0.0F);
				this.l.a(aah7);
			}
		}

		super.T();
	}

	@Override
	public void i(sn sn) {
		super.i(sn);
		if (sn instanceof xi && this.dd()) {
			this.e((sw)sn);
		}
	}

	@Override
	public void d(aay aay) {
		if (this.dd()) {
			this.e(aay);
		}
	}

	protected void e(sw sw) {
		int integer3 = this.dh();
		if (this.D(sw) && this.h(sw) < 0.6 * (double)integer3 * 0.6 * (double)integer3 && sw.a(ry.a((sw)this), (float)this.de())) {
			this.a(nn.fX, 1.0F, (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
			this.a(this, sw);
		}
	}

	@Override
	public float bq() {
		return 0.625F * this.H;
	}

	protected boolean dd() {
		return !this.di();
	}

	protected int de() {
		return this.dh();
	}

	@Override
	protected nm bW() {
		return this.di() ? nn.gl : nn.gc;
	}

	@Override
	protected nm bX() {
		return this.di() ? nn.gk : nn.fZ;
	}

	protected nm df() {
		return this.di() ? nn.gn : nn.gf;
	}

	@Override
	protected afh I() {
		return this.dh() == 1 ? afl.aU : null;
	}

	@Nullable
	@Override
	protected kq J() {
		return this.dh() == 1 ? bcf.ah : bcf.a;
	}

	@Override
	public boolean cM() {
		co co2 = new co(ot.c(this.p), 0, ot.c(this.r));
		auo auo3 = this.l.f(co2);
		if (this.l.T().t() == ajx.c && this.S.nextInt(4) != 1) {
			return false;
		} else {
			if (this.l.ae() != rg.PEACEFUL) {
				akf akf4 = this.l.b(co2);
				if (akf4 == akk.h
					&& this.q > 50.0
					&& this.q < 70.0
					&& this.S.nextFloat() < 0.5F
					&& this.S.nextFloat() < this.l.E()
					&& this.l.k(new co(this)) <= this.S.nextInt(8)) {
					return super.cM();
				}

				if (this.S.nextInt(10) == 0 && auo3.a(987234911L).nextInt(10) == 0 && this.q < 40.0) {
					return super.cM();
				}
			}

			return false;
		}
	}

	@Override
	protected float ci() {
		return 0.4F * (float)this.dh();
	}

	@Override
	public int N() {
		return 0;
	}

	protected boolean dj() {
		return this.dh() > 0;
	}

	@Override
	protected void cm() {
		this.t = 0.42F;
		this.ai = true;
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		int integer4 = this.S.nextInt(3);
		if (integer4 < 2 && this.S.nextFloat() < 0.5F * rh.d()) {
			integer4++;
		}

		int integer5 = 1 << integer4;
		this.a(integer5, true);
		return super.a(rh, sz);
	}

	protected nm dg() {
		return this.di() ? nn.gm : nn.gd;
	}

	static class a extends ui {
		private final aah a;
		private int b;

		public a(aah aah) {
			this.a = aah;
			this.a(2);
		}

		@Override
		public boolean a() {
			sw sw2 = this.a.z();
			if (sw2 == null) {
				return false;
			} else {
				return !sw2.au() ? false : !(sw2 instanceof aay) || !((aay)sw2).bK.a;
			}
		}

		@Override
		public void c() {
			this.b = 300;
			super.c();
		}

		@Override
		public boolean b() {
			sw sw2 = this.a.z();
			if (sw2 == null) {
				return false;
			} else if (!sw2.au()) {
				return false;
			} else {
				return sw2 instanceof aay && ((aay)sw2).bK.a ? false : --this.b > 0;
			}
		}

		@Override
		public void e() {
			this.a.a(this.a.z(), 10.0F, 10.0F);
			((aah.d)this.a.u()).a(this.a.v, this.a.dd());
		}
	}

	static class b extends ui {
		private final aah a;

		public b(aah aah) {
			this.a = aah;
			this.a(5);
			((we)aah.x()).c(true);
		}

		@Override
		public boolean a() {
			return this.a.aj() || this.a.ao();
		}

		@Override
		public void e() {
			if (this.a.bJ().nextFloat() < 0.8F) {
				this.a.w().a();
			}

			((aah.d)this.a.u()).a(1.2);
		}
	}

	static class c extends ui {
		private final aah a;

		public c(aah aah) {
			this.a = aah;
			this.a(5);
		}

		@Override
		public boolean a() {
			return true;
		}

		@Override
		public void e() {
			((aah.d)this.a.u()).a(1.0);
		}
	}

	static class d extends tw {
		private float i;
		private int j;
		private final aah k;
		private boolean l;

		public d(aah aah) {
			super(aah);
			this.k = aah;
			this.i = 180.0F * aah.v / (float) Math.PI;
		}

		public void a(float float1, boolean boolean2) {
			this.i = float1;
			this.l = boolean2;
		}

		public void a(double double1) {
			this.e = double1;
			this.h = tw.a.MOVE_TO;
		}

		@Override
		public void c() {
			this.a.v = this.a(this.a.v, this.i, 90.0F);
			this.a.aP = this.a.v;
			this.a.aN = this.a.v;
			if (this.h != tw.a.MOVE_TO) {
				this.a.o(0.0F);
			} else {
				this.h = tw.a.WAIT;
				if (this.a.z) {
					this.a.l((float)(this.e * this.a.a(aad.d).e()));
					if (this.j-- <= 0) {
						this.j = this.k.db();
						if (this.l) {
							this.j /= 3;
						}

						this.k.w().a();
						if (this.k.dj()) {
							this.k.a(this.k.dg(), this.k.ci(), ((this.k.bJ().nextFloat() - this.k.bJ().nextFloat()) * 0.2F + 1.0F) * 0.8F);
						}
					} else {
						this.k.be = 0.0F;
						this.k.bf = 0.0F;
						this.a.l(0.0F);
					}
				} else {
					this.a.l((float)(this.e * this.a.a(aad.d).e()));
				}
			}
		}
	}

	static class e extends ui {
		private final aah a;
		private float b;
		private int c;

		public e(aah aah) {
			this.a = aah;
			this.a(2);
		}

		@Override
		public boolean a() {
			return this.a.z() == null && (this.a.z || this.a.aj() || this.a.ao() || this.a.a(si.y));
		}

		@Override
		public void e() {
			if (--this.c <= 0) {
				this.c = 40 + this.a.bJ().nextInt(60);
				this.b = (float)this.a.bJ().nextInt(360);
			}

			((aah.d)this.a.u()).a(this.b, false);
		}
	}
}

import javax.annotation.Nullable;

public class xe extends ww {
	private static final kk<Integer> bw = kn.a(xe.class, km.b);
	private int bx;
	private int by;
	private boolean bA;
	private int bB;
	private int bC;

	public xe(ajs ajs) {
		super(ajs);
		this.a(0.4F, 0.5F);
		this.g = new xe.d(this);
		this.f = new xe.e(this);
		this.c(0.0);
	}

	@Override
	protected void r() {
		this.bq.a(1, new uf(this));
		this.bq.a(1, new xe.f(this, 2.2));
		this.bq.a(2, new ub(this, 0.8));
		this.bq.a(3, new vo(this, 1.0, afl.cc, false));
		this.bq.a(3, new vo(this, 1.0, afl.ch, false));
		this.bq.a(3, new vo(this, 1.0, afh.a(alv.N), false));
		this.bq.a(4, new xe.b(this, aay.class, 8.0F, 2.2, 2.2));
		this.bq.a(4, new xe.b(this, xk.class, 10.0F, 2.2, 2.2));
		this.bq.a(4, new xe.b(this, aaa.class, 4.0F, 2.2, 2.2));
		this.bq.a(5, new xe.g(this));
		this.bq.a(6, new vr(this, 0.6));
		this.bq.a(11, new uo(this, aay.class, 10.0F));
	}

	@Override
	protected float cl() {
		if (!this.A && (!this.f.a() || !(this.f.e() > this.q + 0.5))) {
			bbd bbd2 = this.h.k();
			if (bbd2 != null && bbd2.e() < bbd2.d()) {
				bdw bdw3 = bbd2.a(this);
				if (bdw3.c > this.q + 0.5) {
					return 0.5F;
				}
			}

			return this.f.b() <= 0.6 ? 0.2F : 0.3F;
		} else {
			return 0.5F;
		}
	}

	@Override
	protected void cm() {
		super.cm();
		double double2 = this.f.b();
		if (double2 > 0.0) {
			double double4 = this.s * this.s + this.u * this.u;
			if (double4 < 0.010000000000000002) {
				this.a(0.0F, 1.0F, 0.1F);
			}
		}

		if (!this.l.E) {
			this.l.a(this, (byte)1);
		}
	}

	public float r(float float1) {
		return this.by == 0 ? 0.0F : ((float)this.bx + float1) / (float)this.by;
	}

	public void c(double double1) {
		this.x().a(double1);
		this.f.a(this.f.d(), this.f.e(), this.f.f(), double1);
	}

	@Override
	public void l(boolean boolean1) {
		super.l(boolean1);
		if (boolean1) {
			this.a(this.di(), this.ci(), ((this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F) * 0.8F);
		}
	}

	public void dh() {
		this.l(true);
		this.by = 10;
		this.bx = 0;
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bw, 0);
	}

	@Override
	public void M() {
		if (this.bB > 0) {
			this.bB--;
		}

		if (this.bC > 0) {
			this.bC = this.bC - this.S.nextInt(3);
			if (this.bC < 0) {
				this.bC = 0;
			}
		}

		if (this.z) {
			if (!this.bA) {
				this.l(false);
				this.dr();
			}

			if (this.dj() == 99 && this.bB == 0) {
				sw sw2 = this.z();
				if (sw2 != null && this.h(sw2) < 16.0) {
					this.a(sw2.p, sw2.r);
					this.f.a(sw2.p, sw2.q, sw2.r, this.f.b());
					this.dh();
					this.bA = true;
				}
			}

			xe.d d2 = (xe.d)this.g;
			if (!d2.c()) {
				if (this.f.a() && this.bB == 0) {
					bbd bbd3 = this.h.k();
					bdw bdw4 = new bdw(this.f.d(), this.f.e(), this.f.f());
					if (bbd3 != null && bbd3.e() < bbd3.d()) {
						bdw4 = bbd3.a(this);
					}

					this.a(bdw4.b, bdw4.d);
					this.dh();
				}
			} else if (!d2.d()) {
				this.dl();
			}
		}

		this.bA = this.z;
	}

	@Override
	public void am() {
	}

	private void a(double double1, double double2) {
		this.v = (float)(ot.c(double2 - this.r, double1 - this.p) * 180.0F / (float)Math.PI) - 90.0F;
	}

	private void dl() {
		((xe.d)this.g).a(true);
	}

	private void dp() {
		((xe.d)this.g).a(false);
	}

	private void dq() {
		if (this.f.b() < 2.2) {
			this.bB = 10;
		} else {
			this.bB = 1;
		}
	}

	private void dr() {
		this.dq();
		this.dp();
	}

	@Override
	public void n() {
		super.n();
		if (this.bx != this.by) {
			this.bx++;
		} else if (this.by != 0) {
			this.bx = 0;
			this.by = 0;
			this.l(false);
		}
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(3.0);
		this.a(aad.d).a(0.3F);
	}

	public static void a(ph ph) {
		sx.a(ph, xe.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("RabbitType", this.dj());
		du.a("MoreCarrotTicks", this.bC);
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.g(du.h("RabbitType"));
		this.bC = du.h("MoreCarrotTicks");
	}

	protected nm di() {
		return nn.eY;
	}

	@Override
	protected nm G() {
		return nn.eU;
	}

	@Override
	protected nm bW() {
		return nn.eX;
	}

	@Override
	protected nm bX() {
		return nn.eW;
	}

	@Override
	public boolean B(sn sn) {
		if (this.dj() == 99) {
			this.a(nn.eV, 1.0F, (this.S.nextFloat() - this.S.nextFloat()) * 0.2F + 1.0F);
			return sn.a(ry.a((sw)this), 8.0F);
		} else {
			return sn.a(ry.a((sw)this), 3.0F);
		}
	}

	@Override
	public no bC() {
		return this.dj() == 99 ? no.HOSTILE : no.NEUTRAL;
	}

	@Override
	public boolean a(ry ry, float float2) {
		return this.b(ry) ? false : super.a(ry, float2);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.C;
	}

	private boolean a(afh afh) {
		return afh == afl.cc || afh == afl.ch || afh == afh.a(alv.N);
	}

	public xe a(sk sk) {
		xe xe3 = new xe(this.l);
		int integer4 = this.ds();
		if (this.S.nextInt(20) != 0) {
			if (sk instanceof xe && this.S.nextBoolean()) {
				integer4 = ((xe)sk).dj();
			} else {
				integer4 = this.dj();
			}
		}

		xe3.g(integer4);
		return xe3;
	}

	@Override
	public boolean e(afj afj) {
		return this.a(afj.c());
	}

	public int dj() {
		return this.Y.a(bw);
	}

	public void g(int integer) {
		if (integer == 99) {
			this.a(aad.g).a(8.0);
			this.bq.a(4, new xe.a(this));
			this.br.a(1, new vv(this, false));
			this.br.a(2, new vy(this, aay.class, true));
			this.br.a(2, new vy(this, xk.class, true));
			if (!this.n_()) {
				this.c(dp.a("entity.KillerBunny.name"));
			}
		}

		this.Y.b(bw, integer);
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz = super.a(rh, sz);
		int integer4 = this.ds();
		boolean boolean5 = false;
		if (sz instanceof xe.c) {
			integer4 = ((xe.c)sz).a;
			boolean5 = true;
		} else {
			sz = new xe.c(integer4);
		}

		this.g(integer4);
		if (boolean5) {
			this.b_(-24000);
		}

		return sz;
	}

	private int ds() {
		akf akf2 = this.l.b(new co(this));
		int integer3 = this.S.nextInt(100);
		if (akf2.p()) {
			return integer3 < 80 ? 1 : 3;
		} else if (akf2 instanceof akm) {
			return 4;
		} else {
			return integer3 < 50 ? 0 : (integer3 < 90 ? 5 : 2);
		}
	}

	private boolean dt() {
		return this.bC == 0;
	}

	protected void dk() {
		ame ame2 = (ame)alv.cb;
		atl atl3 = ame2.e(ame2.g());
		this.l
			.a(
				de.BLOCK_DUST,
				this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
				this.q + 0.5 + (double)(this.S.nextFloat() * this.H),
				this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
				0.0,
				0.0,
				0.0,
				alu.j(atl3)
			);
		this.bC = 40;
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 1) {
			this.an();
			this.by = 10;
			this.bx = 0;
		} else {
			super.a(byte1);
		}
	}

	static class a extends ur {
		public a(xe xe) {
			super(xe, 1.4, true);
		}

		@Override
		protected double a(sw sw) {
			return (double)(4.0F + sw.G);
		}
	}

	static class b<T extends sn> extends ty<T> {
		private final xe c;

		public b(xe xe, Class<T> class2, float float3, double double4, double double5) {
			super(xe, class2, float3, double4, double5);
			this.c = xe;
		}

		@Override
		public boolean a() {
			return this.c.dj() != 99 && super.a();
		}
	}

	public static class c implements sz {
		public int a;

		public c(int integer) {
			this.a = integer;
		}
	}

	public class d extends tu {
		private final xe c;
		private boolean d;

		public d(xe xe2) {
			super(xe2);
			this.c = xe2;
		}

		public boolean c() {
			return this.a;
		}

		public boolean d() {
			return this.d;
		}

		public void a(boolean boolean1) {
			this.d = boolean1;
		}

		@Override
		public void b() {
			if (this.a) {
				this.c.dh();
				this.a = false;
			}
		}
	}

	static class e extends tw {
		private final xe i;
		private double j;

		public e(xe xe) {
			super(xe);
			this.i = xe;
		}

		@Override
		public void c() {
			if (this.i.z && !this.i.bd && !((xe.d)this.i.g).c()) {
				this.i.c(0.0);
			} else if (this.a()) {
				this.i.c(this.j);
			}

			super.c();
		}

		@Override
		public void a(double double1, double double2, double double3, double double4) {
			if (this.i.aj()) {
				double4 = 1.5;
			}

			super.a(double1, double2, double3, double4);
			if (double4 > 0.0) {
				this.j = double4;
			}
		}
	}

	static class f extends vb {
		private final xe b;

		public f(xe xe, double double2) {
			super(xe, double2);
			this.b = xe;
		}

		@Override
		public void e() {
			super.e();
			this.b.c(this.a);
		}
	}

	static class g extends uu {
		private final xe c;
		private boolean d;
		private boolean e;

		public g(xe xe) {
			super(xe, 0.7F, 16);
			this.c = xe;
		}

		@Override
		public boolean a() {
			if (this.a <= 0) {
				if (!this.c.l.U().b("mobGriefing")) {
					return false;
				}

				this.e = false;
				this.d = this.c.dt();
				this.d = true;
			}

			return super.a();
		}

		@Override
		public boolean b() {
			return this.e && super.b();
		}

		@Override
		public void e() {
			super.e();
			this.c.t().a((double)this.b.p() + 0.5, (double)(this.b.q() + 1), (double)this.b.r() + 0.5, 10.0F, (float)this.c.N());
			if (this.f()) {
				ajs ajs2 = this.c.l;
				co co3 = this.b.a();
				atl atl4 = ajs2.o(co3);
				alu alu5 = atl4.v();
				if (this.e && alu5 instanceof ame) {
					Integer integer6 = atl4.c(ame.c);
					if (integer6 == 0) {
						ajs2.a(co3, alv.a.t(), 2);
						ajs2.b(co3, true);
					} else {
						ajs2.a(co3, atl4.a(ame.c, integer6 - 1), 2);
						ajs2.b(2001, co3, alu.j(atl4));
					}

					this.c.dk();
				}

				this.e = false;
				this.a = 10;
			}
		}

		@Override
		protected boolean a(ajs ajs, co co) {
			alu alu4 = ajs.o(co).v();
			if (alu4 == alv.ak && this.d && !this.e) {
				co = co.a();
				atl atl5 = ajs.o(co);
				alu4 = atl5.v();
				if (alu4 instanceof ame && ((ame)alu4).A(atl5)) {
					this.e = true;
					return true;
				}
			}

			return false;
		}
	}
}

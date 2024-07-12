import javax.annotation.Nullable;

public class aak extends aaa {
	protected static final kk<Byte> a = kn.a(aak.class, km.a);
	private sx b;
	@Nullable
	private co c;
	private boolean bw;
	private int bx;

	public aak(ajs ajs) {
		super(ajs);
		this.X = true;
		this.f = new aak.c(this);
		this.a(0.4F, 0.8F);
		this.b_ = 3;
	}

	@Override
	public void a(tc tc, double double2, double double3, double double4) {
		super.a(tc, double2, double3, double4);
		this.ac();
	}

	@Override
	public void A_() {
		this.Q = true;
		super.A_();
		this.Q = false;
		this.d(true);
		if (this.bw && --this.bx <= 0) {
			this.bx = 20;
			this.a(ry.i, 1.0F);
		}
	}

	@Override
	protected void r() {
		super.r();
		this.bq.a(0, new uf(this));
		this.bq.a(4, new aak.a());
		this.bq.a(8, new aak.d());
		this.bq.a(9, new uo(this, aay.class, 3.0F, 1.0F));
		this.bq.a(10, new uo(this, sx.class, 8.0F));
		this.br.a(1, new vv(this, true, aak.class));
		this.br.a(2, new aak.b(this));
		this.br.a(3, new vy(this, aay.class, true));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(14.0);
		this.a(aad.e).a(4.0);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, (byte)0);
	}

	public static void a(ph ph) {
		sx.a(ph, aak.class);
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.e("BoundX")) {
			this.c = new co(du.h("BoundX"), du.h("BoundY"), du.h("BoundZ"));
		}

		if (du.e("LifeTicks")) {
			this.a(du.h("LifeTicks"));
		}
	}

	@Override
	public void b(du du) {
		super.b(du);
		if (this.c != null) {
			du.a("BoundX", this.c.p());
			du.a("BoundY", this.c.q());
			du.a("BoundZ", this.c.r());
		}

		if (this.bw) {
			du.a("LifeTicks", this.bx);
		}
	}

	public sx o() {
		return this.b;
	}

	@Nullable
	public co di() {
		return this.c;
	}

	public void g(@Nullable co co) {
		this.c = co;
	}

	private boolean b(int integer) {
		int integer3 = this.Y.a(a);
		return (integer3 & integer) != 0;
	}

	private void a(int integer, boolean boolean2) {
		int integer4 = this.Y.a(a);
		if (boolean2) {
			integer4 |= integer;
		} else {
			integer4 &= ~integer;
		}

		this.Y.b(a, (byte)(integer4 & 0xFF));
	}

	public boolean dj() {
		return this.b(1);
	}

	public void a(boolean boolean1) {
		this.a(1, boolean1);
	}

	public void a(sx sx) {
		this.b = sx;
	}

	public void a(int integer) {
		this.bw = true;
		this.bx = integer;
	}

	@Override
	protected nm G() {
		return nn.hc;
	}

	@Override
	protected nm bX() {
		return nn.he;
	}

	@Override
	protected nm bW() {
		return nn.hf;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.ax;
	}

	@Override
	public int d(float float1) {
		return 15728880;
	}

	@Override
	public float e(float float1) {
		return 1.0F;
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		this.a(rh);
		this.b(rh);
		return super.a(rh, sz);
	}

	@Override
	protected void a(rh rh) {
		this.a(ss.MAINHAND, new afj(afl.o));
		this.a(ss.MAINHAND, 0.0F);
	}

	class a extends ui {
		public a() {
			this.a(1);
		}

		@Override
		public boolean a() {
			return aak.this.z() != null && !aak.this.u().a() && aak.this.S.nextInt(7) == 0 ? aak.this.h(aak.this.z()) > 4.0 : false;
		}

		@Override
		public boolean b() {
			return aak.this.u().a() && aak.this.dj() && aak.this.z() != null && aak.this.z().au();
		}

		@Override
		public void c() {
			sw sw2 = aak.this.z();
			bdw bdw3 = sw2.g(1.0F);
			aak.this.f.a(bdw3.b, bdw3.c, bdw3.d, 1.0);
			aak.this.a(true);
			aak.this.a(nn.hd, 1.0F, 1.0F);
		}

		@Override
		public void d() {
			aak.this.a(false);
		}

		@Override
		public void e() {
			sw sw2 = aak.this.z();
			if (aak.this.bo().c(sw2.bo())) {
				aak.this.B(sw2);
				aak.this.a(false);
			} else {
				double double3 = aak.this.h(sw2);
				if (double3 < 9.0) {
					bdw bdw5 = sw2.g(1.0F);
					aak.this.f.a(bdw5.b, bdw5.c, bdw5.d, 1.0);
				}
			}
		}
	}

	class b extends wc {
		public b(te te) {
			super(te, false);
		}

		@Override
		public boolean a() {
			return aak.this.b != null && aak.this.b.z() != null && this.a(aak.this.b.z(), false);
		}

		@Override
		public void c() {
			aak.this.d(aak.this.b.z());
			super.c();
		}
	}

	class c extends tw {
		public c(aak aak2) {
			super(aak2);
		}

		@Override
		public void c() {
			if (this.h == tw.a.MOVE_TO) {
				double double2 = this.b - aak.this.p;
				double double4 = this.c - aak.this.q;
				double double6 = this.d - aak.this.r;
				double double8 = double2 * double2 + double4 * double4 + double6 * double6;
				double8 = (double)ot.a(double8);
				if (double8 < aak.this.bo().a()) {
					this.h = tw.a.WAIT;
					aak.this.s *= 0.5;
					aak.this.t *= 0.5;
					aak.this.u *= 0.5;
				} else {
					aak.this.s = aak.this.s + double2 / double8 * 0.05 * this.e;
					aak.this.t = aak.this.t + double4 / double8 * 0.05 * this.e;
					aak.this.u = aak.this.u + double6 / double8 * 0.05 * this.e;
					if (aak.this.z() == null) {
						aak.this.v = -((float)ot.c(aak.this.s, aak.this.u)) * (180.0F / (float)Math.PI);
						aak.this.aN = aak.this.v;
					} else {
						double double10 = aak.this.z().p - aak.this.p;
						double double12 = aak.this.z().r - aak.this.r;
						aak.this.v = -((float)ot.c(double10, double12)) * (180.0F / (float)Math.PI);
						aak.this.aN = aak.this.v;
					}
				}
			}
		}
	}

	class d extends ui {
		public d() {
			this.a(1);
		}

		@Override
		public boolean a() {
			return !aak.this.u().a() && aak.this.S.nextInt(7) == 0;
		}

		@Override
		public boolean b() {
			return false;
		}

		@Override
		public void e() {
			co co2 = aak.this.di();
			if (co2 == null) {
				co2 = new co(aak.this);
			}

			for (int integer3 = 0; integer3 < 3; integer3++) {
				co co4 = co2.a(aak.this.S.nextInt(15) - 7, aak.this.S.nextInt(11) - 5, aak.this.S.nextInt(15) - 7);
				if (aak.this.l.d(co4)) {
					aak.this.f.a((double)co4.p() + 0.5, (double)co4.q() + 0.5, (double)co4.r() + 0.5, 0.25);
					if (aak.this.z() == null) {
						aak.this.t().a((double)co4.p() + 0.5, (double)co4.q() + 0.5, (double)co4.r() + 0.5, 180.0F, 20.0F);
					}
					break;
				}
			}
		}
	}
}

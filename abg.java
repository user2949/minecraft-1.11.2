public class abg extends sn {
	private static final kk<afj> a = kn.a(abg.class, km.f);
	private static final kk<Integer> b = kn.a(abg.class, km.b);
	private int c;
	private int d;
	private sw e;

	public abg(ajs ajs) {
		super(ajs);
		this.a(0.25F, 0.25F);
	}

	@Override
	protected void i() {
		this.Y.a(a, afj.a);
		this.Y.a(b, 0);
	}

	@Override
	public boolean a(double double1) {
		return double1 < 4096.0 && !this.j();
	}

	@Override
	public boolean g(double double1, double double2, double double3) {
		return super.g(double1, double2, double3) && !this.j();
	}

	public abg(ajs ajs, double double2, double double3, double double4, afj afj) {
		super(ajs);
		this.c = 0;
		this.a(0.25F, 0.25F);
		this.b(double2, double3, double4);
		int integer10 = 1;
		if (!afj.b() && afj.o()) {
			this.Y.b(a, afj.l());
			du du11 = afj.p();
			du du12 = du11.o("Fireworks");
			integer10 += du12.f("Flight");
		}

		this.s = this.S.nextGaussian() * 0.001;
		this.u = this.S.nextGaussian() * 0.001;
		this.t = 0.05;
		this.d = 10 * integer10 + this.S.nextInt(6) + this.S.nextInt(7);
	}

	public abg(ajs ajs, afj afj, sw sw) {
		this(ajs, sw.p, sw.q, sw.r, afj);
		this.Y.b(b, sw.O());
		this.e = sw;
	}

	@Override
	public void h(double double1, double double2, double double3) {
		this.s = double1;
		this.t = double2;
		this.u = double3;
		if (this.y == 0.0F && this.x == 0.0F) {
			float float8 = ot.a(double1 * double1 + double3 * double3);
			this.v = (float)(ot.c(double1, double3) * 180.0F / (float)Math.PI);
			this.w = (float)(ot.c(double2, (double)float8) * 180.0F / (float)Math.PI);
			this.x = this.v;
			this.y = this.w;
		}
	}

	@Override
	public void A_() {
		this.M = this.p;
		this.N = this.q;
		this.O = this.r;
		super.A_();
		if (this.j()) {
			if (this.e == null) {
				sn sn2 = this.l.a(this.Y.a(b));
				if (sn2 instanceof sw) {
					this.e = (sw)sn2;
				}
			}

			if (this.e != null) {
				if (this.e.cH()) {
					bdw bdw2 = this.e.aB();
					double double3 = 1.5;
					double double5 = 0.1;
					this.e.s = this.e.s + bdw2.b * 0.1 + (bdw2.b * 1.5 - this.e.s) * 0.5;
					this.e.t = this.e.t + bdw2.c * 0.1 + (bdw2.c * 1.5 - this.e.t) * 0.5;
					this.e.u = this.e.u + bdw2.d * 0.1 + (bdw2.d * 1.5 - this.e.u) * 0.5;
				}

				this.b(this.e.p, this.e.q, this.e.r);
				this.s = this.e.s;
				this.t = this.e.t;
				this.u = this.e.u;
			}
		} else {
			this.s *= 1.15;
			this.u *= 1.15;
			this.t += 0.04;
			this.a(tc.SELF, this.s, this.t, this.u);
		}

		float float2 = ot.a(this.s * this.s + this.u * this.u);
		this.v = (float)(ot.c(this.s, this.u) * 180.0F / (float)Math.PI);
		this.w = (float)(ot.c(this.t, (double)float2) * 180.0F / (float)Math.PI);

		while (this.w - this.y < -180.0F) {
			this.y -= 360.0F;
		}

		while (this.w - this.y >= 180.0F) {
			this.y += 360.0F;
		}

		while (this.v - this.x < -180.0F) {
			this.x -= 360.0F;
		}

		while (this.v - this.x >= 180.0F) {
			this.x += 360.0F;
		}

		this.w = this.y + (this.w - this.y) * 0.2F;
		this.v = this.x + (this.v - this.x) * 0.2F;
		if (this.c == 0 && !this.ad()) {
			this.l.a(null, this.p, this.q, this.r, nn.bC, no.AMBIENT, 3.0F, 1.0F);
		}

		this.c++;
		if (this.l.E && this.c % 2 < 2) {
			this.l.a(de.FIREWORKS_SPARK, this.p, this.q - 0.3, this.r, this.S.nextGaussian() * 0.05, -this.t * 0.5, this.S.nextGaussian() * 0.05);
		}

		if (!this.l.E && this.c > this.d) {
			this.l.a(this, (byte)17);
			this.k();
			this.T();
		}
	}

	private void k() {
		float float2 = 0.0F;
		afj afj3 = this.Y.a(a);
		du du4 = afj3.b() ? null : afj3.d("Fireworks");
		ea ea5 = du4 != null ? du4.c("Explosions", 10) : null;
		if (ea5 != null && !ea5.b_()) {
			float2 = (float)(5 + ea5.c() * 2);
		}

		if (float2 > 0.0F) {
			if (this.e != null) {
				this.e.a(ry.t, (float)(5 + ea5.c() * 2));
			}

			double double6 = 5.0;
			bdw bdw8 = new bdw(this.p, this.q, this.r);

			for (sw sw11 : this.l.a(sw.class, this.bo().g(5.0))) {
				if (sw11 != this.e && !(this.h(sw11) > 25.0)) {
					boolean boolean12 = false;

					for (int integer13 = 0; integer13 < 2; integer13++) {
						bdu bdu14 = this.l.a(bdw8, new bdw(sw11.p, sw11.q + (double)sw11.H * 0.5 * (double)integer13, sw11.r), false, true, false);
						if (bdu14 == null || bdu14.a == bdu.a.MISS) {
							boolean12 = true;
							break;
						}
					}

					if (boolean12) {
						float float13 = float2 * (float)Math.sqrt((5.0 - (double)this.g(sw11)) / 5.0);
						sw11.a(ry.t, float13);
					}
				}
			}
		}
	}

	public boolean j() {
		return this.Y.a(b) > 0;
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 17 && this.l.E) {
			afj afj3 = this.Y.a(a);
			du du4 = afj3.b() ? null : afj3.d("Fireworks");
			this.l.a(this.p, this.q, this.r, this.s, this.t, this.u, du4);
		}

		super.a(byte1);
	}

	public static void a(ph ph) {
		ph.a(pf.ENTITY, new qr(abg.class, "FireworksItem"));
	}

	@Override
	public void b(du du) {
		du.a("Life", this.c);
		du.a("LifeTime", this.d);
		afj afj3 = this.Y.a(a);
		if (!afj3.b()) {
			du.a("FireworksItem", afj3.a(new du()));
		}
	}

	@Override
	public void a(du du) {
		this.c = du.h("Life");
		this.d = du.h("LifeTime");
		du du3 = du.o("FireworksItem");
		if (du3 != null) {
			afj afj4 = new afj(du3);
			if (!afj4.b()) {
				this.Y.b(a, afj4);
			}
		}
	}

	@Override
	public boolean aV() {
		return false;
	}
}

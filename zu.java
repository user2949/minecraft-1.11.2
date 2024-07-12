import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;

public class zu extends aaa {
	protected static final kk<Byte> a = kn.a(zu.class, km.a);
	private int b;
	private int c;
	private xf bw;

	public zu(ajs ajs) {
		super(ajs);
		this.a(0.6F, 1.95F);
		this.b_ = 10;
	}

	@Override
	protected void r() {
		super.r();
		this.bq.a(0, new uf(this));
		this.bq.a(1, new zu.b());
		this.bq.a(2, new ty(this, aay.class, 8.0F, 0.6, 1.0));
		this.bq.a(4, new zu.c());
		this.bq.a(5, new zu.a());
		this.bq.a(6, new zu.e());
		this.bq.a(8, new vf(this, 0.6));
		this.bq.a(9, new uo(this, aay.class, 3.0F, 1.0F));
		this.bq.a(10, new uo(this, sx.class, 8.0F));
		this.br.a(1, new vv(this, true, zu.class));
		this.br.a(2, new vy(this, aay.class, true).b(300));
		this.br.a(3, new vy(this, aat.class, false).b(300));
		this.br.a(3, new vy(this, xi.class, false));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.d).a(0.5);
		this.a(aad.b).a(12.0);
		this.a(aad.a).a(24.0);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, (byte)0);
	}

	public static void a(ph ph) {
		sx.a(ph, zu.class);
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.b = du.h("SpellTicks");
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("SpellTicks", this.b);
	}

	@Override
	public tb cf() {
		return tb.ILLAGER;
	}

	@Override
	protected kq J() {
		return bcf.au;
	}

	public boolean o() {
		return this.l.E ? this.Y.a(a) > 0 : this.b > 0;
	}

	public void a(int integer) {
		this.Y.b(a, (byte)integer);
	}

	private int di() {
		return this.b;
	}

	@Override
	protected void M() {
		super.M();
		if (this.b > 0) {
			this.b--;
		}
	}

	@Override
	public void A_() {
		super.A_();
		if (this.l.E && this.o()) {
			int integer2 = this.Y.a(a);
			double double3 = 0.7;
			double double5 = 0.5;
			double double7 = 0.2;
			if (integer2 == 2) {
				double3 = 0.4;
				double5 = 0.3;
				double7 = 0.35;
			} else if (integer2 == 1) {
				double3 = 0.7;
				double5 = 0.7;
				double7 = 0.8;
			}

			float float9 = this.aN * (float) (Math.PI / 180.0) + ot.b((float)this.T * 0.6662F) * 0.25F;
			float float10 = ot.b(float9);
			float float11 = ot.a(float9);
			this.l.a(de.SPELL_MOB, this.p + (double)float10 * 0.6, this.q + 1.8, this.r + (double)float11 * 0.6, double3, double5, double7);
			this.l.a(de.SPELL_MOB, this.p - (double)float10 * 0.6, this.q + 1.8, this.r - (double)float11 * 0.6, double3, double5, double7);
		}
	}

	@Override
	public boolean r(sn sn) {
		if (sn == null) {
			return false;
		} else if (sn == this) {
			return true;
		} else if (super.r(sn)) {
			return true;
		} else if (sn instanceof aak) {
			return this.r(((aak)sn).o());
		} else {
			return sn instanceof sw && ((sw)sn).cf() == tb.ILLAGER ? this.aQ() == null && sn.aQ() == null : false;
		}
	}

	@Override
	protected nm G() {
		return nn.bm;
	}

	@Override
	protected nm bX() {
		return nn.bo;
	}

	@Override
	protected nm bW() {
		return nn.bp;
	}

	private void a(@Nullable xf xf) {
		this.bw = xf;
	}

	@Nullable
	private xf dj() {
		return this.bw;
	}

	class a extends zu.d {
		private a() {
		}

		@Override
		protected int f() {
			return 40;
		}

		@Override
		protected int i() {
			return 100;
		}

		@Override
		protected void j() {
			sw sw2 = zu.this.z();
			double double3 = Math.min(sw2.q, zu.this.q);
			double double5 = Math.max(sw2.q, zu.this.q) + 1.0;
			float float7 = (float)ot.c(sw2.r - zu.this.r, sw2.p - zu.this.p);
			if (zu.this.h(sw2) < 9.0) {
				for (int integer8 = 0; integer8 < 5; integer8++) {
					float float9 = float7 + (float)integer8 * (float) Math.PI * 0.4F;
					this.a(zu.this.p + (double)ot.b(float9) * 1.5, zu.this.r + (double)ot.a(float9) * 1.5, double3, double5, float9, 0);
				}

				for (int integer8 = 0; integer8 < 8; integer8++) {
					float float9 = float7 + (float)integer8 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
					this.a(zu.this.p + (double)ot.b(float9) * 2.5, zu.this.r + (double)ot.a(float9) * 2.5, double3, double5, float9, 3);
				}
			} else {
				for (int integer8 = 0; integer8 < 16; integer8++) {
					double double9 = 1.25 * (double)(integer8 + 1);
					int integer11 = 1 * integer8;
					this.a(zu.this.p + (double)ot.b(float7) * double9, zu.this.r + (double)ot.a(float7) * double9, double3, double5, float7, integer11);
				}
			}
		}

		private void a(double double1, double double2, double double3, double double4, float float5, int integer) {
			co co12 = new co(double1, double4, double2);
			boolean boolean13 = false;
			double double14 = 0.0;

			do {
				if (!zu.this.l.d(co12, true) && zu.this.l.d(co12.b(), true)) {
					if (!zu.this.l.d(co12)) {
						atl atl16 = zu.this.l.o(co12);
						bdt bdt17 = atl16.c((ajw)zu.this.l, co12);
						if (bdt17 != null) {
							double14 = bdt17.e;
						}
					}

					boolean13 = true;
					break;
				}

				co12 = co12.b();
			} while (co12.q() >= ot.c(double3) - 1);

			if (boolean13) {
				abd abd16 = new abd(zu.this.l, double1, (double)co12.q() + double14, double2, float5, integer, zu.this);
				zu.this.l.a(abd16);
			}
		}

		@Override
		protected nm k() {
			return nn.bq;
		}

		@Override
		protected int l() {
			return 2;
		}
	}

	class b extends ui {
		public b() {
			this.a(3);
		}

		@Override
		public boolean a() {
			return zu.this.di() > 0;
		}

		@Override
		public void c() {
			super.c();
			zu.this.a(zu.this.c);
			zu.this.h.o();
		}

		@Override
		public void d() {
			super.d();
			zu.this.a(0);
		}

		@Override
		public void e() {
			if (zu.this.z() != null) {
				zu.this.t().a(zu.this.z(), (float)zu.this.cL(), (float)zu.this.N());
			} else if (zu.this.dj() != null) {
				zu.this.t().a(zu.this.dj(), (float)zu.this.cL(), (float)zu.this.N());
			}
		}
	}

	class c extends zu.d {
		private c() {
		}

		@Override
		public boolean a() {
			if (!super.a()) {
				return false;
			} else {
				int integer2 = zu.this.l.a(aak.class, zu.this.bo().g(16.0)).size();
				return zu.this.S.nextInt(8) + 1 > integer2;
			}
		}

		@Override
		protected int f() {
			return 100;
		}

		@Override
		protected int i() {
			return 340;
		}

		@Override
		protected void j() {
			for (int integer2 = 0; integer2 < 3; integer2++) {
				co co3 = new co(zu.this).a(-2 + zu.this.S.nextInt(5), 1, -2 + zu.this.S.nextInt(5));
				aak aak4 = new aak(zu.this.l);
				aak4.a(co3, 0.0F, 0.0F);
				aak4.a(zu.this.l.D(co3), null);
				aak4.a(zu.this);
				aak4.g(co3);
				aak4.a(20 * (30 + zu.this.S.nextInt(90)));
				zu.this.l.a(aak4);
			}
		}

		@Override
		protected nm k() {
			return nn.br;
		}

		@Override
		protected int l() {
			return 1;
		}
	}

	abstract class d extends ui {
		protected int b;
		protected int c;

		private d() {
		}

		@Override
		public boolean a() {
			if (zu.this.z() == null) {
				return false;
			} else {
				return zu.this.o() ? false : zu.this.T >= this.c;
			}
		}

		@Override
		public boolean b() {
			return zu.this.z() != null && this.b > 0;
		}

		@Override
		public void c() {
			this.b = this.m();
			zu.this.b = this.f();
			this.c = zu.this.T + this.i();
			zu.this.a(this.k(), 1.0F, 1.0F);
			zu.this.c = this.l();
		}

		@Override
		public void e() {
			this.b--;
			if (this.b == 0) {
				this.j();
				zu.this.a(nn.bn, 1.0F, 1.0F);
			}
		}

		protected abstract void j();

		protected int m() {
			return 20;
		}

		protected abstract int f();

		protected abstract int i();

		protected abstract nm k();

		protected abstract int l();
	}

	public class e extends zu.d {
		final Predicate<xf> a = new Predicate<xf>() {
			public boolean apply(xf xf) {
				return xf.dh() == aem.BLUE;
			}
		};

		@Override
		public boolean a() {
			if (zu.this.z() != null) {
				return false;
			} else if (zu.this.o()) {
				return false;
			} else if (zu.this.T < this.c) {
				return false;
			} else if (!zu.this.l.U().b("mobGriefing")) {
				return false;
			} else {
				List<xf> list2 = zu.this.l.a(xf.class, zu.this.bo().c(16.0, 4.0, 16.0), this.a);
				if (list2.isEmpty()) {
					return false;
				} else {
					zu.this.a((xf)list2.get(zu.this.S.nextInt(list2.size())));
					return true;
				}
			}
		}

		@Override
		public boolean b() {
			return zu.this.dj() != null && this.b > 0;
		}

		@Override
		public void d() {
			super.d();
			zu.this.a(null);
		}

		@Override
		protected void j() {
			xf xf2 = zu.this.dj();
			if (xf2 != null && xf2.au()) {
				xf2.b(aem.RED);
			}
		}

		@Override
		protected int m() {
			return 40;
		}

		@Override
		protected int f() {
			return 60;
		}

		@Override
		protected int i() {
			return 140;
		}

		@Override
		protected nm k() {
			return nn.bs;
		}

		@Override
		protected int l() {
			return 3;
		}
	}
}

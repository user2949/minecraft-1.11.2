import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class zr extends aaa {
	private static final UUID a = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
	private static final tl b = new tl(a, "Attacking speed boost", 0.15F, 0).a(false);
	private static final Set<alu> c = Sets.newIdentityHashSet();
	private static final kk<Optional<atl>> bw = kn.a(zr.class, km.g);
	private static final kk<Boolean> bx = kn.a(zr.class, km.h);
	private int by;
	private int bz;

	public zr(ajs ajs) {
		super(ajs);
		this.a(0.6F, 2.9F);
		this.P = 1.0F;
		this.a(bba.WATER, -1.0F);
	}

	@Override
	protected void r() {
		this.bq.a(0, new uf(this));
		this.bq.a(2, new ur(this, 1.0, false));
		this.bq.a(7, new vr(this, 1.0, 0.0F));
		this.bq.a(8, new uo(this, aay.class, 8.0F));
		this.bq.a(8, new ve(this));
		this.bq.a(10, new zr.a(this));
		this.bq.a(11, new zr.c(this));
		this.br.a(1, new zr.b(this));
		this.br.a(2, new vv(this, false));
		this.br.a(3, new vy(this, zs.class, 10, true, false, new Predicate<zs>() {
			public boolean apply(@Nullable zs zs) {
				return zs.o();
			}
		}));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(40.0);
		this.a(aad.d).a(0.3F);
		this.a(aad.e).a(7.0);
		this.a(aad.b).a(64.0);
	}

	@Override
	public void d(@Nullable sw sw) {
		super.d(sw);
		tk tk3 = this.a(aad.d);
		if (sw == null) {
			this.bz = 0;
			this.Y.b(bx, false);
			tk3.c(b);
		} else {
			this.bz = this.T;
			this.Y.b(bx, true);
			if (!tk3.a(b)) {
				tk3.b(b);
			}
		}
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bw, Optional.absent());
		this.Y.a(bx, false);
	}

	@Override
	public void o() {
		if (this.T >= this.by + 400) {
			this.by = this.T;
			if (!this.ad()) {
				this.l.a(this.p, this.q + (double)this.bq(), this.r, nn.bd, this.bC(), 2.5F, 1.0F, false);
			}
		}
	}

	@Override
	public void a(kk<?> kk) {
		if (bx.equals(kk) && this.dk() && this.l.E) {
			this.o();
		}

		super.a(kk);
	}

	public static void a(ph ph) {
		sx.a(ph, zr.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		atl atl3 = this.dj();
		if (atl3 != null) {
			du.a("carried", (short)alu.a(atl3.v()));
			du.a("carriedData", (short)atl3.v().e(atl3));
		}
	}

	@Override
	public void a(du du) {
		super.a(du);
		atl atl3;
		if (du.b("carried", 8)) {
			atl3 = alu.b(du.l("carried")).a(du.g("carriedData") & '\uffff');
		} else {
			atl3 = alu.b(du.g("carried")).a(du.g("carriedData") & '\uffff');
		}

		if (atl3 == null || atl3.v() == null || atl3.a() == azs.a) {
			atl3 = null;
		}

		this.a(atl3);
	}

	private boolean c(aay aay) {
		afj afj3 = aay.bs.b.get(3);
		if (afj3.c() == afh.a(alv.aU)) {
			return false;
		} else {
			bdw bdw4 = aay.f(1.0F).a();
			bdw bdw5 = new bdw(this.p - aay.p, this.bo().b + (double)this.bq() - (aay.q + (double)aay.bq()), this.r - aay.r);
			double double6 = bdw5.b();
			bdw5 = bdw5.a();
			double double8 = bdw4.b(bdw5);
			return double8 > 1.0 - 0.025 / double6 ? aay.D(this) : false;
		}
	}

	@Override
	public float bq() {
		return 2.55F;
	}

	@Override
	public void n() {
		if (this.l.E) {
			for (int integer2 = 0; integer2 < 2; integer2++) {
				this.l
					.a(
						de.PORTAL,
						this.p + (this.S.nextDouble() - 0.5) * (double)this.G,
						this.q + this.S.nextDouble() * (double)this.H - 0.25,
						this.r + (this.S.nextDouble() - 0.5) * (double)this.G,
						(this.S.nextDouble() - 0.5) * 2.0,
						-this.S.nextDouble(),
						(this.S.nextDouble() - 0.5) * 2.0
					);
			}
		}

		this.bd = false;
		super.n();
	}

	@Override
	protected void M() {
		if (this.ai()) {
			this.a(ry.h, 1.0F);
		}

		if (this.l.B() && this.T >= this.bz + 600) {
			float float2 = this.e(1.0F);
			if (float2 > 0.5F && this.l.h(new co(this)) && this.S.nextFloat() * 30.0F < (float2 - 0.4F) * 2.0F) {
				this.d(null);
				this.di();
			}
		}

		super.M();
	}

	protected boolean di() {
		double double2 = this.p + (this.S.nextDouble() - 0.5) * 64.0;
		double double4 = this.q + (double)(this.S.nextInt(64) - 32);
		double double6 = this.r + (this.S.nextDouble() - 0.5) * 64.0;
		return this.k(double2, double4, double6);
	}

	protected boolean a(sn sn) {
		bdw bdw3 = new bdw(this.p - sn.p, this.bo().b + (double)(this.H / 2.0F) - sn.q + (double)sn.bq(), this.r - sn.r);
		bdw3 = bdw3.a();
		double double4 = 16.0;
		double double6 = this.p + (this.S.nextDouble() - 0.5) * 8.0 - bdw3.b * 16.0;
		double double8 = this.q + (double)(this.S.nextInt(16) - 8) - bdw3.c * 16.0;
		double double10 = this.r + (this.S.nextDouble() - 0.5) * 8.0 - bdw3.d * 16.0;
		return this.k(double6, double8, double10);
	}

	private boolean k(double double1, double double2, double double3) {
		boolean boolean8 = this.j(double1, double2, double3);
		if (boolean8) {
			this.l.a(null, this.m, this.n, this.o, nn.be, this.bC(), 1.0F, 1.0F);
			this.a(nn.be, 1.0F, 1.0F);
		}

		return boolean8;
	}

	@Override
	protected nm G() {
		return this.dk() ? nn.bc : nn.aZ;
	}

	@Override
	protected nm bW() {
		return nn.bb;
	}

	@Override
	protected nm bX() {
		return nn.ba;
	}

	@Override
	protected void a(boolean boolean1, int integer) {
		super.a(boolean1, integer);
		atl atl4 = this.dj();
		if (atl4 != null) {
			afh afh5 = afh.a(atl4.v());
			int integer6 = afh5.l() ? atl4.v().e(atl4) : 0;
			this.a(new afj(afh5, 1, integer6), 0.0F);
		}
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.w;
	}

	public void a(@Nullable atl atl) {
		this.Y.b(bw, Optional.fromNullable(atl));
	}

	@Nullable
	public atl dj() {
		return (atl)this.Y.a(bw).orNull();
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else if (ry instanceof sa) {
			for (int integer4 = 0; integer4 < 64; integer4++) {
				if (this.di()) {
					return true;
				}
			}

			return false;
		} else {
			boolean boolean4 = super.a(ry, float2);
			if (ry.e() && this.S.nextInt(10) != 0) {
				this.di();
			}

			return boolean4;
		}
	}

	public boolean dk() {
		return this.Y.a(bx);
	}

	static {
		c.add(alv.c);
		c.add(alv.d);
		c.add(alv.m);
		c.add(alv.n);
		c.add(alv.N);
		c.add(alv.O);
		c.add(alv.P);
		c.add(alv.Q);
		c.add(alv.W);
		c.add(alv.aK);
		c.add(alv.aL);
		c.add(alv.aU);
		c.add(alv.bk);
		c.add(alv.bw);
		c.add(alv.aV);
	}

	static class a extends ui {
		private final zr a;

		public a(zr zr) {
			this.a = zr;
		}

		@Override
		public boolean a() {
			if (this.a.dj() == null) {
				return false;
			} else {
				return !this.a.l.U().b("mobGriefing") ? false : this.a.bJ().nextInt(2000) == 0;
			}
		}

		@Override
		public void e() {
			Random random2 = this.a.bJ();
			ajs ajs3 = this.a.l;
			int integer4 = ot.c(this.a.p - 1.0 + random2.nextDouble() * 2.0);
			int integer5 = ot.c(this.a.q + random2.nextDouble() * 2.0);
			int integer6 = ot.c(this.a.r - 1.0 + random2.nextDouble() * 2.0);
			co co7 = new co(integer4, integer5, integer6);
			atl atl8 = ajs3.o(co7);
			atl atl9 = ajs3.o(co7.b());
			atl atl10 = this.a.dj();
			if (atl10 != null && this.a(ajs3, co7, atl10.v(), atl8, atl9)) {
				ajs3.a(co7, atl10, 3);
				this.a.a(null);
			}
		}

		private boolean a(ajs ajs, co co, alu alu, atl atl4, atl atl5) {
			if (!alu.a(ajs, co)) {
				return false;
			} else if (atl4.a() != azs.a) {
				return false;
			} else {
				return atl5.a() == azs.a ? false : atl5.h();
			}
		}
	}

	static class b extends vy<aay> {
		private final zr i;
		private aay j;
		private int k;
		private int l;

		public b(zr zr) {
			super(zr, aay.class, false);
			this.i = zr;
		}

		@Override
		public boolean a() {
			double double2 = this.i();
			this.j = this.i.l.a(this.i.p, this.i.q, this.i.r, double2, double2, null, new Predicate<aay>() {
				public boolean apply(@Nullable aay aay) {
					return aay != null && b.this.i.c(aay);
				}
			});
			return this.j != null;
		}

		@Override
		public void c() {
			this.k = 5;
			this.l = 0;
		}

		@Override
		public void d() {
			this.j = null;
			super.d();
		}

		@Override
		public boolean b() {
			if (this.j != null) {
				if (!this.i.c(this.j)) {
					return false;
				} else {
					this.i.a(this.j, 10.0F, 10.0F);
					return true;
				}
			} else {
				return this.d != null && this.d.au() ? true : super.b();
			}
		}

		@Override
		public void e() {
			if (this.j != null) {
				if (--this.k <= 0) {
					this.d = this.j;
					this.j = null;
					super.c();
				}
			} else {
				if (this.d != null) {
					if (this.i.c(this.d)) {
						if (this.d.h(this.i) < 16.0) {
							this.i.di();
						}

						this.l = 0;
					} else if (this.d.h(this.i) > 256.0 && this.l++ >= 30 && this.i.a(this.d)) {
						this.l = 0;
					}
				}

				super.e();
			}
		}
	}

	static class c extends ui {
		private final zr a;

		public c(zr zr) {
			this.a = zr;
		}

		@Override
		public boolean a() {
			if (this.a.dj() != null) {
				return false;
			} else {
				return !this.a.l.U().b("mobGriefing") ? false : this.a.bJ().nextInt(20) == 0;
			}
		}

		@Override
		public void e() {
			Random random2 = this.a.bJ();
			ajs ajs3 = this.a.l;
			int integer4 = ot.c(this.a.p - 2.0 + random2.nextDouble() * 4.0);
			int integer5 = ot.c(this.a.q + random2.nextDouble() * 3.0);
			int integer6 = ot.c(this.a.r - 2.0 + random2.nextDouble() * 4.0);
			co co7 = new co(integer4, integer5, integer6);
			atl atl8 = ajs3.o(co7);
			alu alu9 = atl8.v();
			bdu bdu10 = ajs3.a(
				new bdw((double)((float)ot.c(this.a.p) + 0.5F), (double)((float)integer5 + 0.5F), (double)((float)ot.c(this.a.r) + 0.5F)),
				new bdw((double)((float)integer4 + 0.5F), (double)((float)integer5 + 0.5F), (double)((float)integer6 + 0.5F)),
				false,
				true,
				false
			);
			boolean boolean11 = bdu10 != null && bdu10.a().equals(co7);
			if (zr.c.contains(alu9) && boolean11) {
				this.a.a(atl8);
				ajs3.g(co7);
			}
		}
	}
}

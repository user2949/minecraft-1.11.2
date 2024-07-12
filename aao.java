import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class aao extends aaa {
	protected static final tj a = new tq(null, "zombie.spawnReinforcements", 0.0, 0.0, 1.0).a("Spawn Reinforcements Chance");
	private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
	private static final tl c = new tl(b, "Baby speed boost", 0.5, 1);
	private static final kk<Boolean> bw = kn.a(aao.class, km.h);
	private static final kk<Integer> bx = kn.a(aao.class, km.b);
	private static final kk<Boolean> by = kn.a(aao.class, km.h);
	private final ua bz = new ua(this);
	private boolean bA;
	private float bB = -1.0F;
	private float bC;

	public aao(ajs ajs) {
		super(ajs);
		this.a(0.6F, 1.95F);
	}

	@Override
	protected void r() {
		this.bq.a(0, new uf(this));
		this.bq.a(2, new vs(this, 1.0, false));
		this.bq.a(5, new uv(this, 1.0));
		this.bq.a(7, new vr(this, 1.0));
		this.bq.a(8, new uo(this, aay.class, 8.0F));
		this.bq.a(8, new ve(this));
		this.dk();
	}

	protected void dk() {
		this.bq.a(6, new ut(this, 1.0, false));
		this.br.a(1, new vv(this, true, aab.class));
		this.br.a(2, new vy(this, aay.class, true));
		this.br.a(3, new vy(this, aat.class, false));
		this.br.a(3, new vy(this, xi.class, true));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.b).a(35.0);
		this.a(aad.d).a(0.23F);
		this.a(aad.e).a(3.0);
		this.a(aad.g).a(2.0);
		this.ce().b(a).a(this.S.nextDouble() * 0.1F);
	}

	@Override
	protected void i() {
		super.i();
		this.R().a(bw, false);
		this.R().a(bx, 0);
		this.R().a(by, false);
	}

	public void a(boolean boolean1) {
		this.R().b(by, boolean1);
	}

	public boolean dm() {
		return this.R().a(by);
	}

	public boolean dn() {
		return this.bA;
	}

	public void p(boolean boolean1) {
		if (this.bA != boolean1) {
			this.bA = boolean1;
			((we)this.x()).a(boolean1);
			if (boolean1) {
				this.bq.a(1, this.bz);
			} else {
				this.bq.a(this.bz);
			}
		}
	}

	@Override
	public boolean l_() {
		return this.R().a(bw);
	}

	@Override
	protected int b(aay aay) {
		if (this.l_()) {
			this.b_ = (int)((float)this.b_ * 2.5F);
		}

		return super.b(aay);
	}

	public void q(boolean boolean1) {
		this.R().b(bw, boolean1);
		if (this.l != null && !this.l.E) {
			tk tk3 = this.a(aad.d);
			tk3.c(c);
			if (boolean1) {
				tk3.b(c);
			}
		}

		this.r(boolean1);
	}

	@Override
	public void a(kk<?> kk) {
		if (bw.equals(kk)) {
			this.r(this.l_());
		}

		super.a(kk);
	}

	@Override
	public void n() {
		if (this.l.B() && !this.l.E && !this.l_() && this.o()) {
			float float2 = this.e(1.0F);
			if (float2 > 0.5F && this.S.nextFloat() * 30.0F < (float2 - 0.4F) * 2.0F && this.l.h(new co(this.p, this.q + (double)this.bq(), this.r))) {
				boolean boolean3 = true;
				afj afj4 = this.b(ss.HEAD);
				if (!afj4.b()) {
					if (afj4.f()) {
						afj4.b(afj4.i() + this.S.nextInt(2));
						if (afj4.i() >= afj4.k()) {
							this.b(afj4);
							this.a(ss.HEAD, afj.a);
						}
					}

					boolean3 = false;
				}

				if (boolean3) {
					this.i(8);
				}
			}
		}

		super.n();
	}

	protected boolean o() {
		return true;
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (super.a(ry, float2)) {
			sw sw4 = this.z();
			if (sw4 == null && ry.j() instanceof sw) {
				sw4 = (sw)ry.j();
			}

			if (sw4 != null && this.l.ae() == rg.HARD && (double)this.S.nextFloat() < this.a(a).e() && this.l.U().b("doMobSpawning")) {
				int integer5 = ot.c(this.p);
				int integer6 = ot.c(this.q);
				int integer7 = ot.c(this.r);
				aao aao8 = new aao(this.l);

				for (int integer9 = 0; integer9 < 50; integer9++) {
					int integer10 = integer5 + ot.a(this.S, 7, 40) * ot.a(this.S, -1, 1);
					int integer11 = integer6 + ot.a(this.S, 7, 40) * ot.a(this.S, -1, 1);
					int integer12 = integer7 + ot.a(this.S, 7, 40) * ot.a(this.S, -1, 1);
					if (this.l.o(new co(integer10, integer11 - 1, integer12)).r() && this.l.k(new co(integer10, integer11, integer12)) < 10) {
						aao8.b((double)integer10, (double)integer11, (double)integer12);
						if (!this.l.a((double)integer10, (double)integer11, (double)integer12, 7.0)
							&& this.l.a(aao8.bo(), aao8)
							&& this.l.a(aao8, aao8.bo()).isEmpty()
							&& !this.l.d(aao8.bo())) {
							this.l.a(aao8);
							aao8.d(sw4);
							aao8.a(this.l.D(new co(aao8)), null);
							this.a(a).b(new tl("Zombie reinforcement caller charge", -0.05F, 0));
							aao8.a(a).b(new tl("Zombie reinforcement callee charge", -0.05F, 0));
							break;
						}
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean B(sn sn) {
		boolean boolean3 = super.B(sn);
		if (boolean3) {
			float float4 = this.l.D(new co(this)).b();
			if (this.cg().b() && this.aJ() && this.S.nextFloat() < float4 * 0.3F) {
				sn.i(2 * (int)float4);
			}
		}

		return boolean3;
	}

	@Override
	protected nm G() {
		return nn.ie;
	}

	@Override
	protected nm bW() {
		return nn.im;
	}

	@Override
	protected nm bX() {
		return nn.ii;
	}

	protected nm di() {
		return nn.is;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(this.di(), 0.15F, 1.0F);
	}

	@Override
	public tb cf() {
		return tb.UNDEAD;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.am;
	}

	@Override
	protected void a(rh rh) {
		super.a(rh);
		if (this.S.nextFloat() < (this.l.ae() == rg.HARD ? 0.05F : 0.01F)) {
			int integer3 = this.S.nextInt(3);
			if (integer3 == 0) {
				this.a(ss.MAINHAND, new afj(afl.o));
			} else {
				this.a(ss.MAINHAND, new afj(afl.b));
			}
		}
	}

	public static void c(ph ph) {
		sx.a(ph, aao.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		if (this.l_()) {
			du.a("IsBaby", true);
		}

		du.a("CanBreakDoors", this.dn());
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.p("IsBaby")) {
			this.q(true);
		}

		this.p(du.p("CanBreakDoors"));
	}

	@Override
	public void b(sw sw) {
		super.b(sw);
		if ((this.l.ae() == rg.NORMAL || this.l.ae() == rg.HARD) && sw instanceof aat) {
			if (this.l.ae() != rg.HARD && this.S.nextBoolean()) {
				return;
			}

			aat aat3 = (aat)sw;
			aap aap4 = new aap(this.l);
			aap4.u(aat3);
			this.l.e(aat3);
			aap4.a(this.l.D(new co(aap4)), new aao.a(false));
			aap4.a(aat3.dh());
			aap4.q(aat3.l_());
			aap4.n(aat3.cY());
			if (aat3.n_()) {
				aap4.c(aat3.bi());
				aap4.j(aat3.bj());
			}

			this.l.a(aap4);
			this.l.a(null, 1026, new co(this), 0);
		}
	}

	@Override
	public float bq() {
		float float2 = 1.74F;
		if (this.l_()) {
			float2 = (float)((double)float2 - 0.81);
		}

		return float2;
	}

	@Override
	protected boolean c(afj afj) {
		return afj.c() == afl.aX && this.l_() && this.aK() ? false : super.c(afj);
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz = super.a(rh, sz);
		float float4 = rh.d();
		this.m(this.S.nextFloat() < 0.55F * float4);
		if (sz == null) {
			sz = new aao.a(this.l.r.nextFloat() < 0.05F);
		}

		if (sz instanceof aao.a) {
			aao.a a5 = (aao.a)sz;
			if (a5.a) {
				this.q(true);
				if ((double)this.l.r.nextFloat() < 0.05) {
					List<wx> list6 = this.l.a(wx.class, this.bo().c(5.0, 3.0, 5.0), sr.b);
					if (!list6.isEmpty()) {
						wx wx7 = (wx)list6.get(0);
						wx7.p(true);
						this.m(wx7);
					}
				} else if ((double)this.l.r.nextFloat() < 0.05) {
					wx wx6 = new wx(this.l);
					wx6.b(this.p, this.q, this.r, this.v, 0.0F);
					wx6.a(rh, null);
					wx6.p(true);
					this.l.a(wx6);
					this.m(wx6);
				}
			}
		}

		this.p(this.S.nextFloat() < float4 * 0.1F);
		this.a(rh);
		this.b(rh);
		if (this.b(ss.HEAD).b()) {
			Calendar calendar5 = this.l.ac();
			if (calendar5.get(2) + 1 == 10 && calendar5.get(5) == 31 && this.S.nextFloat() < 0.25F) {
				this.a(ss.HEAD, new afj(this.S.nextFloat() < 0.1F ? alv.aZ : alv.aU));
				this.bt[ss.HEAD.b()] = 0.0F;
			}
		}

		this.a(aad.c).b(new tl("Random spawn bonus", this.S.nextDouble() * 0.05F, 0));
		double double5 = this.S.nextDouble() * 1.5 * (double)float4;
		if (double5 > 1.0) {
			this.a(aad.b).b(new tl("Random zombie-spawn bonus", double5, 2));
		}

		if (this.S.nextFloat() < float4 * 0.05F) {
			this.a(a).b(new tl("Leader zombie bonus", this.S.nextDouble() * 0.25 + 0.5, 0));
			this.a(aad.a).b(new tl("Leader zombie bonus", this.S.nextDouble() * 3.0 + 1.0, 2));
			this.p(true);
		}

		return sz;
	}

	public void r(boolean boolean1) {
		this.a(boolean1 ? 0.5F : 1.0F);
	}

	@Override
	protected final void a(float float1, float float2) {
		boolean boolean4 = this.bB > 0.0F && this.bC > 0.0F;
		this.bB = float1;
		this.bC = float2;
		if (!boolean4) {
			this.a(1.0F);
		}
	}

	protected final void a(float float1) {
		super.a(this.bB * float1, this.bC * float1);
	}

	@Override
	public double ax() {
		return this.l_() ? 0.0 : -0.45;
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (ry.j() instanceof zp) {
			zp zp3 = (zp)ry.j();
			if (zp3.o() && zp3.dl()) {
				zp3.dm();
				afj afj4 = this.dj();
				if (!afj4.b()) {
					this.a(afj4, 0.0F);
				}
			}
		}
	}

	protected afj dj() {
		return new afj(afl.ci, 1, 2);
	}

	class a implements sz {
		public boolean a;

		private a(boolean boolean2) {
			this.a = boolean2;
		}
	}
}

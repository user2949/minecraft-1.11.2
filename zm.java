import java.util.Calendar;
import javax.annotation.Nullable;

public abstract class zm extends aaa implements aac {
	private static final kk<Boolean> a = kn.a(zm.class, km.h);
	private final vh b = new vh(this, 1.0, 20, 15.0F);
	private final ur c = new ur(this, 1.2, false) {
		@Override
		public void d() {
			super.d();
			zm.this.a(false);
		}

		@Override
		public void c() {
			super.c();
			zm.this.a(true);
		}
	};

	public zm(ajs ajs) {
		super(ajs);
		this.a(0.6F, 1.99F);
		this.dh();
	}

	@Override
	protected void r() {
		this.bq.a(1, new uf(this));
		this.bq.a(2, new vj(this));
		this.bq.a(3, new ue(this, 1.0));
		this.bq.a(3, new ty(this, xk.class, 6.0F, 1.0, 1.2));
		this.bq.a(5, new vr(this, 1.0));
		this.bq.a(6, new uo(this, aay.class, 8.0F));
		this.bq.a(6, new ve(this));
		this.br.a(1, new vv(this, false));
		this.br.a(2, new vy(this, aay.class, true));
		this.br.a(3, new vy(this, xi.class, true));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.d).a(0.25);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, false);
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(this.o(), 0.15F, 1.0F);
	}

	abstract nm o();

	@Override
	public tb cf() {
		return tb.UNDEAD;
	}

	@Override
	public void n() {
		if (this.l.B() && !this.l.E) {
			float float2 = this.e(1.0F);
			co co3 = this.bB() instanceof abx ? new co(this.p, (double)Math.round(this.q), this.r).a() : new co(this.p, (double)Math.round(this.q), this.r);
			if (float2 > 0.5F && this.S.nextFloat() * 30.0F < (float2 - 0.4F) * 2.0F && this.l.h(co3)) {
				boolean boolean4 = true;
				afj afj5 = this.b(ss.HEAD);
				if (!afj5.b()) {
					if (afj5.f()) {
						afj5.b(afj5.i() + this.S.nextInt(2));
						if (afj5.i() >= afj5.k()) {
							this.b(afj5);
							this.a(ss.HEAD, afj.a);
						}
					}

					boolean4 = false;
				}

				if (boolean4) {
					this.i(8);
				}
			}
		}

		super.n();
	}

	@Override
	public void aw() {
		super.aw();
		if (this.bB() instanceof te) {
			te te2 = (te)this.bB();
			this.aN = te2.aN;
		}
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		if (ry.i() instanceof abb && ry.j() instanceof aay) {
			aay aay3 = (aay)ry.j();
			double double4 = aay3.p - this.p;
			double double6 = aay3.r - this.r;
			if (double4 * double4 + double6 * double6 >= 2500.0) {
				aay3.b(nr.v);
			}
		}
	}

	@Override
	protected void a(rh rh) {
		super.a(rh);
		this.a(ss.MAINHAND, new afj(afl.g));
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz = super.a(rh, sz);
		this.a(rh);
		this.b(rh);
		this.dh();
		this.m(this.S.nextFloat() < 0.55F * rh.d());
		if (this.b(ss.HEAD).b()) {
			Calendar calendar4 = this.l.ac();
			if (calendar4.get(2) + 1 == 10 && calendar4.get(5) == 31 && this.S.nextFloat() < 0.25F) {
				this.a(ss.HEAD, new afj(this.S.nextFloat() < 0.1F ? alv.aZ : alv.aU));
				this.bt[ss.HEAD.b()] = 0.0F;
			}
		}

		return sz;
	}

	public void dh() {
		if (this.l != null && !this.l.E) {
			this.bq.a(this.c);
			this.bq.a(this.b);
			afj afj2 = this.cg();
			if (afj2.c() == afl.g) {
				int integer3 = 20;
				if (this.l.ae() != rg.HARD) {
					integer3 = 40;
				}

				this.b.b(integer3);
				this.bq.a(4, this.b);
			} else {
				this.bq.a(4, this.c);
			}
		}
	}

	@Override
	public void a(sw sw, float float2) {
		abb abb4 = this.a(float2);
		double double5 = sw.p - this.p;
		double double7 = sw.bo().b + (double)(sw.H / 3.0F) - abb4.q;
		double double9 = sw.r - this.r;
		double double11 = (double)ot.a(double5 * double5 + double9 * double9);
		abb4.c(double5, double7 + double11 * 0.2F, double9, 1.6F, (float)(14 - this.l.ae().a() * 4));
		this.a(nn.fV, 1.0F, 1.0F / (this.bJ().nextFloat() * 0.4F + 0.8F));
		this.l.a(abb4);
	}

	protected abb a(float float1) {
		abu abu3 = new abu(this.l, this);
		abu3.a(this, float1);
		return abu3;
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.dh();
	}

	@Override
	public void a(ss ss, afj afj) {
		super.a(ss, afj);
		if (!this.l.E && ss == ss.MAINHAND) {
			this.dh();
		}
	}

	@Override
	public float bq() {
		return 1.74F;
	}

	@Override
	public double ax() {
		return -0.6;
	}

	public boolean di() {
		return this.Y.a(a);
	}

	public void a(boolean boolean1) {
		this.Y.b(a, boolean1);
	}
}

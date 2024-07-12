import javax.annotation.Nullable;

public class zs extends aaa {
	private int a;
	private boolean b;

	public zs(ajs ajs) {
		super(ajs);
		this.b_ = 3;
		this.a(0.4F, 0.3F);
	}

	@Override
	protected void r() {
		this.bq.a(1, new uf(this));
		this.bq.a(2, new ur(this, 1.0, false));
		this.bq.a(3, new vr(this, 1.0));
		this.bq.a(7, new uo(this, aay.class, 8.0F));
		this.bq.a(8, new ve(this));
		this.br.a(1, new vv(this, true));
		this.br.a(2, new vy(this, aay.class, true));
	}

	@Override
	public float bq() {
		return 0.1F;
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(8.0);
		this.a(aad.d).a(0.25);
		this.a(aad.e).a(2.0);
	}

	@Override
	protected boolean af() {
		return false;
	}

	@Override
	protected nm G() {
		return nn.bf;
	}

	@Override
	protected nm bW() {
		return nn.bh;
	}

	@Override
	protected nm bX() {
		return nn.bg;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.bi, 0.15F, 1.0F);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.al;
	}

	public static void a(ph ph) {
		sx.a(ph, zs.class);
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a = du.h("Lifetime");
		this.b = du.p("PlayerSpawned");
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Lifetime", this.a);
		du.a("PlayerSpawned", this.b);
	}

	@Override
	public void A_() {
		this.aN = this.v;
		super.A_();
	}

	@Override
	public void i(float float1) {
		this.v = float1;
		super.i(float1);
	}

	@Override
	public double ax() {
		return 0.1;
	}

	public boolean o() {
		return this.b;
	}

	public void a(boolean boolean1) {
		this.b = boolean1;
	}

	@Override
	public void n() {
		super.n();
		if (this.l.E) {
			for (int integer2 = 0; integer2 < 2; integer2++) {
				this.l
					.a(
						de.PORTAL,
						this.p + (this.S.nextDouble() - 0.5) * (double)this.G,
						this.q + this.S.nextDouble() * (double)this.H,
						this.r + (this.S.nextDouble() - 0.5) * (double)this.G,
						(this.S.nextDouble() - 0.5) * 2.0,
						-this.S.nextDouble(),
						(this.S.nextDouble() - 0.5) * 2.0
					);
			}
		} else {
			if (!this.cU()) {
				this.a++;
			}

			if (this.a >= 2400) {
				this.T();
			}
		}
	}

	@Override
	protected boolean r_() {
		return true;
	}

	@Override
	public boolean cM() {
		if (super.cM()) {
			aay aay2 = this.l.a(this, 5.0);
			return aay2 == null;
		} else {
			return false;
		}
	}

	@Override
	public tb cf() {
		return tb.ARTHROPOD;
	}
}

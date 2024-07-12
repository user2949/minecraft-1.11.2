import javax.annotation.Nullable;

public class xg extends wz implements aac {
	private static final kk<Byte> a = kn.a(xg.class, km.a);

	public xg(ajs ajs) {
		super(ajs);
		this.a(0.7F, 1.9F);
	}

	public static void a(ph ph) {
		sx.a(ph, xg.class);
	}

	@Override
	protected void r() {
		this.bq.a(1, new vg(this, 1.25, 20, 10.0F));
		this.bq.a(2, new vr(this, 1.0, 1.0000001E-5F));
		this.bq.a(3, new uo(this, aay.class, 6.0F));
		this.bq.a(4, new ve(this));
		this.br.a(1, new vy(this, sx.class, 10, true, false, zt.d));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(4.0);
		this.a(aad.d).a(0.2F);
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(a, (byte)16);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("Pumpkin", this.o());
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.e("Pumpkin")) {
			this.a(du.p("Pumpkin"));
		}
	}

	@Override
	public void n() {
		super.n();
		if (!this.l.E) {
			int integer2 = ot.c(this.p);
			int integer3 = ot.c(this.q);
			int integer4 = ot.c(this.r);
			if (this.ai()) {
				this.a(ry.h, 1.0F);
			}

			if (this.l.b(new co(integer2, 0, integer4)).a(new co(integer2, integer3, integer4)) > 1.0F) {
				this.a(ry.c, 1.0F);
			}

			if (!this.l.U().b("mobGriefing")) {
				return;
			}

			for (int integer5 = 0; integer5 < 4; integer5++) {
				integer2 = ot.c(this.p + (double)((float)(integer5 % 2 * 2 - 1) * 0.25F));
				integer3 = ot.c(this.q);
				integer4 = ot.c(this.r + (double)((float)(integer5 / 2 % 2 * 2 - 1) * 0.25F));
				co co6 = new co(integer2, integer3, integer4);
				if (this.l.o(co6).a() == azs.a && this.l.b(co6).a(co6) < 0.8F && alv.aH.a(this.l, co6)) {
					this.l.a(co6, alv.aH.t());
				}
			}
		}
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.B;
	}

	@Override
	public void a(sw sw, float float2) {
		abn abn4 = new abn(this.l, this);
		double double5 = sw.q + (double)sw.bq() - 1.1F;
		double double7 = sw.p - this.p;
		double double9 = double5 - abn4.q;
		double double11 = sw.r - this.r;
		float float13 = ot.a(double7 * double7 + double11 * double11) * 0.2F;
		abn4.c(double7, double9 + (double)float13, double11, 1.6F, 12.0F);
		this.a(nn.gs, 1.0F, 1.0F / (this.bJ().nextFloat() * 0.4F + 0.8F));
		this.l.a(abn4);
	}

	@Override
	public float bq() {
		return 1.7F;
	}

	@Override
	protected boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (afj4.c() == afl.bm && this.o() && !this.l.E) {
			this.a(false);
			afj4.a(1, aay);
		}

		return super.a(aay, ri);
	}

	public boolean o() {
		return (this.Y.a(a) & 16) != 0;
	}

	public void a(boolean boolean1) {
		byte byte3 = this.Y.a(a);
		if (boolean1) {
			this.Y.b(a, (byte)(byte3 | 16));
		} else {
			this.Y.b(a, (byte)(byte3 & -17));
		}
	}

	@Nullable
	@Override
	protected nm G() {
		return nn.gp;
	}

	@Nullable
	@Override
	protected nm bW() {
		return nn.gr;
	}

	@Nullable
	@Override
	protected nm bX() {
		return nn.gq;
	}
}

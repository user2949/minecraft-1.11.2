import javax.annotation.Nullable;

public class wy extends ww {
	public wy(ajs ajs) {
		super(ajs);
		this.a(0.9F, 1.4F);
	}

	public static void a(ph ph) {
		sx.a(ph, wy.class);
	}

	@Override
	protected void r() {
		this.bq.a(0, new uf(this));
		this.bq.a(1, new vb(this, 2.0));
		this.bq.a(2, new ub(this, 1.0));
		this.bq.a(3, new vo(this, 1.25, afl.R, false));
		this.bq.a(4, new uh(this, 1.25));
		this.bq.a(5, new vr(this, 1.0));
		this.bq.a(6, new uo(this, aay.class, 6.0F));
		this.bq.a(7, new ve(this));
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(10.0);
		this.a(aad.d).a(0.2F);
	}

	@Override
	protected nm G() {
		return nn.ao;
	}

	@Override
	protected nm bW() {
		return nn.aq;
	}

	@Override
	protected nm bX() {
		return nn.ap;
	}

	@Override
	protected void a(co co, alu alu) {
		this.a(nn.as, 0.15F, 1.0F);
	}

	@Override
	protected float ci() {
		return 0.4F;
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.L;
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (afj4.c() == afl.az && !aay.bK.d && !this.l_()) {
			aay.a(nn.ar, 1.0F, 1.0F);
			afj4.g(1);
			if (afj4.b()) {
				aay.a(ri, new afj(afl.aO));
			} else if (!aay.bs.c(new afj(afl.aO))) {
				aay.a(new afj(afl.aO), false);
			}

			return true;
		} else {
			return super.a(aay, ri);
		}
	}

	public wy a(sk sk) {
		return new wy(this.l);
	}

	@Override
	public float bq() {
		return this.l_() ? this.H : 1.3F;
	}
}

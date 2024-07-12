import javax.annotation.Nullable;

public class xb extends ti {
	private static final kk<Integer> bA = kn.a(xb.class, km.b);
	private ty<aay> bB;
	private vo bC;

	public xb(ajs ajs) {
		super(ajs);
		this.a(0.6F, 0.7F);
	}

	@Override
	protected void r() {
		this.by = new vl(this);
		this.bC = new vo(this, 0.6, afl.bc, true);
		this.bq.a(1, new uf(this));
		this.bq.a(2, this.by);
		this.bq.a(3, this.bC);
		this.bq.a(5, new ug(this, 1.0, 10.0F, 5.0F));
		this.bq.a(6, new uy(this, 0.8));
		this.bq.a(7, new um(this, 0.3F));
		this.bq.a(8, new ux(this));
		this.bq.a(9, new ub(this, 0.8));
		this.bq.a(10, new vr(this, 0.8, 1.0000001E-5F));
		this.bq.a(11, new uo(this, aay.class, 10.0F));
		this.br.a(1, new vz(this, wx.class, false, null));
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bA, 0);
	}

	@Override
	public void M() {
		if (this.u().a()) {
			double double2 = this.u().b();
			if (double2 == 0.6) {
				this.e(true);
				this.f(false);
			} else if (double2 == 1.33) {
				this.e(false);
				this.f(true);
			} else {
				this.e(false);
				this.f(false);
			}
		} else {
			this.e(false);
			this.f(false);
		}
	}

	@Override
	protected boolean K() {
		return !this.dh() && this.T > 2400;
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.a).a(10.0);
		this.a(aad.d).a(0.3F);
	}

	@Override
	public void e(float float1, float float2) {
	}

	public static void a(ph ph) {
		sx.a(ph, xb.class);
	}

	@Override
	public void b(du du) {
		super.b(du);
		du.a("CatType", this.dp());
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.g(du.h("CatType"));
	}

	@Nullable
	@Override
	protected nm G() {
		if (this.dh()) {
			if (this.dn()) {
				return nn.V;
			} else {
				return this.S.nextInt(4) == 0 ? nn.W : nn.R;
			}
		} else {
			return null;
		}
	}

	@Override
	protected nm bW() {
		return nn.U;
	}

	@Override
	protected nm bX() {
		return nn.S;
	}

	@Override
	protected float ci() {
		return 0.4F;
	}

	@Override
	public boolean B(sn sn) {
		return sn.a(ry.a((sw)this), 3.0F);
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			if (this.by != null) {
				this.by.a(false);
			}

			return super.a(ry, float2);
		}
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.O;
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (this.dh()) {
			if (this.e(aay) && !this.l.E && !this.e(afj4)) {
				this.by.a(!this.dj());
			}
		} else if ((this.bC == null || this.bC.f()) && afj4.c() == afl.bc && aay.h(this) < 9.0) {
			if (!aay.bK.d) {
				afj4.g(1);
			}

			if (!this.l.E) {
				if (this.S.nextInt(3) == 0) {
					this.q(true);
					this.g(1 + this.l.r.nextInt(3));
					this.b(aay.be());
					this.p(true);
					this.by.a(true);
					this.l.a(this, (byte)7);
				} else {
					this.p(false);
					this.l.a(this, (byte)6);
				}
			}

			return true;
		}

		return super.a(aay, ri);
	}

	public xb a(sk sk) {
		xb xb3 = new xb(this.l);
		if (this.dh()) {
			xb3.b(this.b());
			xb3.q(true);
			xb3.g(this.dp());
		}

		return xb3;
	}

	@Override
	public boolean e(afj afj) {
		return afj.c() == afl.bc;
	}

	@Override
	public boolean a(ww ww) {
		if (ww == this) {
			return false;
		} else if (!this.dh()) {
			return false;
		} else if (!(ww instanceof xb)) {
			return false;
		} else {
			xb xb3 = (xb)ww;
			return !xb3.dh() ? false : this.dn() && xb3.dn();
		}
	}

	public int dp() {
		return this.Y.a(bA);
	}

	public void g(int integer) {
		this.Y.b(bA, integer);
	}

	@Override
	public boolean cM() {
		return this.l.r.nextInt(3) != 0;
	}

	@Override
	public boolean cN() {
		if (this.l.a(this.bo(), this) && this.l.a(this, this.bo()).isEmpty() && !this.l.d(this.bo())) {
			co co2 = new co(this.p, this.bo().b, this.r);
			if (co2.q() < this.l.K()) {
				return false;
			}

			atl atl3 = this.l.o(co2.b());
			alu alu4 = atl3.v();
			if (alu4 == alv.c || atl3.a() == azs.j) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String h_() {
		if (this.n_()) {
			return this.bi();
		} else {
			return this.dh() ? dp.a("entity.Cat.name") : super.h_();
		}
	}

	@Override
	protected void di() {
		if (this.bB == null) {
			this.bB = new ty<>(this, aay.class, 16.0F, 0.8, 1.33);
		}

		this.bq.a(this.bB);
		if (!this.dh()) {
			this.bq.a(4, this.bB);
		}
	}

	@Nullable
	@Override
	public sz a(rh rh, @Nullable sz sz) {
		sz = super.a(rh, sz);
		if (this.dp() == 0 && this.l.r.nextInt(7) == 0) {
			for (int integer4 = 0; integer4 < 2; integer4++) {
				xb xb5 = new xb(this.l);
				xb5.b(this.p, this.q, this.r, this.v, 0.0F);
				xb5.b_(-24000);
				this.l.a(xb5);
			}
		}

		return sz;
	}
}

import javax.annotation.Nullable;

public class xa extends wy {
	public xa(ajs ajs) {
		super(ajs);
		this.a(0.9F, 1.4F);
		this.bz = alv.bw;
	}

	public static void c(ph ph) {
		sx.a(ph, xa.class);
	}

	@Override
	public boolean a(aay aay, ri ri) {
		afj afj4 = aay.b(ri);
		if (afj4.c() == afl.C && this.l() >= 0 && !aay.bK.d) {
			afj4.g(1);
			if (afj4.b()) {
				aay.a(ri, new afj(afl.D));
			} else if (!aay.bs.c(new afj(afl.D))) {
				aay.a(new afj(afl.D), false);
			}

			return true;
		} else if (afj4.c() == afl.bm && this.l() >= 0) {
			this.T();
			this.l.a(de.EXPLOSION_LARGE, this.p, this.q + (double)(this.H / 2.0F), this.r, 0.0, 0.0, 0.0);
			if (!this.l.E) {
				wy wy5 = new wy(this.l);
				wy5.b(this.p, this.q, this.r, this.v, this.w);
				wy5.c(this.bU());
				wy5.aN = this.aN;
				if (this.n_()) {
					wy5.c(this.bi());
				}

				this.l.a(wy5);

				for (int integer6 = 0; integer6 < 5; integer6++) {
					this.l.a(new zj(this.l, this.p, this.q + (double)this.H, this.r, new afj(alv.Q)));
				}

				afj4.a(1, aay);
				this.a(nn.dV, 1.0F, 1.0F);
			}

			return true;
		} else {
			return super.a(aay, ri);
		}
	}

	public xa b(sk sk) {
		return new xa(this.l);
	}

	@Nullable
	@Override
	protected kq J() {
		return bcf.M;
	}
}

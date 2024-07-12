import javax.annotation.Nullable;

public class afb extends afh {
	public afb() {
		this.e(64);
		this.d(1);
		this.a(aej.i);
		this.a(new kq("cast"), new afk() {
			@Override
			public float a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
				if (sw == null) {
					return 0.0F;
				} else {
					boolean boolean5 = sw.cg() == afj;
					boolean boolean6 = sw.ch() == afj;
					if (sw.cg().c() instanceof afb) {
						boolean6 = false;
					}

					return (boolean5 || boolean6) && sw instanceof aay && ((aay)sw).bQ != null ? 1.0F : 0.0F;
				}
			}
		});
	}

	@Override
	public boolean C_() {
		return true;
	}

	@Override
	public boolean E_() {
		return true;
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		if (aay.bQ != null) {
			int integer6 = aay.bQ.j();
			afj5.a(integer6, aay);
			aay.a(ri);
		} else {
			ajs.a(null, aay.p, aay.q, aay.r, nn.I, no.NEUTRAL, 0.5F, 0.4F / (j.nextFloat() * 0.4F + 0.8F));
			if (!ajs.E) {
				zd zd6 = new zd(ajs, aay);
				int integer7 = aik.c(afj5);
				if (integer7 > 0) {
					zd6.a(integer7);
				}

				int integer8 = aik.b(afj5);
				if (integer8 > 0) {
					zd6.b(integer8);
				}

				ajs.a(zd6);
			}

			aay.a(ri);
			aay.b(oa.b(this));
		}

		return new rl<>(rk.SUCCESS, afj5);
	}

	@Override
	public int c() {
		return 1;
	}
}

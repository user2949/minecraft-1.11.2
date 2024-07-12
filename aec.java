import javax.annotation.Nullable;

public class aec extends afh {
	private final alu a;

	public aec(alu alu) {
		this.k = 1;
		this.a = alu;
		this.a(aej.f);
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		boolean boolean5 = this.a == alv.a;
		afj afj6 = aay.b(ri);
		bdu bdu7 = this.a(ajs, aay, boolean5);
		if (bdu7 == null) {
			return new rl<>(rk.PASS, afj6);
		} else if (bdu7.a != bdu.a.BLOCK) {
			return new rl<>(rk.PASS, afj6);
		} else {
			co co8 = bdu7.a();
			if (!ajs.a(aay, co8)) {
				return new rl<>(rk.FAIL, afj6);
			} else if (boolean5) {
				if (!aay.a(co8.a(bdu7.b), bdu7.b, afj6)) {
					return new rl<>(rk.FAIL, afj6);
				} else {
					atl atl9 = ajs.o(co8);
					azs azs10 = atl9.a();
					if (azs10 == azs.h && (Integer)atl9.c(aoq.b) == 0) {
						ajs.a(co8, alv.a.t(), 11);
						aay.b(oa.b(this));
						aay.a(nn.P, 1.0F, 1.0F);
						return new rl<>(rk.SUCCESS, this.a(afj6, aay, afl.aA));
					} else if (azs10 == azs.i && (Integer)atl9.c(aoq.b) == 0) {
						aay.a(nn.Q, 1.0F, 1.0F);
						ajs.a(co8, alv.a.t(), 11);
						aay.b(oa.b(this));
						return new rl<>(rk.SUCCESS, this.a(afj6, aay, afl.aB));
					} else {
						return new rl<>(rk.FAIL, afj6);
					}
				}
			} else {
				boolean boolean9 = ajs.o(co8).v().a((ajw)ajs, co8);
				co co10 = boolean9 && bdu7.b == cv.UP ? co8 : co8.a(bdu7.b);
				if (!aay.a(co10, bdu7.b, afj6)) {
					return new rl<>(rk.FAIL, afj6);
				} else if (this.a(aay, ajs, co10)) {
					aay.b(oa.b(this));
					return !aay.bK.d ? new rl<>(rk.SUCCESS, new afj(afl.az)) : new rl<>(rk.SUCCESS, afj6);
				} else {
					return new rl<>(rk.FAIL, afj6);
				}
			}
		}
	}

	private afj a(afj afj, aay aay, afh afh) {
		if (aay.bK.d) {
			return afj;
		} else {
			afj.g(1);
			if (afj.b()) {
				return new afj(afh);
			} else {
				if (!aay.bs.c(new afj(afh))) {
					aay.a(new afj(afh), false);
				}

				return afj;
			}
		}
	}

	public boolean a(@Nullable aay aay, ajs ajs, co co) {
		if (this.a == alv.a) {
			return false;
		} else {
			atl atl5 = ajs.o(co);
			azs azs6 = atl5.a();
			boolean boolean7 = !azs6.a();
			boolean boolean8 = atl5.v().a((ajw)ajs, co);
			if (!ajs.d(co) && !boolean7 && !boolean8) {
				return false;
			} else {
				if (ajs.s.l() && this.a == alv.i) {
					int integer9 = co.p();
					int integer10 = co.q();
					int integer11 = co.r();
					ajs.a(aay, co, nn.bH, no.BLOCKS, 0.5F, 2.6F + (ajs.r.nextFloat() - ajs.r.nextFloat()) * 0.8F);

					for (int integer12 = 0; integer12 < 8; integer12++) {
						ajs.a(de.SMOKE_LARGE, (double)integer9 + Math.random(), (double)integer10 + Math.random(), (double)integer11 + Math.random(), 0.0, 0.0, 0.0);
					}
				} else {
					if (!ajs.E && (boolean7 || boolean8) && !azs6.d()) {
						ajs.b(co, true);
					}

					nm nm9 = this.a == alv.k ? nn.O : nn.N;
					ajs.a(aay, co, nm9, no.BLOCKS, 1.0F, 1.0F);
					ajs.a(co, this.a.t(), 11);
				}

				return true;
			}
		}
	}
}

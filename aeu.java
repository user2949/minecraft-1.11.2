public class aeu extends afh {
	public aeu() {
		this.a(aej.f);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		atl atl10 = ajs.o(co);
		afj afj11 = aay.b(ri);
		if (!aay.a(co.a(cv), cv, afj11) || atl10.v() != alv.bG || (Boolean)atl10.c(anf.b)) {
			return rk.FAIL;
		} else if (ajs.E) {
			return rk.SUCCESS;
		} else {
			ajs.a(co, atl10.a(anf.b, true), 2);
			ajs.d(co, alv.bG);
			afj11.g(1);

			for (int integer12 = 0; integer12 < 16; integer12++) {
				double double13 = (double)((float)co.p() + (5.0F + j.nextFloat() * 6.0F) / 16.0F);
				double double15 = (double)((float)co.q() + 0.8125F);
				double double17 = (double)((float)co.r() + (5.0F + j.nextFloat() * 6.0F) / 16.0F);
				double double19 = 0.0;
				double double21 = 0.0;
				double double23 = 0.0;
				ajs.a(de.SMOKE_NORMAL, double13, double15, double17, 0.0, 0.0, 0.0);
			}

			atp.b b12 = anf.e().a(ajs, co);
			if (b12 != null) {
				co co13 = b12.a().a(-3, 0, -3);

				for (int integer14 = 0; integer14 < 3; integer14++) {
					for (int integer15 = 0; integer15 < 3; integer15++) {
						ajs.a(co13.a(integer14, 0, integer15), alv.bF.t(), 2);
					}
				}
			}

			return rk.SUCCESS;
		}
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		bdu bdu6 = this.a(ajs, aay, false);
		if (bdu6 != null && bdu6.a == bdu.a.BLOCK && ajs.o(bdu6.a()).v() == alv.bG) {
			return new rl<>(rk.PASS, afj5);
		} else {
			aay.c(ri);
			if (!ajs.E) {
				co co7 = ((lw)ajs).r().a(ajs, "Stronghold", new co(aay), false);
				if (co7 != null) {
					abe abe8 = new abe(ajs, aay.p, aay.q + (double)(aay.H / 2.0F), aay.r);
					abe8.a(co7);
					ajs.a(abe8);
					ajs.a(null, aay.p, aay.q, aay.r, nn.aY, no.NEUTRAL, 0.5F, 0.4F / (j.nextFloat() * 0.4F + 0.8F));
					ajs.a(null, 1003, new co(aay), 0);
					if (!aay.bK.d) {
						afj5.g(1);
					}

					aay.b(oa.b(this));
					return new rl<>(rk.SUCCESS, afj5);
				}
			}

			return new rl<>(rk.SUCCESS, afj5);
		}
	}
}

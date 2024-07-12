public class agv extends ags {
	public agv(alu alu) {
		super(alu, false);
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		bdu bdu6 = this.a(ajs, aay, true);
		if (bdu6 == null) {
			return new rl<>(rk.PASS, afj5);
		} else {
			if (bdu6.a == bdu.a.BLOCK) {
				co co7 = bdu6.a();
				if (!ajs.a(aay, co7) || !aay.a(co7.a(bdu6.b), bdu6.b, afj5)) {
					return new rl<>(rk.FAIL, afj5);
				}

				co co8 = co7.a();
				atl atl9 = ajs.o(co7);
				if (atl9.a() == azs.h && (Integer)atl9.c(aoq.b) == 0 && ajs.d(co8)) {
					ajs.a(co8, alv.bx.t(), 11);
					if (!aay.bK.d) {
						afj5.g(1);
					}

					aay.b(oa.b(this));
					ajs.a(aay, co7, nn.hp, no.BLOCKS, 1.0F, 1.0F);
					return new rl<>(rk.SUCCESS, afj5);
				}
			}

			return new rl<>(rk.FAIL, afj5);
		}
	}
}

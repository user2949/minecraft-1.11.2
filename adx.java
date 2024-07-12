import java.util.List;

public class adx extends afh {
	private final abx.b a;

	public adx(abx.b b) {
		this.a = b;
		this.k = 1;
		this.a(aej.e);
		this.c("boat." + b.a());
	}

	@Override
	public rl<afj> a(ajs ajs, aay aay, ri ri) {
		afj afj5 = aay.b(ri);
		float float6 = 1.0F;
		float float7 = aay.y + (aay.w - aay.y) * 1.0F;
		float float8 = aay.x + (aay.v - aay.x) * 1.0F;
		double double9 = aay.m + (aay.p - aay.m) * 1.0;
		double double11 = aay.n + (aay.q - aay.n) * 1.0 + (double)aay.bq();
		double double13 = aay.o + (aay.r - aay.o) * 1.0;
		bdw bdw15 = new bdw(double9, double11, double13);
		float float16 = ot.b(-float8 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float17 = ot.a(-float8 * (float) (Math.PI / 180.0) - (float) Math.PI);
		float float18 = -ot.b(-float7 * (float) (Math.PI / 180.0));
		float float19 = ot.a(-float7 * (float) (Math.PI / 180.0));
		float float20 = float17 * float18;
		float float22 = float16 * float18;
		double double23 = 5.0;
		bdw bdw25 = bdw15.b((double)float20 * 5.0, (double)float19 * 5.0, (double)float22 * 5.0);
		bdu bdu26 = ajs.a(bdw15, bdw25, true);
		if (bdu26 == null) {
			return new rl<>(rk.PASS, afj5);
		} else {
			bdw bdw27 = aay.f(1.0F);
			boolean boolean28 = false;
			List<sn> list29 = ajs.b(aay, aay.bo().b(bdw27.b * 5.0, bdw27.c * 5.0, bdw27.d * 5.0).g(1.0));

			for (int integer30 = 0; integer30 < list29.size(); integer30++) {
				sn sn31 = (sn)list29.get(integer30);
				if (sn31.aq()) {
					bdt bdt32 = sn31.bo().g((double)sn31.aA());
					if (bdt32.b(bdw15)) {
						boolean28 = true;
					}
				}
			}

			if (boolean28) {
				return new rl<>(rk.PASS, afj5);
			} else if (bdu26.a != bdu.a.BLOCK) {
				return new rl<>(rk.PASS, afj5);
			} else {
				alu alu30 = ajs.o(bdu26.a()).v();
				boolean boolean31 = alu30 == alv.j || alu30 == alv.i;
				abx abx32 = new abx(ajs, bdu26.c.b, boolean31 ? bdu26.c.c - 0.12 : bdu26.c.c, bdu26.c.d);
				abx32.a(this.a);
				abx32.v = aay.v;
				if (!ajs.a(abx32, abx32.bo().g(-0.1)).isEmpty()) {
					return new rl<>(rk.FAIL, afj5);
				} else {
					if (!ajs.E) {
						ajs.a(abx32);
					}

					if (!aay.bK.d) {
						afj5.g(1);
					}

					aay.b(oa.b(this));
					return new rl<>(rk.SUCCESS, afj5);
				}
			}
		}
	}
}

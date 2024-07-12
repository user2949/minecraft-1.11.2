import java.util.List;
import java.util.Random;

public class adq extends afh {
	public adq() {
		this.a(aej.c);
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		if (cv == cv.DOWN) {
			return rk.FAIL;
		} else {
			boolean boolean10 = ajs.o(co).v().a((ajw)ajs, co);
			co co11 = boolean10 ? co : co.a(cv);
			afj afj12 = aay.b(ri);
			if (!aay.a(co11, cv, afj12)) {
				return rk.FAIL;
			} else {
				co co13 = co11.a();
				boolean boolean14 = !ajs.d(co11) && !ajs.o(co11).v().a((ajw)ajs, co11);
				boolean14 |= !ajs.d(co13) && !ajs.o(co13).v().a((ajw)ajs, co13);
				if (boolean14) {
					return rk.FAIL;
				} else {
					double double15 = (double)co11.p();
					double double17 = (double)co11.q();
					double double19 = (double)co11.r();
					List<sn> list21 = ajs.b(null, new bdt(double15, double17, double19, double15 + 1.0, double17 + 2.0, double19 + 1.0));
					if (!list21.isEmpty()) {
						return rk.FAIL;
					} else {
						if (!ajs.E) {
							ajs.g(co11);
							ajs.g(co13);
							yx yx22 = new yx(ajs, double15 + 0.5, double17, double19 + 0.5);
							float float23 = (float)ot.d((ot.g(aay.v - 180.0F) + 22.5F) / 45.0F) * 45.0F;
							yx22.b(double15 + 0.5, double17, double19 + 0.5, float23, 0.0F);
							this.a(yx22, ajs.r);
							ago.a(ajs, aay, afj12, yx22);
							ajs.a(yx22);
							ajs.a(null, yx22.p, yx22.q, yx22.r, nn.m, no.BLOCKS, 0.75F, 0.8F);
						}

						afj12.g(1);
						return rk.SUCCESS;
					}
				}
			}
		}
	}

	private void a(yx yx, Random random) {
		di di4 = yx.u();
		float float6 = random.nextFloat() * 5.0F;
		float float7 = random.nextFloat() * 20.0F - 10.0F;
		di di5 = new di(di4.b() + float6, di4.c() + float7, di4.d());
		yx.a(di5);
		di4 = yx.w();
		float6 = random.nextFloat() * 10.0F - 5.0F;
		di5 = new di(di4.b(), di4.c() + float6, di4.d());
		yx.b(di5);
	}
}

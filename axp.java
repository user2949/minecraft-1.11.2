import java.util.Random;

public class axp extends awn {
	private final atl a;

	public axp(ari.a a) {
		this.a = alv.H.t().a(ari.a, a);
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (atl atl5 = ajs.o(co); (atl5.a() == azs.a || atl5.a() == azs.j) && co.q() > 0; atl5 = ajs.o(co)) {
			co = co.b();
		}

		for (int integer6 = 0; integer6 < 128; integer6++) {
			co co7 = co.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
			if (ajs.d(co7) && alv.H.f(ajs, co7, this.a)) {
				ajs.a(co7, this.a, 2);
			}
		}

		return true;
	}
}

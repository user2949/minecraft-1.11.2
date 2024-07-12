import java.util.Random;

public class awh extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (atl atl5 = ajs.o(co); (atl5.a() == azs.a || atl5.a() == azs.j) && co.q() > 0; atl5 = ajs.o(co)) {
			co = co.b();
		}

		for (int integer6 = 0; integer6 < 4; integer6++) {
			co co7 = co.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
			if (ajs.d(co7) && alv.I.f(ajs, co7, alv.I.t())) {
				ajs.a(co7, alv.I.t(), 2);
			}
		}

		return true;
	}
}

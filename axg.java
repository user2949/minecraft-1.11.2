import java.util.Random;

public class axg extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (int integer5 = 0; integer5 < 64; integer5++) {
			co co6 = co.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
			if (ajs.d(co6) && ajs.o(co6.b()).v() == alv.c && alv.aU.a(ajs, co6)) {
				ajs.a(co6, alv.aU.t().a(apu.D, cv.c.HORIZONTAL.a(random)), 2);
			}
		}

		return true;
	}
}

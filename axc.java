import java.util.Random;

public class axc extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (int integer5 = 0; integer5 < 64; integer5++) {
			co co6 = co.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
			if (alv.bk.a(ajs, co6) && ajs.o(co6.b()).v() == alv.c) {
				ajs.a(co6, alv.bk.t(), 2);
			}
		}

		return true;
	}
}

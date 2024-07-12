import java.util.Random;

public class axs extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (int integer5 = 0; integer5 < 10; integer5++) {
			int integer6 = co.p() + random.nextInt(8) - random.nextInt(8);
			int integer7 = co.q() + random.nextInt(4) - random.nextInt(4);
			int integer8 = co.r() + random.nextInt(8) - random.nextInt(8);
			if (ajs.d(new co(integer6, integer7, integer8)) && alv.bx.a(ajs, new co(integer6, integer7, integer8))) {
				ajs.a(new co(integer6, integer7, integer8), alv.bx.t(), 2);
			}
		}

		return true;
	}
}

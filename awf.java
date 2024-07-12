import java.util.Random;

public class awf extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (int integer5 = 0; integer5 < 10; integer5++) {
			co co6 = co.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
			if (ajs.d(co6)) {
				int integer7 = 1 + random.nextInt(random.nextInt(3) + 1);

				for (int integer8 = 0; integer8 < integer7; integer8++) {
					if (alv.aK.b(ajs, co6)) {
						ajs.a(co6.b(integer8), alv.aK.t(), 2);
					}
				}
			}
		}

		return true;
	}
}

import java.util.Random;

public class axh extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (int integer5 = 0; integer5 < 20; integer5++) {
			co co6 = co.a(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
			if (ajs.d(co6)) {
				co co7 = co6.b();
				if (ajs.o(co7.e()).a() == azs.h || ajs.o(co7.f()).a() == azs.h || ajs.o(co7.c()).a() == azs.h || ajs.o(co7.d()).a() == azs.h) {
					int integer8 = 2 + random.nextInt(random.nextInt(3) + 1);

					for (int integer9 = 0; integer9 < integer8; integer9++) {
						if (alv.aM.b(ajs, co6)) {
							ajs.a(co6.b(integer9), alv.aM.t(), 2);
						}
					}
				}
			}
		}

		return true;
	}
}

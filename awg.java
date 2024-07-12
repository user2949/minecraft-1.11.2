import java.util.Random;

public class awg extends awn {
	private final alu a = alv.aL;
	private final int b;

	public awg(int integer) {
		this.b = integer;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		if (ajs.o(co).a() != azs.h) {
			return false;
		} else {
			int integer5 = random.nextInt(this.b - 2) + 2;
			int integer6 = 1;

			for (int integer7 = co.p() - integer5; integer7 <= co.p() + integer5; integer7++) {
				for (int integer8 = co.r() - integer5; integer8 <= co.r() + integer5; integer8++) {
					int integer9 = integer7 - co.p();
					int integer10 = integer8 - co.r();
					if (integer9 * integer9 + integer10 * integer10 <= integer5 * integer5) {
						for (int integer11 = co.q() - 1; integer11 <= co.q() + 1; integer11++) {
							co co12 = new co(integer7, integer11, integer8);
							alu alu13 = ajs.o(co12).v();
							if (alu13 == alv.d || alu13 == alv.aL) {
								ajs.a(co12, this.a.t(), 2);
							}
						}
					}
				}
			}

			return true;
		}
	}
}

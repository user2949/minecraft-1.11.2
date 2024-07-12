import java.util.Random;

public class awc extends awn {
	private final alu a;
	private final int b;

	public awc(alu alu, int integer) {
		super(false);
		this.a = alu;
		this.b = integer;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		while (co.q() > 3) {
			if (!ajs.d(co.b())) {
				alu alu5 = ajs.o(co.b()).v();
				if (alu5 == alv.c || alu5 == alv.d || alu5 == alv.b) {
					break;
				}
			}

			co = co.b();
		}

		if (co.q() <= 3) {
			return false;
		} else {
			int integer5 = this.b;

			for (int integer6 = 0; integer5 >= 0 && integer6 < 3; integer6++) {
				int integer7 = integer5 + random.nextInt(2);
				int integer8 = integer5 + random.nextInt(2);
				int integer9 = integer5 + random.nextInt(2);
				float float10 = (float)(integer7 + integer8 + integer9) * 0.333F + 0.5F;

				for (co co12 : co.a(co.a(-integer7, -integer8, -integer9), co.a(integer7, integer8, integer9))) {
					if (co12.n(co) <= (double)(float10 * float10)) {
						ajs.a(co12, this.a.t(), 4);
					}
				}

				co = co.a(-(integer5 + 1) + random.nextInt(2 + integer5 * 2), 0 - random.nextInt(2), -(integer5 + 1) + random.nextInt(2 + integer5 * 2));
			}

			return true;
		}
	}
}

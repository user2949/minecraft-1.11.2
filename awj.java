import java.util.Random;

public class awj extends awn {
	private amy.b a;

	public void a(amy.b b) {
		this.a = b;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		boolean boolean5 = false;

		for (int integer6 = 0; integer6 < 64; integer6++) {
			co co7 = co.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
			if (ajs.d(co7) && (!ajs.s.n() || co7.q() < 254) && alv.cF.a(ajs, co7)) {
				alv.cF.a(ajs, co7, this.a, 2);
				boolean5 = true;
			}
		}

		return boolean5;
	}
}

import java.util.Random;

public class awe extends awn {
	private final ama a;

	public awe(ama ama) {
		this.a = ama;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		for (int integer5 = 0; integer5 < 64; integer5++) {
			co co6 = co.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
			if (ajs.d(co6) && (!ajs.s.n() || co6.q() < 255) && this.a.f(ajs, co6, this.a.t())) {
				ajs.a(co6, this.a.t(), 2);
			}
		}

		return true;
	}
}

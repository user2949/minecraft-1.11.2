import java.util.Random;

public class awl extends awn {
	@Override
	public boolean b(ajs ajs, Random random, co co) {
		float float5 = (float)(random.nextInt(3) + 4);

		for (int integer6 = 0; float5 > 0.5F; integer6--) {
			for (int integer7 = ot.d(-float5); integer7 <= ot.f(float5); integer7++) {
				for (int integer8 = ot.d(-float5); integer8 <= ot.f(float5); integer8++) {
					if ((float)(integer7 * integer7 + integer8 * integer8) <= (float5 + 1.0F) * (float5 + 1.0F)) {
						this.a(ajs, co.a(integer7, integer6, integer8), alv.bH.t());
					}
				}
			}

			float5 = (float)((double)float5 - ((double)random.nextInt(2) + 0.5));
		}

		return true;
	}
}

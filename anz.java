import java.util.Random;

public class anz extends anj {
	@Override
	public afh a(atl atl, Random random, int integer) {
		if (integer > 3) {
			integer = 3;
		}

		return random.nextInt(10 - integer * 3) == 0 ? afl.an : super.a(atl, random, integer);
	}

	@Override
	public azt r(atl atl) {
		return azt.m;
	}

	@Override
	public int z(atl atl) {
		return -8356741;
	}
}

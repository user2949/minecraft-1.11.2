import java.util.Random;

public class anw extends alu {
	public anw(azs azs) {
		super(azs);
		this.a(aej.b);
	}

	@Override
	public int a(int integer, Random random) {
		return ot.a(this.a(random) + random.nextInt(integer + 1), 1, 4);
	}

	@Override
	public int a(Random random) {
		return 2 + random.nextInt(3);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.bb;
	}

	@Override
	public azt r(atl atl) {
		return azt.d;
	}
}

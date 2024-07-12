import java.util.Random;

public class aot extends alu {
	protected aot() {
		super(azs.C, azt.u);
		this.a(aej.b);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.bn;
	}

	@Override
	public int a(Random random) {
		return 3 + random.nextInt(5);
	}

	@Override
	public int a(int integer, Random random) {
		return Math.min(9, this.a(random) + random.nextInt(1 + integer));
	}
}

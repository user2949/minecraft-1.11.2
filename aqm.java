import java.util.Random;

public class aqm extends alu {
	public aqm(azs azs) {
		super(azs);
		this.a(aej.b);
	}

	@Override
	public int a(Random random) {
		return 2 + random.nextInt(2);
	}

	@Override
	public int a(int integer, Random random) {
		return ot.a(this.a(random) + random.nextInt(integer + 1), 1, 5);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.cO;
	}

	@Override
	public azt r(atl atl) {
		return azt.p;
	}

	@Override
	protected boolean n() {
		return true;
	}
}

import java.util.Random;

public class aqr extends alu {
	protected aqr() {
		super(azs.z);
		this.a(true);
		this.a(aej.b);
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.aG;
	}

	@Override
	public int a(Random random) {
		return 4;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (ajs.b(ajy.BLOCK, co) > 11) {
			this.b(ajs, co, ajs.o(co), 0);
			ajs.g(co);
		}
	}
}

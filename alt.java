import java.util.Random;

public class alt extends amp {
	public static final aua a = aua.a("age", 0, 3);
	private static final bdt[] d = new bdt[]{
		new bdt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0)
	};

	@Override
	protected aua e() {
		return a;
	}

	@Override
	public int g() {
		return 3;
	}

	@Override
	protected afh h() {
		return afl.cV;
	}

	@Override
	protected afh i() {
		return afl.cW;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (random.nextInt(3) == 0) {
			this.e(ajs, co, atl);
		} else {
			super.b(ajs, co, atl, random);
		}
	}

	@Override
	protected int b(ajs ajs) {
		return super.b(ajs) / 3;
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return d[atl.c(this.e())];
	}
}

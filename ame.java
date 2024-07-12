public class ame extends amp {
	private static final bdt[] a = new bdt[]{
		new bdt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.4375, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0)
	};

	@Override
	protected afh h() {
		return afl.cc;
	}

	@Override
	protected afh i() {
		return afl.cc;
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return a[atl.c(this.e())];
	}
}

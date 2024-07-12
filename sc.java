public class sc extends sg {
	protected sc(boolean boolean1, int integer) {
		super(boolean1, integer);
	}

	@Override
	public void a(sw sw, tn tn, int integer) {
		sw.n(sw.cv() - (float)(4 * (integer + 1)));
		super.a(sw, tn, integer);
	}

	@Override
	public void b(sw sw, tn tn, int integer) {
		sw.n(sw.cv() + (float)(4 * (integer + 1)));
		super.b(sw, tn, integer);
	}
}

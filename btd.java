public class btd extends bte {
	private final int d = ber.a(ajk.values().length);

	public btd(ajs ajs, bqm bqm, int integer) {
		super(ajs, bqm, integer);
	}

	public int a(ajk ajk, btb btb) {
		return !btb.b(ajk) ? this.d + ajk.ordinal() : -1;
	}

	@Override
	public void a() {
		super.a();
		ber.a(this.d, ajk.values().length);
	}
}

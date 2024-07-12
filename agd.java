public class agd extends afi {
	private final ly a;

	public agd(ly ly) {
		this.a = ly;
	}

	@Override
	protected void b(afh afh, int integer) {
		super.b(afh, integer);
		this.a.a.a(new gn(afh, integer));
	}

	@Override
	protected void c(afh afh) {
		super.c(afh);
		this.a.a.a(new gn(afh, 0));
	}
}

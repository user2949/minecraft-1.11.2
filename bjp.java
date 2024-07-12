public class bjp extends bjn {
	private final cad.a c;

	public bjp(bjm bjm, cad.a a) {
		super(bjm);
		this.c = a;
	}

	@Override
	protected void d() {
		this.c.a(this.a.N());
	}

	@Override
	protected int a() {
		return this.c.f();
	}

	@Override
	protected String b() {
		return this.c.e();
	}

	@Override
	protected String c() {
		return this.c.d();
	}

	public cad.a k() {
		return this.c;
	}
}

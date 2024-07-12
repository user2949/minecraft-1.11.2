public class afn extends adv {
	private final aon b;

	public afn(aon aon) {
		super(aon);
		this.b = aon;
		this.e(0);
		this.a(true);
	}

	@Override
	public int a(int integer) {
		return integer | 4;
	}

	@Override
	public String a(afj afj) {
		return super.a() + "." + this.b.e(afj.j()).d();
	}
}

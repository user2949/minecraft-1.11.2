public class ags extends adv {
	private String[] b;

	public ags(alu alu, boolean boolean2) {
		super(alu);
		if (boolean2) {
			this.e(0);
			this.a(true);
		}
	}

	@Override
	public int a(int integer) {
		return integer;
	}

	public ags a(String[] arr) {
		this.b = arr;
		return this;
	}

	@Override
	public String a(afj afj) {
		if (this.b == null) {
			return super.a(afj);
		} else {
			int integer3 = afj.j();
			return integer3 >= 0 && integer3 < this.b.length ? super.a(afj) + "." + this.b[integer3] : super.a(afj);
		}
	}
}

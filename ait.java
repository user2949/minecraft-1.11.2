public class ait extends aii {
	public ait(aii.a a, ss... arr) {
		super(a, aij.ARMOR_HEAD, arr);
		this.c("oxygen");
	}

	@Override
	public int a(int integer) {
		return 10 * integer;
	}

	@Override
	public int b(int integer) {
		return this.a(integer) + 30;
	}

	@Override
	public int b() {
		return 3;
	}
}

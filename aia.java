public class aia extends aii {
	public aia(aii.a a, ss... arr) {
		super(a, aij.BOW, arr);
		this.c("arrowDamage");
	}

	@Override
	public int a(int integer) {
		return 1 + (integer - 1) * 10;
	}

	@Override
	public int b(int integer) {
		return this.a(integer) + 15;
	}

	@Override
	public int b() {
		return 5;
	}
}

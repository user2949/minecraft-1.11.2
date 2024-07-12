public class aid extends aii {
	public aid(aii.a a, ss... arr) {
		super(a, aij.BOW, arr);
		this.c("arrowKnockback");
	}

	@Override
	public int a(int integer) {
		return 12 + (integer - 1) * 20;
	}

	@Override
	public int b(int integer) {
		return this.a(integer) + 25;
	}

	@Override
	public int b() {
		return 2;
	}
}

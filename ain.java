public class ain extends aii {
	protected ain(aii.a a, ss... arr) {
		super(a, aij.WEAPON, arr);
		this.c("fire");
	}

	@Override
	public int a(int integer) {
		return 10 + 20 * (integer - 1);
	}

	@Override
	public int b(int integer) {
		return super.a(integer) + 50;
	}

	@Override
	public int b() {
		return 2;
	}
}

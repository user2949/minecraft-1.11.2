public class aiq extends aii {
	protected aiq(aii.a a, ss... arr) {
		super(a, aij.WEAPON, arr);
		this.c("knockback");
	}

	@Override
	public int a(int integer) {
		return 5 + 20 * (integer - 1);
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

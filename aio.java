public class aio extends aii {
	protected aio(aii.a a, aij aij, ss... arr) {
		super(a, aij, arr);
		this.c("fishingSpeed");
	}

	@Override
	public int a(int integer) {
		return 15 + (integer - 1) * 9;
	}

	@Override
	public int b(int integer) {
		return super.a(integer) + 50;
	}

	@Override
	public int b() {
		return 3;
	}
}

public class aih extends aii {
	protected aih(aii.a a, ss... arr) {
		super(a, aij.DIGGER, arr);
		this.c("digging");
	}

	@Override
	public int a(int integer) {
		return 1 + 10 * (integer - 1);
	}

	@Override
	public int b(int integer) {
		return super.a(integer) + 50;
	}

	@Override
	public int b() {
		return 5;
	}

	@Override
	public boolean a(afj afj) {
		return afj.c() == afl.bm ? true : super.a(afj);
	}
}

public class ais extends aii {
	public ais(aii.a a, ss... arr) {
		super(a, aij.BREAKABLE, arr);
		this.c("mending");
	}

	@Override
	public int a(int integer) {
		return integer * 25;
	}

	@Override
	public int b(int integer) {
		return this.a(integer) + 50;
	}

	@Override
	public boolean c() {
		return true;
	}

	@Override
	public int b() {
		return 1;
	}
}

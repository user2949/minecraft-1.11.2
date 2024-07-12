public class aja extends aii {
	public aja(aii.a a, ss... arr) {
		super(a, aij.ARMOR_HEAD, arr);
		this.c("waterWorker");
	}

	@Override
	public int a(int integer) {
		return 1;
	}

	@Override
	public int b(int integer) {
		return this.a(integer) + 40;
	}

	@Override
	public int b() {
		return 1;
	}
}

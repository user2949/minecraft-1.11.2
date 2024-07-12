public class aiz extends aii {
	public aiz(aii.a a, ss... arr) {
		super(a, aij.ARMOR_FEET, arr);
		this.c("waterWalker");
	}

	@Override
	public int a(int integer) {
		return integer * 10;
	}

	@Override
	public int b(int integer) {
		return this.a(integer) + 15;
	}

	@Override
	public int b() {
		return 3;
	}

	@Override
	public boolean a(aii aii) {
		return super.a(aii) && aii != aim.j;
	}
}

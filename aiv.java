public class aiv extends aii {
	public aiv(aii.a a, ss... arr) {
		super(a, aij.WEAPON, arr);
	}

	@Override
	public int a(int integer) {
		return 5 + (integer - 1) * 9;
	}

	@Override
	public int b(int integer) {
		return this.a(integer) + 15;
	}

	@Override
	public int b() {
		return 3;
	}

	public static float e(int integer) {
		return 1.0F - 1.0F / (float)(integer + 1);
	}

	@Override
	public String a() {
		return "enchantment.sweeping";
	}
}

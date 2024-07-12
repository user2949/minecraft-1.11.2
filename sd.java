public class sd extends sg {
	protected final double a;

	protected sd(boolean boolean1, int integer, double double3) {
		super(boolean1, integer);
		this.a = double3;
	}

	@Override
	public double a(int integer, tl tl) {
		return this.a * (double)(integer + 1);
	}
}

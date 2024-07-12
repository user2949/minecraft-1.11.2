public class bpe extends boh {
	protected bpe(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.z = 0.5F;
	}

	@Override
	public void a() {
		super.a();
		this.k = this.k - (0.004 + 0.04 * (double)this.z);
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bpe(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}

public class bog extends bpa {
	public bog(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, 176, 8, -5.0E-4F);
		this.j = double5;
		this.k = double6;
		this.l = double7;
		this.y *= 0.75F;
		this.x = 60 + this.r.nextInt(12);
		this.d(15916745);
	}

	@Override
	public void a(double double1, double double2, double double3) {
		this.a(this.l().d(double1, double2, double3));
		this.j();
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bog(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}

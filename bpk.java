public class bpk extends bpa {
	public bpk(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, 176, 8, -0.05F);
		this.j = double5;
		this.k = double6;
		this.l = double7;
		this.y *= 0.75F;
		this.x = 60 + this.r.nextInt(12);
		if (this.r.nextInt(4) == 0) {
			this.a(0.6F + this.r.nextFloat() * 0.2F, 0.6F + this.r.nextFloat() * 0.3F, this.r.nextFloat() * 0.2F);
		} else {
			this.a(0.1F + this.r.nextFloat() * 0.2F, 0.4F + this.r.nextFloat() * 0.3F, this.r.nextFloat() * 0.2F);
		}

		this.f(0.6F);
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bpk(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}

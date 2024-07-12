public class boh extends bou {
	protected boh(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.j = double5 + (Math.random() * 2.0 - 1.0) * 0.05F;
		this.k = double6 + (Math.random() * 2.0 - 1.0) * 0.05F;
		this.l = double7 + (Math.random() * 2.0 - 1.0) * 0.05F;
		float float15 = this.r.nextFloat() * 0.3F + 0.7F;
		this.A = float15;
		this.B = float15;
		this.C = float15;
		this.y = this.r.nextFloat() * this.r.nextFloat() * 6.0F + 1.0F;
		this.x = (int)(16.0 / ((double)this.r.nextFloat() * 0.8 + 0.2)) + 2;
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		if (this.w++ >= this.x) {
			this.i();
		}

		this.b(7 - this.w * 8 / this.x);
		this.k += 0.004;
		this.a(this.j, this.k, this.l);
		this.j *= 0.9F;
		this.k *= 0.9F;
		this.l *= 0.9F;
		if (this.m) {
			this.j *= 0.7F;
			this.l *= 0.7F;
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new boh(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}

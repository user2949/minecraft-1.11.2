public class bob extends bou {
	protected bob(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		this.A = 1.0F;
		this.B = 1.0F;
		this.C = 1.0F;
		this.b(32);
		this.a(0.02F, 0.02F);
		this.y = this.y * (this.r.nextFloat() * 0.6F + 0.2F);
		this.j = double5 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
		this.k = double6 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
		this.l = double7 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
		this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		this.k += 0.002;
		this.a(this.j, this.k, this.l);
		this.j *= 0.85F;
		this.k *= 0.85F;
		this.l *= 0.85F;
		if (this.c.o(new co(this.g, this.h, this.i)).a() != azs.h) {
			this.i();
		}

		if (this.x-- <= 0) {
			this.i();
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bob(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}

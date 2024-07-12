public class bpg extends bou {
	protected bpg(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3 - 0.125, double4, double5, double6, double7);
		this.A = 0.4F;
		this.B = 0.4F;
		this.C = 0.7F;
		this.b(0);
		this.a(0.01F, 0.01F);
		this.y = this.y * (this.r.nextFloat() * 0.6F + 0.2F);
		this.j = double5 * 0.0;
		this.k = double6 * 0.0;
		this.l = double7 * 0.0;
		this.x = (int)(16.0 / (Math.random() * 0.8 + 0.2));
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		this.a(this.j, this.k, this.l);
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
			return new bpg(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}

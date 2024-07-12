public class bph extends bou {
	protected bph(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7) {
		super(ajs, double2, double3, double4, double5, double6, double7);
		float float15 = this.r.nextFloat() * 0.1F + 0.2F;
		this.A = float15;
		this.B = float15;
		this.C = float15;
		this.b(0);
		this.a(0.02F, 0.02F);
		this.y = this.y * (this.r.nextFloat() * 0.6F + 0.5F);
		this.j *= 0.02F;
		this.k *= 0.02F;
		this.l *= 0.02F;
		this.x = (int)(20.0 / (Math.random() * 0.8 + 0.2));
	}

	@Override
	public void a(double double1, double double2, double double3) {
		this.a(this.l().d(double1, double2, double3));
		this.j();
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		this.a(this.j, this.k, this.l);
		this.j *= 0.99;
		this.k *= 0.99;
		this.l *= 0.99;
		if (this.x-- <= 0) {
			this.i();
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			bou bou17 = new bph(ajs, double3, double4, double5, double6, double7, double8);
			bou17.b(82);
			bou17.a(1.0F, 1.0F, 1.0F);
			return bou17;
		}
	}

	public static class b implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bph(ajs, double3, double4, double5, double6, double7, double8);
		}
	}
}

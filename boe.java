public class boe extends bou {
	private final azs a;
	private int b;

	protected boe(ajs ajs, double double2, double double3, double double4, azs azs) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
		this.j = 0.0;
		this.k = 0.0;
		this.l = 0.0;
		if (azs == azs.h) {
			this.A = 0.0F;
			this.B = 0.0F;
			this.C = 1.0F;
		} else {
			this.A = 1.0F;
			this.B = 0.0F;
			this.C = 0.0F;
		}

		this.b(113);
		this.a(0.01F, 0.01F);
		this.z = 0.06F;
		this.a = azs;
		this.b = 40;
		this.x = (int)(64.0 / (Math.random() * 0.8 + 0.2));
		this.j = 0.0;
		this.k = 0.0;
		this.l = 0.0;
	}

	@Override
	public int a(float float1) {
		return this.a == azs.h ? super.a(float1) : 257;
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		if (this.a == azs.h) {
			this.A = 0.2F;
			this.B = 0.3F;
			this.C = 1.0F;
		} else {
			this.A = 1.0F;
			this.B = 16.0F / (float)(40 - this.b + 16);
			this.C = 4.0F / (float)(40 - this.b + 8);
		}

		this.k = this.k - (double)this.z;
		if (this.b-- > 0) {
			this.j *= 0.02;
			this.k *= 0.02;
			this.l *= 0.02;
			this.b(113);
		} else {
			this.b(112);
		}

		this.a(this.j, this.k, this.l);
		this.j *= 0.98F;
		this.k *= 0.98F;
		this.l *= 0.98F;
		if (this.x-- <= 0) {
			this.i();
		}

		if (this.m) {
			if (this.a == azs.h) {
				this.i();
				this.c.a(de.WATER_SPLASH, this.g, this.h, this.i, 0.0, 0.0, 0.0);
			} else {
				this.b(114);
			}

			this.j *= 0.7F;
			this.l *= 0.7F;
		}

		co co2 = new co(this.g, this.h, this.i);
		atl atl3 = this.c.o(co2);
		azs azs4 = atl3.a();
		if (azs4.d() || azs4.a()) {
			double double5 = 0.0;
			if (atl3.v() instanceof aoq) {
				double5 = (double)aoq.e((Integer)atl3.c(aoq.b));
			}

			double double7 = (double)(ot.c(this.h) + 1) - double5;
			if (this.h < double7) {
				this.i();
			}
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new boe(ajs, double3, double4, double5, azs.i);
		}
	}

	public static class b implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new boe(ajs, double3, double4, double5, azs.h);
		}
	}
}

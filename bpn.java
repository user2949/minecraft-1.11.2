public class bpn extends bou {
	protected bpn(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
		this.j *= 0.3F;
		this.k = Math.random() * 0.2F + 0.1F;
		this.l *= 0.3F;
		this.A = 1.0F;
		this.B = 1.0F;
		this.C = 1.0F;
		this.b(19 + this.r.nextInt(4));
		this.a(0.01F, 0.01F);
		this.z = 0.06F;
		this.x = (int)(8.0 / (Math.random() * 0.8 + 0.2));
	}

	@Override
	public void a() {
		this.d = this.g;
		this.e = this.h;
		this.f = this.i;
		this.k = this.k - (double)this.z;
		this.a(this.j, this.k, this.l);
		this.j *= 0.98F;
		this.k *= 0.98F;
		this.l *= 0.98F;
		if (this.x-- <= 0) {
			this.i();
		}

		if (this.m) {
			if (Math.random() < 0.5) {
				this.i();
			}

			this.j *= 0.7F;
			this.l *= 0.7F;
		}

		co co2 = new co(this.g, this.h, this.i);
		atl atl3 = this.c.o(co2);
		azs azs4 = atl3.a();
		if (azs4.d() || azs4.a()) {
			double double5;
			if (atl3.v() instanceof aoq) {
				double5 = (double)(1.0F - aoq.e((Integer)atl3.c(aoq.b)));
			} else {
				double5 = atl3.d(this.c, co2).e;
			}

			double double7 = (double)ot.c(this.h) + double5;
			if (this.h < double7) {
				this.i();
			}
		}
	}

	public static class a implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			return new bpn(ajs, double3, double4, double5);
		}
	}
}

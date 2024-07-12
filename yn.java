public class yn extends ye {
	private int b;
	private int c;
	private sl d;

	public yn(yb yb) {
		super(yb);
	}

	@Override
	public void b() {
		this.b++;
		if (this.b % 2 == 0 && this.b < 10) {
			bdw bdw2 = this.a.a(1.0F).a();
			bdw2.b((float) (-Math.PI / 4));
			double double3 = this.a.bv.p;
			double double5 = this.a.bv.q + (double)(this.a.bv.H / 2.0F);
			double double7 = this.a.bv.r;

			for (int integer9 = 0; integer9 < 8; integer9++) {
				double double10 = double3 + this.a.bJ().nextGaussian() / 2.0;
				double double12 = double5 + this.a.bJ().nextGaussian() / 2.0;
				double double14 = double7 + this.a.bJ().nextGaussian() / 2.0;

				for (int integer16 = 0; integer16 < 6; integer16++) {
					this.a.l.a(de.DRAGON_BREATH, double10, double12, double14, -bdw2.b * 0.08F * (double)integer16, -bdw2.c * 0.6F, -bdw2.d * 0.08F * (double)integer16);
				}

				bdw2.b((float) (Math.PI / 16));
			}
		}
	}

	@Override
	public void c() {
		this.b++;
		if (this.b >= 200) {
			if (this.c >= 4) {
				this.a.da().a(yr.e);
			} else {
				this.a.da().a(yr.g);
			}
		} else if (this.b == 10) {
			bdw bdw2 = new bdw(this.a.bv.p - this.a.p, 0.0, this.a.bv.r - this.a.r).a();
			float float3 = 5.0F;
			double double4 = this.a.bv.p + bdw2.b * 5.0 / 2.0;
			double double6 = this.a.bv.r + bdw2.d * 5.0 / 2.0;
			double double8 = this.a.bv.q + (double)(this.a.bv.H / 2.0F);
			co.a a10 = new co.a(ot.c(double4), ot.c(double8), ot.c(double6));

			while (this.a.l.d(a10)) {
				a10.c(ot.c(double4), ot.c(--double8), ot.c(double6));
			}

			double8 = (double)(ot.c(double8) + 1);
			this.d = new sl(this.a.l, double4, double8, double6);
			this.d.a(this.a);
			this.d.a(5.0F);
			this.d.e(200);
			this.d.a(de.DRAGON_BREATH);
			this.d.a(new sh(si.g));
			this.a.l.a(this.d);
		}
	}

	@Override
	public void d() {
		this.b = 0;
		this.c++;
	}

	@Override
	public void e() {
		if (this.d != null) {
			this.d.T();
			this.d = null;
		}
	}

	@Override
	public yr<yn> i() {
		return yr.f;
	}

	public void j() {
		this.c = 0;
	}
}

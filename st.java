public class st extends sn {
	public int a;
	public int b;
	public int c;
	private int d = 5;
	private int e;
	private aay f;
	private int g;

	public st(ajs ajs, double double2, double double3, double double4, int integer) {
		super(ajs);
		this.a(0.5F, 0.5F);
		this.b(double2, double3, double4);
		this.v = (float)(Math.random() * 360.0);
		this.s = (double)((float)(Math.random() * 0.2F - 0.1F) * 2.0F);
		this.t = (double)((float)(Math.random() * 0.2) * 2.0F);
		this.u = (double)((float)(Math.random() * 0.2F - 0.1F) * 2.0F);
		this.e = integer;
	}

	@Override
	protected boolean af() {
		return false;
	}

	public st(ajs ajs) {
		super(ajs);
		this.a(0.25F, 0.25F);
	}

	@Override
	protected void i() {
	}

	@Override
	public int d(float float1) {
		float float3 = 0.5F;
		float3 = ot.a(float3, 0.0F, 1.0F);
		int integer4 = super.d(float1);
		int integer5 = integer4 & 0xFF;
		int integer6 = integer4 >> 16 & 0xFF;
		integer5 += (int)(float3 * 15.0F * 16.0F);
		if (integer5 > 240) {
			integer5 = 240;
		}

		return integer5 | integer6 << 16;
	}

	@Override
	public void A_() {
		super.A_();
		if (this.c > 0) {
			this.c--;
		}

		this.m = this.p;
		this.n = this.q;
		this.o = this.r;
		if (!this.ae()) {
			this.t -= 0.03F;
		}

		if (this.l.o(new co(this)).a() == azs.i) {
			this.t = 0.2F;
			this.s = (double)((this.S.nextFloat() - this.S.nextFloat()) * 0.2F);
			this.u = (double)((this.S.nextFloat() - this.S.nextFloat()) * 0.2F);
			this.a(nn.bL, 0.4F, 2.0F + this.S.nextFloat() * 0.4F);
		}

		this.i(this.p, (this.bo().b + this.bo().e) / 2.0, this.r);
		double double2 = 8.0;
		if (this.g < this.a - 20 + this.O() % 100) {
			if (this.f == null || this.f.h(this) > 64.0) {
				this.f = this.l.a(this, 8.0);
			}

			this.g = this.a;
		}

		if (this.f != null && this.f.y()) {
			this.f = null;
		}

		if (this.f != null) {
			double double4 = (this.f.p - this.p) / 8.0;
			double double6 = (this.f.q + (double)this.f.bq() / 2.0 - this.q) / 8.0;
			double double8 = (this.f.r - this.r) / 8.0;
			double double10 = Math.sqrt(double4 * double4 + double6 * double6 + double8 * double8);
			double double12 = 1.0 - double10;
			if (double12 > 0.0) {
				double12 *= double12;
				this.s += double4 / double10 * double12 * 0.1;
				this.t += double6 / double10 * double12 * 0.1;
				this.u += double8 / double10 * double12 * 0.1;
			}
		}

		this.a(tc.SELF, this.s, this.t, this.u);
		float float4 = 0.98F;
		if (this.z) {
			float4 = this.l.o(new co(ot.c(this.p), ot.c(this.bo().b) - 1, ot.c(this.r))).v().z * 0.98F;
		}

		this.s *= (double)float4;
		this.t *= 0.98F;
		this.u *= (double)float4;
		if (this.z) {
			this.t *= -0.9F;
		}

		this.a++;
		this.b++;
		if (this.b >= 6000) {
			this.T();
		}
	}

	@Override
	public boolean ak() {
		return this.l.a(this.bo(), azs.h, this);
	}

	@Override
	protected void j(int integer) {
		this.a(ry.a, (float)integer);
	}

	@Override
	public boolean a(ry ry, float float2) {
		if (this.b(ry)) {
			return false;
		} else {
			this.ap();
			this.d = (int)((float)this.d - float2);
			if (this.d <= 0) {
				this.T();
			}

			return false;
		}
	}

	@Override
	public void b(du du) {
		du.a("Health", (short)this.d);
		du.a("Age", (short)this.b);
		du.a("Value", (short)this.e);
	}

	@Override
	public void a(du du) {
		this.d = du.g("Health");
		this.b = du.g("Age");
		this.e = du.g("Value");
	}

	@Override
	public void d(aay aay) {
		if (!this.l.E) {
			if (this.c == 0 && aay.bz == 0) {
				aay.bz = 2;
				aay.a(this, 1);
				afj afj3 = aik.b(aim.C, aay);
				if (!afj3.b() && afj3.h()) {
					int integer4 = Math.min(this.d(this.e), afj3.i());
					this.e = this.e - this.b(integer4);
					afj3.b(afj3.i() - integer4);
				}

				if (this.e > 0) {
					aay.n(this.e);
				}

				this.T();
			}
		}
	}

	private int b(int integer) {
		return integer / 2;
	}

	private int d(int integer) {
		return integer * 2;
	}

	public int j() {
		return this.e;
	}

	public int k() {
		if (this.e >= 2477) {
			return 10;
		} else if (this.e >= 1237) {
			return 9;
		} else if (this.e >= 617) {
			return 8;
		} else if (this.e >= 307) {
			return 7;
		} else if (this.e >= 149) {
			return 6;
		} else if (this.e >= 73) {
			return 5;
		} else if (this.e >= 37) {
			return 4;
		} else if (this.e >= 17) {
			return 3;
		} else if (this.e >= 7) {
			return 2;
		} else {
			return this.e >= 3 ? 1 : 0;
		}
	}

	public static int a(int integer) {
		if (integer >= 2477) {
			return 2477;
		} else if (integer >= 1237) {
			return 1237;
		} else if (integer >= 617) {
			return 617;
		} else if (integer >= 307) {
			return 307;
		} else if (integer >= 149) {
			return 149;
		} else if (integer >= 73) {
			return 73;
		} else if (integer >= 37) {
			return 37;
		} else if (integer >= 17) {
			return 17;
		} else if (integer >= 7) {
			return 7;
		} else {
			return integer >= 3 ? 3 : 1;
		}
	}

	@Override
	public boolean aV() {
		return false;
	}
}

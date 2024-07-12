public class byc extends bvl<bpp> {
	private final boolean a;

	public byc(bur bur) {
		this(bur, false);
	}

	public byc(bur bur, boolean boolean2) {
		super(bur, new bly(0.0F, boolean2), 0.5F);
		this.a = boolean2;
		this.a(new bxk(this));
		this.a(new bxl(this));
		this.a(new bxa(this));
		this.a(new bxf(this));
		this.a(new bxb(this));
		this.a(new bxe(this.h().e));
		this.a(new bxg(this));
	}

	public bly b() {
		return (bly)super.b();
	}

	public void a(bpp bpp, double double2, double double3, double double4, float float5, float float6) {
		if (!bpp.cR() || this.b.c == bpp) {
			double double11 = double3;
			if (bpp.aM() && !(bpp instanceof bps)) {
				double11 = double3 - 0.125;
			}

			this.d(bpp);
			bqg.a(bqg.q.PLAYER_SKIN);
			super.a(bpp, double2, double11, double4, float5, float6);
			bqg.b(bqg.q.PLAYER_SKIN);
		}
	}

	private void d(bpp bpp) {
		bly bly3 = this.h();
		if (bpp.y()) {
			bly3.a(false);
			bly3.e.j = true;
			bly3.f.j = true;
		} else {
			afj afj4 = bpp.cg();
			afj afj5 = bpp.ch();
			bly3.a(true);
			bly3.f.j = bpp.a(aaz.HAT);
			bly3.u.j = bpp.a(aaz.JACKET);
			bly3.c.j = bpp.a(aaz.LEFT_PANTS_LEG);
			bly3.d.j = bpp.a(aaz.RIGHT_PANTS_LEG);
			bly3.a.j = bpp.a(aaz.LEFT_SLEEVE);
			bly3.b.j = bpp.a(aaz.RIGHT_SLEEVE);
			bly3.n = bpp.aM();
			bln.a a6 = bln.a.EMPTY;
			bln.a a7 = bln.a.EMPTY;
			if (!afj4.b()) {
				a6 = bln.a.ITEM;
				if (bpp.cC() > 0) {
					agu agu8 = afj4.n();
					if (agu8 == agu.BLOCK) {
						a6 = bln.a.BLOCK;
					} else if (agu8 == agu.BOW) {
						a6 = bln.a.BOW_AND_ARROW;
					}
				}
			}

			if (!afj5.b()) {
				a7 = bln.a.ITEM;
				if (bpp.cC() > 0) {
					agu agu8 = afj5.n();
					if (agu8 == agu.BLOCK) {
						a7 = bln.a.BLOCK;
					}
				}
			}

			if (bpp.cx() == sv.RIGHT) {
				bly3.m = a6;
				bly3.l = a7;
			} else {
				bly3.m = a7;
				bly3.l = a6;
			}
		}
	}

	protected kq a(bpp bpp) {
		return bpp.m();
	}

	@Override
	public void M_() {
		bqg.c(0.0F, 0.1875F, 0.0F);
	}

	protected void a(bpp bpp, float float2) {
		float float4 = 0.9375F;
		bqg.b(0.9375F, 0.9375F, 0.9375F);
	}

	protected void a(bpp bpp, double double2, double double3, double double4, String string, double double6) {
		if (double6 < 100.0) {
			bec bec12 = bpp.de();
			bdy bdy13 = bec12.a(2);
			if (bdy13 != null) {
				bea bea14 = bec12.c(bpp.h_(), bdy13);
				this.a(bpp, bea14.c() + " " + bdy13.d(), double2, double3, double4, 64);
				double3 += (double)((float)this.d().a * 1.15F * 0.025F);
			}
		}

		super.a(bpp, double2, double3, double4, string, double6);
	}

	public void b(bpp bpp) {
		float float3 = 1.0F;
		bqg.d(1.0F, 1.0F, 1.0F);
		float float4 = 0.0625F;
		bly bly5 = this.h();
		this.d(bpp);
		bqg.m();
		bly5.o = 0.0F;
		bly5.n = false;
		bly5.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, bpp);
		bly5.h.f = 0.0F;
		bly5.h.a(0.0625F);
		bly5.b.f = 0.0F;
		bly5.b.a(0.0625F);
		bqg.l();
	}

	public void c(bpp bpp) {
		float float3 = 1.0F;
		bqg.d(1.0F, 1.0F, 1.0F);
		float float4 = 0.0625F;
		bly bly5 = this.h();
		this.d(bpp);
		bqg.m();
		bly5.n = false;
		bly5.o = 0.0F;
		bly5.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, bpp);
		bly5.i.f = 0.0F;
		bly5.i.a(0.0625F);
		bly5.a.f = 0.0F;
		bly5.a.a(0.0625F);
		bqg.l();
	}

	protected void a(bpp bpp, double double2, double double3, double double4) {
		if (bpp.au() && bpp.cr()) {
			super.a(bpp, double2 + (double)bpp.bI, double3 + (double)bpp.cm, double4 + (double)bpp.bJ);
		} else {
			super.a(bpp, double2, double3, double4);
		}
	}

	protected void a(bpp bpp, float float2, float float3, float float4) {
		if (bpp.au() && bpp.cr()) {
			bqg.b(bpp.cT(), 0.0F, 1.0F, 0.0F);
			bqg.b(this.b(bpp), 0.0F, 0.0F, 1.0F);
			bqg.b(270.0F, 0.0F, 1.0F, 0.0F);
		} else if (bpp.cH()) {
			super.a(bpp, float2, float3, float4);
			float float6 = (float)bpp.cI() + float4;
			float float7 = ot.a(float6 * float6 / 100.0F, 0.0F, 1.0F);
			bqg.b(float7 * (-90.0F - bpp.w), 1.0F, 0.0F, 0.0F);
			bdw bdw8 = bpp.f(float4);
			double double9 = bpp.s * bpp.s + bpp.u * bpp.u;
			double double11 = bdw8.b * bdw8.b + bdw8.d * bdw8.d;
			if (double9 > 0.0 && double11 > 0.0) {
				double double13 = (bpp.s * bdw8.b + bpp.u * bdw8.d) / (Math.sqrt(double9) * Math.sqrt(double11));
				double double15 = bpp.s * bdw8.d - bpp.u * bdw8.b;
				bqg.b((float)(Math.signum(double15) * Math.acos(double13)) * 180.0F / (float) Math.PI, 0.0F, 1.0F, 0.0F);
			}
		} else {
			super.a(bpp, float2, float3, float4);
		}
	}
}

public class ug extends ui {
	private final ti d;
	private sw e;
	ajs a;
	private final double f;
	private final wf g;
	private int h;
	float b;
	float c;
	private float i;

	public ug(ti ti, double double2, float float3, float float4) {
		this.d = ti;
		this.a = ti.l;
		this.f = double2;
		this.g = ti.x();
		this.c = float3;
		this.b = float4;
		this.a(3);
		if (!(ti.x() instanceof we)) {
			throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
		}
	}

	@Override
	public boolean a() {
		sw sw2 = this.d.dk();
		if (sw2 == null) {
			return false;
		} else if (sw2 instanceof aay && ((aay)sw2).y()) {
			return false;
		} else if (this.d.dj()) {
			return false;
		} else if (this.d.h(sw2) < (double)(this.c * this.c)) {
			return false;
		} else {
			this.e = sw2;
			return true;
		}
	}

	@Override
	public boolean b() {
		return !this.g.n() && this.d.h(this.e) > (double)(this.b * this.b) && !this.d.dj();
	}

	@Override
	public void c() {
		this.h = 0;
		this.i = this.d.a(bba.WATER);
		this.d.a(bba.WATER, 0.0F);
	}

	@Override
	public void d() {
		this.e = null;
		this.g.o();
		this.d.a(bba.WATER, this.i);
	}

	private boolean a(co co) {
		atl atl3 = this.a.o(co);
		return atl3.a() == azs.a ? true : !atl3.h();
	}

	@Override
	public void e() {
		this.d.t().a(this.e, 10.0F, (float)this.d.N());
		if (!this.d.dj()) {
			if (--this.h <= 0) {
				this.h = 10;
				if (!this.g.a(this.e, this.f)) {
					if (!this.d.cW()) {
						if (!(this.d.h(this.e) < 144.0)) {
							int integer2 = ot.c(this.e.p) - 2;
							int integer3 = ot.c(this.e.r) - 2;
							int integer4 = ot.c(this.e.bo().b);

							for (int integer5 = 0; integer5 <= 4; integer5++) {
								for (int integer6 = 0; integer6 <= 4; integer6++) {
									if ((integer5 < 1 || integer6 < 1 || integer5 > 3 || integer6 > 3)
										&& this.a.o(new co(integer2 + integer5, integer4 - 1, integer3 + integer6)).r()
										&& this.a(new co(integer2 + integer5, integer4, integer3 + integer6))
										&& this.a(new co(integer2 + integer5, integer4 + 1, integer3 + integer6))) {
										this.d.b((double)((float)(integer2 + integer5) + 0.5F), (double)integer4, (double)((float)(integer3 + integer6) + 0.5F), this.d.v, this.d.w);
										this.g.o();
										return;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

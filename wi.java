public class wi extends wf {
	public wi(sx sx, ajs ajs) {
		super(sx, ajs);
	}

	@Override
	protected bbe a() {
		return new bbe(new bbf());
	}

	@Override
	protected boolean b() {
		return this.p();
	}

	@Override
	protected bdw c() {
		return new bdw(this.a.p, this.a.q + (double)this.a.H * 0.5, this.a.r);
	}

	@Override
	protected void m() {
		bdw bdw2 = this.c();
		float float3 = this.a.G * this.a.G;
		int integer4 = 6;
		if (bdw2.g(this.c.a(this.a, this.c.e())) < (double)float3) {
			this.c.a();
		}

		for (int integer5 = Math.min(this.c.e() + 6, this.c.d() - 1); integer5 > this.c.e(); integer5--) {
			bdw bdw6 = this.c.a(this.a, integer5);
			if (!(bdw6.g(bdw2) > 36.0) && this.a(bdw2, bdw6, 0, 0, 0)) {
				this.c.c(integer5);
				break;
			}
		}

		this.a(bdw2);
	}

	@Override
	protected boolean a(bdw bdw1, bdw bdw2, int integer3, int integer4, int integer5) {
		bdu bdu7 = this.b.a(bdw1, new bdw(bdw2.b, bdw2.c + (double)this.a.H * 0.5, bdw2.d), false, true, false);
		return bdu7 == null || bdu7.a == bdu.a.MISS;
	}

	@Override
	public boolean b(co co) {
		return !this.b.o(co).b();
	}
}

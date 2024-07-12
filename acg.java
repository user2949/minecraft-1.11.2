public class acg extends aby {
	private int a = -1;

	public acg(ajs ajs) {
		super(ajs);
	}

	public acg(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	public static void a(ph ph) {
		aby.a(ph, acg.class);
	}

	@Override
	public aby.a v() {
		return aby.a.TNT;
	}

	@Override
	public atl x() {
		return alv.W.t();
	}

	@Override
	public void A_() {
		super.A_();
		if (this.a > 0) {
			this.a--;
			this.l.a(de.SMOKE_NORMAL, this.p, this.q + 0.5, this.r, 0.0, 0.0, 0.0);
		} else if (this.a == 0) {
			this.c(this.s * this.s + this.u * this.u);
		}

		if (this.A) {
			double double2 = this.s * this.s + this.u * this.u;
			if (double2 >= 0.01F) {
				this.c(double2);
			}
		}
	}

	@Override
	public boolean a(ry ry, float float2) {
		sn sn4 = ry.i();
		if (sn4 instanceof abb) {
			abb abb5 = (abb)sn4;
			if (abb5.aJ()) {
				this.c(abb5.s * abb5.s + abb5.t * abb5.t + abb5.u * abb5.u);
			}
		}

		return super.a(ry, float2);
	}

	@Override
	public void a(ry ry) {
		super.a(ry);
		double double3 = this.s * this.s + this.u * this.u;
		if (!ry.c() && this.l.U().b("doEntityDrops")) {
			this.a(new afj(alv.W, 1), 0.0F);
		}

		if (ry.o() || ry.c() || double3 >= 0.01F) {
			this.c(double3);
		}
	}

	protected void c(double double1) {
		if (!this.l.E) {
			double double4 = Math.sqrt(double1);
			if (double4 > 5.0) {
				double4 = 5.0;
			}

			this.l.a(this, this.p, this.q, this.r, (float)(4.0 + this.S.nextDouble() * 1.5 * double4), true);
			this.T();
		}
	}

	@Override
	public void e(float float1, float float2) {
		if (float1 >= 3.0F) {
			float float4 = float1 / 10.0F;
			this.c((double)(float4 * float4));
		}

		super.e(float1, float2);
	}

	@Override
	public void a(int integer1, int integer2, int integer3, boolean boolean4) {
		if (boolean4 && this.a < 0) {
			this.j();
		}
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 10) {
			this.j();
		} else {
			super.a(byte1);
		}
	}

	public void j() {
		this.a = 80;
		if (!this.l.E) {
			this.l.a(this, (byte)10);
			if (!this.ad()) {
				this.l.a(null, this.p, this.q, this.r, nn.gV, no.BLOCKS, 1.0F, 1.0F);
			}
		}
	}

	public int k() {
		return this.a;
	}

	public boolean l() {
		return this.a > -1;
	}

	@Override
	public float a(ajn ajn, ajs ajs, co co, atl atl) {
		return !this.l() || !alq.i(atl) && !alq.b(ajs, co.a()) ? super.a(ajn, ajs, co, atl) : 0.0F;
	}

	@Override
	public boolean a(ajn ajn, ajs ajs, co co, atl atl, float float5) {
		return !this.l() || !alq.i(atl) && !alq.b(ajs, co.a()) ? super.a(ajn, ajs, co, atl, float5) : false;
	}

	@Override
	protected void a(du du) {
		super.a(du);
		if (du.b("TNTFuse", 99)) {
			this.a = du.h("TNTFuse");
		}
	}

	@Override
	protected void b(du du) {
		super.b(du);
		du.a("TNTFuse", this.a);
	}
}

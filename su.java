public abstract class su extends sx {
	public su(ajs ajs) {
		super(ajs);
	}

	@Override
	public void e(float float1, float float2) {
	}

	@Override
	protected void a(double double1, boolean boolean2, atl atl, co co) {
	}

	@Override
	public void g(float float1, float float2) {
		if (this.aj()) {
			this.a(float1, float2, 0.02F);
			this.a(tc.SELF, this.s, this.t, this.u);
			this.s *= 0.8F;
			this.t *= 0.8F;
			this.u *= 0.8F;
		} else if (this.ao()) {
			this.a(float1, float2, 0.02F);
			this.a(tc.SELF, this.s, this.t, this.u);
			this.s *= 0.5;
			this.t *= 0.5;
			this.u *= 0.5;
		} else {
			float float4 = 0.91F;
			if (this.z) {
				float4 = this.l.o(new co(ot.c(this.p), ot.c(this.bo().b) - 1, ot.c(this.r))).v().z * 0.91F;
			}

			float float5 = 0.16277136F / (float4 * float4 * float4);
			this.a(float1, float2, this.z ? 0.1F * float5 : 0.02F);
			float4 = 0.91F;
			if (this.z) {
				float4 = this.l.o(new co(ot.c(this.p), ot.c(this.bo().b) - 1, ot.c(this.r))).v().z * 0.91F;
			}

			this.a(tc.SELF, this.s, this.t, this.u);
			this.s *= (double)float4;
			this.t *= (double)float4;
			this.u *= (double)float4;
		}

		this.aF = this.aG;
		double double4 = this.p - this.m;
		double double6 = this.r - this.o;
		float float8 = ot.a(double4 * double4 + double6 * double6) * 4.0F;
		if (float8 > 1.0F) {
			float8 = 1.0F;
		}

		this.aG = this.aG + (float8 - this.aG) * 0.4F;
		this.aH = this.aH + this.aG;
	}

	@Override
	public boolean m_() {
		return false;
	}
}

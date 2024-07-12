public class tv {
	private final sx a;
	private float b;
	private float c;
	private boolean d;
	private double e;
	private double f;
	private double g;

	public tv(sx sx) {
		this.a = sx;
	}

	public void a(sn sn, float float2, float float3) {
		this.e = sn.p;
		if (sn instanceof sw) {
			this.f = sn.q + (double)sn.bq();
		} else {
			this.f = (sn.bo().b + sn.bo().e) / 2.0;
		}

		this.g = sn.r;
		this.b = float2;
		this.c = float3;
		this.d = true;
	}

	public void a(double double1, double double2, double double3, float float4, float float5) {
		this.e = double1;
		this.f = double2;
		this.g = double3;
		this.b = float4;
		this.c = float5;
		this.d = true;
	}

	public void a() {
		this.a.w = 0.0F;
		if (this.d) {
			this.d = false;
			double double2 = this.e - this.a.p;
			double double4 = this.f - (this.a.q + (double)this.a.bq());
			double double6 = this.g - this.a.r;
			double double8 = (double)ot.a(double2 * double2 + double6 * double6);
			float float10 = (float)(ot.c(double6, double2) * 180.0F / (float)Math.PI) - 90.0F;
			float float11 = (float)(-(ot.c(double4, double8) * 180.0F / (float)Math.PI));
			this.a.w = this.a(this.a.w, float11, this.c);
			this.a.aP = this.a(this.a.aP, float10, this.b);
		} else {
			this.a.aP = this.a(this.a.aP, this.a.aN, 10.0F);
		}

		float float2 = ot.g(this.a.aP - this.a.aN);
		if (!this.a.x().n()) {
			if (float2 < -75.0F) {
				this.a.aP = this.a.aN - 75.0F;
			}

			if (float2 > 75.0F) {
				this.a.aP = this.a.aN + 75.0F;
			}
		}
	}

	private float a(float float1, float float2, float float3) {
		float float5 = ot.g(float2 - float1);
		if (float5 > float3) {
			float5 = float3;
		}

		if (float5 < -float3) {
			float5 = -float3;
		}

		return float1 + float5;
	}

	public boolean b() {
		return this.d;
	}

	public double e() {
		return this.e;
	}

	public double f() {
		return this.f;
	}

	public double g() {
		return this.g;
	}
}

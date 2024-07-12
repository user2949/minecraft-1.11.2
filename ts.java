public class ts {
	private final sw a;
	private int b;
	private float c;

	public ts(sw sw) {
		this.a = sw;
	}

	public void a() {
		double double2 = this.a.p - this.a.m;
		double double4 = this.a.r - this.a.o;
		if (double2 * double2 + double4 * double4 > 2.5000003E-7F) {
			this.a.aN = this.a.v;
			this.a.aP = this.a(this.a.aN, this.a.aP, 75.0F);
			this.c = this.a.aP;
			this.b = 0;
		} else {
			if (this.a.bx().isEmpty() || !(this.a.bx().get(0) instanceof sx)) {
				float float6 = 75.0F;
				if (Math.abs(this.a.aP - this.c) > 15.0F) {
					this.b = 0;
					this.c = this.a.aP;
				} else {
					this.b++;
					int integer7 = 10;
					if (this.b > 10) {
						float6 = Math.max(1.0F - (float)(this.b - 10) / 10.0F, 0.0F) * 75.0F;
					}
				}

				this.a.aN = this.a(this.a.aP, this.a.aN, float6);
			}
		}
	}

	private float a(float float1, float float2, float float3) {
		float float5 = ot.g(float1 - float2);
		if (float5 < -float3) {
			float5 = -float3;
		}

		if (float5 >= float3) {
			float5 = float3;
		}

		return float1 - float5;
	}
}

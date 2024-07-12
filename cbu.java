public class cbu extends cbt {
	private final bps m;
	private int n;

	public cbu(bps bps) {
		super(nn.aN, no.PLAYERS);
		this.m = bps;
		this.i = true;
		this.j = 0;
		this.d = 0.1F;
	}

	@Override
	public void F_() {
		this.n++;
		if (!this.m.F && (this.n <= 20 || this.m.cH())) {
			this.f = (float)this.m.p;
			this.g = (float)this.m.q;
			this.h = (float)this.m.r;
			float float2 = ot.a(this.m.s * this.m.s + this.m.u * this.m.u + this.m.t * this.m.t);
			float float3 = float2 / 2.0F;
			if ((double)float2 >= 0.01) {
				this.d = ot.a(float3 * float3, 0.0F, 1.0F);
			} else {
				this.d = 0.0F;
			}

			if (this.n < 20) {
				this.d = 0.0F;
			} else if (this.n < 40) {
				this.d = (float)((double)this.d * ((double)(this.n - 20) / 20.0));
			}

			float float4 = 0.8F;
			if (this.d > 0.8F) {
				this.e = 1.0F + (this.d - 0.8F);
			} else {
				this.e = 1.0F;
			}
		} else {
			this.l = true;
		}
	}
}

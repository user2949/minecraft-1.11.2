public class cbw extends cbt {
	private final aby m;
	private float n = 0.0F;

	public cbw(aby aby) {
		super(nn.dU, no.NEUTRAL);
		this.m = aby;
		this.i = true;
		this.j = 0;
	}

	@Override
	public void F_() {
		if (this.m.F) {
			this.l = true;
		} else {
			this.f = (float)this.m.p;
			this.g = (float)this.m.q;
			this.h = (float)this.m.r;
			float float2 = ot.a(this.m.s * this.m.s + this.m.u * this.m.u);
			if ((double)float2 >= 0.01) {
				this.n = ot.a(this.n + 0.0025F, 0.0F, 1.0F);
				this.d = 0.0F + ot.a(float2, 0.0F, 0.5F) * 0.7F;
			} else {
				this.n = 0.0F;
				this.d = 0.0F;
			}
		}
	}
}

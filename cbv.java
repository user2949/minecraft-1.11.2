public class cbv extends cbt {
	private final zx m;

	public cbv(zx zx) {
		super(nn.cs, no.HOSTILE);
		this.m = zx;
		this.k = ccc.a.NONE;
		this.i = true;
		this.j = 0;
	}

	@Override
	public void F_() {
		if (!this.m.F && this.m.dl()) {
			this.f = (float)this.m.p;
			this.g = (float)this.m.q;
			this.h = (float)this.m.r;
			float float2 = this.m.s(0.0F);
			this.d = 0.0F + 1.0F * float2 * float2;
			this.e = 0.7F + 0.5F * float2;
		} else {
			this.l = true;
		}
	}
}

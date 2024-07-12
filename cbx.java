public class cbx extends cbt {
	private final aay m;
	private final aby n;

	public cbx(aay aay, aby aby) {
		super(nn.dT, no.NEUTRAL);
		this.m = aay;
		this.n = aby;
		this.k = ccc.a.NONE;
		this.i = true;
		this.j = 0;
	}

	@Override
	public void F_() {
		if (!this.n.F && this.m.aK() && this.m.bB() == this.n) {
			float float2 = ot.a(this.n.s * this.n.s + this.n.u * this.n.u);
			if ((double)float2 >= 0.01) {
				this.d = 0.0F + ot.a(float2, 0.0F, 1.0F) * 0.75F;
			} else {
				this.d = 0.0F;
			}
		} else {
			this.l = true;
		}
	}
}

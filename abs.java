public class abs extends abp {
	public abs(ajs ajs) {
		super(ajs);
	}

	public abs(ajs ajs, sw sw) {
		super(ajs, sw);
	}

	public abs(ajs ajs, double double2, double double3, double double4) {
		super(ajs, double2, double3, double4);
	}

	public static void a(ph ph) {
		abp.a(ph, "ThrowableExpBottle");
	}

	@Override
	protected float j() {
		return 0.07F;
	}

	@Override
	protected void a(bdu bdu) {
		if (!this.l.E) {
			this.l.b(2002, new co(this), aha.a(ahb.b));
			int integer3 = 3 + this.l.r.nextInt(5) + this.l.r.nextInt(5);

			while (integer3 > 0) {
				int integer4 = st.a(integer3);
				integer3 -= integer4;
				this.l.a(new st(this.l, this.p, this.q, this.r, integer4));
			}

			this.T();
		}
	}
}

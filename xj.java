public abstract class xj extends sx implements sm {
	public xj(ajs ajs) {
		super(ajs);
	}

	@Override
	public boolean bF() {
		return true;
	}

	@Override
	public boolean cM() {
		return true;
	}

	@Override
	public boolean cN() {
		return this.l.a(this.bo(), this);
	}

	@Override
	public int C() {
		return 120;
	}

	@Override
	protected boolean K() {
		return true;
	}

	@Override
	protected int b(aay aay) {
		return 1 + this.l.r.nextInt(3);
	}

	@Override
	public void U() {
		int integer2 = this.aR();
		super.U();
		if (this.au() && !this.aj()) {
			this.l(--integer2);
			if (this.aR() == -20) {
				this.l(0);
				this.a(ry.h, 2.0F);
			}
		} else {
			this.l(300);
		}
	}

	@Override
	public boolean bg() {
		return false;
	}
}

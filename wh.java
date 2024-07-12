public class wh extends we {
	private co f;

	public wh(sx sx, ajs ajs) {
		super(sx, ajs);
	}

	@Override
	public bbd a(co co) {
		this.f = co;
		return super.a(co);
	}

	@Override
	public bbd a(sn sn) {
		this.f = new co(sn);
		return super.a(sn);
	}

	@Override
	public boolean a(sn sn, double double2) {
		bbd bbd5 = this.a(sn);
		if (bbd5 != null) {
			return this.a(bbd5, double2);
		} else {
			this.f = new co(sn);
			this.d = double2;
			return true;
		}
	}

	@Override
	public void l() {
		if (!this.n()) {
			super.l();
		} else {
			if (this.f != null) {
				double double2 = (double)(this.a.G * this.a.G);
				if (!(this.a.d(this.f) < double2) && (!(this.a.q > (double)this.f.q()) || !(this.a.d(new co(this.f.p(), ot.c(this.a.q), this.f.r())) < double2))) {
					this.a.u().a((double)this.f.p(), (double)this.f.q(), (double)this.f.r(), this.d);
				} else {
					this.f = null;
				}
			}
		}
	}
}

public class vp extends ui {
	private final aat a;

	public vp(aat aat) {
		this.a = aat;
		this.a(5);
	}

	@Override
	public boolean a() {
		if (!this.a.au()) {
			return false;
		} else if (this.a.aj()) {
			return false;
		} else if (!this.a.z) {
			return false;
		} else if (this.a.D) {
			return false;
		} else {
			aay aay2 = this.a.s_();
			if (aay2 == null) {
				return false;
			} else {
				return this.a.h(aay2) > 16.0 ? false : aay2.bu != null;
			}
		}
	}

	@Override
	public void c() {
		this.a.x().o();
	}

	@Override
	public void d() {
		this.a.a_(null);
	}
}

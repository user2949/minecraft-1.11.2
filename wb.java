public class wb extends wc {
	ti a;
	sw b;
	private int c;

	public wb(ti ti) {
		super(ti, false);
		this.a = ti;
		this.a(1);
	}

	@Override
	public boolean a() {
		if (!this.a.dh()) {
			return false;
		} else {
			sw sw2 = this.a.dk();
			if (sw2 == null) {
				return false;
			} else {
				this.b = sw2.bM();
				int integer3 = sw2.bN();
				return integer3 != this.c && this.a(this.b, false) && this.a.a(this.b, sw2);
			}
		}
	}

	@Override
	public void c() {
		this.e.d(this.b);
		sw sw2 = this.a.dk();
		if (sw2 != null) {
			this.c = sw2.bN();
		}

		super.c();
	}
}

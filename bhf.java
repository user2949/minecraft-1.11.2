public class bhf extends bgr {
	@Override
	public void b() {
		super.b();
		this.n.add(new bfm(1, this.l / 2 - 100, this.m - 40, cah.a("multiplayer.stopSleeping")));
	}

	@Override
	protected void a(char character, int integer) {
		if (integer == 1) {
			this.a();
		} else if (integer != 28 && integer != 156) {
			super.a(character, integer);
		} else {
			String string4 = this.a.b().trim();
			if (!string4.isEmpty()) {
				this.j.h.g(string4);
			}

			this.a.a("");
			this.j.r.d().c();
		}
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 1) {
			this.a();
		} else {
			super.a(bfm);
		}
	}

	private void a() {
		bno bno2 = this.j.h.d;
		bno2.a(new je(this.j.h, je.a.STOP_SLEEPING));
	}
}

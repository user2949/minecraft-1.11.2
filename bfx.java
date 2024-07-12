public class bfx extends bfm {
	private boolean o;

	public bfx(int integer1, int integer2, int integer3) {
		super(integer1, integer2, integer3, 20, 20, "");
	}

	public boolean c() {
		return this.o;
	}

	public void b(boolean boolean1) {
		this.o = boolean1;
	}

	@Override
	public void a(bes bes, int integer2, int integer3) {
		if (this.m) {
			bes.N().a(bfm.a);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			boolean boolean5 = integer2 >= this.h && integer3 >= this.i && integer2 < this.h + this.f && integer3 < this.i + this.g;
			bfx.a a6;
			if (this.o) {
				if (!this.l) {
					a6 = bfx.a.LOCKED_DISABLED;
				} else if (boolean5) {
					a6 = bfx.a.LOCKED_HOVER;
				} else {
					a6 = bfx.a.LOCKED;
				}
			} else if (!this.l) {
				a6 = bfx.a.UNLOCKED_DISABLED;
			} else if (boolean5) {
				a6 = bfx.a.UNLOCKED_HOVER;
			} else {
				a6 = bfx.a.UNLOCKED;
			}

			this.b(this.h, this.i, a6.a(), a6.b(), this.f, this.g);
		}
	}

	static enum a {
		LOCKED(0, 146),
		LOCKED_HOVER(0, 166),
		LOCKED_DISABLED(0, 186),
		UNLOCKED(20, 146),
		UNLOCKED_HOVER(20, 166),
		UNLOCKED_DISABLED(20, 186);

		private final int g;
		private final int h;

		private a(int integer3, int integer4) {
			this.g = integer3;
			this.h = integer4;
		}

		public int a() {
			return this.g;
		}

		public int b() {
			return this.h;
		}
	}
}

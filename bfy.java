public abstract class bfy extends bgd {
	public bfy(bes bes, int integer2, int integer3, int integer4, int integer5, int integer6) {
		super(bes, integer2, integer3, integer4, integer5, integer6);
	}

	@Override
	protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
	}

	@Override
	protected boolean a(int integer) {
		return false;
	}

	@Override
	protected void a() {
	}

	@Override
	protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.b(integer1).a(integer1, integer2, integer3, this.c(), integer4, integer5, integer6, this.g(integer6) && this.c(integer5, integer6) == integer1);
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		this.b(integer1).a(integer1, integer2, integer3);
	}

	public boolean b(int integer1, int integer2, int integer3) {
		if (this.g(integer2)) {
			int integer5 = this.c(integer1, integer2);
			if (integer5 >= 0) {
				int integer6 = this.g + this.b / 2 - this.c() / 2 + 2;
				int integer7 = this.d + 4 - this.n() + integer5 * this.h + this.t;
				int integer8 = integer1 - integer6;
				int integer9 = integer2 - integer7;
				if (this.b(integer5).a(integer5, integer1, integer2, integer3, integer8, integer9)) {
					this.d(false);
					return true;
				}
			}
		}

		return false;
	}

	public boolean c(int integer1, int integer2, int integer3) {
		for (int integer5 = 0; integer5 < this.b(); integer5++) {
			int integer6 = this.g + this.b / 2 - this.c() / 2 + 2;
			int integer7 = this.d + 4 - this.n() + integer5 * this.h + this.t;
			int integer8 = integer1 - integer6;
			int integer9 = integer2 - integer7;
			this.b(integer5).b(integer5, integer1, integer2, integer3, integer8, integer9);
		}

		this.d(true);
		return false;
	}

	public abstract bfy.a b(int integer);

	public interface a {
		void a(int integer1, int integer2, int integer3);

		void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, boolean boolean8);

		boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6);

		void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6);
	}
}

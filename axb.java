import java.util.Random;

public abstract class axb extends avz {
	protected final int a;
	protected final atl b;
	protected final atl c;
	protected int d;

	public axb(boolean boolean1, int integer2, int integer3, atl atl4, atl atl5) {
		super(boolean1);
		this.a = integer2;
		this.d = integer3;
		this.b = atl4;
		this.c = atl5;
	}

	protected int a(Random random) {
		int integer3 = random.nextInt(3) + this.a;
		if (this.d > 1) {
			integer3 += random.nextInt(this.d);
		}

		return integer3;
	}

	private boolean c(ajs ajs, co co, int integer) {
		boolean boolean5 = true;
		if (co.q() >= 1 && co.q() + integer + 1 <= 256) {
			for (int integer6 = 0; integer6 <= 1 + integer; integer6++) {
				int integer7 = 2;
				if (integer6 == 0) {
					integer7 = 1;
				} else if (integer6 >= 1 + integer - 2) {
					integer7 = 2;
				}

				for (int integer8 = -integer7; integer8 <= integer7 && boolean5; integer8++) {
					for (int integer9 = -integer7; integer9 <= integer7 && boolean5; integer9++) {
						if (co.q() + integer6 < 0 || co.q() + integer6 >= 256 || !this.a(ajs.o(co.a(integer8, integer6, integer9)).v())) {
							boolean5 = false;
						}
					}
				}
			}

			return boolean5;
		} else {
			return false;
		}
	}

	private boolean a(co co, ajs ajs) {
		co co4 = co.b();
		alu alu5 = ajs.o(co4).v();
		if ((alu5 == alv.c || alu5 == alv.d) && co.q() >= 2) {
			this.a(ajs, co4);
			this.a(ajs, co4.f());
			this.a(ajs, co4.d());
			this.a(ajs, co4.d().f());
			return true;
		} else {
			return false;
		}
	}

	protected boolean a(ajs ajs, Random random, co co, int integer) {
		return this.c(ajs, co, integer) && this.a(co, ajs);
	}

	protected void a(ajs ajs, co co, int integer) {
		int integer5 = integer * integer;

		for (int integer6 = -integer; integer6 <= integer + 1; integer6++) {
			for (int integer7 = -integer; integer7 <= integer + 1; integer7++) {
				int integer8 = integer6 - 1;
				int integer9 = integer7 - 1;
				if (integer6 * integer6 + integer7 * integer7 <= integer5
					|| integer8 * integer8 + integer9 * integer9 <= integer5
					|| integer6 * integer6 + integer9 * integer9 <= integer5
					|| integer8 * integer8 + integer7 * integer7 <= integer5) {
					co co10 = co.a(integer6, 0, integer7);
					azs azs11 = ajs.o(co10).a();
					if (azs11 == azs.a || azs11 == azs.j) {
						this.a(ajs, co10, this.c);
					}
				}
			}
		}
	}

	protected void b(ajs ajs, co co, int integer) {
		int integer5 = integer * integer;

		for (int integer6 = -integer; integer6 <= integer; integer6++) {
			for (int integer7 = -integer; integer7 <= integer; integer7++) {
				if (integer6 * integer6 + integer7 * integer7 <= integer5) {
					co co8 = co.a(integer6, 0, integer7);
					azs azs9 = ajs.o(co8).a();
					if (azs9 == azs.a || azs9 == azs.j) {
						this.a(ajs, co8, this.c);
					}
				}
			}
		}
	}
}

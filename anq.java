import java.util.Random;

public class anq extends aok {
	public static final aua a = aua.a("age", 0, 3);

	public anq() {
		this.y(this.A.b().a(a, 0));
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(a);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, ot.a(integer, 0, 3));
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if ((random.nextInt(3) == 0 || this.c(ajs, co) < 4) && ajs.k(co) > 11 - (Integer)atl.c(a) - atl.c()) {
			this.a(ajs, co, atl, random, true);
		} else {
			ajs.a(co, this, ot.a(random, 20, 40));
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (alu == this) {
			int integer7 = this.c(ajs, co3);
			if (integer7 < 2) {
				this.b(ajs, co3);
			}
		}
	}

	private int c(ajs ajs, co co) {
		int integer4 = 0;

		for (cv cv8 : cv.values()) {
			if (ajs.o(co.a(cv8)).v() == this) {
				if (++integer4 >= 4) {
					return integer4;
				}
			}
		}

		return integer4;
	}

	protected void a(ajs ajs, co co, atl atl, Random random, boolean boolean5) {
		int integer7 = (Integer)atl.c(a);
		if (integer7 < 3) {
			ajs.a(co, atl.a(a, integer7 + 1), 2);
			ajs.a(co, this, ot.a(random, 20, 40));
		} else {
			this.b(ajs, co);
			if (boolean5) {
				for (cv cv11 : cv.values()) {
					co co12 = co.a(cv11);
					atl atl13 = ajs.o(co12);
					if (atl13.v() == this) {
						this.a(ajs, co12, atl13, random, false);
					}
				}
			}
		}
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return afj.a;
	}
}

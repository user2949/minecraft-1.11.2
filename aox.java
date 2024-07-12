import java.util.Random;

public class aox extends ama implements alx {
	protected static final bdt a = new bdt(0.3F, 0.0, 0.3F, 0.7F, 0.4F, 0.7F);

	protected aox() {
		this.a(true);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return a;
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (random.nextInt(25) == 0) {
			int integer6 = 5;
			int integer7 = 4;

			for (co co9 : co.b(co.a(-4, -1, -4), co.a(4, 1, 4))) {
				if (ajs.o(co9).v() == this) {
					if (--integer6 <= 0) {
						return;
					}
				}
			}

			co co8 = co.a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);

			for (int integer9 = 0; integer9 < 4; integer9++) {
				if (ajs.d(co8) && this.f(ajs, co8, this.t())) {
					co = co8;
				}

				co8 = co.a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
			}

			if (ajs.d(co8) && this.f(ajs, co8, this.t())) {
				ajs.a(co8, this.t(), 2);
			}
		}
	}

	@Override
	public boolean a(ajs ajs, co co) {
		return super.a(ajs, co) && this.f(ajs, co, this.t());
	}

	@Override
	protected boolean i(atl atl) {
		return atl.b();
	}

	@Override
	public boolean f(ajs ajs, co co, atl atl) {
		if (co.q() >= 0 && co.q() < 256) {
			atl atl5 = ajs.o(co.b());
			if (atl5.v() == alv.bw) {
				return true;
			} else {
				return atl5.v() == alv.d && atl5.c(amv.a) == amv.a.PODZOL ? true : ajs.j(co) < 13 && this.i(atl5);
			}
		} else {
			return false;
		}
	}

	public boolean c(ajs ajs, co co, atl atl, Random random) {
		ajs.g(co);
		awn awn6 = null;
		if (this == alv.P) {
			awn6 = new awu(alv.bg);
		} else if (this == alv.Q) {
			awn6 = new awu(alv.bh);
		}

		if (awn6 != null && awn6.b(ajs, random, co)) {
			return true;
		} else {
			ajs.a(co, atl, 3);
			return false;
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, boolean boolean4) {
		return true;
	}

	@Override
	public boolean a(ajs ajs, Random random, co co, atl atl) {
		return (double)random.nextFloat() < 0.4;
	}

	@Override
	public void b(ajs ajs, Random random, co co, atl atl) {
		this.c(ajs, co, atl, random);
	}
}

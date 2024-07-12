import java.util.Random;

public class ara extends aoq {
	protected ara(azs azs) {
		super(azs);
		this.a(false);
		if (azs == azs.i) {
			this.a(true);
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		if (!this.e(ajs, co3, atl)) {
			this.f(ajs, co3, atl);
		}
	}

	private void f(ajs ajs, co co, atl atl) {
		anb anb5 = a(this.x);
		ajs.a(co, anb5.t().a(b, atl.c(b)), 2);
		ajs.a(co, anb5, this.a(ajs));
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (this.x == azs.i) {
			if (ajs.U().b("doFireTick")) {
				int integer6 = random.nextInt(3);
				if (integer6 > 0) {
					co co7 = co;

					for (int integer8 = 0; integer8 < integer6; integer8++) {
						co7 = co7.a(random.nextInt(3) - 1, 1, random.nextInt(3) - 1);
						if (co7.q() >= 0 && co7.q() < 256 && !ajs.e(co7)) {
							return;
						}

						alu alu9 = ajs.o(co7).v();
						if (alu9.x == azs.a) {
							if (this.c(ajs, co7)) {
								ajs.a(co7, alv.ab.t());
								return;
							}
						} else if (alu9.x.c()) {
							return;
						}
					}
				} else {
					for (int integer7 = 0; integer7 < 3; integer7++) {
						co co8 = co.a(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
						if (co8.q() >= 0 && co8.q() < 256 && !ajs.e(co8)) {
							return;
						}

						if (ajs.d(co8.a()) && this.d(ajs, co8)) {
							ajs.a(co8.a(), alv.ab.t());
						}
					}
				}
			}
		}
	}

	protected boolean c(ajs ajs, co co) {
		for (cv cv7 : cv.values()) {
			if (this.d(ajs, co.a(cv7))) {
				return true;
			}
		}

		return false;
	}

	private boolean d(ajs ajs, co co) {
		return co.q() >= 0 && co.q() < 256 && !ajs.e(co) ? false : ajs.o(co).a().h();
	}
}

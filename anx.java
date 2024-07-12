import java.util.Random;

public class anx extends alu implements alx {
	public static final atx a = atx.a("snowy");

	protected anx() {
		super(azs.b);
		this.y(this.A.b().a(a, false));
		this.a(true);
		this.a(aej.b);
	}

	@Override
	public atl c(atl atl, ajw ajw, co co) {
		alu alu5 = ajw.o(co.a()).v();
		return atl.a(a, alu5 == alv.aJ || alu5 == alv.aH);
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			if (ajs.k(co.a()) < 4 && ajs.o(co.a()).c() > 2) {
				ajs.a(co, alv.d.t());
			} else {
				if (ajs.k(co.a()) >= 9) {
					for (int integer6 = 0; integer6 < 4; integer6++) {
						co co7 = co.a(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
						if (co7.q() >= 0 && co7.q() < 256 && !ajs.e(co7)) {
							return;
						}

						atl atl8 = ajs.o(co7.a());
						atl atl9 = ajs.o(co7);
						if (atl9.v() == alv.d && atl9.c(amv.a) == amv.a.DIRT && ajs.k(co7.a()) >= 4 && atl8.c() <= 2) {
							ajs.a(co7, alv.c.t());
						}
					}
				}
			}
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return alv.d.a(alv.d.t().a(amv.a, amv.a.DIRT), random, integer);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, boolean boolean4) {
		return true;
	}

	@Override
	public boolean a(ajs ajs, Random random, co co, atl atl) {
		return true;
	}

	@Override
	public void b(ajs ajs, Random random, co co, atl atl) {
		co co6 = co.a();

		label38:
		for (int integer7 = 0; integer7 < 128; integer7++) {
			co co8 = co6;

			for (int integer9 = 0; integer9 < integer7 / 16; integer9++) {
				co8 = co8.a(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
				if (ajs.o(co8.b()).v() != alv.c || ajs.o(co8).m()) {
					continue label38;
				}
			}

			if (ajs.o(co8).v().x == azs.a) {
				if (random.nextInt(8) == 0) {
					ano.a a9 = ajs.b(co8).a(random, co8);
					ano ano10 = a9.a().a();
					atl atl11 = ano10.t().a(ano10.g(), a9);
					if (ano10.f(ajs, co8, atl11)) {
						ajs.a(co8, atl11, 3);
					}
				} else {
					atl atl9 = alv.H.t().a(ari.a, ari.a.GRASS);
					if (alv.H.f(ajs, co8, atl9)) {
						ajs.a(co8, atl9, 3);
					}
				}
			}
		}
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT_MIPPED;
	}

	@Override
	public int e(atl atl) {
		return 0;
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}
}

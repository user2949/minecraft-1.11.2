import java.util.Random;

public class aoy extends alu {
	public static final atx a = atx.a("snowy");

	protected aoy() {
		super(azs.b, azt.z);
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
				ajs.a(co, alv.d.t().a(amv.a, amv.a.DIRT));
			} else {
				if (ajs.k(co.a()) >= 9) {
					for (int integer6 = 0; integer6 < 4; integer6++) {
						co co7 = co.a(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
						atl atl8 = ajs.o(co7);
						atl atl9 = ajs.o(co7.a());
						if (atl8.v() == alv.d && atl8.c(amv.a) == amv.a.DIRT && ajs.k(co7.a()) >= 4 && atl9.c() <= 2) {
							ajs.a(co7, this.t());
						}
					}
				}
			}
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		super.a(atl, ajs, co, random);
		if (random.nextInt(10) == 0) {
			ajs.a(
				de.TOWN_AURA, (double)((float)co.p() + random.nextFloat()), (double)((float)co.q() + 1.1F), (double)((float)co.r() + random.nextFloat()), 0.0, 0.0, 0.0
			);
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return alv.d.a(alv.d.t().a(amv.a, amv.a.DIRT), random, integer);
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

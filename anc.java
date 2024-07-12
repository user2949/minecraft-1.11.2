import java.util.Random;

public class anc extends alo {
	protected static final bdt a = new bdt(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);

	protected anc() {
		super(azs.e, azt.D);
		this.d(0);
		this.a(aej.c);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return a;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		super.a(atl, ajs, co, random);

		for (int integer6 = -2; integer6 <= 2; integer6++) {
			for (int integer7 = -2; integer7 <= 2; integer7++) {
				if (integer6 > -2 && integer6 < 2 && integer7 == -1) {
					integer7 = 2;
				}

				if (random.nextInt(16) == 0) {
					for (int integer8 = 0; integer8 <= 1; integer8++) {
						co co9 = co.a(integer6, integer8, integer7);
						if (ajs.o(co9).v() == alv.X) {
							if (!ajs.d(co.a(integer6 / 2, 0, integer7 / 2))) {
								break;
							}

							ajs.a(
								de.ENCHANTMENT_TABLE,
								(double)co.p() + 0.5,
								(double)co.q() + 2.0,
								(double)co.r() + 0.5,
								(double)((float)integer6 + random.nextFloat()) - 0.5,
								(double)((float)integer8 - random.nextFloat() - 1.0F),
								(double)((float)integer7 + random.nextFloat()) - 0.5
							);
						}
					}
				}
			}
		}
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new ask();
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			asc asc11 = ajs.r(co);
			if (asc11 instanceof ask) {
				aay.a((ask)asc11);
			}

			return true;
		}
	}

	@Override
	public void a(ajs ajs, co co, atl atl, sw sw, afj afj) {
		super.a(ajs, co, atl, sw, afj);
		if (afj.t()) {
			asc asc7 = ajs.r(co);
			if (asc7 instanceof ask) {
				((ask)asc7).a(afj.r());
			}
		}
	}
}

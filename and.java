import java.util.Random;
import javax.annotation.Nullable;

public class and extends alo {
	protected and(azs azs) {
		super(azs);
		this.a(1.0F);
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asy();
	}

	@Override
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		atl atl6 = ajw.o(co.a(cv));
		alu alu7 = atl6.v();
		return !atl6.q() && alu7 != alv.db;
	}

	@Nullable
	@Override
	public bdt a(atl atl, ajw ajw, co co) {
		return k;
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public boolean c(atl atl) {
		return false;
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		asc asc6 = ajs.r(co);
		if (asc6 instanceof asy) {
			int integer7 = ((asy)asc6).h();

			for (int integer8 = 0; integer8 < integer7; integer8++) {
				double double9 = (double)((float)co.p() + random.nextFloat());
				double double11 = (double)((float)co.q() + random.nextFloat());
				double double13 = (double)((float)co.r() + random.nextFloat());
				double double15 = ((double)random.nextFloat() - 0.5) * 0.5;
				double double17 = ((double)random.nextFloat() - 0.5) * 0.5;
				double double19 = ((double)random.nextFloat() - 0.5) * 0.5;
				int integer21 = random.nextInt(2) * 2 - 1;
				if (random.nextBoolean()) {
					double13 = (double)co.r() + 0.5 + 0.25 * (double)integer21;
					double19 = (double)(random.nextFloat() * 2.0F * (float)integer21);
				} else {
					double9 = (double)co.p() + 0.5 + 0.25 * (double)integer21;
					double15 = (double)(random.nextFloat() * 2.0F * (float)integer21);
				}

				ajs.a(de.PORTAL, double9, double11, double13, double15, double17, double19);
			}
		}
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return afj.a;
	}

	@Override
	public azt r(atl atl) {
		return azt.E;
	}
}

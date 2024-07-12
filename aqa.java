import java.util.Random;

public class aqa extends alu {
	private final boolean a;

	public aqa(boolean boolean1) {
		super(azs.e);
		if (boolean1) {
			this.a(true);
		}

		this.a = boolean1;
	}

	@Override
	public int a(ajs ajs) {
		return 30;
	}

	@Override
	public void a(ajs ajs, co co, aay aay) {
		this.b(ajs, co);
		super.a(ajs, co, aay);
	}

	@Override
	public void a(ajs ajs, co co, sn sn) {
		this.b(ajs, co);
		super.a(ajs, co, sn);
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		this.b(ajs, co);
		return super.a(ajs, co, atl, aay, ri, cv, float7, float8, float9);
	}

	private void b(ajs ajs, co co) {
		this.c(ajs, co);
		if (this == alv.aC) {
			ajs.a(co, alv.aD.t());
		}
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (this == alv.aD) {
			ajs.a(co, alv.aC.t());
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.aF;
	}

	@Override
	public int a(int integer, Random random) {
		return this.a(random) + random.nextInt(integer + 1);
	}

	@Override
	public int a(Random random) {
		return 4 + random.nextInt(2);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		super.a(ajs, co, atl, float4, integer);
		if (this.a(atl, ajs.r, integer) != afh.a(this)) {
			int integer7 = 1 + ajs.r.nextInt(5);
			this.b(ajs, co, integer7);
		}
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		if (this.a) {
			this.c(ajs, co);
		}
	}

	private void c(ajs ajs, co co) {
		Random random4 = ajs.r;
		double double5 = 0.0625;

		for (int integer7 = 0; integer7 < 6; integer7++) {
			double double8 = (double)((float)co.p() + random4.nextFloat());
			double double10 = (double)((float)co.q() + random4.nextFloat());
			double double12 = (double)((float)co.r() + random4.nextFloat());
			if (integer7 == 0 && !ajs.o(co.a()).q()) {
				double10 = (double)co.q() + 0.0625 + 1.0;
			}

			if (integer7 == 1 && !ajs.o(co.b()).q()) {
				double10 = (double)co.q() - 0.0625;
			}

			if (integer7 == 2 && !ajs.o(co.d()).q()) {
				double12 = (double)co.r() + 0.0625 + 1.0;
			}

			if (integer7 == 3 && !ajs.o(co.c()).q()) {
				double12 = (double)co.r() - 0.0625;
			}

			if (integer7 == 4 && !ajs.o(co.f()).q()) {
				double8 = (double)co.p() + 0.0625 + 1.0;
			}

			if (integer7 == 5 && !ajs.o(co.e()).q()) {
				double8 = (double)co.p() - 0.0625;
			}

			if (double8 < (double)co.p()
				|| double8 > (double)(co.p() + 1)
				|| double10 < 0.0
				|| double10 > (double)(co.q() + 1)
				|| double12 < (double)co.r()
				|| double12 > (double)(co.r() + 1)) {
				ajs.a(de.REDSTONE, double8, double10, double12, 0.0, 0.0, 0.0);
			}
		}
	}

	@Override
	protected afj w(atl atl) {
		return new afj(alv.aC);
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afh.a(alv.aC), 1, this.d(atl));
	}
}

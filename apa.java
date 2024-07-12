import java.util.Random;

public class apa extends ama {
	public static final aua a = aua.a("age", 0, 3);
	private static final bdt[] c = new bdt[]{
		new bdt(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.6875, 1.0),
		new bdt(0.0, 0.0, 0.0, 1.0, 0.875, 1.0)
	};

	protected apa() {
		super(azs.k, azt.D);
		this.y(this.A.b().a(a, 0));
		this.a(true);
		this.a(null);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return c[atl.c(a)];
	}

	@Override
	protected boolean i(atl atl) {
		return atl.v() == alv.aW;
	}

	@Override
	public boolean f(ajs ajs, co co, atl atl) {
		return this.i(ajs.o(co.b()));
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		int integer6 = (Integer)atl.c(a);
		if (integer6 < 3 && random.nextInt(10) == 0) {
			atl = atl.a(a, integer6 + 1);
			ajs.a(co, atl, 2);
		}

		super.b(ajs, co, atl, random);
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		if (!ajs.E) {
			int integer7 = 1;
			if ((Integer)atl.c(a) >= 3) {
				integer7 = 2 + ajs.r.nextInt(3);
				if (integer > 0) {
					integer7 += ajs.r.nextInt(integer + 1);
				}
			}

			for (int integer8 = 0; integer8 < integer7; integer8++) {
				a(ajs, co, new afj(afl.bG));
			}
		}
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.a;
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return new afj(afl.bG);
	}

	@Override
	public atl a(int integer) {
		return this.t().a(a, integer);
	}

	@Override
	public int e(atl atl) {
		return (Integer)atl.c(a);
	}

	@Override
	protected atm b() {
		return new atm(this, a);
	}
}

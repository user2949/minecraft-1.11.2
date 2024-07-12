import java.util.Random;

public class anj extends alu {
	public static boolean f;

	public anj() {
		super(azs.p);
		this.a(aej.b);
	}

	public anj(azs azs) {
		super(azs);
	}

	@Override
	public void c(ajs ajs, co co, atl atl) {
		ajs.a(co, this, this.a(ajs));
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		ajs.a(co3, this, this.a(ajs));
	}

	@Override
	public void b(ajs ajs, co co, atl atl, Random random) {
		if (!ajs.E) {
			this.c(ajs, co);
		}
	}

	private void c(ajs ajs, co co) {
		if (i(ajs.o(co.b())) && co.q() >= 0) {
			int integer4 = 32;
			if (f || !ajs.a(co.a(-32, -32, -32), co.a(32, 32, 32))) {
				ajs.g(co);
				co co5 = co.b();

				while (i(ajs.o(co5)) && co5.q() > 0) {
					co5 = co5.b();
				}

				if (co5.q() > 0) {
					ajs.a(co5.a(), this.t());
				}
			} else if (!ajs.E) {
				zi zi5 = new zi(ajs, (double)co.p() + 0.5, (double)co.q(), (double)co.r() + 0.5, ajs.o(co));
				this.a(zi5);
				ajs.a(zi5);
			}
		}
	}

	protected void a(zi zi) {
	}

	@Override
	public int a(ajs ajs) {
		return 2;
	}

	public static boolean i(atl atl) {
		alu alu2 = atl.v();
		azs azs3 = atl.a();
		return alu2 == alv.ab || azs3 == azs.a || azs3 == azs.h || azs3 == azs.i;
	}

	public void a_(ajs ajs, co co) {
	}

	public void b(ajs ajs, co co) {
	}

	@Override
	public void a(atl atl, ajs ajs, co co, Random random) {
		if (random.nextInt(16) == 0) {
			co co6 = co.b();
			if (i(ajs.o(co6))) {
				double double7 = (double)((float)co.p() + random.nextFloat());
				double double9 = (double)co.q() - 0.05;
				double double11 = (double)((float)co.r() + random.nextFloat());
				ajs.a(de.FALLING_DUST, double7, double9, double11, 0.0, 0.0, 0.0, alu.j(atl));
			}
		}
	}

	public int z(atl atl) {
		return -16777216;
	}
}

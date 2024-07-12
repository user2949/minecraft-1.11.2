import java.util.Random;

public class amz extends alu {
	protected static final bdt a = new bdt(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375);

	public amz() {
		super(azs.D, azt.E);
	}

	@Override
	public bdt b(atl atl, ajw ajw, co co) {
		return a;
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
		this.b(ajs, co);
	}

	private void b(ajs ajs, co co) {
		if (anj.i(ajs.o(co.b())) && co.q() >= 0) {
			int integer4 = 32;
			if (!anj.f && ajs.a(co.a(-32, -32, -32), co.a(32, 32, 32))) {
				ajs.a(new zi(ajs, (double)((float)co.p() + 0.5F), (double)co.q(), (double)((float)co.r() + 0.5F), this.t()));
			} else {
				ajs.g(co);
				co co5 = co;

				while (anj.i(ajs.o(co5)) && co5.q() > 0) {
					co5 = co5.b();
				}

				if (co5.q() > 0) {
					ajs.a(co5, this.t(), 2);
				}
			}
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		this.c(ajs, co);
		return true;
	}

	@Override
	public void a(ajs ajs, co co, aay aay) {
		this.c(ajs, co);
	}

	private void c(ajs ajs, co co) {
		atl atl4 = ajs.o(co);
		if (atl4.v() == this) {
			for (int integer5 = 0; integer5 < 1000; integer5++) {
				co co6 = co.a(ajs.r.nextInt(16) - ajs.r.nextInt(16), ajs.r.nextInt(8) - ajs.r.nextInt(8), ajs.r.nextInt(16) - ajs.r.nextInt(16));
				if (ajs.o(co6).v().x == azs.a) {
					if (ajs.E) {
						for (int integer7 = 0; integer7 < 128; integer7++) {
							double double8 = ajs.r.nextDouble();
							float float10 = (ajs.r.nextFloat() - 0.5F) * 0.2F;
							float float11 = (ajs.r.nextFloat() - 0.5F) * 0.2F;
							float float12 = (ajs.r.nextFloat() - 0.5F) * 0.2F;
							double double13 = (double)co6.p() + (double)(co.p() - co6.p()) * double8 + (ajs.r.nextDouble() - 0.5) + 0.5;
							double double15 = (double)co6.q() + (double)(co.q() - co6.q()) * double8 + ajs.r.nextDouble() - 0.5;
							double double17 = (double)co6.r() + (double)(co.r() - co6.r()) * double8 + (ajs.r.nextDouble() - 0.5) + 0.5;
							ajs.a(de.PORTAL, double13, double15, double17, (double)float10, (double)float11, (double)float12);
						}
					} else {
						ajs.a(co6, atl4, 2);
						ajs.g(co);
					}

					return;
				}
			}
		}
	}

	@Override
	public int a(ajs ajs) {
		return 5;
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
	public boolean a(atl atl, ajw ajw, co co, cv cv) {
		return true;
	}
}

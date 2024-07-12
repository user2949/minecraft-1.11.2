import java.util.Random;

public class akp extends akf {
	protected static final awb y = new awb(false, true);
	protected static final awb z = new awb(false, false);
	protected static final axi A = new axi(false);
	private final akp.a B;

	public akp(akp.a a, akf.a a) {
		super(a);
		this.B = a;
		this.t.z = 10;
		this.t.C = 2;
		if (this.B == akp.a.FLOWER) {
			this.t.z = 6;
			this.t.B = 100;
			this.t.C = 1;
			this.v.add(new akf.c(xe.class, 4, 2, 3));
		}

		if (this.B == akp.a.NORMAL) {
			this.v.add(new akf.c(xk.class, 5, 4, 4));
		}

		if (this.B == akp.a.ROOFED) {
			this.t.z = -999;
		}
	}

	@Override
	public avz a(Random random) {
		if (this.B == akp.a.ROOFED && random.nextInt(3) > 0) {
			return A;
		} else if (this.B == akp.a.BIRCH || random.nextInt(5) == 0) {
			return z;
		} else {
			return (avz)(random.nextInt(10) == 0 ? o : n);
		}
	}

	@Override
	public ano.a a(Random random, co co) {
		if (this.B == akp.a.FLOWER) {
			double double4 = ot.a((1.0 + l.a((double)co.p() / 48.0, (double)co.r() / 48.0)) / 2.0, 0.0, 0.9999);
			ano.a a6 = ano.a.values()[(int)(double4 * (double)ano.a.values().length)];
			return a6 == ano.a.BLUE_ORCHID ? ano.a.POPPY : a6;
		} else {
			return super.a(random, co);
		}
	}

	@Override
	public void a(ajs ajs, Random random, co co) {
		if (this.B == akp.a.ROOFED) {
			this.b(ajs, random, co);
		}

		int integer5 = random.nextInt(5) - 3;
		if (this.B == akp.a.FLOWER) {
			integer5 += 2;
		}

		this.a(ajs, random, co, integer5);
		super.a(ajs, random, co);
	}

	protected void b(ajs ajs, Random random, co co) {
		for (int integer5 = 0; integer5 < 4; integer5++) {
			for (int integer6 = 0; integer6 < 4; integer6++) {
				int integer7 = integer5 * 4 + 1 + 8 + random.nextInt(3);
				int integer8 = integer6 * 4 + 1 + 8 + random.nextInt(3);
				co co9 = ajs.l(co.a(integer7, 0, integer8));
				if (random.nextInt(20) == 0) {
					awu awu10 = new awu();
					awu10.b(ajs, random, co9);
				} else {
					avz avz10 = this.a(random);
					avz10.e();
					if (avz10.b(ajs, random, co9)) {
						avz10.a(ajs, random, co9);
					}
				}
			}
		}
	}

	protected void a(ajs ajs, Random random, co co, int integer) {
		for (int integer6 = 0; integer6 < integer; integer6++) {
			int integer7 = random.nextInt(3);
			if (integer7 == 0) {
				m.a(amy.b.SYRINGA);
			} else if (integer7 == 1) {
				m.a(amy.b.ROSE);
			} else if (integer7 == 2) {
				m.a(amy.b.PAEONIA);
			}

			for (int integer8 = 0; integer8 < 5; integer8++) {
				int integer9 = random.nextInt(16) + 8;
				int integer10 = random.nextInt(16) + 8;
				int integer11 = random.nextInt(ajs.l(co.a(integer9, 0, integer10)).q() + 32);
				if (m.b(ajs, random, new co(co.p() + integer9, integer11, co.r() + integer10))) {
					break;
				}
			}
		}
	}

	@Override
	public Class<? extends akf> g() {
		return akp.class;
	}

	@Override
	public int b(co co) {
		int integer3 = super.b(co);
		return this.B == akp.a.ROOFED ? (integer3 & 16711422) + 2634762 >> 1 : integer3;
	}

	public static enum a {
		NORMAL,
		FLOWER,
		BIRCH,
		ROOFED;
	}
}

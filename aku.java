import java.util.Arrays;
import java.util.Random;

public class aku extends akf {
	protected static final atl y = alv.d.t().a(amv.a, amv.a.COARSE_DIRT);
	protected static final atl z = alv.c.t();
	protected static final atl A = alv.cz.t();
	protected static final atl B = alv.cu.t();
	protected static final atl C = B.a(aml.a, aem.ORANGE);
	protected static final atl D = alv.m.t().a(aqj.a, aqj.a.RED_SAND);
	private atl[] E;
	private long F;
	private azj G;
	private azj H;
	private azj I;
	private final boolean J;
	private final boolean K;

	public aku(boolean boolean1, boolean boolean2, akf.a a) {
		super(a);
		this.J = boolean1;
		this.K = boolean2;
		this.v.clear();
		this.r = D;
		this.s = B;
		this.t.z = -999;
		this.t.D = 20;
		this.t.F = 3;
		this.t.G = 5;
		this.t.B = 0;
		this.v.clear();
		if (boolean2) {
			this.t.z = 5;
		}
	}

	@Override
	protected aki a() {
		return new aku.a();
	}

	@Override
	public avz a(Random random) {
		return n;
	}

	@Override
	public int c(co co) {
		return 10387789;
	}

	@Override
	public int b(co co) {
		return 9470285;
	}

	@Override
	public void a(ajs ajs, Random random, avp avp, int integer4, int integer5, double double6) {
		if (this.E == null || this.F != ajs.O()) {
			this.a(ajs.O());
		}

		if (this.G == null || this.H == null || this.F != ajs.O()) {
			Random random9 = new Random(this.F);
			this.G = new azj(random9, 4);
			this.H = new azj(random9, 1);
		}

		this.F = ajs.O();
		double double9 = 0.0;
		if (this.J) {
			int integer11 = (integer4 & -16) + (integer5 & 15);
			int integer12 = (integer5 & -16) + (integer4 & 15);
			double double13 = Math.min(Math.abs(double6), this.G.a((double)integer11 * 0.25, (double)integer12 * 0.25));
			if (double13 > 0.0) {
				double double15 = 0.001953125;
				double double17 = Math.abs(this.H.a((double)integer11 * 0.001953125, (double)integer12 * 0.001953125));
				double9 = double13 * double13 * 2.5;
				double double19 = Math.ceil(double17 * 50.0) + 14.0;
				if (double9 > double19) {
					double9 = double19;
				}

				double9 += 64.0;
			}
		}

		int integer11 = integer4 & 15;
		int integer12 = integer5 & 15;
		int integer13 = ajs.K();
		atl atl14 = B;
		atl atl15 = this.s;
		int integer16 = (int)(double6 / 3.0 + 3.0 + random.nextDouble() * 0.25);
		boolean boolean17 = Math.cos(double6 / 3.0 * Math.PI) > 0.0;
		int integer18 = -1;
		boolean boolean19 = false;
		int integer20 = 0;

		for (int integer21 = 255; integer21 >= 0; integer21--) {
			if (avp.a(integer12, integer21, integer11).a() == azs.a && integer21 < (int)double9) {
				avp.a(integer12, integer21, integer11, a);
			}

			if (integer21 <= random.nextInt(5)) {
				avp.a(integer12, integer21, integer11, c);
			} else if (integer20 < 15 || this.J) {
				atl atl22 = avp.a(integer12, integer21, integer11);
				if (atl22.a() == azs.a) {
					integer18 = -1;
				} else if (atl22.v() == alv.b) {
					if (integer18 == -1) {
						boolean19 = false;
						if (integer16 <= 0) {
							atl14 = b;
							atl15 = a;
						} else if (integer21 >= integer13 - 4 && integer21 <= integer13 + 1) {
							atl14 = B;
							atl15 = this.s;
						}

						if (integer21 < integer13 && (atl14 == null || atl14.a() == azs.a)) {
							atl14 = h;
						}

						integer18 = integer16 + Math.max(0, integer21 - integer13);
						if (integer21 < integer13 - 1) {
							avp.a(integer12, integer21, integer11, atl15);
							if (atl15.v() == alv.cu) {
								avp.a(integer12, integer21, integer11, C);
							}
						} else if (!this.K || integer21 <= 86 + integer16 * 2) {
							if (integer21 <= integer13 + 3 + integer16) {
								avp.a(integer12, integer21, integer11, this.r);
								boolean19 = true;
							} else {
								atl atl23;
								if (integer21 < 64 || integer21 > 127) {
									atl23 = C;
								} else if (boolean17) {
									atl23 = A;
								} else {
									atl23 = this.a(integer4, integer21, integer5);
								}

								avp.a(integer12, integer21, integer11, atl23);
							}
						} else if (boolean17) {
							avp.a(integer12, integer21, integer11, y);
						} else {
							avp.a(integer12, integer21, integer11, z);
						}
					} else if (integer18 > 0) {
						integer18--;
						if (boolean19) {
							avp.a(integer12, integer21, integer11, C);
						} else {
							avp.a(integer12, integer21, integer11, this.a(integer4, integer21, integer5));
						}
					}

					integer20++;
				}
			}
		}
	}

	private void a(long long1) {
		this.E = new atl[64];
		Arrays.fill(this.E, A);
		Random random4 = new Random(long1);
		this.I = new azj(random4, 1);

		for (int integer5 = 0; integer5 < 64; integer5++) {
			integer5 += random4.nextInt(5) + 1;
			if (integer5 < 64) {
				this.E[integer5] = C;
			}
		}

		int integer5x = random4.nextInt(4) + 2;

		for (int integer6 = 0; integer6 < integer5x; integer6++) {
			int integer7 = random4.nextInt(3) + 1;
			int integer8 = random4.nextInt(64);

			for (int integer9 = 0; integer8 + integer9 < 64 && integer9 < integer7; integer9++) {
				this.E[integer8 + integer9] = B.a(aml.a, aem.YELLOW);
			}
		}

		int integer6 = random4.nextInt(4) + 2;

		for (int integer7 = 0; integer7 < integer6; integer7++) {
			int integer8 = random4.nextInt(3) + 2;
			int integer9 = random4.nextInt(64);

			for (int integer10 = 0; integer9 + integer10 < 64 && integer10 < integer8; integer10++) {
				this.E[integer9 + integer10] = B.a(aml.a, aem.BROWN);
			}
		}

		int integer7 = random4.nextInt(4) + 2;

		for (int integer8 = 0; integer8 < integer7; integer8++) {
			int integer9 = random4.nextInt(3) + 1;
			int integer10 = random4.nextInt(64);

			for (int integer11 = 0; integer10 + integer11 < 64 && integer11 < integer9; integer11++) {
				this.E[integer10 + integer11] = B.a(aml.a, aem.RED);
			}
		}

		int integer8 = random4.nextInt(3) + 3;
		int integer9 = 0;

		for (int integer10 = 0; integer10 < integer8; integer10++) {
			int integer11 = 1;
			integer9 += random4.nextInt(16) + 4;

			for (int integer12 = 0; integer9 + integer12 < 64 && integer12 < 1; integer12++) {
				this.E[integer9 + integer12] = B.a(aml.a, aem.WHITE);
				if (integer9 + integer12 > 1 && random4.nextBoolean()) {
					this.E[integer9 + integer12 - 1] = B.a(aml.a, aem.SILVER);
				}

				if (integer9 + integer12 < 63 && random4.nextBoolean()) {
					this.E[integer9 + integer12 + 1] = B.a(aml.a, aem.SILVER);
				}
			}
		}
	}

	private atl a(int integer1, int integer2, int integer3) {
		int integer5 = (int)Math.round(this.I.a((double)integer1 / 512.0, (double)integer1 / 512.0) * 2.0);
		return this.E[(integer2 + integer5 + 64) % 64];
	}

	class a extends aki {
		private a() {
		}

		@Override
		protected void a(ajs ajs, Random random) {
			super.a(ajs, random);
			this.a(ajs, random, 20, this.n, 32, 80);
		}
	}
}

import java.util.Random;

public class avo extends avu {
	protected static final atl a = alv.k.t();
	protected static final atl b = alv.a.t();
	private final float[] c = new float[1024];

	protected void a(
		long long1,
		int integer2,
		int integer3,
		avp avp,
		double double5,
		double double6,
		double double7,
		float float8,
		float float9,
		float float10,
		int integer11,
		int integer12,
		double double13
	) {
		Random random20 = new Random(long1);
		double double21 = (double)(integer2 * 16 + 8);
		double double23 = (double)(integer3 * 16 + 8);
		float float25 = 0.0F;
		float float26 = 0.0F;
		if (integer12 <= 0) {
			int integer27 = this.e * 16 - 16;
			integer12 = integer27 - random20.nextInt(integer27 / 4);
		}

		boolean boolean27 = false;
		if (integer11 == -1) {
			integer11 = integer12 / 2;
			boolean27 = true;
		}

		float float28 = 1.0F;

		for (int integer29 = 0; integer29 < 256; integer29++) {
			if (integer29 == 0 || random20.nextInt(3) == 0) {
				float28 = 1.0F + random20.nextFloat() * random20.nextFloat();
			}

			this.c[integer29] = float28 * float28;
		}

		for (; integer11 < integer12; integer11++) {
			double double29 = 1.5 + (double)(ot.a((float)integer11 * (float) Math.PI / (float)integer12) * float8);
			double double31 = double29 * double13;
			double29 *= (double)random20.nextFloat() * 0.25 + 0.75;
			double31 *= (double)random20.nextFloat() * 0.25 + 0.75;
			float float33 = ot.b(float10);
			float float34 = ot.a(float10);
			double5 += (double)(ot.b(float9) * float33);
			double6 += (double)float34;
			double7 += (double)(ot.a(float9) * float33);
			float10 *= 0.7F;
			float10 += float26 * 0.05F;
			float9 += float25 * 0.05F;
			float26 *= 0.8F;
			float25 *= 0.5F;
			float26 += (random20.nextFloat() - random20.nextFloat()) * random20.nextFloat() * 2.0F;
			float25 += (random20.nextFloat() - random20.nextFloat()) * random20.nextFloat() * 4.0F;
			if (boolean27 || random20.nextInt(4) != 0) {
				double double35 = double5 - double21;
				double double37 = double7 - double23;
				double double39 = (double)(integer12 - integer11);
				double double41 = (double)(float8 + 2.0F + 16.0F);
				if (double35 * double35 + double37 * double37 - double39 * double39 > double41 * double41) {
					return;
				}

				if (!(double5 < double21 - 16.0 - double29 * 2.0)
					&& !(double7 < double23 - 16.0 - double29 * 2.0)
					&& !(double5 > double21 + 16.0 + double29 * 2.0)
					&& !(double7 > double23 + 16.0 + double29 * 2.0)) {
					int integer35 = ot.c(double5 - double29) - integer2 * 16 - 1;
					int integer36 = ot.c(double5 + double29) - integer2 * 16 + 1;
					int integer37 = ot.c(double6 - double31) - 1;
					int integer38 = ot.c(double6 + double31) + 1;
					int integer39 = ot.c(double7 - double29) - integer3 * 16 - 1;
					int integer40 = ot.c(double7 + double29) - integer3 * 16 + 1;
					if (integer35 < 0) {
						integer35 = 0;
					}

					if (integer36 > 16) {
						integer36 = 16;
					}

					if (integer37 < 1) {
						integer37 = 1;
					}

					if (integer38 > 248) {
						integer38 = 248;
					}

					if (integer39 < 0) {
						integer39 = 0;
					}

					if (integer40 > 16) {
						integer40 = 16;
					}

					boolean boolean41 = false;

					for (int integer42 = integer35; !boolean41 && integer42 < integer36; integer42++) {
						for (int integer43 = integer39; !boolean41 && integer43 < integer40; integer43++) {
							for (int integer44 = integer38 + 1; !boolean41 && integer44 >= integer37 - 1; integer44--) {
								if (integer44 >= 0 && integer44 < 256) {
									atl atl45 = avp.a(integer42, integer44, integer43);
									if (atl45.v() == alv.i || atl45.v() == alv.j) {
										boolean41 = true;
									}

									if (integer44 != integer37 - 1 && integer42 != integer35 && integer42 != integer36 - 1 && integer43 != integer39 && integer43 != integer40 - 1) {
										integer44 = integer37;
									}
								}
							}
						}
					}

					if (!boolean41) {
						co.a a42 = new co.a();

						for (int integer43 = integer35; integer43 < integer36; integer43++) {
							double double44 = ((double)(integer43 + integer2 * 16) + 0.5 - double5) / double29;

							for (int integer46 = integer39; integer46 < integer40; integer46++) {
								double double47 = ((double)(integer46 + integer3 * 16) + 0.5 - double7) / double29;
								boolean boolean49 = false;
								if (double44 * double44 + double47 * double47 < 1.0) {
									for (int integer50 = integer38; integer50 > integer37; integer50--) {
										double double51 = ((double)(integer50 - 1) + 0.5 - double6) / double31;
										if ((double44 * double44 + double47 * double47) * (double)this.c[integer50 - 1] + double51 * double51 / 6.0 < 1.0) {
											atl atl53 = avp.a(integer43, integer50, integer46);
											if (atl53.v() == alv.c) {
												boolean49 = true;
											}

											if (atl53.v() == alv.b || atl53.v() == alv.d || atl53.v() == alv.c) {
												if (integer50 - 1 < 10) {
													avp.a(integer43, integer50, integer46, a);
												} else {
													avp.a(integer43, integer50, integer46, b);
													if (boolean49 && avp.a(integer43, integer50 - 1, integer46).v() == alv.d) {
														a42.c(integer43 + integer2 * 16, 0, integer46 + integer3 * 16);
														avp.a(integer43, integer50 - 1, integer46, this.g.b(a42).r);
													}
												}
											}
										}
									}
								}
							}
						}

						if (boolean27) {
							break;
						}
					}
				}
			}
		}
	}

	@Override
	protected void a(ajs ajs, int integer2, int integer3, int integer4, int integer5, avp avp) {
		if (this.f.nextInt(50) == 0) {
			double double8 = (double)(integer2 * 16 + this.f.nextInt(16));
			double double10 = (double)(this.f.nextInt(this.f.nextInt(40) + 8) + 20);
			double double12 = (double)(integer3 * 16 + this.f.nextInt(16));
			int integer14 = 1;

			for (int integer15 = 0; integer15 < 1; integer15++) {
				float float16 = this.f.nextFloat() * (float) (Math.PI * 2);
				float float17 = (this.f.nextFloat() - 0.5F) * 2.0F / 8.0F;
				float float18 = (this.f.nextFloat() * 2.0F + this.f.nextFloat()) * 2.0F;
				this.a(this.f.nextLong(), integer4, integer5, avp, double8, double10, double12, float18, float16, float17, 0, 0, 3.0);
			}
		}
	}
}

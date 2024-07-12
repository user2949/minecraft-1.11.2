import java.util.Random;

public class avv extends avu {
	protected static final atl a = alv.a.t();

	protected void a(long long1, int integer2, int integer3, avp avp, double double5, double double6, double double7) {
		this.a(long1, integer2, integer3, avp, double5, double6, double7, 1.0F + this.f.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5);
	}

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
		double double20 = (double)(integer2 * 16 + 8);
		double double22 = (double)(integer3 * 16 + 8);
		float float24 = 0.0F;
		float float25 = 0.0F;
		Random random26 = new Random(long1);
		if (integer12 <= 0) {
			int integer27 = this.e * 16 - 16;
			integer12 = integer27 - random26.nextInt(integer27 / 4);
		}

		boolean boolean27 = false;
		if (integer11 == -1) {
			integer11 = integer12 / 2;
			boolean27 = true;
		}

		int integer28 = random26.nextInt(integer12 / 2) + integer12 / 4;

		for (boolean boolean29 = random26.nextInt(6) == 0; integer11 < integer12; integer11++) {
			double double30 = 1.5 + (double)(ot.a((float)integer11 * (float) Math.PI / (float)integer12) * float8);
			double double32 = double30 * double13;
			float float34 = ot.b(float10);
			float float35 = ot.a(float10);
			double5 += (double)(ot.b(float9) * float34);
			double6 += (double)float35;
			double7 += (double)(ot.a(float9) * float34);
			if (boolean29) {
				float10 *= 0.92F;
			} else {
				float10 *= 0.7F;
			}

			float10 += float25 * 0.1F;
			float9 += float24 * 0.1F;
			float25 *= 0.9F;
			float24 *= 0.75F;
			float25 += (random26.nextFloat() - random26.nextFloat()) * random26.nextFloat() * 2.0F;
			float24 += (random26.nextFloat() - random26.nextFloat()) * random26.nextFloat() * 4.0F;
			if (!boolean27 && integer11 == integer28 && float8 > 1.0F) {
				this.a(
					random26.nextLong(),
					integer2,
					integer3,
					avp,
					double5,
					double6,
					double7,
					random26.nextFloat() * 0.5F + 0.5F,
					float9 - (float) (Math.PI / 2),
					float10 / 3.0F,
					integer11,
					integer12,
					1.0
				);
				this.a(
					random26.nextLong(),
					integer2,
					integer3,
					avp,
					double5,
					double6,
					double7,
					random26.nextFloat() * 0.5F + 0.5F,
					float9 + (float) (Math.PI / 2),
					float10 / 3.0F,
					integer11,
					integer12,
					1.0
				);
				return;
			}

			if (boolean27 || random26.nextInt(4) != 0) {
				double double36 = double5 - double20;
				double double38 = double7 - double22;
				double double40 = (double)(integer12 - integer11);
				double double42 = (double)(float8 + 2.0F + 16.0F);
				if (double36 * double36 + double38 * double38 - double40 * double40 > double42 * double42) {
					return;
				}

				if (!(double5 < double20 - 16.0 - double30 * 2.0)
					&& !(double7 < double22 - 16.0 - double30 * 2.0)
					&& !(double5 > double20 + 16.0 + double30 * 2.0)
					&& !(double7 > double22 + 16.0 + double30 * 2.0)) {
					int integer36 = ot.c(double5 - double30) - integer2 * 16 - 1;
					int integer37 = ot.c(double5 + double30) - integer2 * 16 + 1;
					int integer38 = ot.c(double6 - double32) - 1;
					int integer39 = ot.c(double6 + double32) + 1;
					int integer40 = ot.c(double7 - double30) - integer3 * 16 - 1;
					int integer41 = ot.c(double7 + double30) - integer3 * 16 + 1;
					if (integer36 < 0) {
						integer36 = 0;
					}

					if (integer37 > 16) {
						integer37 = 16;
					}

					if (integer38 < 1) {
						integer38 = 1;
					}

					if (integer39 > 120) {
						integer39 = 120;
					}

					if (integer40 < 0) {
						integer40 = 0;
					}

					if (integer41 > 16) {
						integer41 = 16;
					}

					boolean boolean42 = false;

					for (int integer43 = integer36; !boolean42 && integer43 < integer37; integer43++) {
						for (int integer44 = integer40; !boolean42 && integer44 < integer41; integer44++) {
							for (int integer45 = integer39 + 1; !boolean42 && integer45 >= integer38 - 1; integer45--) {
								if (integer45 >= 0 && integer45 < 128) {
									atl atl46 = avp.a(integer43, integer45, integer44);
									if (atl46.v() == alv.k || atl46.v() == alv.l) {
										boolean42 = true;
									}

									if (integer45 != integer38 - 1 && integer43 != integer36 && integer43 != integer37 - 1 && integer44 != integer40 && integer44 != integer41 - 1) {
										integer45 = integer38;
									}
								}
							}
						}
					}

					if (!boolean42) {
						for (int integer43 = integer36; integer43 < integer37; integer43++) {
							double double44 = ((double)(integer43 + integer2 * 16) + 0.5 - double5) / double30;

							for (int integer46 = integer40; integer46 < integer41; integer46++) {
								double double47 = ((double)(integer46 + integer3 * 16) + 0.5 - double7) / double30;

								for (int integer49 = integer39; integer49 > integer38; integer49--) {
									double double50 = ((double)(integer49 - 1) + 0.5 - double6) / double32;
									if (double50 > -0.7 && double44 * double44 + double50 * double50 + double47 * double47 < 1.0) {
										atl atl52 = avp.a(integer43, integer49, integer46);
										if (atl52.v() == alv.aV || atl52.v() == alv.d || atl52.v() == alv.c) {
											avp.a(integer43, integer49, integer46, a);
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
		int integer8 = this.f.nextInt(this.f.nextInt(this.f.nextInt(10) + 1) + 1);
		if (this.f.nextInt(5) != 0) {
			integer8 = 0;
		}

		for (int integer9 = 0; integer9 < integer8; integer9++) {
			double double10 = (double)(integer2 * 16 + this.f.nextInt(16));
			double double12 = (double)this.f.nextInt(128);
			double double14 = (double)(integer3 * 16 + this.f.nextInt(16));
			int integer16 = 1;
			if (this.f.nextInt(4) == 0) {
				this.a(this.f.nextLong(), integer4, integer5, avp, double10, double12, double14);
				integer16 += this.f.nextInt(4);
			}

			for (int integer17 = 0; integer17 < integer16; integer17++) {
				float float18 = this.f.nextFloat() * (float) (Math.PI * 2);
				float float19 = (this.f.nextFloat() - 0.5F) * 2.0F / 8.0F;
				float float20 = this.f.nextFloat() * 2.0F + this.f.nextFloat();
				this.a(this.f.nextLong(), integer4, integer5, avp, double10, double12, double14, float20 * 2.0F, float18, float19, 0, 0, 0.5);
			}
		}
	}
}

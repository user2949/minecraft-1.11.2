import com.google.common.collect.Sets;
import java.util.List;
import java.util.Random;
import java.util.Set;

public final class ajz {
	private static final int a = (int)Math.pow(17.0, 2.0);
	private final Set<ajl> b = Sets.newHashSet();

	public int a(lw lw, boolean boolean2, boolean boolean3, boolean boolean4) {
		if (!boolean2 && !boolean3) {
			return 0;
		} else {
			this.b.clear();
			int integer6 = 0;

			for (aay aay8 : lw.i) {
				if (!aay8.y()) {
					int integer9 = ot.c(aay8.p / 16.0);
					int integer10 = ot.c(aay8.r / 16.0);
					int integer11 = 8;

					for (int integer12 = -8; integer12 <= 8; integer12++) {
						for (int integer13 = -8; integer13 <= 8; integer13++) {
							boolean boolean14 = integer12 == -8 || integer12 == 8 || integer13 == -8 || integer13 == 8;
							ajl ajl15 = new ajl(integer12 + integer9, integer13 + integer10);
							if (!this.b.contains(ajl15)) {
								integer6++;
								if (!boolean14 && lw.aj().a(ajl15)) {
									mb mb16 = lw.w().b(ajl15.a, ajl15.b);
									if (mb16 != null && mb16.e()) {
										this.b.add(ajl15);
									}
								}
							}
						}
					}
				}
			}

			int integer7 = 0;
			co co8 = lw.R();

			for (sy sy12 : sy.values()) {
				if ((!sy12.d() || boolean3) && (sy12.d() || boolean2) && (!sy12.e() || boolean4)) {
					int integer13x = lw.a(sy12.a());
					int integer14 = sy12.b() * integer6 / a;
					if (integer13x <= integer14) {
						co.a a15 = new co.a();

						label134:
						for (ajl ajl17 : this.b) {
							co co18 = a(lw, ajl17.a, ajl17.b);
							int integer19 = co18.p();
							int integer20 = co18.q();
							int integer21 = co18.r();
							atl atl22 = lw.o(co18);
							if (!atl22.m()) {
								int integer23 = 0;

								for (int integer24 = 0; integer24 < 3; integer24++) {
									int integer25 = integer19;
									int integer26 = integer20;
									int integer27 = integer21;
									int integer28 = 6;
									akf.c c29 = null;
									sz sz30 = null;
									int integer31 = ot.f(Math.random() * 4.0);

									for (int integer32 = 0; integer32 < integer31; integer32++) {
										integer25 += lw.r.nextInt(6) - lw.r.nextInt(6);
										integer26 += lw.r.nextInt(1) - lw.r.nextInt(1);
										integer27 += lw.r.nextInt(6) - lw.r.nextInt(6);
										a15.c(integer25, integer26, integer27);
										float float33 = (float)integer25 + 0.5F;
										float float34 = (float)integer27 + 0.5F;
										if (!lw.a((double)float33, (double)integer26, (double)float34, 24.0) && !(co8.f((double)float33, (double)integer26, (double)float34) < 576.0)) {
											if (c29 == null) {
												c29 = lw.a(sy12, a15);
												if (c29 == null) {
													break;
												}
											}

											if (lw.a(sy12, c29, a15) && a(ta.a(c29.b), lw, a15)) {
												sx sx35;
												try {
													sx35 = (sx)c29.b.getConstructor(ajs.class).newInstance(lw);
												} catch (Exception var36) {
													var36.printStackTrace();
													return integer7;
												}

												sx35.b((double)float33, (double)integer26, (double)float34, lw.r.nextFloat() * 360.0F, 0.0F);
												if (sx35.cM() && sx35.cN()) {
													sz30 = sx35.a(lw.D(new co(sx35)), sz30);
													if (sx35.cN()) {
														integer23++;
														lw.a(sx35);
													} else {
														sx35.T();
													}

													if (integer23 >= sx35.cQ()) {
														continue label134;
													}
												}

												integer7 += integer23;
											}
										}
									}
								}
							}
						}
					}
				}
			}

			return integer7;
		}
	}

	private static co a(ajs ajs, int integer2, int integer3) {
		auo auo4 = ajs.a(integer2, integer3);
		int integer5 = integer2 * 16 + ajs.r.nextInt(16);
		int integer6 = integer3 * 16 + ajs.r.nextInt(16);
		int integer7 = ot.c(auo4.e(new co(integer5, 0, integer6)) + 1, 16);
		int integer8 = ajs.r.nextInt(integer7 > 0 ? integer7 : auo4.g() + 16 - 1);
		return new co(integer5, integer8, integer6);
	}

	public static boolean a(atl atl) {
		if (atl.l()) {
			return false;
		} else if (atl.n()) {
			return false;
		} else {
			return atl.a().d() ? false : !alq.i(atl);
		}
	}

	public static boolean a(sx.a a, ajs ajs, co co) {
		if (!ajs.aj().a(co)) {
			return false;
		} else {
			atl atl4 = ajs.o(co);
			if (a == sx.a.IN_WATER) {
				return atl4.a() == azs.h && ajs.o(co.b()).a() == azs.h && !ajs.o(co.a()).m();
			} else {
				co co5 = co.b();
				if (!ajs.o(co5).r()) {
					return false;
				} else {
					alu alu6 = ajs.o(co5).v();
					boolean boolean7 = alu6 != alv.h && alu6 != alv.cv;
					return boolean7 && a(atl4) && a(ajs.o(co.a()));
				}
			}
		}
	}

	public static void a(ajs ajs, akf akf, int integer3, int integer4, int integer5, int integer6, Random random) {
		List<akf.c> list8 = akf.a(sy.CREATURE);
		if (!list8.isEmpty()) {
			while (random.nextFloat() < akf.f()) {
				akf.c c9 = pb.a(ajs.r, list8);
				int integer10 = c9.c + random.nextInt(1 + c9.d - c9.c);
				sz sz11 = null;
				int integer12 = integer3 + random.nextInt(integer5);
				int integer13 = integer4 + random.nextInt(integer6);
				int integer14 = integer12;
				int integer15 = integer13;

				for (int integer16 = 0; integer16 < integer10; integer16++) {
					boolean boolean17 = false;

					for (int integer18 = 0; !boolean17 && integer18 < 4; integer18++) {
						co co19 = ajs.q(new co(integer12, 0, integer13));
						if (a(sx.a.ON_GROUND, ajs, co19)) {
							sx sx20;
							try {
								sx20 = (sx)c9.b.getConstructor(ajs.class).newInstance(ajs);
							} catch (Exception var21) {
								var21.printStackTrace();
								continue;
							}

							sx20.b((double)((float)integer12 + 0.5F), (double)co19.q(), (double)((float)integer13 + 0.5F), random.nextFloat() * 360.0F, 0.0F);
							ajs.a(sx20);
							sz11 = sx20.a(ajs.D(new co(sx20)), sz11);
							boolean17 = true;
						}

						integer12 += random.nextInt(5) - random.nextInt(5);

						for (integer13 += random.nextInt(5) - random.nextInt(5);
							integer12 < integer3 || integer12 >= integer3 + integer5 || integer13 < integer4 || integer13 >= integer4 + integer5;
							integer13 = integer15 + random.nextInt(5) - random.nextInt(5)
						) {
							integer12 = integer14 + random.nextInt(5) - random.nextInt(5);
						}
					}
				}
			}
		}
	}
}

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class afp extends aei {
	protected afp() {
		this.a(true);
	}

	public static afj a(ajs ajs, double double2, double double3, byte byte4, boolean boolean5, boolean boolean6) {
		afj afj9 = new afj(afl.bl, 1, ajs.b("map"));
		String string10 = "map_" + afj9.j();
		bbn bbn11 = new bbn(string10);
		ajs.a(string10, bbn11);
		bbn11.g = byte4;
		bbn11.a(double2, double3, bbn11.g);
		bbn11.d = (byte)ajs.s.q().a();
		bbn11.e = boolean5;
		bbn11.f = boolean6;
		bbn11.c();
		return afj9;
	}

	@Nullable
	public static bbn a(int integer, ajs ajs) {
		String string3 = "map_" + integer;
		return (bbn)ajs.a(bbn.class, string3);
	}

	@Nullable
	public bbn a(afj afj, ajs ajs) {
		String string4 = "map_" + afj.j();
		bbn bbn5 = (bbn)ajs.a(bbn.class, string4);
		if (bbn5 == null && !ajs.E) {
			afj.b(ajs.b("map"));
			string4 = "map_" + afj.j();
			bbn5 = new bbn(string4);
			bbn5.g = 3;
			bbn5.a((double)ajs.T().b(), (double)ajs.T().d(), bbn5.g);
			bbn5.d = (byte)ajs.s.q().a();
			bbn5.c();
			ajs.a(string4, bbn5);
		}

		return bbn5;
	}

	public void a(ajs ajs, sn sn, bbn bbn) {
		if (ajs.s.q().a() == bbn.d && sn instanceof aay) {
			int integer5 = 1 << bbn.g;
			int integer6 = bbn.b;
			int integer7 = bbn.c;
			int integer8 = ot.c(sn.p - (double)integer6) / integer5 + 64;
			int integer9 = ot.c(sn.r - (double)integer7) / integer5 + 64;
			int integer10 = 128 / integer5;
			if (ajs.s.n()) {
				integer10 /= 2;
			}

			bbn.a a11 = bbn.a((aay)sn);
			a11.b++;
			boolean boolean12 = false;

			for (int integer13 = integer8 - integer10 + 1; integer13 < integer8 + integer10; integer13++) {
				if ((integer13 & 15) == (a11.b & 15) || boolean12) {
					boolean12 = false;
					double double14 = 0.0;

					for (int integer16 = integer9 - integer10 - 1; integer16 < integer9 + integer10; integer16++) {
						if (integer13 >= 0 && integer16 >= -1 && integer13 < 128 && integer16 < 128) {
							int integer17 = integer13 - integer8;
							int integer18 = integer16 - integer9;
							boolean boolean19 = integer17 * integer17 + integer18 * integer18 > (integer10 - 2) * (integer10 - 2);
							int integer20 = (integer6 / integer5 + integer13 - 64) * integer5;
							int integer21 = (integer7 / integer5 + integer16 - 64) * integer5;
							Multiset<azt> multiset22 = HashMultiset.create();
							auo auo23 = ajs.f(new co(integer20, 0, integer21));
							if (!auo23.f()) {
								int integer24 = integer20 & 15;
								int integer25 = integer21 & 15;
								int integer26 = 0;
								double double27 = 0.0;
								if (ajs.s.n()) {
									int integer29 = integer20 + integer21 * 231871;
									integer29 = integer29 * integer29 * 31287121 + integer29 * 11;
									if ((integer29 >> 20 & 1) == 0) {
										multiset22.add(alv.d.t().a(amv.a, amv.a.DIRT).g(), 10);
									} else {
										multiset22.add(alv.b.t().a(arc.a, arc.a.STONE).g(), 100);
									}

									double27 = 100.0;
								} else {
									co.a a29 = new co.a();

									for (int integer30 = 0; integer30 < integer5; integer30++) {
										for (int integer31 = 0; integer31 < integer5; integer31++) {
											int integer32 = auo23.b(integer30 + integer24, integer31 + integer25) + 1;
											atl atl33 = alv.a.t();
											if (integer32 <= 1) {
												atl33 = alv.h.t();
											} else {
												do {
													atl33 = auo23.a(a29.c(integer30 + integer24, --integer32, integer31 + integer25));
												} while (atl33.g() == azt.b && integer32 > 0);

												if (integer32 > 0 && atl33.a().d()) {
													int integer34 = integer32 - 1;

													atl atl35;
													do {
														atl35 = auo23.a(integer30 + integer24, integer34--, integer31 + integer25);
														integer26++;
													} while (integer34 > 0 && atl35.a().d());
												}
											}

											double27 += (double)integer32 / (double)(integer5 * integer5);
											multiset22.add(atl33.g());
										}
									}
								}

								integer26 /= integer5 * integer5;
								double double29 = (double27 - double14) * 4.0 / (double)(integer5 + 4) + ((double)(integer13 + integer16 & 1) - 0.5) * 0.4;
								int integer31 = 1;
								if (double29 > 0.6) {
									integer31 = 2;
								}

								if (double29 < -0.6) {
									integer31 = 0;
								}

								azt azt32 = (azt)Iterables.getFirst(Multisets.copyHighestCountFirst(multiset22), azt.b);
								if (azt32 == azt.n) {
									double29 = (double)integer26 * 0.1 + (double)(integer13 + integer16 & 1) * 0.2;
									integer31 = 1;
									if (double29 < 0.5) {
										integer31 = 2;
									}

									if (double29 > 0.9) {
										integer31 = 0;
									}
								}

								double14 = double27;
								if (integer16 >= 0 && integer17 * integer17 + integer18 * integer18 < integer10 * integer10 && (!boolean19 || (integer13 + integer16 & 1) != 0)) {
									byte byte33 = bbn.h[integer13 + integer16 * 128];
									byte byte34 = (byte)(azt32.M * 4 + integer31);
									if (byte33 != byte34) {
										bbn.h[integer13 + integer16 * 128] = byte34;
										bbn.a(integer13, integer16);
										boolean12 = true;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static void a(ajs ajs, afj afj) {
		if (afj.c() == afl.bl) {
			bbn bbn3 = afl.bl.a(afj, ajs);
			if (bbn3 != null) {
				if (ajs.s.q().a() == bbn3.d) {
					int integer4 = 1 << bbn3.g;
					int integer5 = bbn3.b;
					int integer6 = bbn3.c;
					akf[] arr7 = ajs.A().a(null, (integer5 / integer4 - 64) * integer4, (integer6 / integer4 - 64) * integer4, 128 * integer4, 128 * integer4, false);

					for (int integer8 = 0; integer8 < 128; integer8++) {
						for (int integer9 = 0; integer9 < 128; integer9++) {
							int integer10 = integer8 * integer4;
							int integer11 = integer9 * integer4;
							akf akf12 = arr7[integer10 + integer11 * 128 * integer4];
							azt azt13 = azt.b;
							int integer14 = 3;
							int integer15 = 8;
							if (integer8 > 0 && integer9 > 0 && integer8 < 127 && integer9 < 127) {
								if (arr7[(integer8 - 1) * integer4 + (integer9 - 1) * integer4 * 128 * integer4].j() >= 0.0F) {
									integer15--;
								}

								if (arr7[(integer8 - 1) * integer4 + (integer9 + 1) * integer4 * 128 * integer4].j() >= 0.0F) {
									integer15--;
								}

								if (arr7[(integer8 - 1) * integer4 + integer9 * integer4 * 128 * integer4].j() >= 0.0F) {
									integer15--;
								}

								if (arr7[(integer8 + 1) * integer4 + (integer9 - 1) * integer4 * 128 * integer4].j() >= 0.0F) {
									integer15--;
								}

								if (arr7[(integer8 + 1) * integer4 + (integer9 + 1) * integer4 * 128 * integer4].j() >= 0.0F) {
									integer15--;
								}

								if (arr7[(integer8 + 1) * integer4 + integer9 * integer4 * 128 * integer4].j() >= 0.0F) {
									integer15--;
								}

								if (arr7[integer8 * integer4 + (integer9 - 1) * integer4 * 128 * integer4].j() >= 0.0F) {
									integer15--;
								}

								if (arr7[integer8 * integer4 + (integer9 + 1) * integer4 * 128 * integer4].j() >= 0.0F) {
									integer15--;
								}

								if (akf12.j() < 0.0F) {
									azt13 = azt.q;
									if (integer15 > 7 && integer9 % 2 == 0) {
										integer14 = (integer8 + (int)(ot.a((float)integer9 + 0.0F) * 7.0F)) / 8 % 5;
										if (integer14 == 3) {
											integer14 = 1;
										} else if (integer14 == 4) {
											integer14 = 0;
										}
									} else if (integer15 > 7) {
										azt13 = azt.b;
									} else if (integer15 > 5) {
										integer14 = 1;
									} else if (integer15 > 3) {
										integer14 = 0;
									} else if (integer15 > 1) {
										integer14 = 0;
									}
								} else if (integer15 > 0) {
									azt13 = azt.B;
									if (integer15 > 3) {
										integer14 = 1;
									} else {
										integer14 = 3;
									}
								}
							}

							if (azt13 != azt.b) {
								bbn3.h[integer8 + integer9 * 128] = (byte)(azt13.M * 4 + integer14);
								bbn3.a(integer8, integer9);
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void a(afj afj, ajs ajs, sn sn, int integer, boolean boolean5) {
		if (!ajs.E) {
			bbn bbn7 = this.a(afj, ajs);
			if (sn instanceof aay) {
				aay aay8 = (aay)sn;
				bbn7.a(aay8, afj);
			}

			if (boolean5 || sn instanceof aay && ((aay)sn).ch() == afj) {
				this.a(ajs, sn, bbn7);
			}
		}
	}

	@Nullable
	@Override
	public fm<?> a(afj afj, ajs ajs, aay aay) {
		return this.a(afj, ajs).a(afj, ajs, aay);
	}

	@Override
	public void b(afj afj, ajs ajs, aay aay) {
		du du5 = afj.p();
		if (du5 != null) {
			if (du5.b("map_scale_direction", 99)) {
				a(afj, ajs, du5.h("map_scale_direction"));
				du5.q("map_scale_direction");
			} else if (du5.p("map_tracking_position")) {
				b(afj, ajs);
				du5.q("map_tracking_position");
			}
		}
	}

	protected static void a(afj afj, ajs ajs, int integer) {
		bbn bbn4 = afl.bl.a(afj, ajs);
		afj.b(ajs.b("map"));
		bbn bbn5 = new bbn("map_" + afj.j());
		if (bbn4 != null) {
			bbn5.g = (byte)ot.a(bbn4.g + integer, 0, 4);
			bbn5.e = bbn4.e;
			bbn5.a((double)bbn4.b, (double)bbn4.c, bbn5.g);
			bbn5.d = bbn4.d;
			bbn5.c();
			ajs.a("map_" + afj.j(), bbn5);
		}
	}

	protected static void b(afj afj, ajs ajs) {
		bbn bbn3 = afl.bl.a(afj, ajs);
		afj.b(ajs.b("map"));
		bbn bbn4 = new bbn("map_" + afj.j());
		bbn4.e = true;
		if (bbn3 != null) {
			bbn4.b = bbn3.b;
			bbn4.c = bbn3.c;
			bbn4.g = bbn3.g;
			bbn4.d = bbn3.d;
			bbn4.c();
			ajs.a("map_" + afj.j(), bbn4);
		}
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		bbn bbn6 = this.a(afj, aay.l);
		if (boolean4) {
			if (bbn6 == null) {
				list.add("Unknown map");
			} else {
				list.add("Scaling at 1:" + (1 << bbn6.g));
				list.add("(Level " + bbn6.g + "/" + 4 + ")");
			}
		}
	}

	public static int h(afj afj) {
		du du2 = afj.d("display");
		if (du2 != null && du2.b("MapColor", 99)) {
			int integer3 = du2.h("MapColor");
			return 0xFF000000 | integer3 & 16777215;
		} else {
			return -12173266;
		}
	}
}

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ayw {
	public static void a() {
		ayo.a(ayw.i.class, "WMP");
	}

	public static void a(ayz ayz, co co, aqi aqi, List<ayw.i> list, Random random) {
		ayw.c c6 = new ayw.c(random);
		ayw.d d7 = new ayw.d(ayz, random);
		d7.a(co, aqi, list, c6);
	}

	static class a extends ayw.b {
		private a() {
		}

		@Override
		public String a(Random random) {
			return "1x1_a" + (random.nextInt(5) + 1);
		}

		@Override
		public String b(Random random) {
			return "1x1_as" + (random.nextInt(4) + 1);
		}

		@Override
		public String a(Random random, boolean boolean2) {
			return "1x2_a" + (random.nextInt(9) + 1);
		}

		@Override
		public String b(Random random, boolean boolean2) {
			return "1x2_b" + (random.nextInt(5) + 1);
		}

		@Override
		public String c(Random random) {
			return "1x2_s" + (random.nextInt(2) + 1);
		}

		@Override
		public String d(Random random) {
			return "2x2_a" + (random.nextInt(4) + 1);
		}

		@Override
		public String e(Random random) {
			return "2x2_s1";
		}
	}

	abstract static class b {
		private b() {
		}

		public abstract String a(Random random);

		public abstract String b(Random random);

		public abstract String a(Random random, boolean boolean2);

		public abstract String b(Random random, boolean boolean2);

		public abstract String c(Random random);

		public abstract String d(Random random);

		public abstract String e(Random random);
	}

	static class c {
		private final Random a;
		private final ayw.g b;
		private final ayw.g c;
		private final ayw.g[] d;
		private final int e;
		private final int f;

		public c(Random random) {
			this.a = random;
			int integer3 = 11;
			this.e = 7;
			this.f = 4;
			this.b = new ayw.g(11, 11, 5);
			this.b.a(this.e, this.f, this.e + 1, this.f + 1, 3);
			this.b.a(this.e - 1, this.f, this.e - 1, this.f + 1, 2);
			this.b.a(this.e + 2, this.f - 2, this.e + 3, this.f + 3, 5);
			this.b.a(this.e + 1, this.f - 2, this.e + 1, this.f - 1, 1);
			this.b.a(this.e + 1, this.f + 2, this.e + 1, this.f + 3, 1);
			this.b.a(this.e - 1, this.f - 1, 1);
			this.b.a(this.e - 1, this.f + 2, 1);
			this.b.a(0, 0, 11, 1, 5);
			this.b.a(0, 9, 11, 11, 5);
			this.a(this.b, this.e, this.f - 2, cv.WEST, 6);
			this.a(this.b, this.e, this.f + 3, cv.WEST, 6);
			this.a(this.b, this.e - 2, this.f - 1, cv.WEST, 3);
			this.a(this.b, this.e - 2, this.f + 2, cv.WEST, 3);

			while (this.a(this.b)) {
			}

			this.d = new ayw.g[3];
			this.d[0] = new ayw.g(11, 11, 5);
			this.d[1] = new ayw.g(11, 11, 5);
			this.d[2] = new ayw.g(11, 11, 5);
			this.a(this.b, this.d[0]);
			this.a(this.b, this.d[1]);
			this.d[0].a(this.e + 1, this.f, this.e + 1, this.f + 1, 8388608);
			this.d[1].a(this.e + 1, this.f, this.e + 1, this.f + 1, 8388608);
			this.c = new ayw.g(this.b.b, this.b.c, 5);
			this.b();
			this.a(this.c, this.d[2]);
		}

		public static boolean a(ayw.g g, int integer2, int integer3) {
			int integer4 = g.a(integer2, integer3);
			return integer4 == 1 || integer4 == 2 || integer4 == 3 || integer4 == 4;
		}

		public boolean a(ayw.g g, int integer2, int integer3, int integer4, int integer5) {
			return (this.d[integer4].a(integer2, integer3) & 65535) == integer5;
		}

		@Nullable
		public cv b(ayw.g g, int integer2, int integer3, int integer4, int integer5) {
			for (cv cv10 : cv.c.HORIZONTAL.a()) {
				if (this.a(g, integer2 + cv10.g(), integer3 + cv10.i(), integer4, integer5)) {
					return cv10;
				}
			}

			return null;
		}

		private void a(ayw.g g, int integer2, int integer3, cv cv, int integer5) {
			if (integer5 > 0) {
				g.a(integer2, integer3, 1);
				g.a(integer2 + cv.g(), integer3 + cv.i(), 0, 1);

				for (int integer7 = 0; integer7 < 8; integer7++) {
					cv cv8 = cv.b(this.a.nextInt(4));
					if (cv8 != cv.d() && (cv8 != cv.EAST || !this.a.nextBoolean())) {
						int integer9 = integer2 + cv.g();
						int integer10 = integer3 + cv.i();
						if (g.a(integer9 + cv8.g(), integer10 + cv8.i()) == 0 && g.a(integer9 + cv8.g() * 2, integer10 + cv8.i() * 2) == 0) {
							this.a(g, integer2 + cv.g() + cv8.g(), integer3 + cv.i() + cv8.i(), cv8, integer5 - 1);
							break;
						}
					}
				}

				cv cv7 = cv.e();
				cv cv8 = cv.f();
				g.a(integer2 + cv7.g(), integer3 + cv7.i(), 0, 2);
				g.a(integer2 + cv8.g(), integer3 + cv8.i(), 0, 2);
				g.a(integer2 + cv.g() + cv7.g(), integer3 + cv.i() + cv7.i(), 0, 2);
				g.a(integer2 + cv.g() + cv8.g(), integer3 + cv.i() + cv8.i(), 0, 2);
				g.a(integer2 + cv.g() * 2, integer3 + cv.i() * 2, 0, 2);
				g.a(integer2 + cv7.g() * 2, integer3 + cv7.i() * 2, 0, 2);
				g.a(integer2 + cv8.g() * 2, integer3 + cv8.i() * 2, 0, 2);
			}
		}

		private boolean a(ayw.g g) {
			boolean boolean3 = false;

			for (int integer4 = 0; integer4 < g.c; integer4++) {
				for (int integer5 = 0; integer5 < g.b; integer5++) {
					if (g.a(integer5, integer4) == 0) {
						int integer6 = 0;
						integer6 += a(g, integer5 + 1, integer4) ? 1 : 0;
						integer6 += a(g, integer5 - 1, integer4) ? 1 : 0;
						integer6 += a(g, integer5, integer4 + 1) ? 1 : 0;
						integer6 += a(g, integer5, integer4 - 1) ? 1 : 0;
						if (integer6 >= 3) {
							g.a(integer5, integer4, 2);
							boolean3 = true;
						} else if (integer6 == 2) {
							int integer7 = 0;
							integer7 += a(g, integer5 + 1, integer4 + 1) ? 1 : 0;
							integer7 += a(g, integer5 - 1, integer4 + 1) ? 1 : 0;
							integer7 += a(g, integer5 + 1, integer4 - 1) ? 1 : 0;
							integer7 += a(g, integer5 - 1, integer4 - 1) ? 1 : 0;
							if (integer7 <= 1) {
								g.a(integer5, integer4, 2);
								boolean3 = true;
							}
						}
					}
				}
			}

			return boolean3;
		}

		private void b() {
			List<pa<Integer, Integer>> list2 = Lists.newArrayList();
			ayw.g g3 = this.d[1];

			for (int integer4 = 0; integer4 < this.c.c; integer4++) {
				for (int integer5 = 0; integer5 < this.c.b; integer5++) {
					int integer6 = g3.a(integer5, integer4);
					int integer7 = integer6 & 983040;
					if (integer7 == 131072 && (integer6 & 2097152) == 2097152) {
						list2.add(new pa<>(integer5, integer4));
					}
				}
			}

			if (list2.isEmpty()) {
				this.c.a(0, 0, this.c.b, this.c.c, 5);
			} else {
				pa<Integer, Integer> pa4 = (pa<Integer, Integer>)list2.get(this.a.nextInt(list2.size()));
				int integer5x = g3.a(pa4.a(), pa4.b());
				g3.a(pa4.a(), pa4.b(), integer5x | 4194304);
				cv cv6 = this.b(this.b, pa4.a(), pa4.b(), 1, integer5x & 65535);
				int integer7 = pa4.a() + cv6.g();
				int integer8 = pa4.b() + cv6.i();

				for (int integer9 = 0; integer9 < this.c.c; integer9++) {
					for (int integer10 = 0; integer10 < this.c.b; integer10++) {
						if (!a(this.b, integer10, integer9)) {
							this.c.a(integer10, integer9, 5);
						} else if (integer10 == pa4.a() && integer9 == pa4.b()) {
							this.c.a(integer10, integer9, 3);
						} else if (integer10 == integer7 && integer9 == integer8) {
							this.c.a(integer10, integer9, 3);
							this.d[2].a(integer10, integer9, 8388608);
						}
					}
				}

				List<cv> list9 = Lists.newArrayList();

				for (cv cv13 : cv.c.HORIZONTAL.a()) {
					if (this.c.a(integer7 + cv13.g(), integer8 + cv13.i()) == 0) {
						list9.add(cv13);
					}
				}

				if (list9.isEmpty()) {
					this.c.a(0, 0, this.c.b, this.c.c, 5);
					g3.a(pa4.a(), pa4.b(), integer5x);
				} else {
					cv cv10 = (cv)list9.get(this.a.nextInt(list9.size()));
					this.a(this.c, integer7 + cv10.g(), integer8 + cv10.i(), cv10, 4);

					while (this.a(this.c)) {
					}
				}
			}
		}

		private void a(ayw.g g1, ayw.g g2) {
			List<pa<Integer, Integer>> list4 = Lists.newArrayList();

			for (int integer5 = 0; integer5 < g1.c; integer5++) {
				for (int integer6 = 0; integer6 < g1.b; integer6++) {
					if (g1.a(integer6, integer5) == 2) {
						list4.add(new pa<>(integer6, integer5));
					}
				}
			}

			Collections.shuffle(list4, this.a);
			int integer5 = 10;

			for (pa<Integer, Integer> pa7 : list4) {
				int integer8 = pa7.a();
				int integer9 = pa7.b();
				if (g2.a(integer8, integer9) == 0) {
					int integer10 = integer8;
					int integer11 = integer8;
					int integer12 = integer9;
					int integer13 = integer9;
					int integer14 = 65536;
					if (g2.a(integer8 + 1, integer9) == 0
						&& g2.a(integer8, integer9 + 1) == 0
						&& g2.a(integer8 + 1, integer9 + 1) == 0
						&& g1.a(integer8 + 1, integer9) == 2
						&& g1.a(integer8, integer9 + 1) == 2
						&& g1.a(integer8 + 1, integer9 + 1) == 2) {
						integer11 = integer8 + 1;
						integer13 = integer9 + 1;
						integer14 = 262144;
					} else if (g2.a(integer8 - 1, integer9) == 0
						&& g2.a(integer8, integer9 + 1) == 0
						&& g2.a(integer8 - 1, integer9 + 1) == 0
						&& g1.a(integer8 - 1, integer9) == 2
						&& g1.a(integer8, integer9 + 1) == 2
						&& g1.a(integer8 - 1, integer9 + 1) == 2) {
						integer10 = integer8 - 1;
						integer13 = integer9 + 1;
						integer14 = 262144;
					} else if (g2.a(integer8 - 1, integer9) == 0
						&& g2.a(integer8, integer9 - 1) == 0
						&& g2.a(integer8 - 1, integer9 - 1) == 0
						&& g1.a(integer8 - 1, integer9) == 2
						&& g1.a(integer8, integer9 - 1) == 2
						&& g1.a(integer8 - 1, integer9 - 1) == 2) {
						integer10 = integer8 - 1;
						integer12 = integer9 - 1;
						integer14 = 262144;
					} else if (g2.a(integer8 + 1, integer9) == 0 && g1.a(integer8 + 1, integer9) == 2) {
						integer11 = integer8 + 1;
						integer14 = 131072;
					} else if (g2.a(integer8, integer9 + 1) == 0 && g1.a(integer8, integer9 + 1) == 2) {
						integer13 = integer9 + 1;
						integer14 = 131072;
					} else if (g2.a(integer8 - 1, integer9) == 0 && g1.a(integer8 - 1, integer9) == 2) {
						integer10 = integer8 - 1;
						integer14 = 131072;
					} else if (g2.a(integer8, integer9 - 1) == 0 && g1.a(integer8, integer9 - 1) == 2) {
						integer12 = integer9 - 1;
						integer14 = 131072;
					}

					int integer15 = this.a.nextBoolean() ? integer10 : integer11;
					int integer16 = this.a.nextBoolean() ? integer12 : integer13;
					int integer17 = 2097152;
					if (!g1.b(integer15, integer16, 1)) {
						integer15 = integer15 == integer10 ? integer11 : integer10;
						integer16 = integer16 == integer12 ? integer13 : integer12;
						if (!g1.b(integer15, integer16, 1)) {
							integer16 = integer16 == integer12 ? integer13 : integer12;
							if (!g1.b(integer15, integer16, 1)) {
								integer15 = integer15 == integer10 ? integer11 : integer10;
								integer16 = integer16 == integer12 ? integer13 : integer12;
								if (!g1.b(integer15, integer16, 1)) {
									integer17 = 0;
									integer15 = integer10;
									integer16 = integer12;
								}
							}
						}
					}

					for (int integer18 = integer12; integer18 <= integer13; integer18++) {
						for (int integer19 = integer10; integer19 <= integer11; integer19++) {
							if (integer19 == integer15 && integer18 == integer16) {
								g2.a(integer19, integer18, 1048576 | integer17 | integer14 | integer5);
							} else {
								g2.a(integer19, integer18, integer14 | integer5);
							}
						}
					}

					integer5++;
				}
			}
		}
	}

	static class d {
		private final ayz a;
		private final Random b;
		private int c;
		private int d;

		public d(ayz ayz, Random random) {
			this.a = ayz;
			this.b = random;
		}

		public void a(co co, aqi aqi, List<ayw.i> list, ayw.c c) {
			ayw.e e6 = new ayw.e();
			e6.b = co;
			e6.a = aqi;
			e6.c = "wall_flat";
			ayw.e e7 = new ayw.e();
			this.a(list, e6);
			e7.b = e6.b.b(8);
			e7.a = e6.a;
			e7.c = "wall_window";
			if (!list.isEmpty()) {
			}

			ayw.g g8 = c.b;
			ayw.g g9 = c.c;
			this.c = c.e + 1;
			this.d = c.f + 1;
			int integer10 = c.e + 1;
			int integer11 = c.f;
			this.a(list, e6, g8, cv.SOUTH, this.c, this.d, integer10, integer11);
			this.a(list, e7, g8, cv.SOUTH, this.c, this.d, integer10, integer11);
			ayw.e e12 = new ayw.e();
			e12.b = e6.b.b(19);
			e12.a = e6.a;
			e12.c = "wall_window";
			boolean boolean13 = false;

			for (int integer14 = 0; integer14 < g9.c && !boolean13; integer14++) {
				for (int integer15 = g9.b - 1; integer15 >= 0 && !boolean13; integer15--) {
					if (ayw.c.a(g9, integer15, integer14)) {
						e12.b = e12.b.a(aqi.a(cv.SOUTH), 8 + (integer14 - this.d) * 8);
						e12.b = e12.b.a(aqi.a(cv.EAST), (integer15 - this.c) * 8);
						this.b(list, e12);
						this.a(list, e12, g9, cv.SOUTH, integer15, integer14, integer15, integer14);
						boolean13 = true;
					}
				}
			}

			this.a(list, co.b(16), aqi, g8, g9);
			this.a(list, co.b(27), aqi, g9, null);
			if (!list.isEmpty()) {
			}

			ayw.b[] arr14 = new ayw.b[]{new ayw.a(), new ayw.f(), new ayw.h()};

			for (int integer15x = 0; integer15x < 3; integer15x++) {
				co co16 = co.b(8 * integer15x + (integer15x == 2 ? 3 : 0));
				ayw.g g17 = c.d[integer15x];
				ayw.g g18 = integer15x == 2 ? g9 : g8;
				String string19 = integer15x == 0 ? "carpet_south" : "carpet_south_2";
				String string20 = integer15x == 0 ? "carpet_west" : "carpet_west_2";

				for (int integer21 = 0; integer21 < g18.c; integer21++) {
					for (int integer22 = 0; integer22 < g18.b; integer22++) {
						if (g18.a(integer22, integer21) == 1) {
							co co23 = co16.a(aqi.a(cv.SOUTH), 8 + (integer21 - this.d) * 8);
							co23 = co23.a(aqi.a(cv.EAST), (integer22 - this.c) * 8);
							list.add(new ayw.i(this.a, "corridor_floor", co23, aqi));
							if (g18.a(integer22, integer21 - 1) == 1 || (g17.a(integer22, integer21 - 1) & 8388608) == 8388608) {
								list.add(new ayw.i(this.a, "carpet_north", co23.a(aqi.a(cv.EAST), 1).a(), aqi));
							}

							if (g18.a(integer22 + 1, integer21) == 1 || (g17.a(integer22 + 1, integer21) & 8388608) == 8388608) {
								list.add(new ayw.i(this.a, "carpet_east", co23.a(aqi.a(cv.SOUTH), 1).a(aqi.a(cv.EAST), 5).a(), aqi));
							}

							if (g18.a(integer22, integer21 + 1) == 1 || (g17.a(integer22, integer21 + 1) & 8388608) == 8388608) {
								list.add(new ayw.i(this.a, string19, co23.a(aqi.a(cv.SOUTH), 5).a(aqi.a(cv.WEST), 1), aqi));
							}

							if (g18.a(integer22 - 1, integer21) == 1 || (g17.a(integer22 - 1, integer21) & 8388608) == 8388608) {
								list.add(new ayw.i(this.a, string20, co23.a(aqi.a(cv.WEST), 1).a(aqi.a(cv.NORTH), 1), aqi));
							}
						}
					}
				}

				String string21 = integer15x == 0 ? "indoors_wall" : "indoors_wall_2";
				String string22 = integer15x == 0 ? "indoors_door" : "indoors_door_2";
				List<cv> list23 = Lists.newArrayList();

				for (int integer24 = 0; integer24 < g18.c; integer24++) {
					for (int integer25 = 0; integer25 < g18.b; integer25++) {
						boolean boolean26 = integer15x == 2 && g18.a(integer25, integer24) == 3;
						if (g18.a(integer25, integer24) == 2 || boolean26) {
							int integer27 = g17.a(integer25, integer24);
							int integer28 = integer27 & 983040;
							int integer29 = integer27 & 65535;
							boolean26 = boolean26 && (integer27 & 8388608) == 8388608;
							list23.clear();
							if ((integer27 & 2097152) == 2097152) {
								for (cv cv33 : cv.c.HORIZONTAL.a()) {
									if (g18.a(integer25 + cv33.g(), integer24 + cv33.i()) == 1) {
										list23.add(cv33);
									}
								}
							}

							cv cv30 = null;
							if (!list23.isEmpty()) {
								cv30 = (cv)list23.get(this.b.nextInt(list23.size()));
							} else if ((integer27 & 1048576) == 1048576) {
								cv30 = cv.UP;
							}

							co co31 = co16.a(aqi.a(cv.SOUTH), 8 + (integer24 - this.d) * 8);
							co31 = co31.a(aqi.a(cv.EAST), -1 + (integer25 - this.c) * 8);
							if (ayw.c.a(g18, integer25 - 1, integer24) && !c.a(g18, integer25 - 1, integer24, integer15x, integer29)) {
								list.add(new ayw.i(this.a, cv30 == cv.WEST ? string22 : string21, co31, aqi));
							}

							if (g18.a(integer25 + 1, integer24) == 1 && !boolean26) {
								co co32 = co31.a(aqi.a(cv.EAST), 8);
								list.add(new ayw.i(this.a, cv30 == cv.EAST ? string22 : string21, co32, aqi));
							}

							if (ayw.c.a(g18, integer25, integer24 + 1) && !c.a(g18, integer25, integer24 + 1, integer15x, integer29)) {
								co co32 = co31.a(aqi.a(cv.SOUTH), 7);
								co32 = co32.a(aqi.a(cv.EAST), 7);
								list.add(new ayw.i(this.a, cv30 == cv.SOUTH ? string22 : string21, co32, aqi.a(aqi.CLOCKWISE_90)));
							}

							if (g18.a(integer25, integer24 - 1) == 1 && !boolean26) {
								co co32 = co31.a(aqi.a(cv.NORTH), 1);
								co32 = co32.a(aqi.a(cv.EAST), 7);
								list.add(new ayw.i(this.a, cv30 == cv.NORTH ? string22 : string21, co32, aqi.a(aqi.CLOCKWISE_90)));
							}

							if (integer28 == 65536) {
								this.a(list, co31, aqi, cv30, arr14[integer15x]);
							} else if (integer28 == 131072 && cv30 != null) {
								cv cv32 = c.b(g18, integer25, integer24, integer15x, integer29);
								boolean boolean33 = (integer27 & 4194304) == 4194304;
								this.a(list, co31, aqi, cv32, cv30, arr14[integer15x], boolean33);
							} else if (integer28 == 262144 && cv30 != null && cv30 != cv.UP) {
								cv cv32 = cv30.e();
								if (!c.a(g18, integer25 + cv32.g(), integer24 + cv32.i(), integer15x, integer29)) {
									cv32 = cv32.d();
								}

								this.a(list, co31, aqi, cv32, cv30, arr14[integer15x]);
							} else if (integer28 == 262144 && cv30 == cv.UP) {
								this.a(list, co31, aqi, arr14[integer15x]);
							}
						}
					}
				}
			}
		}

		private void a(List<ayw.i> list, ayw.e e, ayw.g g, cv cv, int integer5, int integer6, int integer7, int integer8) {
			int integer10 = integer5;
			int integer11 = integer6;
			cv cv12 = cv;

			do {
				if (!ayw.c.a(g, integer10 + cv.g(), integer11 + cv.i())) {
					this.c(list, e);
					cv = cv.e();
					if (integer10 != integer7 || integer11 != integer8 || cv12 != cv) {
						this.b(list, e);
					}
				} else if (ayw.c.a(g, integer10 + cv.g(), integer11 + cv.i()) && ayw.c.a(g, integer10 + cv.g() + cv.f().g(), integer11 + cv.i() + cv.f().i())) {
					this.d(list, e);
					integer10 += cv.g();
					integer11 += cv.i();
					cv = cv.f();
				} else {
					integer10 += cv.g();
					integer11 += cv.i();
					if (integer10 != integer7 || integer11 != integer8 || cv12 != cv) {
						this.b(list, e);
					}
				}
			} while (integer10 != integer7 || integer11 != integer8 || cv12 != cv);
		}

		private void a(List<ayw.i> list, co co, aqi aqi, ayw.g g4, @Nullable ayw.g g5) {
			for (int integer7 = 0; integer7 < g4.c; integer7++) {
				for (int integer8 = 0; integer8 < g4.b; integer8++) {
					co co9 = co.a(aqi.a(cv.SOUTH), 8 + (integer7 - this.d) * 8);
					co9 = co9.a(aqi.a(cv.EAST), (integer8 - this.c) * 8);
					boolean boolean10 = g5 != null && ayw.c.a(g5, integer8, integer7);
					if (ayw.c.a(g4, integer8, integer7) && !boolean10) {
						list.add(new ayw.i(this.a, "roof", co9.b(3), aqi));
						if (!ayw.c.a(g4, integer8 + 1, integer7)) {
							co co11 = co9.a(aqi.a(cv.EAST), 6);
							list.add(new ayw.i(this.a, "roof_front", co11, aqi));
						}

						if (!ayw.c.a(g4, integer8 - 1, integer7)) {
							co co11 = co9.a(aqi.a(cv.EAST), 0);
							co11 = co11.a(aqi.a(cv.SOUTH), 7);
							list.add(new ayw.i(this.a, "roof_front", co11, aqi.a(aqi.CLOCKWISE_180)));
						}

						if (!ayw.c.a(g4, integer8, integer7 - 1)) {
							co co11 = co9.a(aqi.a(cv.WEST), 1);
							list.add(new ayw.i(this.a, "roof_front", co11, aqi.a(aqi.COUNTERCLOCKWISE_90)));
						}

						if (!ayw.c.a(g4, integer8, integer7 + 1)) {
							co co11 = co9.a(aqi.a(cv.EAST), 6);
							co11 = co11.a(aqi.a(cv.SOUTH), 6);
							list.add(new ayw.i(this.a, "roof_front", co11, aqi.a(aqi.CLOCKWISE_90)));
						}
					}
				}
			}

			if (g5 != null) {
				for (int integer7 = 0; integer7 < g4.c; integer7++) {
					for (int integer8x = 0; integer8x < g4.b; integer8x++) {
						co var17 = co.a(aqi.a(cv.SOUTH), 8 + (integer7 - this.d) * 8);
						var17 = var17.a(aqi.a(cv.EAST), (integer8x - this.c) * 8);
						boolean boolean10 = ayw.c.a(g5, integer8x, integer7);
						if (ayw.c.a(g4, integer8x, integer7) && boolean10) {
							if (!ayw.c.a(g4, integer8x + 1, integer7)) {
								co co11 = var17.a(aqi.a(cv.EAST), 7);
								list.add(new ayw.i(this.a, "small_wall", co11, aqi));
							}

							if (!ayw.c.a(g4, integer8x - 1, integer7)) {
								co co11 = var17.a(aqi.a(cv.WEST), 1);
								co11 = co11.a(aqi.a(cv.SOUTH), 6);
								list.add(new ayw.i(this.a, "small_wall", co11, aqi.a(aqi.CLOCKWISE_180)));
							}

							if (!ayw.c.a(g4, integer8x, integer7 - 1)) {
								co co11 = var17.a(aqi.a(cv.WEST), 0);
								co11 = co11.a(aqi.a(cv.NORTH), 1);
								list.add(new ayw.i(this.a, "small_wall", co11, aqi.a(aqi.COUNTERCLOCKWISE_90)));
							}

							if (!ayw.c.a(g4, integer8x, integer7 + 1)) {
								co co11 = var17.a(aqi.a(cv.EAST), 6);
								co11 = co11.a(aqi.a(cv.SOUTH), 7);
								list.add(new ayw.i(this.a, "small_wall", co11, aqi.a(aqi.CLOCKWISE_90)));
							}

							if (!ayw.c.a(g4, integer8x + 1, integer7)) {
								if (!ayw.c.a(g4, integer8x, integer7 - 1)) {
									co co11 = var17.a(aqi.a(cv.EAST), 7);
									co11 = co11.a(aqi.a(cv.NORTH), 2);
									list.add(new ayw.i(this.a, "small_wall_corner", co11, aqi));
								}

								if (!ayw.c.a(g4, integer8x, integer7 + 1)) {
									co co11 = var17.a(aqi.a(cv.EAST), 8);
									co11 = co11.a(aqi.a(cv.SOUTH), 7);
									list.add(new ayw.i(this.a, "small_wall_corner", co11, aqi.a(aqi.CLOCKWISE_90)));
								}
							}

							if (!ayw.c.a(g4, integer8x - 1, integer7)) {
								if (!ayw.c.a(g4, integer8x, integer7 - 1)) {
									co co11 = var17.a(aqi.a(cv.WEST), 2);
									co11 = co11.a(aqi.a(cv.NORTH), 1);
									list.add(new ayw.i(this.a, "small_wall_corner", co11, aqi.a(aqi.COUNTERCLOCKWISE_90)));
								}

								if (!ayw.c.a(g4, integer8x, integer7 + 1)) {
									co co11 = var17.a(aqi.a(cv.WEST), 1);
									co11 = co11.a(aqi.a(cv.SOUTH), 8);
									list.add(new ayw.i(this.a, "small_wall_corner", co11, aqi.a(aqi.CLOCKWISE_180)));
								}
							}
						}
					}
				}
			}

			for (int integer7 = 0; integer7 < g4.c; integer7++) {
				for (int integer8xx = 0; integer8xx < g4.b; integer8xx++) {
					co var19 = co.a(aqi.a(cv.SOUTH), 8 + (integer7 - this.d) * 8);
					var19 = var19.a(aqi.a(cv.EAST), (integer8xx - this.c) * 8);
					boolean boolean10 = g5 != null && ayw.c.a(g5, integer8xx, integer7);
					if (ayw.c.a(g4, integer8xx, integer7) && !boolean10) {
						if (!ayw.c.a(g4, integer8xx + 1, integer7)) {
							co co11 = var19.a(aqi.a(cv.EAST), 6);
							if (!ayw.c.a(g4, integer8xx, integer7 + 1)) {
								co co12 = co11.a(aqi.a(cv.SOUTH), 6);
								list.add(new ayw.i(this.a, "roof_corner", co12, aqi));
							} else if (ayw.c.a(g4, integer8xx + 1, integer7 + 1)) {
								co co12 = co11.a(aqi.a(cv.SOUTH), 5);
								list.add(new ayw.i(this.a, "roof_inner_corner", co12, aqi));
							}

							if (!ayw.c.a(g4, integer8xx, integer7 - 1)) {
								list.add(new ayw.i(this.a, "roof_corner", co11, aqi.a(aqi.COUNTERCLOCKWISE_90)));
							} else if (ayw.c.a(g4, integer8xx + 1, integer7 - 1)) {
								co co12 = var19.a(aqi.a(cv.EAST), 9);
								co12 = co12.a(aqi.a(cv.NORTH), 2);
								list.add(new ayw.i(this.a, "roof_inner_corner", co12, aqi.a(aqi.CLOCKWISE_90)));
							}
						}

						if (!ayw.c.a(g4, integer8xx - 1, integer7)) {
							co co11x = var19.a(aqi.a(cv.EAST), 0);
							co11x = co11x.a(aqi.a(cv.SOUTH), 0);
							if (!ayw.c.a(g4, integer8xx, integer7 + 1)) {
								co co12 = co11x.a(aqi.a(cv.SOUTH), 6);
								list.add(new ayw.i(this.a, "roof_corner", co12, aqi.a(aqi.CLOCKWISE_90)));
							} else if (ayw.c.a(g4, integer8xx - 1, integer7 + 1)) {
								co co12 = co11x.a(aqi.a(cv.SOUTH), 8);
								co12 = co12.a(aqi.a(cv.WEST), 3);
								list.add(new ayw.i(this.a, "roof_inner_corner", co12, aqi.a(aqi.COUNTERCLOCKWISE_90)));
							}

							if (!ayw.c.a(g4, integer8xx, integer7 - 1)) {
								list.add(new ayw.i(this.a, "roof_corner", co11x, aqi.a(aqi.CLOCKWISE_180)));
							} else if (ayw.c.a(g4, integer8xx - 1, integer7 - 1)) {
								co co12 = co11x.a(aqi.a(cv.SOUTH), 1);
								list.add(new ayw.i(this.a, "roof_inner_corner", co12, aqi.a(aqi.CLOCKWISE_180)));
							}
						}
					}
				}
			}
		}

		private void a(List<ayw.i> list, ayw.e e) {
			cv cv4 = e.a.a(cv.WEST);
			list.add(new ayw.i(this.a, "entrance", e.b.a(cv4, 9), e.a));
			e.b = e.b.a(e.a.a(cv.SOUTH), 16);
		}

		private void b(List<ayw.i> list, ayw.e e) {
			list.add(new ayw.i(this.a, e.c, e.b.a(e.a.a(cv.EAST), 7), e.a));
			e.b = e.b.a(e.a.a(cv.SOUTH), 8);
		}

		private void c(List<ayw.i> list, ayw.e e) {
			e.b = e.b.a(e.a.a(cv.SOUTH), -1);
			list.add(new ayw.i(this.a, "wall_corner", e.b, e.a));
			e.b = e.b.a(e.a.a(cv.SOUTH), -7);
			e.b = e.b.a(e.a.a(cv.WEST), -6);
			e.a = e.a.a(aqi.CLOCKWISE_90);
		}

		private void d(List<ayw.i> list, ayw.e e) {
			e.b = e.b.a(e.a.a(cv.SOUTH), 6);
			e.b = e.b.a(e.a.a(cv.EAST), 8);
			e.a = e.a.a(aqi.COUNTERCLOCKWISE_90);
		}

		private void a(List<ayw.i> list, co co, aqi aqi, cv cv, ayw.b b) {
			aqi aqi7 = aqi.NONE;
			String string8 = b.a(this.b);
			if (cv != cv.EAST) {
				if (cv == cv.NORTH) {
					aqi7 = aqi7.a(aqi.COUNTERCLOCKWISE_90);
				} else if (cv == cv.WEST) {
					aqi7 = aqi7.a(aqi.CLOCKWISE_180);
				} else if (cv == cv.SOUTH) {
					aqi7 = aqi7.a(aqi.CLOCKWISE_90);
				} else {
					string8 = b.b(this.b);
				}
			}

			co co9 = azc.a(new co(1, 0, 0), aou.NONE, aqi7, 7, 7);
			aqi7 = aqi7.a(aqi);
			co9 = co9.a(aqi);
			co co10 = co.a(co9.p(), 0, co9.r());
			list.add(new ayw.i(this.a, string8, co10, aqi7));
		}

		private void a(List<ayw.i> list, co co, aqi aqi, cv cv4, cv cv5, ayw.b b, boolean boolean7) {
			if (cv5 == cv.EAST && cv4 == cv.SOUTH) {
				co co9 = co.a(aqi.a(cv.EAST), 1);
				list.add(new ayw.i(this.a, b.a(this.b, boolean7), co9, aqi));
			} else if (cv5 == cv.EAST && cv4 == cv.NORTH) {
				co co9 = co.a(aqi.a(cv.EAST), 1);
				co9 = co9.a(aqi.a(cv.SOUTH), 6);
				list.add(new ayw.i(this.a, b.a(this.b, boolean7), co9, aqi, aou.LEFT_RIGHT));
			} else if (cv5 == cv.WEST && cv4 == cv.NORTH) {
				co co9 = co.a(aqi.a(cv.EAST), 7);
				co9 = co9.a(aqi.a(cv.SOUTH), 6);
				list.add(new ayw.i(this.a, b.a(this.b, boolean7), co9, aqi.a(aqi.CLOCKWISE_180)));
			} else if (cv5 == cv.WEST && cv4 == cv.SOUTH) {
				co co9 = co.a(aqi.a(cv.EAST), 7);
				list.add(new ayw.i(this.a, b.a(this.b, boolean7), co9, aqi, aou.FRONT_BACK));
			} else if (cv5 == cv.SOUTH && cv4 == cv.EAST) {
				co co9 = co.a(aqi.a(cv.EAST), 1);
				list.add(new ayw.i(this.a, b.a(this.b, boolean7), co9, aqi.a(aqi.CLOCKWISE_90), aou.LEFT_RIGHT));
			} else if (cv5 == cv.SOUTH && cv4 == cv.WEST) {
				co co9 = co.a(aqi.a(cv.EAST), 7);
				list.add(new ayw.i(this.a, b.a(this.b, boolean7), co9, aqi.a(aqi.CLOCKWISE_90)));
			} else if (cv5 == cv.NORTH && cv4 == cv.WEST) {
				co co9 = co.a(aqi.a(cv.EAST), 7);
				co9 = co9.a(aqi.a(cv.SOUTH), 6);
				list.add(new ayw.i(this.a, b.a(this.b, boolean7), co9, aqi.a(aqi.CLOCKWISE_90), aou.FRONT_BACK));
			} else if (cv5 == cv.NORTH && cv4 == cv.EAST) {
				co co9 = co.a(aqi.a(cv.EAST), 1);
				co9 = co9.a(aqi.a(cv.SOUTH), 6);
				list.add(new ayw.i(this.a, b.a(this.b, boolean7), co9, aqi.a(aqi.COUNTERCLOCKWISE_90)));
			} else if (cv5 == cv.SOUTH && cv4 == cv.NORTH) {
				co co9 = co.a(aqi.a(cv.EAST), 1);
				co9 = co9.a(aqi.a(cv.NORTH), 8);
				list.add(new ayw.i(this.a, b.b(this.b, boolean7), co9, aqi));
			} else if (cv5 == cv.NORTH && cv4 == cv.SOUTH) {
				co co9 = co.a(aqi.a(cv.EAST), 7);
				co9 = co9.a(aqi.a(cv.SOUTH), 14);
				list.add(new ayw.i(this.a, b.b(this.b, boolean7), co9, aqi.a(aqi.CLOCKWISE_180)));
			} else if (cv5 == cv.WEST && cv4 == cv.EAST) {
				co co9 = co.a(aqi.a(cv.EAST), 15);
				list.add(new ayw.i(this.a, b.b(this.b, boolean7), co9, aqi.a(aqi.CLOCKWISE_90)));
			} else if (cv5 == cv.EAST && cv4 == cv.WEST) {
				co co9 = co.a(aqi.a(cv.WEST), 7);
				co9 = co9.a(aqi.a(cv.SOUTH), 6);
				list.add(new ayw.i(this.a, b.b(this.b, boolean7), co9, aqi.a(aqi.COUNTERCLOCKWISE_90)));
			} else if (cv5 == cv.UP && cv4 == cv.EAST) {
				co co9 = co.a(aqi.a(cv.EAST), 15);
				list.add(new ayw.i(this.a, b.c(this.b), co9, aqi.a(aqi.CLOCKWISE_90)));
			} else if (cv5 == cv.UP && cv4 == cv.SOUTH) {
				co co9 = co.a(aqi.a(cv.EAST), 1);
				co9 = co9.a(aqi.a(cv.NORTH), 0);
				list.add(new ayw.i(this.a, b.c(this.b), co9, aqi));
			}
		}

		private void a(List<ayw.i> list, co co, aqi aqi, cv cv4, cv cv5, ayw.b b) {
			int integer8 = 0;
			int integer9 = 0;
			aqi aqi10 = aqi;
			aou aou11 = aou.NONE;
			if (cv5 == cv.EAST && cv4 == cv.SOUTH) {
				integer8 = -7;
			} else if (cv5 == cv.EAST && cv4 == cv.NORTH) {
				integer8 = -7;
				integer9 = 6;
				aou11 = aou.LEFT_RIGHT;
			} else if (cv5 == cv.NORTH && cv4 == cv.EAST) {
				integer8 = 1;
				integer9 = 14;
				aqi10 = aqi.a(aqi.COUNTERCLOCKWISE_90);
			} else if (cv5 == cv.NORTH && cv4 == cv.WEST) {
				integer8 = 7;
				integer9 = 14;
				aqi10 = aqi.a(aqi.COUNTERCLOCKWISE_90);
				aou11 = aou.LEFT_RIGHT;
			} else if (cv5 == cv.SOUTH && cv4 == cv.WEST) {
				integer8 = 7;
				integer9 = -8;
				aqi10 = aqi.a(aqi.CLOCKWISE_90);
			} else if (cv5 == cv.SOUTH && cv4 == cv.EAST) {
				integer8 = 1;
				integer9 = -8;
				aqi10 = aqi.a(aqi.CLOCKWISE_90);
				aou11 = aou.LEFT_RIGHT;
			} else if (cv5 == cv.WEST && cv4 == cv.NORTH) {
				integer8 = 15;
				integer9 = 6;
				aqi10 = aqi.a(aqi.CLOCKWISE_180);
			} else if (cv5 == cv.WEST && cv4 == cv.SOUTH) {
				integer8 = 15;
				aou11 = aou.FRONT_BACK;
			}

			co co12 = co.a(aqi.a(cv.EAST), integer8);
			co12 = co12.a(aqi.a(cv.SOUTH), integer9);
			list.add(new ayw.i(this.a, b.d(this.b), co12, aqi10, aou11));
		}

		private void a(List<ayw.i> list, co co, aqi aqi, ayw.b b) {
			co co6 = co.a(aqi.a(cv.EAST), 1);
			list.add(new ayw.i(this.a, b.e(this.b), co6, aqi, aou.NONE));
		}
	}

	static class e {
		public aqi a;
		public co b;
		public String c;

		private e() {
		}
	}

	static class f extends ayw.b {
		private f() {
		}

		@Override
		public String a(Random random) {
			return "1x1_b" + (random.nextInt(4) + 1);
		}

		@Override
		public String b(Random random) {
			return "1x1_as" + (random.nextInt(4) + 1);
		}

		@Override
		public String a(Random random, boolean boolean2) {
			return boolean2 ? "1x2_c_stairs" : "1x2_c" + (random.nextInt(4) + 1);
		}

		@Override
		public String b(Random random, boolean boolean2) {
			return boolean2 ? "1x2_d_stairs" : "1x2_d" + (random.nextInt(5) + 1);
		}

		@Override
		public String c(Random random) {
			return "1x2_se" + (random.nextInt(1) + 1);
		}

		@Override
		public String d(Random random) {
			return "2x2_b" + (random.nextInt(5) + 1);
		}

		@Override
		public String e(Random random) {
			return "2x2_s1";
		}
	}

	static class g {
		private final int[][] a;
		private final int b;
		private final int c;
		private final int d;

		public g(int integer1, int integer2, int integer3) {
			this.b = integer1;
			this.c = integer2;
			this.d = integer3;
			this.a = new int[integer1][integer2];
		}

		public void a(int integer1, int integer2, int integer3) {
			if (integer1 >= 0 && integer1 < this.b && integer2 >= 0 && integer2 < this.c) {
				this.a[integer1][integer2] = integer3;
			}
		}

		public void a(int integer1, int integer2, int integer3, int integer4, int integer5) {
			for (int integer7 = integer2; integer7 <= integer4; integer7++) {
				for (int integer8 = integer1; integer8 <= integer3; integer8++) {
					this.a(integer8, integer7, integer5);
				}
			}
		}

		public int a(int integer1, int integer2) {
			return integer1 >= 0 && integer1 < this.b && integer2 >= 0 && integer2 < this.c ? this.a[integer1][integer2] : this.d;
		}

		public void a(int integer1, int integer2, int integer3, int integer4) {
			if (this.a(integer1, integer2) == integer3) {
				this.a(integer1, integer2, integer4);
			}
		}

		public boolean b(int integer1, int integer2, int integer3) {
			return this.a(integer1 - 1, integer2) == integer3
				|| this.a(integer1 + 1, integer2) == integer3
				|| this.a(integer1, integer2 + 1) == integer3
				|| this.a(integer1, integer2 - 1) == integer3;
		}
	}

	static class h extends ayw.f {
		private h() {
		}
	}

	public static class i extends ays {
		private String d;
		private aqi e;
		private aou f;

		public i() {
		}

		public i(ayz ayz, String string, co co, aqi aqi) {
			this(ayz, string, co, aqi, aou.NONE);
		}

		public i(ayz ayz, String string, co co, aqi aqi, aou aou) {
			super(0);
			this.d = string;
			this.c = co;
			this.e = aqi;
			this.f = aou;
			this.a(ayz);
		}

		private void a(ayz ayz) {
			azc azc3 = ayz.a(null, new kq("mansion/" + this.d));
			aza aza4 = new aza().a(true).a(this.e).a(this.f);
			this.a(azc3, this.c, aza4);
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Template", this.d);
			du.a("Rot", this.b.c().name());
			du.a("Mi", this.b.b().name());
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.d = du.l("Template");
			this.e = aqi.valueOf(du.l("Rot"));
			this.f = aou.valueOf(du.l("Mi"));
			this.a(ayz);
		}

		@Override
		protected void a(String string, co co, ajs ajs, Random random, axz axz) {
			if (string.startsWith("Chest")) {
				aqi aqi7 = this.b.c();
				atl atl8 = alv.ae.t();
				if ("ChestWest".equals(string)) {
					atl8 = atl8.a(amg.a, aqi7.a(cv.WEST));
				} else if ("ChestEast".equals(string)) {
					atl8 = atl8.a(amg.a, aqi7.a(cv.EAST));
				} else if ("ChestSouth".equals(string)) {
					atl8 = atl8.a(amg.a, aqi7.a(cv.SOUTH));
				} else if ("ChestNorth".equals(string)) {
					atl8 = atl8.a(amg.a, aqi7.a(cv.NORTH));
				}

				this.a(ajs, axz, random, co, bcf.o, atl8);
			} else if ("Mage".equals(string)) {
				zu zu7 = new zu(ajs);
				zu7.cS();
				zu7.a(co, 0.0F, 0.0F);
				ajs.a(zu7);
				ajs.a(co, alv.a.t(), 2);
			} else if ("Warrior".equals(string)) {
				aal aal7 = new aal(ajs);
				aal7.cS();
				aal7.a(co, 0.0F, 0.0F);
				aal7.a(ajs.D(new co(aal7)), null);
				ajs.a(aal7);
				ajs.a(co, alv.a.t(), 2);
			}
		}
	}
}

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class ayb {
	private static final aza a = new aza().a(true);
	private static final aza b = new aza().a(true).a(alv.a);
	private static final ayb.b c = new ayb.b() {
		@Override
		public void a() {
		}

		@Override
		public boolean a(ayz ayz, int integer, ayb.a a, co co, List<ayq> list, Random random) {
			if (integer > 8) {
				return false;
			} else {
				aqi aqi8 = a.b.c();
				ayb.a a9 = ayb.b(list, ayb.b(ayz, a, co, "base_floor", aqi8, true));
				int integer10 = random.nextInt(3);
				if (integer10 == 0) {
					a9 = ayb.b(list, ayb.b(ayz, a9, new co(-1, 4, -1), "base_roof", aqi8, true));
				} else if (integer10 == 1) {
					a9 = ayb.b(list, ayb.b(ayz, a9, new co(-1, 0, -1), "second_floor_2", aqi8, false));
					a9 = ayb.b(list, ayb.b(ayz, a9, new co(-1, 8, -1), "second_roof", aqi8, false));
					ayb.b(ayz, ayb.e, integer + 1, a9, null, list, random);
				} else if (integer10 == 2) {
					a9 = ayb.b(list, ayb.b(ayz, a9, new co(-1, 0, -1), "second_floor_2", aqi8, false));
					a9 = ayb.b(list, ayb.b(ayz, a9, new co(-1, 4, -1), "third_floor_c", aqi8, false));
					a9 = ayb.b(list, ayb.b(ayz, a9, new co(-1, 8, -1), "third_roof", aqi8, true));
					ayb.b(ayz, ayb.e, integer + 1, a9, null, list, random);
				}

				return true;
			}
		}
	};
	private static final List<pa<aqi, co>> d = Lists.newArrayList(
		new pa[]{
			new pa<>(aqi.NONE, new co(1, -1, 0)),
			new pa<>(aqi.CLOCKWISE_90, new co(6, -1, 1)),
			new pa<>(aqi.COUNTERCLOCKWISE_90, new co(0, -1, 5)),
			new pa<>(aqi.CLOCKWISE_180, new co(5, -1, 6))
		}
	);
	private static final ayb.b e = new ayb.b() {
		@Override
		public void a() {
		}

		@Override
		public boolean a(ayz ayz, int integer, ayb.a a, co co, List<ayq> list, Random random) {
			aqi aqi8 = a.b.c();
			ayb.a a9 = ayb.b(list, ayb.b(ayz, a, new co(3 + random.nextInt(2), -3, 3 + random.nextInt(2)), "tower_base", aqi8, true));
			a9 = ayb.b(list, ayb.b(ayz, a9, new co(0, 7, 0), "tower_piece", aqi8, true));
			ayb.a a10 = random.nextInt(3) == 0 ? a9 : null;
			int integer11 = 1 + random.nextInt(3);

			for (int integer12 = 0; integer12 < integer11; integer12++) {
				a9 = ayb.b(list, ayb.b(ayz, a9, new co(0, 4, 0), "tower_piece", aqi8, true));
				if (integer12 < integer11 - 1 && random.nextBoolean()) {
					a10 = a9;
				}
			}

			if (a10 != null) {
				for (pa<aqi, co> pa13 : ayb.d) {
					if (random.nextBoolean()) {
						ayb.a a14 = ayb.b(list, ayb.b(ayz, a10, pa13.b(), "bridge_end", aqi8.a(pa13.a()), true));
						ayb.b(ayz, ayb.f, integer + 1, a14, null, list, random);
					}
				}

				a9 = ayb.b(list, ayb.b(ayz, a9, new co(-1, 4, -1), "tower_top", aqi8, true));
			} else {
				if (integer != 7) {
					return ayb.b(ayz, ayb.h, integer + 1, a9, null, list, random);
				}

				a9 = ayb.b(list, ayb.b(ayz, a9, new co(-1, 4, -1), "tower_top", aqi8, true));
			}

			return true;
		}
	};
	private static final ayb.b f = new ayb.b() {
		public boolean a;

		@Override
		public void a() {
			this.a = false;
		}

		@Override
		public boolean a(ayz ayz, int integer, ayb.a a, co co, List<ayq> list, Random random) {
			aqi aqi8 = a.b.c();
			int integer9 = random.nextInt(4) + 1;
			ayb.a a10 = ayb.b(list, ayb.b(ayz, a, new co(0, 0, -4), "bridge_piece", aqi8, true));
			a10.m = -1;
			int integer11 = 0;

			for (int integer12 = 0; integer12 < integer9; integer12++) {
				if (random.nextBoolean()) {
					a10 = ayb.b(list, ayb.b(ayz, a10, new co(0, integer11, -4), "bridge_piece", aqi8, true));
					integer11 = 0;
				} else {
					if (random.nextBoolean()) {
						a10 = ayb.b(list, ayb.b(ayz, a10, new co(0, integer11, -4), "bridge_steep_stairs", aqi8, true));
					} else {
						a10 = ayb.b(list, ayb.b(ayz, a10, new co(0, integer11, -8), "bridge_gentle_stairs", aqi8, true));
					}

					integer11 = 4;
				}
			}

			if (!this.a && random.nextInt(10 - integer) == 0) {
				ayb.b(list, ayb.b(ayz, a10, new co(-8 + random.nextInt(8), integer11, -70 + random.nextInt(10)), "ship", aqi8, true));
				this.a = true;
			} else if (!ayb.b(ayz, ayb.c, integer + 1, a10, new co(-3, integer11 + 1, -11), list, random)) {
				return false;
			}

			a10 = ayb.b(list, ayb.b(ayz, a10, new co(4, integer11, 0), "bridge_end", aqi8.a(aqi.CLOCKWISE_180), true));
			a10.m = -1;
			return true;
		}
	};
	private static final List<pa<aqi, co>> g = Lists.newArrayList(
		new pa[]{
			new pa<>(aqi.NONE, new co(4, -1, 0)),
			new pa<>(aqi.CLOCKWISE_90, new co(12, -1, 4)),
			new pa<>(aqi.COUNTERCLOCKWISE_90, new co(0, -1, 8)),
			new pa<>(aqi.CLOCKWISE_180, new co(8, -1, 12))
		}
	);
	private static final ayb.b h = new ayb.b() {
		@Override
		public void a() {
		}

		@Override
		public boolean a(ayz ayz, int integer, ayb.a a, co co, List<ayq> list, Random random) {
			aqi aqi9 = a.b.c();
			ayb.a a8 = ayb.b(list, ayb.b(ayz, a, new co(-3, 4, -3), "fat_tower_base", aqi9, true));
			a8 = ayb.b(list, ayb.b(ayz, a8, new co(0, 4, 0), "fat_tower_middle", aqi9, true));

			for (int integer10 = 0; integer10 < 2 && random.nextInt(3) != 0; integer10++) {
				a8 = ayb.b(list, ayb.b(ayz, a8, new co(0, 8, 0), "fat_tower_middle", aqi9, true));

				for (pa<aqi, co> pa12 : ayb.g) {
					if (random.nextBoolean()) {
						ayb.a a13 = ayb.b(list, ayb.b(ayz, a8, pa12.b(), "bridge_end", aqi9.a(pa12.a()), true));
						ayb.b(ayz, ayb.f, integer + 1, a13, null, list, random);
					}
				}
			}

			a8 = ayb.b(list, ayb.b(ayz, a8, new co(-2, 8, -2), "fat_tower_top", aqi9, true));
			return true;
		}
	};

	public static void a() {
		ayo.a(ayb.a.class, "ECP");
	}

	private static ayb.a b(ayz ayz, ayb.a a, co co, String string, aqi aqi, boolean boolean6) {
		ayb.a a7 = new ayb.a(ayz, string, a.c, aqi, boolean6);
		co co8 = a.a.a(a.b, co, a7.b, co.a);
		a7.a(co8.p(), co8.q(), co8.r());
		return a7;
	}

	public static void a(ayz ayz, co co, aqi aqi, List<ayq> list, Random random) {
		h.a();
		c.a();
		f.a();
		e.a();
		ayb.a a6 = b(list, new ayb.a(ayz, "base_floor", co, aqi, true));
		a6 = b(list, b(ayz, a6, new co(-1, 0, -1), "second_floor", aqi, false));
		a6 = b(list, b(ayz, a6, new co(-1, 4, -1), "third_floor", aqi, false));
		a6 = b(list, b(ayz, a6, new co(-1, 8, -1), "third_roof", aqi, true));
		b(ayz, e, 1, a6, null, list, random);
	}

	private static ayb.a b(List<ayq> list, ayb.a a) {
		list.add(a);
		return a;
	}

	private static boolean b(ayz ayz, ayb.b b, int integer, ayb.a a, co co, List<ayq> list, Random random) {
		if (integer > 8) {
			return false;
		} else {
			List<ayq> list8 = Lists.newArrayList();
			if (b.a(ayz, integer, a, co, list8, random)) {
				boolean boolean9 = false;
				int integer10 = random.nextInt();

				for (ayq ayq12 : list8) {
					ayq12.m = integer10;
					ayq ayq13 = ayq.a(list, ayq12.d());
					if (ayq13 != null && ayq13.m != a.m) {
						boolean9 = true;
						break;
					}
				}

				if (!boolean9) {
					list.addAll(list8);
					return true;
				}
			}

			return false;
		}
	}

	public static class a extends ays {
		private String d;
		private aqi e;
		private boolean f;

		public a() {
		}

		public a(ayz ayz, String string, co co, aqi aqi, boolean boolean5) {
			super(0);
			this.d = string;
			this.c = co;
			this.e = aqi;
			this.f = boolean5;
			this.a(ayz);
		}

		private void a(ayz ayz) {
			azc azc3 = ayz.a(null, new kq("endcity/" + this.d));
			aza aza4 = (this.f ? ayb.a : ayb.b).a().a(this.e);
			this.a(azc3, this.c, aza4);
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Template", this.d);
			du.a("Rot", this.e.name());
			du.a("OW", this.f);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.d = du.l("Template");
			this.e = aqi.valueOf(du.l("Rot"));
			this.f = du.p("OW");
			this.a(ayz);
		}

		@Override
		protected void a(String string, co co, ajs ajs, Random random, axz axz) {
			if (string.startsWith("Chest")) {
				co co7 = co.b();
				if (axz.b(co7)) {
					asc asc8 = ajs.r(co7);
					if (asc8 instanceof ase) {
						((ase)asc8).a(bcf.c, random.nextLong());
					}
				}
			} else if (string.startsWith("Sentry")) {
				aae aae7 = new aae(ajs);
				aae7.b((double)co.p() + 0.5, (double)co.q() + 0.5, (double)co.r() + 0.5);
				aae7.g(co);
				ajs.a(aae7);
			} else if (string.startsWith("Elytra")) {
				yz yz7 = new yz(ajs, co, this.e.a(cv.SOUTH));
				yz7.a(new afj(afl.cS));
				ajs.a(yz7);
			}
		}
	}

	interface b {
		void a();

		boolean a(ayz ayz, int integer, ayb.a a, co co, List<ayq> list, Random random);
	}
}

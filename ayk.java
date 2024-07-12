import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import net.minecraft.server.MinecraftServer;

public class ayk {
	public static void a() {
		ayo.a(ayk.a.class, "TeDP");
		ayo.a(ayk.c.class, "TeJP");
		ayo.a(ayk.e.class, "TeSH");
		ayo.a(ayk.b.class, "Iglu");
	}

	public static class a extends ayk.d {
		private final boolean[] e = new boolean[4];

		public a() {
		}

		public a(Random random, int integer2, int integer3) {
			super(random, integer2, 64, integer3, 21, 15, 21);
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("hasPlacedChest0", this.e[0]);
			du.a("hasPlacedChest1", this.e[1]);
			du.a("hasPlacedChest2", this.e[2]);
			du.a("hasPlacedChest3", this.e[3]);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.e[0] = du.p("hasPlacedChest0");
			this.e[1] = du.p("hasPlacedChest1");
			this.e[2] = du.p("hasPlacedChest2");
			this.e[3] = du.p("hasPlacedChest3");
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, -4, 0, this.a - 1, 0, this.c - 1, alv.A.t(), alv.A.t(), false);

			for (int integer5 = 1; integer5 <= 9; integer5++) {
				this.a(ajs, axz, integer5, integer5, integer5, this.a - 1 - integer5, integer5, this.c - 1 - integer5, alv.A.t(), alv.A.t(), false);
				this.a(ajs, axz, integer5 + 1, integer5, integer5 + 1, this.a - 2 - integer5, integer5, this.c - 2 - integer5, alv.a.t(), alv.a.t(), false);
			}

			for (int integer5 = 0; integer5 < this.a; integer5++) {
				for (int integer6 = 0; integer6 < this.c; integer6++) {
					int integer7 = -5;
					this.b(ajs, alv.A.t(), integer5, -5, integer6, axz);
				}
			}

			atl atl5 = alv.bO.t().a(aqy.a, cv.NORTH);
			atl atl6 = alv.bO.t().a(aqy.a, cv.SOUTH);
			atl atl7 = alv.bO.t().a(aqy.a, cv.EAST);
			atl atl8 = alv.bO.t().a(aqy.a, cv.WEST);
			int integer9 = ~aem.ORANGE.b() & 15;
			int integer10 = ~aem.BLUE.b() & 15;
			this.a(ajs, axz, 0, 0, 0, 4, 9, 4, alv.A.t(), alv.a.t(), false);
			this.a(ajs, axz, 1, 10, 1, 3, 10, 3, alv.A.t(), alv.A.t(), false);
			this.a(ajs, atl5, 2, 10, 0, axz);
			this.a(ajs, atl6, 2, 10, 4, axz);
			this.a(ajs, atl7, 0, 10, 2, axz);
			this.a(ajs, atl8, 4, 10, 2, axz);
			this.a(ajs, axz, this.a - 5, 0, 0, this.a - 1, 9, 4, alv.A.t(), alv.a.t(), false);
			this.a(ajs, axz, this.a - 4, 10, 1, this.a - 2, 10, 3, alv.A.t(), alv.A.t(), false);
			this.a(ajs, atl5, this.a - 3, 10, 0, axz);
			this.a(ajs, atl6, this.a - 3, 10, 4, axz);
			this.a(ajs, atl7, this.a - 5, 10, 2, axz);
			this.a(ajs, atl8, this.a - 1, 10, 2, axz);
			this.a(ajs, axz, 8, 0, 0, 12, 4, 4, alv.A.t(), alv.a.t(), false);
			this.a(ajs, axz, 9, 1, 0, 11, 3, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 9, 1, 1, axz);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 9, 2, 1, axz);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 9, 3, 1, axz);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 10, 3, 1, axz);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 11, 3, 1, axz);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 11, 2, 1, axz);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 11, 1, 1, axz);
			this.a(ajs, axz, 4, 1, 1, 8, 3, 3, alv.A.t(), alv.a.t(), false);
			this.a(ajs, axz, 4, 1, 2, 8, 2, 2, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 12, 1, 1, 16, 3, 3, alv.A.t(), alv.a.t(), false);
			this.a(ajs, axz, 12, 1, 2, 16, 2, 2, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 5, 4, 5, this.a - 6, 4, this.c - 6, alv.A.t(), alv.A.t(), false);
			this.a(ajs, axz, 9, 4, 9, 11, 4, 11, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, 8, 1, 8, 8, 3, 8, alv.A.a(aqk.a.SMOOTH.a()), alv.A.a(aqk.a.SMOOTH.a()), false);
			this.a(ajs, axz, 12, 1, 8, 12, 3, 8, alv.A.a(aqk.a.SMOOTH.a()), alv.A.a(aqk.a.SMOOTH.a()), false);
			this.a(ajs, axz, 8, 1, 12, 8, 3, 12, alv.A.a(aqk.a.SMOOTH.a()), alv.A.a(aqk.a.SMOOTH.a()), false);
			this.a(ajs, axz, 12, 1, 12, 12, 3, 12, alv.A.a(aqk.a.SMOOTH.a()), alv.A.a(aqk.a.SMOOTH.a()), false);
			this.a(ajs, axz, 1, 1, 5, 4, 4, 11, alv.A.t(), alv.A.t(), false);
			this.a(ajs, axz, this.a - 5, 1, 5, this.a - 2, 4, 11, alv.A.t(), alv.A.t(), false);
			this.a(ajs, axz, 6, 7, 9, 6, 7, 11, alv.A.t(), alv.A.t(), false);
			this.a(ajs, axz, this.a - 7, 7, 9, this.a - 7, 7, 11, alv.A.t(), alv.A.t(), false);
			this.a(ajs, axz, 5, 5, 9, 5, 7, 11, alv.A.a(aqk.a.SMOOTH.a()), alv.A.a(aqk.a.SMOOTH.a()), false);
			this.a(ajs, axz, this.a - 6, 5, 9, this.a - 6, 7, 11, alv.A.a(aqk.a.SMOOTH.a()), alv.A.a(aqk.a.SMOOTH.a()), false);
			this.a(ajs, alv.a.t(), 5, 5, 10, axz);
			this.a(ajs, alv.a.t(), 5, 6, 10, axz);
			this.a(ajs, alv.a.t(), 6, 6, 10, axz);
			this.a(ajs, alv.a.t(), this.a - 6, 5, 10, axz);
			this.a(ajs, alv.a.t(), this.a - 6, 6, 10, axz);
			this.a(ajs, alv.a.t(), this.a - 7, 6, 10, axz);
			this.a(ajs, axz, 2, 4, 4, 2, 6, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, this.a - 3, 4, 4, this.a - 3, 6, 4, alv.a.t(), alv.a.t(), false);
			this.a(ajs, atl5, 2, 4, 5, axz);
			this.a(ajs, atl5, 2, 3, 4, axz);
			this.a(ajs, atl5, this.a - 3, 4, 5, axz);
			this.a(ajs, atl5, this.a - 3, 3, 4, axz);
			this.a(ajs, axz, 1, 1, 3, 2, 2, 3, alv.A.t(), alv.A.t(), false);
			this.a(ajs, axz, this.a - 3, 1, 3, this.a - 2, 2, 3, alv.A.t(), alv.A.t(), false);
			this.a(ajs, alv.A.t(), 1, 1, 2, axz);
			this.a(ajs, alv.A.t(), this.a - 2, 1, 2, axz);
			this.a(ajs, alv.U.a(arf.a.SAND.a()), 1, 2, 2, axz);
			this.a(ajs, alv.U.a(arf.a.SAND.a()), this.a - 2, 2, 2, axz);
			this.a(ajs, atl8, 2, 1, 2, axz);
			this.a(ajs, atl7, this.a - 3, 1, 2, axz);
			this.a(ajs, axz, 4, 3, 5, 4, 3, 18, alv.A.t(), alv.A.t(), false);
			this.a(ajs, axz, this.a - 5, 3, 5, this.a - 5, 3, 17, alv.A.t(), alv.A.t(), false);
			this.a(ajs, axz, 3, 1, 5, 4, 2, 16, alv.a.t(), alv.a.t(), false);
			this.a(ajs, axz, this.a - 6, 1, 5, this.a - 5, 2, 16, alv.a.t(), alv.a.t(), false);

			for (int integer11 = 5; integer11 <= 17; integer11 += 2) {
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 4, 1, integer11, axz);
				this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), 4, 2, integer11, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), this.a - 5, 1, integer11, axz);
				this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), this.a - 5, 2, integer11, axz);
			}

			this.a(ajs, alv.cu.a(integer9), 10, 0, 7, axz);
			this.a(ajs, alv.cu.a(integer9), 10, 0, 8, axz);
			this.a(ajs, alv.cu.a(integer9), 9, 0, 9, axz);
			this.a(ajs, alv.cu.a(integer9), 11, 0, 9, axz);
			this.a(ajs, alv.cu.a(integer9), 8, 0, 10, axz);
			this.a(ajs, alv.cu.a(integer9), 12, 0, 10, axz);
			this.a(ajs, alv.cu.a(integer9), 7, 0, 10, axz);
			this.a(ajs, alv.cu.a(integer9), 13, 0, 10, axz);
			this.a(ajs, alv.cu.a(integer9), 9, 0, 11, axz);
			this.a(ajs, alv.cu.a(integer9), 11, 0, 11, axz);
			this.a(ajs, alv.cu.a(integer9), 10, 0, 12, axz);
			this.a(ajs, alv.cu.a(integer9), 10, 0, 13, axz);
			this.a(ajs, alv.cu.a(integer10), 10, 0, 10, axz);

			for (int integer11 = 0; integer11 <= this.a - 1; integer11 += this.a - 1) {
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11, 2, 1, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 2, 2, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11, 2, 3, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11, 3, 1, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 3, 2, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11, 3, 3, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 4, 1, axz);
				this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), integer11, 4, 2, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 4, 3, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11, 5, 1, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 5, 2, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11, 5, 3, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 6, 1, axz);
				this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), integer11, 6, 2, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 6, 3, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 7, 1, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 7, 2, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 7, 3, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11, 8, 1, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11, 8, 2, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11, 8, 3, axz);
			}

			for (int integer11 = 2; integer11 <= this.a - 3; integer11 += this.a - 3 - 2) {
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11 - 1, 2, 0, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 2, 0, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11 + 1, 2, 0, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11 - 1, 3, 0, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 3, 0, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11 + 1, 3, 0, axz);
				this.a(ajs, alv.cu.a(integer9), integer11 - 1, 4, 0, axz);
				this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), integer11, 4, 0, axz);
				this.a(ajs, alv.cu.a(integer9), integer11 + 1, 4, 0, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11 - 1, 5, 0, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 5, 0, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11 + 1, 5, 0, axz);
				this.a(ajs, alv.cu.a(integer9), integer11 - 1, 6, 0, axz);
				this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), integer11, 6, 0, axz);
				this.a(ajs, alv.cu.a(integer9), integer11 + 1, 6, 0, axz);
				this.a(ajs, alv.cu.a(integer9), integer11 - 1, 7, 0, axz);
				this.a(ajs, alv.cu.a(integer9), integer11, 7, 0, axz);
				this.a(ajs, alv.cu.a(integer9), integer11 + 1, 7, 0, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11 - 1, 8, 0, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11, 8, 0, axz);
				this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), integer11 + 1, 8, 0, axz);
			}

			this.a(ajs, axz, 8, 4, 0, 12, 6, 0, alv.A.a(aqk.a.SMOOTH.a()), alv.A.a(aqk.a.SMOOTH.a()), false);
			this.a(ajs, alv.a.t(), 8, 6, 0, axz);
			this.a(ajs, alv.a.t(), 12, 6, 0, axz);
			this.a(ajs, alv.cu.a(integer9), 9, 5, 0, axz);
			this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), 10, 5, 0, axz);
			this.a(ajs, alv.cu.a(integer9), 11, 5, 0, axz);
			this.a(ajs, axz, 8, -14, 8, 12, -11, 12, alv.A.a(aqk.a.SMOOTH.a()), alv.A.a(aqk.a.SMOOTH.a()), false);
			this.a(ajs, axz, 8, -10, 8, 12, -10, 12, alv.A.a(aqk.a.CHISELED.a()), alv.A.a(aqk.a.CHISELED.a()), false);
			this.a(ajs, axz, 8, -9, 8, 12, -9, 12, alv.A.a(aqk.a.SMOOTH.a()), alv.A.a(aqk.a.SMOOTH.a()), false);
			this.a(ajs, axz, 8, -8, 8, 12, -1, 12, alv.A.t(), alv.A.t(), false);
			this.a(ajs, axz, 9, -11, 9, 11, -1, 11, alv.a.t(), alv.a.t(), false);
			this.a(ajs, alv.az.t(), 10, -11, 10, axz);
			this.a(ajs, axz, 9, -13, 9, 11, -13, 11, alv.W.t(), alv.a.t(), false);
			this.a(ajs, alv.a.t(), 8, -11, 10, axz);
			this.a(ajs, alv.a.t(), 8, -10, 10, axz);
			this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), 7, -10, 10, axz);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 7, -11, 10, axz);
			this.a(ajs, alv.a.t(), 12, -11, 10, axz);
			this.a(ajs, alv.a.t(), 12, -10, 10, axz);
			this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), 13, -10, 10, axz);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 13, -11, 10, axz);
			this.a(ajs, alv.a.t(), 10, -11, 8, axz);
			this.a(ajs, alv.a.t(), 10, -10, 8, axz);
			this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), 10, -10, 7, axz);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 10, -11, 7, axz);
			this.a(ajs, alv.a.t(), 10, -11, 12, axz);
			this.a(ajs, alv.a.t(), 10, -10, 12, axz);
			this.a(ajs, alv.A.a(aqk.a.CHISELED.a()), 10, -10, 13, axz);
			this.a(ajs, alv.A.a(aqk.a.SMOOTH.a()), 10, -11, 13, axz);

			for (cv cv12 : cv.c.HORIZONTAL) {
				if (!this.e[cv12.b()]) {
					int integer13 = cv12.g() * 2;
					int integer14 = cv12.i() * 2;
					this.e[cv12.b()] = this.a(ajs, axz, random, 10 + integer13, -11, 10 + integer14, bcf.k);
				}
			}

			return true;
		}
	}

	public static class b extends ayk.d {
		private static final kq e = new kq("igloo/igloo_top");
		private static final kq f = new kq("igloo/igloo_middle");
		private static final kq g = new kq("igloo/igloo_bottom");

		public b() {
		}

		public b(Random random, int integer2, int integer3) {
			super(random, integer2, 64, integer3, 7, 5, 8);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (!this.a(ajs, axz, -1)) {
				return false;
			} else {
				axz axz5 = this.d();
				co co6 = new co(axz5.a, axz5.b, axz5.c);
				aqi[] arr7 = aqi.values();
				MinecraftServer minecraftServer8 = ajs.u();
				ayz ayz9 = ajs.S().h();
				aza aza10 = new aza().a(arr7[random.nextInt(arr7.length)]).a(alv.dj).a(axz5);
				azc azc11 = ayz9.a(minecraftServer8, e);
				azc11.a(ajs, co6, aza10);
				if (random.nextDouble() < 0.5) {
					azc azc12 = ayz9.a(minecraftServer8, f);
					azc azc13 = ayz9.a(minecraftServer8, g);
					int integer14 = random.nextInt(8) + 4;

					for (int integer15 = 0; integer15 < integer14; integer15++) {
						co co16 = azc11.a(aza10, new co(3, -1 - integer15 * 3, 5), aza10, new co(1, 2, 1));
						azc12.a(ajs, co6.a(co16), aza10);
					}

					co co15 = co6.a(azc11.a(aza10, new co(3, -1 - integer14 * 3, 5), aza10, new co(3, 5, 7)));
					azc13.a(ajs, co15, aza10);
					Map<co, String> map16 = azc13.a(co15, aza10);

					for (Entry<co, String> entry18 : map16.entrySet()) {
						if ("chest".equals(entry18.getValue())) {
							co co19 = (co)entry18.getKey();
							ajs.a(co19, alv.a.t(), 3);
							asc asc20 = ajs.r(co19.b());
							if (asc20 instanceof ase) {
								((ase)asc20).a(bcf.n, random.nextLong());
							}
						}
					}
				} else {
					co co12 = azc.a(aza10, new co(3, 0, 5));
					ajs.a(co6.a(co12), alv.aJ.t(), 3);
				}

				return true;
			}
		}
	}

	public static class c extends ayk.d {
		private boolean e;
		private boolean f;
		private boolean g;
		private boolean h;
		private static final ayk.c.a i = new ayk.c.a();

		public c() {
		}

		public c(Random random, int integer2, int integer3) {
			super(random, integer2, 64, integer3, 12, 10, 15);
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("placedMainChest", this.e);
			du.a("placedHiddenChest", this.f);
			du.a("placedTrap1", this.g);
			du.a("placedTrap2", this.h);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.e = du.p("placedMainChest");
			this.f = du.p("placedHiddenChest");
			this.g = du.p("placedTrap1");
			this.h = du.p("placedTrap2");
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (!this.a(ajs, axz, 0)) {
				return false;
			} else {
				this.a(ajs, axz, 0, -4, 0, this.a - 1, 0, this.c - 1, false, random, i);
				this.a(ajs, axz, 2, 1, 2, 9, 2, 2, false, random, i);
				this.a(ajs, axz, 2, 1, 12, 9, 2, 12, false, random, i);
				this.a(ajs, axz, 2, 1, 3, 2, 2, 11, false, random, i);
				this.a(ajs, axz, 9, 1, 3, 9, 2, 11, false, random, i);
				this.a(ajs, axz, 1, 3, 1, 10, 6, 1, false, random, i);
				this.a(ajs, axz, 1, 3, 13, 10, 6, 13, false, random, i);
				this.a(ajs, axz, 1, 3, 2, 1, 6, 12, false, random, i);
				this.a(ajs, axz, 10, 3, 2, 10, 6, 12, false, random, i);
				this.a(ajs, axz, 2, 3, 2, 9, 3, 12, false, random, i);
				this.a(ajs, axz, 2, 6, 2, 9, 6, 12, false, random, i);
				this.a(ajs, axz, 3, 7, 3, 8, 7, 11, false, random, i);
				this.a(ajs, axz, 4, 8, 4, 7, 8, 10, false, random, i);
				this.a(ajs, axz, 3, 1, 3, 8, 2, 11);
				this.a(ajs, axz, 4, 3, 6, 7, 3, 9);
				this.a(ajs, axz, 2, 4, 2, 9, 5, 12);
				this.a(ajs, axz, 4, 6, 5, 7, 6, 9);
				this.a(ajs, axz, 5, 7, 6, 6, 7, 8);
				this.a(ajs, axz, 5, 1, 2, 6, 2, 2);
				this.a(ajs, axz, 5, 2, 12, 6, 2, 12);
				this.a(ajs, axz, 5, 5, 1, 6, 5, 1);
				this.a(ajs, axz, 5, 5, 13, 6, 5, 13);
				this.a(ajs, alv.a.t(), 1, 5, 5, axz);
				this.a(ajs, alv.a.t(), 10, 5, 5, axz);
				this.a(ajs, alv.a.t(), 1, 5, 9, axz);
				this.a(ajs, alv.a.t(), 10, 5, 9, axz);

				for (int integer5 = 0; integer5 <= 14; integer5 += 14) {
					this.a(ajs, axz, 2, 4, integer5, 2, 5, integer5, false, random, i);
					this.a(ajs, axz, 4, 4, integer5, 4, 5, integer5, false, random, i);
					this.a(ajs, axz, 7, 4, integer5, 7, 5, integer5, false, random, i);
					this.a(ajs, axz, 9, 4, integer5, 9, 5, integer5, false, random, i);
				}

				this.a(ajs, axz, 5, 6, 0, 6, 6, 0, false, random, i);

				for (int integer5 = 0; integer5 <= 11; integer5 += 11) {
					for (int integer6 = 2; integer6 <= 12; integer6 += 2) {
						this.a(ajs, axz, integer5, 4, integer6, integer5, 5, integer6, false, random, i);
					}

					this.a(ajs, axz, integer5, 6, 5, integer5, 6, 5, false, random, i);
					this.a(ajs, axz, integer5, 6, 9, integer5, 6, 9, false, random, i);
				}

				this.a(ajs, axz, 2, 7, 2, 2, 9, 2, false, random, i);
				this.a(ajs, axz, 9, 7, 2, 9, 9, 2, false, random, i);
				this.a(ajs, axz, 2, 7, 12, 2, 9, 12, false, random, i);
				this.a(ajs, axz, 9, 7, 12, 9, 9, 12, false, random, i);
				this.a(ajs, axz, 4, 9, 4, 4, 9, 4, false, random, i);
				this.a(ajs, axz, 7, 9, 4, 7, 9, 4, false, random, i);
				this.a(ajs, axz, 4, 9, 10, 4, 9, 10, false, random, i);
				this.a(ajs, axz, 7, 9, 10, 7, 9, 10, false, random, i);
				this.a(ajs, axz, 5, 9, 7, 6, 9, 7, false, random, i);
				atl atl5 = alv.aw.t().a(aqy.a, cv.EAST);
				atl atl6 = alv.aw.t().a(aqy.a, cv.WEST);
				atl atl7 = alv.aw.t().a(aqy.a, cv.SOUTH);
				atl atl8 = alv.aw.t().a(aqy.a, cv.NORTH);
				this.a(ajs, atl8, 5, 9, 6, axz);
				this.a(ajs, atl8, 6, 9, 6, axz);
				this.a(ajs, atl7, 5, 9, 8, axz);
				this.a(ajs, atl7, 6, 9, 8, axz);
				this.a(ajs, atl8, 4, 0, 0, axz);
				this.a(ajs, atl8, 5, 0, 0, axz);
				this.a(ajs, atl8, 6, 0, 0, axz);
				this.a(ajs, atl8, 7, 0, 0, axz);
				this.a(ajs, atl8, 4, 1, 8, axz);
				this.a(ajs, atl8, 4, 2, 9, axz);
				this.a(ajs, atl8, 4, 3, 10, axz);
				this.a(ajs, atl8, 7, 1, 8, axz);
				this.a(ajs, atl8, 7, 2, 9, axz);
				this.a(ajs, atl8, 7, 3, 10, axz);
				this.a(ajs, axz, 4, 1, 9, 4, 1, 9, false, random, i);
				this.a(ajs, axz, 7, 1, 9, 7, 1, 9, false, random, i);
				this.a(ajs, axz, 4, 1, 10, 7, 2, 10, false, random, i);
				this.a(ajs, axz, 5, 4, 5, 6, 4, 5, false, random, i);
				this.a(ajs, atl5, 4, 4, 5, axz);
				this.a(ajs, atl6, 7, 4, 5, axz);

				for (int integer9 = 0; integer9 < 4; integer9++) {
					this.a(ajs, atl7, 5, 0 - integer9, 6 + integer9, axz);
					this.a(ajs, atl7, 6, 0 - integer9, 6 + integer9, axz);
					this.a(ajs, axz, 5, 0 - integer9, 7 + integer9, 6, 0 - integer9, 9 + integer9);
				}

				this.a(ajs, axz, 1, -3, 12, 10, -1, 13);
				this.a(ajs, axz, 1, -3, 1, 3, -1, 13);
				this.a(ajs, axz, 1, -3, 1, 9, -1, 5);

				for (int integer9 = 1; integer9 <= 13; integer9 += 2) {
					this.a(ajs, axz, 1, -3, integer9, 1, -2, integer9, false, random, i);
				}

				for (int integer9 = 2; integer9 <= 12; integer9 += 2) {
					this.a(ajs, axz, 1, -1, integer9, 3, -1, integer9, false, random, i);
				}

				this.a(ajs, axz, 2, -2, 1, 5, -2, 1, false, random, i);
				this.a(ajs, axz, 7, -2, 1, 9, -2, 1, false, random, i);
				this.a(ajs, axz, 6, -3, 1, 6, -3, 1, false, random, i);
				this.a(ajs, axz, 6, -1, 1, 6, -1, 1, false, random, i);
				this.a(ajs, alv.bR.t().a(aro.a, cv.EAST).a(aro.c, true), 1, -3, 8, axz);
				this.a(ajs, alv.bR.t().a(aro.a, cv.WEST).a(aro.c, true), 4, -3, 8, axz);
				this.a(ajs, alv.bS.t().a(arn.b, true), 2, -3, 8, axz);
				this.a(ajs, alv.bS.t().a(arn.b, true), 3, -3, 8, axz);
				this.a(ajs, alv.af.t(), 5, -3, 7, axz);
				this.a(ajs, alv.af.t(), 5, -3, 6, axz);
				this.a(ajs, alv.af.t(), 5, -3, 5, axz);
				this.a(ajs, alv.af.t(), 5, -3, 4, axz);
				this.a(ajs, alv.af.t(), 5, -3, 3, axz);
				this.a(ajs, alv.af.t(), 5, -3, 2, axz);
				this.a(ajs, alv.af.t(), 5, -3, 1, axz);
				this.a(ajs, alv.af.t(), 4, -3, 1, axz);
				this.a(ajs, alv.Y.t(), 3, -3, 1, axz);
				if (!this.g) {
					this.g = this.a(ajs, axz, random, 3, -2, 1, cv.NORTH, bcf.m);
				}

				this.a(ajs, alv.bn.t().a(arp.d, true), 3, -2, 2, axz);
				this.a(ajs, alv.bR.t().a(aro.a, cv.NORTH).a(aro.c, true), 7, -3, 1, axz);
				this.a(ajs, alv.bR.t().a(aro.a, cv.SOUTH).a(aro.c, true), 7, -3, 5, axz);
				this.a(ajs, alv.bS.t().a(arn.b, true), 7, -3, 2, axz);
				this.a(ajs, alv.bS.t().a(arn.b, true), 7, -3, 3, axz);
				this.a(ajs, alv.bS.t().a(arn.b, true), 7, -3, 4, axz);
				this.a(ajs, alv.af.t(), 8, -3, 6, axz);
				this.a(ajs, alv.af.t(), 9, -3, 6, axz);
				this.a(ajs, alv.af.t(), 9, -3, 5, axz);
				this.a(ajs, alv.Y.t(), 9, -3, 4, axz);
				this.a(ajs, alv.af.t(), 9, -2, 4, axz);
				if (!this.h) {
					this.h = this.a(ajs, axz, random, 9, -2, 3, cv.WEST, bcf.m);
				}

				this.a(ajs, alv.bn.t().a(arp.c, true), 8, -1, 3, axz);
				this.a(ajs, alv.bn.t().a(arp.c, true), 8, -2, 3, axz);
				if (!this.e) {
					this.e = this.a(ajs, axz, random, 8, -3, 3, bcf.l);
				}

				this.a(ajs, alv.Y.t(), 9, -3, 2, axz);
				this.a(ajs, alv.Y.t(), 8, -3, 1, axz);
				this.a(ajs, alv.Y.t(), 4, -3, 5, axz);
				this.a(ajs, alv.Y.t(), 5, -2, 5, axz);
				this.a(ajs, alv.Y.t(), 5, -1, 5, axz);
				this.a(ajs, alv.Y.t(), 6, -3, 5, axz);
				this.a(ajs, alv.Y.t(), 7, -2, 5, axz);
				this.a(ajs, alv.Y.t(), 7, -1, 5, axz);
				this.a(ajs, alv.Y.t(), 8, -3, 5, axz);
				this.a(ajs, axz, 9, -1, 1, 9, -1, 5, false, random, i);
				this.a(ajs, axz, 8, -3, 8, 10, -1, 10);
				this.a(ajs, alv.bf.a(ard.e), 8, -2, 11, axz);
				this.a(ajs, alv.bf.a(ard.e), 9, -2, 11, axz);
				this.a(ajs, alv.bf.a(ard.e), 10, -2, 11, axz);
				atl atl9 = alv.ay.t().a(aop.a, aop.a.NORTH);
				this.a(ajs, atl9, 8, -2, 12, axz);
				this.a(ajs, atl9, 9, -2, 12, axz);
				this.a(ajs, atl9, 10, -2, 12, axz);
				this.a(ajs, axz, 8, -3, 8, 8, -3, 10, false, random, i);
				this.a(ajs, axz, 10, -3, 8, 10, -3, 10, false, random, i);
				this.a(ajs, alv.Y.t(), 10, -2, 9, axz);
				this.a(ajs, alv.af.t(), 8, -2, 9, axz);
				this.a(ajs, alv.af.t(), 8, -2, 10, axz);
				this.a(ajs, alv.af.t(), 10, -1, 9, axz);
				this.a(ajs, alv.F.t().a(atc.H, cv.UP), 9, -2, 8, axz);
				this.a(ajs, alv.F.t().a(atc.H, cv.WEST), 10, -2, 8, axz);
				this.a(ajs, alv.F.t().a(atc.H, cv.WEST), 10, -1, 8, axz);
				this.a(ajs, alv.bb.t().a(aqg.D, cv.NORTH), 10, -2, 10, axz);
				if (!this.f) {
					this.f = this.a(ajs, axz, random, 9, -3, 10, bcf.l);
				}

				return true;
			}
		}

		static class a extends ayq.a {
			private a() {
			}

			@Override
			public void a(Random random, int integer2, int integer3, int integer4, boolean boolean5) {
				if (random.nextFloat() < 0.4F) {
					this.a = alv.e.t();
				} else {
					this.a = alv.Y.t();
				}
			}
		}
	}

	abstract static class d extends ayq {
		protected int a;
		protected int b;
		protected int c;
		protected int d = -1;

		public d() {
		}

		protected d(Random random, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7) {
			super(0);
			this.a = integer5;
			this.b = integer6;
			this.c = integer7;
			this.a(cv.c.HORIZONTAL.a(random));
			if (this.f().k() == cv.a.Z) {
				this.l = new axz(integer2, integer3, integer4, integer2 + integer5 - 1, integer3 + integer6 - 1, integer4 + integer7 - 1);
			} else {
				this.l = new axz(integer2, integer3, integer4, integer2 + integer7 - 1, integer3 + integer6 - 1, integer4 + integer5 - 1);
			}
		}

		@Override
		protected void a(du du) {
			du.a("Width", this.a);
			du.a("Height", this.b);
			du.a("Depth", this.c);
			du.a("HPos", this.d);
		}

		@Override
		protected void a(du du, ayz ayz) {
			this.a = du.h("Width");
			this.b = du.h("Height");
			this.c = du.h("Depth");
			this.d = du.h("HPos");
		}

		protected boolean a(ajs ajs, axz axz, int integer) {
			if (this.d >= 0) {
				return true;
			} else {
				int integer5 = 0;
				int integer6 = 0;
				co.a a7 = new co.a();

				for (int integer8 = this.l.c; integer8 <= this.l.f; integer8++) {
					for (int integer9 = this.l.a; integer9 <= this.l.d; integer9++) {
						a7.c(integer9, 64, integer8);
						if (axz.b(a7)) {
							integer5 += Math.max(ajs.q(a7).q(), ajs.s.i());
							integer6++;
						}
					}
				}

				if (integer6 == 0) {
					return false;
				} else {
					this.d = integer5 / integer6;
					this.l.a(0, this.d - this.l.b + integer, 0);
					return true;
				}
			}
		}
	}

	public static class e extends ayk.d {
		private boolean e;

		public e() {
		}

		public e(Random random, int integer2, int integer3) {
			super(random, integer2, 64, integer3, 7, 7, 9);
		}

		@Override
		protected void a(du du) {
			super.a(du);
			du.a("Witch", this.e);
		}

		@Override
		protected void a(du du, ayz ayz) {
			super.a(du, ayz);
			this.e = du.p("Witch");
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (!this.a(ajs, axz, 0)) {
				return false;
			} else {
				this.a(ajs, axz, 1, 1, 1, 5, 1, 7, alv.f.a(apn.a.SPRUCE.a()), alv.f.a(apn.a.SPRUCE.a()), false);
				this.a(ajs, axz, 1, 4, 2, 5, 4, 7, alv.f.a(apn.a.SPRUCE.a()), alv.f.a(apn.a.SPRUCE.a()), false);
				this.a(ajs, axz, 2, 1, 0, 4, 1, 0, alv.f.a(apn.a.SPRUCE.a()), alv.f.a(apn.a.SPRUCE.a()), false);
				this.a(ajs, axz, 2, 2, 2, 3, 3, 2, alv.f.a(apn.a.SPRUCE.a()), alv.f.a(apn.a.SPRUCE.a()), false);
				this.a(ajs, axz, 1, 2, 3, 1, 3, 6, alv.f.a(apn.a.SPRUCE.a()), alv.f.a(apn.a.SPRUCE.a()), false);
				this.a(ajs, axz, 5, 2, 3, 5, 3, 6, alv.f.a(apn.a.SPRUCE.a()), alv.f.a(apn.a.SPRUCE.a()), false);
				this.a(ajs, axz, 2, 2, 7, 4, 3, 7, alv.f.a(apn.a.SPRUCE.a()), alv.f.a(apn.a.SPRUCE.a()), false);
				this.a(ajs, axz, 1, 0, 2, 1, 3, 2, alv.r.t(), alv.r.t(), false);
				this.a(ajs, axz, 5, 0, 2, 5, 3, 2, alv.r.t(), alv.r.t(), false);
				this.a(ajs, axz, 1, 0, 7, 1, 3, 7, alv.r.t(), alv.r.t(), false);
				this.a(ajs, axz, 5, 0, 7, 5, 3, 7, alv.r.t(), alv.r.t(), false);
				this.a(ajs, alv.aO.t(), 2, 3, 2, axz);
				this.a(ajs, alv.aO.t(), 3, 3, 7, axz);
				this.a(ajs, alv.a.t(), 1, 3, 4, axz);
				this.a(ajs, alv.a.t(), 5, 3, 4, axz);
				this.a(ajs, alv.a.t(), 5, 3, 5, axz);
				this.a(ajs, alv.ca.t().a(anp.b, anp.a.MUSHROOM_RED), 1, 3, 5, axz);
				this.a(ajs, alv.ai.t(), 3, 2, 6, axz);
				this.a(ajs, alv.bE.t(), 4, 2, 6, axz);
				this.a(ajs, alv.aO.t(), 1, 2, 1, axz);
				this.a(ajs, alv.aO.t(), 5, 2, 1, axz);
				atl atl5 = alv.bU.t().a(aqy.a, cv.NORTH);
				atl atl6 = alv.bU.t().a(aqy.a, cv.EAST);
				atl atl7 = alv.bU.t().a(aqy.a, cv.WEST);
				atl atl8 = alv.bU.t().a(aqy.a, cv.SOUTH);
				this.a(ajs, axz, 0, 4, 1, 6, 4, 1, atl5, atl5, false);
				this.a(ajs, axz, 0, 4, 2, 0, 4, 7, atl6, atl6, false);
				this.a(ajs, axz, 6, 4, 2, 6, 4, 7, atl7, atl7, false);
				this.a(ajs, axz, 0, 4, 8, 6, 4, 8, atl8, atl8, false);

				for (int integer9 = 2; integer9 <= 7; integer9 += 5) {
					for (int integer10 = 1; integer10 <= 5; integer10 += 4) {
						this.b(ajs, alv.r.t(), integer10, -1, integer9, axz);
					}
				}

				if (!this.e) {
					int integer9 = this.a(2, 5);
					int integer10 = this.d(2);
					int integer11 = this.b(2, 5);
					if (axz.b(new co(integer9, integer10, integer11))) {
						this.e = true;
						aam aam12 = new aam(ajs);
						aam12.cS();
						aam12.b((double)integer9 + 0.5, (double)integer10, (double)integer11 + 0.5, 0.0F, 0.0F);
						aam12.a(ajs.D(new co(integer9, integer10, integer11)), null);
						ajs.a(aam12);
					}
				}

				return true;
			}
		}
	}
}

public class ava {
	public static ava.a a(du du) {
		int integer2 = du.h("xPos");
		int integer3 = du.h("zPos");
		ava.a a4 = new ava.a(integer2, integer3);
		a4.g = du.m("Blocks");
		a4.f = new aur(du.m("Data"), 7);
		a4.e = new aur(du.m("SkyLight"), 7);
		a4.d = new aur(du.m("BlockLight"), 7);
		a4.c = du.m("HeightMap");
		a4.b = du.p("TerrainPopulated");
		a4.h = du.c("Entities", 10);
		a4.i = du.c("TileEntities", 10);
		a4.j = du.c("TileTicks", 10);

		try {
			a4.a = du.i("LastUpdate");
		} catch (ClassCastException var5) {
			a4.a = (long)du.h("LastUpdate");
		}

		return a4;
	}

	public static void a(ava.a a, du du, akj akj) {
		du.a("xPos", a.k);
		du.a("zPos", a.l);
		du.a("LastUpdate", a.a);
		int[] arr4 = new int[a.c.length];

		for (int integer5 = 0; integer5 < a.c.length; integer5++) {
			arr4[integer5] = a.c[integer5];
		}

		du.a("HeightMap", arr4);
		du.a("TerrainPopulated", a.b);
		ea ea5 = new ea();

		for (int integer6 = 0; integer6 < 8; integer6++) {
			boolean boolean7 = true;

			for (int integer8 = 0; integer8 < 16 && boolean7; integer8++) {
				for (int integer9 = 0; integer9 < 16 && boolean7; integer9++) {
					for (int integer10 = 0; integer10 < 16; integer10++) {
						int integer11 = integer8 << 11 | integer10 << 7 | integer9 + (integer6 << 4);
						int integer12 = a.g[integer11];
						if (integer12 != 0) {
							boolean7 = false;
							break;
						}
					}
				}
			}

			if (!boolean7) {
				byte[] arr8 = new byte[4096];
				auk auk9 = new auk();
				auk auk10 = new auk();
				auk auk11 = new auk();

				for (int integer12 = 0; integer12 < 16; integer12++) {
					for (int integer13 = 0; integer13 < 16; integer13++) {
						for (int integer14 = 0; integer14 < 16; integer14++) {
							int integer15 = integer12 << 11 | integer14 << 7 | integer13 + (integer6 << 4);
							int integer16 = a.g[integer15];
							arr8[integer13 << 8 | integer14 << 4 | integer12] = (byte)(integer16 & 0xFF);
							auk9.a(integer12, integer13, integer14, a.f.a(integer12, integer13 + (integer6 << 4), integer14));
							auk10.a(integer12, integer13, integer14, a.e.a(integer12, integer13 + (integer6 << 4), integer14));
							auk11.a(integer12, integer13, integer14, a.d.a(integer12, integer13 + (integer6 << 4), integer14));
						}
					}
				}

				du du12 = new du();
				du12.a("Y", (byte)(integer6 & 0xFF));
				du12.a("Blocks", arr8);
				du12.a("Data", auk9.a());
				du12.a("SkyLight", auk10.a());
				du12.a("BlockLight", auk11.a());
				ea5.a(du12);
			}
		}

		du.a("Sections", ea5);
		byte[] arr6 = new byte[256];
		co.a a7 = new co.a();

		for (int integer8 = 0; integer8 < 16; integer8++) {
			for (int integer9 = 0; integer9 < 16; integer9++) {
				a7.c(a.k << 4 | integer8, 0, a.l << 4 | integer9);
				arr6[integer9 << 4 | integer8] = (byte)(akf.a(akj.a(a7, akk.b)) & 0xFF);
			}
		}

		du.a("Biomes", arr6);
		du.a("Entities", a.h);
		du.a("TileEntities", a.i);
		if (a.j != null) {
			du.a("TileTicks", a.j);
		}
	}

	public static class a {
		public long a;
		public boolean b;
		public byte[] c;
		public aur d;
		public aur e;
		public aur f;
		public byte[] g;
		public ea h;
		public ea i;
		public ea j;
		public final int k;
		public final int l;

		public a(int integer1, int integer2) {
			this.k = integer1;
			this.l = integer2;
		}
	}
}

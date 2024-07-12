import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class avd implements auw, bdq {
	private static final Logger a = LogManager.getLogger();
	private final Map<ajl, du> b = new ConcurrentHashMap();
	private final Set<ajl> c = Collections.newSetFromMap(new ConcurrentHashMap());
	private final File d;
	private final ph e;
	private boolean f;

	public avd(File file, ph ph) {
		this.d = file;
		this.e = ph;
	}

	@Nullable
	@Override
	public auo a(ajs ajs, int integer2, int integer3) throws IOException {
		ajl ajl5 = new ajl(integer2, integer3);
		du du6 = (du)this.b.get(ajl5);
		if (du6 == null) {
			DataInputStream dataInputStream7 = avc.d(this.d, integer2, integer3);
			if (dataInputStream7 == null) {
				return null;
			}

			du6 = this.e.a(pf.CHUNK, ed.a(dataInputStream7));
		}

		return this.a(ajs, integer2, integer3, du6);
	}

	@Override
	public boolean a(int integer1, int integer2) {
		ajl ajl4 = new ajl(integer1, integer2);
		du du5 = (du)this.b.get(ajl4);
		return du5 != null ? true : avc.f(this.d, integer1, integer2);
	}

	@Nullable
	protected auo a(ajs ajs, int integer2, int integer3, du du) {
		if (!du.b("Level", 10)) {
			a.error("Chunk file at {},{} is missing level data, skipping", new Object[]{integer2, integer3});
			return null;
		} else {
			du du6 = du.o("Level");
			if (!du6.b("Sections", 9)) {
				a.error("Chunk file at {},{} is missing block data, skipping", new Object[]{integer2, integer3});
				return null;
			} else {
				auo auo7 = this.a(ajs, du6);
				if (!auo7.a(integer2, integer3)) {
					a.error(
						"Chunk file at {},{} is in the wrong location; relocating. (Expected {}, {}, got {}, {})",
						new Object[]{integer2, integer3, integer2, integer3, auo7.b, auo7.c}
					);
					du6.a("xPos", integer2);
					du6.a("zPos", integer3);
					auo7 = this.a(ajs, du6);
				}

				return auo7;
			}
		}
	}

	@Override
	public void a(ajs ajs, auo auo) throws IOException, ajt {
		ajs.N();

		try {
			du du4 = new du();
			du du5 = new du();
			du4.a("Level", du5);
			du4.a("DataVersion", 922);
			this.a(auo, ajs, du5);
			this.a(auo.k(), du4);
		} catch (Exception var5) {
			a.error("Failed to save chunk", var5);
		}
	}

	protected void a(ajl ajl, du du) {
		if (!this.c.contains(ajl)) {
			this.b.put(ajl, du);
		}

		bdp.a().a(this);
	}

	@Override
	public boolean c() {
		if (this.b.isEmpty()) {
			if (this.f) {
				a.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", new Object[]{this.d.getName()});
			}

			return false;
		} else {
			ajl ajl2 = (ajl)this.b.keySet().iterator().next();

			boolean exception4;
			try {
				this.c.add(ajl2);
				du du3 = (du)this.b.remove(ajl2);
				if (du3 != null) {
					try {
						this.b(ajl2, du3);
					} catch (Exception var7) {
						a.error("Failed to save chunk", var7);
					}
				}

				exception4 = true;
			} finally {
				this.c.remove(ajl2);
			}

			return exception4;
		}
	}

	private void b(ajl ajl, du du) throws IOException {
		DataOutputStream dataOutputStream4 = avc.e(this.d, ajl.a, ajl.b);
		ed.a(du, dataOutputStream4);
		dataOutputStream4.close();
	}

	@Override
	public void b(ajs ajs, auo auo) throws IOException {
	}

	@Override
	public void a() {
	}

	@Override
	public void b() {
		try {
			this.f = true;

			while (this.c()) {
			}
		} finally {
			this.f = false;
		}
	}

	public static void a(ph ph) {
		ph.a(pf.CHUNK, new pj() {
			@Override
			public du a(pg pg, du du, int integer) {
				if (du.b("Level", 10)) {
					du du5 = du.o("Level");
					if (du5.b("Entities", 9)) {
						ea ea6 = du5.c("Entities", 10);

						for (int integer7 = 0; integer7 < ea6.c(); integer7++) {
							ea6.a(integer7, pg.a(pf.ENTITY, (du)ea6.h(integer7), integer));
						}
					}

					if (du5.b("TileEntities", 9)) {
						ea ea6 = du5.c("TileEntities", 10);

						for (int integer7 = 0; integer7 < ea6.c(); integer7++) {
							ea6.a(integer7, pg.a(pf.BLOCK_ENTITY, (du)ea6.h(integer7), integer));
						}
					}
				}

				return du;
			}
		});
	}

	private void a(auo auo, ajs ajs, du du) {
		du.a("xPos", auo.b);
		du.a("zPos", auo.c);
		du.a("LastUpdate", ajs.P());
		du.a("HeightMap", auo.r());
		du.a("TerrainPopulated", auo.u());
		du.a("LightPopulated", auo.v());
		du.a("InhabitedTime", auo.x());
		aup[] arr5 = auo.h();
		ea ea6 = new ea();
		boolean boolean7 = ajs.s.m();

		for (aup aup11 : arr5) {
			if (aup11 != auo.a) {
				du du12 = new du();
				du12.a("Y", (byte)(aup11.d() >> 4 & 0xFF));
				byte[] arr13 = new byte[4096];
				auk auk14 = new auk();
				auk auk15 = aup11.g().a(arr13, auk14);
				du12.a("Blocks", arr13);
				du12.a("Data", auk14.a());
				if (auk15 != null) {
					du12.a("Add", auk15.a());
				}

				du12.a("BlockLight", aup11.h().a());
				if (boolean7) {
					du12.a("SkyLight", aup11.i().a());
				} else {
					du12.a("SkyLight", new byte[aup11.h().a().length]);
				}

				ea6.a(du12);
			}
		}

		du.a("Sections", ea6);
		du.a("Biomes", auo.l());
		auo.g(false);
		ea ea8 = new ea();

		for (int integer9 = 0; integer9 < auo.t().length; integer9++) {
			for (sn sn11 : auo.t()[integer9]) {
				du du12x = new du();
				if (sn11.d(du12x)) {
					auo.g(true);
					ea8.a(du12x);
				}
			}
		}

		du.a("Entities", ea8);
		ea ea9 = new ea();

		for (asc asc11 : auo.s().values()) {
			du du12x = asc11.b(new du());
			ea9.a(du12x);
		}

		du.a("TileEntities", ea9);
		List<akd> list10 = ajs.a(auo, false);
		if (list10 != null) {
			long long11 = ajs.P();
			ea ea13 = new ea();

			for (akd akd15 : list10) {
				du du16 = new du();
				kq kq17 = alu.h.b(akd15.a());
				du16.a("i", kq17 == null ? "" : kq17.toString());
				du16.a("x", akd15.a.p());
				du16.a("y", akd15.a.q());
				du16.a("z", akd15.a.r());
				du16.a("t", (int)(akd15.b - long11));
				du16.a("p", akd15.c);
				ea13.a(du16);
			}

			du.a("TileTicks", ea13);
		}
	}

	private auo a(ajs ajs, du du) {
		int integer4 = du.h("xPos");
		int integer5 = du.h("zPos");
		auo auo6 = new auo(ajs, integer4, integer5);
		auo6.a(du.n("HeightMap"));
		auo6.d(du.p("TerrainPopulated"));
		auo6.e(du.p("LightPopulated"));
		auo6.c(du.i("InhabitedTime"));
		ea ea7 = du.c("Sections", 10);
		int integer8 = 16;
		aup[] arr9 = new aup[16];
		boolean boolean10 = ajs.s.m();

		for (int integer11 = 0; integer11 < ea7.c(); integer11++) {
			du du12 = ea7.b(integer11);
			int integer13 = du12.f("Y");
			aup aup14 = new aup(integer13 << 4, boolean10);
			byte[] arr15 = du12.m("Blocks");
			auk auk16 = new auk(du12.m("Data"));
			auk auk17 = du12.b("Add", 7) ? new auk(du12.m("Add")) : null;
			aup14.g().a(arr15, auk16, auk17);
			aup14.a(new auk(du12.m("BlockLight")));
			if (boolean10) {
				aup14.b(new auk(du12.m("SkyLight")));
			}

			aup14.e();
			arr9[integer13] = aup14;
		}

		auo6.a(arr9);
		if (du.b("Biomes", 7)) {
			auo6.a(du.m("Biomes"));
		}

		ea ea11 = du.c("Entities", 10);

		for (int integer12 = 0; integer12 < ea11.c(); integer12++) {
			du du13 = ea11.b(integer12);
			a(du13, ajs, auo6);
			auo6.g(true);
		}

		ea ea12 = du.c("TileEntities", 10);

		for (int integer13 = 0; integer13 < ea12.c(); integer13++) {
			du du14 = ea12.b(integer13);
			asc asc15 = asc.a(ajs, du14);
			if (asc15 != null) {
				auo6.a(asc15);
			}
		}

		if (du.b("TileTicks", 9)) {
			ea ea13 = du.c("TileTicks", 10);

			for (int integer14 = 0; integer14 < ea13.c(); integer14++) {
				du du15 = ea13.b(integer14);
				alu alu16;
				if (du15.b("i", 8)) {
					alu16 = alu.b(du15.l("i"));
				} else {
					alu16 = alu.b(du15.h("i"));
				}

				ajs.b(new co(du15.h("x"), du15.h("y"), du15.h("z")), alu16, du15.h("t"), du15.h("p"));
			}
		}

		return auo6;
	}

	@Nullable
	public static sn a(du du, ajs ajs, auo auo) {
		sn sn4 = a(du, ajs);
		if (sn4 == null) {
			return null;
		} else {
			auo.a(sn4);
			if (du.b("Passengers", 9)) {
				ea ea5 = du.c("Passengers", 10);

				for (int integer6 = 0; integer6 < ea5.c(); integer6++) {
					sn sn7 = a(ea5.b(integer6), ajs, auo);
					if (sn7 != null) {
						sn7.a(sn4, true);
					}
				}
			}

			return sn4;
		}
	}

	@Nullable
	public static sn a(du du, ajs ajs, double double3, double double4, double double5, boolean boolean6) {
		sn sn10 = a(du, ajs);
		if (sn10 == null) {
			return null;
		} else {
			sn10.b(double3, double4, double5, sn10.v, sn10.w);
			if (boolean6 && !ajs.a(sn10)) {
				return null;
			} else {
				if (du.b("Passengers", 9)) {
					ea ea11 = du.c("Passengers", 10);

					for (int integer12 = 0; integer12 < ea11.c(); integer12++) {
						sn sn13 = a(ea11.b(integer12), ajs, double3, double4, double5, boolean6);
						if (sn13 != null) {
							sn13.a(sn10, true);
						}
					}
				}

				return sn10;
			}
		}
	}

	@Nullable
	protected static sn a(du du, ajs ajs) {
		try {
			return sp.a(du, ajs);
		} catch (RuntimeException var3) {
			return null;
		}
	}

	public static void a(sn sn, ajs ajs) {
		if (ajs.a(sn) && sn.aL()) {
			for (sn sn4 : sn.bx()) {
				a(sn4, ajs);
			}
		}
	}

	@Nullable
	public static sn a(du du, ajs ajs, boolean boolean3) {
		sn sn4 = a(du, ajs);
		if (sn4 == null) {
			return null;
		} else if (boolean3 && !ajs.a(sn4)) {
			return null;
		} else {
			if (du.b("Passengers", 9)) {
				ea ea5 = du.c("Passengers", 10);

				for (int integer6 = 0; integer6 < ea5.c(); integer6++) {
					sn sn7 = a(ea5.b(integer6), ajs, boolean3);
					if (sn7 != null) {
						sn7.a(sn4, true);
					}
				}
			}

			return sn4;
		}
	}
}

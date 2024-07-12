import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bbv {
	private String b;
	private int c;
	private boolean d;
	public static final rg a = rg.NORMAL;
	private long e;
	private ajx f = ajx.b;
	private String g = "";
	private int h;
	private int i;
	private int j;
	private long k;
	private long l;
	private long m;
	private long n;
	private du o;
	private int p;
	private String q;
	private int r;
	private int s;
	private boolean t;
	private int u;
	private boolean v;
	private int w;
	private ajq x;
	private boolean y;
	private boolean z;
	private boolean A;
	private boolean B;
	private rg C;
	private boolean D;
	private double E;
	private double F;
	private double G = 6.0E7;
	private long H;
	private double I;
	private double J = 5.0;
	private double K = 0.2;
	private int L = 5;
	private int M = 15;
	private final Map<avg, du> N = Maps.newEnumMap(avg.class);
	private ajp O = new ajp();

	protected bbv() {
	}

	public static void a(ph ph) {
		ph.a(pf.LEVEL, new pj() {
			@Override
			public du a(pg pg, du du, int integer) {
				if (du.b("Player", 10)) {
					du.a("Player", pg.a(pf.PLAYER, du.o("Player"), integer));
				}

				return du;
			}
		});
	}

	public bbv(du du) {
		if (du.b("Version", 10)) {
			du du3 = du.o("Version");
			this.b = du3.l("Name");
			this.c = du3.h("Id");
			this.d = du3.p("Snapshot");
		}

		this.e = du.i("RandomSeed");
		if (du.b("generatorName", 8)) {
			String string3 = du.l("generatorName");
			this.f = ajx.a(string3);
			if (this.f == null) {
				this.f = ajx.b;
			} else if (this.f.f()) {
				int integer4 = 0;
				if (du.b("generatorVersion", 99)) {
					integer4 = du.h("generatorVersion");
				}

				this.f = this.f.a(integer4);
			}

			if (du.b("generatorOptions", 8)) {
				this.g = du.l("generatorOptions");
			}
		}

		this.x = ajq.a(du.h("GameType"));
		if (du.b("MapFeatures", 99)) {
			this.y = du.p("MapFeatures");
		} else {
			this.y = true;
		}

		this.h = du.h("SpawnX");
		this.i = du.h("SpawnY");
		this.j = du.h("SpawnZ");
		this.k = du.i("Time");
		if (du.b("DayTime", 99)) {
			this.l = du.i("DayTime");
		} else {
			this.l = this.k;
		}

		this.m = du.i("LastPlayed");
		this.n = du.i("SizeOnDisk");
		this.q = du.l("LevelName");
		this.r = du.h("version");
		this.s = du.h("clearWeatherTime");
		this.u = du.h("rainTime");
		this.t = du.p("raining");
		this.w = du.h("thunderTime");
		this.v = du.p("thundering");
		this.z = du.p("hardcore");
		if (du.b("initialized", 99)) {
			this.B = du.p("initialized");
		} else {
			this.B = true;
		}

		if (du.b("allowCommands", 99)) {
			this.A = du.p("allowCommands");
		} else {
			this.A = this.x == ajq.CREATIVE;
		}

		if (du.b("Player", 10)) {
			this.o = du.o("Player");
			this.p = this.o.h("Dimension");
		}

		if (du.b("GameRules", 10)) {
			this.O.a(du.o("GameRules"));
		}

		if (du.b("Difficulty", 99)) {
			this.C = rg.a(du.f("Difficulty"));
		}

		if (du.b("DifficultyLocked", 1)) {
			this.D = du.p("DifficultyLocked");
		}

		if (du.b("BorderCenterX", 99)) {
			this.E = du.k("BorderCenterX");
		}

		if (du.b("BorderCenterZ", 99)) {
			this.F = du.k("BorderCenterZ");
		}

		if (du.b("BorderSize", 99)) {
			this.G = du.k("BorderSize");
		}

		if (du.b("BorderSizeLerpTime", 99)) {
			this.H = du.i("BorderSizeLerpTime");
		}

		if (du.b("BorderSizeLerpTarget", 99)) {
			this.I = du.k("BorderSizeLerpTarget");
		}

		if (du.b("BorderSafeZone", 99)) {
			this.J = du.k("BorderSafeZone");
		}

		if (du.b("BorderDamagePerBlock", 99)) {
			this.K = du.k("BorderDamagePerBlock");
		}

		if (du.b("BorderWarningBlocks", 99)) {
			this.L = du.h("BorderWarningBlocks");
		}

		if (du.b("BorderWarningTime", 99)) {
			this.M = du.h("BorderWarningTime");
		}

		if (du.b("DimensionData", 10)) {
			du du3 = du.o("DimensionData");

			for (String string5 : du3.c()) {
				this.N.put(avg.a(Integer.parseInt(string5)), du3.o(string5));
			}
		}
	}

	public bbv(ajv ajv, String string) {
		this.a(ajv);
		this.q = string;
		this.C = a;
		this.B = false;
	}

	public void a(ajv ajv) {
		this.e = ajv.d();
		this.x = ajv.e();
		this.y = ajv.g();
		this.z = ajv.f();
		this.f = ajv.h();
		this.g = ajv.j();
		this.A = ajv.i();
	}

	public bbv(bbv bbv) {
		this.e = bbv.e;
		this.f = bbv.f;
		this.g = bbv.g;
		this.x = bbv.x;
		this.y = bbv.y;
		this.h = bbv.h;
		this.i = bbv.i;
		this.j = bbv.j;
		this.k = bbv.k;
		this.l = bbv.l;
		this.m = bbv.m;
		this.n = bbv.n;
		this.o = bbv.o;
		this.p = bbv.p;
		this.q = bbv.q;
		this.r = bbv.r;
		this.u = bbv.u;
		this.t = bbv.t;
		this.w = bbv.w;
		this.v = bbv.v;
		this.z = bbv.z;
		this.A = bbv.A;
		this.B = bbv.B;
		this.O = bbv.O;
		this.C = bbv.C;
		this.D = bbv.D;
		this.E = bbv.E;
		this.F = bbv.F;
		this.G = bbv.G;
		this.H = bbv.H;
		this.I = bbv.I;
		this.J = bbv.J;
		this.K = bbv.K;
		this.M = bbv.M;
		this.L = bbv.L;
	}

	public du a(@Nullable du du) {
		if (du == null) {
			du = this.o;
		}

		du du3 = new du();
		this.a(du3, du);
		return du3;
	}

	private void a(du du1, du du2) {
		du du4 = new du();
		du4.a("Name", "1.11.2");
		du4.a("Id", 922);
		du4.a("Snapshot", false);
		du1.a("Version", du4);
		du1.a("DataVersion", 922);
		du1.a("RandomSeed", this.e);
		du1.a("generatorName", this.f.a());
		du1.a("generatorVersion", this.f.d());
		du1.a("generatorOptions", this.g);
		du1.a("GameType", this.x.a());
		du1.a("MapFeatures", this.y);
		du1.a("SpawnX", this.h);
		du1.a("SpawnY", this.i);
		du1.a("SpawnZ", this.j);
		du1.a("Time", this.k);
		du1.a("DayTime", this.l);
		du1.a("SizeOnDisk", this.n);
		du1.a("LastPlayed", MinecraftServer.aw());
		du1.a("LevelName", this.q);
		du1.a("version", this.r);
		du1.a("clearWeatherTime", this.s);
		du1.a("rainTime", this.u);
		du1.a("raining", this.t);
		du1.a("thunderTime", this.w);
		du1.a("thundering", this.v);
		du1.a("hardcore", this.z);
		du1.a("allowCommands", this.A);
		du1.a("initialized", this.B);
		du1.a("BorderCenterX", this.E);
		du1.a("BorderCenterZ", this.F);
		du1.a("BorderSize", this.G);
		du1.a("BorderSizeLerpTime", this.H);
		du1.a("BorderSafeZone", this.J);
		du1.a("BorderDamagePerBlock", this.K);
		du1.a("BorderSizeLerpTarget", this.I);
		du1.a("BorderWarningBlocks", (double)this.L);
		du1.a("BorderWarningTime", (double)this.M);
		if (this.C != null) {
			du1.a("Difficulty", (byte)this.C.a());
		}

		du1.a("DifficultyLocked", this.D);
		du1.a("GameRules", this.O.a());
		du du5 = new du();

		for (Entry<avg, du> entry7 : this.N.entrySet()) {
			du5.a(String.valueOf(((avg)entry7.getKey()).a()), (ei)entry7.getValue());
		}

		du1.a("DimensionData", du5);
		if (du2 != null) {
			du1.a("Player", du2);
		}
	}

	public long a() {
		return this.e;
	}

	public int b() {
		return this.h;
	}

	public int c() {
		return this.i;
	}

	public int d() {
		return this.j;
	}

	public long e() {
		return this.k;
	}

	public long f() {
		return this.l;
	}

	public long g() {
		return this.n;
	}

	public du h() {
		return this.o;
	}

	public void a(int integer) {
		this.h = integer;
	}

	public void b(int integer) {
		this.i = integer;
	}

	public void c(int integer) {
		this.j = integer;
	}

	public void b(long long1) {
		this.k = long1;
	}

	public void c(long long1) {
		this.l = long1;
	}

	public void a(co co) {
		this.h = co.p();
		this.i = co.q();
		this.j = co.r();
	}

	public String j() {
		return this.q;
	}

	public void a(String string) {
		this.q = string;
	}

	public int k() {
		return this.r;
	}

	public void e(int integer) {
		this.r = integer;
	}

	public long l() {
		return this.m;
	}

	public int z() {
		return this.s;
	}

	public void i(int integer) {
		this.s = integer;
	}

	public boolean m() {
		return this.v;
	}

	public void a(boolean boolean1) {
		this.v = boolean1;
	}

	public int n() {
		return this.w;
	}

	public void f(int integer) {
		this.w = integer;
	}

	public boolean o() {
		return this.t;
	}

	public void b(boolean boolean1) {
		this.t = boolean1;
	}

	public int p() {
		return this.u;
	}

	public void g(int integer) {
		this.u = integer;
	}

	public ajq q() {
		return this.x;
	}

	public boolean r() {
		return this.y;
	}

	public void f(boolean boolean1) {
		this.y = boolean1;
	}

	public void a(ajq ajq) {
		this.x = ajq;
	}

	public boolean s() {
		return this.z;
	}

	public void g(boolean boolean1) {
		this.z = boolean1;
	}

	public ajx t() {
		return this.f;
	}

	public void a(ajx ajx) {
		this.f = ajx;
	}

	public String A() {
		return this.g == null ? "" : this.g;
	}

	public boolean u() {
		return this.A;
	}

	public void c(boolean boolean1) {
		this.A = boolean1;
	}

	public boolean v() {
		return this.B;
	}

	public void d(boolean boolean1) {
		this.B = boolean1;
	}

	public ajp w() {
		return this.O;
	}

	public double B() {
		return this.E;
	}

	public double C() {
		return this.F;
	}

	public double D() {
		return this.G;
	}

	public void a(double double1) {
		this.G = double1;
	}

	public long E() {
		return this.H;
	}

	public void e(long long1) {
		this.H = long1;
	}

	public double F() {
		return this.I;
	}

	public void b(double double1) {
		this.I = double1;
	}

	public void c(double double1) {
		this.F = double1;
	}

	public void d(double double1) {
		this.E = double1;
	}

	public double G() {
		return this.J;
	}

	public void e(double double1) {
		this.J = double1;
	}

	public double H() {
		return this.K;
	}

	public void f(double double1) {
		this.K = double1;
	}

	public int I() {
		return this.L;
	}

	public int J() {
		return this.M;
	}

	public void j(int integer) {
		this.L = integer;
	}

	public void k(int integer) {
		this.M = integer;
	}

	public rg x() {
		return this.C;
	}

	public void a(rg rg) {
		this.C = rg;
	}

	public boolean y() {
		return this.D;
	}

	public void e(boolean boolean1) {
		this.D = boolean1;
	}

	public void a(c c) {
		c.a("Level seed", new d<String>() {
			public String call() throws Exception {
				return String.valueOf(bbv.this.a());
			}
		});
		c.a("Level generator", new d<String>() {
			public String call() throws Exception {
				return String.format("ID %02d - %s, ver %d. Features enabled: %b", bbv.this.f.g(), bbv.this.f.a(), bbv.this.f.d(), bbv.this.y);
			}
		});
		c.a("Level generator options", new d<String>() {
			public String call() throws Exception {
				return bbv.this.g;
			}
		});
		c.a("Level spawn location", new d<String>() {
			public String call() throws Exception {
				return c.a(bbv.this.h, bbv.this.i, bbv.this.j);
			}
		});
		c.a("Level time", new d<String>() {
			public String call() throws Exception {
				return String.format("%d game time, %d day time", bbv.this.k, bbv.this.l);
			}
		});
		c.a("Level dimension", new d<String>() {
			public String call() throws Exception {
				return String.valueOf(bbv.this.p);
			}
		});
		c.a("Level storage version", new d<String>() {
			public String call() throws Exception {
				String string2 = "Unknown?";

				try {
					switch (bbv.this.r) {
						case 19132:
							string2 = "McRegion";
							break;
						case 19133:
							string2 = "Anvil";
					}
				} catch (Throwable var3) {
				}

				return String.format("0x%05X - %s", bbv.this.r, string2);
			}
		});
		c.a("Level weather", new d<String>() {
			public String call() throws Exception {
				return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", bbv.this.u, bbv.this.t, bbv.this.w, bbv.this.v);
			}
		});
		c.a("Level game mode", new d<String>() {
			public String call() throws Exception {
				return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", bbv.this.x.b(), bbv.this.x.a(), bbv.this.z, bbv.this.A);
			}
		});
	}

	public du a(avg avg) {
		du du3 = (du)this.N.get(avg);
		return du3 == null ? new du() : du3;
	}

	public void a(avg avg, du du) {
		this.N.put(avg, du);
	}

	public int K() {
		return this.c;
	}

	public boolean L() {
		return this.d;
	}

	public String M() {
		return this.b;
	}
}

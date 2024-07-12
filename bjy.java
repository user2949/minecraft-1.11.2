import java.util.Random;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;

public class bjy extends bho {
	private final bho f;
	private bfq g;
	private bfq h;
	private String i;
	private String r = "survival";
	private String s;
	private boolean t = true;
	private boolean u;
	private boolean v;
	private boolean w;
	private boolean x;
	private boolean y;
	private boolean z;
	private bfm A;
	private bfm B;
	private bfm C;
	private bfm D;
	private bfm E;
	private bfm F;
	private bfm G;
	private String H;
	private String I;
	private String J;
	private String K;
	private int L;
	public String a = "";
	private static final String[] M = new String[]{
		"CON",
		"COM",
		"PRN",
		"AUX",
		"CLOCK$",
		"NUL",
		"COM1",
		"COM2",
		"COM3",
		"COM4",
		"COM5",
		"COM6",
		"COM7",
		"COM8",
		"COM9",
		"LPT1",
		"LPT2",
		"LPT3",
		"LPT4",
		"LPT5",
		"LPT6",
		"LPT7",
		"LPT8",
		"LPT9"
	};

	public bjy(bho bho) {
		this.f = bho;
		this.J = "";
		this.K = cah.a("selectWorld.newWorld");
	}

	@Override
	public void e() {
		this.g.a();
		this.h.a();
	}

	@Override
	public void b() {
		Keyboard.enableRepeatEvents(true);
		this.n.clear();
		this.n.add(new bfm(0, this.l / 2 - 155, this.m - 28, 150, 20, cah.a("selectWorld.create")));
		this.n.add(new bfm(1, this.l / 2 + 5, this.m - 28, 150, 20, cah.a("gui.cancel")));
		this.A = this.b(new bfm(2, this.l / 2 - 75, 115, 150, 20, cah.a("selectWorld.gameMode")));
		this.B = this.b(new bfm(3, this.l / 2 - 75, 187, 150, 20, cah.a("selectWorld.moreWorldOptions")));
		this.C = this.b(new bfm(4, this.l / 2 - 155, 100, 150, 20, cah.a("selectWorld.mapFeatures")));
		this.C.m = false;
		this.D = this.b(new bfm(7, this.l / 2 + 5, 151, 150, 20, cah.a("selectWorld.bonusItems")));
		this.D.m = false;
		this.E = this.b(new bfm(5, this.l / 2 + 5, 100, 150, 20, cah.a("selectWorld.mapType")));
		this.E.m = false;
		this.F = this.b(new bfm(6, this.l / 2 - 155, 151, 150, 20, cah.a("selectWorld.allowCommands")));
		this.F.m = false;
		this.G = this.b(new bfm(8, this.l / 2 + 5, 120, 150, 20, cah.a("selectWorld.customizeType")));
		this.G.m = false;
		this.g = new bfq(9, this.q, this.l / 2 - 100, 60, 200, 20);
		this.g.b(true);
		this.g.a(this.K);
		this.h = new bfq(10, this.q, this.l / 2 - 100, 60, 200, 20);
		this.h.a(this.J);
		this.a(this.z);
		this.a();
		this.f();
	}

	private void a() {
		this.i = this.g.b().trim();

		for (char character5 : g.c) {
			this.i = this.i.replace(character5, '_');
		}

		if (StringUtils.isEmpty(this.i)) {
			this.i = "World";
		}

		this.i = a(this.j.g(), this.i);
	}

	private void f() {
		this.A.j = cah.a("selectWorld.gameMode") + ": " + cah.a("selectWorld.gameMode." + this.r);
		this.H = cah.a("selectWorld.gameMode." + this.r + ".line1");
		this.I = cah.a("selectWorld.gameMode." + this.r + ".line2");
		this.C.j = cah.a("selectWorld.mapFeatures") + " ";
		if (this.t) {
			this.C.j = this.C.j + cah.a("options.on");
		} else {
			this.C.j = this.C.j + cah.a("options.off");
		}

		this.D.j = cah.a("selectWorld.bonusItems") + " ";
		if (this.w && !this.x) {
			this.D.j = this.D.j + cah.a("options.on");
		} else {
			this.D.j = this.D.j + cah.a("options.off");
		}

		this.E.j = cah.a("selectWorld.mapType") + " " + cah.a(ajx.a[this.L].b());
		this.F.j = cah.a("selectWorld.allowCommands") + " ";
		if (this.u && !this.x) {
			this.F.j = this.F.j + cah.a("options.on");
		} else {
			this.F.j = this.F.j + cah.a("options.off");
		}
	}

	public static String a(bby bby, String string) {
		string = string.replaceAll("[\\./\"]", "_");

		for (String string6 : M) {
			if (string.equalsIgnoreCase(string6)) {
				string = "_" + string + "_";
			}
		}

		while (bby.c(string) != null) {
			string = string + "-";
		}

		return string;
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 1) {
				this.j.a(this.f);
			} else if (bfm.k == 0) {
				this.j.a(null);
				if (this.y) {
					return;
				}

				this.y = true;
				long long3 = new Random().nextLong();
				String string5 = this.h.b();
				if (!StringUtils.isEmpty(string5)) {
					try {
						long long6 = Long.parseLong(string5);
						if (long6 != 0L) {
							long3 = long6;
						}
					} catch (NumberFormatException var7) {
						long3 = (long)string5.hashCode();
					}
				}

				ajv ajv6 = new ajv(long3, ajq.a(this.r), this.t, this.x, ajx.a[this.L]);
				ajv6.a(this.a);
				if (this.w && !this.x) {
					ajv6.a();
				}

				if (this.u && !this.x) {
					ajv6.b();
				}

				this.j.a(this.i, this.g.b().trim(), ajv6);
			} else if (bfm.k == 3) {
				this.h();
			} else if (bfm.k == 2) {
				if ("survival".equals(this.r)) {
					if (!this.v) {
						this.u = false;
					}

					this.x = false;
					this.r = "hardcore";
					this.x = true;
					this.F.l = false;
					this.D.l = false;
					this.f();
				} else if ("hardcore".equals(this.r)) {
					if (!this.v) {
						this.u = true;
					}

					this.x = false;
					this.r = "creative";
					this.f();
					this.x = false;
					this.F.l = true;
					this.D.l = true;
				} else {
					if (!this.v) {
						this.u = false;
					}

					this.r = "survival";
					this.f();
					this.F.l = true;
					this.D.l = true;
					this.x = false;
				}

				this.f();
			} else if (bfm.k == 4) {
				this.t = !this.t;
				this.f();
			} else if (bfm.k == 7) {
				this.w = !this.w;
				this.f();
			} else if (bfm.k == 5) {
				this.L++;
				if (this.L >= ajx.a.length) {
					this.L = 0;
				}

				while (!this.g()) {
					this.L++;
					if (this.L >= ajx.a.length) {
						this.L = 0;
					}
				}

				this.a = "";
				this.f();
				this.a(this.z);
			} else if (bfm.k == 6) {
				this.v = true;
				this.u = !this.u;
				this.f();
			} else if (bfm.k == 8) {
				if (ajx.a[this.L] == ajx.c) {
					this.j.a(new bgw(this, this.a));
				} else {
					this.j.a(new bgy(this, this.a));
				}
			}
		}
	}

	private boolean g() {
		ajx ajx2 = ajx.a[this.L];
		if (ajx2 == null || !ajx2.e()) {
			return false;
		} else {
			return ajx2 == ajx.g ? r() : true;
		}
	}

	private void h() {
		this.a(!this.z);
	}

	private void a(boolean boolean1) {
		this.z = boolean1;
		if (ajx.a[this.L] == ajx.g) {
			this.A.m = !this.z;
			this.A.l = false;
			if (this.s == null) {
				this.s = this.r;
			}

			this.r = "spectator";
			this.C.m = false;
			this.D.m = false;
			this.E.m = this.z;
			this.F.m = false;
			this.G.m = false;
		} else {
			this.A.m = !this.z;
			this.A.l = true;
			if (this.s != null) {
				this.r = this.s;
				this.s = null;
			}

			this.C.m = this.z && ajx.a[this.L] != ajx.f;
			this.D.m = this.z;
			this.E.m = this.z;
			this.F.m = this.z;
			this.G.m = this.z && (ajx.a[this.L] == ajx.c || ajx.a[this.L] == ajx.f);
		}

		this.f();
		if (this.z) {
			this.B.j = cah.a("gui.done");
		} else {
			this.B.j = cah.a("selectWorld.moreWorldOptions");
		}
	}

	@Override
	protected void a(char character, int integer) {
		if (this.g.m() && !this.z) {
			this.g.a(character, integer);
			this.K = this.g.b();
		} else if (this.h.m() && this.z) {
			this.h.a(character, integer);
			this.J = this.h.b();
		}

		if (integer == 28 || integer == 156) {
			this.a((bfm)this.n.get(0));
		}

		((bfm)this.n.get(0)).l = !this.g.b().isEmpty();
		this.a();
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		if (this.z) {
			this.h.a(integer1, integer2, integer3);
		} else {
			this.g.a(integer1, integer2, integer3);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, cah.a("selectWorld.create"), this.l / 2, 20, -1);
		if (this.z) {
			this.c(this.q, cah.a("selectWorld.enterSeed"), this.l / 2 - 100, 47, -6250336);
			this.c(this.q, cah.a("selectWorld.seedInfo"), this.l / 2 - 100, 85, -6250336);
			if (this.C.m) {
				this.c(this.q, cah.a("selectWorld.mapFeatures.info"), this.l / 2 - 150, 122, -6250336);
			}

			if (this.F.m) {
				this.c(this.q, cah.a("selectWorld.allowCommands.info"), this.l / 2 - 150, 172, -6250336);
			}

			this.h.g();
			if (ajx.a[this.L].h()) {
				this.q.a(cah.a(ajx.a[this.L].c()), this.E.h + 2, this.E.i + 22, this.E.b(), 10526880);
			}
		} else {
			this.c(this.q, cah.a("selectWorld.enterName"), this.l / 2 - 100, 47, -6250336);
			this.c(this.q, cah.a("selectWorld.resultFolder") + " " + this.i, this.l / 2 - 100, 85, -6250336);
			this.g.g();
			this.c(this.q, this.H, this.l / 2 - 100, 137, -6250336);
			this.c(this.q, this.I, this.l / 2 - 100, 149, -6250336);
		}

		super.a(integer1, integer2, float3);
	}

	public void a(bbv bbv) {
		this.K = cah.a("selectWorld.newWorld.copyOf", bbv.j());
		this.J = bbv.a() + "";
		this.L = bbv.t().g();
		this.a = bbv.A();
		this.t = bbv.r();
		this.u = bbv.u();
		if (bbv.s()) {
			this.r = "hardcore";
		} else if (bbv.q().e()) {
			this.r = "survival";
		} else if (bbv.q().d()) {
			this.r = "creative";
		}
	}
}

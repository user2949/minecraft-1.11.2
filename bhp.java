public class bhp extends bho {
	private final bho a;
	private bfm f;
	private bfm g;
	private String h = "survival";
	private boolean i;

	public bhp(bho bho) {
		this.a = bho;
	}

	@Override
	public void b() {
		this.n.clear();
		this.n.add(new bfm(101, this.l / 2 - 155, this.m - 28, 150, 20, cah.a("lanServer.start")));
		this.n.add(new bfm(102, this.l / 2 + 5, this.m - 28, 150, 20, cah.a("gui.cancel")));
		this.g = this.b(new bfm(104, this.l / 2 - 155, 100, 150, 20, cah.a("selectWorld.gameMode")));
		this.f = this.b(new bfm(103, this.l / 2 + 5, 100, 150, 20, cah.a("selectWorld.allowCommands")));
		this.a();
	}

	private void a() {
		this.g.j = cah.a("selectWorld.gameMode") + ": " + cah.a("selectWorld.gameMode." + this.h);
		this.f.j = cah.a("selectWorld.allowCommands") + " ";
		if (this.i) {
			this.f.j = this.f.j + cah.a("options.on");
		} else {
			this.f.j = this.f.j + cah.a("options.off");
		}
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 102) {
			this.j.a(this.a);
		} else if (bfm.k == 104) {
			if ("spectator".equals(this.h)) {
				this.h = "creative";
			} else if ("creative".equals(this.h)) {
				this.h = "adventure";
			} else if ("adventure".equals(this.h)) {
				this.h = "survival";
			} else {
				this.h = "spectator";
			}

			this.a();
		} else if (bfm.k == 103) {
			this.i = !this.i;
			this.a();
		} else if (bfm.k == 101) {
			this.j.a(null);
			String string3 = this.j.F().a(ajq.a(this.h), this.i);
			fb fb4;
			if (string3 != null) {
				fb4 = new fi("commands.publish.started", string3);
			} else {
				fb4 = new fh("commands.publish.failed");
			}

			this.j.r.d().a(fb4);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, cah.a("lanServer.title"), this.l / 2, 50, 16777215);
		this.a(this.q, cah.a("lanServer.otherPlayers"), this.l / 2, 82, 16777215);
		super.a(integer1, integer2, float3);
	}
}

import org.lwjgl.input.Keyboard;

public class bhb extends bho {
	private final bho a;
	private final bnt f;
	private bfq g;

	public bhb(bho bho, bnt bnt) {
		this.a = bho;
		this.f = bnt;
	}

	@Override
	public void e() {
		this.g.a();
	}

	@Override
	public void b() {
		Keyboard.enableRepeatEvents(true);
		this.n.clear();
		this.n.add(new bfm(0, this.l / 2 - 100, this.m / 4 + 96 + 12, cah.a("selectServer.select")));
		this.n.add(new bfm(1, this.l / 2 - 100, this.m / 4 + 120 + 12, cah.a("gui.cancel")));
		this.g = new bfq(2, this.q, this.l / 2 - 100, 116, 200, 20);
		this.g.f(128);
		this.g.b(true);
		this.g.a(this.j.u.aw);
		((bfm)this.n.get(0)).l = !this.g.b().isEmpty() && this.g.b().split(":").length > 0;
	}

	@Override
	public void m() {
		Keyboard.enableRepeatEvents(false);
		this.j.u.aw = this.g.b();
		this.j.u.b();
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 1) {
				this.a.a(false, 0);
			} else if (bfm.k == 0) {
				this.f.b = this.g.b();
				this.a.a(true, 0);
			}
		}
	}

	@Override
	protected void a(char character, int integer) {
		if (this.g.a(character, integer)) {
			((bfm)this.n.get(0)).l = !this.g.b().isEmpty() && this.g.b().split(":").length > 0;
		} else if (integer == 28 || integer == 156) {
			this.a((bfm)this.n.get(0));
		}
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		this.g.a(integer1, integer2, integer3);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, cah.a("selectServer.direct"), this.l / 2, 20, 16777215);
		this.c(this.q, cah.a("addServer.enterIp"), this.l / 2 - 100, 100, 10526880);
		this.g.g();
		super.a(integer1, integer2, float3);
	}
}

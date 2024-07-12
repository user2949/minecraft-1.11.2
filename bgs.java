public class bgs extends bgu {
	private final String r;
	private final String s;
	private final String t;
	private boolean u = true;

	public bgs(bgt bgt, String string, int integer, boolean boolean4) {
		super(bgt, cah.a(boolean4 ? "chat.link.confirmTrusted" : "chat.link.confirm"), string, integer);
		this.g = cah.a(boolean4 ? "chat.link.open" : "gui.yes");
		this.h = cah.a(boolean4 ? "gui.cancel" : "gui.no");
		this.s = cah.a("chat.copy");
		this.r = cah.a("chat.link.warning");
		this.t = string;
	}

	@Override
	public void b() {
		super.b();
		this.n.clear();
		this.n.add(new bfm(0, this.l / 2 - 50 - 105, this.m / 6 + 96, 100, 20, this.g));
		this.n.add(new bfm(2, this.l / 2 - 50, this.m / 6 + 96, 100, 20, this.s));
		this.n.add(new bfm(1, this.l / 2 - 50 + 105, this.m / 6 + 96, 100, 20, this.h));
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 2) {
			this.a();
		}

		this.a.a(bfm.k == 0, this.i);
	}

	public void a() {
		e(this.t);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		super.a(integer1, integer2, float3);
		if (this.u) {
			this.a(this.q, this.r, this.l / 2, 110, 16764108);
		}
	}

	public void f() {
		this.u = false;
	}
}

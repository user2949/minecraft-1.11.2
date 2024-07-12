public class bjh implements bfy.a {
	private final bjf c;
	protected final bes a;
	protected final ccj b;
	private long d;

	protected bjh(bjf bjf, ccj ccj) {
		this.c = bjf;
		this.b = ccj;
		this.a = bes.z();
	}

	@Override
	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, boolean boolean8) {
		this.a.k.a(cah.a("lanServer.title"), integer2 + 32 + 3, integer3 + 1, 16777215);
		this.a.k.a(this.b.a(), integer2 + 32 + 3, integer3 + 12, 8421504);
		if (this.a.u.x) {
			this.a.k.a(cah.a("selectServer.hiddenAddress"), integer2 + 32 + 3, integer3 + 12 + 11, 3158064);
		} else {
			this.a.k.a(this.b.b(), integer2 + 32 + 3, integer3 + 12 + 11, 3158064);
		}
	}

	@Override
	public boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.c.b(integer1);
		if (bes.I() - this.d < 250L) {
			this.c.f();
		}

		this.d = bes.I();
		return false;
	}

	@Override
	public void a(int integer1, int integer2, int integer3) {
	}

	@Override
	public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
	}

	public ccj a() {
		return this.b;
	}
}

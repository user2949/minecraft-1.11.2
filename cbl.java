public class cbl implements bzz {
	private dh<cbm, cbh> a;
	private final byy b;
	private final bqz c;
	private cbh d;

	public cbl(byy byy) {
		this.b = byy;
		this.c = new bqz(this);
	}

	@Override
	public void a(bzy bzy) {
		cbk cbk3 = new cbk(bzy, this.b, this.c);
		this.a = cbk3.a();
		this.d = this.a.c(cbk.a);
		this.c.c();
	}

	public cbh a(cbm cbm) {
		if (cbm == null) {
			return this.d;
		} else {
			cbh cbh3 = this.a.c(cbm);
			return cbh3 == null ? this.d : cbh3;
		}
	}

	public cbh a() {
		return this.d;
	}

	public byy b() {
		return this.b;
	}

	public bqz c() {
		return this.c;
	}
}

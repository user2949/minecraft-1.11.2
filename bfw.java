public class bfw extends bfm {
	private boolean o;
	private final String p;
	private final bgb.b q;

	public bfw(bgb.b b, int integer2, int integer3, int integer4, String string, boolean boolean6) {
		super(integer2, integer3, integer4, 150, 20, "");
		this.p = string;
		this.o = boolean6;
		this.j = this.c();
		this.q = b;
	}

	private String c() {
		return cah.a(this.p) + ": " + cah.a(this.o ? "gui.yes" : "gui.no");
	}

	public void b(boolean boolean1) {
		this.o = boolean1;
		this.j = this.c();
		this.q.a(this.k, boolean1);
	}

	@Override
	public boolean c(bes bes, int integer2, int integer3) {
		if (super.c(bes, integer2, integer3)) {
			this.o = !this.o;
			this.j = this.c();
			this.q.a(this.k, this.o);
			return true;
		} else {
			return false;
		}
	}
}

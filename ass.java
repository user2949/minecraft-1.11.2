public class ass extends asc {
	public byte a;
	public boolean f;

	@Override
	public du b(du du) {
		super.b(du);
		du.a("note", this.a);
		du.a("powered", this.f);
		return du;
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a = du.f("note");
		this.a = (byte)ot.a(this.a, 0, 24);
		this.f = du.p("powered");
	}

	public void a() {
		this.a = (byte)((this.a + 1) % 25);
		this.x_();
	}

	public void a(ajs ajs, co co) {
		if (ajs.o(co.a()).a() == azs.a) {
			azs azs4 = ajs.o(co.b()).a();
			int integer5 = 0;
			if (azs4 == azs.e) {
				integer5 = 1;
			}

			if (azs4 == azs.p) {
				integer5 = 2;
			}

			if (azs4 == azs.s) {
				integer5 = 3;
			}

			if (azs4 == azs.d) {
				integer5 = 4;
			}

			ajs.c(co, alv.B, integer5, this.a);
		}
	}
}

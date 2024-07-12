public class nq extends nw {
	public final int a;
	public final int b;
	public final nq c;
	private final String k;
	private ns l;
	public final afj d;
	private boolean m;

	public nq(String string1, String string2, int integer3, int integer4, afh afh, nq nq) {
		this(string1, string2, integer3, integer4, new afj(afh), nq);
	}

	public nq(String string1, String string2, int integer3, int integer4, alu alu, nq nq) {
		this(string1, string2, integer3, integer4, new afj(alu), nq);
	}

	public nq(String string1, String string2, int integer3, int integer4, afj afj, nq nq) {
		super(string1, new fi("achievement." + string2));
		this.d = afj;
		this.k = "achievement." + string2 + ".desc";
		this.a = integer3;
		this.b = integer4;
		if (integer3 < nr.a) {
			a = integer3;
		}

		if (integer4 < nr.b) {
			b = integer4;
		}

		if (integer3 > nr.c) {
			nr.c = integer3;
		}

		if (integer4 > nr.d) {
			nr.d = integer4;
		}

		this.c = nq;
	}

	public nq i() {
		this.f = true;
		return this;
	}

	public nq b() {
		this.m = true;
		return this;
	}

	public nq h() {
		super.h();
		nr.e.add(this);
		return this;
	}

	@Override
	public boolean d() {
		return true;
	}

	@Override
	public fb e() {
		fb fb2 = super.e();
		fb2.b().a(this.g() ? a.DARK_PURPLE : a.GREEN);
		return fb2;
	}

	public nq b(Class<? extends nz> class1) {
		return (nq)super.b(class1);
	}

	public String f() {
		return this.l != null ? this.l.a(dp.a(this.k)) : dp.a(this.k);
	}

	public nq a(ns ns) {
		this.l = ns;
		return this;
	}

	public boolean g() {
		return this.m;
	}
}

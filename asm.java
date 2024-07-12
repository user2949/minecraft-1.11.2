import javax.annotation.Nullable;

public class asm extends asc {
	private afh a;
	private int f;

	public asm() {
	}

	public asm(afh afh, int integer) {
		this.a = afh;
		this.f = integer;
	}

	public static void a(ph ph) {
	}

	@Override
	public du b(du du) {
		super.b(du);
		kq kq3 = afh.g.b(this.a);
		du.a("Item", kq3 == null ? "" : kq3.toString());
		du.a("Data", this.f);
		return du;
	}

	@Override
	public void a(du du) {
		super.a(du);
		if (du.b("Item", 8)) {
			this.a = afh.b(du.l("Item"));
		} else {
			this.a = afh.c(du.h("Item"));
		}

		this.f = du.h("Data");
	}

	@Nullable
	@Override
	public fz c() {
		return new fz(this.c, 5, this.d());
	}

	@Override
	public du d() {
		return this.b(new du());
	}

	public void a(afj afj) {
		this.a = afj.c();
		this.f = afj.j();
	}

	public afj a() {
		return this.a == null ? afj.a : new afj(this.a, 1, this.f);
	}

	@Nullable
	public afh e() {
		return this.a;
	}

	public int f() {
		return this.f;
	}
}

import javax.annotation.Nullable;

public class adl {
	private final int a;
	public final rc d;
	public int e;
	public int f;
	public int g;

	public adl(rc rc, int integer2, int integer3, int integer4) {
		this.d = rc;
		this.a = integer2;
		this.f = integer3;
		this.g = integer4;
	}

	public void a(afj afj1, afj afj2) {
		int integer4 = afj2.E() - afj1.E();
		if (integer4 > 0) {
			this.a(afj2, integer4);
		}
	}

	protected void a(afj afj, int integer) {
	}

	protected void b(int integer) {
	}

	protected void c(afj afj) {
	}

	public afj a(aay aay, afj afj) {
		this.f();
		return afj;
	}

	public boolean a(afj afj) {
		return true;
	}

	public afj d() {
		return this.d.a(this.a);
	}

	public boolean e() {
		return !this.d().b();
	}

	public void d(afj afj) {
		this.d.a(this.a, afj);
		this.f();
	}

	public void f() {
		this.d.x_();
	}

	public int a() {
		return this.d.y_();
	}

	public int b(afj afj) {
		return this.a();
	}

	@Nullable
	public String c() {
		return null;
	}

	public afj a(int integer) {
		return this.d.a(this.a, integer);
	}

	public boolean a(rc rc, int integer) {
		return rc == this.d && integer == this.a;
	}

	public boolean a(aay aay) {
		return true;
	}

	public boolean b() {
		return true;
	}
}

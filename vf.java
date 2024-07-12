import javax.annotation.Nullable;

public class vf extends ui {
	protected final te a;
	protected double b;
	protected double c;
	protected double d;
	protected final double e;
	protected int f;
	protected boolean g;

	public vf(te te, double double2) {
		this(te, double2, 120);
	}

	public vf(te te, double double2, int integer) {
		this.a = te;
		this.e = double2;
		this.f = integer;
		this.a(1);
	}

	@Override
	public boolean a() {
		if (!this.g) {
			if (this.a.bO() >= 100) {
				return false;
			}

			if (this.a.bJ().nextInt(this.f) != 0) {
				return false;
			}
		}

		bdw bdw2 = this.f();
		if (bdw2 == null) {
			return false;
		} else {
			this.b = bdw2.b;
			this.c = bdw2.c;
			this.d = bdw2.d;
			this.g = false;
			return true;
		}
	}

	@Nullable
	protected bdw f() {
		return wm.a(this.a, 10, 7);
	}

	@Override
	public boolean b() {
		return !this.a.x().n();
	}

	@Override
	public void c() {
		this.a.x().a(this.b, this.c, this.d, this.e);
	}

	public void i() {
		this.g = true;
	}

	public void b(int integer) {
		this.f = integer;
	}
}

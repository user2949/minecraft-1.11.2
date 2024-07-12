public class btn implements btl {
	private final bto a;
	private double b;
	private double c;
	private double d;

	public btn() {
		this(btm.a());
	}

	public btn(bto bto) {
		this.a = bto;
	}

	@Override
	public void a(double double1, double double2, double double3) {
		this.b = double1;
		this.c = double2;
		this.d = double3;
	}

	public boolean b(double double1, double double2, double double3, double double4, double double5, double double6) {
		return this.a.b(double1 - this.b, double2 - this.c, double3 - this.d, double4 - this.b, double5 - this.c, double6 - this.d);
	}

	@Override
	public boolean a(bdt bdt) {
		return this.b(bdt.a, bdt.b, bdt.c, bdt.d, bdt.e, bdt.f);
	}
}

import java.io.IOException;

public class hu implements fm<fp> {
	private int a;
	private int b;
	private int c;
	private int d;

	public hu() {
	}

	public hu(sn sn) {
		this(sn.O(), sn.s, sn.t, sn.u);
	}

	public hu(int integer, double double2, double double3, double double4) {
		this.a = integer;
		double double9 = 3.9;
		if (double2 < -3.9) {
			double2 = -3.9;
		}

		if (double3 < -3.9) {
			double3 = -3.9;
		}

		if (double4 < -3.9) {
			double4 = -3.9;
		}

		if (double2 > 3.9) {
			double2 = 3.9;
		}

		if (double3 > 3.9) {
			double3 = 3.9;
		}

		if (double4 > 3.9) {
			double4 = 3.9;
		}

		this.b = (int)(double2 * 8000.0);
		this.c = (int)(double3 * 8000.0);
		this.d = (int)(double4 * 8000.0);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.readShort();
		this.c = et.readShort();
		this.d = et.readShort();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.writeShort(this.b);
		et.writeShort(this.c);
		et.writeShort(this.d);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}

	public int c() {
		return this.c;
	}

	public int d() {
		return this.d;
	}
}

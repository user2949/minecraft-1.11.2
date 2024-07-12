import java.io.IOException;

public class hy implements fm<fp> {
	private String a;
	private String b;
	private bei.a c;
	private int d;

	public hy() {
	}

	public hy(bdy bdy, int integer) {
		this.a = bdy.b();
		this.b = bdy.d();
		this.c = bdy.c().c();
		this.d = integer;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(16);
		this.d = et.readByte();
		if (this.d == 0 || this.d == 2) {
			this.b = et.e(32);
			this.c = bei.a.a(et.e(16));
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.writeByte(this.d);
		if (this.d == 0 || this.d == 2) {
			et.a(this.b);
			et.a(this.c.a());
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public String a() {
		return this.a;
	}

	public String b() {
		return this.b;
	}

	public int c() {
		return this.d;
	}

	public bei.a d() {
		return this.c;
	}
}

import java.io.IOException;

public class ii implements fm<fp> {
	private int a;
	private int b;
	private int c;

	public ii() {
	}

	public ii(int integer1, int integer2, int integer3) {
		this.a = integer1;
		this.b = integer2;
		this.c = integer3;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.g();
		this.c = et.g();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.d(this.b);
		et.d(this.c);
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
}

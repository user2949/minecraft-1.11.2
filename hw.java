import java.io.IOException;

public class hw implements fm<fp> {
	private float a;
	private int b;
	private int c;

	public hw() {
	}

	public hw(float float1, int integer2, int integer3) {
		this.a = float1;
		this.b = integer2;
		this.c = integer3;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readFloat();
		this.c = et.g();
		this.b = et.g();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeFloat(this.a);
		et.d(this.c);
		et.d(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public float a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}

	public int c() {
		return this.c;
	}
}

import java.io.IOException;

public class fy implements fm<fp> {
	private int a;
	private co b;
	private int c;

	public fy() {
	}

	public fy(int integer1, co co, int integer3) {
		this.a = integer1;
		this.b = co;
		this.c = integer3;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.e();
		this.c = et.readUnsignedByte();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
		et.writeByte(this.c);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}

	public co b() {
		return this.b;
	}

	public int c() {
		return this.c;
	}
}

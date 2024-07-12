import java.io.IOException;

public class gf implements fm<fp> {
	private fb a;
	private byte b;

	public gf() {
	}

	public gf(fb fb) {
		this(fb, (byte)1);
	}

	public gf(fb fb, byte byte2) {
		this.a = fb;
		this.b = byte2;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.f();
		this.b = et.readByte();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.writeByte(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public fb a() {
		return this.a;
	}

	public boolean b() {
		return this.b == 1 || this.b == 2;
	}

	public byte c() {
		return this.b;
	}
}

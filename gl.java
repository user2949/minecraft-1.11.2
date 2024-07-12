import java.io.IOException;

public class gl implements fm<fp> {
	private int a;
	private int b;
	private int c;

	public gl() {
	}

	public gl(int integer1, int integer2, int integer3) {
		this.a = integer1;
		this.b = integer2;
		this.c = integer3;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readUnsignedByte();
		this.b = et.readShort();
		this.c = et.readShort();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
		et.writeShort(this.b);
		et.writeShort(this.c);
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

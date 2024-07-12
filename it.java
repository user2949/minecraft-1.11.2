import java.io.IOException;

public class it implements fm<im> {
	private int a;
	private int b;

	public it() {
	}

	public it(int integer1, int integer2) {
		this.a = integer1;
		this.b = integer2;
	}

	public void a(im im) {
		im.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readByte();
		this.b = et.readByte();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
		et.writeByte(this.b);
	}

	public int a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}
}

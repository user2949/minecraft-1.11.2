import java.io.IOException;

public class is implements fm<im> {
	private int a;
	private short b;
	private boolean c;

	public is() {
	}

	public is(int integer, short short2, boolean boolean3) {
		this.a = integer;
		this.b = short2;
		this.c = boolean3;
	}

	public void a(im im) {
		im.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readByte();
		this.b = et.readShort();
		this.c = et.readByte() != 0;
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
		et.writeShort(this.b);
		et.writeByte(this.c ? 1 : 0);
	}

	public int a() {
		return this.a;
	}

	public short b() {
		return this.b;
	}
}

import java.io.IOException;

public class gh implements fm<fp> {
	private int a;
	private short b;
	private boolean c;

	public gh() {
	}

	public gh(int integer, short short2, boolean boolean3) {
		this.a = integer;
		this.b = short2;
		this.c = boolean3;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readUnsignedByte();
		this.b = et.readShort();
		this.c = et.readBoolean();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
		et.writeShort(this.b);
		et.writeBoolean(this.c);
	}

	public int a() {
		return this.a;
	}

	public short b() {
		return this.b;
	}

	public boolean c() {
		return this.c;
	}
}

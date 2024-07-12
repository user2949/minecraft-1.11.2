import java.io.IOException;

public class gr implements fm<fp> {
	private int a;
	private byte b;

	public gr() {
	}

	public gr(sn sn, byte byte2) {
		this.a = sn.O();
		this.b = byte2;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readInt();
		this.b = et.readByte();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeInt(this.a);
		et.writeByte(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public sn a(ajs ajs) {
		return ajs.a(this.a);
	}

	public byte a() {
		return this.b;
	}
}

import java.io.IOException;

public class gi implements fm<fp> {
	private int a;

	public gi() {
	}

	public gi(int integer) {
		this.a = integer;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readUnsignedByte();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
	}
}

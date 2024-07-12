import java.io.IOException;

public class fw implements fm<fp> {
	private int a;
	private int b;

	public fw() {
	}

	public fw(sn sn, int integer) {
		this.a = sn.O();
		this.b = integer;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.readUnsignedByte();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.writeByte(this.b);
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
}

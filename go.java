import java.io.IOException;

public class go implements fm<fp> {
	private String a;
	private et b;

	public go() {
	}

	public go(String string, et et) {
		this.a = string;
		this.b = et;
		if (et.writerIndex() > 1048576) {
			throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(20);
		int integer3 = et.readableBytes();
		if (integer3 >= 0 && integer3 <= 1048576) {
			this.b = new et(et.readBytes(integer3));
		} else {
			throw new IOException("Payload may not be larger than 1048576 bytes");
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.writeBytes(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public String a() {
		return this.a;
	}

	public et b() {
		return this.b;
	}
}

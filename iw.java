import java.io.IOException;

public class iw implements fm<im> {
	private String a;
	private et b;

	public iw() {
	}

	public iw(String string, et et) {
		this.a = string;
		this.b = et;
		if (et.writerIndex() > 32767) {
			throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(20);
		int integer3 = et.readableBytes();
		if (integer3 >= 0 && integer3 <= 32767) {
			this.b = new et(et.readBytes(integer3));
		} else {
			throw new IOException("Payload may not be larger than 32767 bytes");
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.writeBytes(this.b);
	}

	public void a(im im) {
		im.a(this);
		if (this.b != null) {
			this.b.release();
		}
	}

	public String a() {
		return this.a;
	}

	public et b() {
		return this.b;
	}
}

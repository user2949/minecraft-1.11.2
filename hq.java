import java.io.IOException;

public class hq implements fm<fp> {
	private int a;

	public hq() {
	}

	public hq(int integer) {
		this.a = integer;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readByte();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}
}

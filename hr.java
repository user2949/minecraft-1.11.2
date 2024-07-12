import java.io.IOException;

public class hr implements fm<fp> {
	private int a;
	private String b;

	public hr() {
	}

	public hr(int integer, bdy bdy) {
		this.a = integer;
		if (bdy == null) {
			this.b = "";
		} else {
			this.b = bdy.b();
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readByte();
		this.b = et.e(16);
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
		et.a(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}

	public String b() {
		return this.b;
	}
}

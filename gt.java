import java.io.IOException;

public class gt implements fm<fp> {
	private int a;
	private int b;

	public gt() {
	}

	public gt(int integer1, int integer2) {
		this.a = integer1;
		this.b = integer2;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readInt();
		this.b = et.readInt();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeInt(this.a);
		et.writeInt(this.b);
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

import java.io.IOException;

public class fz implements fm<fp> {
	private co a;
	private int b;
	private du c;

	public fz() {
	}

	public fz(co co, int integer, du du) {
		this.a = co;
		this.b = integer;
		this.c = du;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e();
		this.b = et.readUnsignedByte();
		this.c = et.j();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.writeByte((byte)this.b);
		et.a(this.c);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public co a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}

	public du c() {
		return this.c;
	}
}

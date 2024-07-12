import java.io.IOException;

public class gv implements fm<fp> {
	private int a;

	public gv() {
	}

	public gv(int integer) {
		this.a = integer;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
	}

	public int a() {
		return this.a;
	}
}

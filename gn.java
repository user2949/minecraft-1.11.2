import java.io.IOException;

public class gn implements fm<fp> {
	private afh a;
	private int b;

	public gn() {
	}

	public gn(afh afh, int integer) {
		this.a = afh;
		this.b = integer;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = afh.c(et.g());
		this.b = et.g();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(afh.a(this.a));
		et.d(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public afh a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}
}

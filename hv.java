import java.io.IOException;

public class hv implements fm<fp> {
	private int a;
	private ss b;
	private afj c = afj.a;

	public hv() {
	}

	public hv(int integer, ss ss, afj afj) {
		this.a = integer;
		this.b = ss;
		this.c = afj.b() ? afj.a : afj.l();
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.a(ss.class);
		this.c = et.k();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
		et.a(this.c);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public afj a() {
		return this.c;
	}

	public int b() {
		return this.a;
	}

	public ss c() {
		return this.b;
	}
}

import java.io.IOException;

public class gb implements fm<fp> {
	private co a;
	private atl b;

	public gb() {
	}

	public gb(ajs ajs, co co) {
		this.a = co;
		this.b = ajs.o(co);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e();
		this.b = alu.i.a(et.g());
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.d(alu.i.a(this.b));
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public atl a() {
		return this.b;
	}

	public co b() {
		return this.a;
	}
}

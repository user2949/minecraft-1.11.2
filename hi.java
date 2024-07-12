import java.io.IOException;

public class hi implements fm<fp> {
	private int a;
	private co b;

	public hi() {
	}

	public hi(aay aay, co co) {
		this.a = aay.O();
		this.b = co;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.e();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public aay a(ajs ajs) {
		return (aay)ajs.a(this.a);
	}

	public co a() {
		return this.b;
	}
}

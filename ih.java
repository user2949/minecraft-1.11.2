import java.io.IOException;

public class ih implements fm<fp> {
	private fb a;
	private fb b;

	public ih() {
	}

	public ih(fb fb) {
		this.a = fb;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.f();
		this.b = et.f();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.a(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public fb a() {
		return this.a;
	}

	public fb b() {
		return this.b;
	}
}

import java.io.IOException;

public class gq implements fm<fp> {
	private fb a;

	public gq() {
	}

	public gq(fb fb) {
		this.a = fb;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.f();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public fb a() {
		return this.a;
	}
}

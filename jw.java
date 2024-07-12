import java.io.IOException;

public class jw implements fm<js> {
	private fb a;

	public jw() {
	}

	public jw(fb fb) {
		this.a = fb;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = fb.a.b(et.e(32767));
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
	}

	public void a(js js) {
		js.a(this);
	}

	public fb a() {
		return this.a;
	}
}

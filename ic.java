import java.io.IOException;

public class ic implements fm<fp> {
	private co a;

	public ic() {
	}

	public ic(co co) {
		this.a = co;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public co a() {
		return this.a;
	}
}

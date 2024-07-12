import java.io.IOException;

public class hd implements fm<fp> {
	private co a;

	public hd() {
	}

	public hd(co co) {
		this.a = co;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
	}

	public co a() {
		return this.a;
	}
}

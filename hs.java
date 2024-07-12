import java.io.IOException;
import java.util.List;

public class hs implements fm<fp> {
	private int a;
	private List<kn.a<?>> b;

	public hs() {
	}

	public hs(int integer, kn kn, boolean boolean3) {
		this.a = integer;
		if (boolean3) {
			this.b = kn.c();
			kn.e();
		} else {
			this.b = kn.b();
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = kn.b(et);
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		kn.a(this.b, et);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public List<kn.a<?>> a() {
		return this.b;
	}

	public int b() {
		return this.a;
	}
}

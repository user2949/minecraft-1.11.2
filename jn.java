import java.io.IOException;

public class jn implements fm<im> {
	private ri a;

	public jn() {
	}

	public jn(ri ri) {
		this.a = ri;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.a(ri.class);
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
	}

	public void a(im im) {
		im.a(this);
	}

	public ri a() {
		return this.a;
	}
}

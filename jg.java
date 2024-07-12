import java.io.IOException;

public class jg implements fm<im> {
	private jg.a a;

	public jg() {
	}

	public jg(jg.a a) {
		this.a = a;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.a(jg.a.class);
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
	}

	public void a(im im) {
		im.a(this);
	}

	public static enum a {
		SUCCESSFULLY_LOADED,
		DECLINED,
		FAILED_DOWNLOAD,
		ACCEPTED;
	}
}

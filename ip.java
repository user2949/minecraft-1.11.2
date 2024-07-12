import java.io.IOException;

public class ip implements fm<im> {
	private String a;

	public ip() {
	}

	public ip(String string) {
		if (string.length() > 256) {
			string = string.substring(0, 256);
		}

		this.a = string;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(256);
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
	}

	public void a(im im) {
		im.a(this);
	}

	public String a() {
		return this.a;
	}
}

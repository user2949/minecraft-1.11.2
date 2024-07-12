import java.io.IOException;

public class hl implements fm<fp> {
	private String a;
	private String b;

	public hl() {
	}

	public hl(String string1, String string2) {
		this.a = string1;
		this.b = string2;
		if (string2.length() > 40) {
			throw new IllegalArgumentException("Hash is too long (max 40, was " + string2.length() + ")");
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(32767);
		this.b = et.e(40);
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.a(this.b);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public String a() {
		return this.a;
	}

	public String b() {
		return this.b;
	}
}

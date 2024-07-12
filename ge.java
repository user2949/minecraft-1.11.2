import java.io.IOException;

public class ge implements fm<fp> {
	private String[] a;

	public ge() {
	}

	public ge(String[] arr) {
		this.a = arr;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = new String[et.g()];

		for (int integer3 = 0; integer3 < this.a.length; integer3++) {
			this.a[integer3] = et.e(32767);
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a.length);

		for (String string6 : this.a) {
			et.a(string6);
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public String[] a() {
		return this.a;
	}
}

import java.io.IOException;

public class jj implements fm<im> {
	private co a;
	private String[] b;

	public jj() {
	}

	public jj(co co, fb[] arr) {
		this.a = co;
		this.b = new String[]{arr[0].c(), arr[1].c(), arr[2].c(), arr[3].c()};
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e();
		this.b = new String[4];

		for (int integer3 = 0; integer3 < 4; integer3++) {
			this.b[integer3] = et.e(384);
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);

		for (int integer3 = 0; integer3 < 4; integer3++) {
			et.a(this.b[integer3]);
		}
	}

	public void a(im im) {
		im.a(this);
	}

	public co a() {
		return this.a;
	}

	public String[] b() {
		return this.b;
	}
}

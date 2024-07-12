import java.io.IOException;

public class hj implements fm<fp> {
	private int[] a;

	public hj() {
	}

	public hj(int... arr) {
		this.a = arr;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = new int[et.g()];

		for (int integer3 = 0; integer3 < this.a.length; integer3++) {
			this.a[integer3] = et.g();
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a.length);

		for (int integer6 : this.a) {
			et.d(integer6);
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int[] a() {
		return this.a;
	}
}

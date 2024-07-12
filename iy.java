import java.io.IOException;

public class iy implements fm<im> {
	private int a;

	public iy() {
	}

	public iy(int integer) {
		this.a = integer;
	}

	public void a(im im) {
		im.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
	}

	public int a() {
		return this.a;
	}
}

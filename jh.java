import java.io.IOException;

public class jh implements fm<im> {
	private int a;

	public jh() {
	}

	public jh(int integer) {
		this.a = integer;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readShort();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeShort(this.a);
	}

	public void a(im im) {
		im.a(this);
	}

	public int a() {
		return this.a;
	}
}

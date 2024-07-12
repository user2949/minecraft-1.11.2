import java.io.IOException;

public class ji implements fm<im> {
	private int a;
	private afj b = afj.a;

	public ji() {
	}

	public ji(int integer, afj afj) {
		this.a = integer;
		this.b = afj.b() ? afj.a : afj.l();
	}

	public void a(im im) {
		im.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readShort();
		this.b = et.k();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeShort(this.a);
		et.a(this.b);
	}

	public int a() {
		return this.a;
	}

	public afj b() {
		return this.b;
	}
}

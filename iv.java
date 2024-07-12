import java.io.IOException;

public class iv implements fm<im> {
	private int a;

	public iv() {
	}

	public iv(int integer) {
		this.a = integer;
	}

	public void a(im im) {
		im.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readByte();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
	}
}

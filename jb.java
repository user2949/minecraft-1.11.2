import java.io.IOException;

public class jb implements fm<im> {
	private boolean a;
	private boolean b;

	public jb() {
	}

	public jb(boolean boolean1, boolean boolean2) {
		this.a = boolean1;
		this.b = boolean2;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readBoolean();
		this.b = et.readBoolean();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeBoolean(this.a);
		et.writeBoolean(this.b);
	}

	public void a(im im) {
		im.a(this);
	}

	public boolean a() {
		return this.a;
	}

	public boolean b() {
		return this.b;
	}
}

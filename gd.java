import java.io.IOException;

public class gd implements fm<fp> {
	private rg a;
	private boolean b;

	public gd() {
	}

	public gd(rg rg, boolean boolean2) {
		this.a = rg;
		this.b = boolean2;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = rg.a(et.readUnsignedByte());
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a.a());
	}

	public boolean a() {
		return this.b;
	}

	public rg b() {
		return this.a;
	}
}

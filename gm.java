import java.io.IOException;

public class gm implements fm<fp> {
	private int a;
	private int b;
	private afj c = afj.a;

	public gm() {
	}

	public gm(int integer1, int integer2, afj afj) {
		this.a = integer1;
		this.b = integer2;
		this.c = afj.b() ? afj.a : afj.l();
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readByte();
		this.b = et.readShort();
		this.c = et.k();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
		et.writeShort(this.b);
		et.a(this.c);
	}

	public int a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}

	public afj c() {
		return this.c;
	}
}

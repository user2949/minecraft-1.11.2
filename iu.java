import java.io.IOException;

public class iu implements fm<im> {
	private int a;
	private int b;
	private int c;
	private short d;
	private afj e = afj.a;
	private acq f;

	public iu() {
	}

	public iu(int integer1, int integer2, int integer3, acq acq, afj afj, short short6) {
		this.a = integer1;
		this.b = integer2;
		this.c = integer3;
		this.e = afj.b() ? afj.a : afj.l();
		this.d = short6;
		this.f = acq;
	}

	public void a(im im) {
		im.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readByte();
		this.b = et.readShort();
		this.c = et.readByte();
		this.d = et.readShort();
		this.f = et.a(acq.class);
		this.e = et.k();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
		et.writeShort(this.b);
		et.writeByte(this.c);
		et.writeShort(this.d);
		et.a(this.f);
		et.a(this.e);
	}

	public int a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}

	public int c() {
		return this.c;
	}

	public short d() {
		return this.d;
	}

	public afj e() {
		return this.e;
	}

	public acq f() {
		return this.f;
	}
}

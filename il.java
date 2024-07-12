import java.io.IOException;

public class il implements fm<fp> {
	private int a;
	private byte b;
	private byte c;
	private int d;
	private byte e;

	public il() {
	}

	public il(int integer, sh sh) {
		this.a = integer;
		this.b = (byte)(sg.a(sh.a()) & 0xFF);
		this.c = (byte)(sh.c() & 0xFF);
		if (sh.b() > 32767) {
			this.d = 32767;
		} else {
			this.d = sh.b();
		}

		this.e = 0;
		if (sh.d()) {
			this.e = (byte)(this.e | 1);
		}

		if (sh.e()) {
			this.e = (byte)(this.e | 2);
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.readByte();
		this.c = et.readByte();
		this.d = et.g();
		this.e = et.readByte();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.writeByte(this.b);
		et.writeByte(this.c);
		et.d(this.d);
		et.writeByte(this.e);
	}

	public boolean a() {
		return this.d == 32767;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int b() {
		return this.a;
	}

	public byte c() {
		return this.b;
	}

	public byte d() {
		return this.c;
	}

	public int e() {
		return this.d;
	}

	public boolean f() {
		return (this.e & 2) == 2;
	}

	public boolean g() {
		return (this.e & 1) == 1;
	}
}

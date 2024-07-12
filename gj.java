import java.io.IOException;

public class gj implements fm<fp> {
	private int a;
	private String b;
	private fb c;
	private int d;
	private int e;

	public gj() {
	}

	public gj(int integer, String string, fb fb) {
		this(integer, string, fb, 0);
	}

	public gj(int integer1, String string, fb fb, int integer4) {
		this.a = integer1;
		this.b = string;
		this.c = fb;
		this.d = integer4;
	}

	public gj(int integer1, String string, fb fb, int integer4, int integer5) {
		this(integer1, string, fb, integer4);
		this.e = integer5;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readUnsignedByte();
		this.b = et.e(32);
		this.c = et.f();
		this.d = et.readUnsignedByte();
		if (this.b.equals("EntityHorse")) {
			this.e = et.readInt();
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.a);
		et.a(this.b);
		et.a(this.c);
		et.writeByte(this.d);
		if (this.b.equals("EntityHorse")) {
			et.writeInt(this.e);
		}
	}

	public int a() {
		return this.a;
	}

	public String b() {
		return this.b;
	}

	public fb c() {
		return this.c;
	}

	public int d() {
		return this.d;
	}

	public int e() {
		return this.e;
	}

	public boolean f() {
		return this.d > 0;
	}
}

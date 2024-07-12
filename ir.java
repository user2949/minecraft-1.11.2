import java.io.IOException;

public class ir implements fm<im> {
	private String a;
	private int b;
	private aay.b c;
	private boolean d;
	private int e;
	private sv f;

	public ir() {
	}

	public ir(String string, int integer2, aay.b b, boolean boolean4, int integer5, sv sv) {
		this.a = string;
		this.b = integer2;
		this.c = b;
		this.d = boolean4;
		this.e = integer5;
		this.f = sv;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(7);
		this.b = et.readByte();
		this.c = et.a(aay.b.class);
		this.d = et.readBoolean();
		this.e = et.readUnsignedByte();
		this.f = et.a(sv.class);
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.writeByte(this.b);
		et.a(this.c);
		et.writeBoolean(this.d);
		et.writeByte(this.e);
		et.a(this.f);
	}

	public void a(im im) {
		im.a(this);
	}

	public String a() {
		return this.a;
	}

	public aay.b c() {
		return this.c;
	}

	public boolean d() {
		return this.d;
	}

	public int e() {
		return this.e;
	}

	public sv f() {
		return this.f;
	}
}

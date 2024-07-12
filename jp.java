import java.io.IOException;

public class jp implements fm<jq> {
	private int a;
	private String b;
	private int c;
	private es d;

	public jp() {
	}

	public jp(int integer1, String string, int integer3, es es) {
		this.a = integer1;
		this.b = string;
		this.c = integer3;
		this.d = es;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.e(255);
		this.c = et.readUnsignedShort();
		this.d = es.a(et.g());
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
		et.writeShort(this.c);
		et.d(this.d.a());
	}

	public void a(jq jq) {
		jq.a(this);
	}

	public es a() {
		return this.d;
	}

	public int b() {
		return this.a;
	}
}

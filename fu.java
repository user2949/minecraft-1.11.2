import java.io.IOException;
import java.util.UUID;

public class fu implements fm<fp> {
	private int a;
	private UUID b;
	private co c;
	private cv d;
	private String e;

	public fu() {
	}

	public fu(zb zb) {
		this.a = zb.O();
		this.b = zb.be();
		this.c = zb.q();
		this.d = zb.b;
		this.e = zb.c.B;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.i();
		this.e = et.e(zb.a.A);
		this.c = et.e();
		this.d = cv.b(et.readUnsignedByte());
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
		et.a(this.e);
		et.a(this.c);
		et.writeByte(this.d.b());
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}

	public UUID b() {
		return this.b;
	}

	public co c() {
		return this.c;
	}

	public cv d() {
		return this.d;
	}

	public String e() {
		return this.e;
	}
}

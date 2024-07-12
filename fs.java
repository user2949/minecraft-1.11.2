import java.io.IOException;

public class fs implements fm<fp> {
	private int a;
	private double b;
	private double c;
	private double d;
	private int e;

	public fs() {
	}

	public fs(sn sn) {
		this.a = sn.O();
		this.b = sn.p;
		this.c = sn.q;
		this.d = sn.r;
		if (sn instanceof zg) {
			this.e = 1;
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.e = et.readByte();
		this.b = et.readDouble();
		this.c = et.readDouble();
		this.d = et.readDouble();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.writeByte(this.e);
		et.writeDouble(this.b);
		et.writeDouble(this.c);
		et.writeDouble(this.d);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}

	public double b() {
		return this.b;
	}

	public double c() {
		return this.c;
	}

	public double d() {
		return this.d;
	}

	public int e() {
		return this.e;
	}
}

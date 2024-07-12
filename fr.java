import java.io.IOException;

public class fr implements fm<fp> {
	private int a;
	private double b;
	private double c;
	private double d;
	private int e;

	public fr() {
	}

	public fr(st st) {
		this.a = st.O();
		this.b = st.p;
		this.c = st.q;
		this.d = st.r;
		this.e = st.j();
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.readDouble();
		this.c = et.readDouble();
		this.d = et.readDouble();
		this.e = et.readShort();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.writeDouble(this.b);
		et.writeDouble(this.c);
		et.writeDouble(this.d);
		et.writeShort(this.e);
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

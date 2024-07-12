import java.io.IOException;

public class hc implements fm<fp> {
	private double a;
	private double b;
	private double c;
	private float d;
	private float e;

	public hc() {
	}

	public hc(sn sn) {
		this.a = sn.p;
		this.b = sn.q;
		this.c = sn.r;
		this.d = sn.v;
		this.e = sn.w;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readDouble();
		this.b = et.readDouble();
		this.c = et.readDouble();
		this.d = et.readFloat();
		this.e = et.readFloat();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeDouble(this.a);
		et.writeDouble(this.b);
		et.writeDouble(this.c);
		et.writeFloat(this.d);
		et.writeFloat(this.e);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public double a() {
		return this.a;
	}

	public double b() {
		return this.b;
	}

	public double c() {
		return this.c;
	}

	public float d() {
		return this.d;
	}

	public float e() {
		return this.e;
	}
}

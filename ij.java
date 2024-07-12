import java.io.IOException;

public class ij implements fm<fp> {
	private int a;
	private double b;
	private double c;
	private double d;
	private byte e;
	private byte f;
	private boolean g;

	public ij() {
	}

	public ij(sn sn) {
		this.a = sn.O();
		this.b = sn.p;
		this.c = sn.q;
		this.d = sn.r;
		this.e = (byte)((int)(sn.v * 256.0F / 360.0F));
		this.f = (byte)((int)(sn.w * 256.0F / 360.0F));
		this.g = sn.z;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.readDouble();
		this.c = et.readDouble();
		this.d = et.readDouble();
		this.e = et.readByte();
		this.f = et.readByte();
		this.g = et.readBoolean();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.writeDouble(this.b);
		et.writeDouble(this.c);
		et.writeDouble(this.d);
		et.writeByte(this.e);
		et.writeByte(this.f);
		et.writeBoolean(this.g);
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

	public byte e() {
		return this.e;
	}

	public byte f() {
		return this.f;
	}

	public boolean g() {
		return this.g;
	}
}

import java.io.IOException;
import java.util.UUID;

public class fq implements fm<fp> {
	private int a;
	private UUID b;
	private double c;
	private double d;
	private double e;
	private int f;
	private int g;
	private int h;
	private int i;
	private int j;
	private int k;
	private int l;

	public fq() {
	}

	public fq(sn sn, int integer) {
		this(sn, integer, 0);
	}

	public fq(sn sn, int integer2, int integer3) {
		this.a = sn.O();
		this.b = sn.be();
		this.c = sn.p;
		this.d = sn.q;
		this.e = sn.r;
		this.i = ot.d(sn.w * 256.0F / 360.0F);
		this.j = ot.d(sn.v * 256.0F / 360.0F);
		this.k = integer2;
		this.l = integer3;
		double double5 = 3.9;
		this.f = (int)(ot.a(sn.s, -3.9, 3.9) * 8000.0);
		this.g = (int)(ot.a(sn.t, -3.9, 3.9) * 8000.0);
		this.h = (int)(ot.a(sn.u, -3.9, 3.9) * 8000.0);
	}

	public fq(sn sn, int integer2, int integer3, co co) {
		this(sn, integer2, integer3);
		this.c = (double)co.p();
		this.d = (double)co.q();
		this.e = (double)co.r();
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.i();
		this.k = et.readByte();
		this.c = et.readDouble();
		this.d = et.readDouble();
		this.e = et.readDouble();
		this.i = et.readByte();
		this.j = et.readByte();
		this.l = et.readInt();
		this.f = et.readShort();
		this.g = et.readShort();
		this.h = et.readShort();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
		et.writeByte(this.k);
		et.writeDouble(this.c);
		et.writeDouble(this.d);
		et.writeDouble(this.e);
		et.writeByte(this.i);
		et.writeByte(this.j);
		et.writeInt(this.l);
		et.writeShort(this.f);
		et.writeShort(this.g);
		et.writeShort(this.h);
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

	public double c() {
		return this.c;
	}

	public double d() {
		return this.d;
	}

	public double e() {
		return this.e;
	}

	public int f() {
		return this.f;
	}

	public int g() {
		return this.g;
	}

	public int h() {
		return this.h;
	}

	public int i() {
		return this.i;
	}

	public int j() {
		return this.j;
	}

	public int k() {
		return this.k;
	}

	public int l() {
		return this.l;
	}

	public void a(int integer) {
		this.f = integer;
	}

	public void b(int integer) {
		this.g = integer;
	}

	public void c(int integer) {
		this.h = integer;
	}

	public void d(int integer) {
		this.l = integer;
	}
}

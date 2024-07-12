import java.io.IOException;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ft implements fm<fp> {
	private int a;
	private UUID b;
	private int c;
	private double d;
	private double e;
	private double f;
	private int g;
	private int h;
	private int i;
	private byte j;
	private byte k;
	private byte l;
	private kn m;
	private List<kn.a<?>> n;

	public ft() {
	}

	public ft(sw sw) {
		this.a = sw.O();
		this.b = sw.be();
		this.c = sp.b.a(sw.getClass());
		this.d = sw.p;
		this.e = sw.q;
		this.f = sw.r;
		this.j = (byte)((int)(sw.v * 256.0F / 360.0F));
		this.k = (byte)((int)(sw.w * 256.0F / 360.0F));
		this.l = (byte)((int)(sw.aP * 256.0F / 360.0F));
		double double3 = 3.9;
		double double5 = sw.s;
		double double7 = sw.t;
		double double9 = sw.u;
		if (double5 < -3.9) {
			double5 = -3.9;
		}

		if (double7 < -3.9) {
			double7 = -3.9;
		}

		if (double9 < -3.9) {
			double9 = -3.9;
		}

		if (double5 > 3.9) {
			double5 = 3.9;
		}

		if (double7 > 3.9) {
			double7 = 3.9;
		}

		if (double9 > 3.9) {
			double9 = 3.9;
		}

		this.g = (int)(double5 * 8000.0);
		this.h = (int)(double7 * 8000.0);
		this.i = (int)(double9 * 8000.0);
		this.m = sw.R();
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.i();
		this.c = et.g();
		this.d = et.readDouble();
		this.e = et.readDouble();
		this.f = et.readDouble();
		this.j = et.readByte();
		this.k = et.readByte();
		this.l = et.readByte();
		this.g = et.readShort();
		this.h = et.readShort();
		this.i = et.readShort();
		this.n = kn.b(et);
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
		et.d(this.c);
		et.writeDouble(this.d);
		et.writeDouble(this.e);
		et.writeDouble(this.f);
		et.writeByte(this.j);
		et.writeByte(this.k);
		et.writeByte(this.l);
		et.writeShort(this.g);
		et.writeShort(this.h);
		et.writeShort(this.i);
		this.m.a(et);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Nullable
	public List<kn.a<?>> a() {
		return this.n;
	}

	public int b() {
		return this.a;
	}

	public UUID c() {
		return this.b;
	}

	public int d() {
		return this.c;
	}

	public double e() {
		return this.d;
	}

	public double f() {
		return this.e;
	}

	public double g() {
		return this.f;
	}

	public int h() {
		return this.g;
	}

	public int i() {
		return this.h;
	}

	public int j() {
		return this.i;
	}

	public byte k() {
		return this.j;
	}

	public byte l() {
		return this.k;
	}

	public byte m() {
		return this.l;
	}
}

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class fv implements fm<fp> {
	private int a;
	private UUID b;
	private double c;
	private double d;
	private double e;
	private byte f;
	private byte g;
	private kn h;
	private List<kn.a<?>> i;

	public fv() {
	}

	public fv(aay aay) {
		this.a = aay.O();
		this.b = aay.cS().getId();
		this.c = aay.p;
		this.d = aay.q;
		this.e = aay.r;
		this.f = (byte)((int)(aay.v * 256.0F / 360.0F));
		this.g = (byte)((int)(aay.w * 256.0F / 360.0F));
		this.h = aay.R();
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.i();
		this.c = et.readDouble();
		this.d = et.readDouble();
		this.e = et.readDouble();
		this.f = et.readByte();
		this.g = et.readByte();
		this.i = kn.b(et);
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
		et.writeDouble(this.c);
		et.writeDouble(this.d);
		et.writeDouble(this.e);
		et.writeByte(this.f);
		et.writeByte(this.g);
		this.h.a(et);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Nullable
	public List<kn.a<?>> a() {
		return this.i;
	}

	public int b() {
		return this.a;
	}

	public UUID c() {
		return this.b;
	}

	public double d() {
		return this.c;
	}

	public double e() {
		return this.d;
	}

	public double f() {
		return this.e;
	}

	public byte g() {
		return this.f;
	}

	public byte h() {
		return this.g;
	}
}

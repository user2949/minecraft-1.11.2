import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class gp implements fm<fp> {
	private String a;
	private no b;
	private int c;
	private int d = Integer.MAX_VALUE;
	private int e;
	private float f;
	private float g;

	public gp() {
	}

	public gp(String string, no no, double double3, double double4, double double5, float float6, float float7) {
		Validate.notNull(string, "name", new Object[0]);
		this.a = string;
		this.b = no;
		this.c = (int)(double3 * 8.0);
		this.d = (int)(double4 * 8.0);
		this.e = (int)(double5 * 8.0);
		this.f = float6;
		this.g = float7;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(256);
		this.b = et.a(no.class);
		this.c = et.readInt();
		this.d = et.readInt();
		this.e = et.readInt();
		this.f = et.readFloat();
		this.g = et.readFloat();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.a(this.b);
		et.writeInt(this.c);
		et.writeInt(this.d);
		et.writeInt(this.e);
		et.writeFloat(this.f);
		et.writeFloat(this.g);
	}

	public String a() {
		return this.a;
	}

	public no b() {
		return this.b;
	}

	public double c() {
		return (double)((float)this.c / 8.0F);
	}

	public double d() {
		return (double)((float)this.d / 8.0F);
	}

	public double e() {
		return (double)((float)this.e / 8.0F);
	}

	public float f() {
		return this.f;
	}

	public float g() {
		return this.g;
	}

	public void a(fp fp) {
		fp.a(this);
	}
}

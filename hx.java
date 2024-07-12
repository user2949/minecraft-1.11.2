import java.io.IOException;

public class hx implements fm<fp> {
	private float a;
	private int b;
	private float c;

	public hx() {
	}

	public hx(float float1, int integer, float float3) {
		this.a = float1;
		this.b = integer;
		this.c = float3;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readFloat();
		this.b = et.g();
		this.c = et.readFloat();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeFloat(this.a);
		et.d(this.b);
		et.writeFloat(this.c);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public float a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}

	public float c() {
		return this.c;
	}
}

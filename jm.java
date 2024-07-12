import java.io.IOException;

public class jm implements fm<im> {
	private co a;
	private cv b;
	private ri c;
	private float d;
	private float e;
	private float f;

	public jm() {
	}

	public jm(co co, cv cv, ri ri, float float4, float float5, float float6) {
		this.a = co;
		this.b = cv;
		this.c = ri;
		this.d = float4;
		this.e = float5;
		this.f = float6;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e();
		this.b = et.a(cv.class);
		this.c = et.a(ri.class);
		this.d = et.readFloat();
		this.e = et.readFloat();
		this.f = et.readFloat();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.a(this.b);
		et.a(this.c);
		et.writeFloat(this.d);
		et.writeFloat(this.e);
		et.writeFloat(this.f);
	}

	public void a(im im) {
		im.a(this);
	}

	public co a() {
		return this.a;
	}

	public cv b() {
		return this.b;
	}

	public ri c() {
		return this.c;
	}

	public float d() {
		return this.d;
	}

	public float e() {
		return this.e;
	}

	public float f() {
		return this.f;
	}
}

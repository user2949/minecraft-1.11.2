import java.io.IOException;

public class gx implements fm<fp> {
	private int a;
	private co b;
	private int c;
	private boolean d;

	public gx() {
	}

	public gx(int integer1, co co, int integer3, boolean boolean4) {
		this.a = integer1;
		this.b = co;
		this.c = integer3;
		this.d = boolean4;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readInt();
		this.b = et.e();
		this.c = et.readInt();
		this.d = et.readBoolean();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeInt(this.a);
		et.a(this.b);
		et.writeInt(this.c);
		et.writeBoolean(this.d);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public boolean a() {
		return this.d;
	}

	public int b() {
		return this.a;
	}

	public int c() {
		return this.c;
	}

	public co d() {
		return this.b;
	}
}

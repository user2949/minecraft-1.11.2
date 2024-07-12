import java.io.IOException;

public class he implements fm<fp> {
	private boolean a;
	private boolean b;
	private boolean c;
	private boolean d;
	private float e;
	private float f;

	public he() {
	}

	public he(aaw aaw) {
		this.a(aaw.a);
		this.b(aaw.b);
		this.c(aaw.c);
		this.d(aaw.d);
		this.a(aaw.a());
		this.b(aaw.b());
	}

	@Override
	public void a(et et) throws IOException {
		byte byte3 = et.readByte();
		this.a((byte3 & 1) > 0);
		this.b((byte3 & 2) > 0);
		this.c((byte3 & 4) > 0);
		this.d((byte3 & 8) > 0);
		this.a(et.readFloat());
		this.b(et.readFloat());
	}

	@Override
	public void b(et et) throws IOException {
		byte byte3 = 0;
		if (this.a()) {
			byte3 = (byte)(byte3 | 1);
		}

		if (this.b()) {
			byte3 = (byte)(byte3 | 2);
		}

		if (this.c()) {
			byte3 = (byte)(byte3 | 4);
		}

		if (this.d()) {
			byte3 = (byte)(byte3 | 8);
		}

		et.writeByte(byte3);
		et.writeFloat(this.e);
		et.writeFloat(this.f);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public boolean a() {
		return this.a;
	}

	public void a(boolean boolean1) {
		this.a = boolean1;
	}

	public boolean b() {
		return this.b;
	}

	public void b(boolean boolean1) {
		this.b = boolean1;
	}

	public boolean c() {
		return this.c;
	}

	public void c(boolean boolean1) {
		this.c = boolean1;
	}

	public boolean d() {
		return this.d;
	}

	public void d(boolean boolean1) {
		this.d = boolean1;
	}

	public float e() {
		return this.e;
	}

	public void a(float float1) {
		this.e = float1;
	}

	public float f() {
		return this.f;
	}

	public void b(float float1) {
		this.f = float1;
	}
}

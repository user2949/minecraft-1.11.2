import java.io.IOException;

public class jf implements fm<im> {
	private float a;
	private float b;
	private boolean c;
	private boolean d;

	public jf() {
	}

	public jf(float float1, float float2, boolean boolean3, boolean boolean4) {
		this.a = float1;
		this.b = float2;
		this.c = boolean3;
		this.d = boolean4;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readFloat();
		this.b = et.readFloat();
		byte byte3 = et.readByte();
		this.c = (byte3 & 1) > 0;
		this.d = (byte3 & 2) > 0;
	}

	@Override
	public void b(et et) throws IOException {
		et.writeFloat(this.a);
		et.writeFloat(this.b);
		byte byte3 = 0;
		if (this.c) {
			byte3 = (byte)(byte3 | 1);
		}

		if (this.d) {
			byte3 = (byte)(byte3 | 2);
		}

		et.writeByte(byte3);
	}

	public void a(im im) {
		im.a(this);
	}

	public float a() {
		return this.a;
	}

	public float b() {
		return this.b;
	}

	public boolean c() {
		return this.c;
	}

	public boolean d() {
		return this.d;
	}
}

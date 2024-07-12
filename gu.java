import java.io.IOException;

public class gu implements fm<fp> {
	public static final String[] a = new String[]{"tile.bed.notValid"};
	private int b;
	private float c;

	public gu() {
	}

	public gu(int integer, float float2) {
		this.b = integer;
		this.c = float2;
	}

	@Override
	public void a(et et) throws IOException {
		this.b = et.readUnsignedByte();
		this.c = et.readFloat();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeByte(this.b);
		et.writeFloat(this.c);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.b;
	}

	public float b() {
		return this.c;
	}
}

import java.io.IOException;

public class ga implements fm<fp> {
	private co a;
	private int b;
	private int c;
	private alu d;

	public ga() {
	}

	public ga(co co, alu alu, int integer3, int integer4) {
		this.a = co;
		this.b = integer3;
		this.c = integer4;
		this.d = alu;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e();
		this.b = et.readUnsignedByte();
		this.c = et.readUnsignedByte();
		this.d = alu.b(et.g() & 4095);
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.writeByte(this.b);
		et.writeByte(this.c);
		et.d(alu.a(this.d) & 4095);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public co a() {
		return this.a;
	}

	public int b() {
		return this.b;
	}

	public int c() {
		return this.c;
	}

	public alu d() {
		return this.d;
	}
}

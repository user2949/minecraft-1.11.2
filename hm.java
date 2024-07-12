import java.io.IOException;

public class hm implements fm<fp> {
	private int a;
	private rg b;
	private ajq c;
	private ajx d;

	public hm() {
	}

	public hm(int integer, rg rg, ajx ajx, ajq ajq) {
		this.a = integer;
		this.b = rg;
		this.c = ajq;
		this.d = ajx;
	}

	public void a(fp fp) {
		fp.a(this);
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readInt();
		this.b = rg.a(et.readUnsignedByte());
		this.c = ajq.a(et.readUnsignedByte());
		this.d = ajx.a(et.e(16));
		if (this.d == null) {
			this.d = ajx.b;
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.writeInt(this.a);
		et.writeByte(this.b.a());
		et.writeByte(this.c.a());
		et.a(this.d.a());
	}

	public int a() {
		return this.a;
	}

	public rg b() {
		return this.b;
	}

	public ajq c() {
		return this.c;
	}

	public ajx d() {
		return this.d;
	}
}

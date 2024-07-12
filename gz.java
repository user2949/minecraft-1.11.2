import java.io.IOException;

public class gz implements fm<fp> {
	private int a;
	private boolean b;
	private ajq c;
	private int d;
	private rg e;
	private int f;
	private ajx g;
	private boolean h;

	public gz() {
	}

	public gz(int integer1, ajq ajq, boolean boolean3, int integer4, rg rg, int integer6, ajx ajx, boolean boolean8) {
		this.a = integer1;
		this.d = integer4;
		this.e = rg;
		this.c = ajq;
		this.f = integer6;
		this.b = boolean3;
		this.g = ajx;
		this.h = boolean8;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readInt();
		int integer3 = et.readUnsignedByte();
		this.b = (integer3 & 8) == 8;
		integer3 &= -9;
		this.c = ajq.a(integer3);
		this.d = et.readInt();
		this.e = rg.a(et.readUnsignedByte());
		this.f = et.readUnsignedByte();
		this.g = ajx.a(et.e(16));
		if (this.g == null) {
			this.g = ajx.b;
		}

		this.h = et.readBoolean();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeInt(this.a);
		int integer3 = this.c.a();
		if (this.b) {
			integer3 |= 8;
		}

		et.writeByte(integer3);
		et.writeInt(this.d);
		et.writeByte(this.e.a());
		et.writeByte(this.f);
		et.a(this.g.a());
		et.writeBoolean(this.h);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}

	public boolean b() {
		return this.b;
	}

	public ajq c() {
		return this.c;
	}

	public int d() {
		return this.d;
	}

	public rg e() {
		return this.e;
	}

	public int f() {
		return this.f;
	}

	public ajx g() {
		return this.g;
	}

	public boolean h() {
		return this.h;
	}
}

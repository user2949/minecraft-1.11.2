import java.io.IOException;

public class hb implements fm<fp> {
	protected int a;
	protected int b;
	protected int c;
	protected int d;
	protected byte e;
	protected byte f;
	protected boolean g;
	protected boolean h;

	public hb() {
	}

	public hb(int integer) {
		this.a = integer;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public String toString() {
		return "Entity_" + super.toString();
	}

	public sn a(ajs ajs) {
		return ajs.a(this.a);
	}

	public int a() {
		return this.b;
	}

	public int b() {
		return this.c;
	}

	public int c() {
		return this.d;
	}

	public byte d() {
		return this.e;
	}

	public byte e() {
		return this.f;
	}

	public boolean f() {
		return this.h;
	}

	public boolean g() {
		return this.g;
	}

	public static class a extends hb {
		public a() {
		}

		public a(int integer, long long2, long long3, long long4, boolean boolean5) {
			super(integer);
			this.b = (int)long2;
			this.c = (int)long3;
			this.d = (int)long4;
			this.g = boolean5;
		}

		@Override
		public void a(et et) throws IOException {
			super.a(et);
			this.b = et.readShort();
			this.c = et.readShort();
			this.d = et.readShort();
			this.g = et.readBoolean();
		}

		@Override
		public void b(et et) throws IOException {
			super.b(et);
			et.writeShort(this.b);
			et.writeShort(this.c);
			et.writeShort(this.d);
			et.writeBoolean(this.g);
		}
	}

	public static class b extends hb {
		public b() {
			this.h = true;
		}

		public b(int integer, long long2, long long3, long long4, byte byte5, byte byte6, boolean boolean7) {
			super(integer);
			this.b = (int)long2;
			this.c = (int)long3;
			this.d = (int)long4;
			this.e = byte5;
			this.f = byte6;
			this.g = boolean7;
			this.h = true;
		}

		@Override
		public void a(et et) throws IOException {
			super.a(et);
			this.b = et.readShort();
			this.c = et.readShort();
			this.d = et.readShort();
			this.e = et.readByte();
			this.f = et.readByte();
			this.g = et.readBoolean();
		}

		@Override
		public void b(et et) throws IOException {
			super.b(et);
			et.writeShort(this.b);
			et.writeShort(this.c);
			et.writeShort(this.d);
			et.writeByte(this.e);
			et.writeByte(this.f);
			et.writeBoolean(this.g);
		}
	}

	public static class c extends hb {
		public c() {
			this.h = true;
		}

		public c(int integer, byte byte2, byte byte3, boolean boolean4) {
			super(integer);
			this.e = byte2;
			this.f = byte3;
			this.h = true;
			this.g = boolean4;
		}

		@Override
		public void a(et et) throws IOException {
			super.a(et);
			this.e = et.readByte();
			this.f = et.readByte();
			this.g = et.readBoolean();
		}

		@Override
		public void b(et et) throws IOException {
			super.b(et);
			et.writeByte(this.e);
			et.writeByte(this.f);
			et.writeBoolean(this.g);
		}
	}
}

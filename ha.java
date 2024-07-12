import java.io.IOException;
import java.util.Collection;

public class ha implements fm<fp> {
	private int a;
	private byte b;
	private boolean c;
	private bbm[] d;
	private int e;
	private int f;
	private int g;
	private int h;
	private byte[] i;

	public ha() {
	}

	public ha(int integer1, byte byte2, boolean boolean3, Collection<bbm> collection, byte[] arr, int integer6, int integer7, int integer8, int integer9) {
		this.a = integer1;
		this.b = byte2;
		this.c = boolean3;
		this.d = (bbm[])collection.toArray(new bbm[collection.size()]);
		this.e = integer6;
		this.f = integer7;
		this.g = integer8;
		this.h = integer9;
		this.i = new byte[integer8 * integer9];

		for (int integer11 = 0; integer11 < integer8; integer11++) {
			for (int integer12 = 0; integer12 < integer9; integer12++) {
				this.i[integer11 + integer12 * integer8] = arr[integer6 + integer11 + (integer7 + integer12) * 128];
			}
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.readByte();
		this.c = et.readBoolean();
		this.d = new bbm[et.g()];

		for (int integer3 = 0; integer3 < this.d.length; integer3++) {
			short short4 = (short)et.readByte();
			this.d[integer3] = new bbm(bbm.a.a((byte)(short4 >> 4 & 15)), et.readByte(), et.readByte(), (byte)(short4 & 15));
		}

		this.g = et.readUnsignedByte();
		if (this.g > 0) {
			this.h = et.readUnsignedByte();
			this.e = et.readUnsignedByte();
			this.f = et.readUnsignedByte();
			this.i = et.a();
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.writeByte(this.b);
		et.writeBoolean(this.c);
		et.d(this.d.length);

		for (bbm bbm6 : this.d) {
			et.writeByte((bbm6.a() & 15) << 4 | bbm6.e() & 15);
			et.writeByte(bbm6.c());
			et.writeByte(bbm6.d());
		}

		et.writeByte(this.g);
		if (this.g > 0) {
			et.writeByte(this.h);
			et.writeByte(this.e);
			et.writeByte(this.f);
			et.a(this.i);
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public int a() {
		return this.a;
	}

	public void a(bbn bbn) {
		bbn.g = this.b;
		bbn.e = this.c;
		bbn.j.clear();

		for (int integer3 = 0; integer3 < this.d.length; integer3++) {
			bbm bbm4 = this.d[integer3];
			bbn.j.put("icon-" + integer3, bbm4);
		}

		for (int integer3 = 0; integer3 < this.g; integer3++) {
			for (int integer4 = 0; integer4 < this.h; integer4++) {
				bbn.h[this.e + integer3 + (this.f + integer4) * 128] = this.i[integer3 + integer4 * this.g];
			}
		}
	}
}

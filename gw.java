import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

public class gw implements fm<fp> {
	private int a;
	private int b;
	private int c;
	private byte[] d;
	private List<du> e;
	private boolean f;

	public gw() {
	}

	public gw(auo auo, int integer) {
		this.a = auo.b;
		this.b = auo.c;
		this.f = integer == 65535;
		boolean boolean4 = auo.q().s.m();
		this.d = new byte[this.a(auo, boolean4, integer)];
		this.c = this.a(new et(this.g()), auo, boolean4, integer);
		this.e = Lists.newArrayList();

		for (Entry<co, asc> entry6 : auo.s().entrySet()) {
			co co7 = (co)entry6.getKey();
			asc asc8 = (asc)entry6.getValue();
			int integer9 = co7.q() >> 4;
			if (this.e() || (integer & 1 << integer9) != 0) {
				du du10 = asc8.d();
				this.e.add(du10);
			}
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.readInt();
		this.b = et.readInt();
		this.f = et.readBoolean();
		this.c = et.g();
		int integer3 = et.g();
		if (integer3 > 2097152) {
			throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
		} else {
			this.d = new byte[integer3];
			et.readBytes(this.d);
			int integer4 = et.g();
			this.e = Lists.newArrayList();

			for (int integer5 = 0; integer5 < integer4; integer5++) {
				this.e.add(et.j());
			}
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.writeInt(this.a);
		et.writeInt(this.b);
		et.writeBoolean(this.f);
		et.d(this.c);
		et.d(this.d.length);
		et.writeBytes(this.d);
		et.d(this.e.size());

		for (du du4 : this.e) {
			et.a(du4);
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public et a() {
		return new et(Unpooled.wrappedBuffer(this.d));
	}

	private ByteBuf g() {
		ByteBuf byteBuf2 = Unpooled.wrappedBuffer(this.d);
		byteBuf2.writerIndex(0);
		return byteBuf2;
	}

	public int a(et et, auo auo, boolean boolean3, int integer) {
		int integer6 = 0;
		aup[] arr7 = auo.h();
		int integer8 = 0;

		for (int integer9 = arr7.length; integer8 < integer9; integer8++) {
			aup aup10 = arr7[integer8];
			if (aup10 != auo.a && (!this.e() || !aup10.a()) && (integer & 1 << integer8) != 0) {
				integer6 |= 1 << integer8;
				aup10.g().b(et);
				et.writeBytes(aup10.h().a());
				if (boolean3) {
					et.writeBytes(aup10.i().a());
				}
			}
		}

		if (this.e()) {
			et.writeBytes(auo.l());
		}

		return integer6;
	}

	protected int a(auo auo, boolean boolean2, int integer) {
		int integer5 = 0;
		aup[] arr6 = auo.h();
		int integer7 = 0;

		for (int integer8 = arr6.length; integer7 < integer8; integer7++) {
			aup aup9 = arr6[integer7];
			if (aup9 != auo.a && (!this.e() || !aup9.a()) && (integer & 1 << integer7) != 0) {
				integer5 += aup9.g().a();
				integer5 += aup9.h().a().length;
				if (boolean2) {
					integer5 += aup9.i().a().length;
				}
			}
		}

		if (this.e()) {
			integer5 += auo.l().length;
		}

		return integer5;
	}

	public int b() {
		return this.a;
	}

	public int c() {
		return this.b;
	}

	public int d() {
		return this.c;
	}

	public boolean e() {
		return this.f;
	}

	public List<du> f() {
		return this.e;
	}
}

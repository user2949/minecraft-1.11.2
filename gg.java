import java.io.IOException;

public class gg implements fm<fp> {
	private ajl a;
	private gg.a[] b;

	public gg() {
	}

	public gg(int integer, short[] arr, auo auo) {
		this.a = new ajl(auo.b, auo.c);
		this.b = new gg.a[integer];

		for (int integer5 = 0; integer5 < this.b.length; integer5++) {
			this.b[integer5] = new gg.a(arr[integer5], auo);
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = new ajl(et.readInt(), et.readInt());
		this.b = new gg.a[et.g()];

		for (int integer3 = 0; integer3 < this.b.length; integer3++) {
			this.b[integer3] = new gg.a(et.readShort(), alu.i.a(et.g()));
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.writeInt(this.a.a);
		et.writeInt(this.a.b);
		et.d(this.b.length);

		for (gg.a a6 : this.b) {
			et.writeShort(a6.b());
			et.d(alu.i.a(a6.c()));
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public gg.a[] a() {
		return this.b;
	}

	public class a {
		private final short b;
		private final atl c;

		public a(short short2, atl atl) {
			this.b = short2;
			this.c = atl;
		}

		public a(short short2, auo auo) {
			this.b = short2;
			this.c = auo.a(this.a());
		}

		public co a() {
			return new co(gg.this.a.a(this.b >> 12 & 15, this.b & 255, this.b >> 8 & 15));
		}

		public short b() {
			return this.b;
		}

		public atl c() {
			return this.c;
		}
	}
}

import javax.annotation.Nullable;

public class auh implements aut {
	private static final aus d = new aum();
	protected static final atl a = alv.a.t();
	protected oe b;
	protected aus c;
	private int e;

	public auh() {
		this.b(4);
	}

	private static int b(int integer1, int integer2, int integer3) {
		return integer2 << 8 | integer3 << 4 | integer1;
	}

	private void b(int integer) {
		if (integer != this.e) {
			this.e = integer;
			if (this.e <= 4) {
				this.e = 4;
				this.c = new auq(this.e, this);
			} else if (this.e <= 8) {
				this.c = new aun(this.e, this);
			} else {
				this.c = d;
				this.e = ot.d(alu.i.a());
			}

			this.c.a(a);
			this.b = new oe(this.e, 4096);
		}
	}

	@Override
	public int a(int integer, atl atl) {
		oe oe4 = this.b;
		aus aus5 = this.c;
		this.b(integer);

		for (int integer6 = 0; integer6 < oe4.b(); integer6++) {
			atl atl7 = aus5.a(oe4.a(integer6));
			if (atl7 != null) {
				this.b(integer6, atl7);
			}
		}

		return this.c.a(atl);
	}

	public void a(int integer1, int integer2, int integer3, atl atl) {
		this.b(b(integer1, integer2, integer3), atl);
	}

	protected void b(int integer, atl atl) {
		int integer4 = this.c.a(atl);
		this.b.a(integer, integer4);
	}

	public atl a(int integer1, int integer2, int integer3) {
		return this.a(b(integer1, integer2, integer3));
	}

	protected atl a(int integer) {
		atl atl3 = this.c.a(this.b.a(integer));
		return atl3 == null ? a : atl3;
	}

	public void a(et et) {
		int integer3 = et.readByte();
		if (this.e != integer3) {
			this.b(integer3);
		}

		this.c.a(et);
		et.b(this.b.a());
	}

	public void b(et et) {
		et.writeByte(this.e);
		this.c.b(et);
		et.a(this.b.a());
	}

	@Nullable
	public auk a(byte[] arr, auk auk) {
		auk auk4 = null;

		for (int integer5 = 0; integer5 < 4096; integer5++) {
			int integer6 = alu.i.a(this.a(integer5));
			int integer7 = integer5 & 15;
			int integer8 = integer5 >> 8 & 15;
			int integer9 = integer5 >> 4 & 15;
			if ((integer6 >> 12 & 15) != 0) {
				if (auk4 == null) {
					auk4 = new auk();
				}

				auk4.a(integer7, integer8, integer9, integer6 >> 12 & 15);
			}

			arr[integer5] = (byte)(integer6 >> 4 & 0xFF);
			auk.a(integer7, integer8, integer9, integer6 & 15);
		}

		return auk4;
	}

	public void a(byte[] arr, auk auk2, @Nullable auk auk3) {
		for (int integer5 = 0; integer5 < 4096; integer5++) {
			int integer6 = integer5 & 15;
			int integer7 = integer5 >> 8 & 15;
			int integer8 = integer5 >> 4 & 15;
			int integer9 = auk3 == null ? 0 : auk3.a(integer6, integer7, integer8);
			int integer10 = integer9 << 12 | (arr[integer5] & 255) << 4 | auk2.a(integer6, integer7, integer8);
			this.b(integer5, alu.i.a(integer10));
		}
	}

	public int a() {
		return 1 + this.c.a() + et.a(this.b.b()) + this.b.a().length * 8;
	}
}

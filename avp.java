public class avp {
	private static final atl a = alv.a.t();
	private final char[] b = new char[65536];

	public atl a(int integer1, int integer2, int integer3) {
		atl atl5 = alu.i.a(this.b[b(integer1, integer2, integer3)]);
		return atl5 == null ? a : atl5;
	}

	public void a(int integer1, int integer2, int integer3, atl atl) {
		this.b[b(integer1, integer2, integer3)] = (char)alu.i.a(atl);
	}

	private static int b(int integer1, int integer2, int integer3) {
		return integer1 << 12 | integer3 << 8 | integer2;
	}

	public int a(int integer1, int integer2) {
		int integer4 = (integer1 << 12 | integer2 << 8) + 256 - 1;

		for (int integer5 = 255; integer5 >= 0; integer5--) {
			atl atl6 = alu.i.a(this.b[integer4 + integer5]);
			if (atl6 != null && atl6 != a) {
				return integer5;
			}
		}

		return 0;
	}
}

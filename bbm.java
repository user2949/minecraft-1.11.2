public class bbm {
	private final bbm.a a;
	private byte b;
	private byte c;
	private byte d;

	public bbm(bbm.a a, byte byte2, byte byte3, byte byte4) {
		this.a = a;
		this.b = byte2;
		this.c = byte3;
		this.d = byte4;
	}

	public byte a() {
		return this.a.a();
	}

	public bbm.a b() {
		return this.a;
	}

	public byte c() {
		return this.b;
	}

	public byte d() {
		return this.c;
	}

	public byte e() {
		return this.d;
	}

	public boolean f() {
		return this.a.b();
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof bbm)) {
			return false;
		} else {
			bbm bbm3 = (bbm)object;
			if (this.a != bbm3.a) {
				return false;
			} else if (this.d != bbm3.d) {
				return false;
			} else {
				return this.b != bbm3.b ? false : this.c == bbm3.c;
			}
		}
	}

	public int hashCode() {
		int integer2 = this.a.a();
		integer2 = 31 * integer2 + this.b;
		integer2 = 31 * integer2 + this.c;
		return 31 * integer2 + this.d;
	}

	public static enum a {
		PLAYER(false),
		FRAME(true),
		RED_MARKER(false),
		BLUE_MARKER(false),
		TARGET_X(true),
		TARGET_POINT(true),
		PLAYER_OFF_MAP(false),
		PLAYER_OFF_LIMITS(false),
		MANSION(true, 5393476),
		MONUMENT(true, 3830373);

		private final byte k = (byte)this.ordinal();
		private final boolean l;
		private final int m;

		private a(boolean boolean3) {
			this(boolean3, -1);
		}

		private a(boolean boolean3, int integer4) {
			this.l = boolean3;
			this.m = integer4;
		}

		public byte a() {
			return this.k;
		}

		public boolean b() {
			return this.l;
		}

		public boolean c() {
			return this.m >= 0;
		}

		public int d() {
			return this.m;
		}

		public static bbm.a a(byte byte1) {
			return values()[byte1];
		}
	}
}

public class auk {
	private final byte[] a;

	public auk() {
		this.a = new byte[2048];
	}

	public auk(byte[] arr) {
		this.a = arr;
		if (arr.length != 2048) {
			throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + arr.length);
		}
	}

	public int a(int integer1, int integer2, int integer3) {
		return this.a(this.b(integer1, integer2, integer3));
	}

	public void a(int integer1, int integer2, int integer3, int integer4) {
		this.a(this.b(integer1, integer2, integer3), integer4);
	}

	private int b(int integer1, int integer2, int integer3) {
		return integer2 << 8 | integer3 << 4 | integer1;
	}

	public int a(int integer) {
		int integer3 = this.c(integer);
		return this.b(integer) ? this.a[integer3] & 15 : this.a[integer3] >> 4 & 15;
	}

	public void a(int integer1, int integer2) {
		int integer4 = this.c(integer1);
		if (this.b(integer1)) {
			this.a[integer4] = (byte)(this.a[integer4] & 240 | integer2 & 15);
		} else {
			this.a[integer4] = (byte)(this.a[integer4] & 15 | (integer2 & 15) << 4);
		}
	}

	private boolean b(int integer) {
		return (integer & 1) == 0;
	}

	private int c(int integer) {
		return integer >> 1;
	}

	public byte[] a() {
		return this.a;
	}
}

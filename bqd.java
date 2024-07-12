public enum bqd {
	DOWN(new bqd.b(bqd.a.f, bqd.a.e, bqd.a.a), new bqd.b(bqd.a.f, bqd.a.e, bqd.a.d), new bqd.b(bqd.a.c, bqd.a.e, bqd.a.d), new bqd.b(bqd.a.c, bqd.a.e, bqd.a.a)),
	UP(new bqd.b(bqd.a.f, bqd.a.b, bqd.a.d), new bqd.b(bqd.a.f, bqd.a.b, bqd.a.a), new bqd.b(bqd.a.c, bqd.a.b, bqd.a.a), new bqd.b(bqd.a.c, bqd.a.b, bqd.a.d)),
	NORTH(new bqd.b(bqd.a.c, bqd.a.b, bqd.a.d), new bqd.b(bqd.a.c, bqd.a.e, bqd.a.d), new bqd.b(bqd.a.f, bqd.a.e, bqd.a.d), new bqd.b(bqd.a.f, bqd.a.b, bqd.a.d)),
	SOUTH(new bqd.b(bqd.a.f, bqd.a.b, bqd.a.a), new bqd.b(bqd.a.f, bqd.a.e, bqd.a.a), new bqd.b(bqd.a.c, bqd.a.e, bqd.a.a), new bqd.b(bqd.a.c, bqd.a.b, bqd.a.a)),
	WEST(new bqd.b(bqd.a.f, bqd.a.b, bqd.a.d), new bqd.b(bqd.a.f, bqd.a.e, bqd.a.d), new bqd.b(bqd.a.f, bqd.a.e, bqd.a.a), new bqd.b(bqd.a.f, bqd.a.b, bqd.a.a)),
	EAST(new bqd.b(bqd.a.c, bqd.a.b, bqd.a.a), new bqd.b(bqd.a.c, bqd.a.e, bqd.a.a), new bqd.b(bqd.a.c, bqd.a.e, bqd.a.d), new bqd.b(bqd.a.c, bqd.a.b, bqd.a.d));

	private static final bqd[] g = new bqd[6];
	private final bqd.b[] h;

	public static bqd a(cv cv) {
		return g[cv.a()];
	}

	private bqd(bqd.b... arr) {
		this.h = arr;
	}

	public bqd.b a(int integer) {
		return this.h[integer];
	}

	static {
		g[bqd.a.e] = DOWN;
		g[bqd.a.b] = UP;
		g[bqd.a.d] = NORTH;
		g[bqd.a.a] = SOUTH;
		g[bqd.a.f] = WEST;
		g[bqd.a.c] = EAST;
	}

	public static final class a {
		public static final int a = cv.SOUTH.a();
		public static final int b = cv.UP.a();
		public static final int c = cv.EAST.a();
		public static final int d = cv.NORTH.a();
		public static final int e = cv.DOWN.a();
		public static final int f = cv.WEST.a();
	}

	public static class b {
		public final int a;
		public final int b;
		public final int c;

		private b(int integer1, int integer2, int integer3) {
			this.a = integer1;
			this.b = integer2;
			this.c = integer3;
		}
	}
}

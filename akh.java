public class akh {
	private static final akh.a a = new akh.a() {
		@Override
		public int a(akf akf, co co) {
			return akf.b(co);
		}
	};
	private static final akh.a b = new akh.a() {
		@Override
		public int a(akf akf, co co) {
			return akf.c(co);
		}
	};
	private static final akh.a c = new akh.a() {
		@Override
		public int a(akf akf, co co) {
			return akf.o();
		}
	};

	private static int a(ajw ajw, co co, akh.a a) {
		int integer4 = 0;
		int integer5 = 0;
		int integer6 = 0;

		for (co.a a8 : co.b(co.a(-1, 0, -1), co.a(1, 0, 1))) {
			int integer9 = a.a(ajw.b(a8), a8);
			integer4 += (integer9 & 0xFF0000) >> 16;
			integer5 += (integer9 & 0xFF00) >> 8;
			integer6 += integer9 & 0xFF;
		}

		return (integer4 / 9 & 0xFF) << 16 | (integer5 / 9 & 0xFF) << 8 | integer6 / 9 & 0xFF;
	}

	public static int a(ajw ajw, co co) {
		return a(ajw, co, a);
	}

	public static int b(ajw ajw, co co) {
		return a(ajw, co, b);
	}

	public static int c(ajw ajw, co co) {
		return a(ajw, co, c);
	}

	interface a {
		int a(akf akf, co co);
	}
}

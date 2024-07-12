public enum aem implements ox {
	WHITE(0, 15, "white", "white", azt.j, a.WHITE),
	ORANGE(1, 14, "orange", "orange", azt.q, a.GOLD),
	MAGENTA(2, 13, "magenta", "magenta", azt.r, a.AQUA),
	LIGHT_BLUE(3, 12, "light_blue", "lightBlue", azt.s, a.BLUE),
	YELLOW(4, 11, "yellow", "yellow", azt.t, a.YELLOW),
	LIME(5, 10, "lime", "lime", azt.u, a.GREEN),
	PINK(6, 9, "pink", "pink", azt.v, a.LIGHT_PURPLE),
	GRAY(7, 8, "gray", "gray", azt.w, a.DARK_GRAY),
	SILVER(8, 7, "silver", "silver", azt.x, a.GRAY),
	CYAN(9, 6, "cyan", "cyan", azt.y, a.DARK_AQUA),
	PURPLE(10, 5, "purple", "purple", azt.z, a.DARK_PURPLE),
	BLUE(11, 4, "blue", "blue", azt.A, a.DARK_BLUE),
	BROWN(12, 3, "brown", "brown", azt.B, a.GOLD),
	GREEN(13, 2, "green", "green", azt.C, a.DARK_GREEN),
	RED(14, 1, "red", "red", azt.D, a.DARK_RED),
	BLACK(15, 0, "black", "black", azt.E, a.BLACK);

	private static final aem[] q = new aem[values().length];
	private static final aem[] r = new aem[values().length];
	private final int s;
	private final int t;
	private final String u;
	private final String v;
	private final azt w;
	private final a x;

	private aem(int integer3, int integer4, String string5, String string6, azt azt, a a) {
		this.s = integer3;
		this.t = integer4;
		this.u = string5;
		this.v = string6;
		this.w = azt;
		this.x = a;
	}

	public int a() {
		return this.s;
	}

	public int b() {
		return this.t;
	}

	public String d() {
		return this.v;
	}

	public azt e() {
		return this.w;
	}

	public static aem a(int integer) {
		if (integer < 0 || integer >= r.length) {
			integer = 0;
		}

		return r[integer];
	}

	public static aem b(int integer) {
		if (integer < 0 || integer >= q.length) {
			integer = 0;
		}

		return q[integer];
	}

	public String toString() {
		return this.v;
	}

	@Override
	public String m() {
		return this.u;
	}

	static {
		for (aem aem4 : values()) {
			q[aem4.a()] = aem4;
			r[aem4.b()] = aem4;
		}
	}
}

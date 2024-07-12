public enum ss {
	MAINHAND(ss.a.HAND, 0, 0, "mainhand"),
	OFFHAND(ss.a.HAND, 1, 5, "offhand"),
	FEET(ss.a.ARMOR, 0, 1, "feet"),
	LEGS(ss.a.ARMOR, 1, 2, "legs"),
	CHEST(ss.a.ARMOR, 2, 3, "chest"),
	HEAD(ss.a.ARMOR, 3, 4, "head");

	private final ss.a g;
	private final int h;
	private final int i;
	private final String j;

	private ss(ss.a a, int integer4, int integer5, String string6) {
		this.g = a;
		this.h = integer4;
		this.i = integer5;
		this.j = string6;
	}

	public ss.a a() {
		return this.g;
	}

	public int b() {
		return this.h;
	}

	public int c() {
		return this.i;
	}

	public String d() {
		return this.j;
	}

	public static ss a(String string) {
		for (ss ss5 : values()) {
			if (ss5.d().equals(string)) {
				return ss5;
			}
		}

		throw new IllegalArgumentException("Invalid slot '" + string + "'");
	}

	public static enum a {
		HAND,
		ARMOR;
	}
}

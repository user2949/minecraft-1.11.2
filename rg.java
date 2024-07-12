public enum rg {
	PEACEFUL(0, "options.difficulty.peaceful"),
	EASY(1, "options.difficulty.easy"),
	NORMAL(2, "options.difficulty.normal"),
	HARD(3, "options.difficulty.hard");

	private static final rg[] e = new rg[values().length];
	private final int f;
	private final String g;

	private rg(int integer3, String string4) {
		this.f = integer3;
		this.g = string4;
	}

	public int a() {
		return this.f;
	}

	public static rg a(int integer) {
		return e[integer % e.length];
	}

	public String b() {
		return this.g;
	}

	static {
		for (rg rg4 : values()) {
			e[rg4.f] = rg4;
		}
	}
}

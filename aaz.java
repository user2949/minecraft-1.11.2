public enum aaz {
	CAPE(0, "cape"),
	JACKET(1, "jacket"),
	LEFT_SLEEVE(2, "left_sleeve"),
	RIGHT_SLEEVE(3, "right_sleeve"),
	LEFT_PANTS_LEG(4, "left_pants_leg"),
	RIGHT_PANTS_LEG(5, "right_pants_leg"),
	HAT(6, "hat");

	private final int h;
	private final int i;
	private final String j;
	private final fb k;

	private aaz(int integer3, String string4) {
		this.h = integer3;
		this.i = 1 << integer3;
		this.j = string4;
		this.k = new fi("options.modelPart." + string4);
	}

	public int a() {
		return this.i;
	}

	public int b() {
		return this.h;
	}

	public String c() {
		return this.j;
	}

	public fb d() {
		return this.k;
	}
}

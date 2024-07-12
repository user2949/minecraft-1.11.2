public enum ajk {
	SOLID("Solid"),
	CUTOUT_MIPPED("Mipped Cutout"),
	CUTOUT("Cutout"),
	TRANSLUCENT("Translucent");

	private final String e;

	private ajk(String string3) {
		this.e = string3;
	}

	public String toString() {
		return this.e;
	}
}

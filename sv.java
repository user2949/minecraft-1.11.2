public enum sv {
	LEFT(new fi("options.mainHand.left")),
	RIGHT(new fi("options.mainHand.right"));

	private final fb c;

	private sv(fb fb) {
		this.c = fb;
	}

	public sv a() {
		return this == LEFT ? RIGHT : LEFT;
	}

	public String toString() {
		return this.c.c();
	}
}

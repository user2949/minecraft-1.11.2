public enum ajq {
	NOT_SET(-1, "", ""),
	SURVIVAL(0, "survival", "s"),
	CREATIVE(1, "creative", "c"),
	ADVENTURE(2, "adventure", "a"),
	SPECTATOR(3, "spectator", "sp");

	int f;
	String g;
	String h;

	private ajq(int integer3, String string4, String string5) {
		this.f = integer3;
		this.g = string4;
		this.h = string5;
	}

	public int a() {
		return this.f;
	}

	public String b() {
		return this.g;
	}

	public void a(aaw aaw) {
		if (this == CREATIVE) {
			aaw.c = true;
			aaw.d = true;
			aaw.a = true;
		} else if (this == SPECTATOR) {
			aaw.c = true;
			aaw.d = false;
			aaw.a = true;
			aaw.b = true;
		} else {
			aaw.c = false;
			aaw.d = false;
			aaw.a = false;
			aaw.b = false;
		}

		aaw.e = !this.c();
	}

	public boolean c() {
		return this == ADVENTURE || this == SPECTATOR;
	}

	public boolean d() {
		return this == CREATIVE;
	}

	public boolean e() {
		return this == SURVIVAL || this == ADVENTURE;
	}

	public static ajq a(int integer) {
		return a(integer, SURVIVAL);
	}

	public static ajq a(int integer, ajq ajq) {
		for (ajq ajq6 : values()) {
			if (ajq6.f == integer) {
				return ajq6;
			}
		}

		return ajq;
	}

	public static ajq a(String string) {
		return a(string, SURVIVAL);
	}

	public static ajq a(String string, ajq ajq) {
		for (ajq ajq6 : values()) {
			if (ajq6.g.equals(string) || ajq6.h.equals(string)) {
				return ajq6;
			}
		}

		return ajq;
	}
}

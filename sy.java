public enum sy {
	MONSTER(zt.class, 70, azs.a, false, false),
	CREATURE(ww.class, 10, azs.a, true, true),
	AMBIENT(wt.class, 15, azs.a, true, false),
	WATER_CREATURE(xj.class, 5, azs.h, true, false);

	private final Class<? extends sm> e;
	private final int f;
	private final azs g;
	private final boolean h;
	private final boolean i;

	private sy(Class<? extends sm> class3, int integer4, azs azs, boolean boolean6, boolean boolean7) {
		this.e = class3;
		this.f = integer4;
		this.g = azs;
		this.h = boolean6;
		this.i = boolean7;
	}

	public Class<? extends sm> a() {
		return this.e;
	}

	public int b() {
		return this.f;
	}

	public boolean d() {
		return this.h;
	}

	public boolean e() {
		return this.i;
	}
}

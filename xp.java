import javax.annotation.Nullable;

public enum xp {
	NONE(0),
	IRON(5, "iron", "meo"),
	GOLD(7, "gold", "goo"),
	DIAMOND(11, "diamond", "dio");

	private final String e;
	private final String f;
	private final int g;

	private xp(int integer3) {
		this.g = integer3;
		this.e = null;
		this.f = "";
	}

	private xp(int integer3, String string4, String string5) {
		this.g = integer3;
		this.e = "textures/entity/horse/armor/horse_armor_" + string4 + ".png";
		this.f = string5;
	}

	public int a() {
		return this.ordinal();
	}

	public String b() {
		return this.f;
	}

	public int c() {
		return this.g;
	}

	@Nullable
	public String d() {
		return this.e;
	}

	public static xp a(int integer) {
		return values()[integer];
	}

	public static xp a(afj afj) {
		return afj.b() ? NONE : a(afj.c());
	}

	public static xp a(afh afh) {
		if (afh == afl.cv) {
			return IRON;
		} else if (afh == afl.cw) {
			return GOLD;
		} else {
			return afh == afl.cx ? DIAMOND : NONE;
		}
	}

	public static boolean b(afh afh) {
		return a(afh) != NONE;
	}
}

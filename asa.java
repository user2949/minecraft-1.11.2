import javax.annotation.Nullable;

public enum asa {
	BASE("base", "b"),
	SQUARE_BOTTOM_LEFT("square_bottom_left", "bl", "   ", "   ", "#  "),
	SQUARE_BOTTOM_RIGHT("square_bottom_right", "br", "   ", "   ", "  #"),
	SQUARE_TOP_LEFT("square_top_left", "tl", "#  ", "   ", "   "),
	SQUARE_TOP_RIGHT("square_top_right", "tr", "  #", "   ", "   "),
	STRIPE_BOTTOM("stripe_bottom", "bs", "   ", "   ", "###"),
	STRIPE_TOP("stripe_top", "ts", "###", "   ", "   "),
	STRIPE_LEFT("stripe_left", "ls", "#  ", "#  ", "#  "),
	STRIPE_RIGHT("stripe_right", "rs", "  #", "  #", "  #"),
	STRIPE_CENTER("stripe_center", "cs", " # ", " # ", " # "),
	STRIPE_MIDDLE("stripe_middle", "ms", "   ", "###", "   "),
	STRIPE_DOWNRIGHT("stripe_downright", "drs", "#  ", " # ", "  #"),
	STRIPE_DOWNLEFT("stripe_downleft", "dls", "  #", " # ", "#  "),
	STRIPE_SMALL("small_stripes", "ss", "# #", "# #", "   "),
	CROSS("cross", "cr", "# #", " # ", "# #"),
	STRAIGHT_CROSS("straight_cross", "sc", " # ", "###", " # "),
	TRIANGLE_BOTTOM("triangle_bottom", "bt", "   ", " # ", "# #"),
	TRIANGLE_TOP("triangle_top", "tt", "# #", " # ", "   "),
	TRIANGLES_BOTTOM("triangles_bottom", "bts", "   ", "# #", " # "),
	TRIANGLES_TOP("triangles_top", "tts", " # ", "# #", "   "),
	DIAGONAL_LEFT("diagonal_left", "ld", "## ", "#  ", "   "),
	DIAGONAL_RIGHT("diagonal_up_right", "rd", "   ", "  #", " ##"),
	DIAGONAL_LEFT_MIRROR("diagonal_up_left", "lud", "   ", "#  ", "## "),
	DIAGONAL_RIGHT_MIRROR("diagonal_right", "rud", " ##", "  #", "   "),
	CIRCLE_MIDDLE("circle", "mc", "   ", " # ", "   "),
	RHOMBUS_MIDDLE("rhombus", "mr", " # ", "# #", " # "),
	HALF_VERTICAL("half_vertical", "vh", "## ", "## ", "## "),
	HALF_HORIZONTAL("half_horizontal", "hh", "###", "###", "   "),
	HALF_VERTICAL_MIRROR("half_vertical_right", "vhr", " ##", " ##", " ##"),
	HALF_HORIZONTAL_MIRROR("half_horizontal_bottom", "hhb", "   ", "###", "###"),
	BORDER("border", "bo", "###", "# #", "###"),
	CURLY_BORDER("curly_border", "cbo", new afj(alv.bn)),
	CREEPER("creeper", "cre", new afj(afl.ci, 1, 4)),
	GRADIENT("gradient", "gra", "# #", " # ", " # "),
	GRADIENT_UP("gradient_up", "gru", " # ", " # ", "# #"),
	BRICKS("bricks", "bri", new afj(alv.V)),
	SKULL("skull", "sku", new afj(afl.ci, 1, 1)),
	FLOWER("flower", "flo", new afj(alv.O, 1, ano.a.OXEYE_DAISY.b())),
	MOJANG("mojang", "moj", new afj(afl.ar, 1, 1));

	private final String N;
	private final String O;
	private final String[] P = new String[3];
	private afj Q = afj.a;

	private asa(String string3, String string4) {
		this.N = string3;
		this.O = string4;
	}

	private asa(String string3, String string4, afj afj) {
		this(string3, string4);
		this.Q = afj;
	}

	private asa(String string3, String string4, String string5, String string6, String string7) {
		this(string3, string4);
		this.P[0] = string5;
		this.P[1] = string6;
		this.P[2] = string7;
	}

	public String a() {
		return this.N;
	}

	public String b() {
		return this.O;
	}

	public String[] c() {
		return this.P;
	}

	public boolean d() {
		return !this.Q.b() || this.P[0] != null;
	}

	public boolean e() {
		return !this.Q.b();
	}

	public afj f() {
		return this.Q;
	}

	@Nullable
	public static asa a(String string) {
		for (asa asa5 : values()) {
			if (asa5.O.equals(string)) {
				return asa5;
			}
		}

		return null;
	}
}

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public enum a {
	BLACK("BLACK", '0', 0),
	DARK_BLUE("DARK_BLUE", '1', 1),
	DARK_GREEN("DARK_GREEN", '2', 2),
	DARK_AQUA("DARK_AQUA", '3', 3),
	DARK_RED("DARK_RED", '4', 4),
	DARK_PURPLE("DARK_PURPLE", '5', 5),
	GOLD("GOLD", '6', 6),
	GRAY("GRAY", '7', 7),
	DARK_GRAY("DARK_GRAY", '8', 8),
	BLUE("BLUE", '9', 9),
	GREEN("GREEN", 'a', 10),
	AQUA("AQUA", 'b', 11),
	RED("RED", 'c', 12),
	LIGHT_PURPLE("LIGHT_PURPLE", 'd', 13),
	YELLOW("YELLOW", 'e', 14),
	WHITE("WHITE", 'f', 15),
	OBFUSCATED("OBFUSCATED", 'k', true),
	BOLD("BOLD", 'l', true),
	STRIKETHROUGH("STRIKETHROUGH", 'm', true),
	UNDERLINE("UNDERLINE", 'n', true),
	ITALIC("ITALIC", 'o', true),
	RESET("RESET", 'r', -1);

	private static final Map<String, a> w = Maps.newHashMap();
	private static final Pattern x = Pattern.compile("(?i)§[0-9A-FK-OR]");
	private final String y;
	private final char z;
	private final boolean A;
	private final String B;
	private final int C;

	private static String c(String string) {
		return string.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
	}

	private a(String string3, char character, int integer5) {
		this(string3, character, false, integer5);
	}

	private a(String string3, char character, boolean boolean5) {
		this(string3, character, boolean5, -1);
	}

	private a(String string3, char character, boolean boolean5, int integer6) {
		this.y = string3;
		this.z = character;
		this.A = boolean5;
		this.C = integer6;
		this.B = "§" + character;
	}

	public int b() {
		return this.C;
	}

	public boolean c() {
		return this.A;
	}

	public boolean d() {
		return !this.A && this != RESET;
	}

	public String e() {
		return this.name().toLowerCase(Locale.ROOT);
	}

	public String toString() {
		return this.B;
	}

	@Nullable
	public static String a(@Nullable String string) {
		return string == null ? null : x.matcher(string).replaceAll("");
	}

	@Nullable
	public static a b(@Nullable String string) {
		return string == null ? null : (a)w.get(c(string));
	}

	@Nullable
	public static a a(int integer) {
		if (integer < 0) {
			return RESET;
		} else {
			for (a a5 : values()) {
				if (a5.b() == integer) {
					return a5;
				}
			}

			return null;
		}
	}

	public static Collection<String> a(boolean boolean1, boolean boolean2) {
		List<String> list3 = Lists.newArrayList();

		for (a a7 : values()) {
			if ((!a7.d() || boolean1) && (!a7.c() || boolean2)) {
				list3.add(a7.e());
			}
		}

		return list3;
	}

	static {
		for (a a4 : values()) {
			w.put(c(a4.y), a4);
		}
	}
}

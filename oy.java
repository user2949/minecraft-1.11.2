import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class oy {
	private static final Pattern a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");

	public static String a(int integer) {
		int integer2 = integer / 20;
		int integer3 = integer2 / 60;
		integer2 %= 60;
		return integer2 < 10 ? integer3 + ":0" + integer2 : integer3 + ":" + integer2;
	}

	public static String a(String string) {
		return a.matcher(string).replaceAll("");
	}

	public static boolean b(@Nullable String string) {
		return StringUtils.isEmpty(string);
	}
}

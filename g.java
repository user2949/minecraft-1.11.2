import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;

public class g {
	public static final Level a = Level.DISABLED;
	public static final char[] b = new char[]{'.', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"'};
	public static final char[] c = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};

	public static boolean a(char character) {
		return character != 167 && character >= ' ' && character != 127;
	}

	public static String a(String string) {
		StringBuilder stringBuilder2 = new StringBuilder();

		for (char character6 : string.toCharArray()) {
			if (a(character6)) {
				stringBuilder2.append(character6);
			}
		}

		return stringBuilder2.toString();
	}

	static {
		ResourceLeakDetector.setLevel(a);
	}
}

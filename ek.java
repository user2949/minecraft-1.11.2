import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ek {
	private static final Logger a = LogManager.getLogger();
	private static final Pattern b = Pattern.compile("\\[[-+\\d|,\\s]+\\]");

	public static du a(String string) throws ej {
		string = string.trim();
		if (!string.startsWith("{")) {
			throw new ej("Invalid tag encountered, expected '{' as first char.");
		} else if (b(string) != 1) {
			throw new ej("Encountered multiple top tags, only one expected");
		} else {
			return (du)a("tag", string).a();
		}
	}

	static int b(String string) throws ej {
		int integer2 = 0;
		boolean boolean3 = false;
		Stack<Character> stack4 = new Stack();

		for (int integer5 = 0; integer5 < string.length(); integer5++) {
			char character6 = string.charAt(integer5);
			if (character6 == '"') {
				if (b(string, integer5)) {
					if (!boolean3) {
						throw new ej("Illegal use of \\\": " + string);
					}
				} else {
					boolean3 = !boolean3;
				}
			} else if (!boolean3) {
				if (character6 != '{' && character6 != '[') {
					if (character6 == '}' && (stack4.isEmpty() || (Character)stack4.pop() != '{')) {
						throw new ej("Unbalanced curly brackets {}: " + string);
					}

					if (character6 == ']' && (stack4.isEmpty() || (Character)stack4.pop() != '[')) {
						throw new ej("Unbalanced square brackets []: " + string);
					}
				} else {
					if (stack4.isEmpty()) {
						integer2++;
					}

					stack4.push(character6);
				}
			}
		}

		if (boolean3) {
			throw new ej("Unbalanced quotation: " + string);
		} else if (!stack4.isEmpty()) {
			throw new ej("Unbalanced brackets: " + string);
		} else {
			if (integer2 == 0 && !string.isEmpty()) {
				integer2 = 1;
			}

			return integer2;
		}
	}

	static ek.a a(String... arr) throws ej {
		return a(arr[0], arr[1]);
	}

	static ek.a a(String string1, String string2) throws ej {
		string2 = string2.trim();
		if (string2.startsWith("{")) {
			string2 = string2.substring(1, string2.length() - 1);
			ek.b b3 = new ek.b(string1);

			while (string2.length() > 0) {
				String string4 = b(string2, true);
				if (string4.length() > 0) {
					boolean boolean5 = false;
					b3.b.add(a(string4, false));
				}

				if (string2.length() < string4.length() + 1) {
					break;
				}

				char character5 = string2.charAt(string4.length());
				if (character5 != ',' && character5 != '{' && character5 != '}' && character5 != '[' && character5 != ']') {
					throw new ej("Unexpected token '" + character5 + "' at: " + string2.substring(string4.length()));
				}

				string2 = string2.substring(string4.length() + 1);
			}

			return b3;
		} else if (string2.startsWith("[") && !b.matcher(string2).matches()) {
			string2 = string2.substring(1, string2.length() - 1);
			ek.c c3 = new ek.c(string1);

			while (string2.length() > 0) {
				String string4x = b(string2, false);
				if (string4x.length() > 0) {
					boolean boolean5 = true;
					c3.b.add(a(string4x, true));
				}

				if (string2.length() < string4x.length() + 1) {
					break;
				}

				char character5 = string2.charAt(string4x.length());
				if (character5 != ',' && character5 != '{' && character5 != '}' && character5 != '[' && character5 != ']') {
					throw new ej("Unexpected token '" + character5 + "' at: " + string2.substring(string4x.length()));
				}

				string2 = string2.substring(string4x.length() + 1);
			}

			return c3;
		} else {
			return new ek.d(string1, string2);
		}
	}

	private static ek.a a(String string, boolean boolean2) throws ej {
		String string3 = c(string, boolean2);
		String string4 = d(string, boolean2);
		return a(string3, string4);
	}

	private static String b(String string, boolean boolean2) throws ej {
		int integer3 = a(string, ':');
		int integer4 = a(string, ',');
		if (boolean2) {
			if (integer3 == -1) {
				throw new ej("Unable to locate name/value separator for string: " + string);
			}

			if (integer4 != -1 && integer4 < integer3) {
				throw new ej("Name error at: " + string);
			}
		} else if (integer3 == -1 || integer3 > integer4) {
			integer3 = -1;
		}

		return a(string, integer3);
	}

	private static String a(String string, int integer) throws ej {
		Stack<Character> stack3 = new Stack();
		int integer4 = integer + 1;
		boolean boolean5 = false;
		boolean boolean6 = false;
		boolean boolean7 = false;

		for (int integer8 = 0; integer4 < string.length(); integer4++) {
			char character9 = string.charAt(integer4);
			if (character9 == '"') {
				if (b(string, integer4)) {
					if (!boolean5) {
						throw new ej("Illegal use of \\\": " + string);
					}
				} else {
					boolean5 = !boolean5;
					if (boolean5 && !boolean7) {
						boolean6 = true;
					}

					if (!boolean5) {
						integer8 = integer4;
					}
				}
			} else if (!boolean5) {
				if (character9 != '{' && character9 != '[') {
					if (character9 == '}' && (stack3.isEmpty() || (Character)stack3.pop() != '{')) {
						throw new ej("Unbalanced curly brackets {}: " + string);
					}

					if (character9 == ']' && (stack3.isEmpty() || (Character)stack3.pop() != '[')) {
						throw new ej("Unbalanced square brackets []: " + string);
					}

					if (character9 == ',' && stack3.isEmpty()) {
						return string.substring(0, integer4);
					}
				} else {
					stack3.push(character9);
				}
			}

			if (!Character.isWhitespace(character9)) {
				if (!boolean5 && boolean6 && integer8 != integer4) {
					return string.substring(0, integer8 + 1);
				}

				boolean7 = true;
			}
		}

		return string.substring(0, integer4);
	}

	private static String c(String string, boolean boolean2) throws ej {
		if (boolean2) {
			string = string.trim();
			if (string.startsWith("{") || string.startsWith("[")) {
				return "";
			}
		}

		int integer3 = a(string, ':');
		if (integer3 != -1) {
			return string.substring(0, integer3).trim();
		} else if (boolean2) {
			return "";
		} else {
			throw new ej("Unable to locate name/value separator for string: " + string);
		}
	}

	private static String d(String string, boolean boolean2) throws ej {
		if (boolean2) {
			string = string.trim();
			if (string.startsWith("{") || string.startsWith("[")) {
				return string;
			}
		}

		int integer3 = a(string, ':');
		if (integer3 != -1) {
			return string.substring(integer3 + 1).trim();
		} else if (boolean2) {
			return string;
		} else {
			throw new ej("Unable to locate name/value separator for string: " + string);
		}
	}

	private static int a(String string, char character) {
		int integer3 = 0;

		for (boolean boolean4 = true; integer3 < string.length(); integer3++) {
			char character5 = string.charAt(integer3);
			if (character5 == '"') {
				if (!b(string, integer3)) {
					boolean4 = !boolean4;
				}
			} else if (boolean4) {
				if (character5 == character) {
					return integer3;
				}

				if (character5 == '{' || character5 == '[') {
					return -1;
				}
			}
		}

		return -1;
	}

	private static boolean b(String string, int integer) {
		return integer > 0 && string.charAt(integer - 1) == '\\' && !b(string, integer - 1);
	}

	abstract static class a {
		protected String a;

		public abstract ei a() throws ej;
	}

	static class b extends ek.a {
		protected List<ek.a> b = Lists.newArrayList();

		public b(String string) {
			this.a = string;
		}

		@Override
		public ei a() throws ej {
			du du2 = new du();

			for (ek.a a4 : this.b) {
				du2.a(a4.a, a4.a());
			}

			return du2;
		}
	}

	static class c extends ek.a {
		protected List<ek.a> b = Lists.newArrayList();

		public c(String string) {
			this.a = string;
		}

		@Override
		public ei a() throws ej {
			ea ea2 = new ea();

			for (ek.a a4 : this.b) {
				ea2.a(a4.a());
			}

			return ea2;
		}
	}

	static class d extends ek.a {
		private static final Pattern c = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[d|D]");
		private static final Pattern d = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[f|F]");
		private static final Pattern e = Pattern.compile("[-+]?[0-9]+[b|B]");
		private static final Pattern f = Pattern.compile("[-+]?[0-9]+[l|L]");
		private static final Pattern g = Pattern.compile("[-+]?[0-9]+[s|S]");
		private static final Pattern h = Pattern.compile("[-+]?[0-9]+");
		private static final Pattern i = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");
		private static final Splitter j = Splitter.on(',').omitEmptyStrings();
		protected String b;

		public d(String string1, String string2) {
			this.a = string1;
			this.b = string2;
		}

		@Override
		public ei a() throws ej {
			try {
				if (c.matcher(this.b).matches()) {
					return new dv(Double.parseDouble(this.b.substring(0, this.b.length() - 1)));
				}

				if (d.matcher(this.b).matches()) {
					return new dx(Float.parseFloat(this.b.substring(0, this.b.length() - 1)));
				}

				if (e.matcher(this.b).matches()) {
					return new dt(Byte.parseByte(this.b.substring(0, this.b.length() - 1)));
				}

				if (f.matcher(this.b).matches()) {
					return new eb(Long.parseLong(this.b.substring(0, this.b.length() - 1)));
				}

				if (g.matcher(this.b).matches()) {
					return new eg(Short.parseShort(this.b.substring(0, this.b.length() - 1)));
				}

				if (h.matcher(this.b).matches()) {
					return new dz(Integer.parseInt(this.b));
				}

				if (i.matcher(this.b).matches()) {
					return new dv(Double.parseDouble(this.b));
				}

				if ("true".equalsIgnoreCase(this.b) || "false".equalsIgnoreCase(this.b)) {
					return new dt((byte)(Boolean.parseBoolean(this.b) ? 1 : 0));
				}
			} catch (NumberFormatException var6) {
				this.b = this.b.replaceAll("\\\\\"", "\"");
				return new eh(this.b);
			}

			if (this.b.startsWith("[") && this.b.endsWith("]")) {
				String string2 = this.b.substring(1, this.b.length() - 1);
				String[] arr3 = (String[])Iterables.toArray(j.split(string2), String.class);

				try {
					int[] arr4 = new int[arr3.length];

					for (int integer5 = 0; integer5 < arr3.length; integer5++) {
						arr4[integer5] = Integer.parseInt(arr3[integer5].trim());
					}

					return new dy(arr4);
				} catch (NumberFormatException var5) {
					return new eh(this.b);
				}
			} else {
				if (this.b.startsWith("\"") && this.b.endsWith("\"")) {
					this.b = this.b.substring(1, this.b.length() - 1);
				}

				this.b = this.b.replaceAll("\\\\\"", "\"");
				StringBuilder stringBuilder2 = new StringBuilder();

				for (int integer3 = 0; integer3 < this.b.length(); integer3++) {
					if (integer3 < this.b.length() - 1 && this.b.charAt(integer3) == '\\' && this.b.charAt(integer3 + 1) == '\\') {
						stringBuilder2.append('\\');
						integer3++;
					} else {
						stringBuilder2.append(this.b.charAt(integer3));
					}
				}

				return new eh(stringBuilder2.toString());
			}
		}
	}
}

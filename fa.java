import com.google.common.collect.Maps;
import java.util.Map;

public class fa {
	private final fa.a a;
	private final String b;

	public fa(fa.a a, String string) {
		this.a = a;
		this.b = string;
	}

	public fa.a a() {
		return this.a;
	}

	public String b() {
		return this.b;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object != null && this.getClass() == object.getClass()) {
			fa fa3 = (fa)object;
			if (this.a != fa3.a) {
				return false;
			} else {
				return this.b != null ? this.b.equals(fa3.b) : fa3.b == null;
			}
		} else {
			return false;
		}
	}

	public String toString() {
		return "ClickEvent{action=" + this.a + ", value='" + this.b + '\'' + '}';
	}

	public int hashCode() {
		int integer2 = this.a.hashCode();
		return 31 * integer2 + (this.b != null ? this.b.hashCode() : 0);
	}

	public static enum a {
		OPEN_URL("open_url", true),
		OPEN_FILE("open_file", false),
		RUN_COMMAND("run_command", true),
		SUGGEST_COMMAND("suggest_command", true),
		CHANGE_PAGE("change_page", true);

		private static final Map<String, fa.a> f = Maps.newHashMap();
		private final boolean g;
		private final String h;

		private a(String string3, boolean boolean4) {
			this.h = string3;
			this.g = boolean4;
		}

		public boolean a() {
			return this.g;
		}

		public String b() {
			return this.h;
		}

		public static fa.a a(String string) {
			return (fa.a)f.get(string);
		}

		static {
			for (fa.a a4 : values()) {
				f.put(a4.b(), a4);
			}
		}
	}
}

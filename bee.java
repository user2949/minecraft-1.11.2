import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class bee {
	public boolean a(@Nullable bee bee) {
		return bee == null ? false : this == bee;
	}

	public abstract String b();

	public abstract String d(String string);

	public abstract boolean h();

	public abstract boolean g();

	public abstract bee.b i();

	public abstract a m();

	public abstract Collection<String> d();

	public abstract bee.b j();

	public abstract bee.a k();

	public static enum a {
		ALWAYS("always", 0),
		NEVER("never", 1),
		HIDE_FOR_OTHER_TEAMS("pushOtherTeams", 2),
		HIDE_FOR_OWN_TEAM("pushOwnTeam", 3);

		private static final Map<String, bee.a> g = Maps.newHashMap();
		public final String e;
		public final int f;

		public static String[] a() {
			return (String[])g.keySet().toArray(new String[g.size()]);
		}

		@Nullable
		public static bee.a a(String string) {
			return (bee.a)g.get(string);
		}

		private a(String string3, int integer4) {
			this.e = string3;
			this.f = integer4;
		}

		static {
			for (bee.a a4 : values()) {
				g.put(a4.e, a4);
			}
		}
	}

	public static enum b {
		ALWAYS("always", 0),
		NEVER("never", 1),
		HIDE_FOR_OTHER_TEAMS("hideForOtherTeams", 2),
		HIDE_FOR_OWN_TEAM("hideForOwnTeam", 3);

		private static final Map<String, bee.b> g = Maps.newHashMap();
		public final String e;
		public final int f;

		public static String[] a() {
			return (String[])g.keySet().toArray(new String[g.size()]);
		}

		@Nullable
		public static bee.b a(String string) {
			return (bee.b)g.get(string);
		}

		private b(String string3, int integer4) {
			this.e = string3;
			this.f = integer4;
		}

		static {
			for (bee.b b4 : values()) {
				g.put(b4.e, b4);
			}
		}
	}
}

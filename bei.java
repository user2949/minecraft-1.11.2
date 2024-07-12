import com.google.common.collect.Maps;
import java.util.Map;

public interface bei {
	Map<String, bei> a = Maps.newHashMap();
	bei b = new beg("dummy");
	bei c = new beg("trigger");
	bei d = new beg("deathCount");
	bei e = new beg("playerKillCount");
	bei f = new beg("totalKillCount");
	bei g = new beh("health");
	bei h = new bej("food");
	bei i = new bej("air");
	bei j = new bej("armor");
	bei k = new bej("xp");
	bei l = new bej("level");
	bei[] m = new bei[]{
		new bef("teamkill.", a.BLACK),
		new bef("teamkill.", a.DARK_BLUE),
		new bef("teamkill.", a.DARK_GREEN),
		new bef("teamkill.", a.DARK_AQUA),
		new bef("teamkill.", a.DARK_RED),
		new bef("teamkill.", a.DARK_PURPLE),
		new bef("teamkill.", a.GOLD),
		new bef("teamkill.", a.GRAY),
		new bef("teamkill.", a.DARK_GRAY),
		new bef("teamkill.", a.BLUE),
		new bef("teamkill.", a.GREEN),
		new bef("teamkill.", a.AQUA),
		new bef("teamkill.", a.RED),
		new bef("teamkill.", a.LIGHT_PURPLE),
		new bef("teamkill.", a.YELLOW),
		new bef("teamkill.", a.WHITE)
	};
	bei[] n = new bei[]{
		new bef("killedByTeam.", a.BLACK),
		new bef("killedByTeam.", a.DARK_BLUE),
		new bef("killedByTeam.", a.DARK_GREEN),
		new bef("killedByTeam.", a.DARK_AQUA),
		new bef("killedByTeam.", a.DARK_RED),
		new bef("killedByTeam.", a.DARK_PURPLE),
		new bef("killedByTeam.", a.GOLD),
		new bef("killedByTeam.", a.GRAY),
		new bef("killedByTeam.", a.DARK_GRAY),
		new bef("killedByTeam.", a.BLUE),
		new bef("killedByTeam.", a.GREEN),
		new bef("killedByTeam.", a.AQUA),
		new bef("killedByTeam.", a.RED),
		new bef("killedByTeam.", a.LIGHT_PURPLE),
		new bef("killedByTeam.", a.YELLOW),
		new bef("killedByTeam.", a.WHITE)
	};

	String a();

	boolean b();

	bei.a c();

	public static enum a {
		INTEGER("integer"),
		HEARTS("hearts");

		private static final Map<String, bei.a> c = Maps.newHashMap();
		private final String d;

		private a(String string3) {
			this.d = string3;
		}

		public String a() {
			return this.d;
		}

		public static bei.a a(String string) {
			bei.a a2 = (bei.a)c.get(string);
			return a2 == null ? INTEGER : a2;
		}

		static {
			for (bei.a a4 : values()) {
				c.put(a4.a(), a4);
			}
		}
	}
}
